package com.idat.CarlaDuanyRopa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.CarlaDuanyRopa.modelo.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{
}
