package com.GasMonkey.VeiculosServ.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.GasMonkey.VeiculosServ.entities.Funcionarios;
import com.GasMonkey.VeiculosServ.repositories.FuncionariosRepository;

@Controller
@RequestMapping(value = "/funcionarios")
public class FuncionariosController {

    @Autowired
    private FuncionariosRepository repository;

    @GetMapping
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("Funcionarios.html");
        mv.addObject("funcionarios", repository.findAll());
        return mv;
    }

    @GetMapping({"/add", "/edit/{id}"})
    public ModelAndView form(@PathVariable(required = false) Long id) {
        ModelAndView mv = new ModelAndView("FuncionariosAdd.html");
        Funcionarios funcionario = (id == null) ? new Funcionarios() : repository.findById(id).orElse(new Funcionarios());
        mv.addObject("funcionario", funcionario); 
        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        repository.deleteById(id);
        return new ModelAndView("redirect:/funcionarios");
    }

    @PostMapping("/save")
    public ModelAndView save(@Validated Funcionarios funcionario, BindingResult result) {
        if (result.hasErrors()) {

            return new ModelAndView("FuncionariosAdd.html").addObject("funcionario", funcionario);
        }
        repository.save(funcionario);
        return new ModelAndView("redirect:/funcionarios");
    }

    public FuncionariosRepository getRepository() {
        return repository;
    }

    public void setRepository(FuncionariosRepository repository) {
        this.repository = repository;
    }
}
