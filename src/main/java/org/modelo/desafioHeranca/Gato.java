package org.modelo.desafioHeranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GATO")
public class Gato extends Animal{

    private String dono;

    public Gato() {
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
