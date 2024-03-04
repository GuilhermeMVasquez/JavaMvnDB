package com.example;

public class Aluno
{
    private String nome;
    private String cpf;
    private String email;
    private int matricula;

    public Aluno(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }
}