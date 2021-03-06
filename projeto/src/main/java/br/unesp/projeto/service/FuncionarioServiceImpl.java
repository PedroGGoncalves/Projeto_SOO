/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import br.unesp.projeto.repository.FuncionarioRepository;


public class FuncionarioServiceImpl implements FuncionarioService {

  
    private FuncionarioRepository repository;

  
    @Override
    public Funcionario save(Funcionario entity) {
        Funcionario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public Funcionario findById(long Id) {
        Funcionario insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    @Override
    public void delete(Funcionario entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    @Override
    public Funcionario update(Funcionario entity) {

        Funcionario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public List<Funcionario> findAll() {
        List<Funcionario> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
  
  
