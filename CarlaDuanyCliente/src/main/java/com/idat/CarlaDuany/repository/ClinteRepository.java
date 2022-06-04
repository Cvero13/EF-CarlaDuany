package com.idat.CarlaDuany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.CarlaDuany.modelo.Cliente;

@Repository
public interface ClinteRepository extends JpaRepository<Cliente, Integer>{

}
