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
public class AlternativeToDI {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

class ServiceLocator {

    private static ServiceLocator instance = null;

    private ServiceLocator() {}

    public static ServiceLocator getInstance() {
        if (instance == null) {
            synchronized(ServiceLocator.class) {
                instance = new ServiceLocator();
            }
        }
        return instance;
    }

    public Engine getEngine() {
        return new Engine();
    }
}

class Engine{
    public void start(){
        System.out.println("Engine Started..");
    }
}

class Car {

    private Engine engine = ServiceLocator.getInstance().getEngine();

    public void start() {
        engine.start();
    }
}


