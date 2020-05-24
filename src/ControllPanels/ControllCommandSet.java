/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllPanels;

import JSO.Com.Communicate.Server;
import JSO.Com.Main.ControllCommandSetBase;
import JSO.Com.Render.base.DrawSettingS;
import java.util.Date;

/**
 *
 * @author shayan
 */
public class ControllCommandSet extends ControllCommandSetBase {

    public ControllCommandSet(Server server) {
        super(server);
    }

////    Controll controll;
    int tablestartdrawitem = 520;
    int wipestartItem = 511;

    private void setVisMothion(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, int[] motionDims, boolean bol) {

    }
//

    private void setstatevisibleAndanim(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, boolean bol) {

    }

    private void setVisNo(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, boolean bol) {

    }

    private void setobjectanimoff(int[] objectanim, int[] Imageanim) {

    }

    public void participants3show(boolean OnOff) {
        int t = tablestartdrawitem;
        if (OnOff) {
            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
            int imagePlay3[] = {};
            int objectanim3[] = {};
            int motionDims3[] = {};
            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
        }
        int imagevis[] = {t, t + 3, t + 6,};
        int textvis[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8};
        int imagePlay[] = {};
        int objectanim[] = {t, t + 3, t + 6, t + 1, t + 2, t + 4, t + 5, t + 7, t + 8};
        int motionDims[] = {1, 1, 1, 0, 0, 0, 0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void participants2show(boolean OnOff) {
        int t = tablestartdrawitem;
        if (OnOff) {
            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
            int imagePlay3[] = {};
            int objectanim3[] = {};
            int motionDims3[] = {};
            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
        }
        int imagevis[] = {t + 9, t + 12};
        int textvis[] = {t + 10, t + 11, t + 13, t + 14};
        int imagePlay[] = {};
        int objectanim[] = {t + 9, t + 12, t + 10, t + 11, t + 13, t + 14};
        int motionDims[] = {1, 1, 0, 0, 0, 0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void participant3tableInOut(boolean OnOff, int tableid) {
        int t = tablestartdrawitem;
        int id = tableid;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + 3 * (id - 1)};
        int textvis[] = {t + 3 * (id - 1) + 1, t + 3 * (id - 1) + 2};
        int imagePlay[] = {};
        int objectanim[] = {t + 3 * (id - 1), t + 3 * (id - 1) + 1, t + 3 * (id - 1) + 2};
        int motionDims[] = {1, 1, 1, 0, 0, 0, 0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void participant2tableInOut(boolean OnOff, int tableid) {
        int t = tablestartdrawitem;
        int id = tableid;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + 3 * (id - 1) + 9};
        int textvis[] = {t + 3 * (id - 1) + 10, t + 3 * (id - 1) + 11};
        int imagePlay[] = {};
        int objectanim[] = {t + 3 * (id - 1) + 9, t + 3 * (id - 1) + 10, t + 3 * (id - 1) + 11};
        int motionDims[] = {1, 1, 1, 0, 0, 0, 0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void participantactive(int id3, boolean active) {
        int t = tablestartdrawitem + id3;
        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {t, t + 1, t + 2};
        int motionDims[] = {3, 0, 0, 0, 0, 0, 0, 0};
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
    }

    public void participantdown(int id3) {
        int t = tablestartdrawitem + id3;
        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {t, t + 1, t + 2};
        int motionDims[] = {4, 0, 0, 0, 0, 0, 0, 0};
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
    }

    public void participantactivedown() {
        sendContolPack();
        int t = tablestartdrawitem;
        int imagevis3[] = {};
        int textvis3[] = {};
        int imagePlay3[] = {};
        int objectanim3[] = {t, t + 3, t + 6, t + 9, t + 12, t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
        int motionDims3[] = {};
        setobjectanimoff(objectanim3, imagePlay3);
    }

    public void start() {
        boolean OnOff = true;
//        if (OnOff) {
        int imagevis3[] = {9};
        int textvis3[] = {9};
        int imagePlay3[] = {};
        int objectanim3[] = {};
        int motionDims3[] = {};
        setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {10, 11, 12, 13, 14, 15, 16,};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {10, 11, 12, 13, 14, 15, 16};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startPurple() {
        boolean OnOff = true;
//        if (OnOff) {
        int imagevis3[] = {10, 11, 12, 13, 14, 15, 16};
        int textvis3[] = {};
        int imagePlay3[] = {};
        int objectanim3[] = {};
        int motionDims3[] = {};
        setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {10};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {10};
        int motionDims[] = {3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgamequestionFrom(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+gameBackground);
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
        boolean OnOff = true;

        int imagevis[] = {t + currengtvid, g, 95, 96};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8
        int imagePlay[] = {t + currengtvid, 95, 96};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8, 95, 96};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgameIranFrom(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+gameBackground);
        //      controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
        boolean OnOff = true;

        int imagevis[] = {t + currengtvid, g, 95, 96};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid, 95, 96};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, 95, 96};//, g + 1, g + 2, g + 3, g + 4
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgame3Bowl(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+gameBackground);
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
//        controolPack.addDataPackanimationStartEnds(g + 10, 100, 0, 0);
//        controolPack.addDataPackanimationStartEnds(g + 11, 100, 0, 0);
//        controolPack.addDataPackanimationStartEnds(g + 12, 100, 0, 0);
        boolean OnOff = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 10, g + 11, g + 12};
        int textvis[] = {g + 6, g + 7, g + 8,};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid, g + 10, g + 11, g + 12};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 6, g + 7, g + 8, g + 10, g + 11, g + 12};//, g + 1, g + 2, g + 3, g + 4
        int motionDims[] = {1, 3, 1, 0, 0, 0, 0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgameTitrMp3From(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+gameBackground);
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
        boolean OnOff = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g};//, g + 1, g + 2, g + 3, g + 4
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgamewordsFrom(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//       System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+(g+28));
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
//        controolPack.addDataPackanimationStartEnds(g + 28, 50, 0, 0);
//        controolPack.addDataPackanimationStartEnds(g + 29, 50, 0, 0);
        boolean OnOff = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 28, g + 29};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid, g + 28, g + 29};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 28, g + 29};//g + 1, g + 2, g + 3, g + 4,
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void startgameShutter(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        System.out.println("980408-controolPack="+controolPack+"    t+currengtvid="+t+"     ="+currengtvid+"    back="+gameBackground);
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, 100);
        boolean OnOff = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, 505, 506};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8
        int imagePlay[] = {t + currengtvid, 505, 506};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, 30, 505, 506};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void showQandTiomerONOff(boolean OnOff, int b, int motion) {

//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {b + 18};
        int textvis[] = {b + 11, b + 19};
        int imagePlay[] = {};
        int objectanim[] = {b + 18, b + 11, b + 19};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void showQandGsONOff(boolean OnOff, int b, int motion) {

//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {b + 12, b + 14, b + 16, b + 18};
        int textvis[] = {b + 11, b + 13, b + 15, b + 17, b + 19};
        int imagePlay[] = {};
        int objectanim[] = {b + 12, b + 14, b + 16, b + 18, b + 11, b + 13, b + 15, b + 17, b + 19};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvQ(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g,};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8
        int imagePlay[] = {t + currengtvid, g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, 95, 96, g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, 95, 96};
        int textvis3[] = {g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
        showQandGsONOff(OnOff, gameBackground, 2);
        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvIran(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 5};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, 95, 96, g + 1, g + 2, g + 3, g + 4, g + 5};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, g + 5, 95, 96};
        int textvis3[] = {g + 1, g + 2, g + 3, g + 4};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
        showQandGsONOff(OnOff, gameBackground, 2);
        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvFilm(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 5, 95, 96};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, 95, 96, g + 5, g + 9};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, g + 5, 95, 96};
        int textvis3[] = {g + 9};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
        showQandGsONOff(OnOff, gameBackground, 2);
        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvWords(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 28, g + 29, g + 8};
        int textvis[] = {g + 9};//g + 1, g + 2, g + 3, g + 4,
        int imagePlay[] = {t + currengtvid, g + 28, g + 29};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 1, g + 2, g + 3, g + 4, g + 28, g + 29, g + 8, g + 9};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, g + 28, g + 29};
        int textvis3[] = {g + 1, g + 2, g + 3, g + 4};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
        wordShowMainoff(OnOff, gameBackground, 2);
        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTv3Bowls(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g, g + 10, g + 11, g + 12};
        int textvis[] = {g + 6, g + 7, g + 8,};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 6, g + 7, g + 8, g + 10, g + 11, g + 12};
        int motionDims[] = {1, 3, 1, 0, 0, 0, 0, 0, 0};

        int imagevis3[] = {g, g + 10, g + 11, g + 12};
        int textvis3[] = {g + 6, g + 7, g + 8,};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 0, 0, 0, 0, 0, 0};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay, objectanim, false);
        }
//        QtitrMp3MAinQGozOn(true, OnOff, gameBackground);
//        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvtitrMp3(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4
        int imagePlay[] = {t + currengtvid};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 1, g + 2, g + 3, g + 4, g + 6};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, g + 6};
        int textvis3[] = {g + 1, g + 2, g + 3, g + 4};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
        QtitrMp3MAinQGozOn(true, OnOff, gameBackground);
        setobjectanimoff(objectanim, imagePlay);
        if (!OnOff) {
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim2, false);
        }
    }

    public void gameExittoTvShutter(int currengtvid, int gameBackground) {
        int t = wipestartItem;
        int g = gameBackground;
//        controolPack.addDataPackanimationStartEnds(t + currengtvid, -100);
        boolean OnOff = false;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {t + currengtvid, g};
        int textvis[] = {};//g + 1, g + 2, g + 3, g + 4, g + 5, g + 6, g + 7, g + 8
        int imagePlay[] = {t + currengtvid,};
        int objectanim[] = {t + currengtvid, 11 + currengtvid, g, g + 10, 30, 505, 506, g + 5, g + 7, g + 8, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25, g + 26, g + 27, g + 28, g + 29, g + 30, g + 31, g + 32, g + 33, g + 34, g + 36};
        int motionDims[] = {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis3[] = {g, 30, 505, 506, g + 5, g + 7, g + 10, g + 11, g + 13, g + 15, g + 17, g + 19, g + 21, g + 23, g + 25, g + 27, g + 29, g + 31, g + 33};
        int textvis3[] = {g + 8, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 22, g + 24, g + 26, g + 28, g + 30, g + 32, g + 34, g + 36};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 4, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (OnOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis3, textvis3, imagePlay2, objectanim, false);
        }

    }

    public void wordShowMain(boolean onOff, int settingitemNomber, int ramzL) {
        int g = settingitemNomber;
//        controolPack.addDataPackanimationStartEnds(g + 28, 50, 0, ramzL);
//        controolPack.addDataPackanimationStartEnds(g + 29, 50, 0, ramzL);

//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {g + 28, g + 29, g + 8};
        int textvis[] = {g + 9, g + 10, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25};
        int imagePlay[] = {g + 28, g + 29};
        int objectanim[] = {g + 8, g + 9, g + 28, g + 29, g + 10, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};

        if (onOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void wordShowMainoff(boolean onOff, int settingitemNomber, int ramzL) {
        int g = settingitemNomber;
//        controolPack.addDataPackanimationStartEnds(g+28, 50,0,ramzL);
//        controolPack.addDataPackanimationStartEnds(g+29, 50,0,ramzL);

//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {g + 28, g + 29};
        int textvis[] = {g + 10, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25};
        int imagePlay[] = {g + 28, g + 29};
        int objectanim[] = {g + 28, g + 29, g + 10, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};

        if (onOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void QtitrMp3ShowPicOn(boolean send, boolean onOff, int settingitemNomber) {
        int g = settingitemNomber;
//        controolPack.addDataPackanimationStartEnds(g + 28, 50, 0, ramzL);
//        controolPack.addDataPackanimationStartEnds(g + 29, 50, 0, ramzL);

//        if (OnOff) {
//        int imagevis3[] = {g + 6};
//        int textvis3[] = {};
//        int imagePlay3[] = {};
//        int objectanim3[] = {};
//        int motionDims3[] = {};
//        setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {g + 6, g + 7};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {g + 6, g + 7};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (onOff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            if (send) {
                sendContolPack();
                setobjectanimoff(objectanim, imagePlay);
            }
        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            if (send) {
                sendContolPack();
                setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
            }
        }
    }

    public void QtitrMp3changePic(boolean send, int settingitemNomber) {
        int g = settingitemNomber;

        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {g + 6, g + 7};
        int motionDims[] = {3, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (send) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);
        }
    }

    public void QtitrMp3MAinQGozOn(boolean send, boolean onoff, int settingitemIdforgame) {
        int b = settingitemIdforgame;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {b + 12, b + 14, b + 16, b + 18};
        int textvis[] = {b + 11, b + 13, b + 15, b + 17, b + 19};
        int imagePlay[] = {};
        int objectanim[] = {b + 12, b + 14, b + 16, b + 18, b + 11, b + 13, b + 15, b + 17, b + 19};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (onoff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            if (send) {
                sendContolPack();
                setobjectanimoff(objectanim, imagePlay);
            }

        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            if (send) {
                sendContolPack();
                setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
            }
        }
    }

    public void PrizeCOm(boolean onoff, int settingitemIdforgame) {
        int b = settingitemIdforgame;
        if (onoff) {
            for (int i = 0; i < 9; i++) {
//                controolPack.addDataPackanimationStartEnds(b + 2 + (2 * i), 100, 0, 0);
            }
        }
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {b, b + 2, b + 4, b + 6, b + 8, b + 10, b + 12, b + 14, b + 16, b + 18};
        int textvis[] = {b + 1, b + 3, b + 5, b + 7, b + 9, b + 11, b + 13, b + 15, b + 17};
        int imagePlay[] = {b + 2, b + 4, b + 6, b + 8, b + 10, b + 12, b + 14, b + 16, b + 18};
        int objectanim[] = {b, b + 2, b + 4, b + 6, b + 8, b + 10, b + 12, b + 14, b + 16, b + 18, b + 1, b + 3, b + 5, b + 7, b + 9, b + 11, b + 13, b + 15, b + 17};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (onoff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            sendContolPack();
            setobjectanimoff(objectanim, imagePlay);

        } else {
            setVisMothion(imagevis2, textvis2, imagePlay2, objectanim, motionDims2, true);
            sendContolPack();
            setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
        }
    }

    public void participantaddpoint(int point, int extra, int motion) {
//       int b = settingitemIdforgame;
//        if(onoff)
//        for (int i = 0; i < 9; i++) {
//            controolPack.addDataPackanimationStartEnds(b + 2 + (2 * i), 100, 0, 0);
//        }
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {};
        int textvis[] = {extra};
        int imagePlay[] = {};
        int objectanim[] = {point, extra};
        int motionDims[] = {35, motion, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {extra};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        sendContolPack();
        setobjectanimoff(objectanim, imagePlay);

//            setVisMothion(imagevis2, textvis2, imagePlay2, objectanim, motionDims2, true);
//            updatecontroolPack();
        setVisNo(imagevis, textvis2, imagePlay2, objectanim2, false);

    }

    public void playtest(int g) {

        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {g + 10, g + 11, g + 12, g + 8, g + 6, g + 7};
        int motionDims[] = {1, 1, 1, 3, 3, 3};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        sendContolPack();
        setobjectanimoff(objectanim, imagePlay);

    }

    public void openWhat(boolean GoalHollow, boolean openClose, int base, int whichBowl) {
//        if (GoalHollow) {
//            if (openClose) {
//                controolPack.addDataPackanimationStartEnds(base + whichBowl, 50, 10, 19);
//            } else {
//                controolPack.addDataPackanimationStartEnds(base + whichBowl, -100, 10, 19);
//            }
//        } else {
//            if (openClose) {
//                controolPack.addDataPackanimationStartEnds(base + whichBowl, 50, 1, 9);
//            } else {
//                controolPack.addDataPackanimationStartEnds(base + whichBowl, -100, 1, 9);
//            }
//        }
        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {base + whichBowl};
        int objectanim[] = {base + 10, base + 11, base + 12};
        int motionDims[] = {0, 0, 0};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        sendContolPack();
        setobjectanimoff(objectanim, imagePlay);

//            setVisMothion(imagevis2, textvis2, imagePlay2, objectanim, motionDims2, true);
//            updatecontroolPack();
//            setVisNo(imagevis, textvis2, imagePlay2, objectanim2, false);
    }

    public void bowl3REset(int settingitemIdforgame) {
        int g = settingitemIdforgame;
//        controolPack.addDataPackanimationStartEnds(g + 10, 100, 0, 0);
//        controolPack.addDataPackanimationStartEnds(g + 11, 100, 0, 0);
//        controolPack.addDataPackanimationStartEnds(g + 12, 100, 0, 0);
        int imagevis[] = {};
        int textvis[] = {};
        int imagePlay[] = {g + 10, g + 11, g + 12};
        int objectanim[] = {g + 10, g + 11, g + 12, g + 8, g + 6, g + 7};
        int motionDims[] = {0, 0, 0, 0, 0, 0};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        sendContolPack();
        setobjectanimoff(objectanim, imagePlay);
    }

    public void shutterShow(boolean onoff, int settingitemIdforgame) {
        int b = settingitemIdforgame;
        boolean send = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }
        int imagevis[] = {b + 5, b + 7};
        int textvis[] = {b + 8};
        int imagePlay[] = {};
        int objectanim[] = {b + 10, b + 5, b + 7, b + 8};
        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
        int objectanim2[] = {};
        int motionDims2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (onoff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            if (send) {
                sendContolPack();
                setobjectanimoff(objectanim, imagePlay);
            }

        } else {
            setVisMothion(imagevis2, textvis2, imagePlay, objectanim, motionDims2, true);
            if (send) {
                sendContolPack();
                setVisNo(imagevis, textvis, imagePlay2, objectanim2, false);
            }
        }
    }

    public void shutterShowAnswer(boolean onoff, int settingitemIdforgame, int textmotion) {
        int g = settingitemIdforgame;
        boolean send = true;
//        if (OnOff) {
//            int imagevis3[] = {t, t + 3, t + 6, t + 9, t + 12};
//            int textvis3[] = {t + 1, t + 2, t + 4, t + 5, t + 7, t + 8, t + 10, t + 11, t + 13, t + 14};
//            int imagePlay3[] = {};
//            int objectanim3[] = {};
//            int motionDims3[] = {};
//            setVisMothion(imagevis3, textvis3, imagePlay3, objectanim3, motionDims3, false);
//        }

        int objectanim[] = {g + 36, g + 10, g + 11, g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 21, g + 22, g + 23, g + 24, g + 25, g + 26, g + 27, g + 28, g + 29, g + 30, g + 31, g + 32, g + 33, g + 34};
        int motionDims[] = {textmotion, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int imagevis3[] = {g + 11, g + 13, g + 15, g + 17, g + 19, g + 21, g + 23, g + 25, g + 27, g + 29, g + 31, g + 33};
        int textvis3[] = {g + 12, g + 13, g + 14, g + 15, g + 16, g + 17, g + 18, g + 19, g + 20, g + 22, g + 24, g + 26, g + 28, g + 30, g + 32, g + 34};

        int imagevis[] = {};
        int textvis[] = {g + 36};
        int imagePlay[] = {};
//        int objectanim[] = {xx};
//        int motionDims[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int imagevis2[] = {};
        int textvis2[] = {};
        int imagePlay2[] = {};
//        int objectanim2[] = {};
        int motionDims2[] = {textmotion, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        if (onoff) {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            if (send) {
                sendContolPack();
                setobjectanimoff(objectanim, imagePlay);
            }

        } else {
            setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
            if (send) {
                sendContolPack();
                setVisNo(imagevis3, textvis3, imagePlay, objectanim, false);
            }
        }
    }

    public void reset() {
        hideAll();
        showBackground();
        sendThisControlPack();
    }

    private void showAllOff() {

    }

    private void showBackground() {
        runDatabaseMotion("background");
//        controolPack.addVis_Anim_Bool(4, true);
    }

    private void sendContolPack() {
        sendThisControlPack();
    }
    
    

}
