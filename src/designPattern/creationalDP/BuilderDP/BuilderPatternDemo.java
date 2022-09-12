/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.creationalDP.BuilderDP;

/**
 *
 * @author ehaque
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        /*
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
        */
        
        Student s = Student.Builder.newInstance()
                        .setId(0)
                        .setName("Enamul")
                        .setAddress("Dhaka")
                        .build();
        
        Student.Builder sb = Student.Builder.newInstance();
        sb.setAddress("Naogaon");
        sb.setId(3);
        sb.setName("Sabkib");
        
        Student s2 = new Student(sb);
        System.out.println(""+s.toString());
        System.out.println(""+s2.toString());
        
    }
}
