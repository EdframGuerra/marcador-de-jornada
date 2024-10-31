package com.diprog.solutions.marcador.jornada.eletronico.dtos;

import com.diprog.solutions.marcador.jornada.eletronico.models.Funcionario;
import com.diprog.solutions.marcador.jornada.eletronico.models.TipoPonto;

import java.time.LocalDateTime;

public class RegistroDePontoDtos {

    private Funcionario funcionario;
    private LocalDateTime dataHora;
    private TipoPonto tipoPonto;

    public RegistroDePontoDtos() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public TipoPonto getTipoPonto() {
        return tipoPonto;
    }

    public void setTipoPonto(TipoPonto tipoPonto) {
        this.tipoPonto = tipoPonto;
    }

}
