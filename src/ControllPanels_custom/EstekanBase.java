/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllPanels_custom;

import DataBox_cutom.Database0;
import ControllPanels.Controll;
import DataBox_cutom.Database1;
import DataBox_cutom.database_File_address;
import JSO.Com.DataBox.ControolPack;
import JSO.Com.Main.TimerTimer;
import JSO.Com.Main.TimerUser;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author shayan
 */
public class EstekanBase extends javax.swing.JPanel implements TimerUser {

    //quesinin   
//    String gametvfileName[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "pictures\\Media\\GameFiles\\Soal\\00.avi",};
    /**
     * Creates new form namaMain
     */
    public EstekanBase() {
        initComponents();

    }

    public EstekanBase(Controll controll) {
        newsha = false;
        initComponents();
        this.controll = controll;
        this.controolPack = controll.getControolPack();
        this.database0 = controll.getDatabase();
        datgabaseFileAdd = new database_File_address();
        timer = new TimerTimer(this, 0, 0, 600, 0);
        timer.setWait(100);
        timer.setWaitTimeAbselute(true);
        timer.setActive(true);
        timer.start();

        initPanel();

//        fixFrame = new FixFrame(this, "pictures\\");
//        jTabbedPane1.add("نمایش تصویر ثابت", fixFrame);
        sounds = controll.getSounds();
        newsha = true;

    }
    private boolean newsha;
    private int currentTvId = -100,
            currentgameindex = -100;

    Controll controll;
    TimerTimer timer;
    Sounds2 sounds;
    ControolPack controolPack;
    Database0 database0;
    Database1 database1;
    database_File_address datgabaseFileAdd;
    PanelQuestions panelQuestion;
//    PanelIranQ panelIran;
//    PanelFilmQ panelFilm;
//    PanelWords panelwords;
//    Panel3Bowls panel3bowls;
//    PanelShutter panelShutter;
////    PanelCharacter panelCharacter;
////    PanelKAMAN panelKAMAN;
////    PanelCharacterMulti panelcharacterMulti;
//    PaneltitrMp3 paneltitrMp3;
    Panelparticipants panelparticipants[];
    Panelparticipant_label panelparticipant_label;
    Panelparticipant_label2 panelparticipant_label2;
//
//    PanelIranQuestions panelIranQuestions;
    int participantscount,
            participantCurrent = 0;

    boolean activeGotoGamex, activeComeBacktoTv;
    //boolean timeQactive, gotoactive;
    //  long gotoactiveator;
    long timecurrent;

    boolean activeshowGozsQ, activeTimeTOTALpoint;
    int activeshowGozstime;
    long activeshowGozstimeholde, TimeTOTALpoint, TimeTOTALpointFix;

    Tv_1to20[] tv_1to20s;
//    int gameQselectindex;
    boolean b;

    void nof() {
        b = newsha;
        newsha = false;
    }

    void non() {
        newsha = b;
    }

    private void initPanel() {
        activeGotoGamex = true;
        activeComeBacktoTv = false;
//        timeQactive = false;
//        gotoactive = false;
        activeshowGozsQ = false;
        panelQuestion = new PanelQuestions(this);
//        panelIran = new PanelIranQ(this);
//        panelFilm = new PanelFilmQ(this);
//        panelwords = new PanelWords(this);
//        panel3bowls = new Panel3Bowls(this);
//        panelIranQuestions = new PanelIranQuestions(this);
//        panelShutter = new PanelShutter(this);
//
////        panelCharacter = new PanelCharacter(this);
////        panelKAMAN = new PanelKAMAN(this);
////        panelcharacterMulti = new PanelCharacterMulti(this);
//        paneltitrMp3 = new PaneltitrMp3(this);

        jTabbedPaneGames.add(panelQuestion, database0.getGamename(0));
//        jTabbedPaneGames.add(panelIran, database0.getGamename(1));
//        jTabbedPaneGames.add(panelFilm, database0.getGamename(2));
//        jTabbedPaneGames.add(panelwords, database0.getGamename(3));
//        jTabbedPaneGames.add(panel3bowls, database0.getGamename(4));
////        jTabbedPaneGames.add(panelCharacter, database0.getGamename(5));
////        jTabbedPaneGames.add(panelKAMAN, " کمان");
////        jTabbedPaneGames.add(panelcharacterMulti, database0.getGamename(6));
//        jTabbedPaneGames.add(paneltitrMp3, database0.getGamename(5));
//        jTabbedPaneGames.add(panelIranQuestions, database0.getGamename(6));
//        jTabbedPaneGames.add(panelShutter, database0.getGamename(7));
//
//        jTabbedPaneGames.add(new PanelPrizes(this), "جایزه ");

        tv_1to20s = new Tv_1to20[5];
        for (int i = 0; i < 5; i++) {
//            JButton j = new JButton(""+i);
//            j.setActionCommand("ggg");
//            System.out.println("j="+jPanelList);
            tv_1to20s[i] = new Tv_1to20(i, this);
            jPanelList.add(tv_1to20s[i]);
        }

        participantscount = database0.getParticipants().length;
        panelparticipants = new Panelparticipants[participantscount - 2];
        for (int i = 0; i < participantscount - 2; i++) {
            panelparticipants[i] = new Panelparticipants(i, this);
            jPanelParicipants.add(panelparticipants[i]);
//            panelparticipants[i].jToggleButtoniN.setText("> " + (i + 1) + " <");
            panelparticipants[i].setpointTotal(database0.getParticipants(i).getPointTotal());
//            buttonGroupParticipantactive.add(panelparticipants[i].jToggleButtoniN);

        }
        panelparticipant_label = new Panelparticipant_label(participantscount - 2, this);
        jPanelParicipants.add(panelparticipant_label);

        panelparticipant_label2 = new Panelparticipant_label2(participantscount - 1, this);
        jPanelParicipants.add(panelparticipant_label2);

        participantscount = database0.getParticipantCount();
        jSpinnerParticipantCouint.setValue(participantscount);
//        jTextFieldarticipant1.setText(database0.getParticipants(0).getName(0));
//        jTextFieldarticipant2.setText(database0.getParticipants(1).getName(0));
//        jTextFieldarticipant3.setText(database0.getParticipants(2).getName(0));

        TimeTOTALpointFix = database0.getTimerFixstop();
        setparticipants(false);
        updateUI();

    }

    public boolean isNewsha() {
        return newsha;
    }

    public void setNewsha(boolean newsha) {
        this.newsha = newsha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGameName = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPaneGames = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSpinnerParticipantCouint = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelParicipants = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jToggleButtonparticipantSHOWHIDE = new javax.swing.JToggleButton();
        jToggleButtonparticipantclear = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelList = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButtonGameSelected = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("ریست");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10);

        jSpinnerParticipantCouint.setModel(new javax.swing.SpinnerNumberModel(3, 2, 3, 1));
        jPanel7.add(jSpinnerParticipantCouint);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("چند نفر");
        jPanel7.add(jLabel1);

        jPanel6.add(jPanel7);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPaneGames.addTab("شروع و ریست", jPanel25);

        jPanel2.add(jTabbedPaneGames);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanelParicipants.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(0, 1));

        jToggleButtonparticipantSHOWHIDE.setText("ON/OFF");
        jToggleButtonparticipantSHOWHIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonparticipantSHOWHIDEActionPerformed(evt);
            }
        });
        jPanel8.add(jToggleButtonparticipantSHOWHIDE);

        jToggleButtonparticipantclear.setText("CLEAR");
        jToggleButtonparticipantclear.setActionCommand("0");
        jToggleButtonparticipantclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonparticipantclearActionPerformed(evt);
            }
        });
        jPanel8.add(jToggleButtonparticipantclear);

        jButton2.setText("calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jButton3.setText("Add To");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6);

        jPanelParicipants.add(jPanel8);

        jTabbedPane1.addTab("Participants", jPanelParicipants);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanelList.setLayout(new java.awt.GridLayout(0, 2));
        jPanel4.add(jPanelList);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        jButtonGameSelected.setText("اطلاعات عمومی");
        jButtonGameSelected.setPreferredSize(new java.awt.Dimension(130, 25));
        jButtonGameSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGameSelectedActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonGameSelected);

        jPanel5.add(jPanel9, java.awt.BorderLayout.WEST);

        jPanel31.setLayout(new java.awt.GridLayout(0, 1));
        jPanel5.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel3);

        jTabbedPane1.addTab("Questions", jPanel1);

        jPanel11.add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        add(jPanel11, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (newsha) {
            resetAllGame();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGameSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGameSelectedActionPerformed
        // TODO add your handling code here:
        if (newsha) {
            returnFromGame();
        }
    }//GEN-LAST:event_jButtonGameSelectedActionPerformed

    private void jToggleButtonparticipantclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonparticipantclearActionPerformed
        // TODO add your handling code here:
//        participantselect(0);
    }//GEN-LAST:event_jToggleButtonparticipantclearActionPerformed

    private void jToggleButtonparticipantSHOWHIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonparticipantSHOWHIDEActionPerformed
        // TODO add your handling code here:
        if (newsha) {
            participantOnOff();
        }
    }//GEN-LAST:event_jToggleButtonparticipantSHOWHIDEActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (newsha) {
            updatedatabase();
            updatecontrolpack(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (newsha) {
            calculatePoint(panelQuestion.getSelectedGoz() == panelQuestion.getCorrectGoz());
            updatecontrolpack(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        addTotal();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGameName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonGameSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelParicipants;
    private javax.swing.JSpinner jSpinnerParticipantCouint;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneGames;
    private javax.swing.JToggleButton jToggleButtonparticipantSHOWHIDE;
    private javax.swing.JToggleButton jToggleButtonparticipantclear;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updatetime(long time) {
//        System.out.println("time=" + time);
        long x = time - timecurrent;
        timecurrent = time;
//        if (gotoactive) {
//            if ((timecurrent - gotoactiveator) > 500) {
////                gotogame();
//                gotoactive = false;
//            }
//        }
        if (activeTimeTOTALpoint) {
            if ((timecurrent - TimeTOTALpoint) >= TimeTOTALpointFix) {
                TimeTOTALpoint = TimeTOTALpoint + TimeTOTALpointFix;

                //نمایش در صفحه و صدا و ...
                if (panelparticipants[0].getPoint() == 0 && panelparticipants[1].getPoint() == 0 && panelparticipants[2].getPoint() == 0 && panelparticipants[3].getPoint() == 0) {
                    activeTimeTOTALpoint = false;
                }
            }
        }
        if (activeshowGozsQ) {
            if ((timecurrent - activeshowGozstimeholde) > activeshowGozstime) {
                switch (currentgameindex) {
                    case 0:
                        panelQuestion.showGameQandGoz();
                        sounds.playGame(currentgameindex);
                        break;
//                    case 1:
//                        panelIran.jToggleButtonDidan0.setSelected(true);
//                        panelIran.showqIranax(true);
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 2:
//                        panelFilm.filmready();
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 3:
//                        panelwords.jToggleButtonShowSetselected(true);
//                        panelwords.mainShow(true);
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 4:
//                        panel3bowls.resetgame();
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 5:
//                        paneltitrMp3.startgame();
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 6:
//                        panelIranQuestions.showGameQandGoz();
//                        sounds.playGame(currentgameindex);
//                        break;
//                    case 7:
//                        panelShutter.sTARTGAME();
//                        sounds.playGame(currentgameindex);
//                        break;

                    default:

                        break;

                }
                activeshowGozsQ = false;
            }
        }

//        if (timeQactive && ((timecurrent - timeQstart) > database0.getTimeGameq())) {
//            timeGameQended();
//
//        }
    }

    void activeshowGozsQSet(boolean active, int time) {
        activeshowGozsQ = active;
        activeshowGozstime = time;
        activeshowGozstimeholde = timecurrent;
    }

    void activeGotoGame(boolean b, String st
    ) {
        activeGotoGamex = b;
//        activeComeBacktoTv = false;
        if (b) {
            jButtonGameSelected.setText(st);
            jButtonGameSelected.setForeground(Color.BLUE);
        } else if (!activeComeBacktoTv) {
            jButtonGameSelected.setText(st);
            jButtonGameSelected.setForeground(Color.RED);
        }

    }

    void activeGotoGame(boolean b) {
        activeGotoGamex = b;
        if (b) {
            jButtonGameSelected.setForeground(Color.BLUE);
        } else {
            jButtonGameSelected.setForeground(Color.RED);
        }
//        activeComeBacktoTv = false;
    }

    void activeTvComeBack(boolean b) {
        activeComeBacktoTv = b;
        if (b) {
            activeGotoGamex = false;
            jButtonGameSelected.setForeground(new Color(0, 100, 0));
        } else if (!activeGotoGamex) {
            jButtonGameSelected.setText(" انتخاب ");
            jButtonGameSelected.setForeground(Color.RED);
        }
    }

    void activeTvComeBack(boolean b, String st) {
        jButtonGameSelected.setText(st);
        activeTvComeBack(b);
    }
//
//    private void gameQselected() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGsmeQ.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(100);
//                jPanel8.setVisible(true);
//                jPanel15.setVisible(true);
//                jPanel6.setVisible(false);
//                questionBoxisactiveOrnot();
//                jTabbedPaneGames.setSelectedIndex(1);
//                activeGotoGame(true, jToggleButtonGsmeQ.getText());
//                controll.saveDatabase0();
//
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//            controll.saveDatabase0();
//        }
//
//    }
//
//    private void startGameBytvno(int id, int selectedgame) {
////        System.out.println("selectedgame=" + selectedgame);
//
//        switch (selectedgame) {
//            case 100:
//                activeGotoGame(false);
//                gotogamex(id, selectedgame);
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//            case 9:
//                activeGotoGame(false);
//                panelQuestion.setSelectedBasket(9);
//                panelQuestion.resetTime(database0.getTimeGameFinal());
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
////                gotoactive = true;
////                gotoactiveator = timecurrent;
//                break;
//            case 99:
//                JOptionPane.showMessageDialog(null, "بازی را انتخاب نکرده ای");
//                break;
//            case 10:
////                panelwords.resetAll();
//                panelwords.jToggleButtonShowSetselected(false);
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//            case 13:
////                panelFilm.resetall();
//                panelFilm.jToggleButtonShowSetselected(false);
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//            case 14:
////                panelIran.resetall();
//                panelIran.jToggleButtonShowSetselected(false);
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//
//            case 11:
////                panelIran.resetall();
////                panelIran.jToggleButtonShowSetselected(false);
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//
//            case 15:
//            case 20:
//            case 21:
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//            case 16:
//                gotogamex(id, selectedgame);
//                currentTvId = id;
//                activeTvComeBack(true, String.valueOf(id + 1));
//                gotoactive = true;
//                gotoactiveator = timecurrent;
//                break;
//            default:
//
//                break;
//
//        }
//
//    }
//

//
//    private void qgametopart2(int selectedgame) {
//
////        controolPack.getDatapacMovie().add(new DataPackString(5, "pictures\\Media\\GameFiles\\" + String.format("%02d", id+1) + ".avi"));
//        controolPack.getDatapacMovie().add(new DataPackString(6, database0.getselectedFile(selectedgame)));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, true));
////        DataPackanimationStartEnd x = new DataPackanimationStartEnd(6, 100, -84, 97);
////        x.setSequence(false);
////        controolPack.getDataPackanimationStartEnds().add(x);
//        controll.getControllCommandSet().movieOnlyShow(6);
//        sounds.playLong(database0.getselectedsound(selectedgame));
//    }
//
//    private void qgametopart3(int selectedgame) {
//
//        Questions q = panelQuestion.getqAndUsed(false);
//        qgameUpdate(false, q);
////        controolPack.getDatapacMovie().add(new DataPackString(5, database0.getselectedFileQpart3First(selectedgame)));
//        controolPack.getDatapacMovie().add(new DataPackString(6, database0.getselectedFile(selectedgame)));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, true));
////        DataPackanimationStartEnd x = new DataPackanimationStartEnd(6, 100, -115, 5000);
////        x.setSequence(false);
////        controolPack.getDataPackanimationStartEnds().add(x);
////        controll.getControllCommandSet().qgamepart3();
//        controll.getControllCommandSet().showQuestionpart3(selectedgame);
////        timeQactive = true;
////        timeQstart = timecurrent;
//        sounds.playLong(database0.getselectedsound(selectedgame));
//        activeshowGozsQSet(true, 5000);
//
//    }
//
//
//    void qgameUpdate(boolean sendOrno, Questions q, int time) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        controolPack.getDatapackString().add(new DataPackString(b + 10, String.valueOf(time)));
//        qgameUpdate(sendOrno, q);
//    }
//
//    void qgameUpdate(boolean sendOrno, Questions q) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        controolPack.getDatapackString().add(new DataPackString(b + 1, q.getAnswer()));
//        controolPack.getDatapackString().add(new DataPackString(b + 3, q.getGoz1()));
//        controolPack.getDatapackString().add(new DataPackString(b + 5, q.getGoz2()));
//        controolPack.getDatapackString().add(new DataPackString(b + 7, q.getGoz3()));
//        if (sendOrno) {
//            controll.SendControolPack();
//        }
//    }
//
//    private void timeGameQended() {
//        timeQactive = false;
//    }
//
//    void gameQselect(int i) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        int addforfinalQ = 0;
//        if (database0.getSelectedgame() == 9) {
//            addforfinalQ = 3;
//        }
//        controll.getControllCommandSet().imageVisMotionAndSend(true, b - 1, addforfinalQ + i + 1);
//
//    }
//
//    void gameQShowAnswer(boolean gozselected, int gozSelectedN, int correct_goz) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        controll.getControllCommandSet().imageVisPlayMotion(false, b + 15, 0);  //endtime
//
//        int addforfinalQ = 0;
//        if (database0.getSelectedgame() == 9) {
//            addforfinalQ = 3;
//        }
//        controll.getControllCommandSet().playMotion(b - 1, 0);
//        if (gozselected && (gozSelectedN + 1 != correct_goz)) {
//
//            controll.getControllCommandSet().imagePlayseq(b - 3, addforfinalQ + gozSelectedN + 1);
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b - 3, addforfinalQ + gozSelectedN + 1, addforfinalQ + gozSelectedN + 1));
//            controll.getControllCommandSet().imageVisPlayMotion(true, b - 3, addforfinalQ + gozSelectedN + 1);
//        }
//        controll.getControllCommandSet().imagePlayseq(b - 2, correct_goz + addforfinalQ);
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b - 2, correct_goz + addforfinalQ, correct_goz + addforfinalQ));
//        controll.getControllCommandSet().imageVisPlayMotion(true, b - 2, correct_goz + addforfinalQ);
//
//        controll.SendControolPack();
//        if (gozselected && gozSelectedN + 1 == correct_goz) {
//            sounds.playWinNonStop();
//        } else {
//            sounds.playRedNonStop();
//        }
//    }
//
//    void gameQShow(Questions q, int i, boolean selected) {
//
//        qgameUpdate(false, q);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int item = b + 1, motion = 0;
//
//        switch (i) {
//            case 0:
//                item = b + 1;
//                break;
//            case 1:
//                item = b + 3;
//                break;
//            case 2:
//                item = b + 5;
//                break;
//            case 3:
//                item = b + 7;
//                break;
//
//        }
//        int addtoDimForFinalQ = 0;
//        if (database0.getSelectedgame() == 9) {
//            addtoDimForFinalQ = 2;
//        }
//        if (selected) {
//            motion = 1 + addtoDimForFinalQ;
//        } else {
//            motion = 2 + addtoDimForFinalQ;
//        }
//        controll.getControllCommandSet().VisplayText(item, motion);
//    }
//
//    void gameQShow(Questions q, boolean showHide) {
//        if (showHide) {
//            qgameUpdate(false, q);
//            int b = database0.getSettingitemIdforQuestions();//30
//            int motionIn = 1;
//            if (database0.getSelectedgame() == 9) {
//                motionIn = 3;
//            }
//            controll.getControllCommandSet().showQandGs(b, motionIn);
//        } else {
//            int b = database0.getSettingitemIdforQuestions();//30
//            int motionIn = 2;
//            if (database0.getSelectedgame() == 9) {
//                motionIn = 4;
//            }
//            controll.getControllCommandSet().showQandGs(b, motionIn);
//        }
//    }
//
//
//    private void game10_13_14_goto() {
//        controolPack.getDatapacMovie().add(new DataPackString(5, "pictures\\Media\\GameFiles\\" + String.format("%02d", currentTvId + 1) + ".avi"));
//        DataPackanimationStartEnd x = new DataPackanimationStartEnd(6, 100, -85, 3700);
//        x.setSequenceNotMovie(false);
//        x.setLive(true);
//        x.setPlay(false);
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(5, true, false));
////                controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, false));
//        controolPack.getDataPackanimationStartEnds().add(x);
//
////        controolPack.getGameData().setPlayStop(false);
//        controll.SendControolPack();
////        controolPack.getGameData().setPlayStop(true);
//    }
//
//    private void gameFinalselected() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGameFinal.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(9);
//                jTabbedPaneGames.setSelectedIndex(1);
//                startGameBytvno(13, database0.getSelectedgame());
////                activeGotoGame(true, jToggleButtonGameFinal.getText());
//
//                database0.getTv(13).setSelected(true);
//                database0.getTv(13).setCodeOn(true);
//                controll.saveDatabase0();
//
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//   
//
//    void qgameIranUpdate(boolean sendOrno, QIran currentQuestion, int time) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        controolPack.getDatapackString().add(new DataPackString(b + 13, currentQuestion.getAnswer()));
//        controolPack.getDatapackImage().add(new DataPackString(b, currentQuestion.getqIranAx()));
//        controolPack.getDatapackString().add(new DataPackString(b + 3, currentQuestion.getGoz1()));
//        controolPack.getDatapackString().add(new DataPackString(b + 5, currentQuestion.getGoz2()));
//        controolPack.getDatapackString().add(new DataPackString(b + 7, currentQuestion.getGoz3()));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 4, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 6, 0, 0));
//
//        controolPack.getDatapackString().add(new DataPackString(b + 10, String.valueOf(time)));
//
//        if (sendOrno) {
//            controll.SendControolPack();
//        }
//    }
//
//    void qgameFilmUpdate(boolean sendOrno, QFilm currentQuestion, int time) {
//        int b = database0.getSettingitemIdforQuestions();//30
////        controolPack.getDatapackImage().add(new DataPackString(b, currentQuestion.getQfilm()));
//        controolPack.getDatapackString().add(new DataPackString(b + 13, currentQuestion.getAnswer()));
//        controolPack.getDatapackString().add(new DataPackString(b + 3, currentQuestion.getGoz1()));
//        controolPack.getDatapackString().add(new DataPackString(b + 5, currentQuestion.getGoz2()));
//        controolPack.getDatapackString().add(new DataPackString(b + 7, currentQuestion.getGoz3()));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 4, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 6, 0, 0));
//        controolPack.getDatapackString().add(new DataPackString(b + 10, String.valueOf(time)));
//
//        if (sendOrno) {
//            controll.SendControolPack();
//        }
//    }
//
//    void gameQIranShow(QIran currentQuestion, int time, boolean showHide) {
//
//        qgameIranUpdate(false, currentQuestion, time);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQIranQ(b, 01, motionIn, 11);
//        } else {
//            controll.getControllCommandSet().showQIranQ(b, 02, motionIn + 1, 12);
//        }
//
//    }
//
//    void gameQFilmShow(QFilm currentQuestion, int time, boolean showHide) {
//
//        qgameFilmUpdate(false, currentQuestion, time);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQFilmQ_goz(b, 01, motionIn, 11);
//        } else {
//            controll.getControllCommandSet().showQFilmQ_goz(b, 02, motionIn + 1, 12);
//        }
//
//    }
//
//    void gameQIranandFilmShowGoz(int goz, boolean showHide) {
//
////        qgameIranUpdate(false, currentQuestion);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQIranandFilmGoz(b + goz * 2, 01, motionIn, 11);
//        } else {
//            controll.getControllCommandSet().showQIranandFilmGoz(b + goz * 2, 02, motionIn + 1, 12);
//        }
//
//    }
//
//    void gameQIranShowPic(boolean showHide) {
//
////        qgameIranUpdate(false, currentQuestion);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQIranPic(b, 01, motionIn, 11);
//        } else {
//            controll.getControllCommandSet().showQIranPic(b, 02, motionIn + 1, 12);
//        }
//
//    }
//
//    void gameQFilmShowFilmSHowReady(QFilm currentQuestion, int time, boolean showHide) {
////        controolPack.getGameData().setActiveOrDead(false);
//        int b = database0.getSettingitemIdforQuestions();//30
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b, false, false));
//        controll.SendControolPack();
//
//        controolPack.getDatapackImage().add(new DataPackString(b, database0.getBlackPic()));
//        controolPack.getDataPackffmpegmovie().add(new DataPackString(b, currentQuestion.getQfilm()));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b, true, false));
//
//        qgameFilmUpdate(true, currentQuestion, time);
//
//    }
//
//    void gameSoundsSHowReady(QFilm currentQuestion, int time, boolean showHide) {
//        if (newsha) {
//            try {
//                String strings[] = {currentQuestion.getQfilm(), currentQuestion.getQfilm()};
//                jlp player = jlp.createInstance(strings);
//                player.play();
//            } catch (JavaLayerException ex) {
//                Logger.getLogger(EstekanBase.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//    void gameQFilmShowFilmSHowGo(QFilm currentQuestion, int time, boolean showHide) {
//
////          int b = database0.getSettingitemIdforQuestions();//30
////        if (showHide) {
////            controolPack.getDatapackImage().add(new DataPackString(b, database0.getBlackPic()));
////            controolPack.getDataPackffmpegmovie().add(new DataPackString(b, currentQuestion.getQfilm()));
////            controolPack.getGameData().setActiveOrDead(true);
////            controolPack.getGameData().setPlayStop(false);
////        } else {
////            controolPack.getGameData().setActiveOrDead(false);
////        }
////
////        qgameFilmUpdate(false, currentQuestion, time);
//        int b = database0.getSettingitemIdforQuestions();//30
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b, true, showHide));
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQFilmQ(b, 01, motionIn, 11); //30  1  5  11
//        } else {
//            controll.getControllCommandSet().showQFilmQ(b, 02, motionIn + 1, 12);
//        }
//    }
//
//    void gameQIranselect(int i) {
//        int b = database0.getSettingitemIdforQuestions();//30
//
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2 + i * 2, 3, 3));
//
//        controll.getControllCommandSet().imagePlayseq(b + 2 + i * 2, 0);
//        sounds.playYellow();
//
//    }
//
//    void gameQIranShowAnswer(boolean gozselected, int gozSelectedN, int correct_goz) {
//        int b = database0.getSettingitemIdforQuestions();//30
//        controll.getControllCommandSet().imageVisPlayMotion(false, b + 15, 0);  //endtime
//        if (gozselected || gozSelectedN != correct_goz + 1) {
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2 + gozSelectedN * 2, 1, 1));
//        }
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + correct_goz * 2, 2, 2));
//        controll.getControllCommandSet().gameQIranShowAnswer(0, 7);
//        if (gozselected && gozSelectedN == correct_goz - 1) {
//            sounds.playWin();
//        } else {
//            sounds.playRed();
//        }
//
//    }
//
//    void gameQFilmShowAnswer(boolean gozselected, int gozSelectedN, int correct_goz) {
//        gameQIranShowAnswer(gozselected, gozSelectedN, correct_goz);
//    }
//
//    private void gameIranselect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGameIran.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(14);
//                jTabbedPaneGames.setSelectedIndex(2);
////                panelIran.reselectQIndex();
//                panelIran.resetall();
//                activeGotoGame(true, jToggleButtonGameIran.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//    private void gameCubeSelect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGamecube.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(11);
//                jTabbedPaneGames.setSelectedIndex(5);
////                panelIran.reselectQIndex();
//                panel3bowls.resetall();
//                activeGotoGame(true, jToggleButtonGamecube.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//    private void gameKashiselect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGameKashi.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(10);
//                jTabbedPaneGames.setSelectedIndex(4);
////                panelwords.reselectQIndex();
//                panelwords.resetAll();
//                activeGotoGame(true, jToggleButtonGameKashi.getText());
//
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//            controll.saveDatabase0();
//        }
//    }
//
//    private void gameFilmselect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonGameFilm.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(13);
//                jTabbedPaneGames.setSelectedIndex(3);
////                panelFilm.reselectQIndex();
//                panelFilm.resetall();
//                activeGotoGame(true, jToggleButtonGameFilm.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//    private void gameCharselect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonChar.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(15);
//                jTabbedPaneGames.setSelectedIndex(6);
////                panelFilm.reselectQIndex();
//                panelCharacter.resetall();
//                activeGotoGame(true, jToggleButtonChar.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//    private void gameCharMultiselect() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtoncharMulti.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(20);
//                jTabbedPaneGames.setSelectedIndex(8);
////                panelFilm.reselectQIndex();
//                panelcharacterMulti.resetall();
//                activeGotoGame(true, jToggleButtoncharMulti.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
////        System.out.println("970714-selectedgame="+ database0.getSelectedgame());
//    }
//
//    private void gametitrmp3() {
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonMp3.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(21);
//                jTabbedPaneGames.setSelectedIndex(9);
//                paneltitrMp3.resetall();
//                activeGotoGame(true, jToggleButtonMp3.getText());
//            } else {
//            }
//        }
//        controll.saveDatabase0();
//    }
//
//    void QkashiShowStart(int settingitemIdforkashi, int time, int point) {
//        qgamekashiUpdate(false, time, point);
//        controll.getControllCommandSet().QkashiShowStart(database0.getSettingitemIdforkashi());
//    }
//
//    void qgamekashiUpdate(boolean sendOrno, int time, int point) {
//        int b = database0.getSettingitemIdforkashi();
////        controolPack.getDatapackImage().add(new DataPackString(b, currentQuestion.getqIranAx()));
//        controolPack.getDatapackString().add(new DataPackString(b + 3, String.valueOf(time)));
//        controolPack.getDatapackString().add(new DataPackString(b + 5, String.valueOf(point)));
//
//        if (sendOrno) {
//            controll.SendControolPack();
//        }
//    }
//
//    void QkashiShowparting(int settingitemIdforkashi, int time, int point) {
//        qgamekashiUpdate(false, time, point);
//        controll.getControllCommandSet().QkashiShowparted(database0.getSettingitemIdforkashi());
//    }
//
//    void QkashiShowCorrect(int settingitemIdforkashi, int selectedkashi, int motion, int time, int point) {
//        qgamekashiUpdate(false, time, point);
//        controll.getControllCommandSet().QkashiShowpartselectCorrectOrWrong(database0.getSettingitemIdforkashi(), selectedkashi, motion);
//    }
//
//    private void ss() {
//
//        // TODO add your handling code here:
//        FileReader fileReader = null;
//        BufferedReader reader = null;
//
//        java.awt.FileDialog fd = new java.awt.FileDialog(new JFrame(" question file"), "سوال خوان", java.awt.FileDialog.LOAD);
////fd.setMultipleMode(true);
////        fd.setDirectory("\\src\\");
//        fd.setVisible(true);
//
//        if (fd.getFile() == null) {
//            return;
//        } else {
//
//            File file = fd.getFiles()[0];
//
//            controolPack.getDataPackffmpegmovie().add(new DataPackString(200, file.getAbsolutePath()));
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(200, true, false));
//
//            controll.getControllCommandSet().imageVisMotionAndSend(true, 200, 0);
//        }
//    }
//
//    private void ss2() {
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(200, true, true));
//        controll.getControllCommandSet().imageVisMotionAndSend(true, 200, 0);
//    }
//
//    private void ramzOnAll() {
//        for (int i = 0; i < database0.getTv().length; i++) {
////           
//            database0.getTv(i).setCodeOn(true);
////            tv_1to20s[i].showRamz_NotNewsha();
//        }
//        controll.getControllCommandSet().showAllRamz();
//        controll.getSounds().playBROOmand22();
//    }
//
//    private void gotogame() {
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(5, true, true));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, true));
//        controll.getControllCommandSet().startgototvQ();
//        sounds.playLong(database0.getselectedsound(database0.getSelectedgame()));
//        controolPack.getDatapackImage().add(new DataPackString(5, database0.getbacktv()));
//    }
//
//    private void teset() {
//        controll.getControllCommandSet().showcubetest();
//    }
//
//    void qgameCharUpdate(boolean sendOrno, Qchar currentQuestion, int time) {
//
//        int b = database0.getSettingitemIdforQuestions();//30//30
//        controolPack.getDatapackString().add(new DataPackString(b + 13, currentQuestion.getAnswer()));
//        controolPack.getDatapackImage().add(new DataPackString(b, controll.getDatabase().getBlackPic()));
////        controolPack.getDatapackImage().add(new DataPackString(b, controll.getDatabase9703().getQcharSendPic()));
//        controolPack.getDatapackString().add(new DataPackString(b + 3, currentQuestion.getGoz1()));
//        controolPack.getDatapackString().add(new DataPackString(b + 5, currentQuestion.getGoz2()));
//        controolPack.getDatapackString().add(new DataPackString(b + 7, currentQuestion.getGoz3()));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 4, 0, 0));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 6, 0, 0));
//
//        controolPack.getDatapackString().add(new DataPackString(b + 10, String.valueOf(time)));
//
//        if (sendOrno) {
//            controll.SendControolPack();
//        }
//
//    }
//
//    void gameQcharShowGoz(Qchar currentQuestion, int time, boolean showHide) {
//
//        qgameCharUpdate(false, currentQuestion, time);
//        int b = database0.getSettingitemIdforQuestions();//30//30
//        int motionIn = 8;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQIranQ(b, 03, motionIn, 11);//30 3-4  8-9  1112
//        } else {
//            controll.getControllCommandSet().showQIranQ(b, 04, motionIn + 1, 12);
//        }
//
//    }
//
//    void gameQcharShowAnswer(boolean gozselected, int gozSelectedN, int correct_goz) {
//
////        gameQIranShowAnswer( gozselected,  gozSelectedN,  correct_goz) ;
//        int b = database0.getSettingitemIdforQuestions();//30
//        controll.getControllCommandSet().imageVisPlayMotion(false, b + 15, 0);  //endtime
//        if (gozselected || gozSelectedN != correct_goz + 1) {
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + 2 + gozSelectedN * 2, 1, 1));
//        }
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b + correct_goz * 2, 2, 2));
//        controll.getControllCommandSet().gameQIranShowAnswer(5, 10);
//        if (gozselected && gozSelectedN == correct_goz - 1) {
//            sounds.playWin();
//        } else {
//            sounds.playRed();
//        }
//
//    }
//
//    void gameQcharShowPic(boolean showHide) {
//
////        qgameIranUpdate(false, currentQuestion);
//        int b = database0.getSettingitemIdforQuestions();//30
//        int motionIn = 5;
//
//        if (showHide) {
//            controll.getControllCommandSet().showQIranPic(b, 03, motionIn, 13);// 30  3-4    5-6    13-14
//        } else {
//            controll.getControllCommandSet().showQIranPic(b, 04, motionIn + 1, 14);
//        }
//
//    }
//
//    private void gameKAMANselect() {
//
//        if (activeGotoGamex && !activeComeBacktoTv) {
//            if (jToggleButtonKAMAN.isSelected()) {
//                jButtonGameSelected.setSelected(false);
//                database0.setSelectedgame(16);
//                jTabbedPaneGames.setSelectedIndex(7);
////                panelFilm.reselectQIndex();
////                panelKAMAN.resetall();
//                activeGotoGame(true, jToggleButtonKAMAN.getText());
//            } else {
////            jPanel8.setVisible(false);
////              activeGotoGame(false, " *** ");
//
//            }
//        }
//        controll.saveDatabase0();
//    }
    boolean tv20Active(int id, int selectedIndex) {
        if (activeGotoGamex) {
            currentTvId = id;
            currentgameindex = tv_1to20s[id].getGameindex();
            startgameFrom();
            if (participantCurrent != 0) {
//                panelparticipants[participantCurrent - 1].setgamepoint((currentTvId + 1) * 10);
                database0.getParticipants(participantCurrent - 1).QuestionaddQ(id);
            }
            return true;
        } else {
            return false;
        }
    }

    private void setparticipants(boolean send) {
        participantscount = (int) jSpinnerParticipantCouint.getValue();
        database0.setParticipantCount(participantscount);

        controll.saveDatabase0();
//        if (participantscount == 2) {
//            panelparticipants[2].setVisible(false);
//        } else {
//            panelparticipants[2].setVisible(true);
//        }
        if (send) {
            controll.SendControolPack();
        }
    }
//  private void qgametopart3(int selectedgame) {
//
//        Questions q = panelQuestion.getqAndUsed(false);
//        qgameUpdate(false, q);
////        controolPack.getDatapacMovie().add(new DataPackString(5, database.getselectedFileQpart3First(selectedgame)));
//        controolPack.getDatapacMovie().add(new DataPackString(6, database.getselectedFile(selectedgame)));
//        controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, true));
////        DataPackanimationStartEnd x = new DataPackanimationStartEnd(6, 100, -115, 5000);
////        x.setSequence(false);
////        controolPack.getDataPackanimationStartEnds().add(x);
////        controll.getControllCommandSet().qgamepart3();
//        controll.getControllCommandSet().showQuestionpart3(selectedgame);
////        timeQactive = true;
////        timeQstart = timecurrent;
//        sounds.playLong(database.getselectedsound(selectedgame));
//        activeshowGozsQSet(true, 5000);
//
//    }
//   public void gameQShow() {
//        if (activeGotoGamex) {
//            panelQuestion.resetTime();
//            qgametopart3(database.getSelectedgame());
//            activeTvComeBack(true, String.valueOf(currentTvId + 1));
//            jPanel6.setVisible(false);
//            checkmainquestionBoxx();
//        }
//    }

    private void startgameFrom() {
//       System.out.println("980413-startgame =" + currentgameindex);
//        if (activeGotoGamex) {
        switch (currentgameindex) {
            case 0:
                activeGotoGame(false);

                setgamepointforquestion(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
                activeTvComeBack(true, database0.getGamename(currentgameindex));
                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
                setlink95(database0.getSettingitemIdforgame(currentgameindex));
                controll.getControllCommandSet().startgamequestionFrom(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
                panelQuestion.setSelectedBasket(currentTvId);
                panelQuestion.resetTime();
                sounds.playWipin();
//                sounds.playGame(currentgameindex);
                break;

//            case 1:
//                activeGotoGame(false);
//
////        database.setSelectedgame(s);
////        panelQuestion.activeShow(true);
////        activeGotoGame(true, database.getqBAsketname(database.getSelectedgame()));
////        jToggleButtonActiveGozs.setText(String.valueOf(currentTvId + 1));
////        gameQShow();
////                setgamepointfor4first(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                setlink95(database0.getSettingitemIdforgame(currentgameindex));
//                controll.getControllCommandSet().startgameIranFrom(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panelIran.setSelectedBasket(currentTvId);
//                sounds.playWipin();//  sounds.playGame(currentgameindex);
//                break;
//
//            case 2:
//                activeGotoGame(false);
//
////        database.setSelectedgame(s);
////        panelQuestion.activeShow(true);
////        activeGotoGame(true, database.getqBAsketname(database.getSelectedgame()));
////        jToggleButtonActiveGozs.setText(String.valueOf(currentTvId + 1));
////        gameQShow();
////                setgamepointfor4first(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                setlink95(database0.getSettingitemIdforgame(currentgameindex));
//                controll.getControllCommandSet().startgameIranFrom(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panelFilm.setSelectedBasket(currentTvId);
//                sounds.playWipin();//     sounds.playGame(currentgameindex);
//                break;
//            case 3:
//                activeGotoGame(false);
//
////        database.setSelectedgame(s);
////        panelQuestion.activeShow(true);
////        activeGotoGame(true, database.getqBAsketname(database.getSelectedgame()));
////        jToggleButtonActiveGozs.setText(String.valueOf(currentTvId + 1));
////        gameQShow();
////                setgamepointfor4first(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                controll.getControllCommandSet().startgamewordsFrom(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panelwords.setSelectedBasket(currentTvId);
//                sounds.playWipin();//   sounds.playGame(currentgameindex);
////                 panelIran.resettime();
//                break;
//            case 4:
//                activeGotoGame(false);
////                setgamepointfor4first(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                controll.getControllCommandSet().startgame3Bowl(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panel3bowls.setSelectedBasket(currentTvId);
//                sounds.playWipin();//      sounds.playGame(currentgameindex);
//                break;
//            case 5:
//                activeGotoGame(false);
////                setgamepointfor4first(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                controll.getControllCommandSet().startgameTitrMp3From(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                paneltitrMp3.setSelectedBasket(currentTvId);
//                sounds.playWipin();//  sounds.playGame(currentgameindex);
////                 panelIran.resettime();
//                break;
//            case 6:
//                activeGotoGame(false);
//                setgamepointforquestion(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                setlink95(database0.getSettingitemIdforgame(currentgameindex));
//                controll.getControllCommandSet().startgamequestionFrom(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panelIranQuestions.setSelectedBasket(currentTvId);
//                panelIranQuestions.resetTime();
//                sounds.playWipin();
////                sounds.playGame(currentgameindex);
//                break;
//
//            case 7:
//                activeGotoGame(false);
//                setgamepointforquestion(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                activeTvComeBack(true, database0.getGamename(currentgameindex));
//                activeshowGozsQSet(true, database0.getStartplaygametime(currentgameindex));
//                setlink95(database0.getSettingitemIdforgame(currentgameindex));
//                controll.getControllCommandSet().startgameShutter(currentTvId, database0.getSettingitemIdforgame(currentgameindex));
//                jTabbedPaneGames.setSelectedIndex(currentgameindex + 1);
//                panelShutter.setSelectedBasket(currentTvId);
//                panelShutter.resetTime();
//                sounds.playWipin();
////                sounds.playGame(currentgameindex);
//                break;
            default:
                break;
        }
//        }

    }

    private void returnFromGame() {
        if (activeComeBacktoTv) {
            int b = database0.getSettingitemIdforgame(0);//30
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(b, false, false));
            activeshowGozsQ = false;
//            controolPack.getDatapacMovie().add(new DataPackString(6, database0.getselectedREturntotvFile(database0.getSelectedgame())));
//            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(6, true, true));
//            tv_1to20s[currentTvId].showRamz_NotNewsha();
//System.out.println("980515-+ currentgameindex="+currentgameindex);    
            sounds.stopAll();
            sounds.playWipeRe();
            switch (currentgameindex) {
                case 0:
                    panelQuestion.clearSelection();
                    controll.getControllCommandSet().gameExittoTvQ(currentTvId, database0.getSettingitemIdforgame(0));
                    break;
//                case 1:
//                    panelIran.clearSelection();
//                    controll.getControllCommandSet().gameExittoTvIran(currentTvId, database0.getSettingitemIdforgame(1));
//                    break;
//                case 2:
//
//                    panelFilm.readytoExitPnel();
//                    controll.getControllCommandSet().gameExittoTvFilm(currentTvId, database0.getSettingitemIdforgame(2));
//                    break;
//                case 3:
//                    panelwords.readytoExitPnel();
//                    controll.getControllCommandSet().gameExittoTvWords(currentTvId, database0.getSettingitemIdforgame(3));
//                    break;
//                case 4:
//                    panel3bowls.readytoExitPnel();
//                    controll.getControllCommandSet().gameExittoTv3Bowls(currentTvId, database0.getSettingitemIdforgame(4));
//                    break;
//                case 5:
//                    paneltitrMp3.readytoExitPnel();
//                    controll.getControllCommandSet().gameExittoTvtitrMp3(currentTvId, database0.getSettingitemIdforgame(5));
//                    break;
//                case 6:
//                    panelIranQuestions.clearSelection();
//                    controll.getControllCommandSet().gameExittoTvQ(currentTvId, database0.getSettingitemIdforgame(6));
//                    break;
//                case 7:
//                    panelShutter.clearSelection();
//                    controll.getControllCommandSet().gameExittoTvShutter(currentTvId, database0.getSettingitemIdforgame(7));
//                    break;
                case 8:
                    break;
                case 9:

                    break;

                default:
                    break;

            }

//            sounds.playLong(database0.getselectedREturntotvsounds(database0.getSelectedgame()));
            activeTvComeBack(false);
            activeGotoGame(true, " انتخاب خانه ");
            controll.saveDatabase0();
        }
    }

    protected void participantselect(int selection, boolean inOut) {
        if (inOut) {
            updatecontrolpack(false);
        }
        switch (selection) {
            case 1:
                if (inOut) {
                    controll.getControllCommandSet().runDatabaseMotion("player1_in");
                } else {
                    controll.getControllCommandSet().runDatabaseMotion("player1_out");
                }
                controll.SendControolPack();
                break;

            case 2:
                if (inOut) {
                    controll.getControllCommandSet().runDatabaseMotion("player2_in");
                } else {
                    controll.getControllCommandSet().runDatabaseMotion("player2_out");
                }
                controll.SendControolPack();
                break;

            case 3:
                if (inOut) {
                    controll.getControllCommandSet().runDatabaseMotion("player3_in");
                } else {
                    controll.getControllCommandSet().runDatabaseMotion("player3_out");
                }
                controll.SendControolPack();
                break;

            case 4:
                if (inOut) {
                    controll.getControllCommandSet().runDatabaseMotion("player4_in");
                } else {
                    controll.getControllCommandSet().runDatabaseMotion("player4_out");
                }
                controll.SendControolPack();
                break;

            case 5:
                if (inOut) {
                    controll.getControllCommandSet().runDatabaseMotion("player5_in");
                } else {
                    controll.getControllCommandSet().runDatabaseMotion("player5_out");
                }
                controll.SendControolPack();
                break;

            default:
                break;
        }
//       System.out.println("980407-participantCurrent=" + participantCurrent + "     selection=" + selection);
//        if (newsha && jToggleButtonparticipantSHOWHIDE.isSelected() && participantCurrent != selection) {
//            switch (selection) {
//                case 0:
//
//                    if (participantCurrent == 1) {
//                        controll.getControllCommandSet().participantactive(3, false);
//                        controll.getControllCommandSet().participantactive(12, false);
//                        controll.getControllCommandSet().participantactive(6, false);
//                    }
//                    if (participantCurrent == 2) {
//                        controll.getControllCommandSet().participantactive(0, false);
//                        controll.getControllCommandSet().participantactive(9, false);
//                        controll.getControllCommandSet().participantactive(6, false);
//
//                    }
//                    if (participantCurrent == 3) {
//                        controll.getControllCommandSet().participantactive(0, false);
//                        controll.getControllCommandSet().participantactive(9, false);
//                        controll.getControllCommandSet().participantactive(3, false);
//                        controll.getControllCommandSet().participantactive(12, false);
//                    }
//                    break;
//                case 1:
//                    if (participantCurrent == 0) {
//                        controll.getControllCommandSet().participantdown(3);
//                        controll.getControllCommandSet().participantdown(6);
//                        controll.getControllCommandSet().participantdown(12);
//                    } else {
//
//                        if (participantscount != 3) {
//                            controll.getControllCommandSet().participantdown((participantCurrent - 1 + 3) * 3);
//                        } else {
//                            controll.getControllCommandSet().participantdown((participantCurrent - 1) * 3);
//                        }
//
//                        if (participantscount != 3) {
//                            controll.getControllCommandSet().participantactive((selection - 1 + 3) * 3, false);
//                        } else {
//                            controll.getControllCommandSet().participantactive((selection - 1) * 3, false);
//                        }
//                    }
//                    break;
//                case 2:
//                    if (participantCurrent == 0) {
//                        controll.getControllCommandSet().participantdown(0);
//                        controll.getControllCommandSet().participantdown(6);
//                        controll.getControllCommandSet().participantdown(9);
//
//                    } else if (participantCurrent != 2) {
//                        if (participantscount != 3) {
//                            controll.getControllCommandSet().participantdown((participantCurrent - 1 + 3) * 3);
//                        } else {
//                            controll.getControllCommandSet().participantdown((participantCurrent - 1) * 3);
//                        }
//
//                        if (participantscount != 3) {
//                            controll.getControllCommandSet().participantactive((selection - 1 + 3) * 3, false);
//                        } else {
//                            controll.getControllCommandSet().participantactive((selection - 1) * 3, false);
//                        }
//                    }
//                    break;
//                case 3:
//                    if (participantscount == 3) {
//                        if (participantCurrent == 0) {
//                            controll.getControllCommandSet().participantdown(0);
//                            controll.getControllCommandSet().participantdown(3);
//                        } else {
//                            controll.getControllCommandSet().participantdown((participantCurrent - 1) * 3);
//                            controll.getControllCommandSet().participantactive((selection - 1) * 3, false);
//                        }
//                    }
//                    break;
//
//                default:
//                    return false;
//
//            }
//            controll.getControllCommandSet().participantactivedown();
//            if (selection != 0) {
//                boolean b = newsha;
//                newsha = false;
//                for (int i = 0; i < tv_1to20s.length; i++) {
//                    tv_1to20s[i].setSelected(false);
//                }
//
//                for (int i : database0.getParticipants(selection - 1).getAnswer()) {
//                    if (i < 6 && i >= 0) {
//                        tv_1to20s[i].setSelected(true);
//                    } else {
//                        System.out.println("890424-   namamain index game saved is error=" + i);
//                    }
//                }
//
//                newsha = b;
//            }
//            participantCurrent = selection;
//            return true;
//        }
//
//        return false;
    }

    private void participantOnOff() {
        updatecontrolpack(false);
    }

    public void updatedatabase() {
        for (int i = 0; i < database0.getParticipants().length - 2; i++) {
            database0.getParticipants(i).setPic(panelparticipants[i].getAx());
            database0.getParticipants(i).setPointTotal(panelparticipants[i].getpointTotal());
            database0.getParticipants(i).setCurrent_pointx1000(panelparticipants[i].getPoint());
            database0.getParticipants(i).setCurrent_Speed1234(panelparticipants[i].getSpeed());
            database0.getParticipants(i).setCurrent_changedAnswer(panelparticipants[i].getError());
            database0.getParticipants(i).setCurrent_selection(panelparticipants[i].getSelectedGoz());
            database0.getParticipants(i).setCurrent_timex100(panelparticipants[i].gettime());
            database0.getParticipants(i).setName(panelparticipants[i].getnames());
        }
        database0.getParticipants(database0.getParticipants().length - 2).setPic(panelparticipant_label.getAx());
        database0.getParticipants(database0.getParticipants().length - 2).setName(panelparticipant_label.getnames());

        database0.getParticipants(database0.getParticipants().length - 1).setPic(panelparticipant_label2.getAx());
        database0.getParticipants(database0.getParticipants().length - 1).setName(panelparticipant_label2.getnames());
        controll.saveDatabase0();
    }

    public void updatecontrolpack(boolean send) {
        updatedatabase();
        if (panelparticipant_label2.lower2Isselected()) {
            String st;
            int temp;
            for (int i = 0; i < 4; i++) {
                controolPack.addDatapackStringPersion(11 + i * 10, database0.getParticipants(i).getName(0));

                controolPack.addDatapackStringPersion(12 + i * 10, "" + database0.getParticipants(i).getCurrent_Speed1234());
                controolPack.addDatapackStringPersion(13 + i * 10, "" + database0.getParticipants(i).getCurrent_changedAnswer());
                temp = database0.getParticipants(i).getCurrent_pointx1000();
                if (temp < 0) {
                    temp = -temp;
                    st = "-" + temp / 1000 + "٫" + String.format("%03d", temp % 1000);
                } else {
                    st = "" + temp / 1000 + "٫" + String.format("%03d", temp % 1000);
                }
                controolPack.addDatapackStringPersion(14 + i * 10, st);
                temp = database0.getParticipants(i).getPointTotal();
                if (temp < 0) {
                     temp = -temp;
                    st = "-" + temp / 1000 + "٫" + String.format("%03d", temp % 1000);
                } else {
                    st = "" + temp / 1000 + "٫" + String.format("%03d", temp % 1000);
                }
                controolPack.addDatapackStringPersion(15 + i * 10, st);
            }
            for (int i = 0; i < 5; i++) {
//                controolPack.addDatapackStringPersion(11 + i, database0.getParticipants(0).getName(i));
//                controolPack.addDatapackStringPersion(21 + i, database0.getParticipants(1).getName(i));
//                controolPack.addDatapackStringPersion(31 + i, database0.getParticipants(2).getName(i));
//                controolPack.addDatapackStringPersion(41 + i, database0.getParticipants(3).getName(i));
                controolPack.addDatapackStringPersion(51 + i, database0.getParticipants(5).getName(i));
            }

        } else {
            for (int i = 0; i < 5; i++) {
                controolPack.addDatapackStringPersion(11 + i, database0.getParticipants(0).getName(i));
                controolPack.addDatapackStringPersion(21 + i, database0.getParticipants(1).getName(i));
                controolPack.addDatapackStringPersion(31 + i, database0.getParticipants(2).getName(i));
                controolPack.addDatapackStringPersion(41 + i, database0.getParticipants(3).getName(i));
                controolPack.addDatapackStringPersion(51 + i, database0.getParticipants(4).getName(i));
            }
        }

        controolPack.addDatapackImage(
                9, database0.getParticipants(0).getPic());
        controolPack.addDatapackImage(
                19, database0.getParticipants(1).getPic());
        controolPack.addDatapackImage(
                29, database0.getParticipants(2).getPic());
        controolPack.addDatapackImage(
                39, database0.getParticipants(3).getPic());
        controolPack.addDatapackImage(
                49, database0.getParticipants(4).getPic());

        for (int i = 0;
                i < 4; i++) {
            controolPack.addDatapackStringPersion(142 + 5 * i, database0.getParticipants(i).getName(0));
            controolPack.addDatapackStringPersion(144 + 5 * i, "" + database0.getParticipants(i).getCurrent_timex100() / 100 + "٫" + String.format("%02d", database0.getParticipants(i).getCurrent_timex100() % 100));
        }

//        controolPack.addDatapackString(522, "" + panelparticipants[0].getpointTotal());
//        controolPack.addDatapackString(531, "" + panelparticipants[0].getpointTotal());
//        controolPack.addDatapackString(525, "" + panelparticipants[1].getpointTotal());
//        controolPack.addDatapackString(534, "" + panelparticipants[1].getpointTotal());
//        controolPack.addDatapackString(528, "" + panelparticipants[2].getpointTotal());
//
//        controolPack.addDatapackString(535, "" + panelparticipants[0].getpointExtra());
//        controolPack.addDatapackString(538, "" + panelparticipants[0].getpointExtra());
//        controolPack.addDatapackString(536, "" + panelparticipants[1].getpointExtra());
//        controolPack.addDatapackString(539, "" + panelparticipants[1].getpointExtra());
//        controolPack.addDatapackString(537, "" + panelparticipants[2].getpointExtra());
        if (send) {
            controll.SendControolPack();
        }

        controll.saveDatabase0();
    }

    private void resetAllGame() {
//        jToggleButtonparticipantSHOWHIDE.setSelected(false);
//        jToggleButtonparticipantclear.setSelected(true);
//        activeGotoGame(true, "شروع");
//        activeTvComeBack(false);
//        for (Tv_1to20 tv : tv_1to20s) {
//            tv.clear();
//        }
        for (int i = 0; i < 4; i++) {
            database0.getParticipants(i).gamesreset();
            panelparticipants[i].setpointTotal(0);

        }
        panelparticipant_label.reset();
//
//        for (int i = 0; i < tv_1to20s.length; i++) {
//            tv_1to20s[i].setSelected();
//        }
//        setparticipants(false);
//
        updatedatabase();
        updatecontrolpack(false);
        controll.getControllCommandSet().reset();
//        jToggleButtonparticipantSHOWHIDE.setSelected(false);
    }

    private void startGame() {
        jToggleButtonparticipantSHOWHIDE.setSelected(false);
        jToggleButtonparticipantclear.setSelected(true);
        activeGotoGame(true, "شروع");
        activeTvComeBack(false);
        setparticipants(false);
        for (int i = 0; i < tv_1to20s.length; i++) {
            tv_1to20s[i].setSelected();
        }
        controll.getControllCommandSet().start();

    }

    private void setgamepointforquestion(int currentTvId, int gameBackground) {
        int g = gameBackground;
        int p = (currentTvId + 1) * 10;
        for (int i = 0; i < 8; i++) {
            controolPack.addDatapackString(g + 1 + i, String.valueOf(p));
        }
    }

    private void setgamepointfor4first(int currentTvId, int gameBackground) {
        int g = gameBackground;
        int p = (currentTvId + 1) * 10;
        for (int i = 0; i < 4; i++) {
            controolPack.addDatapackString(g + 1 + i, String.valueOf(p));

//                    addDatapackString
        }
    }

    void participantupdatepoint(int i) {
        updatecontrolpack(true);
//        controll.SendControolPack();
    }

//    void participantIn(boolean selected, int tableid) {
//        if (participantscount == 3) {
//            controll.getControllCommandSet().participant3tableInOut(selected, tableid);
//            if (selected) {
//                controll.getSounds().playParIn();
//            }
//            if (panelparticipants[0].istableup() == selected && panelparticipants[1].istableup() == selected && panelparticipants[2].istableup() == selected) {
//                boolean newsh = newsha;
//                newsha = false;
//                jToggleButtonparticipantSHOWHIDE.setSelected(selected);
//                newsha = newsh;
//
//            }
//
//        } else {
//            controll.getControllCommandSet().participant2tableInOut(selected, tableid);
//            if (selected) {
//                controll.getSounds().playParIn();
//            }
//            if (panelparticipants[0].istableup() == selected && panelparticipants[1].istableup() == selected) {
//                boolean newsh = newsha;
//                newsha = false;
//                jToggleButtonparticipantSHOWHIDE.setSelected(selected);
//                newsha = newsh;
//
//            }
//        }
//    }
//
//    void participantaddpoint(int tableid, int addmin) {
//        if (participantscount == 3) {
////            controll.getControllCommandSet().participant3tableInOut(selected, tableid);
//            if (panelparticipants[tableid - 1].istableup() == true) {
////                boolean newsh = newsha;
////                newsha = false;
//                updatecontrolpack(false);
//                controll.getControllCommandSet().participantaddpoint(522 + 3 * (tableid - 1), 535 + (tableid - 1), addmin);
////                newsha = newsh;
//            }
//
//        } else {
////            controll.getControllCommandSet().participant2tableInOut(selected, tableid);
//            if (panelparticipants[tableid - 1].istableup() == true) {
////                boolean newsh = newsha;
////                newsha = false;
//                updatecontrolpack(false);
//                controll.getControllCommandSet().participantaddpoint(522 + 3 * (3 + tableid - 1), 535 + (3 + tableid - 1), addmin);
////                newsha = newsh;
//            }
//        }
//    }
    void setlink95(int parent) {
//        DrawSettingS d1 = controll.getSettingPack().getDrawSettings(95);
//        DrawSettingS d2 = controll.getSettingPack().getDrawSettings(96);
//        d1.setParent(parent + 1);
//        d2.setParent(parent + 1);
//        controolPack.addDataPackSettingsDrawSettingItems(95, d1);
//        controolPack.addDataPackSettingsDrawSettingItems(96, d2);
    }

//    void updateDatabaseParticipants_() {
//        for (int i = 0; i < panelparticipants.length; i++) {
//            panelparticipants[i].updateDatabaseParticipants();
//
//        }
//        controll.saveDatabase0();
//    }
//    void savedatabase0() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public void update_From_comport(int p0, int p1, int p2, int p3) {
        int timerq = (panelQuestion.getcurrentQtime() * 1000) - panelQuestion.timerq;
        int p0old = panelparticipants[0].getSelectedGoz(),
                p1old = panelparticipants[1].getSelectedGoz(),
                p2old = panelparticipants[2].getSelectedGoz(),
                p3old = panelparticipants[3].getSelectedGoz();

        int temselected = 0;
        if (p0old != p0 && p0 != 0) {
            temselected = p0;
            panelparticipants[0].setselectedGoz(p0);
            panelparticipants[0].settime(timerq / 10);
            if (panelparticipant_label2.isLOweractive()) {
                controll.getControllCommandSet().runDatabaseMotion("amar+1_in_" + p0);
            }
            if (p0old != 0 || p0old != -1) {
                panelparticipants[0].addError();
            }
            if (panelparticipants[0].getSpeed() == 0) {
                panelparticipants[0].setSpeed(database0.getSpeed1234Com() + 1);
                database0.addSpeed1234Com();
            } else {
                int temp = panelparticipants[0].getSpeed();
                for (int i = 0; i < 4; i++) {
                    if (panelparticipants[i].getSpeed() != 0 && (panelparticipants[i].getSpeed() > temp)) {
                        panelparticipants[i].setSpeed(panelparticipants[i].getSpeed() - 1);
                    }
                }
                panelparticipants[0].setSpeed(database0.getSpeed1234Com());
            }
        }
        if (p1old != p1 && p1 != 0) {
            temselected = p1;
            panelparticipants[1].setselectedGoz(p1);
            panelparticipants[1].settime(timerq / 10);
            if (panelparticipant_label2.isLOweractive()) {
                controll.getControllCommandSet().runDatabaseMotion("amar+2_in_" + p1);
            }
            if (p1old != 0 || p1old != -1) {
                panelparticipants[1].addError();
            }
            if (panelparticipants[1].getSpeed() == 0) {
                panelparticipants[1].setSpeed(database0.getSpeed1234Com() + 1);
                database0.addSpeed1234Com();
            } else {
                int temp = panelparticipants[1].getSpeed();
                for (int i = 0; i < 4; i++) {
                    if (panelparticipants[i].getSpeed() != 0 && (panelparticipants[i].getSpeed() > temp)) {
                        panelparticipants[i].setSpeed(panelparticipants[i].getSpeed() - 1);
                    }
                }
                panelparticipants[1].setSpeed(database0.getSpeed1234Com());
            }
        }
        if (p2old != p2 && p2 != 0) {
            temselected = p2;
            panelparticipants[2].setselectedGoz(p2);
            panelparticipants[2].settime(timerq / 10);
            if (panelparticipant_label2.isLOweractive()) {
                controll.getControllCommandSet().runDatabaseMotion("amar+3_in_" + p2);
            }
            if (p2old != 0 || p2old != -1) {
                panelparticipants[2].addError();
            }
            if (panelparticipants[2].getSpeed() == 0) {
                panelparticipants[2].setSpeed(database0.getSpeed1234Com() + 1);
                database0.addSpeed1234Com();
            } else {
                int temp = panelparticipants[2].getSpeed();
                for (int i = 0; i < 4; i++) {
                    if (panelparticipants[i].getSpeed() != 0 && (panelparticipants[i].getSpeed() > temp)) {
                        panelparticipants[i].setSpeed(panelparticipants[i].getSpeed() - 1);
                    }
                }
                panelparticipants[2].setSpeed(database0.getSpeed1234Com());
            }
        }
        if (p3old != p3 && p3 != 0) {
            temselected = p3;
            panelparticipants[3].setselectedGoz(p3);
            panelparticipants[3].settime(timerq / 10);
            if (panelparticipant_label2.isLOweractive()) {
                controll.getControllCommandSet().runDatabaseMotion("amar+4_in_" + p3);
            }
            if (p3old != 0 || p3old != -1) {
                panelparticipants[3].addError();
            }
            if (panelparticipants[3].getSpeed() == 0) {
                panelparticipants[3].setSpeed(database0.getSpeed1234Com() + 1);
                database0.addSpeed1234Com();
            } else {
                int temp = panelparticipants[3].getSpeed();
                for (int i = 0; i < 4; i++) {
                    if (panelparticipants[i].getSpeed() != 0 && (panelparticipants[i].getSpeed() > temp)) {
                        panelparticipants[i].setSpeed(panelparticipants[i].getSpeed() - 1);
                    }
                }
                panelparticipants[3].setSpeed(database0.getSpeed1234Com());
            }
        }
        if (temselected != 0 && panelparticipants[0].getSelectedGoz() == temselected && panelparticipants[1].getSelectedGoz() == temselected && panelparticipants[2].getSelectedGoz() == temselected && panelparticipants[3].getSelectedGoz() == temselected) {
            QEnded(panelparticipants[0].getSelectedGoz());

        }
        updatedatabase();
        updatecontrolpack(true);
        controll.saveDatabase0();
    }

    void clearQ() {
        int k = 0;
        if (panelparticipants[0].getPoint() != 0 || panelparticipants[1].getPoint() != 0 || panelparticipants[2].getPoint() != 0 || panelparticipants[3].getPoint() != 0) {
            k = JOptionPane.showConfirmDialog(null, "Are you sure? /nThere is points didn't add to total point");
        }
        if (k == 0) {
            for (int i = 0; i < database0.getParticipants().length - 2; i++) {
                database0.getParticipants(i).clearQ();
                panelparticipants[i].updatefromdatabase();
                database0.setSpeed1234Com(0);
            }
        }
    }

    private void QEnded(int selectedGoz) {
        panelQuestion.selectGoz(selectedGoz);
//        calculatePoint();
    }

    public void showAnswer(boolean correctAnswer) {
        int timerq = (panelQuestion.getcurrentQtime() * 1000) / panelQuestion.timerq;
        if (!correctAnswer) {
            timerq = -timerq;
        }
        int temp;
        for (int i = 0; i < 4; i++) {
            temp = timerq * ((5 - panelparticipants[i].getSpeed()) / (panelparticipants[i].getError() + 1));
            panelparticipants[i].setpoint(temp);
        }
        updatedatabase();

        if (!correctAnswer) {
            switch (panelQuestion.getSelectedGoz()) {
                case 1:
                    controll.getControllCommandSet().runDatabaseMotion("select_1_WRong");
                    break;
                case 2:
                    controll.getControllCommandSet().runDatabaseMotion("select_2_WRong");
                    break;
                case 3:
                    controll.getControllCommandSet().runDatabaseMotion("select_3_WRong");
                    break;
                case 4:
                    controll.getControllCommandSet().runDatabaseMotion("select_4_WRong");
                    break;
            }
        }
        switch (panelQuestion.getCorrectGoz()) {
            case 1:
                controll.getControllCommandSet().runDatabaseMotion("select_1_Correct");
                break;
            case 2:
                controll.getControllCommandSet().runDatabaseMotion("select_2_Correct");
                break;
            case 3:
                controll.getControllCommandSet().runDatabaseMotion("select_3_Correct");
                break;
            case 4:
                controll.getControllCommandSet().runDatabaseMotion("select_4_Correct");
                break;
        }

        updatecontrolpack(true);
        controll.saveDatabase0();
    }

    private void calculatePoint(boolean correctAnswer) {
        if (panelQuestion.timerq != 0) {
            int timerq = panelQuestion.timerq / panelQuestion.getcurrentQtime();
            if (!correctAnswer) {
                timerq = -timerq;
            }
            int temp = 0;
//            System.out.print("990229 -timerq=" + timerq);
            for (int i = 0; i < 4; i++) {
                if (panelparticipants[i].getError() != 0) {
//                    System.out.println("");
                    temp = (timerq * (5 - panelparticipants[i].getSpeed())) / (panelparticipants[i].getError());
//                    System.out.print("     i=" + i + "  point=" + temp);
                    panelparticipants[i].setpoint(temp);
                }
            }
            updatedatabase();
            controll.saveDatabase0();
        }
    }

    private void addTotal() {
        for (int i = 0; i < 4; i++) {
            panelparticipants[i].startAddpontTotoal();
            TimeTOTALpoint = timecurrent + database0.getTimerFixstop() / 2;
            activeTimeTOTALpoint = true;
        }
    }

    void participantallOff() {

        controll.getControllCommandSet().runDatabaseMotion("player1_out");
        controll.getControllCommandSet().runDatabaseMotion("player2_out");
        controll.getControllCommandSet().runDatabaseMotion("player3_out");
        controll.getControllCommandSet().runDatabaseMotion("player4_out");
        controll.getControllCommandSet().runDatabaseMotion("player5_out");
        controll.SendControolPack();
        for (Panelparticipants panelparticipant : panelparticipants) {
            panelparticipant.setInOut(false);
            panelparticipant_label.setInOut(false);
        }

    }

    void lower2(boolean selected) {
        if (selected) {
            updatedatabase();
            updatecontrolpack(false);
            controll.getControllCommandSet().runDatabaseMotion("player1_in");
            controll.getControllCommandSet().runDatabaseMotion("player2_in");
            controll.getControllCommandSet().runDatabaseMotion("player3_in");
            controll.getControllCommandSet().runDatabaseMotion("player4_in");
            controll.getControllCommandSet().runDatabaseMotion("player5_in");
        } else {
            controll.getControllCommandSet().runDatabaseMotion("player1_out");
            controll.getControllCommandSet().runDatabaseMotion("player2_out");
            controll.getControllCommandSet().runDatabaseMotion("player3_out");
            controll.getControllCommandSet().runDatabaseMotion("player4_out");
            controll.getControllCommandSet().runDatabaseMotion("player5_out");

        }
        controll.SendControolPack();
    }

    void lower(boolean selected) {
        if (selected) {
            updatedatabase();
            updatecontrolpack(false);
            controll.getControllCommandSet().runDatabaseMotion("Amara_in");
            switch (database0.getParticipants(0).getCurrent_selection()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    controll.getControllCommandSet().runDatabaseMotion("amar+1_in_" + database0.getParticipants(0).getCurrent_selection());
                    break;

            }

            switch (database0.getParticipants(1).getCurrent_selection()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:

                    controll.getControllCommandSet().runDatabaseMotion("amar+2_in_" + database0.getParticipants(1).getCurrent_selection());
                    break;

            }

            switch (database0.getParticipants(2).getCurrent_selection()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:

                    controll.getControllCommandSet().runDatabaseMotion("amar+3_in_" + database0.getParticipants(2).getCurrent_selection());
                    break;

            }

            switch (database0.getParticipants(3).getCurrent_selection()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:

                    controll.getControllCommandSet().runDatabaseMotion("amar+4_in_" + database0.getParticipants(3).getCurrent_selection());
                    break;

            }

        } else {
            controll.getControllCommandSet().runDatabaseMotion("amar_out");

        }
        controll.SendControolPack();
    }
}
