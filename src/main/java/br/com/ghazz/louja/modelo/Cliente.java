package br.com.ghazz.louja.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "cpf")
	private String cpf;

	public Cliente(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}

	public Cliente() {
		super();
	}
	
	
	
}
