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
public class SubScribers {
    public String subScriberName;
    public Channel channel;

    public SubScribers(String subScriberName) {
        this.subScriberName = subScriberName;
    }
    
    public void videoUploaded(String videoTitle){
        System.out.println("Hi "+ subScriberName + "  a new video titled "+ videoTitle+" has been uploaed!");
    }
}
