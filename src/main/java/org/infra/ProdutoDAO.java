package org.infra;

import org.infra.DAO;
import org.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

}
