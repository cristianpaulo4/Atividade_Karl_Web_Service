/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Departamento;
import MODEL.PublicacaoArea;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class PublicacaoAreaDao {

    public ArrayList<PublicacaoArea> listarPublicacaoArea() {
        try {
            ArrayList<PublicacaoArea> dados = new ArrayList();
            PreparedStatement stmt = Conexao.abrir().prepareStatement("select publicacao.codigo_publicacao as 'Código', publicacao.titulo as 'Titulo da Publicação', area_topico.titulo  as 'Área da pesquisa', publicacao_area_topico.data as 'Data'\n"
                    + "from publicacao\n"
                    + "inner join publicacao_area_topico\n"
                    + "on publicacao.codigo_publicacao = publicacao_area_topico.codigo_publicacao\n"
                    + "inner join area_topico\n"
                    + "on publicacao_area_topico.codigo_topico = area_topico.codigo_topico");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                System.out.println(res.getString("Código"));
                System.out.println(res.getString("Titulo da Publicação"));
                System.out.println(res.getString("Área da pesquisa"));
                System.out.println(res.getString("Data"));

                dados.add(
                        new PublicacaoArea(
                                Integer.parseInt(res.getString("Código")),
                                res.getString("Titulo da Publicação"),
                                res.getString("Área da pesquisa"),
                                res.getString("Data")
                        )
                );
            }
            res.close();
            stmt.close();
            Conexao.abrir().close();
            return dados;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;

        }

    }

}
