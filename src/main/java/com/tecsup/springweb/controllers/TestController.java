package com.tecsup.springweb.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value={"/","pruebas", "test"})
public class TestController {
   
@RequestMapping(method = RequestMethod.GET)
public String index(Model model) {
    model.addAttribute("titulo", "Hola TECSUP");
    model.addAttribute("contenido","Bienvenidos al curso Spring Framework");
    return "test/index";     
}

@RequestMapping("index2")
public ModelAndView indexMV() {
    Map<String, Object> retorno = new HashMap<String, Object>();
    retorno.put("titulo", "Hola TECSUP");
    retorno.put("contenido","Bienvenidos al curso Spring Framework");
    return new ModelAndView("test/index", retorno);
}

@RequestMapping(value = {"info", "prueba"})
public String pruebas() {
return "test/pruebas";
}
}


