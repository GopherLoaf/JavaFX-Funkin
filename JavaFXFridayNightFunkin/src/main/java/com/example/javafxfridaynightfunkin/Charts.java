package com.example.javafxfridaynightfunkin;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Charts {
    private static final Image defaultNoteSkin = new Image(Main.class.getResource("") + "Images/User Interface/notes.png");
    private static final Image defaultNoteSkinHold = new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png");

    public static Note[][] getTutorialBFChart(){
        Note[] leftNotes = {
                new Note(14400, new ImageView(defaultNoteSkin)),
                new Note(16800, new ImageView(defaultNoteSkin)),
                new Note(33600, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(56400, new ImageView(defaultNoteSkin)),
                new Note(62400, new ImageView(defaultNoteSkin)),
                new Note(63300, new ImageView(defaultNoteSkin)),
                new Note(64650, new ImageView(defaultNoteSkin))
        };
        Note[] downNotes = {
                new Note(25200, new ImageView(defaultNoteSkin)),
                new Note(27600, new ImageView(defaultNoteSkin)),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(43200, new ImageView(defaultNoteSkin)),
                new Note(43800, new ImageView(defaultNoteSkin)),
                new Note(45600, new ImageView(defaultNoteSkin)),
                new Note(46200, new ImageView(defaultNoteSkin)),
                new Note(50400, new ImageView(defaultNoteSkin)),
                new Note(53400, new ImageView(defaultNoteSkin)),
                new Note(54600, new ImageView(defaultNoteSkin)),
                new Note(57600, new ImageView(defaultNoteSkin), 750),
                new Note(62550, new ImageView(defaultNoteSkin)),
                new Note(63150, new ImageView(defaultNoteSkin)),
                new Note(63450, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(26400, new ImageView(defaultNoteSkin)),
                new Note(34800, new ImageView(defaultNoteSkin)),
                new Note(44400, new ImageView(defaultNoteSkin)),
                new Note(50700, new ImageView(defaultNoteSkin)),
                new Note(51300, new ImageView(defaultNoteSkin)),
                new Note(55200, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63600, new ImageView(defaultNoteSkin)),
                new Note(63900, new ImageView(defaultNoteSkin)),
                new Note(64200, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(15600, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin)),
                new Note(37200, new ImageView(defaultNoteSkin)),
                new Note(46800, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(52200, new ImageView(defaultNoteSkin)),
                new Note(52800, new ImageView(defaultNoteSkin)),
                new Note(55800, new ImageView(defaultNoteSkin)),
                new Note(62850, new ImageView(defaultNoteSkin)),
                new Note(63750, new ImageView(defaultNoteSkin)),
                new Note(64050, new ImageView(defaultNoteSkin)),
                new Note(64350, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getTutorialGFChart(){
        Note[] leftNotes = {
                new Note(9600, new ImageView(defaultNoteSkin)),
                new Note(12000, new ImageView(defaultNoteSkin)),
                new Note(28800, new ImageView(defaultNoteSkin))
        };
        Note[] downNotes = {
                new Note(20400, new ImageView(defaultNoteSkin)),
                new Note(22800, new ImageView(defaultNoteSkin)),
                new Note(31200, new ImageView(defaultNoteSkin)),
                new Note(38400, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin)),
                new Note(40800, new ImageView(defaultNoteSkin)),
                new Note(41400, new ImageView(defaultNoteSkin)),
                new Note(48000, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(19200, new ImageView(defaultNoteSkin)),
                new Note(21600, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(39600, new ImageView(defaultNoteSkin)),
                new Note(48300, new ImageView(defaultNoteSkin)),
                new Note(48900, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(10800, new ImageView(defaultNoteSkin)),
                new Note(13200, new ImageView(defaultNoteSkin)),
                new Note(32400, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(48600, new ImageView(defaultNoteSkin)),
                new Note(49800, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBopeeboBFChart(){
        Note[] leftNotes = {
                new Note(7800, new ImageView(defaultNoteSkin), 300),
                new Note(12900, new ImageView(defaultNoteSkin)),
                new Note(17700, new ImageView(defaultNoteSkin)),
                new Note(21600, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin), 900),
                new Note(31800, new ImageView(defaultNoteSkin), 1200),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(36975, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin), 600),
                new Note(51600, new ImageView(defaultNoteSkin), 450),
                new Note(60600, new ImageView(defaultNoteSkin),1200),
                new Note(64800, new ImageView(defaultNoteSkin)),
                new Note(65775, new ImageView(defaultNoteSkin)),
                new Note(70200, new ImageView(defaultNoteSkin)),
                new Note(74400, new ImageView(defaultNoteSkin)),
                new Note(75375, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(7200, new ImageView(defaultNoteSkin), 300),
                new Note(12000, new ImageView(defaultNoteSkin), 300),
                new Note(13200, new ImageView(defaultNoteSkin), 600),
                new Note(17100, new ImageView(defaultNoteSkin)),
                new Note(22200, new ImageView(defaultNoteSkin), 900),
                new Note(26400, new ImageView(defaultNoteSkin)),
                new Note(37200, new ImageView(defaultNoteSkin), 600),
                new Note(45600, new ImageView(defaultNoteSkin)),
                new Note(46800, new ImageView(defaultNoteSkin)),
                new Note(46950, new ImageView(defaultNoteSkin)),
                new Note(47100, new ImageView(defaultNoteSkin)),
                new Note(66000, new ImageView(defaultNoteSkin), 600),
                new Note(70800, new ImageView(defaultNoteSkin), 600),
                new Note(75600, new ImageView(defaultNoteSkin), 600)
        };
        Note[] upNotes = {
                new Note(2400, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin), 600),
                new Note(31200, new ImageView(defaultNoteSkin)),
                new Note(35700, new ImageView(defaultNoteSkin)),
                new Note(36900, new ImageView(defaultNoteSkin)),
                new Note(40800, new ImageView(defaultNoteSkin), 450),
                new Note(46200, new ImageView(defaultNoteSkin)),
                new Note(47400, new ImageView(defaultNoteSkin)),
                new Note(50400, new ImageView(defaultNoteSkin), 450),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(65700, new ImageView(defaultNoteSkin)),
                new Note(69600, new ImageView(defaultNoteSkin)),
                new Note(70500, new ImageView(defaultNoteSkin)),
                new Note(74100, new ImageView(defaultNoteSkin)),
                new Note(75300, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(3000, new ImageView(defaultNoteSkin), 600),
                new Note(3600, new ImageView(defaultNoteSkin), 600),
                new Note(8400, new ImageView(defaultNoteSkin), 600),
                new Note(12600, new ImageView(defaultNoteSkin)),
                new Note(16800, new ImageView(defaultNoteSkin)),
                new Note(21900, new ImageView(defaultNoteSkin)),
                new Note(26700, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(36300, new ImageView(defaultNoteSkin)),
                new Note(41400, new ImageView(defaultNoteSkin), 300),
                new Note(51000, new ImageView(defaultNoteSkin), 300),
                new Note(55200, new ImageView(defaultNoteSkin), 1800),
                new Note(60300, new ImageView(defaultNoteSkin)),
                new Note(65100, new ImageView(defaultNoteSkin)),
                new Note(69900, new ImageView(defaultNoteSkin)),
                new Note(74700, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBopeeboDadChart(){
        Note[] leftNotes = {
                new Note(5400, new ImageView(defaultNoteSkin), 300),
                new Note(10500, new ImageView(defaultNoteSkin)),
                new Note(15300, new ImageView(defaultNoteSkin)),
                new Note(19200, new ImageView(defaultNoteSkin)),
                new Note(24600, new ImageView(defaultNoteSkin), 900),
                new Note(29400, new ImageView(defaultNoteSkin), 1200),
                new Note(33600, new ImageView(defaultNoteSkin)),
                new Note(34575, new ImageView(defaultNoteSkin)),
                new Note(39600, new ImageView(defaultNoteSkin), 600),
                new Note(49200, new ImageView(defaultNoteSkin), 450),
                new Note(58200, new ImageView(defaultNoteSkin),1200),
                new Note(62400, new ImageView(defaultNoteSkin)),
                new Note(63375, new ImageView(defaultNoteSkin)),
                new Note(67800, new ImageView(defaultNoteSkin)),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72975, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(4800, new ImageView(defaultNoteSkin), 300),
                new Note(9600, new ImageView(defaultNoteSkin), 300),
                new Note(10800, new ImageView(defaultNoteSkin), 600),
                new Note(14700, new ImageView(defaultNoteSkin)),
                new Note(19800, new ImageView(defaultNoteSkin), 900),
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(34800, new ImageView(defaultNoteSkin), 600),
                new Note(43200, new ImageView(defaultNoteSkin)),
                new Note(44400, new ImageView(defaultNoteSkin)),
                new Note(44550, new ImageView(defaultNoteSkin)),
                new Note(44700, new ImageView(defaultNoteSkin)),
                new Note(63600, new ImageView(defaultNoteSkin), 600),
                new Note(68400, new ImageView(defaultNoteSkin), 600),
                new Note(73200, new ImageView(defaultNoteSkin), 600)
        };
        Note[] upNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(15600, new ImageView(defaultNoteSkin), 600),
                new Note(28800, new ImageView(defaultNoteSkin)),
                new Note(33300, new ImageView(defaultNoteSkin)),
                new Note(34500, new ImageView(defaultNoteSkin)),
                new Note(38400, new ImageView(defaultNoteSkin), 450),
                new Note(43800, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(48000, new ImageView(defaultNoteSkin), 450),
                new Note(57600, new ImageView(defaultNoteSkin)),
                new Note(62100, new ImageView(defaultNoteSkin)),
                new Note(63300, new ImageView(defaultNoteSkin)),
                new Note(67200, new ImageView(defaultNoteSkin)),
                new Note(68100, new ImageView(defaultNoteSkin)),
                new Note(71700, new ImageView(defaultNoteSkin)),
                new Note(72900, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(600, new ImageView(defaultNoteSkin), 600),
                new Note(1200, new ImageView(defaultNoteSkin), 600),
                new Note(6000, new ImageView(defaultNoteSkin), 600),
                new Note(10200, new ImageView(defaultNoteSkin)),
                new Note(14400, new ImageView(defaultNoteSkin)),
                new Note(19500, new ImageView(defaultNoteSkin)),
                new Note(24300, new ImageView(defaultNoteSkin)),
                new Note(29100, new ImageView(defaultNoteSkin)),
                new Note(33900, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin), 300),
                new Note(48600, new ImageView(defaultNoteSkin), 300),
                new Note(52800, new ImageView(defaultNoteSkin), 1800),
                new Note(57900, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(67500, new ImageView(defaultNoteSkin)),
                new Note(72300, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getFreshBFChart(){
        Note[] leftNotes = {
                new Note(3250, new ImageView(defaultNoteSkin)),
                new Note(3875, new ImageView(defaultNoteSkin), 125),
                new Note(7250, new ImageView(defaultNoteSkin)),
                new Note(10250, new ImageView(defaultNoteSkin)),
                new Note(14250, new ImageView(defaultNoteSkin)),
                new Note(15000, new ImageView(defaultNoteSkin)),
                new Note(18250, new ImageView(defaultNoteSkin)),
                new Note(19000, new ImageView(defaultNoteSkin)),
                new Note(23750, new ImageView(defaultNoteSkin)),
                new Note(28500, new ImageView(defaultNoteSkin)),
                new Note(29500, new ImageView(defaultNoteSkin)),
                new Note(30750, new ImageView(defaultNoteSkin)),
                new Note(36500, new ImageView(defaultNoteSkin)),
                new Note(38250, new ImageView(defaultNoteSkin)),
                new Note(38750, new ImageView(defaultNoteSkin)),
                new Note(42250, new ImageView(defaultNoteSkin)),
                new Note(46250, new ImageView(defaultNoteSkin)),
                new Note(47000, new ImageView(defaultNoteSkin)),
                new Note(47750, new ImageView(defaultNoteSkin)),
                new Note(50250, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(55750, new ImageView(defaultNoteSkin)),
                new Note(60500, new ImageView(defaultNoteSkin)),
                new Note(61500, new ImageView(defaultNoteSkin)),
                new Note(62750, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(70250, new ImageView(defaultNoteSkin)),
                new Note(70750, new ImageView(defaultNoteSkin)),
                new Note(73250, new ImageView(defaultNoteSkin)),
                new Note(73875, new ImageView(defaultNoteSkin), 125),
                new Note(75250, new ImageView(defaultNoteSkin)),
                new Note(75875, new ImageView(defaultNoteSkin), 125),
                new Note(77250, new ImageView(defaultNoteSkin)),
                new Note(79250, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(2000, new ImageView(defaultNoteSkin)),
                new Note(2250, new ImageView(defaultNoteSkin)),
                new Note(3125, new ImageView(defaultNoteSkin)),
                new Note(3750, new ImageView(defaultNoteSkin)),
                new Note(6000, new ImageView(defaultNoteSkin)),
                new Note(6250, new ImageView(defaultNoteSkin)),
                new Note(7125, new ImageView(defaultNoteSkin)),
                new Note(10500, new ImageView(defaultNoteSkin)),
                new Note(18500, new ImageView(defaultNoteSkin)),
                new Note(22250, new ImageView(defaultNoteSkin)),
                new Note(23250, new ImageView(defaultNoteSkin)),
                new Note(29000, new ImageView(defaultNoteSkin)),
                new Note(29250, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(37000, new ImageView(defaultNoteSkin)),
                new Note(37500, new ImageView(defaultNoteSkin)),
                new Note(39500, new ImageView(defaultNoteSkin), 375),
                new Note(42500, new ImageView(defaultNoteSkin)),
                new Note(50500, new ImageView(defaultNoteSkin)),
                new Note(54250, new ImageView(defaultNoteSkin)),
                new Note(54500, new ImageView(defaultNoteSkin)),
                new Note(55250, new ImageView(defaultNoteSkin)),
                new Note(61000, new ImageView(defaultNoteSkin)),
                new Note(61250, new ImageView(defaultNoteSkin)),
                new Note(62000, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(69000, new ImageView(defaultNoteSkin)),
                new Note(69500, new ImageView(defaultNoteSkin)),
                new Note(71500, new ImageView(defaultNoteSkin), 375),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72250, new ImageView(defaultNoteSkin)),
                new Note(73125, new ImageView(defaultNoteSkin)),
                new Note(73750, new ImageView(defaultNoteSkin)),
                new Note(74000, new ImageView(defaultNoteSkin)),
                new Note(74250, new ImageView(defaultNoteSkin)),
                new Note(75125, new ImageView(defaultNoteSkin)),
                new Note(75750, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76250, new ImageView(defaultNoteSkin)),
                new Note(77125, new ImageView(defaultNoteSkin)),
                new Note(78000, new ImageView(defaultNoteSkin)),
                new Note(78250, new ImageView(defaultNoteSkin)),
                new Note(79125, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(3500, new ImageView(defaultNoteSkin)),
                new Note(7500, new ImageView(defaultNoteSkin)),
                new Note(11000, new ImageView(defaultNoteSkin)),
                new Note(14500, new ImageView(defaultNoteSkin)),
                new Note(19500, new ImageView(defaultNoteSkin)),
                new Note(22750, new ImageView(defaultNoteSkin)),
                new Note(30250, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(37750, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin), 375),
                new Note(43000, new ImageView(defaultNoteSkin)),
                new Note(43500, new ImageView(defaultNoteSkin)),
                new Note(43750, new ImageView(defaultNoteSkin)),
                new Note(46500, new ImageView(defaultNoteSkin)),
                new Note(51750, new ImageView(defaultNoteSkin)),
                new Note(54750, new ImageView(defaultNoteSkin)),
                new Note(62250, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(69750, new ImageView(defaultNoteSkin)),
                new Note(71000, new ImageView(defaultNoteSkin), 375),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(75500, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin)),
                new Note(79500, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(2500, new ImageView(defaultNoteSkin)),
                new Note(2875, new ImageView(defaultNoteSkin)),
                new Note(3500, new ImageView(defaultNoteSkin)),
                new Note(6500, new ImageView(defaultNoteSkin)),
                new Note(6875, new ImageView(defaultNoteSkin)),
                new Note(7500, new ImageView(defaultNoteSkin)),
                new Note(7750, new ImageView(defaultNoteSkin), 125),
                new Note(14750, new ImageView(defaultNoteSkin)),
                new Note(18750, new ImageView(defaultNoteSkin)),
                new Note(22000, new ImageView(defaultNoteSkin)),
                new Note(23000, new ImageView(defaultNoteSkin)),
                new Note(28000, new ImageView(defaultNoteSkin)),
                new Note(30500, new ImageView(defaultNoteSkin)),
                new Note(31250, new ImageView(defaultNoteSkin)),
                new Note(36750, new ImageView(defaultNoteSkin)),
                new Note(37250, new ImageView(defaultNoteSkin)),
                new Note(38500, new ImageView(defaultNoteSkin)),
                new Note(46750, new ImageView(defaultNoteSkin)),
                new Note(50750, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(55000, new ImageView(defaultNoteSkin)),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(62500, new ImageView(defaultNoteSkin)),
                new Note(63250, new ImageView(defaultNoteSkin)),
                new Note(68750, new ImageView(defaultNoteSkin)),
                new Note(69250, new ImageView(defaultNoteSkin)),
                new Note(70500, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(72875, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(74500, new ImageView(defaultNoteSkin)),
                new Note(74875, new ImageView(defaultNoteSkin)),
                new Note(75500, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(76875, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin)),
                new Note(78500, new ImageView(defaultNoteSkin)),
                new Note(78875, new ImageView(defaultNoteSkin)),
                new Note(79500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getFreshDadChart(){
        Note[] leftNotes = {
                new Note(1250, new ImageView(defaultNoteSkin)),
                new Note(1875, new ImageView(defaultNoteSkin), 125),
                new Note(5250, new ImageView(defaultNoteSkin)),
                new Note(8250, new ImageView(defaultNoteSkin)),
                new Note(12250, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(16250, new ImageView(defaultNoteSkin)),
                new Note(17000, new ImageView(defaultNoteSkin)),
                new Note(21750, new ImageView(defaultNoteSkin)),
                new Note(24500, new ImageView(defaultNoteSkin)),
                new Note(25500, new ImageView(defaultNoteSkin)),
                new Note(26750, new ImageView(defaultNoteSkin)),
                new Note(32500, new ImageView(defaultNoteSkin)),
                new Note(34250, new ImageView(defaultNoteSkin)),
                new Note(34750, new ImageView(defaultNoteSkin)),
                new Note(40250, new ImageView(defaultNoteSkin)),
                new Note(44250, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(45750, new ImageView(defaultNoteSkin)),
                new Note(48250, new ImageView(defaultNoteSkin)),
                new Note(49000, new ImageView(defaultNoteSkin)),
                new Note(53750, new ImageView(defaultNoteSkin)),
                new Note(56500, new ImageView(defaultNoteSkin)),
                new Note(57500, new ImageView(defaultNoteSkin)),
                new Note(58750, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(66250, new ImageView(defaultNoteSkin)),
                new Note(66750, new ImageView(defaultNoteSkin)),
                new Note(73250, new ImageView(defaultNoteSkin)),
                new Note(73875, new ImageView(defaultNoteSkin), 125),
                new Note(77250, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(250, new ImageView(defaultNoteSkin)),
                new Note(1125, new ImageView(defaultNoteSkin)),
                new Note(1750, new ImageView(defaultNoteSkin)),
                new Note(4000, new ImageView(defaultNoteSkin)),
                new Note(4250, new ImageView(defaultNoteSkin)),
                new Note(5125, new ImageView(defaultNoteSkin)),
                new Note(8500, new ImageView(defaultNoteSkin)),
                new Note(16500, new ImageView(defaultNoteSkin)),
                new Note(20250, new ImageView(defaultNoteSkin)),
                new Note(21250, new ImageView(defaultNoteSkin)),
                new Note(25000, new ImageView(defaultNoteSkin)),
                new Note(25250, new ImageView(defaultNoteSkin)),
                new Note(26000, new ImageView(defaultNoteSkin)),
                new Note(27500, new ImageView(defaultNoteSkin)),
                new Note(33000, new ImageView(defaultNoteSkin)),
                new Note(33500, new ImageView(defaultNoteSkin)),
                new Note(35500, new ImageView(defaultNoteSkin), 375),
                new Note(40500, new ImageView(defaultNoteSkin)),
                new Note(48500, new ImageView(defaultNoteSkin)),
                new Note(52250, new ImageView(defaultNoteSkin)),
                new Note(52500, new ImageView(defaultNoteSkin)),
                new Note(53250, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(57250, new ImageView(defaultNoteSkin)),
                new Note(58000, new ImageView(defaultNoteSkin)),
                new Note(59500, new ImageView(defaultNoteSkin)),
                new Note(65000, new ImageView(defaultNoteSkin)),
                new Note(65500, new ImageView(defaultNoteSkin)),
                new Note(67500, new ImageView(defaultNoteSkin), 375),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72250, new ImageView(defaultNoteSkin)),
                new Note(73125, new ImageView(defaultNoteSkin)),
                new Note(73750, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76250, new ImageView(defaultNoteSkin)),
                new Note(77125, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(1500, new ImageView(defaultNoteSkin)),
                new Note(5500, new ImageView(defaultNoteSkin)),
                new Note(9000, new ImageView(defaultNoteSkin)),
                new Note(12500, new ImageView(defaultNoteSkin)),
                new Note(17500, new ImageView(defaultNoteSkin)),
                new Note(20750, new ImageView(defaultNoteSkin)),
                new Note(26250, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin)),
                new Note(33750, new ImageView(defaultNoteSkin)),
                new Note(35000, new ImageView(defaultNoteSkin), 375),
                new Note(41000, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(41750, new ImageView(defaultNoteSkin)),
                new Note(44500, new ImageView(defaultNoteSkin)),
                new Note(49750, new ImageView(defaultNoteSkin)),
                new Note(52750, new ImageView(defaultNoteSkin)),
                new Note(58250, new ImageView(defaultNoteSkin)),
                new Note(59000, new ImageView(defaultNoteSkin)),
                new Note(65750, new ImageView(defaultNoteSkin)),
                new Note(67000, new ImageView(defaultNoteSkin), 375),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(500, new ImageView(defaultNoteSkin)),
                new Note(875, new ImageView(defaultNoteSkin)),
                new Note(1500, new ImageView(defaultNoteSkin)),
                new Note(4500, new ImageView(defaultNoteSkin)),
                new Note(4875, new ImageView(defaultNoteSkin)),
                new Note(5500, new ImageView(defaultNoteSkin)),
                new Note(5750, new ImageView(defaultNoteSkin), 125),
                new Note(12750, new ImageView(defaultNoteSkin)),
                new Note(16750, new ImageView(defaultNoteSkin)),
                new Note(20000, new ImageView(defaultNoteSkin)),
                new Note(21000, new ImageView(defaultNoteSkin)),
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(26500, new ImageView(defaultNoteSkin)),
                new Note(27250, new ImageView(defaultNoteSkin)),
                new Note(32750, new ImageView(defaultNoteSkin)),
                new Note(33250, new ImageView(defaultNoteSkin)),
                new Note(34500, new ImageView(defaultNoteSkin)),
                new Note(44750, new ImageView(defaultNoteSkin)),
                new Note(48750, new ImageView(defaultNoteSkin)),
                new Note(52000, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(56000, new ImageView(defaultNoteSkin)),
                new Note(58500, new ImageView(defaultNoteSkin)),
                new Note(59250, new ImageView(defaultNoteSkin)),
                new Note(64750, new ImageView(defaultNoteSkin)),
                new Note(65250, new ImageView(defaultNoteSkin)),
                new Note(66500, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(72875, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(76875, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getDadbattleBFChart(){
        Note[] leftNotes = {
                new Note(13666, new ImageView(defaultNoteSkin)),
                new Note(14333, new ImageView(defaultNoteSkin)),
                new Note(15000, new ImageView(defaultNoteSkin)),
                new Note(15666, new ImageView(defaultNoteSkin)),
                new Note(19000, new ImageView(defaultNoteSkin)),
                new Note(20333, new ImageView(defaultNoteSkin)),
                new Note(20500, new ImageView(defaultNoteSkin)),
                new Note(28666, new ImageView(defaultNoteSkin)),
                new Note(30333, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(41333, new ImageView(defaultNoteSkin)),
                new Note(42333, new ImageView(defaultNoteSkin)),
                new Note(42833, new ImageView(defaultNoteSkin)),
                new Note(43666, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(45333, new ImageView(defaultNoteSkin)),
                new Note(47333, new ImageView(defaultNoteSkin)),
                new Note(48666, new ImageView(defaultNoteSkin)),
                new Note(49333, new ImageView(defaultNoteSkin)),
                new Note(49500, new ImageView(defaultNoteSkin)),
                new Note(49833, new ImageView(defaultNoteSkin)),
                new Note(50833, new ImageView(defaultNoteSkin)),
                new Note(52000, new ImageView(defaultNoteSkin)),
                new Note(52166, new ImageView(defaultNoteSkin)),
                new Note(56333, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(57666, new ImageView(defaultNoteSkin)),
                new Note(58333, new ImageView(defaultNoteSkin)),
                new Note(61666, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63166, new ImageView(defaultNoteSkin)),
                new Note(68000, new ImageView(defaultNoteSkin)),
                new Note(69000, new ImageView(defaultNoteSkin)),
                new Note(71333, new ImageView(defaultNoteSkin)),
                new Note(73000, new ImageView(defaultNoteSkin)),
                new Note(73666, new ImageView(defaultNoteSkin)),
                new Note(77666, new ImageView(defaultNoteSkin)),
                new Note(78333, new ImageView(defaultNoteSkin)),
                new Note(79000, new ImageView(defaultNoteSkin)),
                new Note(83000, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(13833, new ImageView(defaultNoteSkin)),
                new Note(15166, new ImageView(defaultNoteSkin)),
                new Note(18666, new ImageView(defaultNoteSkin)),
                new Note(19333, new ImageView(defaultNoteSkin)),
                new Note(20000, new ImageView(defaultNoteSkin)),
                new Note(27166, new ImageView(defaultNoteSkin)),
                new Note(28166, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(30500, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(42166, new ImageView(defaultNoteSkin)),
                new Note(42500, new ImageView(defaultNoteSkin)),
                new Note(43333, new ImageView(defaultNoteSkin)),
                new Note(44500, new ImageView(defaultNoteSkin)),
                new Note(45666, new ImageView(defaultNoteSkin)),
                new Note(46333, new ImageView(defaultNoteSkin)),
                new Note(47333, new ImageView(defaultNoteSkin)),
                new Note(48166, new ImageView(defaultNoteSkin)),
                new Note(49000, new ImageView(defaultNoteSkin)),
                new Note(49666, new ImageView(defaultNoteSkin)),
                new Note(50333, new ImageView(defaultNoteSkin)),
                new Note(51166, new ImageView(defaultNoteSkin)),
                new Note(51666, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(56500, new ImageView(defaultNoteSkin)),
                new Note(57833, new ImageView(defaultNoteSkin)),
                new Note(61333, new ImageView(defaultNoteSkin)),
                new Note(62000, new ImageView(defaultNoteSkin)),
                new Note(62666, new ImageView(defaultNoteSkin)),
                new Note(68166, new ImageView(defaultNoteSkin)),
                new Note(68833, new ImageView(defaultNoteSkin)),
                new Note(69166, new ImageView(defaultNoteSkin), 333),
                new Note(69833, new ImageView(defaultNoteSkin)),
                new Note(70833, new ImageView(defaultNoteSkin)),
                new Note(72666, new ImageView(defaultNoteSkin)),
                new Note(73166, new ImageView(defaultNoteSkin)),
                new Note(77833, new ImageView(defaultNoteSkin)),
                new Note(79166, new ImageView(defaultNoteSkin)),
                new Note(82666, new ImageView(defaultNoteSkin)),
                new Note(83333, new ImageView(defaultNoteSkin)),
                new Note(84000, new ImageView(defaultNoteSkin)),
                new Note(84333, new ImageView(defaultNoteSkin)),
                new Note(84666, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(13333, new ImageView(defaultNoteSkin)),
                new Note(14000, new ImageView(defaultNoteSkin)),
                new Note(14666, new ImageView(defaultNoteSkin)),
                new Note(15333, new ImageView(defaultNoteSkin)),
                new Note(19666, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin)),
                new Note(29666, new ImageView(defaultNoteSkin)),
                new Note(30666, new ImageView(defaultNoteSkin)),
                new Note(31333, new ImageView(defaultNoteSkin)),
                new Note(41666, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(43166, new ImageView(defaultNoteSkin)),
                new Note(44166, new ImageView(defaultNoteSkin)),
                new Note(44666, new ImageView(defaultNoteSkin)),
                new Note(46666, new ImageView(defaultNoteSkin)),
                new Note(48500, new ImageView(defaultNoteSkin)),
                new Note(48833, new ImageView(defaultNoteSkin)),
                new Note(50000, new ImageView(defaultNoteSkin)),
                new Note(51333, new ImageView(defaultNoteSkin)),
                new Note(52333, new ImageView(defaultNoteSkin)),
                new Note(52500, new ImageView(defaultNoteSkin)),
                new Note(56000, new ImageView(defaultNoteSkin)),
                new Note(56666, new ImageView(defaultNoteSkin)),
                new Note(57333, new ImageView(defaultNoteSkin)),
                new Note(58000, new ImageView(defaultNoteSkin)),
                new Note(62333, new ImageView(defaultNoteSkin)),
                new Note(68333, new ImageView(defaultNoteSkin)),
                new Note(68666, new ImageView(defaultNoteSkin)),
                new Note(69666, new ImageView(defaultNoteSkin)),
                new Note(72333, new ImageView(defaultNoteSkin)),
                new Note(73333, new ImageView(defaultNoteSkin)),
                new Note(74000, new ImageView(defaultNoteSkin)),
                new Note(77333, new ImageView(defaultNoteSkin)),
                new Note(78000, new ImageView(defaultNoteSkin)),
                new Note(78666, new ImageView(defaultNoteSkin)),
                new Note(79333, new ImageView(defaultNoteSkin)),
                new Note(79666, new ImageView(defaultNoteSkin)),
                new Note(83666, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(14500, new ImageView(defaultNoteSkin)),
                new Note(14833, new ImageView(defaultNoteSkin)),
                new Note(15833, new ImageView(defaultNoteSkin)),
                new Note(19166, new ImageView(defaultNoteSkin)),
                new Note(20666, new ImageView(defaultNoteSkin)),
                new Note(20833, new ImageView(defaultNoteSkin)),
                new Note(21000, new ImageView(defaultNoteSkin)),
                new Note(21166, new ImageView(defaultNoteSkin)),
                new Note(27333, new ImageView(defaultNoteSkin)),
                new Note(28333, new ImageView(defaultNoteSkin)),
                new Note(30833, new ImageView(defaultNoteSkin)),
                new Note(31166, new ImageView(defaultNoteSkin)),
                new Note(41833, new ImageView(defaultNoteSkin)),
                new Note(43000, new ImageView(defaultNoteSkin)),
                new Note(44333, new ImageView(defaultNoteSkin)),
                new Note(46000, new ImageView(defaultNoteSkin)),
                new Note(47000, new ImageView(defaultNoteSkin)),
                new Note(48333, new ImageView(defaultNoteSkin)),
                new Note(49416, new ImageView(defaultNoteSkin)),
                new Note(50166, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(51500, new ImageView(defaultNoteSkin)),
                new Note(51833, new ImageView(defaultNoteSkin)),
                new Note(52666, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(57166, new ImageView(defaultNoteSkin)),
                new Note(57500, new ImageView(defaultNoteSkin)),
                new Note(58500, new ImageView(defaultNoteSkin)),
                new Note(61833, new ImageView(defaultNoteSkin)),
                new Note(63333, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(63666, new ImageView(defaultNoteSkin)),
                new Note(63833, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(70000, new ImageView(defaultNoteSkin)),
                new Note(71000, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(73833, new ImageView(defaultNoteSkin)),
                new Note(78500, new ImageView(defaultNoteSkin)),
                new Note(78833, new ImageView(defaultNoteSkin)),
                new Note(83166, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getDadbattleDadChart(){
        Note[] leftNotes = {
                new Note(11000, new ImageView(defaultNoteSkin)),
                new Note(11666, new ImageView(defaultNoteSkin)),
                new Note(12333, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(16333, new ImageView(defaultNoteSkin)),
                new Note(17666, new ImageView(defaultNoteSkin)),
                new Note(17833, new ImageView(defaultNoteSkin)),
                new Note(23333, new ImageView(defaultNoteSkin)),
                new Note(25000, new ImageView(defaultNoteSkin)),
                new Note(25666, new ImageView(defaultNoteSkin)),
                new Note(30666, new ImageView(defaultNoteSkin)),
                new Note(31666, new ImageView(defaultNoteSkin)),
                new Note(32166, new ImageView(defaultNoteSkin)),
                new Note(33000, new ImageView(defaultNoteSkin)),
                new Note(34333, new ImageView(defaultNoteSkin)),
                new Note(34666, new ImageView(defaultNoteSkin)),
                new Note(36666, new ImageView(defaultNoteSkin)),
                new Note(38000, new ImageView(defaultNoteSkin)),
                new Note(38666, new ImageView(defaultNoteSkin)),
                new Note(38833, new ImageView(defaultNoteSkin)),
                new Note(39166, new ImageView(defaultNoteSkin)),
                new Note(40166, new ImageView(defaultNoteSkin)),
                new Note(41333, new ImageView(defaultNoteSkin)),
                new Note(41666, new ImageView(defaultNoteSkin)),
                new Note(53666, new ImageView(defaultNoteSkin)),
                new Note(54333, new ImageView(defaultNoteSkin)),
                new Note(55000, new ImageView(defaultNoteSkin)),
                new Note(55666, new ImageView(defaultNoteSkin)),
                new Note(59000, new ImageView(defaultNoteSkin)),
                new Note(60333, new ImageView(defaultNoteSkin)),
                new Note(60500, new ImageView(defaultNoteSkin)),
                new Note(62666, new ImageView(defaultNoteSkin)),
                new Note(63666, new ImageView(defaultNoteSkin)),
                new Note(66000, new ImageView(defaultNoteSkin)),
                new Note(67666, new ImageView(defaultNoteSkin)),
                new Note(68333, new ImageView(defaultNoteSkin)),
                new Note(75000, new ImageView(defaultNoteSkin)),
                new Note(75666, new ImageView(defaultNoteSkin)),
                new Note(76333, new ImageView(defaultNoteSkin)),
                new Note(80333, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(11166, new ImageView(defaultNoteSkin)),
                new Note(12500, new ImageView(defaultNoteSkin)),
                new Note(16000, new ImageView(defaultNoteSkin)),
                new Note(16666, new ImageView(defaultNoteSkin)),
                new Note(17333, new ImageView(defaultNoteSkin)),
                new Note(21833, new ImageView(defaultNoteSkin)),
                new Note(22833, new ImageView(defaultNoteSkin)),
                new Note(24666, new ImageView(defaultNoteSkin)),
                new Note(25166, new ImageView(defaultNoteSkin)),
                new Note(30833, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(31833, new ImageView(defaultNoteSkin)),
                new Note(32666, new ImageView(defaultNoteSkin)),
                new Note(33833, new ImageView(defaultNoteSkin)),
                new Note(35000, new ImageView(defaultNoteSkin)),
                new Note(35666, new ImageView(defaultNoteSkin)),
                new Note(36666, new ImageView(defaultNoteSkin)),
                new Note(37500, new ImageView(defaultNoteSkin)),
                new Note(38333, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin)),
                new Note(39666, new ImageView(defaultNoteSkin)),
                new Note(40500, new ImageView(defaultNoteSkin)),
                new Note(41000, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(53833, new ImageView(defaultNoteSkin)),
                new Note(55166, new ImageView(defaultNoteSkin)),
                new Note(58666, new ImageView(defaultNoteSkin)),
                new Note(59333, new ImageView(defaultNoteSkin)),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(62833, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(63833, new ImageView(defaultNoteSkin), 333),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(65500, new ImageView(defaultNoteSkin)),
                new Note(67333, new ImageView(defaultNoteSkin)),
                new Note(67833, new ImageView(defaultNoteSkin)),
                new Note(75166, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(80000, new ImageView(defaultNoteSkin)),
                new Note(80666, new ImageView(defaultNoteSkin)),
                new Note(81333, new ImageView(defaultNoteSkin)),
                new Note(81666, new ImageView(defaultNoteSkin)),
                new Note(82000, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(10666, new ImageView(defaultNoteSkin)),
                new Note(11333, new ImageView(defaultNoteSkin)),
                new Note(12000, new ImageView(defaultNoteSkin)),
                new Note(12666, new ImageView(defaultNoteSkin)),
                new Note(17000, new ImageView(defaultNoteSkin)),
                new Note(21666, new ImageView(defaultNoteSkin)),
                new Note(24333, new ImageView(defaultNoteSkin)),
                new Note(25333, new ImageView(defaultNoteSkin)),
                new Note(26000, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(31333, new ImageView(defaultNoteSkin)),
                new Note(32500, new ImageView(defaultNoteSkin)),
                new Note(33500, new ImageView(defaultNoteSkin)),
                new Note(34000, new ImageView(defaultNoteSkin)),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(37833, new ImageView(defaultNoteSkin)),
                new Note(38166, new ImageView(defaultNoteSkin)),
                new Note(39333, new ImageView(defaultNoteSkin)),
                new Note(40666, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(53333, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(54666, new ImageView(defaultNoteSkin)),
                new Note(55333, new ImageView(defaultNoteSkin)),
                new Note(59666, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63333, new ImageView(defaultNoteSkin)),
                new Note(64333, new ImageView(defaultNoteSkin)),
                new Note(67000, new ImageView(defaultNoteSkin)),
                new Note(68000, new ImageView(defaultNoteSkin)),
                new Note(68666, new ImageView(defaultNoteSkin)),
                new Note(74666, new ImageView(defaultNoteSkin)),
                new Note(75333, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76666, new ImageView(defaultNoteSkin)),
                new Note(77000, new ImageView(defaultNoteSkin)),
                new Note(81000, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(11833, new ImageView(defaultNoteSkin)),
                new Note(12166, new ImageView(defaultNoteSkin)),
                new Note(13166, new ImageView(defaultNoteSkin)),
                new Note(16500, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin)),
                new Note(18166, new ImageView(defaultNoteSkin)),
                new Note(18333, new ImageView(defaultNoteSkin)),
                new Note(18500, new ImageView(defaultNoteSkin)),
                new Note(22000, new ImageView(defaultNoteSkin)),
                new Note(23000, new ImageView(defaultNoteSkin)),
                new Note(25500, new ImageView(defaultNoteSkin)),
                new Note(25833, new ImageView(defaultNoteSkin)),
                new Note(31166, new ImageView(defaultNoteSkin)),
                new Note(32333, new ImageView(defaultNoteSkin)),
                new Note(33666, new ImageView(defaultNoteSkin)),
                new Note(35333, new ImageView(defaultNoteSkin)),
                new Note(36333, new ImageView(defaultNoteSkin)),
                new Note(37666, new ImageView(defaultNoteSkin)),
                new Note(38750, new ImageView(defaultNoteSkin)),
                new Note(39500, new ImageView(defaultNoteSkin)),
                new Note(40333, new ImageView(defaultNoteSkin)),
                new Note(40833, new ImageView(defaultNoteSkin)),
                new Note(41166, new ImageView(defaultNoteSkin)),
                new Note(41833, new ImageView(defaultNoteSkin)),
                new Note(42333, new ImageView(defaultNoteSkin)),
                new Note(54500, new ImageView(defaultNoteSkin)),
                new Note(54833, new ImageView(defaultNoteSkin)),
                new Note(55833, new ImageView(defaultNoteSkin)),
                new Note(59166, new ImageView(defaultNoteSkin)),
                new Note(60666, new ImageView(defaultNoteSkin)),
                new Note(60833, new ImageView(defaultNoteSkin)),
                new Note(61000, new ImageView(defaultNoteSkin)),
                new Note(61166, new ImageView(defaultNoteSkin)),
                new Note(63166, new ImageView(defaultNoteSkin)),
                new Note(64666, new ImageView(defaultNoteSkin)),
                new Note(65666, new ImageView(defaultNoteSkin)),
                new Note(68166, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(75833, new ImageView(defaultNoteSkin)),
                new Note(76166, new ImageView(defaultNoteSkin)),
                new Note(80500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }
}
