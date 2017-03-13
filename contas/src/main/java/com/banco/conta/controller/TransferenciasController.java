
package com.banco.conta.controller;

import com.banco.conta.model.Conta;
import com.banco.conta.model.Transferencia;
import com.banco.conta.repository.Contas;
import java.math.BigDecimal;
import java.math.MathContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Henrique
 */
@Controller
public class TransferenciasController {
    @Autowired
    private Contas contas;
    
    @GetMapping("/contas/transferencias")
    public String nova(Model model){
        model.addAttribute(new Transferencia());
        return"conta/transferencias";
    }
    @PostMapping("/contas/transferencias")
    public String transferir(Conta transferencia){
       //Criar regras para salvar resultado da transferencia
       //Usar metodos transferencia.get para acessar atributos
       BigDecimal big1 = new BigDecimal("0.1");
       big1 = transferencia.getSaldo();
       BigDecimal big2 = new BigDecimal("100.0");
       BigDecimal soma = new BigDecimal("0.1");
       soma = big1.add(big2);
       transferencia.setSaldo(soma);

       contas.save(transferencia);
       return "redirect:/contas";
        
    }
    /*@RequestMapping(value ="/contas/soma", method = RequestMethod.GET)
    public Double soma(@RequestParam("valA") Double valA, @RequestParam("valB") Double valB) {
 
        return valA + valB;
    }*/
}
