package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario1 = new Usuario("Oi1", "oi1@lanche.com.br");


        em.persist(novoUsuario1);
        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
