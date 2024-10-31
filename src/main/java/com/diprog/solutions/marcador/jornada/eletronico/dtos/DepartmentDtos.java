package com.diprog.solutions.marcador.jornada.eletronico.dtos;


public class DepartmentDtos {

    private String name;
    private String descircao;

    public DepartmentDtos() {
    }

    public DepartmentDtos(String name, String descircao) {
        this.name = name;
        this.descircao = descircao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }
}
