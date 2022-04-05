package com.example.inspmanfin.web;

import com.example.inspmanfin.domain.Inspector;
import com.example.inspmanfin.repositories.InspectorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
@RequestMapping("/inspector")

public class InspectorController {
    private final InspectorRepository inspectorRepository;

    public InspectorController(InspectorRepository inspectorRepository) {
        this.inspectorRepository = inspectorRepository;
    }


    @GetMapping("/")
    public String showInspectors(Model model) {
        model.addAttribute("inspectors", inspectorRepository.findAll());
        return "/inspector/showInspectors";
    }
    @GetMapping("/form")
    public String formShow(Model model){
        model.addAttribute("inspector", new Inspector());
        return "/inspector/createInspector";
    }

    @PostMapping("/form")
    public String formPerform(@Valid Inspector inspector, Model model){
        inspectorRepository.save(inspector);
        model.addAttribute("inspectors", inspectorRepository.findAll());
        return "/inspector/showInspectors";
    }


}
