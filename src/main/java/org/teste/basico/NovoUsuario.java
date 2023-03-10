package org.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario1 = new Usuario("Marcelo", "marcelo@lanche.com.br");

        em.getTransaction().begin();
        em.persist(novoUsuario1);
        em.getTransaction().commit();

        System.out.println("Id do novo usuário: " + novoUsuario1.getId());

        em.close();
        emf.close();
    }

}
