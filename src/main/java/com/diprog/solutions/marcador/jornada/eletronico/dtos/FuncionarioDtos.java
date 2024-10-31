package com.diprog.solutions.marcador.jornada.eletronico.dtos;

public class FuncionarioDtos {

    private String name;
    private String position;
    private String department;
    private Integer cpf;
    private String senha;

    public FuncionarioDtos() {
    }

    public FuncionarioDtos(String name, String position, String department, Integer cpf, String senha) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
