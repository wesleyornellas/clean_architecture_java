package br.com.alura.escola.dominio.aluno;

//CLASSE VALUE OBJECT
public class Email {
    private String endereco;

    public  Email(String endereco){
        if(endereco == null || !endereco.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")){
            throw  new IllegalArgumentException("E-mail invalido!");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
