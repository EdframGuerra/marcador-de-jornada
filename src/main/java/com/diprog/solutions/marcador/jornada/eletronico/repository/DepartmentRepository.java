package com.diprog.solutions.marcador.jornada.eletronico.repository;

import com.diprog.solutions.marcador.jornada.eletronico.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
