package com.diprog.solutions.marcador.jornada.eletronico.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    private String cpf;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String name, Position position, Department department, String cpf, String senha) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.cpf = cpf;
        this.senha = senha;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
