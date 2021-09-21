/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerationform.dao;

import com.registerationform.dbconnection.DBConnection;
import com.registerationform.model.User;


/**
 *
 * @author Ahsan
 */
public interface UserDAO {
    
    
    boolean addUser(User u);

}
