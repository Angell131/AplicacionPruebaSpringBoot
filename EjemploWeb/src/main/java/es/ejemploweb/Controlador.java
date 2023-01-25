package es.ejemploweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class Controlador {

    //atiende a la petición localhost:8080/
    @RequestMapping("/")
    public ModelAndView peticionRaiz() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("sms1", "Hola Amelia");
        mv.addObject("sms2", "Hola Carmelo");
        mv.setViewName("index");
        return mv;
    }

    //atiende a la petición localhost:8080/chorrada1
    @RequestMapping("/chorrada1")
    public ModelAndView peticionChorrada1() {
        ModelAndView mv = new ModelAndView("vista1");
        mv.setViewName("vista1");
        return mv;
    }
    @RequestMapping("/chorrada2")
    public ModelAndView peticionChorrada2() {
        ModelAndView mv = new ModelAndView("vista1");
        String[] textos = new String[3];
        textos[0] = "Hola Mundo";
        textos[1] = "Hola Amigos";
        textos[2] = "Hola Caracola";
        mv.addObject("mensajes", textos);
        mv.setViewName("vista2");
        return mv;
    }
    @RequestMapping("/chorrada3")
    public ModelAndView peticionChorrada3() {
        ModelAndView m = new ModelAndView();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miércoles");
        lista.add("Jueves");
        lista.add("Viernes");
        m.addObject("lista", lista);
        m.setViewName("vista3");
        return m;
    }



}
