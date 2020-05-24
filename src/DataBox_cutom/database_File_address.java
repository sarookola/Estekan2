/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox_cutom;

/**
 *
 * @author shayan
 */
public class database_File_address {

    public String getgameicon_(int gameindex, int id) {
        String path="pictures\\Png\\icons\\";
        String folder="";
       switch(gameindex){
           case 0:
              folder="question";
               break;
                case 1:
              folder="iran";
               break;
                case 2:
              folder="film";
               break;
                case 3:
              folder="jadval";
               break;
                case 4:
              folder="game";
               break;
                case 5:
              folder="titraj";
               break;
                 case 6:
              folder="iran";
               break;
               case 7:
              folder="game2";
               break;
               default:
                    folder="question";
                   break ;
       }
       String f= path +folder+"\\"+folder+"_0000"+id+".png";
       return f;
    }
public String getgameicon9807(int gameindex, int id) {
        String path="pictures\\Png9807\\icons\\";
        String folder="";
       switch(gameindex){
           case 0:
              folder="question";
               break;
                case 1:
              folder="iran";
               break;
                case 2:
              folder="film";
               break;
                case 3:
              folder="word";
               break;
                case 4:
              folder="game1";
               break;
                case 5:
              folder="filmMusic";
               break;
                 case 6:
              folder="iran";
               break;
               case 7:
              folder="game2";
               break;
               default:
                    folder="question";
                   break ;
       }
       String f= path +folder+"\\"+folder+"_0000"+id+".png";
       return f;
    }
    
    
//    String backtv = "pictures\\Media\\Tv_fix.png";
//    String backiFilm = "pictures\\Media\\IfilmStart.jpg";
//    public int kashix2[] = {-375, -125, 125, 375, 625, 875, 1125, 1375},
//            kashix1[] = {-375, -125, 125, 375, -375, -125, 125, 375},
//            kashiy1[] = {-250, 250, -250, 250, -250, 250, -250, 250},
//            kashiy2[] = {1250, 1250, 1250, 1250, 1250, 1250, 1250, 1250},
//            kashixM = 500, kashiyM = 650;
//
//    public String getselectedFile(int selectedgame) {
//        String st = "pictures\\Media\\GameFiles\\00.avi";
//        switch (selectedgame) {
//
//            case 99:
//                st = "pictures\\Media\\GameFiles\\00.avi";
//                break;
//
//            case 100:
//                st = "pictures\\Media\\GameFiles\\Soal\\100.avi";
//                break;
//            case 110:
//                st = "pictures\\Media\\GameFiles\\Soal\\110.avi";
//                break;
//            case 120:
//                st = "pictures\\Media\\GameFiles\\Soal\\120.avi";
//                break;
//            case 130:
//                st = "pictures\\Media\\GameFiles\\Soal\\130.avi";
//                break;
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                st = "pictures\\Media\\GameFiles\\Soal\\" + String.format("%02d", selectedgame) + ".avi";
//                break;
//            case 9:
//                st = "pictures\\Media\\Final\\final1.avi";
////                st = "pictures\\Media\\GameFiles\\Soal\\" + "01" + ".wav";
//                break;
//            case 10:
//                st = "pictures\\Media\\Kashi\\kashiBack.avi";
//                break;
//            case 11:
//                st = "pictures\\cubes\\cubeback.avi";
//                break;
//            case 13:
//                st = "pictures\\Media\\FilmPlay\\film.avi";
//                break;
//            case 14:
//                st = "pictures\\Media\\IranView\\Iran.avi";
//                break;
//
//            case 15:// شخصیت
//                st = "pictures\\Character\\CharBack.avi";
//                break;
//            case 16://تیر کمان
//                st = "pictures\\kaman\\kaman-back.avi";
//                break;
//
//            case 20:// multivchar شخصیت
//                st = "pictures\\charMulti\\charMultiBack.avi";
//                break;
//            case 21:// mp3
//                st = "pictures\\titrajMujsic\\titrajMusic-back.avi";
//                break;
//
//        }
//        return st;
//    }
//
//    public String getselectedFileQpart3First(int selectedgame) {
//        String st = "pictures\\Media\\GameFiles\\Soal\\00_12.avi";
//        switch (selectedgame) {
//            case 0:
//            case 1:
//            case 2:
//                st = "pictures\\Media\\GameFiles\\Soal\\00_12.avi";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                st = "pictures\\Media\\GameFiles\\Soal\\03_45.avi";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                st = "pictures\\Media\\GameFiles\\Soal\\06_78.avi";
//                break;
//        }
//        return st;
//    }
//
//    public String getselectedREturntotvFile(int selectedgame) {
//        String st = "pictures\\Media\\GameFiles\\Back.avi";
//        switch (selectedgame) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                st = "pictures\\Media\\GameFiles\\Soal\\Back.avi";
//                break;
//            case 9:
//            case 11:
//            case 10:
//            case 14:
//            case 13:
//            case 15:
//            case 16:
//            case 20:
//            case 21:
//            case 22:
//                st = "pictures\\Media\\GameFiles\\Back.avi";
//                break;
//        }
//        return st;
//    }
//
//    public String getselectedREturntotvsounds(int selectedgame) {
//        String st = "pictures\\Media\\GameFiles\\Back.wav";
//        switch (selectedgame) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//
//                st = "pictures\\Media\\GameFiles\\Soal\\Back.wav";
//                break;
//            case 9:
//            case 11:
//            case 10:
//            case 14:
//            case 13:
//            case 15:
//            case 16:
//            case 20:
//            case 21:
//            case 22:
//                st = "pictures\\Media\\GameFiles\\Back.wav";
//                break;
//        }
//        return st;
//    }
//
//    public String getselectedsound(int selectedgame) {
//        String st = "pictures\\Media\\GameFiles\\00.wav";
//        switch (selectedgame) {
//
//            case 99:
//                st = "pictures\\Media\\GameFiles\\00.wav";
//                break;
//
//            case 100:
//                st = "pictures\\Media\\GameFiles\\Soal\\100.wav";
//                break;
//            case 110:
//            case 120:
//            case 130:
//                st = "pictures\\Media\\GameFiles\\Soal\\110-120-130.wav";
//                break;
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                st = "pictures\\Media\\GameFiles\\Soal\\" + String.format("%02d", selectedgame) + ".wav";
////                st = "pictures\\Media\\GameFiles\\Soal\\" + "01" + ".wav";
//                break;
//            case 9:
//                st = "pictures\\Media\\Final\\final1.wav";
//                break;
//            case 10:
//                st = "pictures\\Media\\Kashi\\kashiBack.wav";
//                break;
//            case 14:
//                st = "pictures\\Media\\IranView\\Iran.wav";
//                break;
//            case 13:
//                st = "pictures\\Media\\FilmPlay\\film.wav";
//                break;
//            case 11:
//                st = "pictures\\cubes\\cube-music.wav";
//                break;
//            case 15://970315 شخصیت
//                st = "pictures\\Character\\charback.wav ";
//                break;
//            case 16://970315 تیرکمام
//                st = "pictures\\cubes\\cube-music.wav";
//                break;
//            case 20://970315 شخصیتvvv
//                st = "pictures\\charMulti\\charMultimusic.wav ";
//                break;
//            case 21://970315 mp3
//                st = "pictures\\titrajMujsic\\titrajMusic-back.wav";
//                break;
//        }
//        return st;
//    }
//
//    public String ImagKashikari[] = {"pictures\\kashi\\part01.png", "pictures\\kashi\\part02.png", "pictures\\kashi\\part03.png", "pictures\\kashi\\part04.png",
//        "pictures\\kashi\\part05.png", "pictures\\kashi\\part06.png", "pictures\\kashi\\part07.png", "pictures\\kashi\\part08.png"};
//
//    String getselectedRamzShowFile(int selectedid) {
//        String st = "pictures\\Media\\GameFiles\\Rotate\\r" + String.format("%02d", selectedid) + ".avi";
//        System.out.println("st=" + st);
//        return st;
//    }
}
