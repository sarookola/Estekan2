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
public class Database1 {

    int timerq, timerstart123;
    int  downspeed=8,
            f3Percent = 8,
            f2Percent = 28,
            cubeitemstart = 160,
            cubenumberState[] = {5, 10, 15};
    int x;
    int timeGameCube;
    int poscube[][] = {{0, -50}, {116, -12}, {-114, -12}, {-228, 28}, {0, 26}, {229, 28}, {344, 65}, {116, 65}, {-114, 65}, {-342, 65}, {-228, 102}, {0, 102}, {229, 102}, {-114, 141}, {116, 141}, {0, 178}};
    int posOffset = 150;
    int posm[] = {500, 500, 250, 250};

    public Database1() {
        timeGameCube = 30;
    }

    public int getTimeGameCube() {
        return timeGameCube;
    }

    public void setTimeGameCube(int timeGameCube) {
        this.timeGameCube = timeGameCube;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[][] getPoscube() {
        return poscube;
    }

    public int getPoscubeX(int index) {
        return poscube[index][0];
    }

    public int getPoscubeY(int index) {
        return poscube[index][1];
    }

    public int getPosOffset() {
        return posOffset;
    }

    public int[] getPosm() {
        return posm;
    }

    public int getTimerq() {
        return timerq;
    }

    public void setTimerq(int timerq) {
        this.timerq = timerq;
    }

    public int getTimerstart123() {
        return timerstart123;
    }

    public void setTimerstart123(int timerstart123) {
        this.timerstart123 = timerstart123;
    }

    public int getF3Percent() {
        return f3Percent;
    }

    public void setF3Percent(int f3Percent) {
        this.f3Percent = f3Percent;
    }

    public int getF2Percent() {
        return f2Percent;
    }

    public void setF2Percent(int f2Percent) {
        this.f2Percent = f2Percent;
    }

    public int getCubeitemstart() {
        return cubeitemstart;
    }

    public void setCubeitemstart(int cubeitemstart) {
        this.cubeitemstart = cubeitemstart;
    }

    public int[] getCubenumberState() {
        return cubenumberState;
    }

    public void setCubenumberState(int[] cubenumberState) {
        this.cubenumberState = cubenumberState;
    }

    public void setCubenumberState(int index, int cubenumberState) {
        this.cubenumberState[index] = cubenumberState;
    }

    public int getDownspeed() {
        return downspeed;
    }

    public void setDownspeed(int downspeed) {
        this.downspeed = downspeed;
    }

    enum gameName {
        game1, game2
    }

}
