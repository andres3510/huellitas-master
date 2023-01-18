package com.huellitas.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.huellitas.backend.entities.Cita;

@EnableJpaRepositories("com.acme.repositories")
public interface CitaRepository extends JpaRepository<Cita, Integer> {

}
