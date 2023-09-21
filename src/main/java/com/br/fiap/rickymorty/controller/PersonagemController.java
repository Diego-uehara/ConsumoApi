package com.br.fiap.rickymorty.controller;
import com.br.fiap.rickymorty.model.ListaPersonagens;
import com.br.fiap.rickymorty.model.Personagem;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class PersonagemController{
	
	   	private final ListaPersonagens listaPersonagens;
	    private final OkHttpClient httpClient = new OkHttpClient();
	    private final Gson gson = new Gson();
	    
	    
	    public PersonagemController(ListaPersonagens listaPersonagens) {
	        this.listaPersonagens = listaPersonagens;
		}

    public void obterPersonagensAPI() {
        try {
  
            String urlDaAPI = "https://rickandmortyapi.com/api/character";
 
            Request request = new Request.Builder()
                    .url(urlDaAPI)
                    .get()
                    .build();

            try (Response response = httpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Erro na requisição: " + response);
                }

                String responseBody = response.body().string();
                JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
                JsonArray jsonArray = jsonObject.getAsJsonArray("results");

                List<Personagem> personagens = new ArrayList<>();

                for (JsonElement jsonElement : jsonArray) {
                    Personagem personagem = gson.fromJson(jsonElement, Personagem.class);
                    personagens.add(personagem);
                }

                listaPersonagens.atualizarLista(personagens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

