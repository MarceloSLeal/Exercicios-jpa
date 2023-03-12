package org.teste.umpraum;

import org.infra.DAO;
import org.modelo.umpraum.Assento;
import org.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);

    }

}
