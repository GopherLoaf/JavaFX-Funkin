package com.example.javafxfridaynightfunkin;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedImage extends TimedImage{
    protected int animation;
    protected int defaultAnimation;
    protected int defaultFrame;
    protected ImageView view;
    protected int xOffset;
    protected int yOffset;
    protected int frameWidth;
    protected int frameHeight;
    protected int frameDelay = 3;

    public AnimatedImage(Image image, int initialAnimation){
        super(image);
        view = new ImageView();
        view.setImage(getImage());
        animation = initialAnimation;
        defaultAnimation = initialAnimation;
    }

    public void setAnimation(int newAnimation){
        animation = newAnimation;
    }

    public int getAnimation(){
        return animation;
    }

    public void setDefaultAnimation(int newAnimation){
        defaultAnimation = newAnimation;
    }

    public int getDefaultAnimation(){
        return defaultAnimation;
    }

    public ImageView getView(){
        return view;
    }

    public int getXOffset() {
        return xOffset;
    }

    public void setXOffset(int newOffset) {
        xOffset = newOffset;
    }

    public int getYOffset() {
        return yOffset;
    }

    public void setYOffset(int newOffset) {
        yOffset = newOffset;
    }

    public int getFrameWidth(){
        return frameWidth;
    }

    public int getFrameHeight(){
        return frameHeight;
    }

    public void setFrameWidth(int newWidth){
        frameWidth = newWidth;
    }

    public void setFrameHeight(int newHeight){
        frameHeight = newHeight;
    }

    public void setDefaultFrame(int newDefault){
        defaultFrame = newDefault;
    }

    public void setToDefault(){
        setFrame(defaultFrame);
        setAnimation(getDefaultAnimation());
    }

    public abstract void updateViewport();
}
