package com.app.form.controller.models.domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import org.springframework.format.annotation.DateTimeFormat;



public class Usuario {
	
	
	private String identificador;
	
	@NotEmpty(message = "${message.validation.nombre}")
	private String nombre;
	
	@NotEmpty
	private String apellido;
	
	@NotEmpty
	@Size(min=3, max=8)
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty(message = "${message.validation.email}")
	@Email
	private String email;
	
	
	@NotNull()
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date fechaNacimiento;
	
	@Valid
	private Pais pais;
	
	
	
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
