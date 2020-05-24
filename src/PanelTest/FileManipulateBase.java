/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelTest;

import ControllPanels_custom.FileManipulat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shayan
 */
public class FileManipulateBase implements Serializable {

    public FileManipulateBase(Date current, int err) {
        this.current = current;
        error_count = err;
    }

    public FileManipulateBase() {

    }
    Date last = new Date(119, 7, 1);
    String st = "C:\\ProgramData\\doj.srs";
    Date current = null;
    int error_count = 0, error_last = 3;
    Date errLastDate = null;

    public void saveMainDate(int err) {
//        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
//        String json = gson.toJson(obj);
        try {
            //write converted json data to a file named "file.json"
            FileOutputStream file = new FileOutputStream(st);

            ObjectOutputStream out = new ObjectOutputStream(file);
//                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
            out.writeObject(new FileManipulateBase(current, err));
            out.flush();
            out.close();
            file.close();
        } catch (IOException e) {
            System.out.println(" sorry there is a problem (-1) call shayan Ranjbar");
        }

    }

    public void saveMainDateCreate(Date current) {
        this.current = current;
        try {
            //write converted json data to a file named "file.json"
            Files.deleteIfExists(Paths.get(st));
            File f = new File(st);
            if (f.createNewFile()) {
                FileOutputStream file = new FileOutputStream(f);
                ObjectOutputStream out = new ObjectOutputStream(file);
//                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
                out.writeObject(new FileManipulateBase(current, 0));
                out.flush();
                out.close();
                file.close();

            }
        } catch (IOException e) {
            //     e.printStackTrace();
            System.out.println(" sorry there is a problem (-0) call shayan Ranjbar");
        }

    }

    public boolean loadMainDate() {
//        Gson gson = new Gson();
        Date d, newdate = new Date();
        boolean b = false;

        FileInputStream file;
        try {
            file = new FileInputStream(st);
            ObjectInputStream in = new ObjectInputStream(file);
            FileManipulateBase f = ((FileManipulateBase) in.readObject());
            d = f.current;
            error_count = f.error_count;
//            System.out.println("(d)=" + (d) + "   (last)=" + (last));
            b = (newdate.after(d) && newdate.before(last));
            if (b) {
                current = newdate;
                saveMainDate(error_count);
                return true;
            } else if (error_count < error_last) {
                JOptionPane.showMessageDialog(null, "Call Me 09123351993, There is a serious problem1");
//                System.out.println("980315 delta=" + (newdate.getTime() - d.getTime()) + "   error_count=" + error_count + "   errlast=" + error_last);
                if ((newdate.getTime() - d.getTime()) < 600000) {
                    b = true;
                } else {

                    error_count++;
                    if (error_count >= error_last) {
                        JOptionPane.showMessageDialog(null, "Call Me 09123351993, This is Last chance2");
                    }
                    current = newdate;
                    saveMainDate(error_count);
                    b = true;
                }
            } else {
                new FileManipulat().saveObject(st, newdate);
                JOptionPane.showMessageDialog(null, "Call Me 09123351993, Sorry you have no chance");
                return false;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Berar! cheti hakerdi1?"); //Logger.getLogger(FileManipulat.class.getName()).log(Level.SEVERE, null, ex);        
        } catch (IOException ex) {
            System.out.println("Berar! cheti hakerdi2?"); //Logger.getLogger(FileManipulateBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Berar! cheti hakerdi3?"); // Logger.getLogger(FileManipulateBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    void saveMainDatefirsttime(Date date) {
        boolean check = Files.exists(Paths.get(st), LinkOption.NOFOLLOW_LINKS);
//        System.out.println("980330    check="+check);
        if (!check) {
            saveMainDateCreate(date);

        }
    }

    public void resetsoft() {
        Date newdate = new Date();
        if (newdate.before(last)) {
            saveMainDatefirsttime(new Date());
        }
    }
}
