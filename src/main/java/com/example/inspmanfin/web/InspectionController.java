package com.example.inspmanfin.web;

import com.example.inspmanfin.domain.Inspection;
import com.example.inspmanfin.repositories.InspectionRepository;
import com.example.inspmanfin.repositories.InspectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
@RequestMapping("/inspection")

public class InspectionController {
    private final com.example.inspmanfin.repositories.InspectionRepository InspectionRepository;

    public InspectionController(InspectionRepository InspectionRepository) {
        this.InspectionRepository = InspectionRepository;
    }


    @GetMapping("/")
    public String showInspections(Model model) {
        model.addAttribute("inspections", InspectionRepository.findAll());
        return "/inspection/showInspections";
    }
    @GetMapping("/form")
    public String formShow(Model model){
        model.addAttribute("inspection", new Inspection());
        return "/inspection/creatInspection";
    }

    @PostMapping("/form")
    public String formPerform(@Valid Inspection inspection, Model model){
        InspectionRepository.save(inspection);
        model.addAttribute("inspections", InspectionRepository.findAll());
        return "/inspection/showInspections";
    }


}
