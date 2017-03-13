/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.conta.repository;

import com.banco.conta.model.Conta;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Henrique
 */
public interface Contas extends JpaRepository<Conta, Long> {
    public List<Conta> findByTitularContainingIgnoreCase(String titular);
    
}
