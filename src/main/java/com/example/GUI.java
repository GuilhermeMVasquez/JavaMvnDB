package com.example;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI
{
    public static void loadHome(){
        //Frame
        final JFrame home = new JFrame("Cadastro Alunos");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(500, 500);
    
        //Top Panel
        JPanel top = new JPanel();
        JLabel head = new JLabel("Home");
        top.add(head);
    
        //Bottom Panel
        JPanel bottom = new JPanel();
        JLabel bottom_label = new JLabel();
        bottom.add(bottom_label);

        //Center Panel
        JPanel middle = new JPanel();
        middle.setLayout(null);
        //Add Aluno        
        JButton addAluno = new JButton("Add Aluno");
        addAluno.setBounds(150, 10, 200, 25);
        addAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadAddAluno();
            }
        });
        middle.add(addAluno);
        //Remove Aluno
        JButton remAluno = new JButton("Remove Aluno");
        remAluno.setBounds(150, 45, 200, 25);
        remAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadRemoveAluno();
            }
        });
        middle.add(remAluno);
        //Added Alunos
        JButton cadAluno = new JButton("Alunos Added");
        cadAluno.setBounds(150, 80, 200, 25);
        cadAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadAddedAluno();
            }
        });
        middle.add(cadAluno);
        //Editar Aluno
        JButton edit_aluno = new JButton("Edit Aluno");
        edit_aluno.setBounds(150, 115, 200, 25);
        edit_aluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadEditAluno();
            }
        });
        middle.add(edit_aluno);
        //Consultar Cursos
        JButton cons_curso = new JButton("Consultar Cursos");
        cons_curso.setBounds(150, 150, 200, 25);
        cons_curso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadSeeCursos();
            }
        });
        middle.add(cons_curso);
        //Cadastrar Aluno em Curso
        JButton aluno_curso = new JButton("Aluno Set Curso");
        aluno_curso.setBounds(150, 185, 200, 25);
        aluno_curso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadStudy();
            }
        });
        middle.add(aluno_curso);
        //Consultar Alunos em Curso
        JButton see_aluno_curso = new JButton("Consultar Alunos em Curso");
        see_aluno_curso.setBounds(150, 220, 200, 25);
        see_aluno_curso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadSeeAlunoCurso();
            }
        });
        middle.add(see_aluno_curso);
        //Custom Consulta
        JButton custom_query = new JButton("Consulta Custom");
        custom_query.setBounds(150, 255, 200, 25);
        custom_query.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                home.setVisible(false);
                loadCustomQuery();
            }
        });
        middle.add(custom_query);

        //Add to Frame
        home.getContentPane().add(BorderLayout.SOUTH, bottom);
        home.getContentPane().add(BorderLayout.NORTH, top);
        home.getContentPane().add(middle);
        home.setVisible(true);
    }
    
    public static void loadAddAluno(){
        //Frame
        final JFrame add_aluno = new JFrame("Cadastro Alunos");
        add_aluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add_aluno.setSize(500, 500);
        
        //Top Panel
        JPanel top = new JPanel();
        JLabel head = new JLabel("Add Aluno");
        top.add(head);
    
        //Bottom Panel
        JPanel bottom = new JPanel();
        JButton back = new JButton("Return");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                add_aluno.setVisible(false);
                loadHome();
            }
        });
        bottom.add(back);

        //Center Panel
        JPanel middle = new JPanel();  
        middle.setLayout(null); 
        //Name
        JLabel name = new JLabel("Nome:");
        name.setBounds(140, 25, 70, 25);
        final JTextField name_insert = new JTextField(10);
        name_insert.setBounds(200, 25, 200, 25);
        middle.add(name);
        middle.add(name_insert);
        //Cpf
        JLabel cpf = new JLabel("CPF:");
        cpf.setBounds(140, 60, 70, 25);
        final JTextField cpf_insert = new JTextField(10);
        cpf_insert.setBounds(200, 60, 200, 25);
        middle.add(cpf);
        middle.add(cpf_insert);
        //Email
        JLabel email = new JLabel("Email:");
        email.setBounds(140, 95, 70, 25);
        final JTextField email_insert = new JTextField(10);
        email_insert.setBounds(200, 95, 200, 25);
        middle.add(email);
        middle.add(email_insert);

        //Add button
        JButton add = new JButton("Add");
        add.setBounds(210, 175, 80, 25);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                App.addAluno(name_insert.getText(),
                             cpf_insert.getText(),
                             email_insert.getText());
            }
        });
        middle.add(add);

        //Add to Frame
        add_aluno.getContentPane().add(BorderLayout.PAGE_END, bottom);
        add_aluno.getContentPane().add(BorderLayout.PAGE_START, top);
        add_aluno.getContentPane().add(middle);
        add_aluno.setVisible(true);
    }
    
    public static void loadRemoveAluno(){
        
    }
    
    public static void loadAddedAluno(){
    
    }

    public static void loadEditAluno(){

    }

    public static void loadSeeCursos(){

    }

    public static void loadStudy(){

    }

    public static void loadSeeAlunoCurso(){

    }

    public static void loadCustomQuery(){

    }

    public static void loadAddAlunoError(){

    }

    public static void loadRemoveAlunoError(){

    }

    public static void loadAddedAlunoError(){

    }

    public static void loadEditAlunoError(){

    }
}