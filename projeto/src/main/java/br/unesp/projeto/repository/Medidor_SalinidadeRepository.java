/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;

import br.unesp.projeto.model.Medidor_salinidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Medidor_SalinidadeRepository extends JpaRepository<Medidor_salinidade, Long> {

   Medidor_salinidade findById(long Id);
}
