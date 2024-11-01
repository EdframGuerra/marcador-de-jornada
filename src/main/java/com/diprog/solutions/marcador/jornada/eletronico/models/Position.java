package com.diprog.solutions.marcador.jornada.eletronico.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="position")
public class Position implements Serializable {

    private static final Long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public Position() {
    }

    public Position(String name) {
        this.name = name;
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
}
