package com.Fitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Fitness.entity.Plan;
import com.Fitness.repository.PlanRepository;



@Controller
@RequestMapping("/planes")
public class PlanController {

    @Autowired
    private PlanRepository planRepository;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("planes", planRepository.findAll());
        return "planes";
    }
}