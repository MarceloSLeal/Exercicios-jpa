package org.modelo.desafioHeranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CACHORRO")
public class Cachorro extends Animal{

    private String dono;

    public Cachorro() {
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String toString() {
        return this.dono;
    }

}
