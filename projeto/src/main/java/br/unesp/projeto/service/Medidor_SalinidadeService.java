/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_salinidade;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Medidor_SalinidadeService {

   List<Medidor_salinidade> findAll();
   Medidor_salinidade findById(long id);
   Medidor_salinidade save(Medidor_salinidade entity);

    public void delete(Medidor_salinidade medidor_salinidadeDelete);

    public Medidor_salinidade update(Medidor_salinidade medidor_salinidadeUpdate);
}
