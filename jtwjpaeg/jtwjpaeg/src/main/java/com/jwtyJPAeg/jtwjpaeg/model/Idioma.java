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
public class Idioma {
    private Long id;
private String idioma;
private String nivel_lectura;
private String nivel_escritura;
    
}
