/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunicatePort;

import ControllPanels_custom.EstekanBase;
import com.fazecast.jSerialComm.SerialPort;



/**
 *
 * @author Shayan
 */
public class PanelComport extends javax.swing.JPanel implements ComunicatePortI{

    /**
     * Creates new form PanelComport
     */
    
    Comport2 comport2;
    EstekanBase nMain;
    int id;
    boolean newsha=false;

    public PanelComport(EstekanBase nMain) {
         initComponents();
        comport2 = new Comport2(this);
        initComport();
        this.nMain = nMain;
        newsha=true;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSpinner_1 = new javax.swing.JSpinner();
        jSpinner_2 = new javax.swing.JSpinner();
        jSpinner_3 = new javax.swing.JSpinner();
        jSpinner_4 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner_COMPORT = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldRecieve_Com_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldRecieve_Com_2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(10, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jSpinner_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jSpinner_1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_1StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner_1);

        jSpinner_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jSpinner_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_2StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner_2);

        jSpinner_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jSpinner_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_3StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner_3);

        jSpinner_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jSpinner_4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_4StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner_4);

        add(jPanel1);
        add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("select comport");
        jPanel3.add(jLabel1, java.awt.BorderLayout.WEST);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1, java.awt.BorderLayout.CENTER);

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.EAST);

        add(jPanel3);
        add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout());

        jLabel2.setText("send");
        jPanel5.add(jLabel2);

        jSpinner_COMPORT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_COMPORT.setModel(new javax.swing.SpinnerNumberModel());
        jPanel5.add(jSpinner_COMPORT);

        jButton2.setText("send- int");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);

        add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jTextFieldRecieve_Com_1.setText("jTextField1");
        jPanel6.add(jTextFieldRecieve_Com_1, java.awt.BorderLayout.CENTER);

        jLabel3.setText("Char");
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);

        add(jPanel6);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jTextFieldRecieve_Com_2.setText("jTextField1");
        jPanel8.add(jTextFieldRecieve_Com_2, java.awt.BorderLayout.CENTER);

        jLabel4.setText("String");
        jPanel8.add(jLabel4, java.awt.BorderLayout.LINE_START);

        add(jPanel8);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner_1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_1StateChanged
        // TODO add your handling code here:
        if (newsha) {
            participantselected();
        }
    }//GEN-LAST:event_jSpinner_1StateChanged

    private void jSpinner_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_2StateChanged
        // TODO add your handling code here:
         if (newsha) {
            participantselected();
        }
    }//GEN-LAST:event_jSpinner_2StateChanged

    private void jSpinner_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_3StateChanged
       if (newsha) {
            participantselected();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner_3StateChanged

    private void jSpinner_4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_4StateChanged
       if (newsha) {
            participantselected();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner_4StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       startcomport();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x = (int) jSpinner_COMPORT.getValue();
        comport2.comwritebyte((char)x);
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void Recieve(int c) {
//        System.out.println("990125   comport Panel receeive int="+c);
        String st = jTextFieldRecieve_Com_1.getText();
            if(st.length()>42)    st=st.subSequence(st.length()-40, st.length())+"_"+c;
            else st=st +"_"+c;
            jTextFieldRecieve_Com_1.setText(st);
    }

    @Override
    public void Recieve(String st) {
//              System.out.println("990125   comport Panel receeive string="+st);
               String st2 = jTextFieldRecieve_Com_2.getText();
            if(st2.length()>(40+3+st.length()))    st2=st2.subSequence(st2.length()-2-st.length(), st2.length())+"__"+st;
            else  st2=st2 +"_"+st;
            jTextFieldRecieve_Com_2.setText(st2);
    }



 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner_1;
    private javax.swing.JSpinner jSpinner_2;
    private javax.swing.JSpinner jSpinner_3;
    private javax.swing.JSpinner jSpinner_4;
    private javax.swing.JSpinner jSpinner_COMPORT;
    private javax.swing.JTextField jTextFieldRecieve_Com_1;
    private javax.swing.JTextField jTextFieldRecieve_Com_2;
    // End of variables declaration//GEN-END:variables

    private void participantselected() {
       nMain.update_From_comport((int)jSpinner_1.getValue(),(int)jSpinner_2.getValue(),(int)jSpinner_3.getValue(),(int)jSpinner_4.getValue());
    }

    private void initComport() {
        jComboBox1.removeAllItems();
                for (SerialPort serialPort : comport2.comPortS) {
                    jComboBox1.addItem(""+serialPort.getDescriptivePortName()+ "    spn=" + serialPort.getSystemPortName());
//            System.out.println("serialPort=" + serialPort.getDescriptivePortName() + "    spn=" + serialPort.getSystemPortName());
        }
    }

    private void startcomport() {
      if(newsha && jComboBox1.getItemCount()>0)
          comport2.connecttoPOrt(jComboBox1.getSelectedIndex());
    }
}
