package com.example;

public class App 
{
    private static ConnectDB db = new ConnectDB("localhost:3306/desafio", "root", "g1v9");
    private static DBQuery Query = new DBQuery(db.getConnection());

    public static void main(String[] args){
        GUI.loadHome();
    }

    public static void addAluno(String name, String cpf, String email){
        if(!Query.insertAluno(new Aluno(name, cpf, email))){
            GUI.loadAddAlunoError();
        }
    }

    public static void removeAluno(String cpf){
        if(!Query.removeAluno(cpf)){
            GUI.loadRemoveAlunoError();
        }
    }

    public static void addedAluno(){

    }

    public static void editAluno(String cpf, String name, String email){
        if(!Query.editAluno(cpf, name, email)){
            GUI.loadEditAlunoError();
        }
    }

    public static void seeCursos(){
    
    }

    public static void setStudy(){

    }

    public static void seeStudy(){

    }

    public static void customQuery(String query){

    }
}