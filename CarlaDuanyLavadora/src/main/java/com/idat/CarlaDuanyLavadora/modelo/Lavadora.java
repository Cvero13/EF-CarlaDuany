package com.idat.CarlaDuanyLavadora.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Lavadora")
@Entity
public class Lavadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLavadora;
	private String descripcion;
	private String marca;
	private String voltaje;	
	

}
