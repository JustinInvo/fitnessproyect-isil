package com.Fitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Fitness.entity.Plan;
import com.Fitness.repository.PlanRepository;

import java.util.Optional;

@Controller
@RequestMapping("/planes")
public class PlanController {

    @Autowired
    private PlanRepository planRepository;

    @GetMapping
    public String getAll(Model model) {
    	System.out.println("Obteniendo todos los planes...");
        model.addAttribute("planes", planRepository.findAll());
        return "planes";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("plan", new Plan());
        return "nuevoPlan";
    }

    @PostMapping("/nuevo")
    public String crear(@ModelAttribute Plan plan) {
        planRepository.save(plan);
        return "redirect:/planes";
    }
    
    @PostMapping("/{id}")
    public String actualizar(@PathVariable("id") int id, @ModelAttribute Plan planActualizado) {
        Optional<Plan> planOptional = planRepository.findById(id);
        if (planOptional.isPresent()) {
            Plan plan = planOptional.get();
            // actualiza las propiedades del plan...
            plan.setNombre(planActualizado.getNombre());
            plan.setDuracion_meses(planActualizado.getDuracion_meses());
            // etc.
            planRepository.save(plan);
        }
        return "redirect:/planes";
    }
    
    @PostMapping("/{id}/eliminar")
    public String eliminar(@PathVariable("id") int id) {
        planRepository.deleteById(id);
        return "redirect:/planes";
    }
}