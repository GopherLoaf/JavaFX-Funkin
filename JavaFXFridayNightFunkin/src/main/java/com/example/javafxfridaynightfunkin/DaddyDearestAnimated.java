package com.example.javafxfridaynightfunkin;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

public class DaddyDearestAnimated extends AnimatedImage{
    public DaddyDearestAnimated(int initialAnimation){
        super(new Image(Main.class.getResource("") + "Images/Characters/daddyDearest.png"), initialAnimation);
    }

    public void nextFrame(boolean left, boolean down, boolean up, boolean right, int frameCount){
        super.nextFrame();
        switch(getAnimation()){
            case 0:
                if(getFrame() >= 13 * frameDelay){
                    setDefaultFrame(frameCount % (13 * frameDelay));
                    setToDefault();
                }
                break;
            case 1:
                if(getFrame() >= 16 * frameDelay && !left){
                    setDefaultFrame(frameCount % (16 * frameDelay));
                    setToDefault();
                }
                break;
            case 2:
                if(getFrame() >= 16 * frameDelay && !down){
                    setDefaultFrame(frameCount % (30 * frameDelay));
                    setToDefault();
                }
                break;
            case 3:
                if(getFrame() >= 16 * frameDelay && !up){
                    setDefaultFrame(frameCount % (15 * frameDelay));
                    setToDefault();
                }
                break;
            case 4:
                if(getFrame() >= 16 * frameDelay && !right){
                    setDefaultFrame(frameCount % (62 * frameDelay));
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
                setFrameWidth(429);
                setFrameHeight(767);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1723, 8, 421, 767));
                    setXOffset(-5);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(1820, 791, 429, 759));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(2265, 783, 425, 758));
                    setXOffset(-1);
                    setYOffset(-9);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(2160, 8, 424, 759));
                    setXOffset(-2);
                    setYOffset(-8);
                }
                if (getFrame() >= 8 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(1594, 1584, 766, 421));
                    getView().setRotate(270);
                    setXOffset(-4 + 173);
                    setYOffset(-1 - 173);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(1383, 801, 421, 767));
                    setXOffset(-5);
                    setYOffset(0);
                }
                if (getFrame() >= 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(1723, 8, 421, 767));
                    setXOffset(-5);
                    setYOffset(0);
                }
                break;
            case 1:
                //Hit left
                setFrameWidth(382 + 40);
                setFrameHeight(777);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(8, 1668, 777, 371));
                    setXOffset(203);
                    setYOffset(-203);
                    getView().setRotate(270);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(1325, 8, 382, 777));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(801, 1643, 777, 382));
                    setXOffset(198);
                    setYOffset(-198);
                    getView().setRotate(270);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(1325, 8, 382, 777));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 8 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(801, 1643, 777, 382));
                    setXOffset(198);
                    setYOffset(-198);
                    getView().setRotate(270);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(1325, 8, 382, 777));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 12 * frameDelay && getFrame() < 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(801, 1643, 777, 382));
                    setXOffset(198);
                    setYOffset(-198);
                    getView().setRotate(270);
                }
                if (getFrame() >= 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(1325, 8, 382, 777));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 2:
                //Hit down
                setFrameWidth(470 - 40);
                setFrameHeight(736);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(2600, 8, 470, 731));
                    setXOffset(0);
                    setYOffset(-5);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(2376, 1557, 736, 464));
                    setXOffset(133);
                    setYOffset(-3 - 133);
                    getView().setRotate(270);
                }
                break;
            case 3:
                //Hit up
                setFrameWidth(409 + 10);
                setFrameHeight(818);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(8, 8, 408, 818));
                    setXOffset(-1);
                    setYOffset(-0);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 8, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(8, 842, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 8, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 8 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(8, 842, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 8, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 12 * frameDelay && getFrame() < 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(8, 842, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                if (getFrame() >= 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 8, 408, 810));
                    setXOffset(0);
                    setYOffset(-8);
                }
                break;
            case 4:
                //Hit right
                setFrameWidth(466 - 40);
                setFrameHeight(793);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(901, 817, 466, 792));
                    setXOffset(0);
                    setYOffset(-1);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(856, 8, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 834, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(856, 8, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 8 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 834, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(856, 8, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 12 * frameDelay && getFrame() < 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(432, 834, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(856, 8, 453, 793));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            default:
        }
    }
}
