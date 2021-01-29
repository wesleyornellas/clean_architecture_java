package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoEmailJavaMail implements br.com.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        // logica de envio de email com a lib Java Mail
    }
}
