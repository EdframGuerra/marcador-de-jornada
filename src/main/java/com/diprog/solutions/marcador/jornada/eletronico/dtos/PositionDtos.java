package com.diprog.solutions.marcador.jornada.eletronico.dtos;

public class PositionDtos {
    private String name;


    public PositionDtos() {
    }

    public PositionDtos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}