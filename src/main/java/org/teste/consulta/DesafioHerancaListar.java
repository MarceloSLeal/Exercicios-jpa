package org.teste.consulta;

import org.infra.DAO;
import org.modelo.desafioHeranca.Animal;

import java.util.List;

public class DesafioHerancaListar {

    public static void main(String[] args) {

        DAO<Animal> dao = new DAO<>(Animal.class);

        List<Animal> animais = dao.obterTodos(2, 0);

        for (Animal animal : animais) {
            System.out.println("Nome " + animal.getName() + " Dono " + animal.toString());
        }

    }

}
