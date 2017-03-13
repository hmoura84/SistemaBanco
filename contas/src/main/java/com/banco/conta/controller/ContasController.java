
package com.banco.conta.controller;

import com.banco.conta.model.Conta;
import com.banco.conta.repository.Contas;
import com.banco.conta.repository.filter.ContaFilter;
import java.math.BigDecimal;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contas")
public class ContasController {
    
    @Autowired
    private Contas contas;
    
    @GetMapping("/nova")
    public ModelAndView novo(Conta conta){
    ModelAndView mv = new ModelAndView("conta/cadastro-conta");
    return mv;    
    }
    @PostMapping("/nova")
    public ModelAndView salvar(@Valid Conta conta, BindingResult result,
            RedirectAttributes attributes){
    if (result.hasErrors()){
        return novo(conta) ;
    }
        
    contas.save(conta);
    attributes.addFlashAttribute("mensagem","Conta cadastrada com sucesso!");
    return new ModelAndView("redirect:/contas/nova");
    }
    @GetMapping
    public ModelAndView pesquisar(ContaFilter contaFilter){
        ModelAndView mv = new ModelAndView("/conta/pesquisa-contas");
        mv.addObject("contas", contas.findByTitularContainingIgnoreCase(
               Optional.ofNullable(contaFilter.getTitular()).orElse("%")));
        
       
        
        return mv;
        
        

    }
     
}
