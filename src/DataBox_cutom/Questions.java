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
public class Questions {

    String question, goz1, goz2, goz3, goz4, pic;
    int correct_goz,time;
    boolean used;

    public Questions() {
        question = "سوال نونه";
        pic = "pictures\\nopic.png";
        goz1 = "گزینه یک";
        goz2 = "کزینه دو";
        goz3 = "گزینه سه";
        goz4 = "گزینه  چهار";
        correct_goz = 2;

        used = false;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGoz1() {
        return goz1;
    }

    public void setGoz1(String goz1) {
        this.goz1 = goz1;
    }

    public String getGoz2() {
        return goz2;
    }

    public void setGoz2(String goz2) {
        this.goz2 = goz2;
    }

    public String getGoz3() {
        return goz3;
    }

    public void setGoz3(String goz3) {
        this.goz3 = goz3;
    }

    public String getGoz4() {
        return goz4;
    }

    public void setGoz4(String goz4) {
        this.goz4 = goz4;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getCorrect_goz() {
        return correct_goz;
    }

    public void setCorrect_goz(int correct_goz) {
        this.correct_goz = correct_goz;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCuurectGoz() {
        String st = goz1;
        switch (correct_goz) {
            case 1:
                st = goz1;
                break;
            case 2:
                st = goz2;
                break;
            case 3:
                st = goz3;
                break;
            case 4:
                st = goz4;
                break;
        }
        return st;
    }
                  
}