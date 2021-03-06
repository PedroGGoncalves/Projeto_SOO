/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Login;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import br.unesp.projeto.repository.LoginRepository;


public class LoginServiceImpl implements LoginService {

   
    private LoginRepository repository;

    
    
    @Override
    public Login save(Login entity) {
        Login persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public Login findByID(String ID) {
        Login insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByID(ID);
        }

        return insertedEntity;
    }

    @Override
    public void delete(Login entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    @Override
    public Login update(Login entity) {

        Login persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    
    @Override
    public List<Login> findAll() {
        List<Login> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
