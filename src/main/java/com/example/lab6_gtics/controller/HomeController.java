package com.example.lab6_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/pupiletras")
    public String paginaGenerate() {
        return "generate";
    }

    @PostMapping("/generar")
    public String generateGame(
            @RequestParam("nLine") int nLine,
            @RequestParam("nColumn") int nColumn,
            @RequestParam("words") String words,
            Model model
    ) {
        // addAttribute + check values
        return "redirect:/jugar";
    }

    @GetMapping("/jugar")
    public String paginaPlay() {
        return "play";
    }

    @GetMapping("/buscar")
    public String buscarPalabra(
            @RequestParam("xyStart") String xyStart,
            @RequestParam("xyEnd") String xyEnd,
            Model model
    ) {
        // add + …
        return "redirect:/jugar";
    }
}
