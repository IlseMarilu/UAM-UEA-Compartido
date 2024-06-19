/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uam.UamCompartido.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LGMX
 */

@Controller
@RequestMapping("/index")
public class IndexController {
    
    @GetMapping
    public String Index(Model model){
        String nombre="Leo";
        model.addAttribute("nombre", nombre);
        model.addAttribute("edad", 16);
        return "index";
    }
    
    
}
