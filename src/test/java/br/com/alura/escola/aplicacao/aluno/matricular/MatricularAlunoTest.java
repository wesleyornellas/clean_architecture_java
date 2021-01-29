package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito
        RepositorioDeAlunosMemoria repositorio = new RepositorioDeAlunosMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dados = new MatricularAlunoDto("Wesley", "123.456.789-00", "wesley@mail.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));

        assertEquals("Wesley", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("wesley@mail.com", encontrado.getEmail());
    }
}
