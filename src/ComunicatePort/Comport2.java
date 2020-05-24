package ComunicatePort;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.fazecast.jSerialComm.SerialPortPacketListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shayan
 */
public class Comport2 implements Runnable, SerialPortPacketListener {

    SerialPort comPort;
    Thread readThread;
    PanelComport viewer;
    String path = "seting\\LightTable.json";
    int comnumber;
  //  ControllInterFace controllInterFace;
    boolean active;
//    LightBox lightBox;
//    boolean Belldisbale[];
    InputStream inputStream;
    OutputStream outputStream;
     SerialPort[] comPortS;

   public Comport2(PanelComport aThis) {
        viewer = aThis;
        init2();

    }
  

     
    public void init2() {
         comPortS = SerialPort.getCommPorts();
    }
    public void connecttoPOrt(int number)
    {
//         for (SerialPort serialPort : comPortS) {
//            System.out.println("serialPort=" + serialPort.getDescriptivePortName() + "    spn=" + serialPort.getSystemPortName());
//        }
                comPort = comPortS[number];
        comPort.openPort();
//         PacketListener listener = new PacketListener();
        comPort.addDataListener(this);
//        comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
        inputStream = comPort.getInputStream();
        outputStream = comPort.getOutputStream();
        readThread = new Thread(this);
        readThread.start();
    }



    public void serialEvent(SerialPortEvent event) {
//        System.out.println("start");
        byte[] newData = event.getReceivedData();
//      System.out.println("Received data of size: " + newData.length);

//         StringBuffer readBuffer = new StringBuffer();
        int c = 0;

//                try {
//                      while(inputStream.available()>0)
//                    c = inputStream.read();
//                    viewer.setRecievedText(String.valueOf(c));
//                    if (active && (c == 1 || c == 2 || c == 4 || c == 8)) {
//                     checkREcieved(c);
//                    }
//                    while (inputStream.available() > 0) {
//                        c = inputStream.read();
//                    }
//c= newData[newData.length-1];
        for (int i = 0; i < newData.length; i++) {
            c = newData[i];  
            viewer.Recieve(c);
//            System.out.print(c + "\t next:" + String.valueOf(c));
        }
//        System.out.println("");
//        c=c+1;
  //    viewer.setRecievedText(String.valueOf(c));

//        if (active && (c == 1 || c == 2 || c == 4 || c == 8)) {
////            System.out.println("970111-here");
//            checkREcieved(c);
//        }

    }

  


    enum KeyState {

        three, faster, mobileRamz, mobileText, demo
    };
    KeyState state;


    public void Recieve(int c) {
      //  viewer.setSendField("" + c);
//        active = true;
//        comwritebyte( (char) c);
   comwritebyte((char) c);
    }


    public void Recieve(String st) {
        comwrite(st);
    }

    void comwritebyte(char c) {
//        System.err.println(" Error ???");
//        System.err.println(" c="+(String.valueOf((int)c)));
        try {
            outputStream.write( c);
            outputStream.flush();
        } catch (IOException ex) {
            Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void comwrite(String c) {

        try {
            for (int i = 0; i < c.length(); i++) {
                char x = c.charAt(i);
                outputStream.write( x);

            }
            outputStream.flush();
//            viewer.setSendField(c);
        } catch (IOException ex) {
            try {
                Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
                outputStream.close();
            } catch (IOException ex1) {
                Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    @Override
    public void run() {
        try {
            readThread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Comport2.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (comPort.isOpen()) {
//            if (!comPort.isOpen()) {
//                System.out.println("980111 -   comport is closwed");
//            }
        }
        JOptionPane.showMessageDialog(null,"برد قطع است");
        init2();
    }

    @Override
    public int getListeningEvents() {
        return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
    }

    @Override
    public int getPacketSize() {
        return 1;
    }


   

}
