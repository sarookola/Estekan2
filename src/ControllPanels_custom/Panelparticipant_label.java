/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllPanels_custom;

import DataBox_cutom.Database0;
import JSO.Com.Main.ImagePanel;
import JSO.Com.Main.TimerTimer;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Shayan
 */
public class Panelparticipant_label extends javax.swing.JPanel{// implements TimerUser {
    
    EstekanBase main;
    Database0 database0;
    int id;
    boolean newsha = false;
    TimerTimer timer;
    boolean pointPlusAtive, pointMinActive, startdelayB;
    //boolean timeQactive, gotoactive;
    //  long gotoactiveator;
//    long timecurrent;
//    long startaddingTimer, startdelay;
//    long timerFixstop, timerstartdelay = 600;
    JTextField jtextname[];
    ImagePanel imagePanel;
    int selected;
    boolean b;
void nof(){
    b=newsha;
    newsha=false;
}
void non(){
    newsha=b;
}
    public Panelparticipant_label(int id, EstekanBase main) {
        newsha = false;
        initComponents();
        this.id = id;
        this.main = main;
        database0 = main.database0;
//        jToggleButton1.setActionCommand("" + (id + 1));
        init();
        startdelayB = false;
//        timerFixstop = database0.getTimerFixstop();
//        timer = new TimerTimer(this, 0, 0, 6000, 0);
//        timer.setWait(25);
//        timer.setWaitTimeAbselute(true);
//        timer.setActive(true);
//        timer.start();
        newsha = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButtoniN = new javax.swing.JToggleButton();
        jPanelPic = new javax.swing.JPanel();
        jPanelSelection = new javax.swing.JPanel();
        jLabelXX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButtonLower = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanelNames = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jToggleButtoniN.setText("In");
        jToggleButtoniN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtoniNActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButtoniN);

        jPanel3.add(jPanel6);

        jPanelPic.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPic.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanelPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPicMouseClicked(evt);
            }
        });
        jPanelPic.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanelPic);

        jPanelSelection.setLayout(new java.awt.GridLayout(1, 0));

        jLabelXX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelXX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelXX.setText("selected");
        jPanelSelection.add(jLabelXX);

        jPanel3.add(jPanelSelection);

        jPanel2.add(jPanel3);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("total POint");
        jPanel9.add(jLabel3, java.awt.BorderLayout.CENTER);

        jButton1.setText("Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, java.awt.BorderLayout.LINE_START);

        jToggleButtonLower.setText("Lower");
        jToggleButtonLower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLowerActionPerformed(evt);
            }
        });
        jPanel9.add(jToggleButtonLower, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel9);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("<<time");
        jPanel7.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("error>>");
        jPanel7.add(jLabel2);

        jPanel1.add(jPanel7);

        jPanel2.add(jPanel1);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(0, 1));

        jLabel4.setText("<<speed");
        jPanel8.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("point>>");
        jPanel8.add(jLabel5);

        jPanel5.add(jPanel8);

        jPanel2.add(jPanel5);

        add(jPanel2);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanelNames.setLayout(new java.awt.GridLayout(0, 1));
        jPanel4.add(jPanelNames);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtoniNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtoniNActionPerformed
        // TODO add your handling code here:
         if(newsha )        main.participantselect(id+1 ,jToggleButtoniN.isSelected());
    }//GEN-LAST:event_jToggleButtoniNActionPerformed

    private void jPanelPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPicMouseClicked
        // TODO add your handling code here:
        if(newsha )  getPic();
    }//GEN-LAST:event_jPanelPicMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           if(newsha )        main.participantallOff();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButtonLowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLowerActionPerformed
        // TODO add your handling code here:
if(newsha)  main.lower(jToggleButtonLower.isSelected());
    }//GEN-LAST:event_jToggleButtonLowerActionPerformed
    public void tableIn(boolean in) {
        boolean newsh = newsha;
        newsha = false;
//        jToggleButtonIn.setSelected(in);
        newsha = newsh;
    }

//    public boolean istableup() {
//        return jToggleButtonIn.isSelected();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelXX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelNames;
    private javax.swing.JPanel jPanelPic;
    private javax.swing.JPanel jPanelSelection;
    private javax.swing.JToggleButton jToggleButtonLower;
    private javax.swing.JToggleButton jToggleButtoniN;
    // End of variables declaration//GEN-END:variables
//    int current_timex100, current_selection, current_changedAnswer, current_pointx1000, current_Speed1234;
    private void init() {
        jtextname = new JTextField[database0.getParticipants().length];
        for (int i = 0; i < jtextname.length; i++) {
            jtextname[i] = new JTextField(database0.getParticipants(id).getName(i));
            jtextname[i].setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jPanelNames.add(jtextname[i]);
        }
        imagePanel = new ImagePanel(database0.getParticipants(id).getPic());
        jPanelPic.add(imagePanel);
        updatefromdatabase();
//        jSpinnerError.setValue(database0.getParticipants(id).getCurrent_changedAnswer());
//        jSpinnerTOTAL.setValue(database0.getParticipants(id).getCurrent_pointx1000());
//        jSpinnercurrentpoint.setValue(0);
//        jSpinnertime1.setValue(database0.getParticipants(id).getCurrent_timex100());
//        jSpinnercurrentspeed.setValue(database0.getParticipants(id).getCurrent_Speed1234());
//        imagePanel = new ImagePanel(database0.getParticipants(id).getPic());
//        jPanelPic.add(imagePanel);
//        setselectedGoz(database0.getParticipants(id).getCurrent_selection());
        
    }
    
    public void setpointTotal(int point) {
//        boolean b = newsha;
//        newsha = false;
////        jSpinnerTOTAL.setValue(point);
////        database0.getParticipants(id).setPointTotal(point);
//        newsha = b;
    }

    public void addpoint_(int point) {
//        int point0 = (int) jSpinner1.getValue();
//        point0 = point0 + point;
//        jSpinner1.setValue(point0);
//        database0.getParticipants(id).setPoint(point0);
    }
    public int getpointTotal() {
        return (int)0;// jSpinnerTOTAL.getValue();
    }
    
    public int getError() {
        
        return (int)0;// jSpinnerError.getValue();
    }
    
    public boolean isactive() {
        return false ;//jToggleButton1.isSelected();
    }
    
    public void setError(int point) {
//        boolean b = newsha;
//        newsha = false;
//        jSpinnerError.setValue(point);
////        database0.getParticipants(id).setPointTotal(point);
//        newsha = b;
        
    }

    public int getSpeed() {
        
        return (int) 0;//jSpinnercurrentspeed.getValue();
    }

    public void setSpeed(int point) {
//        boolean b = newsha;
//        newsha = false;
////        jSpinnercurrentspeed.setValue(point);
////        database0.getParticipants(id).setPointTotal(point);
//        newsha = b;
        
    }

    public int getPoint() {
        
        return (int)0;// jSpinnercurrentpoint.getValue();
    }

    public void setpoint(int point) {
//        boolean b = newsha;
//        newsha = false;
//        jSpinnercurrentpoint.setValue(point);
////        database0.getParticipants(id).setPointTotal(point);
//        newsha = b;
        
    }

    public int gettime() {
        
        return (int) 0;//jSpinnertime1.getValue();
    }

    public void settime(int point) {
//        boolean b = newsha;
//        newsha = false;
//        jSpinnertime1.setValue(point);
////        database0.getParticipants(id).setPointTotal(point);
//        newsha = b;
        
    }
    
//    @Override
//    public void updatetime(long time) {
//        long x = time - timecurrent;
//        timecurrent = time;
////        int x2 , m ; 
//        if (startdelayB) {
//            if ((timecurrent - startaddingTimer) > timerstartdelay) {
//                startdelayB = false;
//                startaddingTimer = timecurrent;
//            }
////        } else {
////            if (pointPlusAtive) {
////                if ((timecurrent - startaddingTimer) >= timerFixstop) {
////                    int x2 = (int) jSpinnerError.getValue();
////                    int m = (int) jSpinnerTOTAL.getValue();
////                    if (x2 > 0) {
////
////                        jSpinnerError.setValue(x2 - 1);
////                        boolean b = newsha;
////                        newsha = false;
////                        jSpinnerTOTAL.setValue(m + 1);
////                        newsha = b;
////                        main.participantaddpoint(id + 1, 1);
////                        startaddingTimer = startaddingTimer + timerFixstop;
////                    } else {
////                        pointPlusAtive = false;
////                        main.updatecontrolpack(true);
////                        main.controll.getSounds().playcoinEnd();
////                    }
////                }
////            } else if (pointMinActive) {
////                if ((timecurrent - startaddingTimer) >= timerFixstop) {
////                    int x2 = (int) jSpinnerError.getValue();
////                    int m = (int) jSpinnerTOTAL.getValue();
////                    if (x2 > 1 && m > 0) {
////                        jSpinnerError.setValue(x2 - 2);
////                        boolean b = newsha;
////                        newsha = false;
////                        jSpinnerTOTAL.setValue(m - 1);
////                        newsha = b;
////                        main.participantaddpoint(id + 1, 2);
////                        startaddingTimer = startaddingTimer + timerFixstop;
////                    } else {
////                        pointMinActive = false;
////                        main.updatecontrolpack(true);
////                        main.controll.getSounds().playcoinEnd();
////                    }
////                }
////            }
//        }
//    }
    
//    void updateDatabaseParticipants() {
//        for (int i = 0; i < jtextname.length; i++) {
//            database0.getParticipants(id).setName(i, jtextname[i].getText());
////            database0.getParticipants(id).setPic(imagePanel.getAddress());
//        }
//    }
    
    private void getPic() {
        imagePanel.drawImage(selectPicRead());
//        
        main.updatedatabase();
    }
    String getAx(){
return imagePanel.getAddress();
}
    public String selectPicRead() {
//        javax.swing.JFrame f1 = new javax.swing.JFrame("dsj - play movie");
        java.awt.FileDialog fd = new java.awt.FileDialog(new JFrame("انتخاب عکس"), "انتخاب تصاویر", java.awt.FileDialog.LOAD);
        fd.setMultipleMode(false);
//        fd.setDirectory(database1.getPicTop());
        fd.setVisible(true);
        
        if (fd.getFile() == null) {
            return "pictures\\nopic.png";
        } else {
            return fd.getDirectory() + fd.getFile();
        }
    }
    
    public void setselectedGoz(int current_selection) {
        selected = current_selection;
        jLabelXX.setText("" + current_selection);
        switch (selected) {
            case 1:
                jPanelSelection.setBackground(Color.GREEN);
                break;
            case 2:
                jPanelSelection.setBackground(Color.white);
                break;
            case 3:
                jPanelSelection.setBackground(Color.RED);
                break;
            case 4:
                jPanelSelection.setBackground(Color.cyan);
                break;
            default:
                jLabelXX.setText("X");                
                jPanelSelection.setBackground(Color.DARK_GRAY);
                break;
        }
        
    }

    public int getSelectedGoz() {
        return selected;
    }
//    public void resetQuestion(boolean update){
//        
//          if(update)      main.updateDatabaseParticipants();
//    }

    private void updatefromdatabase() {
        for (int i = 0; i < jtextname.length; i++) {
            jtextname[i].setText(database0.getParticipants(id).getName(i));
        }
        
//        jSpinnerError.setValue(database0.getParticipants(id).getCurrent_changedAnswer());
//        jSpinnerTOTAL.setValue(database0.getParticipants(id).getCurrent_pointx1000());
//        jSpinnercurrentpoint.setValue(0);
//        jSpinnertime1.setValue(database0.getParticipants(id).getCurrent_timex100());
//        jSpinnercurrentspeed.setValue(database0.getParticipants(id).getCurrent_Speed1234());
//        imagePanel.drawImage(database0.getParticipants(id).getPic());
//        jPanelPic.add(imagePanel);
        setselectedGoz(database0.getParticipants(id).getCurrent_selection());
    }
    
    void addError() {
//        jSpinnerError.setValue(1 + (int) jSpinnerError.getValue());
    }
    
    
      public  String[] getnames() {
       String nams[]=new String[jtextname.length];
         for (int i = 0; i < jtextname.length; i++) {
            nams[i]=jtextname[i].getText();
        }
         return nams;
    }
      
      void setInOut(boolean b) {
     nof();
     jToggleButtoniN.setSelected(b);
     non();
    }
      
      public boolean isLOweractive(){
          return jToggleButtonLower.isSelected();
      }
       void reset() {
       nof();
     jToggleButtoniN.setSelected(false);
     jToggleButtonLower.setSelected(false);
     non();
    }


   

}
