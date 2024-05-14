package com.example.javafxfridaynightfunkin;

import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.util.ArrayList;

public class Tutorial {
    private static final boolean[] leftPressed = {false, false};
    private static final boolean[] downPressed = {false, false};
    private static final boolean[] upPressed = {false, false};
    private static final boolean[] rightPressed = {false, false};
    private static Note[][] BFChart;
    private static Note[][] OpponentChart;
    private static int frameCounter = 0;
    private static final double noteSpeed = 1;
    private static int score;
    private static int misses;
    private static int health;
    private static long previousL;
    private static boolean enterPressed;
    private static boolean escPressed;
    private static int page;
    private static int choice;

    public static Scene getCreatedScene(boolean freePlay){
        //Frame rate tracker
        long[] totalLs = new long[180];

        //Charts
        BFChart = Charts.getTutorialBFChart();
        OpponentChart = Charts.getTutorialGFChart();

        //Sound effects
        MediaPlayer retrySound = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Music/Gameover/gameOverEnd.mp3"));
        MediaPlayer gameOverBGM = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Music/Gameover/gameOver.mp3"));
        MediaPlayer deathSound = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Noise/fnf_loss_sfx.mp3"));

        //Temp
        ArrayList<TimedImage> judgement = new ArrayList<>();

        //Reset static variables
        leftPressed[0] = false;
        leftPressed[1] = false;
        downPressed[0] = false;
        downPressed[1] = false;
        upPressed[0] = false;
        upPressed[1] = false;
        rightPressed[0] = false;
        rightPressed[1] = false;
        frameCounter = 0;
        score = 0;
        health = 352;
        misses = 0;
        previousL = 0;
        enterPressed = false;
        escPressed = false;
        page = 0;
        choice = 0;

        //Camera
        int[] cameraPos = {800, 400};

        //Characters
        BFAnimated BF = new BFAnimated(0);
        GFAnimated Opponent = new GFAnimated(0);

        //ImageViews
        ImageView stageBack = new ImageView(new Image(Main.class.getResource("") + "Images/Background/stageback.png"));
        ImageView stageCurtains = new ImageView(new Image(Main.class.getResource("") + "Images/Background/stagecurtains.png"));
        ImageView stageFront = new ImageView(new Image(Main.class.getResource("") + "Images/Background/stagefront.png"));
        ImageView staticLeft = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticDown = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticUp = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticRight = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticLeftOp = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticDownOp = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticUpOp = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));
        ImageView staticRightOp = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png"));

        //Health Bar
        ImageView healthBar = new ImageView(new Image(Main.class.getResource("") + "Images/User Interface/healthBar.png"));
        Rectangle healthy = new Rectangle(345, 625, 590, 10);
        Rectangle damage = new Rectangle(345, 625, 590, 10);
        healthBar.setX(340);
        healthBar.setY(620);
        healthy.setFill(Color.LIMEGREEN);
        damage.setFill(Color.RED);
        ImageView iconBF = new ImageView(new Image(Main.class.getResource("") + "Images/Icons/icon-bf.png"));
        ImageView iconOpponent = new ImageView(new Image(Main.class.getResource("") + "Images/Icons/icon-gf.png"));
        iconBF.setScaleX(-1);
        iconBF.setY(545);
        iconOpponent.setY(545);

        staticLeft.setX(1280 - 624 * 2d / 3d - 50);
        staticDown.setX(1280 - 469 * 2d / 3d - 50);
        staticUp.setX(1280 - 312 * 2d / 3d - 50);
        staticRight.setX(1280 - 155 * 2d / 3d - 50);
        staticLeftOp.setX(50);
        staticDownOp.setX(155 * 2d /3d + 50);
        staticUpOp.setX(312 * 2d / 3d + 50);
        staticRightOp.setX(469 * 2d / 3d + 50);

        staticLeft.setY(50);
        staticDown.setY(50);
        staticUp.setY(50);
        staticRight.setY(50);
        staticLeftOp.setY(50);
        staticDownOp.setY(50);
        staticUpOp.setY(50);
        staticRightOp.setY(50);

        staticLeft.setViewport(new Rectangle2D(488, 238, 155, 158));
        staticDown.setViewport(new Rectangle2D(647, 238, 157, 155));
        staticUp.setViewport(new Rectangle2D(323, 240, 157, 154));
        staticRight.setViewport(new Rectangle2D(808, 238, 155, 157));
        staticLeftOp.setViewport(new Rectangle2D(488, 238, 155, 158));
        staticDownOp.setViewport(new Rectangle2D(647, 238, 157, 155));
        staticUpOp.setViewport(new Rectangle2D(323, 240, 157, 154));
        staticRightOp.setViewport(new Rectangle2D(808, 238, 155, 157));

        staticLeft.setFitWidth(155 * 2d / 3d);
        staticDown.setFitWidth(157 * 2d / 3d);
        staticUp.setFitWidth(157 * 2d / 3d);
        staticRight.setFitWidth(155 * 2d / 3d);
        staticLeftOp.setFitWidth(155 * 2d / 3d);
        staticDownOp.setFitWidth(157 * 2d / 3d);
        staticUpOp.setFitWidth(157 * 2d / 3d);
        staticRightOp.setFitWidth(155 * 2d / 3d);

        staticLeft.setPreserveRatio(true);
        staticDown.setPreserveRatio(true);
        staticUp.setPreserveRatio(true);
        staticRight.setPreserveRatio(true);
        staticLeftOp.setPreserveRatio(true);
        staticDownOp.setPreserveRatio(true);
        staticUpOp.setPreserveRatio(true);
        staticRightOp.setPreserveRatio(true);

        staticLeft.setSmooth(true);
        staticDown.setSmooth(true);
        staticUp.setSmooth(true);
        staticRight.setSmooth(true);
        staticLeftOp.setSmooth(true);
        staticDownOp.setSmooth(true);
        staticUpOp.setSmooth(true);
        staticRightOp.setSmooth(true);

        //Text
        Label infoText = new Label("Score: " + score + " | Misses: " + misses);
        infoText.setTextFill(Color.WHITE);
        infoText.setLayoutX(500);
        infoText.setLayoutY(660);
        infoText.setFont(Font.loadFont(Main.class.getResource("") + "Fonts/Baefont_normal-Regular_V1.ttf", 24));

        Label FPS = new Label("FPS: " + 0);
        FPS.setTextFill(Color.WHITE);

        //Media player
        MediaPlayer song = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Music/Tutorial/Inst.mp3"));
        MediaPlayer voiceBF = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Music/Tutorial/Voices-bf.mp3"));
        MediaPlayer voiceOpponent = new MediaPlayer(new Media(Main.class.getResource("") + "Sounds/Music/Tutorial/Voices-GF.mp3"));

        ImageView gameOverScreen = new ImageView(new Image(Main.class.getResource("") + "Images/Background/Gameover Screen v2.png"));
        gameOverScreen.setVisible(false);

        //Pause Menu
        Rectangle pauseScreen = new Rectangle(1280, 720, Color.GRAY);
        pauseScreen.setOpacity(0.5);
        pauseScreen.setVisible(false);
        Label[] pauseMenu = new Label[3];
        pauseMenu[0] = new Label("Resume");
        pauseMenu[0].setFont(Font.loadFont(Main.class.getResource("") + "Fonts/Baefont_normal-Regular_V1.ttf", 100));
        pauseMenu[1] = new Label("Restart Song");
        pauseMenu[1].setFont(Font.loadFont(Main.class.getResource("") + "Fonts/Baefont_normal-Regular_V1.ttf", 100));
        pauseMenu[2] = new Label("Exit to Menu");
        pauseMenu[2].setFont(Font.loadFont(Main.class.getResource("") + "Fonts/Baefont_normal-Regular_V1.ttf", 100));

        //Root
        Group root = new Group();
        root.getChildren().add(stageBack);
        root.getChildren().add(stageFront);
        root.getChildren().add(stageCurtains);
        root.getChildren().add(Opponent.getView());
        root.getChildren().add(BF.getView());
        root.getChildren().add(staticLeft);
        root.getChildren().add(staticDown);
        root.getChildren().add(staticUp);
        root.getChildren().add(staticRight);
        root.getChildren().add(staticLeftOp);
        root.getChildren().add(staticDownOp);
        root.getChildren().add(staticUpOp);
        root.getChildren().add(staticRightOp);

        //Chart notes
        for (int i = 0; i < 4; i++){
            for (int e = 0; e < BFChart[i].length; e++){
                if (!BFChart[i][e].getHoldTime().equals(Duration.ZERO)){
                    root.getChildren().add(BFChart[i][e].getHold());
                }
                root.getChildren().add(BFChart[i][e].getView());
                BFChart[i][e].getView().setFitWidth(BFChart[i][e].getView().getViewport().getWidth() * 2d / 3d);
                BFChart[i][e].getView().setPreserveRatio(true);
                BFChart[i][e].getView().setSmooth(true);
                switch (i){
                    case 0:
                        BFChart[i][e].getView().setX(staticLeft.getX());
                        break;
                    case 1:
                        BFChart[i][e].getView().setX(staticDown.getX());
                        break;
                    case 2:
                        BFChart[i][e].getView().setX(staticUp.getX());
                        break;
                    case 3:
                        BFChart[i][e].getView().setX(staticRight.getX());
                        break;
                    default:
                }
                BFChart[i][e].getHold().setX(BFChart[i][e].getView().getX() + 35);
                BFChart[i][e].getHold().setFitHeight(BFChart[i][e].getHoldTime().toMillis() * noteSpeed / 2d);
            }
            for (int e = 0; e < OpponentChart[i].length; e++){
                if (!OpponentChart[i][e].getHoldTime().equals(Duration.ZERO)){
                    root.getChildren().add(OpponentChart[i][e].getHold());
                    OpponentChart[i][e].getHold().setFitHeight(OpponentChart[i][e].getHoldTime().toMillis() * noteSpeed / 2d);
                }
                root.getChildren().add(OpponentChart[i][e].getView());
                OpponentChart[i][e].getView().setFitWidth(BFChart[i][e].getView().getViewport().getWidth() * 2d / 3d);
                OpponentChart[i][e].getView().setPreserveRatio(true);
                OpponentChart[i][e].getView().setSmooth(true);
                switch (i){
                    case 0:
                        OpponentChart[i][e].getView().setX(staticLeftOp.getX());
                        break;
                    case 1:
                        OpponentChart[i][e].getView().setX(staticDownOp.getX());
                        break;
                    case 2:
                        OpponentChart[i][e].getView().setX(staticUpOp.getX());
                        break;
                    case 3:
                        OpponentChart[i][e].getView().setX(staticRightOp.getX());
                        break;
                    default:
                }
                OpponentChart[i][e].getHold().setX(OpponentChart[i][e].getView().getX() + 35);
                OpponentChart[i][e].getHold().setFitHeight(OpponentChart[i][e].getHoldTime().toMillis() * noteSpeed / 2d);
            }
        }

        //UI to root
        root.getChildren().add(healthBar);
        root.getChildren().add(healthy);
        root.getChildren().add(damage);
        root.getChildren().add(iconBF);
        root.getChildren().add(iconOpponent);
        root.getChildren().add(infoText);
        root.getChildren().add(FPS);

        //Scene
        Scene scene = new Scene(root);

        //Method calls
        BF.updateViewport();
        Opponent.updateViewport();

        //Adding pause and gameover to root
        root.getChildren().add(pauseScreen);
        for (int i = 0; i < pauseMenu.length; i++){
            root.getChildren().add(pauseMenu[i]);
            pauseMenu[i].setLayoutY(100 + 100 * i);
            pauseMenu[i].setVisible(false);
            if (i == choice){
                pauseMenu[i].setTextFill(Color.BLACK);
            } else {
                pauseMenu[i].setTextFill(Color.WHITE);
            }
        }
        root.getChildren().add(gameOverScreen);

        for (int i = 0; i < root.getChildren().size(); i++){
            root.getChildren().get(i).setCache(true);
        }

        //AnimationTimer
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                //Variables
                frameCounter++;

                //Update what frame the animations are on
                BF.nextFrame(leftPressed[1], downPressed[1], upPressed[1], rightPressed[1], frameCounter);
                Opponent.nextFrame(leftPressed[0], downPressed[0], upPressed[0], rightPressed[0], frameCounter);

                leftPressed[0] = false;
                downPressed[0] = false;
                upPressed[0] = false;
                rightPressed[0] = false;

                //Updating animations
                BF.updateViewport();
                Opponent.updateViewport();

                //Update temp images
                for (int i = 0; i < judgement.size(); i++){
                    judgement.get(i).setFrame(judgement.get(i).getFrame() + 1);
                    judgement.get(i).getImageView().setY(judgement.get(i).getImageView().getY() - 1);
                    if (judgement.get(i).getFrame() > 60){
                        root.getChildren().remove(judgement.get(i).getImageView());
                        judgement.remove(judgement.get(i));
                    }
                }

                //Note checks
                for (int i = 0; i < 4; i++){
                    for (int e = 0; e < BFChart[i].length; e++){
                        //Set the new position depending on how long into the song we are
                        BFChart[i][e].getView().setY((BFChart[i][e].getTimestamp().toMillis() - song.getCurrentTime().toMillis()) * noteSpeed / 2d + 50);
                        //Hold Notes
                        if (!BFChart[i][e].getHoldTime().equals(Duration.ZERO)){
                            if (BFChart[i][e].getStatus() == 1 || BFChart[i][e].getStatus() == 0){
                                BFChart[i][e].getHold().setY(BFChart[i][e].getView().getY() + 50);
                                BFChart[i][e].getHold().setFitHeight(BFChart[i][e].getHoldTime().toMillis() * noteSpeed / 2d);
                            } else {
                                BFChart[i][e].getHold().setY(100);
                                BFChart[i][e].getHold().setFitHeight((BFChart[i][e].getTimestamp().toMillis() + BFChart[i][e].getHoldTime().toMillis() - song.getCurrentTime().toMillis()) * noteSpeed / 2d);
                            }
                        }
                        //Hold note is over party
                        if (BFChart[i][e].getStatus() == 3 && BFChart[i][e].getTimestamp().toMillis() + BFChart[i][e].getHoldTime().toMillis() - song.getCurrentTime().toMillis() < 0){
                            BFChart[i][e].setStatus(2);
                            score += 140;
                            health -= 32;
                            BFChart[i][e].getHold().setVisible(false);
                            judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/sick.png")));
                            root.getChildren().add(judgement.getLast().getImageView());
                            judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                            judgement.getLast().getImageView().setX(700);
                            judgement.getLast().getImageView().setY(300);
                            judgement.getLast().getImageView().setPreserveRatio(true);
                            judgement.getLast().getImageView().setCache(true);
                            judgement.getLast().getImageView().setSmooth(true);
                        }
                        //Miss
                        if (BFChart[i][e].getStatus() == 0 && BFChart[i][e].getTimestamp().toMillis() - song.getCurrentTime().toMillis() < -140){
                            BFChart[i][e].getView().setOpacity(0.5);
                            BFChart[i][e].setStatus(1);
                            //Hold Notes
                            if (!BFChart[i][e].getHoldTime().equals(Duration.ZERO)){
                                health += 32;
                                score -= 140;
                                misses++;
                                BFChart[i][e].getHold().setOpacity(0.5);
                            }
                            health += 32;
                            BF.setFrame(0);
                            voiceBF.setMute(true);
                            score -= 140;
                            misses++;
                            switch (i){
                                case 0:
                                    BF.setAnimation(5);
                                    break;
                                case 1:
                                    BF.setAnimation(6);
                                    break;
                                case 2:
                                    BF.setAnimation(7);
                                    break;
                                case 3:
                                    BF.setAnimation(8);
                                    break;
                                default:
                            }
                        }
                    }
                }
                for (int i = 0; i < 4; i++){
                    for (int e = 0; e < OpponentChart[i].length; e++){
                        OpponentChart[i][e].getView().setY((OpponentChart[i][e].getTimestamp().toMillis() - song.getCurrentTime().toMillis()) * noteSpeed / 2d + 50);
                        if (!OpponentChart[i][e].getHoldTime().equals(Duration.ZERO)){
                            OpponentChart[i][e].getHold().setY(OpponentChart[i][e].getView().getY() + 50);
                        }
                        //How the opponent hits notes
                        if (OpponentChart[i][e].getStatus() == 0 && OpponentChart[i][e].getTimestamp().toMillis() - song.getCurrentTime().toMillis() < 0){
                            OpponentChart[i][e].getView().setVisible(false);
                            if (OpponentChart[i][e].getHoldTime().equals(Duration.ZERO)){
                                OpponentChart[i][e].setStatus(2);
                            } else {
                                OpponentChart[i][e].setStatus(3);
                            }
                            Opponent.setFrame(0);
                            voiceOpponent.setMute(false);
                            switch (i){
                                case 0:
                                    Opponent.setAnimation(1);
                                    break;
                                case 1:
                                    Opponent.setAnimation(2);
                                    break;
                                case 2:
                                    Opponent.setAnimation(3);
                                    break;
                                case 3:
                                    Opponent.setAnimation(4);
                                    break;
                                default:
                            }
                        }
                        if (OpponentChart[i][e].getStatus() == 3 && OpponentChart[i][e].getTimestamp().toMillis() + OpponentChart[i][e].getHoldTime().toMillis() - song.getCurrentTime().toMillis() >= 0){
                            OpponentChart[i][e].getHold().setY(100);
                            OpponentChart[i][e].getHold().setFitHeight((OpponentChart[i][e].getTimestamp().toMillis() + OpponentChart[i][e].getHoldTime().toMillis() - song.getCurrentTime().toMillis()) * noteSpeed / 2d);
                            switch (i){
                                case 0:
                                    leftPressed[0] = true;
                                    break;
                                case 1:
                                    downPressed[0] = true;
                                    break;
                                case 2:
                                    upPressed[0] = true;
                                    break;
                                case 3:
                                    rightPressed[0] = true;
                                    break;
                                default:
                            }
                            voiceOpponent.setMute(false);
                        }
                        if (OpponentChart[i][e].getStatus() == 3 && OpponentChart[i][e].getTimestamp().toMillis() + OpponentChart[i][e].getHoldTime().toMillis() - song.getCurrentTime().toMillis() < 0){
                            OpponentChart[i][e].getHold().setVisible(false);
                            OpponentChart[i][e].setStatus(2);
                        }
                    }
                }

                //Visual for pressed buttons
                if (leftPressed[1]){
                    staticLeft.setViewport(new Rectangle2D(1898, 150, 146, 149));
                } else {
                    staticLeft.setViewport(new Rectangle2D(488, 238, 155, 158));
                }
                if (downPressed[1]){
                    staticDown.setViewport(new Rectangle2D(1898, 0, 150, 146));
                } else {
                    staticDown.setViewport(new Rectangle2D(647, 238, 157, 155));
                }
                if (upPressed[1]){
                    staticUp.setViewport(new Rectangle2D(158, 398, 154, 151));
                } else {
                    staticUp.setViewport(new Rectangle2D(323, 240, 157, 154));
                }
                if (rightPressed[1]){
                    staticRight.setViewport(new Rectangle2D(316, 398, 149, 152));
                } else {
                    staticRight.setViewport(new Rectangle2D(808, 238, 155, 157));
                }

                //Health update
                if (health > 704){
                    health = 704;
                }
                if (health < 0){
                    health = 0;
                }
                if (health > 576) {
                    iconBF.setViewport(new Rectangle2D(150, 0, 150, 150));
                } else {
                    iconBF.setViewport(new Rectangle2D(0, 0, 150, 150));
                }
                if (health < 128) {
                    iconOpponent.setViewport(new Rectangle2D(150, 0, 150, 150));
                } else {
                    iconOpponent.setViewport(new Rectangle2D(0, 0, 150, 150));
                }
                damage.setWidth(590 / 704d * health);
                iconBF.setX(damage.getX() + damage.getWidth() - 25);
                iconOpponent.setX(damage.getX() + damage.getWidth() - 150 + 25);

                //Frame thing
                totalLs[frameCounter % 180] = l - previousL;

                if(frameCounter > 179 && frameCounter % 30 == 0){
                    long sumOfLs = 0;
                    for (int i = 0; i < 180; i++) {
                        sumOfLs += totalLs[i];
                    }
                    FPS.setText("FPS: " + (int) (180 / (sumOfLs / 1000000000d)));
                }

                //Update score labels
                infoText.setText("Score: " + score + " / Misses: " + misses);

                //Positions
                stageBack.setX(-cameraPos[0]);
                stageBack.setY(-cameraPos[1]);
                stageFront.setX(-cameraPos[0]);
                stageFront.setY(819 - cameraPos[1]);
                stageCurtains.setX(-cameraPos[0]);
                stageCurtains.setY(-cameraPos[1]);
                BF.getView().setX(1850 - cameraPos[0] - BF.getFrameWidth() - BF.getXOffset());
                BF.getView().setY(1089 - cameraPos[1] - BF.getFrameHeight() - BF.getYOffset());
                Opponent.getView().setX(1700 - cameraPos[0] - Opponent.getFrameWidth() - Opponent.getXOffset());
                Opponent.getView().setY(989 - cameraPos[1] - Opponent.getFrameHeight() - Opponent.getYOffset());

                previousL = l;

                //GameOver
                if (health >= 704){
                    song.stop();
                    voiceBF.stop();
                    voiceOpponent.stop();
                    deathSound.play();
                    page = 2;
                    choice = 0;
                    BF.getView().setViewOrder(-1);
                    BF.setDefaultAnimation(10);
                    BF.setAnimation(9);
                    BF.setFrame(0);
                    health = 0;
                    gameOverScreen.setVisible(true);
                }
            }
        };
        timer.start();

        //MediaPLayer start
        song.play();
        voiceBF.play();
        voiceOpponent.play();
        song.setOnEndOfMedia(() -> {
            timer.stop();
            if (!freePlay) {
                Main.getStage().setScene(MainMenu.getCreatedScene(1));
            } else {
                Main.getStage().setScene(MainMenu.getCreatedScene(2));
            }
        });

        retrySound.setOnEndOfMedia(() -> {
            timer.stop();
            Main.getStage().setScene(getCreatedScene(freePlay));
        });

        deathSound.setOnEndOfMedia(() -> {
            gameOverBGM.play();
            gameOverBGM.setCycleCount(MediaPlayer.INDEFINITE);
        });

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                if (page == 0 && !leftPressed[1]){
                    leftPressed[1] = true;
                    boolean noteHit = false;
                    for (int i = 0; i < BFChart[0].length; i++){
                        double noteScore = Math.abs(BFChart[0][i].getTimestamp().toMillis() - song.getCurrentTime().toMillis());
                        if (BFChart[0][i].getStatus() == 0 && noteScore < 140){
                            if (BFChart[0][i].getHoldTime().equals(Duration.ZERO)){
                                BFChart[0][i].setStatus(2);
                            } else {
                                BFChart[0][i].setStatus(3);
                                BFChart[0][i].getHold().setY(100);
                            }
                            score += 140 - ((int) noteScore);
                            BFChart[0][i].getView().setVisible(false);
                            noteHit = true;
                            BF.setAnimation(1);
                            BF.setFrame(0);
                            voiceBF.setMute(false);
                            if ((int) noteScore <= 20){
                                health -= 32;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/sick.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else if ((int) noteScore <= 60) {
                                health -= 24;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/good.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else if ((int) noteScore <= 100) {
                                health -= 16;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/bad.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else {
                                health -= 8;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/shit.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            }
                            break;
                        }
                    }
                    if (!noteHit){
                        health += 16;
                        BF.setAnimation(5);
                        BF.setFrame(0);
                        voiceBF.setMute(true);
                        score -= 70;
                    }
                }
            }
            if (e.getCode() == KeyCode.DOWN) {
                if (!downPressed[1]){
                    downPressed[1] = true;
                    switch (page){
                        case 0:
                            boolean noteHit = false;
                            for (int i = 0; i < BFChart[1].length; i++){
                                double noteScore = Math.abs(BFChart[1][i].getTimestamp().toMillis() - song.getCurrentTime().toMillis());
                                if (BFChart[1][i].getStatus() == 0 && noteScore < 140){
                                    if (BFChart[1][i].getHoldTime().equals(Duration.ZERO)){
                                        BFChart[1][i].setStatus(2);
                                    } else {
                                        BFChart[1][i].setStatus(3);
                                        BFChart[1][i].getHold().setY(100);
                                    }
                                    score += 140 - ((int) noteScore);
                                    BFChart[1][i].getView().setVisible(false);
                                    noteHit = true;
                                    BF.setAnimation(2);
                                    BF.setFrame(0);
                                    voiceBF.setMute(false);
                                    if ((int) noteScore <= 20){
                                        health -= 32;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/sick.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else if ((int) noteScore <= 60) {
                                        health -= 24;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/good.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else if ((int) noteScore <= 100) {
                                        health -= 16;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/bad.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else {
                                        health -= 8;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/shit.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    }
                                    break;
                                }
                            }
                            if (!noteHit){
                                health += 16;
                                BF.setAnimation(6);
                                BF.setFrame(0);
                                voiceBF.setMute(true);
                                score -= 70;
                            }
                            break;
                        case 1:
                            if (choice == 2){
                                choice = 0;
                            } else {
                                choice++;
                            }
                            for (int i = 0; i < pauseMenu.length; i++){
                                if (i == choice){
                                    pauseMenu[i].setTextFill(Color.BLACK);
                                } else {
                                    pauseMenu[i].setTextFill(Color.WHITE);
                                }
                            }
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.UP) {
                if (!upPressed[1]){
                    upPressed[1] = true;
                    switch (page){
                        case 0:
                            boolean noteHit = false;
                            for (int i = 0; i < BFChart[2].length; i++){
                                double noteScore = Math.abs(BFChart[2][i].getTimestamp().toMillis() - song.getCurrentTime().toMillis());
                                if (BFChart[2][i].getStatus() == 0 && noteScore < 140){
                                    if (BFChart[2][i].getHoldTime().equals(Duration.ZERO)){
                                        BFChart[2][i].setStatus(2);
                                    } else {
                                        BFChart[2][i].setStatus(3);
                                        BFChart[2][i].getHold().setY(100);
                                    }
                                    score += 140 - ((int) noteScore);
                                    BFChart[2][i].getView().setVisible(false);
                                    noteHit = true;
                                    BF.setAnimation(3);
                                    BF.setFrame(0);
                                    voiceBF.setMute(false);
                                    if ((int) noteScore <= 20){
                                        health -= 32;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/sick.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else if ((int) noteScore <= 60) {
                                        health -= 24;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/good.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else if ((int) noteScore <= 100) {
                                        health -= 16;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/bad.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    } else {
                                        health -= 8;
                                        judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/shit.png")));
                                        root.getChildren().add(judgement.getLast().getImageView());
                                        judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                        judgement.getLast().getImageView().setX(700);
                                        judgement.getLast().getImageView().setY(300);
                                        judgement.getLast().getImageView().setPreserveRatio(true);
                                        judgement.getLast().getImageView().setCache(true);
                                        judgement.getLast().getImageView().setSmooth(true);
                                    }
                                    break;
                                }
                            }
                            if (!noteHit){
                                health += 16;
                                BF.setAnimation(7);
                                BF.setFrame(0);
                                voiceBF.setMute(true);
                                score -= 70;
                            }
                            break;
                        case 1:
                            if (choice == 0){
                                choice = 2;
                            } else {
                                choice--;
                            }
                            for (int i = 0; i < pauseMenu.length; i++){
                                if (i == choice){
                                    pauseMenu[i].setTextFill(Color.BLACK);
                                } else {
                                    pauseMenu[i].setTextFill(Color.WHITE);
                                }
                            }
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.RIGHT) {
                if (page == 0 && !rightPressed[1]){
                    rightPressed[1] = true;
                    boolean noteHit = false;
                    for (int i = 0; i < BFChart[3].length; i++){
                        double noteScore = Math.abs(BFChart[3][i].getTimestamp().toMillis() - song.getCurrentTime().toMillis());
                        if (BFChart[3][i].getStatus() == 0 && noteScore < 140){
                            if (BFChart[3][i].getHoldTime().equals(Duration.ZERO)){
                                BFChart[3][i].setStatus(2);
                            } else {
                                BFChart[3][i].setStatus(3);
                                BFChart[3][i].getHold().setY(100);
                            }
                            score += 140 - ((int) noteScore);
                            BFChart[3][i].getView().setVisible(false);
                            noteHit = true;
                            BF.setAnimation(4);
                            BF.setFrame(0);
                            voiceBF.setMute(false);
                            if ((int) noteScore <= 20){
                                health -= 32;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/sick.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else if ((int) noteScore <= 60) {
                                health -= 24;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/good.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else if ((int) noteScore <= 100) {
                                health -= 16;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/bad.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            } else {
                                health -= 8;
                                judgement.add(new TimedImage(new Image(Main.class.getResource("") + "Images/User Interface/shit.png")));
                                root.getChildren().add(judgement.getLast().getImageView());
                                judgement.getLast().getImageView().setFitWidth(judgement.getLast().getImage().getWidth() * 2d / 3d);
                                judgement.getLast().getImageView().setX(700);
                                judgement.getLast().getImageView().setY(300);
                                judgement.getLast().getImageView().setPreserveRatio(true);
                                judgement.getLast().getImageView().setCache(true);
                                judgement.getLast().getImageView().setSmooth(true);
                            }
                            break;
                        }
                    }
                    if (!noteHit){
                        health += 16;
                        BF.setAnimation(8);
                        BF.setFrame(0);
                        voiceBF.setMute(true);
                        score -= 70;
                    }
                }
            }
            if (e.getCode() == KeyCode.ENTER){
                if (!enterPressed) {
                    enterPressed = true;
                    switch (page){
                        case 0:
                            page = 1;
                            choice = 0;
                            timer.stop();
                            song.pause();
                            voiceBF.pause();
                            voiceOpponent.pause();
                            for (int i = 0; i < pauseMenu.length; i++){
                                pauseMenu[i].setVisible(true);
                                pauseScreen.setVisible(true);
                                if (i == choice){
                                    pauseMenu[i].setTextFill(Color.BLACK);
                                } else {
                                    pauseMenu[i].setTextFill(Color.WHITE);
                                }
                            }
                            break;
                        case 1:
                            switch (choice){
                                case 0:
                                    page = 0;
                                    song.play();
                                    voiceBF.play();
                                    voiceOpponent.play();
                                    timer.start();
                                    pauseMenu[0].setVisible(false);
                                    pauseMenu[1].setVisible(false);
                                    pauseMenu[2].setVisible(false);
                                    pauseScreen.setVisible(false);
                                    break;
                                case 1:
                                    Main.getStage().setScene(Tutorial.getCreatedScene(freePlay));
                                    break;
                                case 2:
                                    if (freePlay){
                                        Main.getStage().setScene(MainMenu.getCreatedScene(2));
                                    } else {
                                        Main.getStage().setScene(MainMenu.getCreatedScene(1));
                                    }
                                    break;
                                default:
                            }
                            break;
                        case 2:
                            deathSound.stop();
                            gameOverBGM.stop();
                            retrySound.play();
                            BF.setAnimation(11);
                            BF.setFrame(0);
                            page = 3;
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.ESCAPE){
                if (!escPressed) {
                    escPressed = true;
                    switch (page){
                        case 0:
                            page = 1;
                            choice = 0;
                            timer.stop();
                            song.pause();
                            voiceBF.pause();
                            voiceOpponent.pause();
                            for (int i = 0; i < pauseMenu.length; i++){
                                pauseMenu[i].setVisible(true);
                                pauseScreen.setVisible(true);
                                if (i == choice){
                                    pauseMenu[i].setTextFill(Color.BLACK);
                                } else {
                                    pauseMenu[i].setTextFill(Color.WHITE);
                                }
                            }
                            break;
                        case 1:
                            page = 0;
                            choice = 0;
                            song.play();
                            voiceBF.play();
                            voiceOpponent.play();
                            timer.start();
                            pauseMenu[0].setVisible(false);
                            pauseMenu[1].setVisible(false);
                            pauseMenu[2].setVisible(false);
                            pauseScreen.setVisible(false);
                            break;
                        case 2:
                            timer.stop();
                            deathSound.stop();
                            gameOverBGM.stop();
                            if (freePlay){
                                Main.getStage().setScene(MainMenu.getCreatedScene(2));
                            } else {
                                Main.getStage().setScene(MainMenu.getCreatedScene(1));
                            }
                            break;
                        default:
                    }
                }
            }
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                leftPressed[1] = false;
                //Check if released too early for hold
                if (page == 0){
                    for (int i = 0; i < BFChart[0].length; i++){
                        if (BFChart[0][i].getStatus() == 3 && BFChart[0][i].getTimestamp().toMillis() + BFChart[0][i].getHoldTime().toMillis() - song.getCurrentTime().toMillis() >= 140){
                            BFChart[0][i].setStatus(1);
                            BFChart[0][i].getHold().setOpacity(0.5);
                            health += 16;
                            voiceBF.setMute(true);
                            BF.setAnimation(5);
                            BF.setFrame(0);
                            score -= 70;
                            misses++;
                            break;
                        }
                    }
                }
            }
            if (e.getCode() == KeyCode.DOWN) {
                downPressed[1] = false;
                //Check if released too early for hold
                if (page == 0){
                    for (int i = 0; i < BFChart[1].length; i++){
                        if (BFChart[1][i].getStatus() == 3 && BFChart[1][i].getTimestamp().toMillis() + BFChart[1][i].getHoldTime().toMillis() - song.getCurrentTime().toMillis() >= 140){
                            BFChart[1][i].setStatus(1);
                            BFChart[1][i].getHold().setOpacity(0.5);
                            health += 16;
                            voiceBF.setMute(true);
                            BF.setAnimation(6);
                            BF.setFrame(0);
                            score -= 70;
                            misses++;
                            break;
                        }
                    }
                }
            }
            if (e.getCode() == KeyCode.UP) {
                upPressed[1] = false;
                if (page == 0){
                    for (int i = 0; i < BFChart[2].length; i++){
                        if (BFChart[2][i].getStatus() == 3 && BFChart[2][i].getTimestamp().toMillis() + BFChart[2][i].getHoldTime().toMillis() - song.getCurrentTime().toMillis() >= 140){
                            BFChart[2][i].setStatus(1);
                            BFChart[2][i].getHold().setOpacity(0.5);
                            health += 16;
                            voiceBF.setMute(true);
                            BF.setAnimation(7);
                            BF.setFrame(0);
                            score -= 70;
                            misses++;
                            break;
                        }
                    }
                }
            }
            if (e.getCode() == KeyCode.RIGHT) {
                rightPressed[1] = false;
                if (page == 0){
                    for (int i = 0; i < BFChart[3].length; i++){
                        if (BFChart[3][i].getStatus() == 3 && BFChart[3][i].getTimestamp().toMillis() + BFChart[3][i].getHoldTime().toMillis() - song.getCurrentTime().toMillis() >= 140){
                            BFChart[3][i].setStatus(1);
                            BFChart[3][i].getHold().setOpacity(0.5);
                            health += 16;
                            voiceBF.setMute(true);
                            BF.setAnimation(8);
                            BF.setFrame(0);
                            score -= 70;
                            misses++;
                            break;
                        }
                    }
                }
            }
            if (e.getCode() == KeyCode.ENTER){
                enterPressed = false;
            }
            if (e.getCode() == KeyCode.ESCAPE){
                escPressed = false;
            }
        });

        //Return
        return scene;
    }
}
