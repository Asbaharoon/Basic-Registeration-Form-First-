/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerationform.daoimpl;

import com.registerationform.dao.UserDAO;
import com.registerationform.dbconnection.DBConnection;
import com.registerationform.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Ahsan
 */
public class UserDAOImpl implements UserDAO {

    static Connection con = DBConnection.getDBConnection();

    @Override
    public boolean addUser(User u) {

        try {

            PreparedStatement pst = con.prepareStatement("insert Into Users(name,age,city,email,CNIC,address) values(?,?,?,?,?,?)");
          
            pst.setString(1, u.getName());
            pst.setInt(2, u.getAge());
            pst.setString(3, u.getCity());
            pst.setString(4, u.getEmail());
            pst.setLong(5, u.getCNIC());
            pst.setString(6, u.getAddress());
            
            int rowsAffected = pst.executeUpdate();
            
            return(rowsAffected >= 1);
        
        } catch (Exception e) {

        }

        return false;
    }

}
