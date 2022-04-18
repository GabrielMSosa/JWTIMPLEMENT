/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jwtyJPAeg.jtwjpaeg.service;

import com.jwtyJPAeg.jtwjpaeg.model.User;
import java.util.Optional;

/**
 *
 * @author sosag
 */

public interface IUserservice {
        Integer saveUser(User user);
	
	   Optional<User> findByUsername(String username);
    
}
