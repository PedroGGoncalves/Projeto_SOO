/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Tanque;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import br.unesp.projeto.repository.TanqueRepository;


public class TanqueServiceImpl implements TanqueService{

    
    private TanqueRepository repository;

   
    @Override
    public Tanque save(Tanque entity) {
        Tanque persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public Tanque findById(long Id) {
        Tanque insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    @Override
    public void delete(Tanque entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    @Override
    public Tanque update(Tanque entity) {

        Tanque persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public List<Tanque> findAll() {
        List<Tanque> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
