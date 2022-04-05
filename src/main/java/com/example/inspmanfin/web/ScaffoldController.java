package com.example.inspmanfin.web;

import com.example.inspmanfin.repositories.ScaffoldRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/scaffold")

public class ScaffoldController {
    private final ScaffoldRepository scaffoldRepository;

    public ScaffoldController(ScaffoldRepository scaffoldRepository) {
        this.scaffoldRepository = scaffoldRepository;
    }

    @GetMapping("/")
    public String showScaffolds(Model model) {
        model.addAttribute("scaffolds", scaffoldRepository.findAll());
        return "/scaffold/scaffolds.jsp";
    }

    @GetMapping("/findByGrade/{scaffoldGrade}")
    public String showScaffoldsByGrade(@PathVariable int scaffoldGrade, Model model) {
        model.addAttribute("scaffolds", scaffoldRepository.findAllByScaffoldGrade(scaffoldGrade));
        return "/scaffold/scaffolds.jsp";
    }
}
