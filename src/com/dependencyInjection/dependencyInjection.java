/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyInjection;

/**
 *
 * @author ehaque
 */
public class dependencyInjection {
    /*
    
    What is dependency injection?
     Classes often require references to other classes. 
      For example, a Car class might need a reference to an Engine class. 
      These required classes are called dependencies, and in this example 
      the Car class is dependent on having an instance of the Engine class to run.
    
    There are three ways for a class to get an object it needs:
    
    1. The class constructs the dependency it needs. 
       -> In the example above, Car would create and initialize its own instance of Engine.
    2. Grab it from somewhere else. Some Android APIs, 
       -> such as Context getters and getSystemService(), work this way.
    3. Have it supplied as a parameter. 
       -> The app can provide these dependencies when the class is constructed or pass 
          them in to the functions that need each dependency. In the example above, 
          the Car constructor would receive Engine as a parameter.
    */
    
    class Car{
        //3 way to get (Referencing) Engine Dependency 
        
        //Way One 
        Engine engine1 = new Engine("Sidan");
        
        //Way Two
        Engine engine2 = new Worshop().getEngine("SUV");
        
        //Way three/Dependency Injection
        Engine engine3;
        public Car(Engine engine){
            this.engine3 = engine;
        }
        
        public void setEngine(Engine e){
            engine3 = e;
            engine3.showEngineDetails();
        }
        
        
        
        
        
    }
    
    class Worshop{
        
        public Engine getEngine(String engineName){
            return new Engine(engineName);
        }
    }
    
    class Engine{
        String engineName;
        public Engine(String engineName){
            this.engineName = engineName;
        }
        
        public void showEngineDetails(){
            System.out.println("Engine Name is "+ engineName);
        }
    }
}
