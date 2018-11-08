/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.generic;

import mx.edu.uttt.view.frmLogin;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class SingletonLogin {

     //ahora aqui esta el truco 
    //primero un constructor
    //el cosntructor esta vacio
    public SingletonLogin() {
    }
    
   
    /*
    *Realmente este es quien se encarga de hacer la instancia
    *de los objetos solo una.
    *ya terminamos
    */
    public static frmLogin getInstance() {
        return ObjectLoginInstance.INSTANCE_LOGIN;
    }
    
    
    //este metodo se encarga de crear el jframe del Login
    private static class ObjectLoginInstance {
        private static final frmLogin INSTANCE_LOGIN = new frmLogin();
    }
    
}
