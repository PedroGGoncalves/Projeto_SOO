/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Aquario;
import java.util.List;


public interface AquarioService {

    List<Aquario> findAll();

    Aquario findById(long id);

    Aquario save(Aquario entity);

    public void delete(Aquario aquarioDelete);

    public Aquario update(Aquario aquarioUpdate);
    
}
