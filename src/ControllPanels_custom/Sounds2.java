/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllPanels_custom;


/**
 *
 * @author Shayan
 */
public class Sounds2 extends JSO.Com.Main.Sounds {

    boolean mute = false;
    String red = "sounds\\red.mp3";
    String check = "sounds\\check.mp3";
    String win = "sounds\\win.mp3";
    String yellow = "sounds\\yellow.mp3";
    String effect1 = "sounds\\effect1.mp3";
    String effect2 = "sounds\\effect2.mp3";
    String effect3 = "sounds\\effect3.mp3";
    String effect4 = "sounds\\effect4.mp3",
            newramz = "sounds\\newramz.mp3",
            partcorrect = "sounds\\partcorrect.mp3",
            BROOmand22 = "sounds\\BROOmand22.mp3",
            //                String gamename[] = {"سوال", "ایرانشناسی",         "نمایش فیلم",       "بازی حروف",            "بازی مکعب",       "موسیقی تیتراژ",     "بازی 2",          "7",                "8",                 "9",               "10"};
            games[] = {"sounds\\game0.mp3", "sounds\\game0.mp3",                 "sounds\\FilmStop.mp3", "sounds\\game0.mp3", "sounds\\game0.mp3", "sounds\\silence.mp3", "sounds\\game0.mp3", "sounds\\game0.mp3", "sounds\\game0.mp3", "sounds\\game0.mp3", "sounds\\prize.mp3"},
            dance3bowls= "sounds\\dance3bowls.mp3",
            door1 = "sounds\\door1.mp3",
            door2 = "sounds\\door2.mp3",
            wipere = "sounds\\wipeRe.mp3",
            wipe2="sounds\\wipe2.mp3",
            prizes = "sounds\\prize.mp3",
            coin = "sounds\\coin.mp3",
            coinEnd = "sounds\\coinEnd.mp3",
            parIn = "sounds\\parIn.mp3",
            oscar = "sounds\\oscar.mp3",
            double_beep_beep="sounds\\double-beep-beep.mp3",
            filmStop="sounds\\FilmStop.mp3",
            timeOut = "sounds\\timeOut.mp3";

    public void playTimeOut() {
        playLittleNonStop(timeOut);
    }

    private void playLittle(String st) {
        stopmp31();
        playmp31(st);
    }

    void playLong(String st) {
        stopmp32();
        playmp32(st);
    }

    private void playLittleNonStop(String st) {
        playmp31(st);
    }

    public void playselectZangBlur() {

        playLittle(red);

    }

    public void playcheck() {
        playLong(check);
    }

    public void playWin() {
        stopAll();
        playLittle(win);
    }

    public void playWinNotall() {
        playLittle(win);
    }

    public void playWinNonStop() {
        playLittleNonStop(win);
    }

    public void playRedNonStop() {
        playLittleNonStop(red);
    }

    public void playRed() {
        stopAll();
        playLittle(red);
    }

    public void playYellow() {
        stopAll();
        playLong(yellow);
    }

    public void playYellowNonStop() {
        playLittleNonStop(yellow);
    }

    public void mute() {
        stopAll();
        mute = true;
    }

    public void muteOff() {
        mute = false;
    }

    public void playEffect1() {
        playLittle(effect1);
    }

    public void playEffect2() {
        playLittle(effect2);
    }

    public void playEffect3() {
        playLittle(effect3);
    }

    public void playEffect4() {
        playLittle(effect4);
    }

    public void playNewRamz() {
        playLittle(newramz);
    }

    public void playPartCOrrect() {
        playLittleNonStop(partcorrect);
    }

    public void playBROOmand22() {
        playLittle(BROOmand22);
    }

//    public void playkamanFree() {
//        playLittleNonStop(kaman_free);
//    }
//
//    public void playkamanTarget() {
//        playLittleNonStop(kaman_target);
//    }
    public void playDoor1() {
        playLittle(door1);
    }

    public void playDoor2() {
        playLittle(door2);
    }

    public void playWipeRe() {
        playLittle(wipere);
    }

    public void playGame(int index) {
        if (index < games.length) {
            playLong(games[index]);
        } else {
            System.out.println("980422  index of  music games  is bigger than it's lenght");
        }
    }

    void playPrizesInout() {
        playLong(prizes);
    }

    void playcoin() {
        playLong(coin);
    }

    void playcoinEnd() {
        playLong(coinEnd);
    }

    void playoscar() {
        playLong(oscar);
    }

    public void playParIn() {
        playLittle(parIn);
    }
    
    public void playWipin() {
        stopAll();
        playLittle(wipe2);
    }

    void playdance3Bowls() {
         stopAll();
        playLong(dance3bowls);
    }
     void playdouble_beep_beep() {
        playLittle(double_beep_beep);
    }
      void playFilmStop() {
        playLong(filmStop);
    }
     
}
