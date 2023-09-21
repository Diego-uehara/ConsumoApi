package com.br.fiap.rickymorty.model;

public class Personagem {

	private Long id;
	
	private String name;
	
	private String species;
	
	private String image;
	
	public Personagem(Long id, String name, String species, String image) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
		this.image = image;
	}

	public Personagem() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}


