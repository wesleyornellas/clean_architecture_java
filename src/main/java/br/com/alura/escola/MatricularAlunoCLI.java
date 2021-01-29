package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class MatricularAlunoCLI {
    public static void main(String[] args) {
        String nome = "Wesley Ornellas";
        String cpf = "123.456.789-00";
        String email = "wesleyornellas@gmail.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosMemoria());
        matricular.executa(new MatricularAlunoDto(nome,cpf,email));
    }
}
