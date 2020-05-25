/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllPanels;


import ComunicatePort.PanelComport;
import ControllPanels_custom.FileManipulat;
import ControllPanels_custom.EstekanBase;
import DataBox_cutom.Database0;
import DataBox_cutom.Database1;
import ControllPanels_custom.Sounds2;
import JSO.Com.Communicate.Server;
import JSO.Com.ControllPanels.ControllPanelx;
import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox_cutom.DatabaseMain;
import JSO.Com.Main.ControllCommandSetBase;
import JSO.Com.Main.ControllInterFace;
import JSO.Com.Main.Sounds;
import JSO.Com.Main.TimerTimer;
import java.util.Date;


/**
 *
 * @author shayan
 */
public class Controll extends javax.swing.JPanel implements ControllInterFace {

    /**
     * Creates new form Controll
     */
    Server server;
    ControolPack controolPack;

    TimerTimer timer;
    ControllCommandSet controllCommandSet;
//    Jpaneldata1 jpaneldata;
//    LastONAirPack lastOnAir;
    String lastontrolDataFile = "seting\\lastControlData.json";
    Database0 database;
    Database1 database1;

    String databasefilename = "seting\\dataBase0.json";
    String databaseB = "seting\\backup\\dataBase";
    String database1filename = "seting\\dataBase1.json";
    String database0filename2 = "seting\\dataBase0.shr";
    String database1filename2 = "seting\\dataBase1.shr";
//    String database9703filename = "seting\\dataBase9703.json";
    
    
      String databasemfilename = "seting\\jso\\dataBase0.json";
    DatabaseMain databaseM;
    
    Sounds2 sounds;
    int bigestPoint = 20;
    boolean newsha;//, serverFree;
//    ImagePanel imagePanel1;
    EstekanBase nMain;
    PanelComport panelComport;
    PanelComport communicatePortPanel;

    public Controll(Server server) {

        newsha = true;
        this.server = server;
        sounds = new Sounds2();
        //  controolPack = new FileManipulat().loadControlData(lastontrolDataFile, server.getobjecsArrayLenght());
        controolPack = new ControolPack();

        databaseM=new JSO.Com.DataBox_cutom.FileManipulat().loadDatabase0(databasemfilename);
        controllCommandSet = new ControllCommandSet(server);
        controllCommandSet.setDatabasem(databaseM);
        controllCommandSet.setControolPack(controolPack);
        database = new FileManipulat().loadDatabase0(databasefilename, database0filename2);
        database1 = new FileManipulat().loadDatabase1(database1filename, database1filename2);
        
        
        
        
backup();
        
        initComponents();
//        initData();
//        init_panel(); 

//        controllPanel0 = new ControllPanelx(this);
//        jTabbedPane.add("controllPanel0",controllPanel0);
        nMain = new EstekanBase(this);
        communicatePortPanel = new PanelComport(nMain);
        jTabbedPane.add("Main Game Panel ", nMain);



         jTabbedPane.add("communicatePort", communicatePortPanel);
         

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHalfs = new javax.swing.ButtonGroup();
        jaiGah = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane = new javax.swing.JTabbedPane();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.GridLayout(1, 0));
        add(jTabbedPane);
    }// </editor-fold>//GEN-END:initComponents

    public void SendControolPack() {
//server.setWritesocket1_0_SendDirectly(newsha);
//        if (server.isServerFREEe()) {
//            server.writeSocket(new Pack(1, controolPack));
//        }
server.SendControolPack(controolPack);
//        saveControolPackclearList();

//        }
    }
//    public void SendControolPack(ControolPack controolPack) {
//
//        if (isServerFREEe()) {
//            writeSocket(new Pack(1, controolPack.clone()));
//        }
//        controolPack.clearLists();
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHalfs;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.ButtonGroup jaiGah;
    // End of variables declaration//GEN-END:variables

//    public SavePack getSavePack() {
//        return savePack;
//    }
//    public void setSavePack(SavePack savePack) {
//        this.savePack = savePack;
//    }
    public Sounds2 getSounds() {
        return sounds;
    }

    @Override
    public ControolPack getControolPack() {
        return controolPack;
    }

    @Override
    public void setControolPack(ControolPack controolPack) {
        this.controolPack = controolPack;
    }

//    @Override
//    public ControllCommandSet getControllCommandSet() {
//        return controllCommandSet;
//    }
//
//    @Override
//    public void setControllCommandSet(ControllCommandSet controllCommandSet) {
//        this.controllCommandSet = controllCommandSet;
//    }
    @Override
    public boolean isNewsha() {
        return newsha;
    }

    @Override
    public void setNewsha(boolean newsha) {
        this.newsha = newsha;
    }

//    void sendTime24(int second) {
//        jTextFieldSecond24.setText(String.valueOf(second));
//        timeUpdate();
//    }
    private void initData() {

//        jSpinnerx1.setValue(dim[0]);
//        jSpinnery1.setValue(dim[1]);
//        jSpinnerw1.setValue(dim[2]);
//        jSpinnerh1.setValue(dim[3]);
    }

    @Override
    public void updateControlpack() {
//        saveDatabase0();
//        saveControolPack();

    }

    private void init_panel() {

    }

    public void saveDatabase0() {
        if (!save) {
            save = true;
            new FileManipulat().saveObject(databasefilename, database);
            save = false;
        }

    }

    public void saveDatabase1() {
//       database = new FileManipulat().loadDatabaseJadval(databasefilepath);
        if (!save) {
            save = true;
            new FileManipulat().saveObject(database1filename, database1);
            save = false;
        }

    }
//       public void saveDatabase9703() {
////       database = new FileManipulat().loadDatabaseJadval(databasefilepath);
// if(!save){
//            save =true;
//             new FileManipulat().saveObject(database9703filename, database9703);
//        save=false;
//        }
//
//    }
    boolean save = false;
//    public void saveControolPack() {
//        if(!save){
//            save =true;
//        new FileManipulat().saveObject(lastontrolDataFile, controolPack);
//        save=false;
//        }
//    }

    private void saveControolPackclearList() {
        controolPack.clearLists();
//        saveControolPack();
    }

//    public SettingPack getSettingPack() {
//
//        return server.getSettingPack();
//
//    }

    public Database0 getDatabase() {
        return database;
    }

    public Database1 getDatabase1() {
        return database1;
    }

//    public Database9703 getDatabase9703() {
//        return database9703;
//    }
    @Override
    public ControllCommandSet getControllCommandSet() {
        return controllCommandSet;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showFixOn(int picnumber, int fix_in_out, String pic) {
////        System.out.println("pic="+pic+"<<<<");
//        if (!pic.replaceAll(" ", "").equals("")) {
//            controolPack.getDatapackImage().add(new DataPackString(picnumber, pic));
//        }
//        controolPack.getVis_Anim_Bool()[picnumber].setItemsImagVisible(true);
//        controllCommandSet.playMotionAndSend(picnumber, fix_in_out);
////        controolPack.clearLists();
    }

    public void showFixOff(int picnumber, int fix_out) {

//        controllCommandSet.playMotionAndSend(picnumber, fix_out);
//        controolPack.getVis_Anim_Bool()[picnumber].setItemsImagVisible(false);
////        controolPack.setItemsImagVisible(picnumber, false);
////        controolPack.clearLists();
    }

    public void backup() {
                new FileManipulat().saveObject(database0filename2, database);
        String backup = databaseB + "_0_" + new Date().getTime() + ".json";
        new FileManipulat().saveObject(backup, database);
        
//        new FileManipulat().saveObject(database1filename2, database1);
//          backup = databaseB + "_1_" + new Date().getTime() + ".json";
//        new FileManipulat().saveObject(backup, database1);
    }

    @Override
    public void setControllCommandSet(ControllCommandSetBase controllCommandSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecieveComPort(int c) {
              System.out.println("990125 -comport received ="+c);
    }

}
