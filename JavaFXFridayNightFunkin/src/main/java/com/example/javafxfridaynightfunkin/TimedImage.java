package com.example.javafxfridaynightfunkin;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TimedImage {
    protected Image image;
    protected ImageView imageView;
    protected int frames;

    public TimedImage(Image image){
        this.image = image;
        imageView = new ImageView(image);
        frames = 0;
    }

    public void nextFrame(){
        frames++;
    }

    public int getFrame(){
        return frames;
    }

    public void setFrame(int newFrame){
        frames = newFrame;
    }

    public Image getImage(){
        return image;
    }

    public ImageView getImageView(){
        return imageView;
    }
}
