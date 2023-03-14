package org.teste.umpramuitos;

import org.infra.DAO;
import org.modelo.umpramuitos.ItemPedido;
import org.modelo.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for (ItemPedido item: pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fechar();
    }

}
