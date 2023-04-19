package org.teste.consulta;

import org.infra.DAO;
import org.modelo.consulta.NotaFilme;

public class ObterMediaFilmes {

    public static void main(String[] args) {


        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);

        System.out.println("oi");

        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }

}
