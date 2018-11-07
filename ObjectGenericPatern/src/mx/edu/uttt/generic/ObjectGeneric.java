/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.generic;

/**
 *
 * @author Erik Guerrero Bravo.   Version 1.0.0
 */
public class ObjectGeneric {
    
    private ObjectGeneric() {
    }
    
    public static ObjectGeneric getInstance() {
        return ObjectGenericHolder.INSTANCE;
    }
    
    private static class ObjectGenericHolder {

        private static final ObjectGeneric INSTANCE = new ObjectGeneric();
    }
}
