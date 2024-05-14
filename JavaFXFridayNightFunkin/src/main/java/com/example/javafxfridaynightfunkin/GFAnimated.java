package com.example.javafxfridaynightfunkin;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

public class GFAnimated extends AnimatedImage{
    public GFAnimated(int initialAnimation){
        super(new Image(Main.class.getResource("") + "Images/Characters/GF_assets.png"), initialAnimation);
    }

    public void nextFrame(boolean left, boolean down, boolean up, boolean right, int frameCount){
        super.nextFrame();
        switch(getAnimation()){
            case 0:
                if(getFrame() >= 30 * frameDelay){
                    setDefaultFrame(frameCount % (30 * frameDelay));
                    setToDefault();
                }
                break;
            case 1:
                if(getFrame() >= 15 * frameDelay && !left){
                    setDefaultFrame(frameCount % (15 * frameDelay));
                    setToDefault();
                }
                break;
            case 2:
                if(getFrame() >= 20 * frameDelay && !down){
                    setDefaultFrame(frameCount % (20 * frameDelay));
                    setToDefault();
                }
                break;
            case 3:
                if(getFrame() >= 7 * frameDelay && !up){
                    setDefaultFrame(frameCount % (7 * frameDelay));
                    setToDefault();
                }
                break;
            case 4:
                if(getFrame() >= 15 * frameDelay && !right){
                    setDefaultFrame(frameCount % (15 * frameDelay));
                    setToDefault();
                }
                break;
            default:
        }
    }

    public void updateViewport(){
        getView().setRotate(0);
        switch(getAnimation()){
            case 0:
                //Idle dance
                setFrameWidth(703);
                setFrameHeight(648);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(3553, 0, 699, 634));
                    setXOffset(-2);
                    setYOffset(-14);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(4262, 0, 703, 634));
                    setXOffset(0);
                    setYOffset(-14);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(4975, 0, 703, 632));
                    setXOffset(0);
                    setYOffset(-16);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(5688, 0, 699, 632));
                    setXOffset(-2);
                    setYOffset(-16);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 5 * frameDelay){
                    getView().setViewport(new Rectangle2D(6397, 0, 699, 635));
                    setXOffset(-2);
                    setYOffset(-13);
                }
                if (getFrame() >= 5 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(7106, 0, 699, 635));
                    setXOffset(-2);
                    setYOffset(-13);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 7 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 667, 699, 637));
                    setXOffset(-2);
                    setYOffset(-11);
                }
                if (getFrame() >= 7 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(709, 667, 699, 648));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 13 * frameDelay){
                    getView().setViewport(new Rectangle2D(1418, 667, 699, 648));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 13 * frameDelay && getFrame() < 15 * frameDelay){
                    getView().setViewport(new Rectangle2D(2127, 667, 699, 648));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 15 * frameDelay && getFrame() < 16 * frameDelay){
                    getView().setViewport(new Rectangle2D(2836, 667, 699, 636));
                    setXOffset(-2);
                    setYOffset(-12);
                }
                if (getFrame() >= 16 * frameDelay && getFrame() < 17 * frameDelay){
                    getView().setViewport(new Rectangle2D(3545, 667, 703, 636));
                    setXOffset(0);
                    setYOffset(-12);
                }
                if (getFrame() >= 17 * frameDelay && getFrame() < 18 * frameDelay){
                    getView().setViewport(new Rectangle2D(4258, 667, 703, 636));
                    setXOffset(0);
                    setYOffset(-12);
                }
                if (getFrame() >= 18 * frameDelay && getFrame() < 19 * frameDelay){
                    getView().setViewport(new Rectangle2D(4971, 667, 699, 636));
                    setXOffset(-2);
                    setYOffset(-12);
                }
                if (getFrame() >= 19 * frameDelay && getFrame() < 20 * frameDelay){
                    getView().setViewport(new Rectangle2D(5680, 667, 699, 637));
                    setXOffset(-2);
                    setYOffset(-11);
                }
                if (getFrame() >= 20 * frameDelay && getFrame() < 21 * frameDelay){
                    getView().setViewport(new Rectangle2D(6389, 667, 699, 637));
                    setXOffset(-2);
                    setYOffset(-11);
                }
                if (getFrame() >= 21 * frameDelay && getFrame() < 22 * frameDelay){
                    getView().setViewport(new Rectangle2D(7098, 667, 699, 638));
                    setXOffset(-2);
                    setYOffset(-10);
                }
                if (getFrame() >= 22 * frameDelay && getFrame() < 25 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 1325, 699, 643));
                    setXOffset(-2);
                    setYOffset(-5);
                }
                if (getFrame() >= 25 * frameDelay && getFrame() < 28 * frameDelay){
                    getView().setViewport(new Rectangle2D(709, 1325, 699, 642));
                    setXOffset(-2);
                    setYOffset(-6);
                }
                if (getFrame() >= 28 * frameDelay){
                    getView().setViewport(new Rectangle2D(1418, 1325, 699, 642));
                    setXOffset(-2);
                    setYOffset(-6);
                }
                break;
            case 1:
                //Hit left
                setFrameWidth(703);
                setFrameHeight(638);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(2844, 4623, 699, 633));
                    setXOffset(-2);
                    setYOffset(-5);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(3553, 4623, 703, 631));
                    setXOffset(0);
                    setYOffset(-7);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(4266, 4623, 703, 638));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(4979, 4623, 699, 638));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 5 * frameDelay){
                    getView().setViewport(new Rectangle2D(5688, 4623, 699, 638));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 5 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(6397, 4623, 699, 638));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(7106, 4623, 699, 637));
                    setXOffset(-2);
                    setYOffset(-1);
                }
                if (getFrame() >= 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 5294, 699, 637));
                    setXOffset(-2);
                    setYOffset(-1);
                }
                break;
            case 2:
                //Hit down
                setFrameWidth(703);
                setFrameHeight(637);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(2853, 3295, 699, 631));
                    setXOffset(-2);
                    setYOffset(-6);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(3562, 3295, 703, 631));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(4275, 3295, 703, 636));
                    setXOffset(0);
                    setYOffset(-1);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(4988, 3295, 699, 636));
                    setXOffset(-2);
                    setYOffset(-1);
                }
                if (getFrame() >= 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(5697, 3295, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                break;
            case 3:
                //Hit up
                setFrameWidth(703);
                setFrameHeight(661);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(7098, 3952, 699, 661));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 4623, 703, 661));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(713, 4623, 703, 661));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(1426, 4623, 699, 661));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(2135, 4623, 699, 661));
                    setXOffset(-2);
                    setYOffset(0);
                }
                break;
            case 4:
                //Hit right
                setFrameWidth(703);
                setFrameHeight(637);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1418, 3952, 699, 632));
                    setXOffset(-2);
                    setYOffset(-5);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(2127, 3952, 703, 632));
                    setXOffset(0);
                    setYOffset(-5);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(2840, 3952, 703, 637));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(3553, 3952, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(4262, 3952, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 5 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(4971, 3952, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(5680, 3952, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                if (getFrame() >= 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(6389, 3952, 699, 637));
                    setXOffset(-2);
                    setYOffset(0);
                }
                break;
            default:
        }
    }
}
