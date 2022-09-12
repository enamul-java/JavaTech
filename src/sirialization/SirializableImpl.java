/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ehaque
 */
public class SirializableImpl {

    public static void main(String[] args) {
        
        /*
        try {
            //Creating the object    
            Student s1 = new Student("Enamul", 35, "Male", "Uttara");
            //Creating stream and writing the object    
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream    
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }*/

        try {
            //Creating stream to read the object    
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            //printing the data of the serialized object    
            System.out.println("Name: "+s.getName() + " Age: " + s.getAge() + " Gender: " + s.getGender() + " Address: " + s.getAddress());
            //closing the stream    
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
