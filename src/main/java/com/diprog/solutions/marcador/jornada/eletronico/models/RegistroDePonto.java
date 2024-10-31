package com.diprog.solutions.marcador.jornada.eletronico.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro_de_ponto")
public class RegistroDePonto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    private LocalDateTime dataHora;

    @Enumerated(EnumType.STRING)
    private TipoPonto tipoPonto;

    public RegistroDePonto() {
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


    public static double calcularHorasTrabalhadas(RegistroDePonto entrada, RegistroDePonto saida) {
        double jornada = 8.0;
        LocalDateTime horaEntrada = entrada.getDataHora();
        LocalDateTime horaSaida = saida.getDataHora();

        double horasTrabalhadas = Duration.between(horaEntrada, horaSaida).toHours();

        if (horasTrabalhadas < jornada) {
            double horasPendentes = jornada - horasTrabalhadas;
            System.out.println("Faltam " + horasPendentes + " horas para completar a jornada de trabalho do dia.");
        }

        return horasTrabalhadas;
    }

    public static double calcularHorasExtras(RegistroDePonto entrada, RegistroDePonto saida) {
        double jornada = 8.0;
        double horasTrabalhadas = calcularHorasTrabalhadas(entrada, saida);
        double horasExtras = horasTrabalhadas - jornada;

        if (horasExtras > 0) {
            return horasExtras;
        } else {
            return 0.0;
        }
    }

}

