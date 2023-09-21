package com.br.fiap.rickymorty.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

public class ListaPersonagens {

    private List<Personagem> results = new ArrayList<>();

    
    public List<Personagem> getResults() {
        return results;
    }

    // Método para atualizar a lista de personagens
    public void atualizarLista(List<Personagem> novaLista) {
        results = novaLista;
    }
}
