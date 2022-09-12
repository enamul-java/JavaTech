/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable.imutable;

/**
 *
 * @author ehaque
 */

/*
    1. The class must be declared as final so that child classes can’t be created.
    2. Data members in the class must be declared private so that direct access is not allowed.
    3. Data members in the class must be declared as final so that we can’t change the value of it after object creation.
    4. A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
    5. Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
*/

//1. The class must be declared as final so that child classes can’t be created.
public final class Student {

    //2. Data members in the class must be declared private so that direct access is not allowed.
    //3. Data members in the class must be declared as final so that we can’t change the value of it after object creation.
    private final int age;
    private final String name;

    //4. A parameterized constructor should initialize all the fields performing a deep copy so that data 
    //   members can’t be modified with an object reference.
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //5. Deep Copy of objects should be performed in the getter methods to return 
    //   a copy rather than returning the actual object reference)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static class StudentImpl {

        public static void main(String[] args) {

            String name = "Enamul";
            int age = 35;

            Student st = new Student(age, name);
            System.out.println("Name: " + st.getName());

            name = "Sakib";
            age = 26;

            System.out.println("Name: " + st.getName());

            add(4, 4);

        }

    }

    private static void add(int x, int y) {
        x = 9;
        System.out.println("" + x);
    }

}
