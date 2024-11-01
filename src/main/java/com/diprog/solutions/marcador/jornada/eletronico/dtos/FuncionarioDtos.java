package com.diprog.solutions.marcador.jornada.eletronico.dtos;

import com.diprog.solutions.marcador.jornada.eletronico.models.Department;
import com.diprog.solutions.marcador.jornada.eletronico.models.Position;

public class FuncionarioDtos {

    private String name;
    private Position position;
    private Department department;
    private String cpf; // Alterado para String
    private String senha;

    public FuncionarioDtos() {
    }

    public FuncionarioDtos(String name, Position position, Department department, String cpf, String senha) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.cpf = cpf;
        this.senha = senha;
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
