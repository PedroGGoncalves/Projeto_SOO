/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.repository.ArmazemRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;


public class ArmazemServiceImpl implements ArmazemService {

    
    private ArmazemRepository repository;

    
    @Override
    public Armazem save(Armazem entity) {
        Armazem persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    
    @Override
    public Armazem findById(long Id) {
        Armazem insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    @Override
    public void delete(Armazem entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    @Override
    public Armazem update(Armazem entity) {

        Armazem persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public List<Armazem> findAll() {
        List<Armazem> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
