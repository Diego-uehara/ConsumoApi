package com.br.fiap.rickymorty.view;

import java.util.List;

import com.br.fiap.rickymorty.model.Personagem;

public class PersonagemView {
	

	    public void mostrarListaDePersonagens(List<Personagem> listaDePersonagens) {
	        System.out.println("Lista de Personagens:");

	        for (Personagem personagem : listaDePersonagens) {
	            System.out.println("Nome: " + personagem.getName());
	            System.out.println("Espécie: " + personagem.getSpecies());
	            System.out.println("Imagem: " + personagem.getImage());
	            // Adicione outros campos que você deseja exibir
	            System.out.println();
	        }
	    }
}
