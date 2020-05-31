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
 * @author Shayan
 */
public class Participant {

    boolean active;
    String pic = "pictures/nopic.png";
    String name[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    int pointTotalx1000 = 0;
    int current_timex100, current_selection, current_changedAnswer, current_pointx1000, current_Speed1234;
    List<Integer> answer;
//    List<Integer> timeOfAnswer;
//    List<Integer> ChangeAnswer;
//    List<Integer> speed1234;
//    List<Integer> speed1234;

    List<Integer> points;

    void questionNew(int time) {
        current_timex100 = time;
        current_selection = 0;
        current_changedAnswer = 0;
        current_pointx1000 = 0;
        current_Speed1234=0;
    }

    void gamesnew() {
        answer = new LinkedList<Integer>();
        points = new LinkedList<Integer>();
        questionNew(0);
    }

    public List<Integer> getAnswer() {
        if (answer == null) {
            gamesnew();
        }
        return answer;
    }

    public void setQuestions(List<Integer> games) {
        if (games == null) {
            gamesnew();
        }
        this.answer = games;
    }

    public void QuestionaddQ(int Question) {
        if (answer == null) {
            gamesnew();
        }
        answer.add(Question);
    }

    public void gamesreset() {
        gamesnew();
        pointTotalx1000 = 0;
    }

    public String getName(int index) {
        return name[index];
    }

    public void setName(int index, String name) {
        this.name[index] = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getPointTotal() {
        return pointTotalx1000;
    }

    public void setPointTotal(int pointTotal) {
        this.pointTotalx1000 = pointTotal;
    }

  
    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> points) {
        this.points = points;
    }



    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


    public int getCurrent_timex100() {
        return current_timex100;
    }

    public void setCurrent_timex100(int current_timex100) {
        this.current_timex100 = current_timex100;
    }

    public int getCurrent_selection() {
        return current_selection;
    }

    public void setCurrent_selection(int current_selection) {
        this.current_selection = current_selection;
    }

    public int getCurrent_changedAnswer() {
        return current_changedAnswer;
    }

    public void setCurrent_changedAnswer(int current_changedAnswer) {
        this.current_changedAnswer = current_changedAnswer;
    }

    public int getCurrent_pointx1000() {
        return current_pointx1000;
    }

    public void setCurrent_pointx1000(int current_pointx1000) {
        this.current_pointx1000 = current_pointx1000;
    }

    public int getCurrent_Speed1234() {
        return current_Speed1234;
    }

    public void setCurrent_Speed1234(int current_Speed1234) {
        this.current_Speed1234 = current_Speed1234;
    }

    public void clearQ() {
        current_timex100 = 0;
        current_selection = 0;
        current_changedAnswer = 0;
        current_pointx1000 = 0;
        current_Speed1234=0;
    }

}
