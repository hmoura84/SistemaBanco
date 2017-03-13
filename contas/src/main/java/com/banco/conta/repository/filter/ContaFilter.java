package com.banco.conta.repository.filter;

import java.math.BigDecimal;

/**
 *
 * @author Henrique
 */
public class ContaFilter {

    private String titular;
    private BigDecimal saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
}
