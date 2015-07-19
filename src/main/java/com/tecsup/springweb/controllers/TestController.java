package com.tecsup.springweb.controllers;

import com.tecsup.springweb.model.Programa;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @RequestMapping("parametros")
    public String parametros(@RequestParam("nombres") String nombres,
        @RequestParam("apellidos") String apellidos, Model model ){
        model.addAttribute("nombresCompleto", nombres + " "+ apellidos);
        return "test/parametros";
    }
    
    @RequestMapping("parametros2")
    public String parametros_dos(@RequestParam("nombres") String nombres,
        @RequestParam("apellidos") String apellidos, Model model ){
        model.addAttribute("nombresCompleto", nombres + " "+ apellidos);
        return "test/parametros";
    }
    @RequestMapping("binding")
    public String binding(Programa programa, Model model ){        
     model.addAttribute("programa", programa);
     return "test/binding";
    }
    
    @ResponseBody
    @RequestMapping("ajax")
    public String ajax(Programa programa){
     return programa.getNombre()+ "" + programa.getCodigo();
    }
    
    @ResponseBody
    @RequestMapping("ajax2")
    public Programa ajaxdos(Programa programa, Model model){
     return programa;
    }
}


