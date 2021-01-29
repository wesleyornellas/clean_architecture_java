package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));

//        assertThrows(IllegalArgumentException.class,
//                () -> new CPF("451.517.758-39"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }

}
