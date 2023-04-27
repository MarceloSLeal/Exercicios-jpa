package org.modelo.desafioHeranca;

import jakarta.persistence.*;

@Entity
@Table(name = "animais")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal", discriminatorType = DiscriminatorType.STRING)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Animal() {
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String toString() {
        return this.toString();
    }

}
