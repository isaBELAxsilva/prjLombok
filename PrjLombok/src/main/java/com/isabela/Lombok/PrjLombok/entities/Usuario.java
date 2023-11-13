package com.isabela.Lombok.PrjLombok.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	@Email(message = "digite o email corretamente")
	private String email;
	
	
	
	public Long getId() {

		return id;
	}

	
	public void setId(Long Id) {

		this.id = Id;
	}

	
	public String getNome() {

		return nome;
	}

	
	public void setNome(String Nome) {

		this.nome = Nome;
	}

	
	public  String getEmail() {

		return email;
	}

	
	public void setEmail(String email) {

		this.email = email; 
	}
	

}

