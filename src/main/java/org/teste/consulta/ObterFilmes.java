package org.teste.consulta;

import org.infra.DAO;
import org.modelo.muitospramuitos.Ator;
import org.modelo.muitospramuitos.Filme;

import java.io.File;
import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

        for(Filme filme: filmes) {
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for(Ator ator: filme.getAtores()) {
                System.out.println(ator.getNome());
            }
        }

    }

}
