package com.example.javafxfridaynightfunkin;

import javafx.util.Duration;
import javafx.scene.image.ImageView;

public class Note {
    private final Duration timestamp;
    private final ImageView imageView;
    private final Duration hold;
    private final int type;
    private int status;
    private final ImageView holdImage = new ImageView();

    public Note(int time, ImageView image){
        timestamp = Duration.millis(time);
        imageView = image;
        hold = Duration.millis(0);
        holdImage.setFitWidth(51 * 2d / 3d);
        type = 0;
    }

    public Note(int time, ImageView image, int holdTime){
        timestamp = Duration.millis(time);
        imageView = image;
        hold = Duration.millis(holdTime);
        holdImage.setFitWidth(51 * 2d / 3d);
        type = 0;
    }

    public Note(int time, ImageView image, int holdTime, int typeNum){
        timestamp = Duration.millis(time);
        imageView = image;
        hold = Duration.millis(holdTime);
        holdImage.setFitWidth(51 * 2d / 3d);
        type = typeNum;
    }

    public Duration getTimestamp(){
        return timestamp;
    }

    public ImageView getView(){
        return imageView;
    }

    public ImageView getHold(){
        return holdImage;
    }

    public Duration getHoldTime(){
        return hold;
    }

    public int getType(){
        return type;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int newStatus){
        status = newStatus;
    }
}
