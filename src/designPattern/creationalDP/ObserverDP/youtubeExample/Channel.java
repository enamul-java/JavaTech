/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.creationalDP.ObserverDP.youtubeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 *
 * @author ehaque
 */
class Channel {
    private List<SubScribers> subscribers = new ArrayList<>();
    private String channelName;
    private List<String> videoTitle = new ArrayList<>();

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(SubScribers sub){
        subscribers.add(sub);
    }
    
    public void unSubscribe(SubScribers sub){
        subscribers.remove(sub);
    }
    
    public void notifySubscriber(String videoTitle){
        for(SubScribers sbs: subscribers){
            sbs.videoUploaded(videoTitle);
        }
        
    }
    
    public void uploadVideo(String videoTitle){
        this.videoTitle.add(videoTitle);
        //Add Video
        notifySubscriber(videoTitle);
    }
    
}
