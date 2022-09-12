/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ehaque
 */
public class TestCImpl {

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        
        try {
            try {
                try {
                    Class.forName("TestClass").getMethod("hi").invoke("Hi");
                } 
                
                catch (IllegalAccessException ex) {
                    Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (IllegalArgumentException ex) {
                    Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (InvocationTargetException ex) {
                    Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
