package com.example;
import java.sql.*;
import java.util.ArrayList;

public class DBQuery
{
    private Connection connection;

    public DBQuery(Connection connection){
        this.connection = connection;
    }

    public boolean insertAluno(Aluno aluno){
        try {
            String data = aluno.getNome().toLowerCase() + "','" + aluno.getCpf() + "','" + aluno.getEmail().toLowerCase();
            connection.createStatement().executeUpdate("INSERT INTO aluno (name, cpf, email) VALUES ('" + data + "')");
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM aluno WHERE cpf = '" + aluno.getCpf() +"'");
            while(rs.next()){
                aluno.setMatricula(Integer.parseInt(rs.getString("matricula")));
            }
            return true;
        } catch (SQLException e){
            System.out.println("Error Query insertAluno: " + e.getMessage());
            return false;
        }
    }

    public boolean removeAluno(String cpf){
        try {
            connection.createStatement().executeUpdate("DELETE FROM aluno WHERE cpf = '" + cpf + "'");
            return true;
        } catch (SQLException e){
            System.out.println("Error Query removeAluno: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<String> getAlunos(){
        try {
            ResultSet rsAluno = connection.createStatement().executeQuery("SELECT * FROM aluno");
            ArrayList<String> output = new ArrayList<>();
            while(rsAluno.next()){
                output.add(rsAluno.getString("name"));
            }
            return output;
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean editAluno(String cpf, String name, String email){
        try {
            if(!name.equals("")){
                if(!email.equals("")){
                    connection.createStatement().executeUpdate("UPDATE aluno SET name = '" + name + "', email = '" + email + "' WHERE cpf = '" + cpf + "'");
                }
                else{
                    connection.createStatement().executeUpdate("UPDATE aluno SET name = '" + name + "' WHERE cpf = '" + cpf + "'");
                }
            }
            else{
                if(!email.equals("")){
                    connection.createStatement().executeUpdate("UPDATE aluno SET email = '" + email + "' WHERE cpf = '" + cpf + "'");
                }
            }
            return true;
        } catch (SQLException e){
            System.out.println("Error Query editAluno: " + e.getMessage());
            return false;
        }
    }

    public ResultSet customQuery(String query){
        try {
            return connection.createStatement().executeQuery(query);
        } catch (SQLException e){
            System.out.println("Error Query customQuery: " + e.getMessage());
            return null;
        }
    }
}