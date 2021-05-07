package com.alberto.openshift.model;

import java.io.Serializable;

public class Contatto implements Serializable{

	private static final long serialVersionUID = 2237061841065049245L;
	
	private String nome;
	private String cognome;
	private String username;
	
	public Contatto(String nome, String cognome, String username) {
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
	}

	public Contatto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
