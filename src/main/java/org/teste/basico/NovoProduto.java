package org.teste.basico;

import org.infra.DAO;
import org.modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 789.98);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("Id do produto: " + produto.getId());
    }

}
