/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.repository;
import br.unesp.projeto.model.Funcionario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  FuncionarioRepository extends JpaRepository< Funcionario, Long> {

     Funcionario findById (long Id);
  
}
