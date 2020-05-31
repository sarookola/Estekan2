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
            silence="sounds\\silence.mp3",
              Goz_in="sounds\\Goz_in.mp3",
            select="sounds\\select.mp3",
             Hunter="sounds\\Hunter.mp3",
            newramz = "sounds\\newramz.mp3",
            games[] = {"sounds\\game0.mp3", "sounds\\game0.mp3"},
            coin = "sounds\\coin.mp3",
            coinEnd = "sounds\\coinEnd.mp3",
            PlayerIn = "sounds\\PlayerIn.mp3",
            PlayerOut="sounds\\Player_out.mp3", 
            oscar = "sounds\\oscar.mp3",
            Not_As_It_Seems="sounds\\Not As It Seems.mp3",
            qTExt="sounds\\qTExt.mp3",
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
    public void playGame(int index) {
        if (index < games.length) {
            playLong(games[index]);
        } else {
            System.out.println("980422  index of  music games  is bigger than it's lenght");
        }
    }
    void playcoin() {
        playLong(coin);
    }

    void playcoinEnd() {
        playLong(coinEnd);
    }

    void playoscar() {
        stopAll();
        playLong(oscar);
    }

    public void playPlayerIn() {
        playLittle(PlayerIn);
    }
      public void playPlayerOut() {
        playLittle(PlayerOut);
    }
     void playNotAsItSeems() {
        playLong(Not_As_It_Seems);
    }

    void playSilence() {
playLong(silence);
 playLittle(silence);
    }
  void  playQtext(){
       playLong(qTExt); 
    }

    void playHunter() {
        playLong(Hunter); 
    }

    void playSelecting() {
        playLittle(select);
    }
   void playGoz_in() {
        playLittle(Goz_in);
    }

    void playBooktext() {
         playLong(qTExt); 
    }


}
