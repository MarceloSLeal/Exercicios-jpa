package org.teste.basico;

import org.infra.ProdutoDAO;
import org.modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos(5, 0);

        for(Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + " , Nome: "
            + produto.getNome() + " preço: " + produto.getPreco());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();

        System.out.println("Preço total: " + precoTotal);

        dao.fechar();
    }

}
