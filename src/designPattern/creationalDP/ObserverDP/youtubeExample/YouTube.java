/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.creationalDP.ObserverDP.youtubeExample;

/**
 *
 * @author ehaque
 */
public class YouTube {

    public static void main(String[] args) {

        LoopInThread lit = new LoopInThread();
        lit.loop();

    }

    private static void observer() {
        Channel c1 = new Channel("Sonamunider Likhapora");
        Channel c2 = new Channel("Bioscope");
        Channel c3 = new Channel("HelthCare");

        SubScribers s1 = new SubScribers("Enamul");
        SubScribers s2 = new SubScribers("Sakib");
        SubScribers s3 = new SubScribers("Tonu");

        c1.subscribe(s1);
        c1.subscribe(s3);

        c2.subscribe(s3);
        c2.subscribe(s2);

        c3.subscribe(s1);
        c3.subscribe(s2);

        c3.uploadVideo("How to take care a baby");
        c2.uploadVideo("Kab Khushi Kabi Gum Movie");
        c1.uploadVideo("Adasha Bornomala ");
    }

    public static class LoopInThread {

        public void loop() {
            // both loops run on a single thread
            for (byte i = 1; i <= 5; i++) {

                // sleep .5 seconds for demonstration purposes
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                System.out.println("Loop 1, Iteration: " + i);
            }

            // this loop will wait for the one above
            // to finish before it will start
            for (byte i = 1; i <= 5; i++) {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Loop 2, Iteration: " + i);
            }
        }
    }

}
