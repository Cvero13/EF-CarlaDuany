package com.idat.CarlaDuanyLavadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.CarlaDuanyLavadora.modelo.Lavadora;

@Repository
public interface LavadoraRepository extends JpaRepository<Lavadora, Integer>{

}
