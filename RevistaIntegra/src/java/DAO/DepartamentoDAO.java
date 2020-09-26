/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class DepartamentoDAO {

  

    public ArrayList<Departamento> listarDepartamentos() {
        try {
            ArrayList<Departamento> dados = new ArrayList();
            PreparedStatement stmt = Conexao.abrir().prepareStatement("SELECT * FROM departamento");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
              
                
                dados.add(
                        new Departamento(Integer.parseInt(res.getString("id")), res.getString("nome"))
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
