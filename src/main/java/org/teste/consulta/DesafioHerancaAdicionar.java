package org.teste.consulta;

import org.infra.DAO;
import org.modelo.desafioHeranca.Animal;
import org.modelo.desafioHeranca.Cachorro;
import org.modelo.desafioHeranca.Gato;

public class DesafioHerancaAdicionar {

    public static void main(String[] args) {

        DAO<Animal> dao = new DAO<>(Animal.class);

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        gato.setName("Léo o gato");
        gato.setDono("Marcelo");

        cachorro.setName("Suzi a cachorra");
        cachorro.setDono("Marilda");

        dao.abrirTransacao()
                .incluir(gato)
                .incluir(cachorro)
                .fecharTransacao()
                .fechar();


    }

}
