/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cha.revistaintegra;

import DAO.DepartamentoDAO;
import MODEL.Departamento;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crist
 */
@WebService(serviceName = "RevistaIntegra")
public class RevistaIntegra {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "pesquisarDepartamento")
    public ArrayList<Departamento> pesquisarDepartamento() {
        DepartamentoDAO depDAO = new DepartamentoDAO();
        ArrayList<Departamento> dados = new ArrayList();

        try {
            dados = depDAO.listarDepartamentos();
            return dados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
