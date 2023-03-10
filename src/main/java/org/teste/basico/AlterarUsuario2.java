package org.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.modelo.basico.Usuario;

public class AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("MarceloLeal");
        usuario.setEmail("marceloleal@email.com");

//        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
