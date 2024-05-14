package com.example.javafxfridaynightfunkin;

import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;

public class BFAnimated extends AnimatedImage{
    public BFAnimated(int initialAnimation){
        super(new Image(Main.class.getResource("") + "Images/Characters/BOYFRIEND.png"), initialAnimation);
    }

    public void nextFrame(boolean left, boolean down, boolean up, boolean right, int frameCount){
        super.nextFrame();
        switch(getAnimation()){
            case 0:
                if(getFrame() >= 14 * frameDelay){
                    setDefaultFrame(frameCount % (14 * frameDelay));
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
                if(getFrame() >= 30 * frameDelay && !down){
                    setDefaultFrame(frameCount % (30 * frameDelay));
                    setToDefault();
                }
                break;
            case 3:
                if(getFrame() >= 15 * frameDelay && !up){
                    setDefaultFrame(frameCount % (15 * frameDelay));
                    setToDefault();
                }
                break;
            case 4:
                if(getFrame() >= 62 * frameDelay && !right){
                    setDefaultFrame(frameCount % (62 * frameDelay));
                    setToDefault();
                }
                break;
            case 5:
                if(getFrame() >= 34 * frameDelay && !left){
                    setDefaultFrame(frameCount % (34 * frameDelay));
                    setToDefault();
                }
                break;
            case 6:
                if(getFrame() >= 29 * frameDelay && !down){
                    setDefaultFrame(frameCount % (29 * frameDelay));
                    setToDefault();
                }
                break;
            case 7:
                if(getFrame() >= 24 * frameDelay && !up){
                    setDefaultFrame(frameCount % (24 * frameDelay));
                    setToDefault();
                }
                break;
            case 8:
                if(getFrame() >= 46 * frameDelay && !right){
                    setDefaultFrame(frameCount % (46 * frameDelay));
                    setToDefault();
                }
                break;
            case 9:
                if(getFrame() >= 34 * frameDelay){
                    setDefaultFrame(frameCount % (34 * frameDelay));
                    setToDefault();
                }
                break;
            case 10:
                if(getFrame() >= 58 * frameDelay){
                    setDefaultFrame(frameCount % (58 * frameDelay));
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
                setFrameWidth(411);
                setFrameHeight(412);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 2344, 406, 392));
                    setXOffset(-1);
                    setYOffset(-20);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(416, 2344, 408, 393));
                    setXOffset(-0);
                    setYOffset(-19);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(834, 2344, 405, 398));
                    setXOffset(-3);
                    setYOffset(-14);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(1249, 2344, 410, 411));
                    setXOffset(-1);
                    setYOffset(-1);
                }
                if (getFrame() >= 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(1669, 2344, 408, 412));
                    setXOffset(-2);
                    setYOffset(-0);
                }
                break;
            case 1:
                //Hit left
                setFrameWidth(385 + 40);
                setFrameHeight(406);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 988, 383, 406));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(393, 988, 374, 404));
                    setXOffset(-11);
                    setYOffset(-2);
                }
                break;
            case 2:
                //Hit down
                setFrameWidth(375);
                setFrameHeight(362);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(6640, 509, 374, 357));
                    setXOffset(-1);
                    setYOffset(-5);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(7024, 509, 373, 362));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 3:
                //Hit up
                setFrameWidth(376);
                setFrameHeight(446);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(3580, 988, 369, 446));
                    setXOffset(-5);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(3959, 988, 376, 441));
                    setXOffset(0);
                    setYOffset(-5);
                }
                break;
            case 4:
                //Hit right
                setFrameWidth(409 - 40);
                setFrameHeight(407);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1929, 988, 408, 405));
                    setXOffset(-1);
                    setYOffset(-2);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(2347, 988, 408, 407));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 5:
                //Miss left
                setFrameWidth(384 + 40);
                setFrameHeight(432);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(777, 988, 383, 406));
                    setXOffset(0);
                    setYOffset(-26);
                }
                if (getFrame() >= frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(1170, 988, 369, 430));
                    setXOffset(-15);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(1549, 988, 370, 430));
                    setXOffset(-13);
                    setYOffset(0);
                }
                break;
            case 6:
                //Miss down
                setFrameWidth(378);
                setFrameHeight(392);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(6640, 509, 374, 357));
                    setXOffset(-1);
                    setYOffset(-35);
                }
                if (getFrame() >= frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(7407, 509, 376, 392));
                    setXOffset(-1);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(7793, 509, 378, 388));
                    setXOffset(0);
                    setYOffset(-4);
                }
                break;
            case 7:
                //Miss up
                setFrameWidth(378);
                setFrameHeight(446);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(3580, 988, 369, 446));
                    setXOffset(-9);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(4345, 988, 360, 427));
                    setXOffset(0);
                    setYOffset(-13);
                }
                if (getFrame() >= 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(4715, 988, 357, 430));
                    setXOffset(-1);
                    setYOffset(-10);
                }
                break;
            case 8:
                //Miss right
                setFrameWidth(415 - 40);
                setFrameHeight(435);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(1929, 988, 408, 405));
                    setXOffset(-7);
                    setYOffset(-30);
                }
                if (getFrame() >= frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(2765, 988, 395, 432));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(3170, 988, 400, 432));
                    setXOffset(-1);
                    setYOffset(0);
                }
                break;
            case 9:
                //BF dies
                setFrameWidth(439);
                setFrameHeight(445);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(5082, 988, 433, 415));
                    setXOffset(-1);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(5525, 988, 433, 415));
                    setXOffset(-1);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(5968, 988, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(6417, 988, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 5 * frameDelay){
                    getView().setViewport(new Rectangle2D(6866, 988, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 5 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(7315, 988, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 15 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 1444, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 15 * frameDelay && getFrame() < 20 * frameDelay){
                    getView().setViewport(new Rectangle2D(449, 1444, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 20 * frameDelay && getFrame() < 22 * frameDelay){
                    getView().setViewport(new Rectangle2D(1347, 1444, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 22 * frameDelay && getFrame() < 24 * frameDelay){
                    getView().setViewport(new Rectangle2D(1796, 1444, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 24 * frameDelay && getFrame() < 25 * frameDelay){
                    getView().setViewport(new Rectangle2D(2245, 1444, 439, 412));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 25 * frameDelay && getFrame() < 27 * frameDelay){
                    getView().setViewport(new Rectangle2D(2694, 1444, 439, 439));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 27 * frameDelay && getFrame() < 29 * frameDelay){
                    getView().setViewport(new Rectangle2D(3143, 1444, 439, 434));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 29 * frameDelay && getFrame() < 31 * frameDelay){
                    getView().setViewport(new Rectangle2D(3592, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 31 * frameDelay && getFrame() < 35 * frameDelay){
                    getView().setViewport(new Rectangle2D(4041, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 35 * frameDelay && getFrame() < 36 * frameDelay){
                    getView().setViewport(new Rectangle2D(4490, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 36 * frameDelay && getFrame() < 37 * frameDelay){
                    getView().setViewport(new Rectangle2D(4939, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 37 * frameDelay && getFrame() < 38 * frameDelay){
                    getView().setViewport(new Rectangle2D(5388, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 38 * frameDelay && getFrame() < 39 * frameDelay){
                    getView().setViewport(new Rectangle2D(5837, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 39 * frameDelay && getFrame() < 40 * frameDelay){
                    getView().setViewport(new Rectangle2D(6286, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 40 * frameDelay && getFrame() < 41 * frameDelay){
                    getView().setViewport(new Rectangle2D(6735, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 41 * frameDelay && getFrame() < 42 * frameDelay){
                    getView().setViewport(new Rectangle2D(7184, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 42 * frameDelay && getFrame() < 43 * frameDelay){
                    getView().setViewport(new Rectangle2D(7633, 1444, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 43 * frameDelay && getFrame() < 44 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 44 * frameDelay && getFrame() < 45 * frameDelay){
                    getView().setViewport(new Rectangle2D(449, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 45 * frameDelay && getFrame() < 46 * frameDelay){
                    getView().setViewport(new Rectangle2D(898, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 46 * frameDelay && getFrame() < 47 * frameDelay){
                    getView().setViewport(new Rectangle2D(1347, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 47 * frameDelay && getFrame() < 48 * frameDelay){
                    getView().setViewport(new Rectangle2D(1796, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 48 * frameDelay && getFrame() < 49 * frameDelay){
                    getView().setViewport(new Rectangle2D(2245, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 49 * frameDelay && getFrame() < 50 * frameDelay){
                    getView().setViewport(new Rectangle2D(2694, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 50 * frameDelay && getFrame() < 51 * frameDelay){
                    getView().setViewport(new Rectangle2D(3143, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 51 * frameDelay && getFrame() < 52 * frameDelay){
                    getView().setViewport(new Rectangle2D(3592, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 52 * frameDelay && getFrame() < 53 * frameDelay){
                    getView().setViewport(new Rectangle2D(4041, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 53 * frameDelay && getFrame() < 54 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                if (getFrame() >= 54 * frameDelay){
                    getView().setViewport(new Rectangle2D(4490, 1893, 439, 435));
                    setXOffset(0);
                    setYOffset(-6);
                }
                break;
            case 10:
                //Bf is dead
                setFrameWidth(439);
                setFrameHeight(439);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(0, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(449, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 3 && getFrame() < 5 * frameDelay){
                    getView().setViewport(new Rectangle2D(898, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 5 && getFrame() < 7 * frameDelay){
                    getView().setViewport(new Rectangle2D(1347, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 7 && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(1796, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 8 && getFrame() < 17 * frameDelay){
                    getView().setViewport(new Rectangle2D(2245, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 17 && getFrame() < 18 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 18 && getFrame() < 20 * frameDelay){
                    getView().setViewport(new Rectangle2D(449, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 20 && getFrame() < 22 * frameDelay){
                    getView().setViewport(new Rectangle2D(898, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 22 && getFrame() < 24 * frameDelay){
                    getView().setViewport(new Rectangle2D(1347, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 24 && getFrame() < 30 * frameDelay){
                    getView().setViewport(new Rectangle2D(2245, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 30 && getFrame() < 31 * frameDelay){
                    getView().setViewport(new Rectangle2D(1796, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= frameDelay * 31){
                    getView().setViewport(new Rectangle2D(2245, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 11:
                //Dead confirm retry
                setFrameWidth(439);
                setFrameHeight(503);
                if (getFrame() >= 0 && getFrame() < frameDelay){
                    getView().setViewport(new Rectangle2D(2694, 0, 439, 435));
                    setXOffset(0);
                    setYOffset(-64);
                }
                if (getFrame() >= frameDelay && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(3143, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 3 * frameDelay){
                    getView().setViewport(new Rectangle2D(3592, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 3 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(4041, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 4 * frameDelay && getFrame() < 5 * frameDelay){
                    getView().setViewport(new Rectangle2D(4490, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 5 * frameDelay && getFrame() < 6 * frameDelay){
                    getView().setViewport(new Rectangle2D(4939, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 6 * frameDelay && getFrame() < 7 * frameDelay){
                    getView().setViewport(new Rectangle2D(5388, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 7 * frameDelay && getFrame() < 8 * frameDelay){
                    getView().setViewport(new Rectangle2D(5837, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 8 * frameDelay && getFrame() < 9 * frameDelay){
                    getView().setViewport(new Rectangle2D(6286, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 9 * frameDelay && getFrame() < 10 * frameDelay){
                    getView().setViewport(new Rectangle2D(6735, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 10 * frameDelay && getFrame() < 11 * frameDelay){
                    getView().setViewport(new Rectangle2D(7184, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 11 * frameDelay && getFrame() < 12 * frameDelay){
                    getView().setViewport(new Rectangle2D(7633, 0, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 12 * frameDelay && getFrame() < 13 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 13 * frameDelay && getFrame() < 14 * frameDelay){
                    getView().setViewport(new Rectangle2D(449, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 14 * frameDelay && getFrame() < 15 * frameDelay){
                    getView().setViewport(new Rectangle2D(898, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 15 * frameDelay && getFrame() < 16 * frameDelay){
                    getView().setViewport(new Rectangle2D(1347, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 16 * frameDelay && getFrame() < 17 * frameDelay){
                    getView().setViewport(new Rectangle2D(1796, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 17 * frameDelay && getFrame() < 18 * frameDelay){
                    getView().setViewport(new Rectangle2D(2245, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 18 * frameDelay && getFrame() < 19 * frameDelay){
                    getView().setViewport(new Rectangle2D(2694, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 19 * frameDelay && getFrame() < 20 * frameDelay){
                    getView().setViewport(new Rectangle2D(3143, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 20 * frameDelay && getFrame() < 21 * frameDelay){
                    getView().setViewport(new Rectangle2D(3592, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 21 * frameDelay && getFrame() < 22 * frameDelay){
                    getView().setViewport(new Rectangle2D(4041, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 22 * frameDelay && getFrame() < 23 * frameDelay){
                    getView().setViewport(new Rectangle2D(4490, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                if (getFrame() >= 23 * frameDelay){
                    getView().setViewport(new Rectangle2D(4939, 509, 439, 469));
                    setXOffset(0);
                    setYOffset(-30);
                }
                break;
            default:
        }
    }
}
