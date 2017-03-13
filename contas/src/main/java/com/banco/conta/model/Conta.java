
package com.banco.conta.model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

/**
 *
 * @author Henrique
 */
@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @NotBlank
    private String titular;
   
    @NotNull
    private int cpf;
    
    private String datanascimento;
    @Enumerated(EnumType.STRING)
    private TipoConta tipo;
    
    private int cnpj;
    
    private String razaosocial;
    
    private String nomefantasia;
    
    private String dataabertura;
    @Enumerated(EnumType.STRING)
    private HieraConta hierarquia;
    @Enumerated(EnumType.STRING)
    private SitConta situacao;
    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal saldo;

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the datanascimento
     */
    public String getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    /**
     * @return the tipo
     */
    public TipoConta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razaosocial
     */
    public String getRazaosocial() {
        return razaosocial;
    }

    /**
     * @param razaosocial the razaosocial to set
     */
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    /**
     * @return the nomefantasia
     */
    public String getNomefantasia() {
        return nomefantasia;
    }

    /**
     * @param nomefantasia the nomefantasia to set
     */
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    /**
     * @return the dataabertura
     */
    public String getDataabertura() {
        return dataabertura;
    }

    /**
     * @param dataabertura the dataabertura to set
     */
    public void setDataabertura(String dataabertura) {
        this.dataabertura = dataabertura;
    }

    /**
     * @return the hierarquia
     */
    public HieraConta getHierarquia() {
        return hierarquia;
    }

    /**
     * @param hierarquia the hierarquia to set
     */
    public void setHierarquia(HieraConta hierarquia) {
        this.hierarquia = hierarquia;
    }

    /**
     * @return the situacao
     */
    public SitConta getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(SitConta situacao) {
        this.situacao = situacao;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
 
}
