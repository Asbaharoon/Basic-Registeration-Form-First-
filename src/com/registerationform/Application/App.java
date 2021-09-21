/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registerationform.Application;

import com.registerationform.userinterafce.RegisterationForm;

/**
 *
 * @author Ahsan
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //new RegisterationForm().setVisible(true);
         
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterationForm().setVisible(true);
            }
        });
    }
    
}
