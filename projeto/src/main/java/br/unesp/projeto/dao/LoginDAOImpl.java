/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;

import br.unesp.projeto.model.Login;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LoginDAOImpl implements LoginDAO {
    public  LoginDAOImpl() {
          }
    @Override
    public boolean save(Login login) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_LOGIN);
                pstm.setString(1, login.getID());
                pstm.setString(2, login.getSenha());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
     
     
    @Override
    public List<Login> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Login> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Login login = new Login();
                    login.setID(res.getString(1));
                    login.setSenha(res.getString(2));
                
                    
                    lista.add(login);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    } 
     
     
     
     
}
