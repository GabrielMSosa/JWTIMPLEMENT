/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jwtyJPAeg.jtwjpaeg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    
    private Long id;
private String nombre;
private String apellido;
private String telefono;
private String email;
private String edad;
private String acercademi;
private String urlImg;
    
    
}
