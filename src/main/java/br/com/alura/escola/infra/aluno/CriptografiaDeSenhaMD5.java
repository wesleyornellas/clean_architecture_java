package br.com.alura.escola.infra.aluno;

public class CriptografiaDeSenhaMD5 implements br.com.alura.escola.dominio.aluno.CriptografiaDeSenha {
    @Override
    public String criptografarSenha(String senha) {
        return null;
    }

    @Override
    public boolean validarSenhaCriptografada(String senhaCriptografada, String senha) {
        return false;
    }
}
