/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox_cutom;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shayan
 */
public class Database0 {

    String Pic01;
    String name;
    int time;
    String blackPic = "pictures\\nopic.png";

    String gamename[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
//    int settingitemIdforQuestions = 30;
    int settingitemIdforgame[] = {30, 50, 70, 150, 120, 100, 30, 200, 370, 390, 480};
    int[] selectedGames = {0, 1, 2, 3, 4, 5, 4};

    String[] bAsketname =       {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    int basketTime[] = {120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120};
    int[] startplaygametime = {2500, 2500, 2500, 2500, 2500, 2500, 2500, 2500, 2500};

    int timeGameq = 20, timeGameFinal = 50;

    long timerFixstop = 50;

    database_File_address file_address;
    String speed1234[]={"اول","دوم","سوم","چهارم"};
    int currentQtime, currentAnsweredTime, currentansweredTotal;
    Participant[] participants;
    int ParticipantCount = 5;
//    int KamanPowerLow = 35, KamanPowerHig = 65;
//    int bowlsSpeed[] = {13, 11, 9, 8, 7, 5};
//    int shateerParts[] = {9, 12, 10, 12, 9, 12};
//    int shateerscales[] = {0, 0, 0, 0, 0, 0};
//    int shateertwins[] = {3, 3, 2, 2, 1, 1};
    String Prizes[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    List<Questions>[] qAllbasket;
    List<GameS> games;
    List<String> paths;
    int speed1234Com = 30;
    String qcharSendPic;

//    BufferedImage blur;
//    int kamanY0 = 42, kamanY100 = 693, kamanx = 125, tirx = 250, siblx0 = 540, siblx100 = 810, sibly0 = 200, sibly100 = 700;
    public long getTimerFixstop() {
        if (timerFixstop == 0) {
            timerFixstop = 100;
        }
        return timerFixstop;
    }



    public class GameS {

        int gameid;
        String gamename;

        public GameS(int gameid, String gamename) {
            this.gameid = gameid;
            this.gamename = gamename;
        }

        public int getGameid() {
            return gameid;
        }

        public String getGamename() {
            return gamename;
        }

    }

    public int getParticipantCount() {
        return ParticipantCount;
    }

    public void setParticipantCount(int ParticipantCount) {
        this.ParticipantCount = ParticipantCount;
    }

    public int getSelectedGames(int index) {
        return selectedGames[index];
    }

    public void setSelectedGames(int index, int selectedGames) {
        this.selectedGames[index] = selectedGames;
    }

    public List<GameS> getGames() {
        return games;
    }

    public String getGamename(int index) {
        if (index > gamename.length) {
            return "not set";
        }
        return gamename[index];
    }

    public GameS getGame(int gameid) {

        if (gameid > games.size()) {
            return new GameS(0, "not exist");
        }
        return games.get(gameid);
    }

    public void setGame(int index, String game) {
        if (games == null) {
            games = new LinkedList<>();
        }
        games.add(new GameS(index, game));

    }

    public String getBlackPic() {
        return blackPic;
    }

    public void setBlackPic(String blackPic) {
        this.blackPic = blackPic;
    }

    public String getqBAsketname(int index) {
        return bAsketname[index];
    }

    public List<Questions> getqbasket(int basket) {
        return qAllbasket[basket];
    }

    public void setqbasket(int basket, List<Questions> qAllbasket) {
        this.qAllbasket[basket] = qAllbasket;
    }

    public Questions getQuestion(int basket, int index) {
        return qAllbasket[basket].get(index);
    }

    public int getTimeGameFinal() {
        return timeGameFinal;
    }

    public void setTimeGameFinal(int timeGameFinal) {
        this.timeGameFinal = timeGameFinal;
    }

    public int getTimeGameq() {
        return timeGameq;
    }

    public void setTimeGameq(int timeGameq) {
        this.timeGameq = timeGameq;
    }

    public String[] getqBAsketname() {
        return bAsketname;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Database0() {
        Pic01 = "pictures\\shayanRanjbarTest.png";

        name = "";

//        Qlist = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            Qlist.add(new LinkedList<Questions>());
//            Qlist.get(i).add(new Questions());
//        }
        qAllbasket = new List[bAsketname.length];
//        timedefaultofBasket = new int[bAsketname.length]
        for (int i = 0; i < qAllbasket.length; i++) {
            qAllbasket[i] = new LinkedList<Questions>();
            qAllbasket[i].add(new Questions());
        }
//        burnedGame = new boolean[19];
//        for (int i = 0; i < burnedGame.length; i++) {
//            burnedGame[i] = false;
//        }
        file_address = new database_File_address();

//        qiran = new LinkedList<QIran>();
//        qiran.add(new QIran());
        games = new LinkedList<GameS>();
        for (int i = 0; i < gamename.length; i++) {
            setGame(i, gamename[i]);
        }
        String Pic01 = "pictures\\shayanRanjbarTest.png";
        qcharSendPic = "pictures\\Character\\temp\\temp.jpg";

        newParticipant();
    }

    public database_File_address getFile_address() {
        return file_address;
    }

    public void setFile_address(database_File_address file_address) {
        this.file_address = file_address;
    }

    public void setqQuestion(int basket, int index, Questions question) {
        this.qAllbasket[basket].set(index, question);
    }

    public List<Questions>[] getqAllbasket() {
        return qAllbasket;
    }

    public void setqAllbasket(List<Questions>[] qAllbasket) {
        this.qAllbasket = qAllbasket;
    }

    public String getPic01() {
        return Pic01;
    }

    public void setPic01(String Pic01) {
        this.Pic01 = Pic01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed1234Com() {
        return speed1234Com;
    }

    public void setSpeed1234Com(int speed1234Com) {
        this.speed1234Com = speed1234Com;
    }
    public void addSpeed1234Com() {
       speed1234Com=(speed1234Com+1);
    }

    void newParticipant() {
        participants = new Participant[ParticipantCount+1];

        for (int i = 0; i < ParticipantCount+1; i++) {
            participants[i] = new Participant();
        }
        ParticipantCount = 0;
    }

    public Participant[] getParticipants() {
        if (participants == null) {
            newParticipant();
        }
        return participants;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

    public Participant getParticipants(int index) {
        if (participants == null) {
            newParticipant();
        }
        return participants[index];
    }

    public void setParticipants(int index, Participant participants1) {
        if (participants == null) {
            newParticipant();
        }
        this.participants[index] = participants1;
    }

    public int getStartplaygametime(int index) {
//        if (startplaygametime == null) {
//            int[] startplaygametime1 = {2500, 1500, 1500, 1500, 1500, 1500, 1500, 1500, 1500};
//            startplaygametime = startplaygametime1;
//        }
        return startplaygametime[index];
    }

    public int getSettingitemIdforgame(int index) {
        return settingitemIdforgame[index];
    }

    public String[] getPrizes() {
        cheknullprizes();
        return Prizes;
    }

    public void setPrizes(String[] Prize) {
        cheknullprizes();
        this.Prizes = Prize;
    }

    public String getPrizes(int index) {
        cheknullprizes();
        return Prizes[index];
    }

    public void setPrizes(int index, String Prize) {
        cheknullprizes();
        this.Prizes[index] = Prize;
    }

    void cheknullprizes() {
        if (Prizes == null) {
            Prizes = new String[9];
            for (int i = 0; i < 9; i++) {
                Prizes[i] = "" + i;
            }
        }
    }

//   
    private void pathsnew(int index) {
        if (paths == null) {
            paths = new LinkedList<String>();
        }
        for (int i = paths.size(); i < index; i++) {
            paths.add("");
        }
    }

    public String getPaths(int index) {
        pathsnew(index);
        return paths.get(index);
    }

    public void setPaths(int index, String path) {
        pathsnew(index);
        this.paths.set(index, path);
    }

    public List<String> getPaths() {
        pathsnew(0);
        return paths;
    }

    public int getCurrentQtime() {
        return currentQtime;
    }

    public void setCurrentQtime(int currentQtime) {
        this.currentQtime = currentQtime;
    }

    public int getCurrentAnsweredTime() {
        return currentAnsweredTime;
    }

    public void setCurrentAnsweredTime(int currentAnsweredTime) {
        this.currentAnsweredTime = currentAnsweredTime;
    }

    public int getCurrentansweredTotal() {
        return currentansweredTotal;
    }

    public void setCurrentansweredTotal(int currentansweredTotal) {
        this.currentansweredTotal = currentansweredTotal;
    }

    public int getBasketTime(int index) {
        return basketTime[index];
    }

    public void setBasketTime(int index, int basketTime) {
        this.basketTime[index] = basketTime;
    }

    public String getSpeed1234(int index) {
          if(speed1234==null) speed1234 = new String[]{"اول","دوم","سوم","چهارم"};
          if(index>=0 && index<4)
        return speed1234[index];
          else return "-";
    }



}
