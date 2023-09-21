package com.br.fiap.rickymorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.fiap.rickymorty.controller.PersonagemController;
import com.br.fiap.rickymorty.model.ListaPersonagens;
import com.br.fiap.rickymorty.view.PersonagemView;

@SpringBootApplication
public class RickyMortyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RickyMortyApplication.class, args);
		
		        ListaPersonagens listaPersonagens = new ListaPersonagens();
		        PersonagemController controller = new PersonagemController(listaPersonagens);

		        // Fazer a chamada à API e atualizar a lista de personagens
		        controller.obterPersonagensAPI();

		        // Criar a view e mostrar a lista de personagens
		        PersonagemView view = new PersonagemView();
		        view.mostrarListaDePersonagens(listaPersonagens.getResults());
		    }
}


