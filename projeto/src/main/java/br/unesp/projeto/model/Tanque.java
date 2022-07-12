/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;


@Entity(name = "Tanque")

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Tanque implements Serializable {
    
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // private List<Comida> alimento;
    // private List<Especies> especie;
    private long idTanque;
    private int individuos;
    private float ph;
    private float salinidade;
    private float oxigenacao;
    private String horario_alimento;
    private boolean filtro;
    private String QR_CODE;
    /*temperatura termostato seria a msm do tanque?*/
    
    
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name="FUNCIONARIO_TANQUE",
             joinColumns={@JoinColumn(name="FUNCIONARIO_ID")},
             inverseJoinColumns={@JoinColumn(name="TANQUE_ID")})
  private List<Funcionario> funcionarios;
    
    
   @OneToOne(cascade=CascadeType.ALL)
   private Termostato termostato;
    
   @OneToOne(cascade=CascadeType.ALL)
   private Medidor_ph medidor_ph;
    
   @OneToOne(cascade=CascadeType.ALL)
   private Medidor_salinidade medidor_salinidade;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Medidor_oxigenacao medidor_oxigenacao;
   
  
    
    public Tanque() {

    }

}
