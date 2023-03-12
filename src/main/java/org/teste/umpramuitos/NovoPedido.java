package org.teste.umpramuitos;

import org.infra.DAO;
import org.modelo.basico.Produto;
import org.modelo.umpramuitos.ItemPedido;
import org.modelo.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirTransacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTransacao()
                .fechar();

    }

}
