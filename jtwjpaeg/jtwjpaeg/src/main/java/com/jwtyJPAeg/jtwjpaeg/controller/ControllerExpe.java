/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jwtyJPAeg.jtwjpaeg.controller;


import com.jwtyJPAeg.jtwjpaeg.model.Educacion;
import com.jwtyJPAeg.jtwjpaeg.model.Experiencia;
import com.jwtyJPAeg.jtwjpaeg.model.Idioma;
import com.jwtyJPAeg.jtwjpaeg.model.Skills;
import com.jwtyJPAeg.jtwjpaeg.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */

@RestController
public class ControllerExpe {
    
    
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/experiencias/traertodo")
    public List<Experiencia> devolver(){
    List<Experiencia> expe= new ArrayList<>();
    Experiencia x=new Experiencia(Long.parseLong("1"), "Analista en Mercadolibre","Voolkia IT ","Actualidad",Long.parseLong("2021"),"./assets/voolkiaIt.png", "Argentina","Oberá","Misiones",Long.parseLong("2022"));
    expe.add(x);
      
    
    System.out.println("entramos al get expe");
      return expe;
  
        
    }
    
    
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/user/traertodo")
public List<Usuario> devolverUsuario(){
List<Usuario> expe= new ArrayList<>();

Usuario x=new Usuario(Long.parseLong("1"),"Gabriel Matias","Sosa","+5493755261740","sosagabriel79@gmail.com","31","Me encanta innovar, generar nuevas metodologias para mejorar procedimientos y siempre seguir aprendiendo ","https://drive.google.com/uc?id=1SV2lNnz2bJb5gKYnzlGuA4tgmJmHDRYf&export=download");
expe.add(x);
return expe;
}

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/skill/traertodo")
public List<Skills> devolverSkill(){
List<Skills> expe= new ArrayList<>();
Skills x =new Skills(Long.parseLong("1"), "HTML,Css,JavaScript", "Manejo en aplicaciones WEB en el Frontend y en el backend", "10%","https://drive.google.com/uc?id=1mcUI1dyNwAM88aF6ZsnHjES405ZG4Mk4&export=download");
//Skills x=new Skills(Long.parseLong("1"),,,);
expe.add(x);
return expe;
}

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/idioma/traertodo")
public List<Idioma> devolverIdioma(){
List<Idioma> expe= new ArrayList<>();
    Idioma x =new Idioma(Long.parseLong("1"),"Chino","Bilingue","Muy avanzado");
//Idioma x=new Idioma(Long.parseLong("1"),,,);
expe.add(x);
return expe;
}

    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/educacion/traertodo")
    public List<Educacion> devolverEducacion(){
    List<Educacion> expe= new ArrayList<>();
    Educacion x=new Educacion(Long.parseLong("1"),"Escuela de Comercio N°19","Bachiller, Ciencias Naturales", Long.parseLong("2003"), Long.parseLong("2009"),"Graduado", "./assets/comercio.PNG");
    expe.add(x);
      
    
    System.out.println("entramos al get expe");
      return expe;
  
        
    }
    
    
    
    
    
    
    
    
    
    
}
