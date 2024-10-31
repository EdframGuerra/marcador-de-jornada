package com.diprog.solutions.marcador.jornada.eletronico.repository;

import com.diprog.solutions.marcador.jornada.eletronico.models.RegistroDePonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroDePontoRepository extends JpaRepository<RegistroDePonto, Long> {
}
