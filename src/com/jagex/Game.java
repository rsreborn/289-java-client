package com.jagex;

import java.applet.*;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.util.zip.CRC32;
import com.jagex.sign.Signlink;

public class Game extends Applet_Sub1
{

    public boolean aBoolean812;
    public long aLong813;
    public Class43_Sub1 aClass43_Sub1_814;
    public int anInt815;
    public int anInt816;
    public int anInt817;
    public int anInt818;
    public int anInt819;
    public boolean aBoolean820;
    public static int anInt821;
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_822;
    public String aString823;
    public int anInt824;
    public int anInt825;
    public int anInt826;
    public int anIntArray827[];
    public int anIntArray828[];
    public boolean aBoolean829;
    public byte aByte830;
    public int anInt831;
    public int anInt832;
    public int anInt833;
    public int anInt834;
    public int anInt835;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array836[];
    public int anIntArray837[];
    public int anIntArray838[];
    public int anIntArray839[];
    public int anIntArray840[];
    public int anInt841;
    public int anInt842;
    public int anInt843;
    public int anInt844;
    public static int anInt845;
    public int anIntArray846[];
    public boolean aBoolean847;
    public int anInt848;
    public int anIntArray849[];
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_850;
    public int anIntArray851[];
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_852;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_853;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_854;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_855;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_856;
    public int anInt857;
    public Class34 aClass34_858;
    public Class34 aClass34_859;
    public Class34 aClass34_860;
    public int anInt861;
    public int anInt862;
    public boolean aBoolean863;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array864[];
    public int anIntArrayArrayArray865[][][];
    public Class10 aClass10_866;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array867[];
    public int anIntArray868[];
    public int anInt869;
    public static int anInt870;
    public byte aByteArrayArrayArray871[][][];
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array872[];
    public static int anInt873;
    public int anInt874;
    public int anInt875;
    public int anInt876;
    public int anInt877;
    public int anInt878;
    public int anInt879;
    public int anInt880;
    public int anIntArray881[];
    public int anInt882;
    public byte aByte883;
    public byte aByte884;
    public int anIntArrayArray885[][];
    public boolean aBoolean886;
    public int anInt887;
    public int anInt888;
    public int anInt889;
    public int anInt890;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_891;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_892;
    public boolean aBoolean893;
    public int anIntArray894[];
    public int anInt895;
    public static boolean aBoolean896;
    public String aStringArray897[];
    public boolean aBoolean898;
    public int anInt899;
    public int anInt900;
    public int anInt901;
    public int anInt902;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_903;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_904;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_905;
    public boolean aBoolean906;
    public int anInt907;
    public boolean aBoolean908;
    public int anInt909;
    public int anIntArray910[];
    public int anInt911;
    public int anInt912;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_913;
    public int anIntArray914[];
    public int anIntArray915[];
    public int anIntArray916[];
    public int anInt917;
    public Class28 aClass28_918;
    public String aStringArray919[];
    public boolean aBooleanArray920[];
    public int anInt921;
    public boolean aBoolean922;
    public static int anInt923;
    public int anInt924;
    public byte aByte925;
    public String aString926;
    public Class46 aClass46_927;
    public int anInt928;
    public int anInt929;
    public int anInt930;
    public int anInt931;
    public int anInt932;
    public int anInt933;
    public boolean aBoolean934;
    public boolean aBoolean935;
    public int anInt936;
    public static boolean aBoolean937;
    public int anIntArray938[];
    public String aString939;
    public int anInt940;
    public int anIntArray941[];
    public int anInt942;
    public int anIntArray943[];
    public static int anInt944;
    public int anInt945;
    public boolean aBoolean946;
    public int anInt947;
    public int anInt948;
    public static byte aByte949 = -48;
    public boolean aBoolean950;
    public CRC32 aCRC32_951;
    public int anInt952;
    public int anInt953;
    public int anInt954;
    public int anInt955;
    public String aString956;
    public int anInt957;
    public static int anInt958 = 1;
    public int anInt959;
    public int anInt960;
    public int anIntArray961[];
    public int anInt962;
    public int anInt963;
    public int anInt964;
    public int anInt965;
    public static String aString966 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public long aLong967;
    public int anInt968;
    public int anInt969;
    public int anInt970;
    public int anInt971;
    public int anInt972;
    public byte aByteArrayArray973[][];
    public int anInt974;
    public int anIntArrayArray975[][];
    public int anIntArray976[];
    public byte aByte977;
    public int anInt978;
    public long aLongArray979[];
    public boolean aBoolean980;
    public byte aByteArrayArray981[][];
    public int anInt982;
    public int anInt983;
    public static int anIntArray984[];
    public boolean aBoolean985;
    public static int anInt986;
    public boolean aBoolean987;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_988;
    public int anInt989;
    public int anInt990;
    public int anInt991;
    public int anInt992;
    public int anInt993;
    public int anInt994;
    public int anInt995;
    public int anInt996;
    public String aString997;
    public int anInt998;
    public int anInt999;
    public int anInt1000;
    public int anIntArray1001[];
    public int anIntArray1002[];
    public String aStringArray1003[];
    public String aStringArray1004[];
    public int anInt1005;
    public int anIntArray1006[];
    public String aString1007;
    public Class44_Sub3_Sub4_Sub6_Sub2 aClass44_Sub3_Sub4_Sub6_Sub2Array1008[];
    public int anInt1009;
    public int anIntArray1010[];
    public int anInt1011;
    public int anInt1012;
    public Socket aSocket1013;
    public int anInt1014;
    public int anInt1015 = 100;
    public int anIntArray1016[];
    public int anInt1017;
    public int anIntArray1018[];
    public int anInt1019;
    public int anIntArray1020[];
    public int anIntArray1021[];
    public Class18 aClass18Array1022[];
    public int anInt1023;
    public int anIntArray1024[];
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1025;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1026;
    public int anInt1027;
    public int anInt1028;
    public static int anInt1029;
    public int anInt1030;
    public int anInt1031;
    public int anInt1032;
    public int anInt1033;
    public int anInt1034;
    public int anIntArray1035[];
    public boolean aBoolean1036;
    public int anInt1037;
    public int anInt1038;
    public int anIntArray1039[];
    public int anIntArray1040[];
    public int anIntArray1041[];
    public byte aByte1042;
    public static int anIntArray1043[] = {
        9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145,
        58654, 5027, 1457, 16565, 34991, 25486
    };
    public String aStringArray1044[];
    public static BigInteger rsaKey = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    public static int anInt1046;
    public static Class44_Sub3_Sub4_Sub6_Sub1 aClass44_Sub3_Sub4_Sub6_Sub1_1047;
    public long aLong1048;
    public boolean aBoolean1049;
    public boolean aBoolean1050;
    public int anIntArray1051[];
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array1052[];
    public byte aByte1053;
    public Class28 aClass28_1054;
    public boolean aBoolean1055;
    public int anInt1056;
    public boolean aBoolean1057;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1058;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1059;
    public int anIntArray1060[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
        -1, -1, -1, -1, -1
    };
    public static boolean aBoolean1061;
    public boolean aBoolean1062;
    public int anInt1063;
    public int anInt1064;
    public int anInt1065;
    public int anInt1066;
    public int anInt1067;
    public int anInt1068;
    public int anInt1069;
    public long aLong1070;
    public String aString1071;
    public String aString1072;
    public static int anIntArrayArray1073[][] = {
        {
            6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
            2983, 54193
        }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
            56621, 4783, 1341, 16578, 35003, 25239
        }, {
            25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
            10153, 56621, 4783, 1341, 16578, 35003
        }, {
            4626, 11146, 6439, 12, 4758, 10270
        }, {
            4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
        }
    };
    public int anInt1074;
    public int anInt1075;
    public int anInt1076;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1077;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1078;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1079;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1080;
    public int anInt1081;
    public int anInt1082;
    public int anInt1083;
    public boolean aBoolean1084;
    public int anInt1085;
    public byte aByte1086;
    public static int anInt1087;
    public static int anIntArray1088[];
    public int anInt1089;
    public int anIntArray1090[];
    public int anInt1091;
    public String aString1092;
    public int anInt1093;
    public int anInt1094;
    public int anInt1095;
    public int anInt1096;
    public int anInt1097;
    public byte aByte1098;
    public Class7 aClass7_1099;
    public static int anInt1100;
    public byte aByte1101;
    public String aString1102;
    public int anInt1103;
    public int anInt1104;
    public int anInt1105;
    public int anInt1106;
    public int anInt1107;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array1108[];
    public byte aByteArray1109[];
    public String aString1110;
    public String aString1111;
    public int anInt1112;
    public int anIntArrayArray1113[][];
    public static int anInt1114;
    public int anInt1115;
    public Class28 aClass28_1116;
    public Class47 aClass47_1117;
    public int anInt1118;
    public int anInt1119;
    public int anInt1120;
    public int anInt1121;
    public int anInt1122;
    public Class34 aClass34_1123;
    public Class34 aClass34_1124;
    public Class34 aClass34_1125;
    public Class34 aClass34_1126;
    public Class34 aClass34_1127;
    public Class34 aClass34_1128;
    public Class34 aClass34_1129;
    public Class34 aClass34_1130;
    public Class34 aClass34_1131;
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_1132;
    public int anIntArray1133[];
    public int anIntArray1134[];
    public static BigInteger rsaModulus = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1136;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1137;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1138;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1139;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1140;
    public String aString1141;
    public int anIntArray1142[] = {
        0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        2, 2, 3
    };
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1143;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1144;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1145;
    public Class28 aClass28ArrayArrayArray1146[][][];
    public boolean aBoolean1147;
    public int anInt1148;
    public int anInt1149;
    public int anInt1150;
    public int anInt1151;
    public int anInt1152;
    public int anInt1153;
    public boolean aBoolean1154;
    public int anInt1155;
    public boolean aBoolean1156;
    public int anInt1157;
    public int anInt1158;
    public int anIntArray1159[];
    public int anIntArray1160[];
    public int anIntArray1161[];
    public int anIntArray1162[];
    public int anIntArray1163[];
    public int anIntArray1164[];
    public int anIntArray1165[];
    public String aStringArray1166[];
    public static int anInt1167;
    public int anInt1168;
    public int anInt1169;
    public int anInt1170;
    public int anInt1171;
    public int anInt1172;
    public int anInt1173;
    public boolean aBoolean1174;
    public static int anInt1175;
    public int anInt1176;
    public int anInt1177;
    public boolean aBoolean1178;
    public boolean aBoolean1179;
    public static int anInt1180;
    public long aLong1181;
    public byte aByte1182;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array1183[];
    public int anInt1184;
    public int anInt1185;
    public int anInt1186;
    public int anInt1187;
    public int anInt1188;
    public int anInt1189;
    public int anInt1190;
    public boolean aBoolean1191;
    public Class36 aClass36_1192;
    public int anIntArray1193[];
    public static byte aByte1194 = 102;
    public Class34 aClass34_1195;
    public Class34 aClass34_1196;
    public Class34 aClass34_1197;
    public Class34 aClass34_1198;
    public int anInt1199;
    public int anInt1200;
    public Class5 aClass5_1201;
    public int anInt1202;
    public int anIntArray1203[] = {
        0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    public static int anInt1204;
    public int anInt1205;
    public int anIntArray1206[];
    public static int anInt1207;
    public Class45 aClass45Array1208[];
    public boolean aBooleanArray1209[];
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1210;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1211;
    public int anInt1212;
    public byte aByte1213;
    public int anIntArray1214[];
    public int anInt1215;
    public int anInt1216;
    public int anInt1217;
    public int anIntArray1218[];
    public int anIntArray1219[];
    public int anIntArray1220[];
    public int anIntArray1221[];
    public boolean aBoolean1222;
    public int anInt1223;
    public int anInt1224;
    public Class44_Sub3_Sub4_Sub6_Sub1 aClass44_Sub3_Sub4_Sub6_Sub1Array1225[];
    public int anInt1226;
    public int anIntArray1227[];
    public int anInt1228;
    public int anIntArray1229[];
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2Array1230[];
    public int anInt1231;
    public static int anInt1232 = 10;
    public static int anInt1233;
    public static boolean aBoolean1234 = true;
    public static boolean aBoolean1235;
    public boolean aBoolean1236;
    public boolean aBoolean1237;
    public static int anInt1238;
    public int anInt1239;
    public static int anInt1240;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array1241[];
    public int anInt1242;
    public int anInt1243;
    public int anInt1244;
    public int anInt1245;
    public static int anInt1246 = 604;
    public int anInt1247;
    public int anInt1248;
    public int anInt1249;
    public int anInt1250;
    public int anInt1251;
    public int anInt1252;
    public int anInt1253;
    public long aLongArray1254[];
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1255;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1256;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1257;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1258;
    public int anInt1259;
    public int anInt1260;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1261;
    public boolean aBoolean1262;
    public Class34 aClass34_1263;
    public Class34 aClass34_1264;
    public Class34 aClass34_1265;
    public Class34 aClass34_1266;
    public Class34 aClass34_1267;
    public Class34 aClass34_1268;
    public Class34 aClass34_1269;
    public Class34 aClass34_1270;
    public Class34 aClass34_1271;
    public int anIntArray1272[];
    public int anIntArray1273[];
    public static int anInt1274;
    public boolean aBoolean1275;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3Array1276[];
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1277;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1278;
    public static boolean aBoolean1279;

    public void init()
    {
        anInt1232 = Integer.parseInt(getParameter("nodeid"));
        anInt1233 = Integer.parseInt(getParameter("portoff"));
        String s = getParameter("lowmem");
        if(s != null && s.equals("1"))
        {
            method131(aByte1194);
        } else
        {
            method64(true);
        }
        String s1 = getParameter("free");
        if(s1 != null && s1.equals("1"))
        {
            aBoolean1234 = false;
        } else
        {
            aBoolean1234 = true;
        }
        method2(true, 765, 503);
        loadRSAKeys();
    }

    public void method7(int i)
    {
        try
        {
            if(i != 9)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            if(aBoolean1236 || aBoolean1055 || aBoolean820)
            {
                return;
            }
            anInt1240++;
            if(!aBoolean863)
            {
                method97((byte)122);
            } else
            {
                method56(anInt1056);
            }
            method93(false);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("47231, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public AppletContext getAppletContext()
    {
        if(Signlink.mainapp != null)
        {
            return Signlink.mainapp.getAppletContext();
        } else
        {
            return super.getAppletContext();
        }
    }

    public void method14(byte byte0)
    {
        try
        {
            if(byte0 != 1)
            {
                anInt1246 = 98;
            }
            if(anInt1095 != 0)
            {
                return;
            }
            int i = super.anInt27;
            if(anInt994 == 1 && super.anInt28 >= 516 && super.anInt29 >= 160 && super.anInt28 <= 765 && super.anInt29 <= 205)
            {
                i = 0;
            }
            if(aBoolean946)
            {
                if(i != 1)
                {
                    int j = super.anInt21;
                    int i1 = super.anInt22;
                    if(anInt1030 == 0)
                    {
                        j -= 4;
                        i1 -= 4;
                    }
                    if(anInt1030 == 1)
                    {
                        j -= 553;
                        i1 -= 205;
                    }
                    if(anInt1030 == 2)
                    {
                        j -= 17;
                        i1 -= 357;
                    }
                    if(j < anInt1031 - 10 || j > anInt1031 + anInt1033 + 10 || i1 < anInt1032 - 10 || i1 > anInt1032 + anInt1034 + 10)
                    {
                        aBoolean946 = false;
                        if(anInt1030 == 1)
                        {
                            aBoolean898 = true;
                        }
                        if(anInt1030 == 2)
                        {
                            aBoolean1049 = true;
                        }
                    }
                }
                if(i == 1)
                {
                    int k = anInt1031;
                    int j1 = anInt1032;
                    int l1 = anInt1033;
                    int j2 = super.anInt28;
                    int k2 = super.anInt29;
                    if(anInt1030 == 0)
                    {
                        j2 -= 4;
                        k2 -= 4;
                    }
                    if(anInt1030 == 1)
                    {
                        j2 -= 553;
                        k2 -= 205;
                    }
                    if(anInt1030 == 2)
                    {
                        j2 -= 17;
                        k2 -= 357;
                    }
                    int l2 = -1;
                    for(int i3 = 0; i3 < anInt971; i3++)
                    {
                        int j3 = j1 + 31 + (anInt971 - 1 - i3) * 15;
                        if(j2 > k && j2 < k + l1 && k2 > j3 - 13 && k2 < j3 + 3)
                        {
                            l2 = i3;
                        }
                    }
                    if(l2 != -1)
                    {
                        method134(l2, 725);
                    }
                    aBoolean946 = false;
                    if(anInt1030 == 1)
                    {
                        aBoolean898 = true;
                    }
                    if(anInt1030 == 2)
                    {
                        aBoolean1049 = true;
                        return;
                    }
                }
            } else
            {
                if(i == 1 && anInt971 > 0)
                {
                    int l = anIntArray839[anInt971 - 1];
                    if(l == 582 || l == 113 || l == 555 || l == 331 || l == 354 || l == 694 || l == 962 || l == 795 || l == 681 || l == 100 || l == 102 || l == 1328)
                    {
                        int k1 = anIntArray837[anInt971 - 1];
                        int i2 = anIntArray838[anInt971 - 1];
                        Class5 class5 = Class5.aClass5Array100[i2];
                        if(class5.aBoolean127 || class5.aBoolean130)
                        {
                            aBoolean847 = false;
                            anInt978 = 0;
                            anInt1093 = i2;
                            anInt1094 = k1;
                            anInt1095 = 2;
                            anInt1096 = super.anInt28;
                            anInt1097 = super.anInt29;
                            if(Class5.aClass5Array100[i2].anInt106 == anInt1199)
                            {
                                anInt1095 = 1;
                            }
                            if(Class5.aClass5Array100[i2].anInt106 == anInt1253)
                            {
                                anInt1095 = 3;
                            }
                            return;
                        }
                    }
                }
                if(i == 1 && (anInt862 == 1 || method26(anInt971 - 1, -40)) && anInt971 > 2)
                {
                    i = 2;
                }
                if(i == 1 && anInt971 > 0)
                {
                    method134(anInt971 - 1, 725);
                }
                if(i == 2 && anInt971 > 0)
                {
                    method89(anInt899);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("43374, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method15(int i, Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2, int j, int k)
    {
        try
        {
            int l = i * i + j * j;
            if(k != 0)
            {
                aClass44_Sub3_Sub2_850.method472(121);
            }
            if(l > 4225 && l < 0x15f90)
            {
                int i1 = anInt930 + anInt959 & 0x7ff;
                int j1 = Class44_Sub3_Sub4_Sub4.anIntArray1598[i1];
                int k1 = Class44_Sub3_Sub4_Sub4.anIntArray1599[i1];
                j1 = (j1 * 256) / (anInt1075 + 256);
                k1 = (k1 * 256) / (anInt1075 + 256);
                int l1 = j * j1 + i * k1 >> 16;
                int i2 = j * k1 - i * j1 >> 16;
                double d = Math.atan2(l1, i2);
                int j2 = (int)(Math.sin(d) * 63D);
                int k2 = (int)(Math.cos(d) * 57D);
                aClass44_Sub3_Sub1_Sub2_1261.method445(15, d, 20, 256, 15, (94 + j2 + 4) - 10, (byte)8, 20, 83 - k2 - 20);
                return;
            } else
            {
                method141(i, class44_sub3_sub1_sub2, 139, j);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("6403, " + i + ", " + class44_sub3_sub1_sub2 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method16(int i)
    {
        try
        {
            method63(-411);
            if(anInt818 == 1)
            {
                aClass44_Sub3_Sub1_Sub2Array867[anInt817 / 100].method440(anInt816 - 8 - 4, aByte1213, anInt815 - 8 - 4);
            }
            if(anInt818 == 2)
            {
                aClass44_Sub3_Sub1_Sub2Array867[4 + anInt817 / 100].method440(anInt816 - 8 - 4, aByte1213, anInt815 - 8 - 4);
                anInt923++;
                if(anInt923 > 57)
                {
                    anInt923 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 85);
                }
            }
            if(anInt924 != -1)
            {
                method65(anInt824, anInt924, (byte)-103);
                method37(6, 0, 0, Class5.aClass5Array100[anInt924], 0);
            }
            if(anInt1199 != -1)
            {
                method65(anInt824, anInt1199, (byte)-103);
                method37(6, 0, 0, Class5.aClass5Array100[anInt1199], 0);
            }
            method24((byte)-128);
            if(i != anInt969)
            {
                aClass44_Sub3_Sub2_850.method472(186);
            }
            if(!aBoolean946)
            {
                method54((byte)6);
                method52(521);
            } else
            if(anInt1030 == 0)
            {
                method115(393);
            }
            if(anInt1112 == 1)
            {
                aClass44_Sub3_Sub1_Sub2Array1183[1].method440(296, aByte1213, 472);
            }
            if(anInt998 != 0)
            {
                int j = anInt998 / 50;
                int k = j / 60;
                j %= 60;
                if(j < 10)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method459((byte)-104, 0xffff00, "System update in: " + k + ":0" + j, 4, 329);
                    return;
                } else
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method459((byte)-104, 0xffff00, "System update in: " + k + ":" + j, 4, 329);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("39313, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method17(int i, byte byte0, String s, String s1)
    {
        try
        {
            if(i == 0 && anInt965 != -1)
            {
                aString823 = s;
                super.anInt27 = 0;
            }
            if(anInt1253 == -1)
            {
                aBoolean1049 = true;
            }
            for(int j = 99; j > 0; j--)
            {
                anIntArray1002[j] = anIntArray1002[j - 1];
                aStringArray1003[j] = aStringArray1003[j - 1];
                aStringArray1004[j] = aStringArray1004[j - 1];
            }
            if(byte0 != -115)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            anIntArray1002[0] = i;
            aStringArray1003[0] = s1;
            aStringArray1004[0] = s;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("60879, " + i + ", " + byte0 + ", " + s + ", " + s1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method18(int i)
    {
        try
        {
            anInt1169 += i;
            Signlink.midifade = 0;
            Signlink.midi = "stop";
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("82229, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method19(byte byte0, Class5 class5)
    {
        try
        {
            if(byte0 != -16)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            int i = class5.anInt109;
            if(anInt1105 == 2)
            {
                if(i == 201)
                {
                    aBoolean1049 = true;
                    aBoolean980 = false;
                    aBoolean1222 = true;
                    aString1007 = "";
                    anInt880 = 1;
                    aString1102 = "Enter name of friend to add to list";
                }
                if(i == 202)
                {
                    aBoolean1049 = true;
                    aBoolean980 = false;
                    aBoolean1222 = true;
                    aString1007 = "";
                    anInt880 = 2;
                    aString1102 = "Enter name of friend to delete from list";
                }
            }
            if(i == 205)
            {
                anInt1173 = 250;
                return true;
            }
            if(i == 501)
            {
                aBoolean1049 = true;
                aBoolean980 = false;
                aBoolean1222 = true;
                aString1007 = "";
                anInt880 = 4;
                aString1102 = "Enter name of player to add to list";
            }
            if(i == 502)
            {
                aBoolean1049 = true;
                aBoolean980 = false;
                aBoolean1222 = true;
                aString1007 = "";
                anInt880 = 5;
                aString1102 = "Enter name of player to delete from list";
            }
            if(i >= 300 && i <= 313)
            {
                int j = (i - 300) / 2;
                int i1 = i & 1;
                int l1 = anIntArray849[j];
                if(l1 != -1)
                {
                    do
                    {
                        if(i1 == 0 && --l1 < 0)
                        {
                            l1 = Class22.anInt463 - 1;
                        }
                        if(i1 == 1 && ++l1 >= Class22.anInt463)
                        {
                            l1 = 0;
                        }
                    } while(Class22.aClass22Array464[l1].aBoolean470 || Class22.aClass22Array464[l1].anInt465 != j + (aBoolean1179 ? 0 : 7));
                    anIntArray849[j] = l1;
                    aBoolean812 = true;
                }
            }
            if(i >= 314 && i <= 323)
            {
                int k = (i - 314) / 2;
                int j1 = i & 1;
                int i2 = anIntArray938[k];
                if(j1 == 0 && --i2 < 0)
                {
                    i2 = anIntArrayArray1073[k].length - 1;
                }
                if(j1 == 1 && ++i2 >= anIntArrayArray1073[k].length)
                {
                    i2 = 0;
                }
                anIntArray938[k] = i2;
                aBoolean812 = true;
            }
            if(i == 324 && !aBoolean1179)
            {
                aBoolean1179 = true;
                method70(aByte883);
            }
            if(i == 325 && aBoolean1179)
            {
                aBoolean1179 = false;
                method70(aByte883);
            }
            if(i == 326)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 27);
                aClass44_Sub3_Sub2_850.method472(aBoolean1179 ? 0 : 1);
                for(int l = 0; l < 7; l++)
                {
                    aClass44_Sub3_Sub2_850.method472(anIntArray849[l]);
                }
                for(int k1 = 0; k1 < 5; k1++)
                {
                    aClass44_Sub3_Sub2_850.method472(anIntArray938[k1]);
                }
                return true;
            }
            if(i == 613)
            {
                aBoolean987 = !aBoolean987;
            }
            if(i >= 601 && i <= 612)
            {
                method28(3);
                if(aString939.length() > 0)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 94);
                    aClass44_Sub3_Sub2_850.method478(Class48.method550(aString939), true);
                    aClass44_Sub3_Sub2_850.method472(i - 601);
                    aClass44_Sub3_Sub2_850.method472(aBoolean987 ? 1 : 0);
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("38005, " + byte0 + ", " + class5 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method20(int i)
    {
        try
        {
            for(int j = -1; j < anInt1226; j++)
            {
                int k;
                if(j == -1)
                {
                    k = anInt1224;
                } else
                {
                    k = anIntArray1227[j];
                }
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k];
                if(class44_sub3_sub4_sub6_sub1 != null && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1628 > 0)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1628--;
                    if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1628 == 0)
                    {
                        class44_sub3_sub4_sub6_sub1.aString1627 = null;
                    }
                }
            }
            for(int l = 0; l < anInt1009; l++)
            {
                int i1 = anIntArray1010[l];
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[i1];
                if(class44_sub3_sub4_sub6_sub2 != null && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1628 > 0)
                {
                    class44_sub3_sub4_sub6_sub2.anInt1628--;
                    if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1628 == 0)
                    {
                        class44_sub3_sub4_sub6_sub2.aString1627 = null;
                    }
                }
            }
            if(i != 0)
            {
                aClass44_Sub3_Sub2_850.method472(252);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("41421, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method21(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            aClass44_Sub3_Sub1_Sub3_1058.method453(i, aByte1213, j);
            aClass44_Sub3_Sub1_Sub3_1059.method453((i + i1) - 16, aByte1213, j);
            Class44_Sub3_Sub1.method411(anInt1000, 210, i + 16, i1 - 32, j, 16);
            int k1 = ((i1 - 32) * i1) / l;
            if(k1 < 8)
            {
                k1 = 8;
            }
            int l1 = ((i1 - 32 - k1) * k) / (l - i1);
            Class44_Sub3_Sub1.method411(anInt1200, 210, i + 16 + l1, k1, j, 16);
            Class44_Sub3_Sub1.method416(i + 16 + l1, j, anInt1085, k1, 0);
            Class44_Sub3_Sub1.method416(i + 16 + l1, j + 1, anInt1085, k1, 0);
            Class44_Sub3_Sub1.method414(16, j, anInt1085, true, i + 16 + l1);
            Class44_Sub3_Sub1.method414(16, j, anInt1085, true, i + 17 + l1);
            Class44_Sub3_Sub1.method416(i + 16 + l1, j + 15, anInt844, k1, 0);
            Class44_Sub3_Sub1.method416(i + 17 + l1, j + 14, anInt844, k1 - 1, 0);
            Class44_Sub3_Sub1.method414(16, j, anInt844, true, i + 15 + l1 + k1);
            Class44_Sub3_Sub1.method414(15, j + 1, anInt844, true, i + 14 + l1 + k1);
            if(j1 != 3)
            {
                aClass28ArrayArrayArray1146 = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("34190, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method22(byte byte0)
    {
        try
        {
            try
            {
                if(aClass7_1099 != null)
                {
                    aClass7_1099.method191();
                }
            }
            catch(Exception _ex)
            {
            }
            aClass7_1099 = null;
            aBoolean863 = false;
            anInt1014 = 0;
            aString1071 = "";
            aString1072 = "";
            method76(aByte1042);
            aClass36_1192.method278(true);
            if(byte0 != 25)
            {
                anInt1170 = -1;
            }
            for(int i = 0; i < 4; i++)
            {
                aClass18Array1022[i].method231(3);
            }
            System.gc();
            method18(0);
            anInt963 = -1;
            anInt1190 = -1;
            anInt942 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("79964, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method23(int i)
    {
        try
        {
            if(i <= 0)
            {
                anInt962 = -451;
            }
            if(anInt882 == 2)
            {
                for(Class44_Sub1 class44_sub1 = (Class44_Sub1)aClass28_1116.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1)aClass28_1116.method261(false))
                {
                    if(class44_sub1.anInt1334 > 0)
                    {
                        class44_sub1.anInt1334--;
                    }
                    if(class44_sub1.anInt1334 == 0)
                    {
                        if(class44_sub1.anInt1327 < 0 || Class3.method173(class44_sub1.anInt1327, class44_sub1.anInt1329, 677))
                        {
                            method73(class44_sub1.anInt1328, 0, class44_sub1.anInt1329, class44_sub1.anInt1323, class44_sub1.anInt1327, class44_sub1.anInt1325, class44_sub1.anInt1324, class44_sub1.anInt1326);
                            class44_sub1.method404();
                        }
                    } else
                    {
                        if(class44_sub1.anInt1333 > 0)
                        {
                            class44_sub1.anInt1333--;
                        }
                        if(class44_sub1.anInt1333 == 0 && class44_sub1.anInt1325 >= 1 && class44_sub1.anInt1326 >= 1 && class44_sub1.anInt1325 <= 102 && class44_sub1.anInt1326 <= 102 && (class44_sub1.anInt1330 < 0 || Class3.method173(class44_sub1.anInt1330, class44_sub1.anInt1332, 677)))
                        {
                            method73(class44_sub1.anInt1331, 0, class44_sub1.anInt1332, class44_sub1.anInt1323, class44_sub1.anInt1330, class44_sub1.anInt1325, class44_sub1.anInt1324, class44_sub1.anInt1326);
                            class44_sub1.anInt1333 = -1;
                            if(class44_sub1.anInt1330 == class44_sub1.anInt1327 && class44_sub1.anInt1327 == -1)
                            {
                                class44_sub1.method404();
                            } else
                            if(class44_sub1.anInt1330 == class44_sub1.anInt1327 && class44_sub1.anInt1331 == class44_sub1.anInt1328 && class44_sub1.anInt1332 == class44_sub1.anInt1329)
                            {
                                class44_sub1.method404();
                            }
                        }
                    }
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("56217, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method24(byte byte0)
    {
        try
        {
            if(byte0 != -128)
            {
                anInt1247 = aClass46_927.method545();
            }
            anInt1245 = 0;
            int i = (((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 >> 7) + anInt1184;
            int j = (((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 >> 7) + anInt1185;
            if(i >= 3053 && i <= 3156 && j >= 3056 && j <= 3136)
            {
                anInt1245 = 1;
            }
            if(i >= 3072 && i <= 3118 && j >= 9492 && j <= 9535)
            {
                anInt1245 = 1;
            }
            if(anInt1245 == 1 && i >= 3139 && i <= 3199 && j >= 3008 && j <= 3062)
            {
                anInt1245 = 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("82905, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method25(int i)
    {
        try
        {
            char c = '\u0100';
            for(int j = 10; j < 117; j++)
            {
                int k = (int)(Math.random() * 100D);
                if(k < 50)
                {
                    anIntArray1272[j + (c - 2 << 7)] = 255;
                }
            }
            for(int l = 0; l < 100; l++)
            {
                int i1 = (int)(Math.random() * 124D) + 2;
                int k1 = (int)(Math.random() * 128D) + 128;
                int k2 = i1 + (k1 << 7);
                anIntArray1272[k2] = 192;
            }
            for(int j1 = 1; j1 < c - 1; j1++)
            {
                for(int l1 = 1; l1 < 127; l1++)
                {
                    int l2 = l1 + (j1 << 7);
                    anIntArray1273[l2] = (anIntArray1272[l2 - 1] + anIntArray1272[l2 + 1] + anIntArray1272[l2 - 128] + anIntArray1272[l2 + 128]) / 4;
                }
            }
            anInt890 += 128;
            i = 27 / i;
            if(anInt890 > anIntArray1133.length)
            {
                anInt890 -= anIntArray1133.length;
                int i2 = (int)(Math.random() * 12D);
                method109(aClass44_Sub3_Sub1_Sub3Array864[i2], 34809);
            }
            for(int j2 = 1; j2 < c - 1; j2++)
            {
                for(int i3 = 1; i3 < 127; i3++)
                {
                    int k3 = i3 + (j2 << 7);
                    int i4 = anIntArray1273[k3 + 128] - anIntArray1133[k3 + anInt890 & anIntArray1133.length - 1] / 5;
                    if(i4 < 0)
                    {
                        i4 = 0;
                    }
                    anIntArray1272[k3] = i4;
                }
            }
            for(int j3 = 0; j3 < c - 1; j3++)
            {
                anIntArray1018[j3] = anIntArray1018[j3 + 1];
            }
            anIntArray1018[c - 1] = (int)(Math.sin((double)anInt1240 / 14D) * 16D + Math.sin((double)anInt1240 / 15D) * 14D + Math.sin((double)anInt1240 / 16D) * 12D);
            if(anInt1259 > 0)
            {
                anInt1259 -= 4;
            }
            if(anInt1260 > 0)
            {
                anInt1260 -= 4;
            }
            if(anInt1259 == 0 && anInt1260 == 0)
            {
                int l3 = (int)(Math.random() * 2000D);
                if(l3 == 0)
                {
                    anInt1259 = 1024;
                }
                if(l3 == 1)
                {
                    anInt1260 = 1024;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("53446, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method26(int i, int j)
    {
        try
        {
            if(i < 0)
            {
                return false;
            }
            int k = anIntArray839[i];
            if(j >= 0)
            {
                anInt1242 = aClass46_927.method545();
            }
            if(k >= 2000)
            {
                k -= 2000;
            }
            return k == 605;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("17125, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method27(byte byte0)
    {
        try
        {
            int i = 5;
            anIntArray1051[8] = 0;
            if(byte0 != -48)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            int j = 0;
            while(anIntArray1051[8] == 0)
            {
                String s = "Unknown problem";
                method13(false, 20, "Connecting to web server");
                try
                {
                    DataInputStream datainputstream = method77("crc" + (int)(Math.random() * 99999999D) + "-" + 289);
                    com.jagex.Class44_Sub3_Sub2 class44_sub3_sub2 = new com.jagex.Class44_Sub3_Sub2(new byte[40], 15787);
                    datainputstream.readFully(class44_sub3_sub2.aByteArray1391, 0, 40);
                    datainputstream.close();
                    for(int l = 0; l < 9; l++)
                    {
                        anIntArray1051[l] = class44_sub3_sub2.method487();
                    }
                    int i1 = class44_sub3_sub2.method487();
                    int j1 = 1234;
                    for(int k1 = 0; k1 < 9; k1++)
                    {
                        j1 = (j1 << 1) + anIntArray1051[k1];
                    }
                    if(i1 != j1)
                    {
                        s = "checksum problem";
                        anIntArray1051[8] = 0;
                    }
                }
                catch(EOFException _ex)
                {
                    s = "EOF problem";
                    anIntArray1051[8] = 0;
                }
                catch(IOException _ex)
                {
                    s = "connection problem";
                    anIntArray1051[8] = 0;
                }
                catch(Exception _ex)
                {
                    s = "logic problem";
                    anIntArray1051[8] = 0;
                    if(!Signlink.reporterror)
                    {
                        return;
                    }
                }
                if(anIntArray1051[8] == 0)
                {
                    j++;
                    for(int k = i; k > 0; k--)
                    {
                        if(j >= 10)
                        {
                            method13(false, 10, "com.jagex.Game updated - please reload page");
                            k = 10;
                        } else
                        {
                            method13(false, 10, s + " - Will retry in " + k + " secs.");
                        }
                        try
                        {
                            Thread.sleep(1000L);
                        }
                        catch(Exception _ex)
                        {
                        }
                    }
                    i *= 2;
                    if(i > 60)
                    {
                        i = 60;
                    }
                    aBoolean922 = !aBoolean922;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("95813, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method28(int i)
    {
        try
        {
            if(i < 3 || i > 3)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            aClass44_Sub3_Sub2_850.method471(-34003, 93);
            if(anInt889 != -1)
            {
                anInt889 = -1;
                aBoolean898 = true;
                aBoolean935 = false;
                aBoolean1154 = true;
            }
            if(anInt1253 != -1)
            {
                anInt1253 = -1;
                aBoolean1049 = true;
                aBoolean935 = false;
            }
            anInt1199 = -1;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("99207, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method29(byte byte0)
    {
        try
        {
            System.out.println("============");
            System.out.println("flame-cycle:" + anInt945);
            if(aClass43_Sub1_814 != null)
            {
                System.out.println("Od-cycle:" + aClass43_Sub1_814.anInt1322);
            }
            System.out.println("loop-cycle:" + anInt1240);
            System.out.println("draw-cycle:" + anInt1175);
            System.out.println("ptype:" + anInt1170);
            System.out.println("psize:" + anInt1169);
            if(aClass7_1099 != null)
            {
                aClass7_1099.method196((byte)-11);
            }
            super.aBoolean10 = true;
            if(byte0 != -11)
            {
                for(int i = 1; i > 0; i++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("31857, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Component method11(int i)
    {
        try
        {
            if(i < 7 || i > 7)
            {
                aBoolean1178 = !aBoolean1178;
            }
            if(Signlink.mainapp != null)
            {
                return Signlink.mainapp;
            }
            if(super.aFrame_Sub1_16 != null)
            {
                return super.aFrame_Sub1_16;
            } else
            {
                return this;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("75072, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method30(int i, int j, int k, Class5 class5, int l, int i1, int j1)
    {
        try
        {
            if(class5.anInt107 != 0 || class5.anIntArray122 == null || class5.aBoolean121)
            {
                return;
            }
            if(k < i || i1 < l || k > i + class5.anInt110 || i1 > l + class5.anInt111)
            {
                return;
            }
            int k1 = class5.anIntArray122.length;
            if(j1 <= 0)
            {
                return;
            }
            for(int l1 = 0; l1 < k1; l1++)
            {
                int i2 = class5.anIntArray123[l1] + i;
                int j2 = (class5.anIntArray124[l1] + l) - j;
                Class5 class5_1 = Class5.aClass5Array100[class5.anIntArray122[l1]];
                i2 += class5_1.anInt113;
                j2 += class5_1.anInt114;
                if((class5_1.anInt118 >= 0 || class5_1.anInt145 != 0) && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                {
                    if(class5_1.anInt118 >= 0)
                    {
                        anInt825 = class5_1.anInt118;
                    } else
                    {
                        anInt825 = class5_1.anInt105;
                    }
                }
                if(class5_1.anInt107 == 0)
                {
                    method30(i2, class5_1.anInt120, k, class5_1, j2, i1, 792);
                    if(class5_1.anInt119 > class5_1.anInt111)
                    {
                        method81(j2, k, class5_1, i2 + class5_1.anInt110, true, class5_1.anInt111, aByte830, i1, class5_1.anInt119);
                    }
                } else
                {
                    if(class5_1.anInt108 == 1 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        boolean flag = false;
                        if(class5_1.anInt109 != 0)
                        {
                            flag = method107(class5_1, true);
                        }
                        if(!flag)
                        {
                            aStringArray897[anInt971] = class5_1.aString161;
                            anIntArray839[anInt971] = 231;
                            anIntArray838[anInt971] = class5_1.anInt105;
                            anInt971++;
                        }
                    }
                    if(class5_1.anInt108 == 2 && anInt994 == 0 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        String s = class5_1.aString158;
                        if(s.indexOf(" ") != -1)
                        {
                            s = s.substring(0, s.indexOf(" "));
                        }
                        aStringArray897[anInt971] = s + " @gre@" + class5_1.aString159;
                        anIntArray839[anInt971] = 274;
                        anIntArray838[anInt971] = class5_1.anInt105;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 3 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = "Close";
                        anIntArray839[anInt971] = 737;
                        anIntArray838[anInt971] = class5_1.anInt105;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 4 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.aString161;
                        anIntArray839[anInt971] = 435;
                        anIntArray838[anInt971] = class5_1.anInt105;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 5 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.aString161;
                        anIntArray839[anInt971] = 225;
                        anIntArray838[anInt971] = class5_1.anInt105;
                        anInt971++;
                    }
                    if(class5_1.anInt108 == 6 && !aBoolean935 && k >= i2 && i1 >= j2 && k < i2 + class5_1.anInt110 && i1 < j2 + class5_1.anInt111)
                    {
                        aStringArray897[anInt971] = class5_1.aString161;
                        anIntArray839[anInt971] = 997;
                        anIntArray838[anInt971] = class5_1.anInt105;
                        anInt971++;
                    }
                    if(class5_1.anInt107 == 2)
                    {
                        int k2 = 0;
                        for(int l2 = 0; l2 < class5_1.anInt111; l2++)
                        {
                            for(int i3 = 0; i3 < class5_1.anInt110; i3++)
                            {
                                int j3 = i2 + i3 * (32 + class5_1.anInt131);
                                int k3 = j2 + l2 * (32 + class5_1.anInt132);
                                if(k2 < 20)
                                {
                                    j3 += class5_1.anIntArray134[k2];
                                    k3 += class5_1.anIntArray135[k2];
                                }
                                if(k >= j3 && i1 >= k3 && k < j3 + 32 && i1 < k3 + 32)
                                {
                                    anInt982 = k2;
                                    anInt983 = class5_1.anInt105;
                                    if(class5_1.anIntArray101[k2] > 0)
                                    {
                                        Class14 class14 = Class14.method220(class5_1.anIntArray101[k2] - 1);
                                        if(anInt952 == 1 && class5_1.aBoolean128)
                                        {
                                            if(class5_1.anInt105 != anInt954 || k2 != anInt953)
                                            {
                                                aStringArray897[anInt971] = "Use " + aString956 + " with @lre@" + class14.aString331;
                                                anIntArray839[anInt971] = 398;
                                                anIntArray840[anInt971] = class14.anInt329;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.anInt105;
                                                anInt971++;
                                            }
                                        } else
                                        if(anInt994 == 1 && class5_1.aBoolean128)
                                        {
                                            if((anInt996 & 0x10) == 16)
                                            {
                                                aStringArray897[anInt971] = aString997 + " @lre@" + class14.aString331;
                                                anIntArray839[anInt971] = 563;
                                                anIntArray840[anInt971] = class14.anInt329;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.anInt105;
                                                anInt971++;
                                            }
                                        } else
                                        {
                                            if(class5_1.aBoolean128)
                                            {
                                                for(int l3 = 4; l3 >= 3; l3--)
                                                {
                                                    if(class14.aStringArray346 != null && class14.aStringArray346[l3] != null)
                                                    {
                                                        aStringArray897[anInt971] = class14.aStringArray346[l3] + " @lre@" + class14.aString331;
                                                        if(l3 == 3)
                                                        {
                                                            anIntArray839[anInt971] = 681;
                                                        }
                                                        if(l3 == 4)
                                                        {
                                                            anIntArray839[anInt971] = 100;
                                                        }
                                                        anIntArray840[anInt971] = class14.anInt329;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.anInt105;
                                                        anInt971++;
                                                    } else
                                                    if(l3 == 4)
                                                    {
                                                        aStringArray897[anInt971] = "Drop @lre@" + class14.aString331;
                                                        anIntArray839[anInt971] = 100;
                                                        anIntArray840[anInt971] = class14.anInt329;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.anInt105;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            if(class5_1.aBoolean129)
                                            {
                                                aStringArray897[anInt971] = "Use @lre@" + class14.aString331;
                                                anIntArray839[anInt971] = 102;
                                                anIntArray840[anInt971] = class14.anInt329;
                                                anIntArray837[anInt971] = k2;
                                                anIntArray838[anInt971] = class5_1.anInt105;
                                                anInt971++;
                                            }
                                            if(class5_1.aBoolean128 && class14.aStringArray346 != null)
                                            {
                                                for(int i4 = 2; i4 >= 0; i4--)
                                                {
                                                    if(class14.aStringArray346[i4] != null)
                                                    {
                                                        aStringArray897[anInt971] = class14.aStringArray346[i4] + " @lre@" + class14.aString331;
                                                        if(i4 == 0)
                                                        {
                                                            anIntArray839[anInt971] = 694;
                                                        }
                                                        if(i4 == 1)
                                                        {
                                                            anIntArray839[anInt971] = 962;
                                                        }
                                                        if(i4 == 2)
                                                        {
                                                            anIntArray839[anInt971] = 795;
                                                        }
                                                        anIntArray840[anInt971] = class14.anInt329;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.anInt105;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            if(class5_1.aStringArray136 != null)
                                            {
                                                for(int j4 = 4; j4 >= 0; j4--)
                                                {
                                                    if(class5_1.aStringArray136[j4] != null)
                                                    {
                                                        aStringArray897[anInt971] = class5_1.aStringArray136[j4] + " @lre@" + class14.aString331;
                                                        if(j4 == 0)
                                                        {
                                                            anIntArray839[anInt971] = 582;
                                                        }
                                                        if(j4 == 1)
                                                        {
                                                            anIntArray839[anInt971] = 113;
                                                        }
                                                        if(j4 == 2)
                                                        {
                                                            anIntArray839[anInt971] = 555;
                                                        }
                                                        if(j4 == 3)
                                                        {
                                                            anIntArray839[anInt971] = 331;
                                                        }
                                                        if(j4 == 4)
                                                        {
                                                            anIntArray839[anInt971] = 354;
                                                        }
                                                        anIntArray840[anInt971] = class14.anInt329;
                                                        anIntArray837[anInt971] = k2;
                                                        anIntArray838[anInt971] = class5_1.anInt105;
                                                        anInt971++;
                                                    }
                                                }
                                            }
                                            aStringArray897[anInt971] = "Examine @lre@" + class14.aString331;
                                            anIntArray839[anInt971] = 1328;
                                            anIntArray840[anInt971] = class14.anInt329;
                                            anIntArray837[anInt971] = k2;
                                            anIntArray838[anInt971] = class5_1.anInt105;
                                            anInt971++;
                                        }
                                    }
                                }
                                k2++;
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("12590, " + i + ", " + j + ", " + k + ", " + class5 + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method31(boolean flag)
    {
        try
        {
            aBoolean863 &= flag;
            if(aClass7_1099 == null)
            {
                return false;
            }
            try
            {
                int i = aClass7_1099.method193();
                if(i == 0)
                {
                    return false;
                }
                if(anInt1170 == -1)
                {
                    aClass7_1099.method194(aClass44_Sub3_Sub2_1132.aByteArray1391, 0, 1);
                    anInt1170 = aClass44_Sub3_Sub2_1132.aByteArray1391[0] & 0xff;
                    if(aClass46_927 != null)
                    {
                        anInt1170 = anInt1170 - aClass46_927.method545() & 0xff;
                    }
                    anInt1169 = Class16.anIntArray398[anInt1170];
                    i--;
                }
                if(anInt1169 == -1)
                {
                    if(i > 0)
                    {
                        aClass7_1099.method194(aClass44_Sub3_Sub2_1132.aByteArray1391, 0, 1);
                        anInt1169 = aClass44_Sub3_Sub2_1132.aByteArray1391[0] & 0xff;
                        i--;
                    } else
                    {
                        return false;
                    }
                }
                if(anInt1169 == -2)
                {
                    if(i > 1)
                    {
                        aClass7_1099.method194(aClass44_Sub3_Sub2_1132.aByteArray1391, 0, 2);
                        aClass44_Sub3_Sub2_1132.anInt1392 = 0;
                        anInt1169 = aClass44_Sub3_Sub2_1132.method484();
                        i -= 2;
                    } else
                    {
                        return false;
                    }
                }
                if(i < anInt1169)
                {
                    return false;
                }
                aClass44_Sub3_Sub2_1132.anInt1392 = 0;
                aClass7_1099.method194(aClass44_Sub3_Sub2_1132.aByteArray1391, 0, anInt1169);
                anInt1171 = 0;
                anInt1069 = anInt1068;
                anInt1068 = anInt1067;
                anInt1067 = anInt1170;
                if(anInt1170 == 55)
                {
                    int j = aClass44_Sub3_Sub2_1132.method484();
                    int l9 = aClass44_Sub3_Sub2_1132.method484();
                    if(anInt1253 != -1)
                    {
                        anInt1253 = -1;
                        aBoolean1049 = true;
                    }
                    if(aBoolean980)
                    {
                        aBoolean980 = false;
                        aBoolean1049 = true;
                    }
                    anInt1199 = j;
                    anInt889 = l9;
                    aBoolean898 = true;
                    aBoolean1154 = true;
                    aBoolean935 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 13)
                {
                    anInt843 = aClass44_Sub3_Sub2_1132.method482();
                    anInt895 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1168 = aClass44_Sub3_Sub2_1132.method482();
                    aBoolean1062 = true;
                    aBoolean1049 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 195)
                {
                    if(anInt1027 == 12)
                    {
                        aBoolean898 = true;
                    }
                    anInt936 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 46)
                {
                    if(anInt1027 == 12)
                    {
                        aBoolean898 = true;
                    }
                    anInt1205 = aClass44_Sub3_Sub2_1132.method485();
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 59)
                {
                    int k = aClass44_Sub3_Sub2_1132.method484();
                    String s2 = aClass44_Sub3_Sub2_1132.method489();
                    Class5.aClass5Array100[k].aString141 = s2;
                    if(Class5.aClass5Array100[k].anInt106 == anIntArray1060[anInt1027])
                    {
                        aBoolean898 = true;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 120)
                {
                    anInt1115 = aClass44_Sub3_Sub2_1132.method484();
                    anInt1089 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 79)
                {
                    int l = aClass44_Sub3_Sub2_1132.method484();
                    int i10 = aClass44_Sub3_Sub2_1132.method485();
                    int i15 = aClass44_Sub3_Sub2_1132.method485();
                    Class5 class5_5 = Class5.aClass5Array100[l];
                    class5_5.anInt113 = i10;
                    class5_5.anInt114 = i15;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 252)
                {
                    int i1 = aClass44_Sub3_Sub2_1132.method484();
                    method104(i1, -44196);
                    if(anInt1253 != -1)
                    {
                        anInt1253 = -1;
                        aBoolean1049 = true;
                    }
                    if(aBoolean980)
                    {
                        aBoolean980 = false;
                        aBoolean1049 = true;
                    }
                    anInt889 = i1;
                    aBoolean898 = true;
                    aBoolean1154 = true;
                    anInt1199 = -1;
                    aBoolean935 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 115)
                {
                    anInt1005 = aClass44_Sub3_Sub2_1132.method482();
                    if(anInt1005 == 1)
                    {
                        anInt901 = aClass44_Sub3_Sub2_1132.method484();
                    }
                    if(anInt1005 >= 2 && anInt1005 <= 6)
                    {
                        if(anInt1005 == 2)
                        {
                            anInt1251 = 64;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 3)
                        {
                            anInt1251 = 0;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 4)
                        {
                            anInt1251 = 128;
                            anInt1252 = 64;
                        }
                        if(anInt1005 == 5)
                        {
                            anInt1251 = 64;
                            anInt1252 = 0;
                        }
                        if(anInt1005 == 6)
                        {
                            anInt1251 = 64;
                            anInt1252 = 128;
                        }
                        anInt1005 = 2;
                        anInt1248 = aClass44_Sub3_Sub2_1132.method484();
                        anInt1249 = aClass44_Sub3_Sub2_1132.method484();
                        anInt1250 = aClass44_Sub3_Sub2_1132.method482();
                    }
                    if(anInt1005 == 10)
                    {
                        anInt909 = aClass44_Sub3_Sub2_1132.method484();
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 211)
                {
                    int j1 = aClass44_Sub3_Sub2_1132.method484();
                    int j10 = aClass44_Sub3_Sub2_1132.method485();
                    Class5 class5_3 = Class5.aClass5Array100[j1];
                    class5_3.anInt153 = j10;
                    if(j10 == -1)
                    {
                        class5_3.anInt103 = 0;
                        class5_3.anInt104 = 0;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 136)
                {
                    anInt848 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 91 || anInt1170 == 117 || anInt1170 == 83 || anInt1170 == 176 || anInt1170 == 233 || anInt1170 == 87 || anInt1170 == 71 || anInt1170 == 60 || anInt1170 == 106 || anInt1170 == 194 || anInt1170 == 90)
                {
                    method67(aClass44_Sub3_Sub2_1132, -6563, anInt1170);
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 28)
                {
                    int k1 = aClass44_Sub3_Sub2_1132.method484();
                    Class5 class5 = Class5.aClass5Array100[k1];
                    for(int j15 = 0; j15 < class5.anIntArray101.length; j15++)
                    {
                        class5.anIntArray101[j15] = -1;
                        class5.anIntArray101[j15] = 0;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 144)
                {
                    anInt1037 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1038 = aClass44_Sub3_Sub2_1132.method482();
                    for(int l1 = anInt1037; l1 < anInt1037 + 8; l1++)
                    {
                        for(int k10 = anInt1038; k10 < anInt1038 + 8; k10++)
                        {
                            if(aClass28ArrayArrayArray1146[anInt1155][l1][k10] != null)
                            {
                                aClass28ArrayArrayArray1146[anInt1155][l1][k10] = null;
                                method92(l1, k10);
                            }
                        }
                    }
                    for(Class44_Sub1 class44_sub1 = (Class44_Sub1)aClass28_1116.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1)aClass28_1116.method261(false))
                    {
                        if(class44_sub1.anInt1325 >= anInt1037 && class44_sub1.anInt1325 < anInt1037 + 8 && class44_sub1.anInt1326 >= anInt1038 && class44_sub1.anInt1326 < anInt1038 + 8 && class44_sub1.anInt1323 == anInt1155)
                        {
                            class44_sub1.anInt1334 = 0;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 154)
                {
                    aBoolean898 = true;
                    int i2 = aClass44_Sub3_Sub2_1132.method482();
                    int l10 = aClass44_Sub3_Sub2_1132.method487();
                    int k15 = aClass44_Sub3_Sub2_1132.method482();
                    anIntArray851[i2] = l10;
                    anIntArray1035[i2] = k15;
                    anIntArray1090[i2] = 1;
                    for(int k18 = 0; k18 < 98; k18++)
                    {
                        if(l10 >= anIntArray984[k18])
                        {
                            anIntArray1090[i2] = k18 + 2;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 181)
                {
                    anInt833 = aClass44_Sub3_Sub2_1132.method482();
                    if(anInt833 == anInt1027)
                    {
                        if(anInt833 == 3)
                        {
                            anInt1027 = 1;
                        } else
                        {
                            anInt1027 = 3;
                        }
                        aBoolean898 = true;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 73)
                {
                    aBoolean829 = true;
                    anInt1118 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1119 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1120 = aClass44_Sub3_Sub2_1132.method484();
                    anInt1121 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1122 = aClass44_Sub3_Sub2_1132.method482();
                    if(anInt1122 >= 100)
                    {
                        anInt875 = anInt1118 * 128 + 64;
                        anInt877 = anInt1119 * 128 + 64;
                        anInt876 = method51(false, anInt877, anInt875, anInt1155) - anInt1120;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 188)
                {
                    method57(anInt1169, (byte)7, aClass44_Sub3_Sub2_1132);
                    aBoolean1275 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 244)
                {
                    int j2 = aClass44_Sub3_Sub2_1132.method484();
                    int i11 = aClass44_Sub3_Sub2_1132.method484();
                    Class5.aClass5Array100[j2].anInt149 = 2;
                    Class5.aClass5Array100[j2].anInt150 = i11;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 121)
                {
                    method22((byte)25);
                    anInt1170 = -1;
                    return false;
                }
                if(anInt1170 == 119)
                {
                    int k2 = aClass44_Sub3_Sub2_1132.method484();
                    method104(k2, -44196);
                    if(anInt889 != -1)
                    {
                        anInt889 = -1;
                        aBoolean898 = true;
                        aBoolean1154 = true;
                    }
                    if(anInt1253 != -1)
                    {
                        anInt1253 = -1;
                        aBoolean1049 = true;
                    }
                    if(aBoolean980)
                    {
                        aBoolean980 = false;
                        aBoolean1049 = true;
                    }
                    anInt1199 = k2;
                    aBoolean935 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 168)
                {
                    long l2 = aClass44_Sub3_Sub2_1132.method488(true);
                    int l15 = aClass44_Sub3_Sub2_1132.method482();
                    String s7 = Class48.method554(Class48.method551(l2, true), true);
                    for(int i21 = 0; i21 < anInt1104; i21++)
                    {
                        if(l2 != aLongArray979[i21])
                        {
                            continue;
                        }
                        if(anIntArray894[i21] != l15)
                        {
                            anIntArray894[i21] = l15;
                            aBoolean898 = true;
                            if(l15 > 0)
                            {
                                method17(5, (byte)-115, s7 + " has logged in.", "");
                            }
                            if(l15 == 0)
                            {
                                method17(5, (byte)-115, s7 + " has logged out.", "");
                            }
                        }
                        s7 = null;
                        break;
                    }
                    if(s7 != null && anInt1104 < 200)
                    {
                        aLongArray979[anInt1104] = l2;
                        aStringArray1044[anInt1104] = s7;
                        anIntArray894[anInt1104] = l15;
                        anInt1104++;
                        aBoolean898 = true;
                    }
                    for(boolean flag6 = false; !flag6;)
                    {
                        flag6 = true;
                        for(int l24 = 0; l24 < anInt1104 - 1; l24++)
                        {
                            if(anIntArray894[l24] != anInt1232 && anIntArray894[l24 + 1] == anInt1232 || anIntArray894[l24] == 0 && anIntArray894[l24 + 1] != 0)
                            {
                                int i26 = anIntArray894[l24];
                                anIntArray894[l24] = anIntArray894[l24 + 1];
                                anIntArray894[l24 + 1] = i26;
                                String s10 = aStringArray1044[l24];
                                aStringArray1044[l24] = aStringArray1044[l24 + 1];
                                aStringArray1044[l24 + 1] = s10;
                                long l27 = aLongArray979[l24];
                                aLongArray979[l24] = aLongArray979[l24 + 1];
                                aLongArray979[l24 + 1] = l27;
                                aBoolean898 = true;
                                flag6 = false;
                            }
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 164)
                {
                    anInt911 = 0;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 243)
                {
                    long l3 = aClass44_Sub3_Sub2_1132.method488(true);
                    int i16 = aClass44_Sub3_Sub2_1132.method487();
                    int i19 = aClass44_Sub3_Sub2_1132.method482();
                    boolean flag2 = false;
                    for(int i23 = 0; i23 < 100; i23++)
                    {
                        if(anIntArray1016[i23] != i16)
                        {
                            continue;
                        }
                        flag2 = true;
                        break;
                    }
                    if(i19 <= 1)
                    {
                        for(int i25 = 0; i25 < anInt957; i25++)
                        {
                            if(aLongArray1254[i25] != l3)
                            {
                                continue;
                            }
                            flag2 = true;
                            break;
                        }
                    }
                    if(!flag2 && anInt1245 == 0)
                    {
                        try
                        {
                            anIntArray1016[anInt928] = i16;
                            anInt928 = (anInt928 + 1) % 100;
                            String s8 = Class49.method556((byte)-94, aClass44_Sub3_Sub2_1132, anInt1169 - 13);
                            s8 = Class41.method352(s8, anInt1242);
                            if(i19 == 2 || i19 == 3)
                            {
                                method17(7, (byte)-115, s8, "@cr2@" + Class48.method554(Class48.method551(l3, true), true));
                            } else
                            if(i19 == 1)
                            {
                                method17(7, (byte)-115, s8, "@cr1@" + Class48.method554(Class48.method551(l3, true), true));
                            } else
                            {
                                method17(3, (byte)-115, s8, Class48.method554(Class48.method551(l3, true), true));
                            }
                        }
                        catch(Exception exception1)
                        {
                            Signlink.reporterror("cde1");
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 208)
                {
                    int i3 = aClass44_Sub3_Sub2_1132.method482();
                    int j11 = aClass44_Sub3_Sub2_1132.method482();
                    int j16 = aClass44_Sub3_Sub2_1132.method482();
                    int j19 = aClass44_Sub3_Sub2_1132.method482();
                    aBooleanArray1209[i3] = true;
                    anIntArray976[i3] = j11;
                    anIntArray1206[i3] = j16;
                    anIntArray943[i3] = j19;
                    anIntArray1001[i3] = 0;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 107)
                {
                    aBoolean898 = true;
                    int j3 = aClass44_Sub3_Sub2_1132.method484();
                    Class5 class5_1 = Class5.aClass5Array100[j3];
                    int k16 = aClass44_Sub3_Sub2_1132.method484();
                    for(int k19 = 0; k19 < k16; k19++)
                    {
                        class5_1.anIntArray101[k19] = aClass44_Sub3_Sub2_1132.method484();
                        int j21 = aClass44_Sub3_Sub2_1132.method482();
                        if(j21 == 255)
                        {
                            j21 = aClass44_Sub3_Sub2_1132.method487();
                        }
                        class5_1.anIntArray102[k19] = j21;
                    }
                    for(int k21 = k16; k21 < class5_1.anIntArray101.length; k21++)
                    {
                        class5_1.anIntArray101[k21] = 0;
                        class5_1.anIntArray102[k21] = 0;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 12)
                {
                    int k3 = aClass44_Sub3_Sub2_1132.method485();
                    anInt965 = k3;
                    aBoolean1049 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 219)
                {
                    int i4 = aClass44_Sub3_Sub2_1132.method484();
                    int k11 = aClass44_Sub3_Sub2_1132.method484();
                    if(anInt841 == i4 && anInt842 == k11 && anInt882 == 2)
                    {
                        anInt1170 = -1;
                        return true;
                    }
                    anInt841 = i4;
                    anInt842 = k11;
                    anInt1184 = (anInt841 - 6) * 8;
                    anInt1185 = (anInt842 - 6) * 8;
                    aBoolean906 = false;
                    if((anInt841 / 8 == 48 || anInt841 / 8 == 49) && anInt842 / 8 == 48)
                    {
                        aBoolean906 = true;
                    }
                    if(anInt841 / 8 == 48 && anInt842 / 8 == 148)
                    {
                        aBoolean906 = true;
                    }
                    anInt882 = 1;
                    aLong1070 = System.currentTimeMillis();
                    aClass34_1197.method272((byte)5);
                    aClass44_Sub3_Sub1_Sub4_1256.method455(257, "Loading - please wait.", -31546, 0, 151);
                    aClass44_Sub3_Sub1_Sub4_1256.method455(256, "Loading - please wait.", -31546, 0xffffff, 150);
                    aClass34_1197.method273(-781, 4, 4, super.aGraphics13);
                    int l16 = 0;
                    for(int i20 = (anInt841 - 6) / 8; i20 <= (anInt841 + 6) / 8; i20++)
                    {
                        for(int l21 = (anInt842 - 6) / 8; l21 <= (anInt842 + 6) / 8; l21++)
                        {
                            l16++;
                        }
                    }
                    aByteArrayArray981 = new byte[l16][];
                    aByteArrayArray973 = new byte[l16][];
                    anIntArray1039 = new int[l16];
                    anIntArray1040 = new int[l16];
                    anIntArray1041 = new int[l16];
                    l16 = 0;
                    for(int i22 = (anInt841 - 6) / 8; i22 <= (anInt841 + 6) / 8; i22++)
                    {
                        for(int j23 = (anInt842 - 6) / 8; j23 <= (anInt842 + 6) / 8; j23++)
                        {
                            anIntArray1039[l16] = (i22 << 8) + j23;
                            if(aBoolean906 && (j23 == 49 || j23 == 149 || j23 == 147 || i22 == 50 || i22 == 49 && j23 == 47))
                            {
                                anIntArray1040[l16] = -1;
                                anIntArray1041[l16] = -1;
                                l16++;
                            } else
                            {
                                int j25 = anIntArray1040[l16] = aClass43_Sub1_814.method387(j23, -942, i22, 0);
                                if(j25 != -1)
                                {
                                    aClass43_Sub1_814.method392(3, j25);
                                }
                                int j26 = anIntArray1041[l16] = aClass43_Sub1_814.method387(j23, -942, i22, 1);
                                if(j26 != -1)
                                {
                                    aClass43_Sub1_814.method392(3, j26);
                                }
                                l16++;
                            }
                        }
                    }
                    int k23 = anInt1184 - anInt1186;
                    int k25 = anInt1185 - anInt1187;
                    anInt1186 = anInt1184;
                    anInt1187 = anInt1185;
                    for(int k26 = 0; k26 < 16384; k26++)
                    {
                        Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k26];
                        if(class44_sub3_sub4_sub6_sub2 != null)
                        {
                            for(int i27 = 0; i27 < 10; i27++)
                            {
                                ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anIntArray1665[i27] -= k23;
                                ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anIntArray1666[i27] -= k25;
                            }
                            class44_sub3_sub4_sub6_sub2.anInt1615 -= k23 * 128;
                            class44_sub3_sub4_sub6_sub2.anInt1616 -= k25 * 128;
                        }
                    }
                    for(int l26 = 0; l26 < anInt1223; l26++)
                    {
                        Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[l26];
                        if(class44_sub3_sub4_sub6_sub1 != null)
                        {
                            for(int j27 = 0; j27 < 10; j27++)
                            {
                                ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anIntArray1665[j27] -= k23;
                                ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anIntArray1666[j27] -= k25;
                            }
                            class44_sub3_sub4_sub6_sub1.anInt1615 -= k23 * 128;
                            class44_sub3_sub4_sub6_sub1.anInt1616 -= k25 * 128;
                        }
                    }
                    aBoolean1275 = true;
                    byte byte1 = 0;
                    byte byte2 = 104;
                    byte byte3 = 1;
                    if(k23 < 0)
                    {
                        byte1 = 103;
                        byte2 = -1;
                        byte3 = -1;
                    }
                    byte byte4 = 0;
                    byte byte5 = 104;
                    byte byte6 = 1;
                    if(k25 < 0)
                    {
                        byte4 = 103;
                        byte5 = -1;
                        byte6 = -1;
                    }
                    for(int k27 = byte1; k27 != byte2; k27 += byte3)
                    {
                        for(int i28 = byte4; i28 != byte5; i28 += byte6)
                        {
                            int j28 = k27 + k23;
                            int k28 = i28 + k25;
                            for(int l28 = 0; l28 < 4; l28++)
                            {
                                if(j28 >= 0 && k28 >= 0 && j28 < 104 && k28 < 104)
                                {
                                    aClass28ArrayArrayArray1146[l28][k27][i28] = aClass28ArrayArrayArray1146[l28][j28][k28];
                                } else
                                {
                                    aClass28ArrayArrayArray1146[l28][k27][i28] = null;
                                }
                            }
                        }
                    }
                    for(Class44_Sub1 class44_sub1_1 = (Class44_Sub1)aClass28_1116.method259(); class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1)aClass28_1116.method261(false))
                    {
                        class44_sub1_1.anInt1325 -= k23;
                        class44_sub1_1.anInt1326 -= k25;
                        if(class44_sub1_1.anInt1325 < 0 || class44_sub1_1.anInt1326 < 0 || class44_sub1_1.anInt1325 >= 104 || class44_sub1_1.anInt1326 >= 104)
                        {
                            class44_sub1_1.method404();
                        }
                    }
                    if(anInt911 != 0)
                    {
                        anInt911 -= k23;
                        anInt912 -= k25;
                    }
                    aBoolean829 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 63)
                {
                    int j4 = aClass44_Sub3_Sub2_1132.method484();
                    int l11 = aClass44_Sub3_Sub2_1132.method482();
                    if(j4 == 65535)
                    {
                        j4 = -1;
                    }
                    anIntArray1060[l11] = j4;
                    aBoolean898 = true;
                    aBoolean1154 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 184)
                {
                    int k4 = aClass44_Sub3_Sub2_1132.method484();
                    int i12 = aClass44_Sub3_Sub2_1132.method484();
                    Class5 class5_4 = Class5.aClass5Array100[k4];
                    if(class5_4 != null && class5_4.anInt107 == 0)
                    {
                        if(i12 < 0)
                        {
                            i12 = 0;
                        }
                        if(i12 > class5_4.anInt119 - class5_4.anInt111)
                        {
                            i12 = class5_4.anInt119 - class5_4.anInt111;
                        }
                        class5_4.anInt120 = i12;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 204)
                {
                    anInt998 = aClass44_Sub3_Sub2_1132.method484() * 30;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 253)
                {
                    anInt1231 = aClass44_Sub3_Sub2_1132.method487();
                    anInt947 = aClass44_Sub3_Sub2_1132.method484();
                    anInt869 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1023 = aClass44_Sub3_Sub2_1132.method484();
                    anInt917 = aClass44_Sub3_Sub2_1132.method482();
                    if(anInt1231 != 0 && anInt1199 == -1)
                    {
                        Signlink.dnslookup(Class48.method553(anInt1231, (byte)1));
                        method28(3);
                        char c = '\u028A';
                        if(anInt869 != 201 || anInt917 == 1)
                        {
                            c = '\u028F';
                        }
                        aString939 = "";
                        aBoolean987 = false;
                        for(int j12 = 0; j12 < Class5.aClass5Array100.length; j12++)
                        {
                            if(Class5.aClass5Array100[j12] == null || Class5.aClass5Array100[j12].anInt109 != c)
                            {
                                continue;
                            }
                            anInt1199 = Class5.aClass5Array100[j12].anInt106;
                            break;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 30)
                {
                    int l4 = aClass44_Sub3_Sub2_1132.method484();
                    Class5.aClass5Array100[l4].anInt149 = 3;
                    if(aClass44_Sub3_Sub4_Sub6_Sub1_1047.aClass12_1694 == null)
                    {
                        Class5.aClass5Array100[l4].anInt150 = (aClass44_Sub3_Sub4_Sub6_Sub1_1047.anIntArray1677[0] << 24) + (aClass44_Sub3_Sub4_Sub6_Sub1_1047.anIntArray1677[4] << 18) + (aClass44_Sub3_Sub4_Sub6_Sub1_1047.anIntArray1676[0] << 12) + (aClass44_Sub3_Sub4_Sub6_Sub1_1047.anIntArray1676[8] << 6) + aClass44_Sub3_Sub4_Sub6_Sub1_1047.anIntArray1676[11];
                    } else
                    {
                        Class5.aClass5Array100[l4].anInt150 = (int)(0x12345678L + aClass44_Sub3_Sub4_Sub6_Sub1_1047.aClass12_1694.aLong281);
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 23)
                {
                    if(anInt889 != -1)
                    {
                        anInt889 = -1;
                        aBoolean898 = true;
                        aBoolean1154 = true;
                    }
                    if(anInt1253 != -1)
                    {
                        anInt1253 = -1;
                        aBoolean1049 = true;
                    }
                    if(aBoolean980)
                    {
                        aBoolean980 = false;
                        aBoolean1049 = true;
                    }
                    anInt1199 = -1;
                    aBoolean935 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 21)
                {
                    int i5 = aClass44_Sub3_Sub2_1132.method482();
                    int k12 = aClass44_Sub3_Sub2_1132.method482();
                    String s6 = aClass44_Sub3_Sub2_1132.method489();
                    if(i5 >= 1 && i5 <= 5)
                    {
                        if(s6.equalsIgnoreCase("null"))
                        {
                            s6 = null;
                        }
                        aStringArray919[i5 - 1] = s6;
                        aBooleanArray920[i5 - 1] = k12 == 0;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 189)
                {
                    anInt1027 = aClass44_Sub3_Sub2_1132.method482();
                    aBoolean898 = true;
                    aBoolean1154 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 196)
                {
                    String s = aClass44_Sub3_Sub2_1132.method489();
                    if(s.endsWith(":tradereq:"))
                    {
                        String s3 = s.substring(0, s.indexOf(":"));
                        long l17 = Class48.method550(s3);
                        boolean flag3 = false;
                        for(int l23 = 0; l23 < anInt957; l23++)
                        {
                            if(aLongArray1254[l23] != l17)
                            {
                                continue;
                            }
                            flag3 = true;
                            break;
                        }
                        if(!flag3 && anInt1245 == 0)
                        {
                            method17(4, (byte)-115, "wishes to trade with you.", s3);
                        }
                    } else
                    if(s.endsWith(":duelreq:"))
                    {
                        String s4 = s.substring(0, s.indexOf(":"));
                        long l18 = Class48.method550(s4);
                        boolean flag4 = false;
                        for(int i24 = 0; i24 < anInt957; i24++)
                        {
                            if(aLongArray1254[i24] != l18)
                            {
                                continue;
                            }
                            flag4 = true;
                            break;
                        }
                        if(!flag4 && anInt1245 == 0)
                        {
                            method17(8, (byte)-115, "wishes to duel with you.", s4);
                        }
                    } else
                    if(s.endsWith(":chalreq:"))
                    {
                        String s5 = s.substring(0, s.indexOf(":"));
                        long l19 = Class48.method550(s5);
                        boolean flag5 = false;
                        for(int j24 = 0; j24 < anInt957; j24++)
                        {
                            if(aLongArray1254[j24] != l19)
                            {
                                continue;
                            }
                            flag5 = true;
                            break;
                        }
                        if(!flag5 && anInt1245 == 0)
                        {
                            String s9 = s.substring(s.indexOf(":") + 1, s.length() - 9);
                            method17(8, (byte)-115, s9, s5);
                        }
                    } else
                    {
                        method17(0, (byte)-115, s, "");
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 18)
                {
                    int j5 = aClass44_Sub3_Sub2_1132.method484();
                    int l12 = aClass44_Sub3_Sub2_1132.method484();
                    int i17 = aClass44_Sub3_Sub2_1132.method484();
                    if(l12 == 65535)
                    {
                        Class5.aClass5Array100[j5].anInt149 = 0;
                        anInt1170 = -1;
                        return true;
                    } else
                    {
                        Class14 class14 = Class14.method220(l12);
                        Class5.aClass5Array100[j5].anInt149 = 4;
                        Class5.aClass5Array100[j5].anInt150 = l12;
                        Class5.aClass5Array100[j5].anInt156 = class14.anInt336;
                        Class5.aClass5Array100[j5].anInt157 = class14.anInt337;
                        Class5.aClass5Array100[j5].anInt155 = (class14.anInt335 * 100) / i17;
                        anInt1170 = -1;
                        return true;
                    }
                }
                if(anInt1170 == 187)
                {
                    int k5 = aClass44_Sub3_Sub2_1132.method484();
                    if(k5 == 65535)
                    {
                        k5 = -1;
                    }
                    if(k5 != anInt963 && aBoolean1057 && !aBoolean1235 && anInt942 == 0)
                    {
                        anInt1190 = k5;
                        aBoolean1191 = true;
                        aClass43_Sub1_814.method392(2, anInt1190);
                    }
                    anInt963 = k5;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 29)
                {
                    int l5 = aClass44_Sub3_Sub2_1132.method484();
                    int i13 = aClass44_Sub3_Sub2_1132.method484();
                    if(aBoolean1057 && !aBoolean1235)
                    {
                        anInt1190 = l5;
                        aBoolean1191 = false;
                        aClass43_Sub1_814.method392(2, anInt1190);
                        anInt942 = i13;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 177)
                {
                    int i6 = aClass44_Sub3_Sub2_1132.method484();
                    int j13 = aClass44_Sub3_Sub2_1132.method482();
                    int j17 = aClass44_Sub3_Sub2_1132.method484();
                    if(aBoolean1050 && !aBoolean1235 && anInt968 < 50)
                    {
                        anIntArray846[anInt968] = i6;
                        anIntArray1006[anInt968] = j13;
                        anIntArray1193[anInt968] = j17 + Class4.anIntArray92[i6];
                        anInt968++;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 112)
                {
                    anInt1037 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1038 = aClass44_Sub3_Sub2_1132.method482();
                    while(aClass44_Sub3_Sub2_1132.anInt1392 < anInt1169)
                    {
                        int j6 = aClass44_Sub3_Sub2_1132.method482();
                        method67(aClass44_Sub3_Sub2_1132, -6563, j6);
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 172)
                {
                    for(int k6 = 0; k6 < anIntArray1214.length; k6++)
                    {
                        if(anIntArray1214[k6] != anIntArray1024[k6])
                        {
                            anIntArray1214[k6] = anIntArray1024[k6];
                            method147(true, k6);
                            aBoolean898 = true;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 160)
                {
                    int l6 = aClass44_Sub3_Sub2_1132.method484();
                    int k13 = aClass44_Sub3_Sub2_1132.method484();
                    int k17 = k13 >> 10 & 0x1f;
                    int j20 = k13 >> 5 & 0x1f;
                    int j22 = k13 & 0x1f;
                    Class5.aClass5Array100[l6].anInt143 = (k17 << 19) + (j20 << 11) + (j22 << 3);
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 47)
                {
                    anInt957 = anInt1169 / 8;
                    for(int i7 = 0; i7 < anInt957; i7++)
                    {
                        aLongArray1254[i7] = aClass44_Sub3_Sub2_1132.method488(true);
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 65)
                {
                    method105(true, anInt1169, aClass44_Sub3_Sub2_1132);
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 222)
                {
                    int j7 = aClass44_Sub3_Sub2_1132.method484();
                    int l13 = aClass44_Sub3_Sub2_1132.method484();
                    Class5.aClass5Array100[j7].anInt149 = 1;
                    Class5.aClass5Array100[j7].anInt150 = l13;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 127)
                {
                    int k7 = aClass44_Sub3_Sub2_1132.method485();
                    if(k7 >= 0)
                    {
                        method104(k7, -44196);
                    }
                    anInt924 = k7;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 75)
                {
                    int l7 = aClass44_Sub3_Sub2_1132.method484();
                    byte byte0 = aClass44_Sub3_Sub2_1132.method483();
                    anIntArray1024[l7] = byte0;
                    if(anIntArray1214[l7] != byte0)
                    {
                        anIntArray1214[l7] = byte0;
                        method147(true, l7);
                        aBoolean898 = true;
                        if(anInt965 != -1)
                        {
                            aBoolean1049 = true;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 82)
                {
                    aBoolean829 = true;
                    anInt989 = aClass44_Sub3_Sub2_1132.method482();
                    anInt990 = aClass44_Sub3_Sub2_1132.method482();
                    anInt991 = aClass44_Sub3_Sub2_1132.method484();
                    anInt992 = aClass44_Sub3_Sub2_1132.method482();
                    anInt993 = aClass44_Sub3_Sub2_1132.method482();
                    if(anInt993 >= 100)
                    {
                        int i8 = anInt989 * 128 + 64;
                        int i14 = anInt990 * 128 + 64;
                        int i18 = method51(false, i14, i8, anInt1155) - anInt991;
                        int k20 = i8 - anInt875;
                        int k22 = i18 - anInt876;
                        int k24 = i14 - anInt877;
                        int l25 = (int)Math.sqrt(k20 * k20 + k24 * k24);
                        anInt878 = (int)(Math.atan2(k22, l25) * 325.94900000000001D) & 0x7ff;
                        anInt879 = (int)(Math.atan2(k20, k24) * -325.94900000000001D) & 0x7ff;
                        if(anInt878 < 128)
                        {
                            anInt878 = 128;
                        }
                        if(anInt878 > 383)
                        {
                            anInt878 = 383;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 81)
                {
                    int j8 = aClass44_Sub3_Sub2_1132.method484();
                    method104(j8, -44196);
                    if(anInt889 != -1)
                    {
                        anInt889 = -1;
                        aBoolean898 = true;
                        aBoolean1154 = true;
                    }
                    anInt1253 = j8;
                    aBoolean1049 = true;
                    anInt1199 = -1;
                    aBoolean935 = false;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 138)
                {
                    int k8 = aClass44_Sub3_Sub2_1132.method484();
                    boolean flag1 = aClass44_Sub3_Sub2_1132.method482() == 1;
                    Class5.aClass5Array100[k8].aBoolean121 = flag1;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 247)
                {
                    anInt1112 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 235)
                {
                    anInt1105 = aClass44_Sub3_Sub2_1132.method482();
                    aBoolean898 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 76)
                {
                    aBoolean898 = true;
                    int l8 = aClass44_Sub3_Sub2_1132.method484();
                    Class5 class5_2 = Class5.aClass5Array100[l8];
                    while(aClass44_Sub3_Sub2_1132.anInt1392 < anInt1169)
                    {
                        int j18 = aClass44_Sub3_Sub2_1132.method496();
                        int l20 = aClass44_Sub3_Sub2_1132.method484();
                        int l22 = aClass44_Sub3_Sub2_1132.method482();
                        if(l22 == 255)
                        {
                            l22 = aClass44_Sub3_Sub2_1132.method487();
                        }
                        if(j18 >= 0 && j18 < class5_2.anIntArray101.length)
                        {
                            class5_2.anIntArray101[j18] = l20;
                            class5_2.anIntArray102[j18] = l22;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 201)
                {
                    for(int i9 = 0; i9 < aClass44_Sub3_Sub4_Sub6_Sub1Array1225.length; i9++)
                    {
                        if(aClass44_Sub3_Sub4_Sub6_Sub1Array1225[i9] != null)
                        {
                            aClass44_Sub3_Sub4_Sub6_Sub1Array1225[i9].anInt1643 = -1;
                        }
                    }
                    for(int j14 = 0; j14 < aClass44_Sub3_Sub4_Sub6_Sub2Array1008.length; j14++)
                    {
                        if(aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j14] != null)
                        {
                            aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j14].anInt1643 = -1;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 35)
                {
                    aBoolean1222 = false;
                    aBoolean980 = true;
                    aString1092 = "";
                    aBoolean1049 = true;
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 133)
                {
                    aBoolean829 = false;
                    for(int j9 = 0; j9 < 5; j9++)
                    {
                        aBooleanArray1209[j9] = false;
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 97)
                {
                    int k9 = aClass44_Sub3_Sub2_1132.method484();
                    int k14 = aClass44_Sub3_Sub2_1132.method487();
                    anIntArray1024[k9] = k14;
                    if(anIntArray1214[k9] != k14)
                    {
                        anIntArray1214[k9] = k14;
                        method147(true, k9);
                        aBoolean898 = true;
                        if(anInt965 != -1)
                        {
                            aBoolean1049 = true;
                        }
                    }
                    anInt1170 = -1;
                    return true;
                }
                if(anInt1170 == 155)
                {
                    anInt1037 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1038 = aClass44_Sub3_Sub2_1132.method482();
                    anInt1170 = -1;
                    return true;
                }
                Signlink.reporterror("T1 - " + anInt1170 + "," + anInt1169 + " - " + anInt1068 + "," + anInt1069);
                method22((byte)25);
            }
            catch(IOException _ex)
            {
                method99((byte)7);
            }
            catch(Exception exception)
            {
                String s1 = "T2 - " + anInt1170 + "," + anInt1068 + "," + anInt1069 + " - " + anInt1169 + "," + (anInt1184 + ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0]) + "," + (anInt1185 + ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]) + " - ";
                for(int l14 = 0; l14 < anInt1169 && l14 < 50; l14++)
                {
                    s1 = s1 + aClass44_Sub3_Sub2_1132.aByteArray1391[l14] + ",";
                }
                Signlink.reporterror(s1);
                method22((byte)25);
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("74182, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method32(String s)
    {
        System.out.println(s);
        try
        {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        do
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex)
            {
            }
        } while(true);
    }

    public void method33(byte byte0, byte abyte0[], boolean flag)
    {
        try
        {
            if(byte0 != 27)
            {
                anInt1170 = -1;
            }
            Signlink.midifade = flag ? 1 : 0;
            Signlink.midisave(abyte0, abyte0.length);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("89004, " + byte0 + ", " + abyte0 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Socket method34(int i)
        throws IOException
    {
        if(Signlink.mainapp != null)
        {
            return Signlink.opensocket(i);
        } else
        {
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
        }
    }

    public void method6()
    {
        method13(false, 20, "Starting up");
        if(Signlink.sunjava)
        {
            super.anInt7 = 5;
        }
        if(aBoolean896)
        {
            aBoolean1236 = true;
            return;
        }
        aBoolean896 = true;
        boolean flag = false;
        String s = method102(974);
        if(s.endsWith("jagex.com"))
        {
            flag = true;
        }
        if(s.endsWith("runescape.com"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.2"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.246"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.247"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.249"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.253"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.254"))
        {
            flag = true;
        }
        if(s.endsWith("192.168.1.242"))
        {
            flag = true;
        }
        if(s.endsWith("127.0.0.1"))
        {
            flag = true;
        }
        if(!flag)
        {
            aBoolean820 = true;
            return;
        }
        if(Signlink.cache_dat != null)
        {
            for(int i = 0; i < 5; i++)
            {
                aClass45Array1208[i] = new Class45(Signlink.cache_dat, 0x7a120, Signlink.cache_idx[i], i + 1, (byte)4);
            }
        }
        try
        {
            method27(aByte949);
            aClass47_1117 = method125((byte)-9, "title screen", 1, "title", 25, anIntArray1051[1]);
            aClass44_Sub3_Sub1_Sub4_1255 = new Class44_Sub3_Sub1_Sub4(9, "p11_full", false, aClass47_1117);
            aClass44_Sub3_Sub1_Sub4_1256 = new Class44_Sub3_Sub1_Sub4(9, "p12_full", false, aClass47_1117);
            aClass44_Sub3_Sub1_Sub4_1257 = new Class44_Sub3_Sub1_Sub4(9, "b12_full", false, aClass47_1117);
            aClass44_Sub3_Sub1_Sub4_1258 = new Class44_Sub3_Sub1_Sub4(9, "q8_full", true, aClass47_1117);
            method68(0);
            method48(-532);
            Class47 class47 = method125((byte)-9, "config", 2, "config", 30, anIntArray1051[2]);
            Class47 class47_1 = method125((byte)-9, "interface", 3, "interface", 35, anIntArray1051[3]);
            Class47 class47_2 = method125((byte)-9, "2d graphics", 4, "media", 40, anIntArray1051[4]);
            Class47 class47_3 = method125((byte)-9, "textures", 6, "textures", 45, anIntArray1051[6]);
            Class47 class47_4 = method125((byte)-9, "chat system", 7, "wordenc", 50, anIntArray1051[7]);
            Class47 class47_5 = method125((byte)-9, "sound effects", 8, "sounds", 55, anIntArray1051[8]);
            aByteArrayArrayArray871 = new byte[4][104][104];
            anIntArrayArrayArray865 = new int[4][105][105];
            aClass36_1192 = new Class36(104, 4, anIntArrayArrayArray865, 104, anInt1246);
            for(int j = 0; j < 4; j++)
            {
                aClass18Array1022[j] = new Class18(99, 104, 104);
            }
            aClass44_Sub3_Sub1_Sub2_913 = new Class44_Sub3_Sub1_Sub2(512, 512);
            Class47 class47_6 = method125((byte)-9, "update list", 5, "versionlist", 60, anIntArray1051[5]);
            method13(false, 60, "Connecting to update server");
            aClass43_Sub1_814 = new Class43_Sub1();
            aClass43_Sub1_814.method383(class47_6, this);
            Class11.method207(aClass43_Sub1_814.method386(7));
            Class44_Sub3_Sub4_Sub4.method503(aClass43_Sub1_814.method385(0, (byte)7), aClass43_Sub1_814);
            if(!aBoolean1235)
            {
                anInt1190 = 0;
                try
                {
                    anInt1190 = Integer.parseInt(getParameter("music"));
                }
                catch(Exception _ex)
                {
                }
                aBoolean1191 = true;
                aClass43_Sub1_814.method392(2, anInt1190);
                while(aClass43_Sub1_814.method393() > 0)
                {
                    method93(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex)
                    {
                    }
                    if(aClass43_Sub1_814.anInt1313 > 3)
                    {
                        method32("ondemand");
                        return;
                    }
                }
            }
            method13(false, 65, "Requesting animations");
            int k = aClass43_Sub1_814.method385(1, (byte)7);
            for(int i1 = 0; i1 < k; i1++)
            {
                aClass43_Sub1_814.method392(1, i1);
            }
            while(aClass43_Sub1_814.method393() > 0)
            {
                int j1 = k - aClass43_Sub1_814.method393();
                if(j1 > 0)
                {
                    method13(false, 65, "Loading animations - " + (j1 * 100) / k + "%");
                }
                method93(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex)
                {
                }
                if(aClass43_Sub1_814.anInt1313 > 3)
                {
                    method32("ondemand");
                    return;
                }
            }
            method13(false, 70, "Requesting models");
            k = aClass43_Sub1_814.method385(0, (byte)7);
            for(int k1 = 0; k1 < k; k1++)
            {
                int l1 = aClass43_Sub1_814.method390(k1, -600);
                if((l1 & 1) != 0)
                {
                    aClass43_Sub1_814.method392(0, k1);
                }
            }
            k = aClass43_Sub1_814.method393();
            while(aClass43_Sub1_814.method393() > 0)
            {
                int i2 = k - aClass43_Sub1_814.method393();
                if(i2 > 0)
                {
                    method13(false, 70, "Loading models - " + (i2 * 100) / k + "%");
                }
                method93(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex)
                {
                }
            }
            if(aClass45Array1208[0] != null)
            {
                method13(false, 75, "Requesting maps");
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 47, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 47, 1));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 48, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 48, 1));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 49, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(48, -942, 49, 1));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(47, -942, 47, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(47, -942, 47, 1));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(47, -942, 48, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(47, -942, 48, 1));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(148, -942, 48, 0));
                aClass43_Sub1_814.method392(3, aClass43_Sub1_814.method387(148, -942, 48, 1));
                k = aClass43_Sub1_814.method393();
                while(aClass43_Sub1_814.method393() > 0)
                {
                    int j2 = k - aClass43_Sub1_814.method393();
                    if(j2 > 0)
                    {
                        method13(false, 75, "Loading maps - " + (j2 * 100) / k + "%");
                    }
                    method93(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex)
                    {
                    }
                }
            }
            k = aClass43_Sub1_814.method385(0, (byte)7);
            for(int k2 = 0; k2 < k; k2++)
            {
                int l2 = aClass43_Sub1_814.method390(k2, -600);
                byte byte0 = 0;
                if((l2 & 8) != 0)
                {
                    byte0 = 10;
                } else
                if((l2 & 0x20) != 0)
                {
                    byte0 = 9;
                } else
                if((l2 & 0x10) != 0)
                {
                    byte0 = 8;
                } else
                if((l2 & 0x40) != 0)
                {
                    byte0 = 7;
                } else
                if((l2 & 0x80) != 0)
                {
                    byte0 = 6;
                } else
                if((l2 & 2) != 0)
                {
                    byte0 = 5;
                } else
                if((l2 & 4) != 0)
                {
                    byte0 = 4;
                }
                if((l2 & 1) != 0)
                {
                    byte0 = 3;
                }
                if(byte0 != 0)
                {
                    aClass43_Sub1_814.method395(7, 0, byte0, k2);
                }
            }
            aClass43_Sub1_814.method388(false, aBoolean1234);
            if(!aBoolean1235)
            {
                int l = aClass43_Sub1_814.method385(2, (byte)7);
                for(int i3 = 1; i3 < l; i3++)
                {
                    if(aClass43_Sub1_814.method391(i3, 324))
                    {
                        aClass43_Sub1_814.method395(7, 2, (byte)1, i3);
                    }
                }
            }
            method13(false, 80, "Unpacking media");
            aClass44_Sub3_Sub1_Sub3_1143 = new Class44_Sub3_Sub1_Sub3(class47_2, "invback", 0);
            aClass44_Sub3_Sub1_Sub3_1145 = new Class44_Sub3_Sub1_Sub3(class47_2, "chatback", 0);
            aClass44_Sub3_Sub1_Sub3_1144 = new Class44_Sub3_Sub1_Sub3(class47_2, "mapback", 0);
            aClass44_Sub3_Sub1_Sub3_903 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase1", 0);
            aClass44_Sub3_Sub1_Sub3_904 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase2", 0);
            aClass44_Sub3_Sub1_Sub3_905 = new Class44_Sub3_Sub1_Sub3(class47_2, "backhmid1", 0);
            for(int j3 = 0; j3 < 13; j3++)
            {
                aClass44_Sub3_Sub1_Sub3Array1276[j3] = new Class44_Sub3_Sub1_Sub3(class47_2, "sideicons", j3);
            }
            aClass44_Sub3_Sub1_Sub2_988 = new Class44_Sub3_Sub1_Sub2(class47_2, "compass", 0);
            aClass44_Sub3_Sub1_Sub2_1261 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapedge", 0);
            aClass44_Sub3_Sub1_Sub2_1261.method437(-15744);
            try
            {
                for(int k3 = 0; k3 < 100; k3++)
                {
                    aClass44_Sub3_Sub1_Sub3Array1241[k3] = new Class44_Sub3_Sub1_Sub3(class47_2, "mapscene", k3);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int l3 = 0; l3 < 100; l3++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1052[l3] = new Class44_Sub3_Sub1_Sub2(class47_2, "mapfunction", l3);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int i4 = 0; i4 < 20; i4++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1108[i4] = new Class44_Sub3_Sub1_Sub2(class47_2, "hitmarks", i4);
                }
            }
            catch(Exception _ex)
            {
            }
            try
            {
                for(int j4 = 0; j4 < 20; j4++)
                {
                    aClass44_Sub3_Sub1_Sub2Array1183[j4] = new Class44_Sub3_Sub1_Sub2(class47_2, "headicons", j4);
                }
            }
            catch(Exception _ex)
            {
            }
            aClass44_Sub3_Sub1_Sub2_1210 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapmarker", 0);
            aClass44_Sub3_Sub1_Sub2_1211 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapmarker", 1);
            for(int k4 = 0; k4 < 8; k4++)
            {
                aClass44_Sub3_Sub1_Sub2Array867[k4] = new Class44_Sub3_Sub1_Sub2(class47_2, "cross", k4);
            }
            aClass44_Sub3_Sub1_Sub2_1077 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 0);
            aClass44_Sub3_Sub1_Sub2_1078 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 1);
            aClass44_Sub3_Sub1_Sub2_1079 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 2);
            aClass44_Sub3_Sub1_Sub2_1080 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 3);
            aClass44_Sub3_Sub1_Sub3_1058 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 0);
            aClass44_Sub3_Sub1_Sub3_1059 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 1);
            aClass44_Sub3_Sub1_Sub3_1136 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1137 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1138 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_1139 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1139.method450(6);
            aClass44_Sub3_Sub1_Sub3_1140 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1140.method450(6);
            aClass44_Sub3_Sub1_Sub3_852 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_852.method451(35509);
            aClass44_Sub3_Sub1_Sub3_853 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_853.method451(35509);
            aClass44_Sub3_Sub1_Sub3_854 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_854.method451(35509);
            aClass44_Sub3_Sub1_Sub3_855 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_855.method450(6);
            aClass44_Sub3_Sub1_Sub3_855.method451(35509);
            aClass44_Sub3_Sub1_Sub3_856 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_856.method450(6);
            aClass44_Sub3_Sub1_Sub3_856.method451(35509);
            for(int l4 = 0; l4 < 2; l4++)
            {
                aClass44_Sub3_Sub1_Sub3Array836[l4] = new Class44_Sub3_Sub1_Sub3(class47_2, "mod_icons", l4);
            }
            Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backleft1", 0);
            aClass34_1123 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backleft2", 0);
            aClass34_1124 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backright1", 0);
            aClass34_1125 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backright2", 0);
            aClass34_1126 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backtop1", 0);
            aClass34_1127 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid1", 0);
            aClass34_1128 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid2", 0);
            aClass34_1129 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid3", 0);
            aClass34_1130 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backhmid2", 0);
            aClass34_1131 = new Class34(method11(7), class44_sub3_sub1_sub2.anInt1449, class44_sub3_sub1_sub2.anInt1450, 2);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            int i5 = (int)(Math.random() * 21D) - 10;
            int j5 = (int)(Math.random() * 21D) - 10;
            int k5 = (int)(Math.random() * 21D) - 10;
            int l5 = (int)(Math.random() * 41D) - 20;
            for(int i6 = 0; i6 < 100; i6++)
            {
                if(aClass44_Sub3_Sub1_Sub2Array1052[i6] != null)
                {
                    aClass44_Sub3_Sub1_Sub2Array1052[i6].method436(i5 + l5, (byte)3, j5 + l5, k5 + l5);
                }
                if(aClass44_Sub3_Sub1_Sub3Array1241[i6] != null)
                {
                    aClass44_Sub3_Sub1_Sub3Array1241[i6].method452(i5 + l5, (byte)3, j5 + l5, k5 + l5);
                }
            }
            method13(false, 83, "Unpacking textures");
            Class44_Sub3_Sub1_Sub1.method423(class47_3, aBoolean1061);
            Class44_Sub3_Sub1_Sub1.method427(0.80000000000000004D, 0);
            Class44_Sub3_Sub1_Sub1.method422(1, 20);
            method13(false, 86, "Unpacking config");
            Class26.method253(true, class47);
            Class8.method197(class47);
            Class20.method243(true, class47);
            Class14.method218(class47);
            Class12.method212(class47);
            Class22.method247(true, class47);
            Class32.method269(true, class47);
            Class38.method337(true, class47);
            Class35.method275(true, class47);
            Class14.aBoolean328 = aBoolean1234;
            if(!aBoolean1235)
            {
                method13(false, 90, "Unpacking sounds");
                byte abyte0[] = class47_5.method549("sounds.dat", null);
                Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte0, 15787);
                Class4.method175(true, class44_sub3_sub2);
            }
            method13(false, 95, "Unpacking interfaces");
            Class44_Sub3_Sub1_Sub4 aclass44_sub3_sub1_sub4[] = {
                aClass44_Sub3_Sub1_Sub4_1255, aClass44_Sub3_Sub1_Sub4_1256, aClass44_Sub3_Sub1_Sub4_1257, aClass44_Sub3_Sub1_Sub4_1258
            };
            Class5.method181(aclass44_sub3_sub1_sub4, class47_2, 0, class47_1);
            method13(false, 100, "Preparing game engine");
            for(int j6 = 0; j6 < 33; j6++)
            {
                int k6 = 999;
                int i7 = 0;
                for(int k7 = 0; k7 < 34; k7++)
                {
                    if(aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458[k7 + j6 * aClass44_Sub3_Sub1_Sub3_1144.anInt1460] == 0)
                    {
                        if(k6 == 999)
                        {
                            k6 = k7;
                        }
                        continue;
                    }
                    if(k6 == 999)
                    {
                        continue;
                    }
                    i7 = k7;
                    break;
                }
                anIntArray961[j6] = k6;
                anIntArray910[j6] = i7 - k6;
            }
            for(int l6 = 5; l6 < 156; l6++)
            {
                int j7 = 999;
                int l7 = 0;
                for(int j8 = 25; j8 < 172; j8++)
                {
                    if(aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458[j8 + l6 * aClass44_Sub3_Sub1_Sub3_1144.anInt1460] == 0 && (j8 > 34 || l6 > 34))
                    {
                        if(j7 == 999)
                        {
                            j7 = j8;
                        }
                        continue;
                    }
                    if(j7 == 999)
                    {
                        continue;
                    }
                    l7 = j8;
                    break;
                }
                anIntArray881[l6 - 5] = j7 - 25;
                anIntArray868[l6 - 5] = l7 - j7;
            }
            Class44_Sub3_Sub1_Sub1.method420(96, 479, 8);
            anIntArray914 = Class44_Sub3_Sub1_Sub1.anIntArray1429;
            Class44_Sub3_Sub1_Sub1.method420(261, 190, 8);
            anIntArray915 = Class44_Sub3_Sub1_Sub1.anIntArray1429;
            Class44_Sub3_Sub1_Sub1.method420(334, 512, 8);
            anIntArray916 = Class44_Sub3_Sub1_Sub1.anIntArray1429;
            int ai[] = new int[9];
            for(int i8 = 0; i8 < 9; i8++)
            {
                int k8 = 128 + i8 * 32 + 15;
                int l8 = 600 + k8 * 3;
                int i9 = Class44_Sub3_Sub1_Sub1.anIntArray1427[k8];
                ai[i8] = l8 * i9 >> 16;
            }
            Class36.method314(ai, 500, 334, 3, 800, 512);
            Class41.method342(class47_4);
            aClass10_866 = new Class10(228, this);
            method12(aClass10_866, 10);
            Class44_Sub3_Sub4_Sub1.aClient1481 = this;
            return;
        }
        catch(Exception exception)
        {
            Signlink.reporterror("loaderror " + aString926 + " " + anInt1176);
        }
        aBoolean1055 = true;
    }

    public void method35(boolean flag)
    {
        try
        {
            aBoolean893 = true;
            try
            {
                long l = System.currentTimeMillis();
                int i = 0;
                int j = 20;
                while(aBoolean1174)
                {
                    anInt945++;
                    method25(699);
                    method25(699);
                    method84(0);
                    if(++i > 10)
                    {
                        long l1 = System.currentTimeMillis();
                        int k = (int)(l1 - l) / 10 - j;
                        j = 40 - k;
                        if(j < 5)
                        {
                            j = 5;
                        }
                        i = 0;
                        l = l1;
                    }
                    try
                    {
                        Thread.sleep(j);
                    }
                    catch(Exception _ex)
                    {
                    }
                }
            }
            catch(Exception _ex)
            {
            }
            aBoolean893 = false;
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("21026, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method36(int i)
    {
        try
        {
            aClass34_1196.method272((byte)5);
            if(anInt848 == 2)
            {
                byte abyte0[] = aClass44_Sub3_Sub1_Sub3_1144.aByteArray1458;
                int ai[] = Class44_Sub3_Sub1.anIntArray1369;
                int l2 = abyte0.length;
                for(int j5 = 0; j5 < l2; j5++)
                {
                    if(abyte0[j5] == 0)
                    {
                        ai[j5] = 0;
                    }
                }
                aClass44_Sub3_Sub1_Sub2_988.method444(anIntArray961, 0, 25, 256, anInt930, 33, anIntArray910, 33, -687, 25, 0);
                aClass34_1197.method272((byte)5);
                return;
            }
            int j = anInt930 + anInt959 & 0x7ff;
            int k = 48 + ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
            int i3 = 464 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
            aClass44_Sub3_Sub1_Sub2_913.method444(anIntArray881, 5, i3, 256 + anInt1075, j, 151, anIntArray868, 146, -687, k, 25);
            aClass44_Sub3_Sub1_Sub2_988.method444(anIntArray961, 0, 25, 256, anInt930, 33, anIntArray910, 33, -687, 25, 0);
            for(int k5 = 0; k5 < anInt826; k5++)
            {
                int l = (anIntArray827[k5] * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                int j3 = (anIntArray828[k5] * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                method141(l, aClass44_Sub3_Sub1_Sub2Array872[k5], 139, j3);
            }
            for(int l5 = 0; l5 < 104; l5++)
            {
                for(int i6 = 0; i6 < 104; i6++)
                {
                    Class28 class28 = aClass28ArrayArrayArray1146[anInt1155][l5][i6];
                    if(class28 != null)
                    {
                        int i1 = (l5 * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                        int k3 = (i6 * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                        method141(i1, aClass44_Sub3_Sub1_Sub2_1077, 139, k3);
                    }
                }
            }
            anInt1169 += i;
            for(int j6 = 0; j6 < anInt1009; j6++)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[j6]];
                if(class44_sub3_sub4_sub6_sub2 != null && class44_sub3_sub4_sub6_sub2.method535(true) && class44_sub3_sub4_sub6_sub2.aClass12_1700.aBoolean298)
                {
                    int j1 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                    int l3 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                    method141(j1, aClass44_Sub3_Sub1_Sub2_1078, 139, l3);
                }
            }
            for(int k6 = 0; k6 < anInt1226; k6++)
            {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[k6]];
                if(class44_sub3_sub4_sub6_sub1 != null && class44_sub3_sub4_sub6_sub1.method535(true))
                {
                    int k1 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                    int i4 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                    boolean flag = false;
                    long l6 = Class48.method550(class44_sub3_sub4_sub6_sub1.aString1672);
                    for(int i7 = 0; i7 < anInt1104; i7++)
                    {
                        if(l6 != aLongArray979[i7] || anIntArray894[i7] == 0)
                        {
                            continue;
                        }
                        flag = true;
                        break;
                    }
                    if(aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1695 != 0 && class44_sub3_sub4_sub6_sub1.anInt1695 != 0)
                    {
                        if(aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1695 == class44_sub3_sub4_sub6_sub1.anInt1695)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                    if(flag)
                    {
                        method141(k1, aClass44_Sub3_Sub1_Sub2_1080, 139, i4);
                    } else
                    {
                        method141(k1, aClass44_Sub3_Sub1_Sub2_1079, 139, i4);
                    }
                }
            }
            if(anInt1005 != 0 && anInt1240 % 20 < 10)
            {
                if(anInt1005 == 1 && anInt901 >= 0 && anInt901 < aClass44_Sub3_Sub4_Sub6_Sub2Array1008.length)
                {
                    Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anInt901];
                    if(class44_sub3_sub4_sub6_sub2_1 != null)
                    {
                        int l1 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_1)).anInt1615 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                        int j4 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_1)).anInt1616 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                        method15(l1, aClass44_Sub3_Sub1_Sub2_1211, j4, anInt834);
                    }
                }
                if(anInt1005 == 2)
                {
                    int i2 = ((anInt1248 - anInt1184) * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                    int k4 = ((anInt1249 - anInt1185) * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                    method15(i2, aClass44_Sub3_Sub1_Sub2_1211, k4, anInt834);
                }
                if(anInt1005 == 10 && anInt909 >= 0 && anInt909 < aClass44_Sub3_Sub4_Sub6_Sub1Array1225.length)
                {
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anInt909];
                    if(class44_sub3_sub4_sub6_sub1_1 != null)
                    {
                        int j2 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anInt1615 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                        int l4 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anInt1616 / 32 - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                        method15(j2, aClass44_Sub3_Sub1_Sub2_1211, l4, anInt834);
                    }
                }
            }
            if(anInt911 != 0)
            {
                int k2 = (anInt911 * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 / 32;
                int i5 = (anInt912 * 4 + 2) - ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 / 32;
                method141(k2, aClass44_Sub3_Sub1_Sub2_1210, 139, i5);
            }
            Class44_Sub3_Sub1.method411(0xffffff, 210, 78, 3, 97, 3);
            aClass34_1197.method272((byte)5);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("47037, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method37(int i, int j, int k, Class5 class5, int l)
    {
        try
        {
            if(class5.anInt107 != 0 || class5.anIntArray122 == null)
            {
                return;
            }
            if(class5.aBoolean121 && anInt999 != class5.anInt105 && anInt933 != class5.anInt105 && anInt1212 != class5.anInt105)
            {
                return;
            }
            int i1 = Class44_Sub3_Sub1.anInt1374;
            int j1 = Class44_Sub3_Sub1.anInt1372;
            int k1 = Class44_Sub3_Sub1.anInt1375;
            int l1 = Class44_Sub3_Sub1.anInt1373;
            Class44_Sub3_Sub1.method408(aByte977, l + class5.anInt111, k + class5.anInt110, l, k);
            int i2 = class5.anIntArray122.length;
            for(int j2 = 0; j2 < i2; j2++)
            {
                int k2 = class5.anIntArray123[j2] + k;
                int l2 = (class5.anIntArray124[j2] + l) - j;
                Class5 class5_1 = Class5.aClass5Array100[class5.anIntArray122[j2]];
                k2 += class5_1.anInt113;
                l2 += class5_1.anInt114;
                if(class5_1.anInt109 > 0)
                {
                    method41(-338, class5_1);
                }
                if(class5_1.anInt107 == 0)
                {
                    if(class5_1.anInt120 > class5_1.anInt119 - class5_1.anInt111)
                    {
                        class5_1.anInt120 = class5_1.anInt119 - class5_1.anInt111;
                    }
                    if(class5_1.anInt120 < 0)
                    {
                        class5_1.anInt120 = 0;
                    }
                    method37(6, class5_1.anInt120, k2, class5_1, l2);
                    if(class5_1.anInt119 > class5_1.anInt111)
                    {
                        method21(l2, k2 + class5_1.anInt110, class5_1.anInt120, class5_1.anInt119, class5_1.anInt111, 3);
                    }
                } else
                if(class5_1.anInt107 != 1)
                {
                    if(class5_1.anInt107 == 2)
                    {
                        int i3 = 0;
                        for(int l3 = 0; l3 < class5_1.anInt111; l3++)
                        {
                            for(int l4 = 0; l4 < class5_1.anInt110; l4++)
                            {
                                int k5 = k2 + l4 * (32 + class5_1.anInt131);
                                int j6 = l2 + l3 * (32 + class5_1.anInt132);
                                if(i3 < 20)
                                {
                                    k5 += class5_1.anIntArray134[i3];
                                    j6 += class5_1.anIntArray135[i3];
                                }
                                if(class5_1.anIntArray101[i3] > 0)
                                {
                                    int k6 = 0;
                                    int j7 = 0;
                                    int j9 = class5_1.anIntArray101[i3] - 1;
                                    if(k5 > Class44_Sub3_Sub1.anInt1374 - 32 && k5 < Class44_Sub3_Sub1.anInt1375 && j6 > Class44_Sub3_Sub1.anInt1372 - 32 && j6 < Class44_Sub3_Sub1.anInt1373 || anInt1095 != 0 && anInt1094 == i3)
                                    {
                                        int l9 = 0;
                                        if(anInt952 == 1 && anInt953 == i3 && anInt954 == class5_1.anInt105)
                                        {
                                            l9 = 0xffffff;
                                        }
                                        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_2 = Class14.method226(54, j9, l9, class5_1.anIntArray102[i3]);
                                        if(class44_sub3_sub1_sub2_2 != null)
                                        {
                                            if(anInt1095 != 0 && anInt1094 == i3 && anInt1093 == class5_1.anInt105)
                                            {
                                                k6 = super.anInt21 - anInt1096;
                                                j7 = super.anInt22 - anInt1097;
                                                if(k6 < 5 && k6 > -5)
                                                {
                                                    k6 = 0;
                                                }
                                                if(j7 < 5 && j7 > -5)
                                                {
                                                    j7 = 0;
                                                }
                                                if(anInt978 < 5)
                                                {
                                                    k6 = 0;
                                                    j7 = 0;
                                                }
                                                class44_sub3_sub1_sub2_2.method442(128, anInt902, j6 + j7, k5 + k6);
                                                if(j6 + j7 < Class44_Sub3_Sub1.anInt1372 && class5.anInt120 > 0)
                                                {
                                                    int i10 = (anInt824 * (Class44_Sub3_Sub1.anInt1372 - j6 - j7)) / 3;
                                                    if(i10 > anInt824 * 10)
                                                    {
                                                        i10 = anInt824 * 10;
                                                    }
                                                    if(i10 > class5.anInt120)
                                                    {
                                                        i10 = class5.anInt120;
                                                    }
                                                    class5.anInt120 -= i10;
                                                    anInt1097 += i10;
                                                }
                                                if(j6 + j7 + 32 > Class44_Sub3_Sub1.anInt1373 && class5.anInt120 < class5.anInt119 - class5.anInt111)
                                                {
                                                    int j10 = (anInt824 * ((j6 + j7 + 32) - Class44_Sub3_Sub1.anInt1373)) / 3;
                                                    if(j10 > anInt824 * 10)
                                                    {
                                                        j10 = anInt824 * 10;
                                                    }
                                                    if(j10 > class5.anInt119 - class5.anInt111 - class5.anInt120)
                                                    {
                                                        j10 = class5.anInt119 - class5.anInt111 - class5.anInt120;
                                                    }
                                                    class5.anInt120 += j10;
                                                    anInt1097 -= j10;
                                                }
                                            } else
                                            if(anInt1151 != 0 && anInt1150 == i3 && anInt1149 == class5_1.anInt105)
                                            {
                                                class44_sub3_sub1_sub2_2.method442(128, anInt902, j6, k5);
                                            } else
                                            {
                                                class44_sub3_sub1_sub2_2.method440(j6, aByte1213, k5);
                                            }
                                            if(class44_sub3_sub1_sub2_2.anInt1453 == 33 || class5_1.anIntArray102[i3] != 1)
                                            {
                                                int k10 = class5_1.anIntArray102[i3];
                                                aClass44_Sub3_Sub1_Sub4_1255.method459((byte)-104, 0, method100(k10, 656), k5 + 1 + k6, j6 + 10 + j7);
                                                aClass44_Sub3_Sub1_Sub4_1255.method459((byte)-104, 0xffff00, method100(k10, 656), k5 + k6, j6 + 9 + j7);
                                            }
                                        }
                                    }
                                } else
                                if(class5_1.aClass44_Sub3_Sub1_Sub2Array133 != null && i3 < 20)
                                {
                                    Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_1 = class5_1.aClass44_Sub3_Sub1_Sub2Array133[i3];
                                    if(class44_sub3_sub1_sub2_1 != null)
                                    {
                                        class44_sub3_sub1_sub2_1.method440(j6, aByte1213, k5);
                                    }
                                }
                                i3++;
                            }
                        }
                    } else
                    if(class5_1.anInt107 == 3)
                    {
                        boolean flag = false;
                        if(anInt1212 == class5_1.anInt105 || anInt933 == class5_1.anInt105 || anInt999 == class5_1.anInt105)
                        {
                            flag = true;
                        }
                        int j3;
                        if(method88(class5_1, 0))
                        {
                            j3 = class5_1.anInt144;
                            if(flag && class5_1.anInt146 != 0)
                            {
                                j3 = class5_1.anInt146;
                            }
                        } else
                        {
                            j3 = class5_1.anInt143;
                            if(flag && class5_1.anInt145 != 0)
                            {
                                j3 = class5_1.anInt145;
                            }
                        }
                        if(class5_1.aByte112 == 0)
                        {
                            if(class5_1.aBoolean137)
                            {
                                Class44_Sub3_Sub1.method411(j3, 210, l2, class5_1.anInt111, k2, class5_1.anInt110);
                            } else
                            {
                                Class44_Sub3_Sub1.method412(1, k2, class5_1.anInt110, j3, l2, class5_1.anInt111);
                            }
                        } else
                        if(class5_1.aBoolean137)
                        {
                            Class44_Sub3_Sub1.method410(l2, class5_1.anInt111, 256 - (class5_1.aByte112 & 0xff), j3, class5_1.anInt110, k2, false);
                        } else
                        {
                            Class44_Sub3_Sub1.method413(class5_1.anInt111, j3, k2, class5_1.anInt110, 256 - (class5_1.aByte112 & 0xff), l2, 0);
                        }
                    } else
                    if(class5_1.anInt107 == 4)
                    {
                        Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = class5_1.aClass44_Sub3_Sub1_Sub4_140;
                        String s = class5_1.aString141;
                        boolean flag1 = false;
                        if(anInt1212 == class5_1.anInt105 || anInt933 == class5_1.anInt105 || anInt999 == class5_1.anInt105)
                        {
                            flag1 = true;
                        }
                        int i4;
                        if(method88(class5_1, 0))
                        {
                            i4 = class5_1.anInt144;
                            if(flag1 && class5_1.anInt146 != 0)
                            {
                                i4 = class5_1.anInt146;
                            }
                            if(class5_1.aString142.length() > 0)
                            {
                                s = class5_1.aString142;
                            }
                        } else
                        {
                            i4 = class5_1.anInt143;
                            if(flag1 && class5_1.anInt145 != 0)
                            {
                                i4 = class5_1.anInt145;
                            }
                        }
                        if(class5_1.anInt108 == 6 && aBoolean935)
                        {
                            s = "Please wait...";
                            i4 = class5_1.anInt143;
                        }
                        if(Class44_Sub3_Sub1.anInt1370 == 479)
                        {
                            if(i4 == 0xffff00)
                            {
                                i4 = 255;
                            }
                            if(i4 == 49152)
                            {
                                i4 = 0xffffff;
                            }
                        }
                        for(int l6 = l2 + class44_sub3_sub1_sub4.anInt1478; s.length() > 0; l6 += class44_sub3_sub1_sub4.anInt1478)
                        {
                            if(s.indexOf("%") != -1)
                            {
                                do
                                {
                                    int k7 = s.indexOf("%1");
                                    if(k7 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, k7) + method72(method94(0, aByte1086, class5_1), false) + s.substring(k7 + 2);
                                } while(true);
                                do
                                {
                                    int l7 = s.indexOf("%2");
                                    if(l7 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, l7) + method72(method94(1, aByte1086, class5_1), false) + s.substring(l7 + 2);
                                } while(true);
                                do
                                {
                                    int i8 = s.indexOf("%3");
                                    if(i8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, i8) + method72(method94(2, aByte1086, class5_1), false) + s.substring(i8 + 2);
                                } while(true);
                                do
                                {
                                    int j8 = s.indexOf("%4");
                                    if(j8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, j8) + method72(method94(3, aByte1086, class5_1), false) + s.substring(j8 + 2);
                                } while(true);
                                do
                                {
                                    int k8 = s.indexOf("%5");
                                    if(k8 == -1)
                                    {
                                        break;
                                    }
                                    s = s.substring(0, k8) + method72(method94(4, aByte1086, class5_1), false) + s.substring(k8 + 2);
                                } while(true);
                            }
                            int l8 = s.indexOf("\\n");
                            String s1;
                            if(l8 != -1)
                            {
                                s1 = s.substring(0, l8);
                                s = s.substring(l8 + 2);
                            } else
                            {
                                s1 = s;
                                s = "";
                            }
                            if(class5_1.aBoolean138)
                            {
                                class44_sub3_sub1_sub4.method456(class5_1.aBoolean139, i4, (byte)-85, k2 + class5_1.anInt110 / 2, s1, l6);
                            } else
                            {
                                class44_sub3_sub1_sub4.method463(i4, 2, l6, class5_1.aBoolean139, k2, s1);
                            }
                        }

                    } else
                    if(class5_1.anInt107 == 5)
                    {
                        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2;
                        if(method88(class5_1, 0))
                        {
                            class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_148;
                        } else
                        {
                            class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_147;
                        }
                        if(class44_sub3_sub1_sub2 != null)
                        {
                            class44_sub3_sub1_sub2.method440(l2, aByte1213, k2);
                        }
                    } else
                    if(class5_1.anInt107 == 6)
                    {
                        int k3 = Class44_Sub3_Sub1_Sub1.anInt1423;
                        int j4 = Class44_Sub3_Sub1_Sub1.anInt1424;
                        Class44_Sub3_Sub1_Sub1.anInt1423 = k2 + class5_1.anInt110 / 2;
                        Class44_Sub3_Sub1_Sub1.anInt1424 = l2 + class5_1.anInt111 / 2;
                        int i5 = Class44_Sub3_Sub1_Sub1.anIntArray1427[class5_1.anInt156] * class5_1.anInt155 >> 16;
                        int l5 = Class44_Sub3_Sub1_Sub1.anIntArray1428[class5_1.anInt156] * class5_1.anInt155 >> 16;
                        boolean flag2 = method88(class5_1, 0);
                        int i7;
                        if(flag2)
                        {
                            i7 = class5_1.anInt154;
                        } else
                        {
                            i7 = class5_1.anInt153;
                        }
                        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
                        if(i7 == -1)
                        {
                            class44_sub3_sub4_sub4 = class5_1.method183(0, -1, -1, flag2);
                        } else
                        {
                            Class26 class26 = Class26.aClass26Array508[i7];
                            class44_sub3_sub4_sub4 = class5_1.method183(0, class26.anIntArray511[class5_1.anInt103], class26.anIntArray510[class5_1.anInt103], flag2);
                        }
                        if(class44_sub3_sub4_sub4 != null)
                        {
                            class44_sub3_sub4_sub4.method526(0, class5_1.anInt157, 0, class5_1.anInt156, 0, i5, l5);
                        }
                        Class44_Sub3_Sub1_Sub1.anInt1423 = k3;
                        Class44_Sub3_Sub1_Sub1.anInt1424 = j4;
                    } else
                    if(class5_1.anInt107 == 7)
                    {
                        Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4_1 = class5_1.aClass44_Sub3_Sub1_Sub4_140;
                        int k4 = 0;
                        for(int j5 = 0; j5 < class5_1.anInt111; j5++)
                        {
                            for(int i6 = 0; i6 < class5_1.anInt110; i6++)
                            {
                                if(class5_1.anIntArray101[k4] > 0)
                                {
                                    Class14 class14 = Class14.method220(class5_1.anIntArray101[k4] - 1);
                                    String s2 = class14.aString331;
                                    if(class14.aBoolean342 || class5_1.anIntArray102[k4] != 1)
                                    {
                                        s2 = s2 + " x" + method98(class5_1.anIntArray102[k4], (byte)5);
                                    }
                                    int i9 = k2 + i6 * (115 + class5_1.anInt131);
                                    int k9 = l2 + j5 * (12 + class5_1.anInt132);
                                    if(class5_1.aBoolean138)
                                    {
                                        class44_sub3_sub1_sub4_1.method456(class5_1.aBoolean139, class5_1.anInt143, (byte)-85, i9 + class5_1.anInt110 / 2, s2, k9);
                                    } else
                                    {
                                        class44_sub3_sub1_sub4_1.method463(class5_1.anInt143, 2, k9, class5_1.aBoolean139, i9, s2);
                                    }
                                }
                                k4++;
                            }
                        }
                    }
                }
            }

            if(i < 6 || i > 6)
            {
                aBoolean1061 = !aBoolean1061;
            }
            Class44_Sub3_Sub1.method408(aByte977, l1, k1, j1, i1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("32464, " + i + ", " + j + ", " + k + ", " + class5 + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
    public void method38(byte byte0)
    {
        try
        {
            if(byte0 != 6)
            {
                return;
            }
            if(aBoolean1235 && anInt882 == 2 && Class3.anInt65 != anInt1155)
            {
                aClass34_1197.method272((byte)5);
                aClass44_Sub3_Sub1_Sub4_1256.method455(257, "Loading - please wait.", -31546, 0, 151);
                aClass44_Sub3_Sub1_Sub4_1256.method455(256, "Loading - please wait.", -31546, 0xffffff, 150);
                aClass34_1197.method273(-781, 4, 4, super.aGraphics13);
                anInt882 = 1;
                aLong1070 = System.currentTimeMillis();
            }
            if(anInt882 == 1)
            {
                int i = method39(aByte1182);
                if(i != 0 && System.currentTimeMillis() - aLong1070 > 0x57e40L)
                {
                    Signlink.reporterror(aString1071 + " glcfb " + aLong813 + "," + i + "," + aBoolean1235 + "," + aClass45Array1208[0] + "," + aClass43_Sub1_814.method393() + "," + anInt1155 + "," + anInt841 + "," + anInt842);
                    aLong1070 = System.currentTimeMillis();
                }
            }
            if(anInt882 == 2 && anInt1155 != anInt1063)
            {
                anInt1063 = anInt1155;
                method40((byte)-89, anInt1155);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("64388, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method39(byte byte0)
    {
        try
        {
            for(int i = 0; i < aByteArrayArray981.length; i++)
            {
                if(aByteArrayArray981[i] == null && anIntArray1040[i] != -1)
                {
                    return -1;
                }
                if(aByteArrayArray973[i] == null && anIntArray1041[i] != -1)
                {
                    return -2;
                }
            }
            boolean flag = true;
            for(int j = 0; j < aByteArrayArray981.length; j++)
            {
                byte abyte0[] = aByteArrayArray973[j];
                if(abyte0 != null)
                {
                    int k = (anIntArray1039[j] >> 8) * 64 - anInt1184;
                    int l = (anIntArray1039[j] & 0xff) * 64 - anInt1185;
                    flag &= Class3.method159(576, l, k, abyte0);
                }
            }
            if(!flag)
            {
                return -3;
            }
            if(aBoolean1275)
            {
                return -4;
            }
            anInt882 = 2;
            Class3.anInt65 = anInt1155;
            method129(-17416);
            aClass44_Sub3_Sub2_850.method471(-34003, 214);
            if(byte0 == 2)
            {
                byte0 = 0;
            } else
            {
                anInt1029 = 384;
            }
            return 0;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("76031, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method40(byte byte0, int i)
    {
        try
        {
            int ai[] = aClass44_Sub3_Sub1_Sub2_913.anIntArray1448;
            int j = ai.length;
            for(int k = 0; k < j; k++)
            {
                ai[k] = 0;
            }
            for(int l = 1; l < 103; l++)
            {
                int i1 = 24628 + (103 - l) * 512 * 4;
                for(int k1 = 1; k1 < 103; k1++)
                {
                    if((aByteArrayArrayArray871[i][k1][l] & 0x18) == 0)
                    {
                        aClass36_1192.method313(ai, i1, 512, i, k1, l);
                    }
                    if(i < 3 && (aByteArrayArrayArray871[i + 1][k1][l] & 8) != 0)
                    {
                        aClass36_1192.method313(ai, i1, 512, i + 1, k1, l);
                    }
                    i1 += 4;
                }
            }
            int j1 = ((238 + (int)(Math.random() * 20D)) - 10 << 16) + ((238 + (int)(Math.random() * 20D)) - 10 << 8) + ((238 + (int)(Math.random() * 20D)) - 10);
            int l1 = (238 + (int)(Math.random() * 20D)) - 10 << 16;
            aClass44_Sub3_Sub1_Sub2_913.method435((byte)5);
            for(int i2 = 1; i2 < 103; i2++)
            {
                for(int j2 = 1; j2 < 103; j2++)
                {
                    if((aByteArrayArrayArray871[i][j2][i2] & 0x18) == 0)
                    {
                        method86(j2, i2, j1, (byte)5, i, l1);
                    }
                    if(i < 3 && (aByteArrayArrayArray871[i + 1][j2][i2] & 8) != 0)
                    {
                        method86(j2, i2, j1, (byte)5, i + 1, l1);
                    }
                }
            }
            aClass34_1197.method272((byte)5);
            anInt826 = 0;
            if(byte0 != -89)
            {
                anInt1029 = aClass46_927.method545();
            }
            for(int k2 = 0; k2 < 104; k2++)
            {
                for(int l2 = 0; l2 < 104; l2++)
                {
                    int i3 = aClass36_1192.method307(anInt1155, k2, l2);
                    if(i3 != 0)
                    {
                        i3 = i3 >> 14 & 0x7fff;
                        int j3 = Class8.method199(i3).anInt235;
                        if(j3 >= 0)
                        {
                            int k3 = k2;
                            int l3 = l2;
                            if(j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48)
                            {
                                byte byte1 = 104;
                                byte byte2 = 104;
                                int ai1[][] = aClass18Array1022[anInt1155].anIntArrayArray418;
                                for(int i4 = 0; i4 < 10; i4++)
                                {
                                    int j4 = (int)(Math.random() * 4D);
                                    if(j4 == 0 && k3 > 0 && k3 > k2 - 3 && (ai1[k3 - 1][l3] & 0x280108) == 0)
                                    {
                                        k3--;
                                    }
                                    if(j4 == 1 && k3 < byte1 - 1 && k3 < k2 + 3 && (ai1[k3 + 1][l3] & 0x280180) == 0)
                                    {
                                        k3++;
                                    }
                                    if(j4 == 2 && l3 > 0 && l3 > l2 - 3 && (ai1[k3][l3 - 1] & 0x280102) == 0)
                                    {
                                        l3--;
                                    }
                                    if(j4 == 3 && l3 < byte2 - 1 && l3 < l2 + 3 && (ai1[k3][l3 + 1] & 0x280120) == 0)
                                    {
                                        l3++;
                                    }
                                }
                            }
                            aClass44_Sub3_Sub1_Sub2Array872[anInt826] = aClass44_Sub3_Sub1_Sub2Array1052[j3];
                            anIntArray827[anInt826] = k3;
                            anIntArray828[anInt826] = l3;
                            anInt826++;
                        }
                    }
                }
            }
            anInt1204++;
            if(anInt1204 > 112)
            {
                anInt1204 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 125);
                aClass44_Sub3_Sub2_850.method472(50);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("89876, " + byte0 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method41(int i, Class5 class5)
    {
        try
        {
            if(i >= 0)
            {
                anInt1152 = aClass46_927.method545();
            }
            int j = class5.anInt109;
            if(j >= 1 && j <= 100 || j >= 701 && j <= 800)
            {
                if(j == 1 && anInt1105 == 0)
                {
                    class5.aString141 = "Loading friend list";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 1 && anInt1105 == 1)
                {
                    class5.aString141 = "Connecting to friendserver";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 2 && anInt1105 != 2)
                {
                    class5.aString141 = "Please wait...";
                    class5.anInt108 = 0;
                    return;
                }
                int k = anInt1104;
                if(anInt1105 != 2)
                {
                    k = 0;
                }
                if(j > 700)
                {
                    j -= 601;
                } else
                {
                    j--;
                }
                if(j >= k)
                {
                    class5.aString141 = "";
                    class5.anInt108 = 0;
                    return;
                } else
                {
                    class5.aString141 = aStringArray1044[j];
                    class5.anInt108 = 1;
                    return;
                }
            }
            if(j >= 101 && j <= 200 || j >= 801 && j <= 900)
            {
                int l = anInt1104;
                if(anInt1105 != 2)
                {
                    l = 0;
                }
                if(j > 800)
                {
                    j -= 701;
                } else
                {
                    j -= 101;
                }
                if(j >= l)
                {
                    class5.aString141 = "";
                    class5.anInt108 = 0;
                    return;
                }
                if(anIntArray894[j] == 0)
                {
                    class5.aString141 = "@red@Offline";
                } else
                if(anIntArray894[j] == anInt1232)
                {
                    class5.aString141 = "@gre@World-" + (anIntArray894[j] - 9);
                } else
                {
                    class5.aString141 = "@yel@World-" + (anIntArray894[j] - 9);
                }
                class5.anInt108 = 1;
                return;
            }
            if(j == 203)
            {
                int i1 = anInt1104;
                if(anInt1105 != 2)
                {
                    i1 = 0;
                }
                class5.anInt119 = i1 * 15 + 20;
                if(class5.anInt119 <= class5.anInt111)
                {
                    class5.anInt119 = class5.anInt111 + 1;
                }
                return;
            }
            if(j >= 401 && j <= 500)
            {
                if((j -= 401) == 0 && anInt1105 == 0)
                {
                    class5.aString141 = "Loading ignore list";
                    class5.anInt108 = 0;
                    return;
                }
                if(j == 1 && anInt1105 == 0)
                {
                    class5.aString141 = "Please wait...";
                    class5.anInt108 = 0;
                    return;
                }
                int j1 = anInt957;
                if(anInt1105 == 0)
                {
                    j1 = 0;
                }
                if(j >= j1)
                {
                    class5.aString141 = "";
                    class5.anInt108 = 0;
                    return;
                } else
                {
                    class5.aString141 = Class48.method554(Class48.method551(aLongArray1254[j], true), true);
                    class5.anInt108 = 1;
                    return;
                }
            }
            if(j == 503)
            {
                class5.anInt119 = anInt957 * 15 + 20;
                if(class5.anInt119 <= class5.anInt111)
                {
                    class5.anInt119 = class5.anInt111 + 1;
                }
                return;
            }
            if(j == 327)
            {
                class5.anInt156 = 150;
                class5.anInt157 = (int)(Math.sin((double)anInt1240 / 40D) * 256D) & 0x7ff;
                if(aBoolean812)
                {
                    for(int k1 = 0; k1 < 7; k1++)
                    {
                        int l1 = anIntArray849[k1];
                        if(l1 >= 0 && !Class22.aClass22Array464[l1].method249(9))
                        {
                            return;
                        }
                    }
                    aBoolean812 = false;
                    Class44_Sub3_Sub4_Sub4 aclass44_sub3_sub4_sub4[] = new Class44_Sub3_Sub4_Sub4[7];
                    int i2 = 0;
                    for(int j2 = 0; j2 < 7; j2++)
                    {
                        int k2 = anIntArray849[j2];
                        if(k2 >= 0)
                        {
                            aclass44_sub3_sub4_sub4[i2++] = Class22.aClass22Array464[k2].method250(0);
                        }
                    }
                    Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4, i2, -33019);
                    for(int l2 = 0; l2 < 5; l2++)
                    {
                        if(anIntArray938[l2] != 0)
                        {
                            class44_sub3_sub4_sub4.method520(anIntArrayArray1073[l2][0], anIntArrayArray1073[l2][anIntArray938[l2]]);
                            if(l2 == 1)
                            {
                                class44_sub3_sub4_sub4.method520(anIntArray1043[0], anIntArray1043[anIntArray938[l2]]);
                            }
                        }
                    }
                    class44_sub3_sub4_sub4.method513((byte)3);
                    class44_sub3_sub4_sub4.method514(Class26.aClass26Array508[((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1620].anIntArray510[0], 188);
                    class44_sub3_sub4_sub4.method523(64, 850, -30, -50, -30, true);
                    class5.anInt149 = 5;
                    class5.anInt150 = 0;
                    Class5.method185(5, class44_sub3_sub4_sub4, 9, 0);
                }
                return;
            }
            if(j == 324)
            {
                if(aClass44_Sub3_Sub1_Sub2_1025 == null)
                {
                    aClass44_Sub3_Sub1_Sub2_1025 = class5.aClass44_Sub3_Sub1_Sub2_147;
                    aClass44_Sub3_Sub1_Sub2_1026 = class5.aClass44_Sub3_Sub1_Sub2_148;
                }
                if(aBoolean1179)
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1026;
                    return;
                } else
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1025;
                    return;
                }
            }
            if(j == 325)
            {
                if(aClass44_Sub3_Sub1_Sub2_1025 == null)
                {
                    aClass44_Sub3_Sub1_Sub2_1025 = class5.aClass44_Sub3_Sub1_Sub2_147;
                    aClass44_Sub3_Sub1_Sub2_1026 = class5.aClass44_Sub3_Sub1_Sub2_148;
                }
                if(aBoolean1179)
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1025;
                    return;
                } else
                {
                    class5.aClass44_Sub3_Sub1_Sub2_147 = aClass44_Sub3_Sub1_Sub2_1026;
                    return;
                }
            }
            if(j == 600)
            {
                class5.aString141 = aString939;
                if(anInt1240 % 20 < 10)
                {
                    class5.aString141 += "|";
                    return;
                } else
                {
                    class5.aString141 += " ";
                    return;
                }
            }
            if(j == 613)
            {
                if(anInt1188 >= 1)
                {
                    if(aBoolean987)
                    {
                        class5.anInt143 = 0xff0000;
                        class5.aString141 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else
                    {
                        class5.anInt143 = 0xffffff;
                        class5.aString141 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else
                {
                    class5.aString141 = "";
                }
            }
            if(j == 650 || j == 655)
            {
                if(anInt1231 != 0)
                {
                    String s;
                    if(anInt947 == 0)
                    {
                        s = "earlier today";
                    } else
                    if(anInt947 == 1)
                    {
                        s = "yesterday";
                    } else
                    {
                        s = anInt947 + " days ago";
                    }
                    class5.aString141 = "You last logged in " + s + " from: " + Signlink.dns;
                } else
                {
                    class5.aString141 = "";
                }
            }
            if(j == 651)
            {
                if(anInt1023 == 0)
                {
                    class5.aString141 = "0 unread messages";
                    class5.anInt143 = 0xffff00;
                }
                if(anInt1023 == 1)
                {
                    class5.aString141 = "1 unread message";
                    class5.anInt143 = 65280;
                }
                if(anInt1023 > 1)
                {
                    class5.aString141 = anInt1023 + " unread messages";
                    class5.anInt143 = 65280;
                }
            }
            if(j == 652)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.aString141 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else
                    {
                        class5.aString141 = "";
                    }
                } else
                if(anInt869 == 200)
                {
                    class5.aString141 = "You have not yet set any password recovery questions.";
                } else
                {
                    String s1;
                    if(anInt869 == 0)
                    {
                        s1 = "Earlier today";
                    } else
                    if(anInt869 == 1)
                    {
                        s1 = "Yesterday";
                    } else
                    {
                        s1 = anInt869 + " days ago";
                    }
                    class5.aString141 = s1 + " you changed your recovery questions";
                }
            }
            if(j == 653)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.aString141 = "@whi@recommend you use a members world instead. You may use";
                    } else
                    {
                        class5.aString141 = "";
                    }
                } else
                if(anInt869 == 200)
                {
                    class5.aString141 = "We strongly recommend you do so now to secure your account.";
                } else
                {
                    class5.aString141 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if(j == 654)
            {
                if(anInt869 == 201)
                {
                    if(anInt917 == 1)
                    {
                        class5.aString141 = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                    } else
                    {
                        class5.aString141 = "";
                        return;
                    }
                }
                if(anInt869 == 200)
                {
                    class5.aString141 = "Do this from the 'account management' area on our front webpage";
                    return;
                } else
                {
                    class5.aString141 = "Do this from the 'account management' area on our front webpage";
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("89305, " + i + ", " + class5 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method42(byte byte0, int i, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            while(true)
            {
                if(class44_sub3_sub2.anInt1393 + 21 >= i * 8)
                {
                    break;
                }
                int j = class44_sub3_sub2.method493(14, false);
                if(j == 16383)
                {
                    break;
                }
                if(aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j] == null)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j] = new Class44_Sub3_Sub4_Sub6_Sub2();
                }
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j];
                anIntArray1010[anInt1009++] = j;
                class44_sub3_sub4_sub6_sub2.anInt1660 = anInt1240;
                class44_sub3_sub4_sub6_sub2.aClass12_1700 = Class12.method214(class44_sub3_sub2.method493(11, false));
                class44_sub3_sub4_sub6_sub2.anInt1619 = class44_sub3_sub4_sub6_sub2.aClass12_1700.aByte284;
                class44_sub3_sub4_sub6_sub2.anInt1663 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt306;
                class44_sub3_sub4_sub6_sub2.anInt1622 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt288;
                class44_sub3_sub4_sub6_sub2.anInt1623 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt289;
                class44_sub3_sub4_sub6_sub2.anInt1624 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt290;
                class44_sub3_sub4_sub6_sub2.anInt1625 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt291;
                class44_sub3_sub4_sub6_sub2.anInt1620 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt287;
                int k = class44_sub3_sub2.method493(5, false);
                if(k > 15)
                {
                    k -= 32;
                }
                int l = class44_sub3_sub2.method493(5, false);
                if(l > 15)
                {
                    l -= 32;
                }
                int i1 = class44_sub3_sub2.method493(1, false);
                class44_sub3_sub4_sub6_sub2.method532(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0] + k, i1 == 1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0] + l, aByte925);
                int j1 = class44_sub3_sub2.method493(1, false);
                if(j1 == 1)
                {
                    anIntArray1229[anInt1228++] = j;
                }
            }
            class44_sub3_sub2.method494((byte)4);
            if(byte0 != -97)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("11026, " + byte0 + ", " + i + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method13(boolean flag, int i, String s)
    {
        try
        {
            anInt1176 = i;
            aString926 = s;
            method87(831);
            if(flag)
            {
                aBoolean1061 = !aBoolean1061;
            }
            if(aClass47_1117 == null)
            {
                super.method13(false, i, s);
                return;
            }
            aClass34_1265.method272((byte)5);
            char c = '\u0168';
            char c1 = '\310';
            byte byte0 = 20;
            aClass44_Sub3_Sub1_Sub4_1257.method455(c / 2, "RuneScape is loading - please wait...", -31546, 0xffffff, c1 / 2 - 26 - byte0);
            int j = c1 / 2 - 18 - byte0;
            Class44_Sub3_Sub1.method412(1, c / 2 - 152, 304, 0x8c1111, j, 34);
            Class44_Sub3_Sub1.method412(1, c / 2 - 151, 302, 0, j + 1, 32);
            Class44_Sub3_Sub1.method411(0x8c1111, 210, j + 2, 30, c / 2 - 150, i * 3);
            Class44_Sub3_Sub1.method411(0, 210, j + 2, 30, (c / 2 - 150) + i * 3, 300 - i * 3);
            aClass44_Sub3_Sub1_Sub4_1257.method455(c / 2, s, -31546, 0xffffff, (c1 / 2 + 5) - byte0);
            aClass34_1265.method273(-781, 202, 171, super.aGraphics13);
            if(aBoolean908)
            {
                aBoolean908 = false;
                if(!aBoolean1174)
                {
                    aClass34_1266.method273(-781, 0, 0, super.aGraphics13);
                    aClass34_1267.method273(-781, 637, 0, super.aGraphics13);
                }
                aClass34_1263.method273(-781, 128, 0, super.aGraphics13);
                aClass34_1264.method273(-781, 202, 371, super.aGraphics13);
                aClass34_1268.method273(-781, 0, 265, super.aGraphics13);
                aClass34_1269.method273(-781, 562, 265, super.aGraphics13);
                aClass34_1270.method273(-781, 128, 171, super.aGraphics13);
                aClass34_1271.method273(-781, 562, 171, super.aGraphics13);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("10134, " + flag + ", " + i + ", " + s + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method43(int i)
    {
        try
        {
            anInt1189++;
            method110(true, true);
            method50(false, true);
            method110(true, false);
            method50(false, false);
            method69(aByte1098);
            method114(-249);
            if(!aBoolean829)
            {
                int j = anInt929;
                if(anInt1239 / 256 > j)
                {
                    j = anInt1239 / 256;
                }
                if(aBooleanArray1209[4] && anIntArray1206[4] + 128 > j)
                {
                    j = anIntArray1206[4] + 128;
                }
                int l = anInt930 + anInt1106 & 0x7ff;
                method138(600 + j * 3, (byte)6, l, method51(false, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615, anInt1155) - 50, anInt1082, anInt1081, j);
            }
            int k;
            if(!aBoolean829)
            {
                k = method126((byte)2);
            } else
            {
                k = method127((byte)7);
            }
            int i1 = anInt875;
            int j1 = anInt876;
            int k1 = anInt877;
            int l1 = anInt878;
            int i2 = anInt879;
            for(int j2 = 0; j2 < 5; j2++)
            {
                if(aBooleanArray1209[j2])
                {
                    int k2 = (int)((Math.random() * (double)(anIntArray976[j2] * 2 + 1) - (double)anIntArray976[j2]) + Math.sin((double)anIntArray1001[j2] * ((double)anIntArray943[j2] / 100D)) * (double)anIntArray1206[j2]);
                    if(j2 == 0)
                    {
                        anInt875 += k2;
                    }
                    if(j2 == 1)
                    {
                        anInt876 += k2;
                    }
                    if(j2 == 2)
                    {
                        anInt877 += k2;
                    }
                    if(j2 == 3)
                    {
                        anInt879 = anInt879 + k2 & 0x7ff;
                    }
                    if(j2 == 4)
                    {
                        anInt878 += k2;
                        if(anInt878 < 128)
                        {
                            anInt878 = 128;
                        }
                        if(anInt878 > 383)
                        {
                            anInt878 = 383;
                        }
                    }
                }
            }
            int l2 = Class44_Sub3_Sub1_Sub1.anInt1438;
            Class44_Sub3_Sub4_Sub4.aBoolean1593 = true;
            Class44_Sub3_Sub4_Sub4.anInt1596 = 0;
            if(i != 0)
            {
                return;
            } else
            {
                Class44_Sub3_Sub4_Sub4.anInt1594 = super.anInt21 - 4;
                Class44_Sub3_Sub4_Sub4.anInt1595 = super.anInt22 - 4;
                Class44_Sub3_Sub1.method409((byte)127);
                aClass36_1192.method317(anInt875, 7, anInt878, anInt877, k, anInt876, anInt879);
                aClass36_1192.method292(true);
                method61(1);
                method136(anInt1019);
                method62(l2, (byte)-12);
                method16(-8033);
                aClass34_1197.method273(-781, 4, 4, super.aGraphics13);
                anInt875 = i1;
                anInt876 = j1;
                anInt877 = k1;
                anInt878 = l1;
                anInt879 = i2;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("19860, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method44(long l, int i)
    {
        try
        {
            if(i != 37517)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            if(l == 0L)
            {
                return;
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    anInt1104--;
                    aBoolean898 = true;
                    for(int k = j; k < anInt1104; k++)
                    {
                        aStringArray1044[k] = aStringArray1044[k + 1];
                        anIntArray894[k] = anIntArray894[k + 1];
                        aLongArray979[k] = aLongArray979[k + 1];
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 203);
                    aClass44_Sub3_Sub2_850.method478(l, true);
                    return;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("67342, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method45(int i)
    {
        try
        {
            while(i >= 0)
            {
                aClass44_Sub3_Sub2_850.method472(139);
            }
            if(anInt1017 == 0)
            {
                return;
            }
            int j = 0;
            if(anInt998 != 0)
            {
                j = 1;
            }
            for(int k = 0; k < 100; k++)
            {
                if(aStringArray1004[k] != null)
                {
                    int l = anIntArray1002[k];
                    String s = aStringArray1003[k];
                    boolean flag = false;
                    if(s != null && s.startsWith("@cr1@"))
                    {
                        s = s.substring(5);
                        boolean flag1 = true;
                    }
                    if(s != null && s.startsWith("@cr2@"))
                    {
                        s = s.substring(5);
                        byte byte0 = 2;
                    }
                    if((l == 3 || l == 7) && (l == 7 || anInt895 == 0 || anInt895 == 1 && method80(s, 3)))
                    {
                        int i1 = 329 - j * 13;
                        if(super.anInt21 > 4 && super.anInt22 - 4 > i1 - 10 && super.anInt22 - 4 <= i1 + 3)
                        {
                            int j1 = aClass44_Sub3_Sub1_Sub4_1256.method457("From:  " + s + aStringArray1004[k], true) + 25;
                            if(j1 > 450)
                            {
                                j1 = 450;
                            }
                            if(super.anInt21 < 4 + j1)
                            {
                                if(anInt1188 >= 1)
                                {
                                    aStringArray897[anInt971] = "Report abuse @whi@" + s;
                                    anIntArray839[anInt971] = 2524;
                                    anInt971++;
                                }
                                aStringArray897[anInt971] = "Add ignore @whi@" + s;
                                anIntArray839[anInt971] = 2047;
                                anInt971++;
                                aStringArray897[anInt971] = "Add friend @whi@" + s;
                                anIntArray839[anInt971] = 2605;
                                anInt971++;
                            }
                        }
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if((l == 5 || l == 6) && anInt895 < 2 && ++j >= 5)
                    {
                        return;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("41007, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String getParameter(String s)
    {
        if(Signlink.mainapp != null)
        {
            return Signlink.mainapp.getParameter(s);
        } else
        {
            return super.getParameter(s);
        }
    }

    public void method46(int i, byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2, int j, Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1)
    {
        try
        {
            if(byte0 != -106)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            if((i & 1) == 1)
            {
                int l = class44_sub3_sub2.method482();
                byte abyte0[] = new byte[l];
                Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(abyte0, 15787);
                class44_sub3_sub2.method491((byte)95, abyte0, 0, l);
                aClass44_Sub3_Sub2Array1230[j] = class44_sub3_sub2_1;
                class44_sub3_sub4_sub6_sub1.method537(false, class44_sub3_sub2_1);
            }
            if((i & 2) == 2)
            {
                int i1 = class44_sub3_sub2.method484();
                if(i1 == 65535)
                {
                    i1 = -1;
                }
                if(i1 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1643)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1647 = 0;
                }
                int j2 = class44_sub3_sub2.method482();
                if(i1 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1643 && i1 != -1)
                {
                    int j3 = Class26.aClass26Array508[i1].anInt522;
                    if(j3 == 1)
                    {
                        class44_sub3_sub4_sub6_sub1.anInt1644 = 0;
                        class44_sub3_sub4_sub6_sub1.anInt1645 = 0;
                        class44_sub3_sub4_sub6_sub1.anInt1646 = j2;
                        class44_sub3_sub4_sub6_sub1.anInt1647 = 0;
                    }
                    if(j3 == 2)
                    {
                        class44_sub3_sub4_sub6_sub1.anInt1647 = 0;
                    }
                } else
                if(i1 == -1 || ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1643 == -1 || Class26.aClass26Array508[i1].anInt516 >= Class26.aClass26Array508[((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1643].anInt516)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1643 = i1;
                    class44_sub3_sub4_sub6_sub1.anInt1644 = 0;
                    class44_sub3_sub4_sub6_sub1.anInt1645 = 0;
                    class44_sub3_sub4_sub6_sub1.anInt1646 = j2;
                    class44_sub3_sub4_sub6_sub1.anInt1647 = 0;
                    class44_sub3_sub4_sub6_sub1.anInt1669 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1664;
                }
            }
            if((i & 4) == 4)
            {
                class44_sub3_sub4_sub6_sub1.anInt1637 = class44_sub3_sub2.method484();
                if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1637 == 65535)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1637 = -1;
                }
            }
            if((i & 8) == 8)
            {
                class44_sub3_sub4_sub6_sub1.aString1627 = class44_sub3_sub2.method489();
                if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).aString1627.charAt(0) == '~')
                {
                    class44_sub3_sub4_sub6_sub1.aString1627 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).aString1627.substring(1);
                    method17(2, (byte)-115, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).aString1627, class44_sub3_sub4_sub6_sub1.aString1672);
                } else
                if(class44_sub3_sub4_sub6_sub1 == aClass44_Sub3_Sub4_Sub6_Sub1_1047)
                {
                    method17(2, (byte)-115, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).aString1627, class44_sub3_sub4_sub6_sub1.aString1672);
                }
                class44_sub3_sub4_sub6_sub1.anInt1629 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1630 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1628 = 150;
            }
            if((i & 0x10) == 16)
            {
                int j1 = class44_sub3_sub2.method482();
                int k2 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.method536(k2, anInt1240, j1, false);
                class44_sub3_sub4_sub6_sub1.anInt1634 = anInt1240 + 300;
                class44_sub3_sub4_sub6_sub1.anInt1635 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1636 = class44_sub3_sub2.method482();
            }
            if((i & 0x20) == 32)
            {
                class44_sub3_sub4_sub6_sub1.anInt1638 = class44_sub3_sub2.method484();
                class44_sub3_sub4_sub6_sub1.anInt1639 = class44_sub3_sub2.method484();
            }
            if((i & 0x40) == 64)
            {
                int k1 = class44_sub3_sub2.method484();
                int l2 = class44_sub3_sub2.method482();
                int k3 = class44_sub3_sub2.method482();
                int l3 = class44_sub3_sub2.anInt1392;
                if(class44_sub3_sub4_sub6_sub1.aString1672 != null && class44_sub3_sub4_sub6_sub1.aBoolean1673)
                {
                    long l4 = Class48.method550(class44_sub3_sub4_sub6_sub1.aString1672);
                    boolean flag = false;
                    if(l2 <= 1)
                    {
                        for(int i4 = 0; i4 < anInt957; i4++)
                        {
                            if(aLongArray1254[i4] != l4)
                            {
                                continue;
                            }
                            flag = true;
                            break;
                        }
                    }
                    if(!flag && anInt1245 == 0)
                    {
                        try
                        {
                            String s = Class49.method556((byte)-94, class44_sub3_sub2, k3);
                            s = Class41.method352(s, anInt1242);
                            class44_sub3_sub4_sub6_sub1.aString1627 = s;
                            class44_sub3_sub4_sub6_sub1.anInt1629 = k1 >> 8;
                            class44_sub3_sub4_sub6_sub1.anInt1630 = k1 & 0xff;
                            class44_sub3_sub4_sub6_sub1.anInt1628 = 150;
                            if(l2 == 2 || l2 == 3)
                            {
                                method17(1, (byte)-115, s, "@cr2@" + class44_sub3_sub4_sub6_sub1.aString1672);
                            } else
                            if(l2 == 1)
                            {
                                method17(1, (byte)-115, s, "@cr1@" + class44_sub3_sub4_sub6_sub1.aString1672);
                            } else
                            {
                                method17(2, (byte)-115, s, class44_sub3_sub4_sub6_sub1.aString1672);
                            }
                        }
                        catch(Exception exception)
                        {
                            Signlink.reporterror("cde2");
                        }
                    }
                }
                class44_sub3_sub2.anInt1392 = l3 + k3;
            }
            if((i & 0x100) == 256)
            {
                class44_sub3_sub4_sub6_sub1.anInt1648 = class44_sub3_sub2.method484();
                int l1 = class44_sub3_sub2.method487();
                class44_sub3_sub4_sub6_sub1.anInt1652 = l1 >> 16;
                class44_sub3_sub4_sub6_sub1.anInt1651 = anInt1240 + (l1 & 0xffff);
                class44_sub3_sub4_sub6_sub1.anInt1649 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1650 = 0;
                if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1651 > anInt1240)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1649 = -1;
                }
                if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1648 == 65535)
                {
                    class44_sub3_sub4_sub6_sub1.anInt1648 = -1;
                }
            }
            if((i & 0x200) == 512)
            {
                class44_sub3_sub4_sub6_sub1.anInt1653 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1655 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1654 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1656 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1657 = class44_sub3_sub2.method484() + anInt1240;
                class44_sub3_sub4_sub6_sub1.anInt1658 = class44_sub3_sub2.method484() + anInt1240;
                class44_sub3_sub4_sub6_sub1.anInt1659 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.method534(false);
            }
            if((i & 0x400) == 1024)
            {
                int i2 = class44_sub3_sub2.method482();
                int i3 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.method536(i3, anInt1240, i2, false);
                class44_sub3_sub4_sub6_sub1.anInt1634 = anInt1240 + 300;
                class44_sub3_sub4_sub6_sub1.anInt1635 = class44_sub3_sub2.method482();
                class44_sub3_sub4_sub6_sub1.anInt1636 = class44_sub3_sub2.method482();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("71941, " + i + ", " + byte0 + ", " + class44_sub3_sub2 + ", " + j + ", " + class44_sub3_sub4_sub6_sub1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method47(int i)
    {
        try
        {
            if(i <= 0)
            {
                anInt1170 = -1;
            }
            aClass34_1198.method272((byte)5);
            Class44_Sub3_Sub1_Sub1.anIntArray1429 = anIntArray914;
            aClass44_Sub3_Sub1_Sub3_1145.method453(0, aByte1213, 0);
            if(aBoolean1222)
            {
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, aString1102, -31546, 0, 40);
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, aString1007 + "*", -31546, 128, 60);
            } else
            if(aBoolean980)
            {
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, "Enter amount:", -31546, 0, 40);
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, aString1092 + "*", -31546, 128, 60);
            } else
            if(aString823 != null)
            {
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, aString823, -31546, 0, 40);
                aClass44_Sub3_Sub1_Sub4_1257.method455(239, "Click to continue", -31546, 128, 60);
            } else
            if(anInt1253 != -1)
            {
                method37(6, 0, 0, Class5.aClass5Array100[anInt1253], 0);
            } else
            if(anInt965 != -1)
            {
                method37(6, 0, 0, Class5.aClass5Array100[anInt965], 0);
            } else
            {
                Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = aClass44_Sub3_Sub1_Sub4_1256;
                int j = 0;
                Class44_Sub3_Sub1.method408(aByte977, 77, 463, 0, 0);
                for(int k = 0; k < 100; k++)
                {
                    if(aStringArray1004[k] != null)
                    {
                        int l = anIntArray1002[k];
                        int i1 = (70 - j * 14) + anInt1103;
                        String s1 = aStringArray1003[k];
                        byte byte0 = 0;
                        if(s1 != null && s1.startsWith("@cr1@"))
                        {
                            s1 = s1.substring(5);
                            byte0 = 1;
                        }
                        if(s1 != null && s1.startsWith("@cr2@"))
                        {
                            s1 = s1.substring(5);
                            byte0 = 2;
                        }
                        if(l == 0)
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                class44_sub3_sub1_sub4.method459((byte)-104, 0, aStringArray1004[k], 4, i1);
                            }
                            j++;
                        }
                        if((l == 1 || l == 2) && (l == 1 || anInt843 == 0 || anInt843 == 1 && method80(s1, 3)))
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                int j1 = 4;
                                if(byte0 == 1)
                                {
                                    aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, j1);
                                    j1 += 14;
                                }
                                if(byte0 == 2)
                                {
                                    aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, j1);
                                    j1 += 14;
                                }
                                class44_sub3_sub1_sub4.method459((byte)-104, 0, s1 + ":", j1, i1);
                                j1 += class44_sub3_sub1_sub4.method457(s1, true) + 8;
                                class44_sub3_sub1_sub4.method459((byte)-104, 255, aStringArray1004[k], j1, i1);
                            }
                            j++;
                        }
                        if((l == 3 || l == 7) && anInt1017 == 0 && (l == 7 || anInt895 == 0 || anInt895 == 1 && method80(s1, 3)))
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                int k1 = 4;
                                class44_sub3_sub1_sub4.method459((byte)-104, 0, "From", k1, i1);
                                k1 += class44_sub3_sub1_sub4.method457("From ", true);
                                if(byte0 == 1)
                                {
                                    aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, k1);
                                    k1 += 14;
                                }
                                if(byte0 == 2)
                                {
                                    aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, k1);
                                    k1 += 14;
                                }
                                class44_sub3_sub1_sub4.method459((byte)-104, 0, s1 + ":", k1, i1);
                                k1 += class44_sub3_sub1_sub4.method457(s1, true) + 8;
                                class44_sub3_sub1_sub4.method459((byte)-104, 0x800000, aStringArray1004[k], k1, i1);
                            }
                            j++;
                        }
                        if(l == 4 && (anInt1168 == 0 || anInt1168 == 1 && method80(s1, 3)))
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                class44_sub3_sub1_sub4.method459((byte)-104, 0x800080, s1 + " " + aStringArray1004[k], 4, i1);
                            }
                            j++;
                        }
                        if(l == 5 && anInt1017 == 0 && anInt895 < 2)
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                class44_sub3_sub1_sub4.method459((byte)-104, 0x800000, aStringArray1004[k], 4, i1);
                            }
                            j++;
                        }
                        if(l == 6 && anInt1017 == 0 && anInt895 < 2)
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                class44_sub3_sub1_sub4.method459((byte)-104, 0, "To " + s1 + ":", 4, i1);
                                class44_sub3_sub1_sub4.method459((byte)-104, 0x800000, aStringArray1004[k], 12 + class44_sub3_sub1_sub4.method457("To " + s1, true), i1);
                            }
                            j++;
                        }
                        if(l == 8 && (anInt1168 == 0 || anInt1168 == 1 && method80(s1, 3)))
                        {
                            if(i1 > 0 && i1 < 110)
                            {
                                class44_sub3_sub1_sub4.method459((byte)-104, 0x7e3200, s1 + " " + aStringArray1004[k], 4, i1);
                            }
                            j++;
                        }
                    }
                }
                Class44_Sub3_Sub1.method407((byte)-92);
                anInt874 = j * 14 + 7;
                if(anInt874 < 78)
                {
                    anInt874 = 78;
                }
                method21(0, 463, anInt874 - anInt1103 - 77, anInt874, 77, 3);
                String s;
                if(aClass44_Sub3_Sub4_Sub6_Sub1_1047 != null && aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672 != null)
                {
                    s = aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672;
                } else
                {
                    s = Class48.method554(aString1071, true);
                }
                class44_sub3_sub1_sub4.method459((byte)-104, 0, s + ":", 4, 90);
                class44_sub3_sub1_sub4.method459((byte)-104, 255, aString1141 + "*", 6 + class44_sub3_sub1_sub4.method457(s + ": ", true), 90);
                Class44_Sub3_Sub1.method414(479, 0, 0, true, 77);
            }
            if(aBoolean946 && anInt1030 == 2)
            {
                method115(393);
            }
            aClass34_1198.method273(-781, 17, 357, super.aGraphics13);
            aClass34_1197.method272((byte)5);
            Class44_Sub3_Sub1_Sub1.anIntArray1429 = anIntArray916;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("21760, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method48(int i)
    {
        try
        {
            aClass44_Sub3_Sub1_Sub3_891 = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "titlebox", 0);
            aClass44_Sub3_Sub1_Sub3_892 = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "titlebutton", 0);
            aClass44_Sub3_Sub1_Sub3Array864 = new Class44_Sub3_Sub1_Sub3[12];
            int j = 0;
            try
            {
                j = Integer.parseInt(getParameter("fl_icon"));
            }
            catch(Exception _ex)
            {
            }
            if(j == 0)
            {
                for(int k = 0; k < 12; k++)
                {
                    aClass44_Sub3_Sub1_Sub3Array864[k] = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "runes", k);
                }
            } else
            {
                for(int l = 0; l < 12; l++)
                {
                    aClass44_Sub3_Sub1_Sub3Array864[l] = new Class44_Sub3_Sub1_Sub3(aClass47_1117, "runes", 12 + (l & 3));
                }
            }
            aClass44_Sub3_Sub1_Sub2_1277 = new Class44_Sub3_Sub1_Sub2(128, 265);
            if(i >= 0)
            {
                return;
            }
            aClass44_Sub3_Sub1_Sub2_1278 = new Class44_Sub3_Sub1_Sub2(128, 265);
            for(int i1 = 0; i1 < 33920; i1++)
            {
                aClass44_Sub3_Sub1_Sub2_1277.anIntArray1448[i1] = aClass34_1266.anIntArray582[i1];
            }
            for(int j1 = 0; j1 < 33920; j1++)
            {
                aClass44_Sub3_Sub1_Sub2_1278.anIntArray1448[j1] = aClass34_1267.anIntArray582[j1];
            }
            anIntArray1219 = new int[256];
            for(int k1 = 0; k1 < 64; k1++)
            {
                anIntArray1219[k1] = k1 * 0x40000;
            }
            for(int l1 = 0; l1 < 64; l1++)
            {
                anIntArray1219[l1 + 64] = 0xff0000 + 1024 * l1;
            }
            for(int i2 = 0; i2 < 64; i2++)
            {
                anIntArray1219[i2 + 128] = 0xffff00 + 4 * i2;
            }
            for(int j2 = 0; j2 < 64; j2++)
            {
                anIntArray1219[j2 + 192] = 0xffffff;
            }
            anIntArray1220 = new int[256];
            for(int k2 = 0; k2 < 64; k2++)
            {
                anIntArray1220[k2] = k2 * 1024;
            }
            for(int l2 = 0; l2 < 64; l2++)
            {
                anIntArray1220[l2 + 64] = 65280 + 4 * l2;
            }
            for(int i3 = 0; i3 < 64; i3++)
            {
                anIntArray1220[i3 + 128] = 65535 + 0x40000 * i3;
            }
            for(int j3 = 0; j3 < 64; j3++)
            {
                anIntArray1220[j3 + 192] = 0xffffff;
            }
            anIntArray1221 = new int[256];
            for(int k3 = 0; k3 < 64; k3++)
            {
                anIntArray1221[k3] = k3 * 4;
            }
            for(int l3 = 0; l3 < 64; l3++)
            {
                anIntArray1221[l3 + 64] = 255 + 0x40000 * l3;
            }
            for(int i4 = 0; i4 < 64; i4++)
            {
                anIntArray1221[i4 + 128] = 0xff00ff + 1024 * i4;
            }
            for(int j4 = 0; j4 < 64; j4++)
            {
                anIntArray1221[j4 + 192] = 0xffffff;
            }
            anIntArray1218 = new int[256];
            anIntArray1133 = new int[32768];
            anIntArray1134 = new int[32768];
            method109(null, 34809);
            anIntArray1272 = new int[32768];
            anIntArray1273 = new int[32768];
            method13(false, 10, "Connecting to fileserver");
            if(!aBoolean1174)
            {
                aBoolean886 = true;
                aBoolean1174 = true;
                method12(this, 2);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("92179, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method49(byte byte0)
    {
        try
        {
            if(byte0 != aByte1101)
            {
                aBoolean1178 = !aBoolean1178;
            }
            try
            {
                int i = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 + anInt1011;
                int j = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 + anInt1215;
                if(anInt1081 - i < -500 || anInt1081 - i > 500 || anInt1082 - j < -500 || anInt1082 - j > 500)
                {
                    anInt1081 = i;
                    anInt1082 = j;
                }
                if(anInt1081 != i)
                {
                    anInt1081 += (i - anInt1081) / 16;
                }
                if(anInt1082 != j)
                {
                    anInt1082 += (j - anInt1082) / 16;
                }
                if(super.anIntArray31[1] == 1)
                {
                    anInt931 += (-24 - anInt931) / 2;
                } else
                if(super.anIntArray31[2] == 1)
                {
                    anInt931 += (24 - anInt931) / 2;
                } else
                {
                    anInt931 /= 2;
                }
                if(super.anIntArray31[3] == 1)
                {
                    anInt932 += (12 - anInt932) / 2;
                } else
                if(super.anIntArray31[4] == 1)
                {
                    anInt932 += (-12 - anInt932) / 2;
                } else
                {
                    anInt932 /= 2;
                }
                anInt930 = anInt930 + anInt931 / 2 & 0x7ff;
                anInt929 += anInt932 / 2;
                if(anInt929 < 128)
                {
                    anInt929 = 128;
                }
                if(anInt929 > 383)
                {
                    anInt929 = 383;
                }
                int k = anInt1081 >> 7;
                int l = anInt1082 >> 7;
                int i1 = method51(false, anInt1082, anInt1081, anInt1155);
                int j1 = 0;
                if(k > 3 && l > 3 && k < 100 && l < 100)
                {
                    for(int k1 = k - 4; k1 <= k + 4; k1++)
                    {
                        for(int i2 = l - 4; i2 <= l + 4; i2++)
                        {
                            int j2 = anInt1155;
                            if(j2 < 3 && (aByteArrayArrayArray871[1][k1][i2] & 2) == 2)
                            {
                                j2++;
                            }
                            int k2 = i1 - anIntArrayArrayArray865[j2][k1][i2];
                            if(k2 > j1)
                            {
                                j1 = k2;
                            }
                        }
                    }
                }
                int l1 = j1 * 192;
                if(l1 > 0x17f00)
                {
                    l1 = 0x17f00;
                }
                if(l1 < 32768)
                {
                    l1 = 32768;
                }
                if(l1 > anInt1239)
                {
                    anInt1239 += (l1 - anInt1239) / 24;
                    return;
                }
                if(l1 < anInt1239)
                {
                    anInt1239 += (l1 - anInt1239) / 80;
                    return;
                }
            }
            catch(Exception _ex)
            {
                Signlink.reporterror("glfc_ex " + ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 + "," + ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 + "," + anInt1081 + "," + anInt1082 + "," + anInt841 + "," + anInt842 + "," + anInt1184 + "," + anInt1185);
                throw new RuntimeException("eek");
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("96812, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method50(boolean flag, boolean flag1)
    {
        try
        {
            for(int i = 0; i < anInt1009; i++)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[i]];
                int j = 0x20000000 + (anIntArray1010[i] << 14);
                if(class44_sub3_sub4_sub6_sub2 == null || !class44_sub3_sub4_sub6_sub2.method535(true) || class44_sub3_sub4_sub6_sub2.aClass12_1700.aBoolean302 != flag1)
                {
                    continue;
                }
                int k = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 >> 7;
                int l = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 >> 7;
                if(k < 0 || k >= 104 || l < 0 || l >= 104)
                {
                    continue;
                }
                if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1619 == 1 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 & 0x7f) == 64 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 & 0x7f) == 64)
                {
                    if(anIntArrayArray885[k][l] == anInt1189)
                    {
                        continue;
                    }
                    anIntArrayArray885[k][l] = anInt1189;
                }
                aClass36_1192.method289((((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1619 - 1) * 64 + 60, j, method51(false, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615, anInt1155), ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615, 384, class44_sub3_sub4_sub6_sub2, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1617, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).aBoolean1618, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616, anInt1155);
            }
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("10709, " + flag + ", " + flag1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method51(boolean flag, int i, int j, int k)
    {
        try
        {
            int l = j >> 7;
            int i1 = i >> 7;
            if(l < 0 || i1 < 0 || l > 103 || i1 > 103)
            {
                return 0;
            }
            int j1 = k;
            if(j1 < 3 && (aByteArrayArrayArray871[1][l][i1] & 2) == 2)
            {
                j1++;
            }
            int k1 = j & 0x7f;
            int l1 = i & 0x7f;
            int i2 = anIntArrayArrayArray865[j1][l][i1] * (128 - k1) + anIntArrayArrayArray865[j1][l + 1][i1] * k1 >> 7;
            if(flag)
            {
                return 3;
            } else
            {
                int j2 = anIntArrayArrayArray865[j1][l][i1 + 1] * (128 - k1) + anIntArrayArrayArray865[j1][l + 1][i1 + 1] * k1 >> 7;
                return i2 * (128 - l1) + j2 * l1 >> 7;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("38676, " + flag + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method52(int i)
    {
        try
        {
            if(i <= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            if(anInt971 < 2 && anInt952 == 0 && anInt994 == 0)
            {
                return;
            }
            String s;
            if(anInt952 == 1 && anInt971 < 2)
            {
                s = "Use " + aString956 + " with...";
            } else
            if(anInt994 == 1 && anInt971 < 2)
            {
                s = aString997 + "...";
            } else
            {
                s = aStringArray897[anInt971 - 1];
            }
            if(anInt971 > 2)
            {
                s = s + "@whi@ / " + (anInt971 - 2) + " more options";
            }
            aClass44_Sub3_Sub1_Sub4_1257.method464(s, true, 0xffffff, 26617, 4, anInt1240 / 1000, 15);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20355, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method53(int i)
    {
        try
        {
            if(i < 9 || i > 9)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            Graphics g = method11(7).getGraphics();
            g.setColor(Color.black);
            g.fillRect(0, 0, 765, 503);
            method4(1, 711);
            if(aBoolean1055)
            {
                aBoolean1174 = false;
                g.setFont(new Font("Helvetica", 1, 16));
                g.setColor(Color.yellow);
                int k = 35;
                g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, k);
                k += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, k);
                k += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, k);
                k += 30;
                g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, k);
                k += 30;
                g.drawString("3: Try using a different game-world", 30, k);
                k += 30;
                g.drawString("4: Try rebooting your computer", 30, k);
                k += 30;
                g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, k);
            }
            if(aBoolean820)
            {
                aBoolean1174 = false;
                g.setFont(new Font("Helvetica", 1, 20));
                g.setColor(Color.white);
                g.drawString("Error - unable to load game!", 50, 50);
                g.drawString("To play RuneScape make sure you play from", 50, 100);
                g.drawString("http://www.runescape.com", 50, 150);
            }
            if(aBoolean1236)
            {
                aBoolean1174 = false;
                g.setColor(Color.yellow);
                int l = 35;
                g.drawString("Error a copy of RuneScape already appears to be loaded", 30, l);
                l += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, l);
                l += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, l);
                l += 30;
                g.drawString("2: Try rebooting your computer, and reloading", 30, l);
                l += 30;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("39122, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method54(byte byte0)
    {
        try
        {
            if(anInt1095 != 0)
            {
                return;
            }
            aStringArray897[0] = "Cancel";
            anIntArray839[0] = 1106;
            if(byte0 == 6)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            anInt971 = 1;
            method45(-113);
            anInt825 = 0;
            if(super.anInt21 > 4 && super.anInt22 > 4 && super.anInt21 < 516 && super.anInt22 < 338)
            {
                if(anInt1199 != -1)
                {
                    method30(4, 0, super.anInt21, Class5.aClass5Array100[anInt1199], 4, super.anInt22, 792);
                } else
                {
                    method135(true);
                }
            }
            if(anInt825 != anInt999)
            {
                anInt999 = anInt825;
            }
            anInt825 = 0;
            if(super.anInt21 > 553 && super.anInt22 > 205 && super.anInt21 < 743 && super.anInt22 < 466)
            {
                if(anInt889 != -1)
                {
                    method30(553, 0, super.anInt21, Class5.aClass5Array100[anInt889], 205, super.anInt22, 792);
                } else
                if(anIntArray1060[anInt1027] != -1)
                {
                    method30(553, 0, super.anInt21, Class5.aClass5Array100[anIntArray1060[anInt1027]], 205, super.anInt22, 792);
                }
            }
            if(anInt825 != anInt933)
            {
                aBoolean898 = true;
                anInt933 = anInt825;
            }
            anInt825 = 0;
            if(super.anInt21 > 17 && super.anInt22 > 357 && super.anInt21 < 496 && super.anInt22 < 453)
            {
                if(anInt1253 != -1)
                {
                    method30(17, 0, super.anInt21, Class5.aClass5Array100[anInt1253], 357, super.anInt22, 792);
                } else
                if(super.anInt22 < 434 && super.anInt21 < 426)
                {
                    method111(super.anInt21 - 17, (byte)7, super.anInt22 - 357);
                }
            }
            if(anInt1253 != -1 && anInt825 != anInt1212)
            {
                aBoolean1049 = true;
                anInt1212 = anInt825;
            }
            for(boolean flag = false; !flag;)
            {
                flag = true;
                for(int i = 0; i < anInt971 - 1; i++)
                {
                    if(anIntArray839[i] < 1000 && anIntArray839[i + 1] > 1000)
                    {
                        String s = aStringArray897[i];
                        aStringArray897[i] = aStringArray897[i + 1];
                        aStringArray897[i + 1] = s;
                        int j = anIntArray839[i];
                        anIntArray839[i] = anIntArray839[i + 1];
                        anIntArray839[i + 1] = j;
                        j = anIntArray837[i];
                        anIntArray837[i] = anIntArray837[i + 1];
                        anIntArray837[i + 1] = j;
                        j = anIntArray838[i];
                        anIntArray838[i] = anIntArray838[i + 1];
                        anIntArray838[i + 1] = j;
                        j = anIntArray840[i];
                        anIntArray840[i] = anIntArray840[i + 1];
                        anIntArray840[i + 1] = j;
                        flag = false;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("40244, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method55(byte byte0, long l)
    {
        try
        {
            if(l == 0L)
            {
                return;
            }
            if(anInt957 >= 100)
            {
                method17(0, (byte)-115, "Your ignore list is full. Max of 100 hit", "");
                return;
            }
            String s = Class48.method554(Class48.method551(l, true), true);
            for(int i = 0; i < anInt957; i++)
            {
                if(aLongArray1254[i] == l)
                {
                    method17(0, (byte)-115, s + " is already on your ignore list", "");
                    return;
                }
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    method17(0, (byte)-115, "Please remove " + s + " from your friend list first", "");
                    return;
                }
            }
            aLongArray1254[anInt957++] = l;
            if(byte0 != -37)
            {
                aClass44_Sub3_Sub2_850.method472(42);
            }
            aBoolean898 = true;
            aClass44_Sub3_Sub2_850.method471(-34003, 192);
            aClass44_Sub3_Sub2_850.method478(l, true);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("6582, " + byte0 + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void main(String args[])
    {
        try
        {
            System.out.println("RS2 user client - release #" + 289);
            if(args.length != 5)
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            anInt1232 = Integer.parseInt(args[0]);
            anInt1233 = Integer.parseInt(args[1]);
            if(args[2].equals("lowmem"))
            {
                method131(aByte1194);
            } else
            if(args[2].equals("highmem"))
            {
                method64(true);
            } else
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            if(args[3].equals("free"))
            {
                aBoolean1234 = false;
            } else
            if(args[3].equals("members"))
            {
                aBoolean1234 = true;
            } else
            {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            Signlink.storeid = Integer.parseInt(args[4]);
            Signlink.startpriv(InetAddress.getLocalHost());
            Game client1 = new Game();
            client1.method1(503, 765, 0);
            client1.loadRSAKeys();
            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    public void method56(int i)
    {
        try
        {
            if(anInt998 > 1)
            {
                anInt998--;
            }
            if(anInt1173 > 0)
            {
                anInt1173--;
            }
            for(int j = 0; j < 5; j++)
            {
                if(!method31(true))
                {
                    break;
                }
            }
            if(!aBoolean863)
            {
                return;
            }
            synchronized(aClass10_866.anObject258)
            {
                if(aBoolean937)
                {
                    if(super.anInt27 != 0 || aClass10_866.anInt259 >= 40)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 229);
                        aClass44_Sub3_Sub2_850.method472(0);
                        int j2 = aClass44_Sub3_Sub2_850.anInt1392;
                        int j3 = 0;
                        for(int j4 = 0; j4 < aClass10_866.anInt259; j4++)
                        {
                            if(j2 - aClass44_Sub3_Sub2_850.anInt1392 >= 240)
                            {
                                break;
                            }
                            j3++;
                            int l4 = aClass10_866.anIntArray261[j4];
                            if(l4 < 0)
                            {
                                l4 = 0;
                            } else
                            if(l4 > 502)
                            {
                                l4 = 502;
                            }
                            int k5 = aClass10_866.anIntArray260[j4];
                            if(k5 < 0)
                            {
                                k5 = 0;
                            } else
                            if(k5 > 764)
                            {
                                k5 = 764;
                            }
                            int i6 = l4 * 765 + k5;
                            if(aClass10_866.anIntArray261[j4] == -1 && aClass10_866.anIntArray260[j4] == -1)
                            {
                                k5 = -1;
                                l4 = -1;
                                i6 = 0x7ffff;
                            }
                            if(k5 == anInt887 && l4 == anInt888)
                            {
                                if(anInt819 < 2047)
                                {
                                    anInt819++;
                                }
                            } else
                            {
                                int j6 = k5 - anInt887;
                                anInt887 = k5;
                                int k6 = l4 - anInt888;
                                anInt888 = l4;
                                if(anInt819 < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31)
                                {
                                    j6 += 32;
                                    k6 += 32;
                                    aClass44_Sub3_Sub2_850.method473((anInt819 << 12) + (j6 << 6) + k6);
                                    anInt819 = 0;
                                } else
                                if(anInt819 < 8)
                                {
                                    aClass44_Sub3_Sub2_850.method475(0x800000 + (anInt819 << 19) + i6);
                                    anInt819 = 0;
                                } else
                                {
                                    aClass44_Sub3_Sub2_850.method476(0xc0000000 + (anInt819 << 19) + i6);
                                    anInt819 = 0;
                                }
                            }
                        }
                        aClass44_Sub3_Sub2_850.method481(aClass44_Sub3_Sub2_850.anInt1392 - j2, anInt1152);
                        if(j3 >= aClass10_866.anInt259)
                        {
                            aClass10_866.anInt259 = 0;
                        } else
                        {
                            aClass10_866.anInt259 -= j3;
                            for(int i5 = 0; i5 < aClass10_866.anInt259; i5++)
                            {
                                aClass10_866.anIntArray260[i5] = aClass10_866.anIntArray260[i5 + j3];
                                aClass10_866.anIntArray261[i5] = aClass10_866.anIntArray261[i5 + j3];
                            }
                        }
                    }
                } else
                {
                    aClass10_866.anInt259 = 0;
                }
            }
            if(super.anInt27 != 0)
            {
                long l = (super.aLong30 - aLong1181) / 50L;
                if(l > 4095L)
                {
                    l = 4095L;
                }
                aLong1181 = super.aLong30;
                int k2 = super.anInt29;
                if(k2 < 0)
                {
                    k2 = 0;
                } else
                if(k2 > 502)
                {
                    k2 = 502;
                }
                int k3 = super.anInt28;
                if(k3 < 0)
                {
                    k3 = 0;
                } else
                if(k3 > 764)
                {
                    k3 = 764;
                }
                int k4 = k2 * 765 + k3;
                int j5 = 0;
                if(super.anInt27 == 2)
                {
                    j5 = 1;
                }
                int l5 = (int)l;
                aClass44_Sub3_Sub2_850.method471(-34003, 224);
                aClass44_Sub3_Sub2_850.method476((l5 << 20) + (j5 << 19) + k4);
            }
            if(anInt1083 > 0)
            {
                anInt1083--;
            }
            if(super.anIntArray31[1] == 1 || super.anIntArray31[2] == 1 || super.anIntArray31[3] == 1 || super.anIntArray31[4] == 1)
            {
                aBoolean1084 = true;
            }
            if(aBoolean1084 && anInt1083 <= 0)
            {
                anInt1083 = 20;
                aBoolean1084 = false;
                aClass44_Sub3_Sub2_850.method471(-34003, 193);
                aClass44_Sub3_Sub2_850.method473(anInt929);
                aClass44_Sub3_Sub2_850.method473(anInt930);
            }
            if(super.aBoolean18 && !aBoolean934)
            {
                aBoolean934 = true;
                aClass44_Sub3_Sub2_850.method471(-34003, 149);
                aClass44_Sub3_Sub2_850.method472(1);
            }
            if(!super.aBoolean18 && aBoolean934)
            {
                aBoolean934 = false;
                aClass44_Sub3_Sub2_850.method471(-34003, 149);
                aClass44_Sub3_Sub2_850.method472(0);
            }
            method38((byte)6);
            method23(845);
            method108(948);
            anInt1171++;
            if(anInt1171 > 750)
            {
                method99((byte)7);
            }
            method83((byte)5);
            method116(905);
            method20(0);
            anInt824++;
            if(anInt818 != 0)
            {
                anInt817 += 20;
                if(anInt817 >= 400)
                {
                    anInt818 = 0;
                }
            }
            if(anInt1151 != 0)
            {
                anInt1148++;
                if(anInt1148 >= 15)
                {
                    if(anInt1151 == 2)
                    {
                        aBoolean898 = true;
                    }
                    if(anInt1151 == 3)
                    {
                        aBoolean1049 = true;
                    }
                    anInt1151 = 0;
                }
            }
            if(anInt1095 != 0)
            {
                anInt978++;
                if(super.anInt21 > anInt1096 + 5 || super.anInt21 < anInt1096 - 5 || super.anInt22 > anInt1097 + 5 || super.anInt22 < anInt1097 - 5)
                {
                    aBoolean847 = true;
                }
                if(super.anInt20 == 0)
                {
                    if(anInt1095 == 2)
                    {
                        aBoolean898 = true;
                    }
                    if(anInt1095 == 3)
                    {
                        aBoolean1049 = true;
                    }
                    anInt1095 = 0;
                    if(aBoolean847 && anInt978 >= 5)
                    {
                        anInt983 = -1;
                        method54((byte)6);
                        if(anInt983 == anInt1093 && anInt982 != anInt1094)
                        {
                            Class5 class5 = Class5.aClass5Array100[anInt1093];
                            int j1 = 0;
                            if(anInt835 == 1 && class5.anInt109 == 206)
                            {
                                j1 = 1;
                            }
                            if(class5.anIntArray101[anInt982] <= 0)
                            {
                                j1 = 0;
                            }
                            if(class5.aBoolean130)
                            {
                                int l2 = anInt1094;
                                int l3 = anInt982;
                                class5.anIntArray101[l3] = class5.anIntArray101[l2];
                                class5.anIntArray102[l3] = class5.anIntArray102[l2];
                                class5.anIntArray101[l2] = -1;
                                class5.anIntArray102[l2] = 0;
                            } else
                            if(j1 == 1)
                            {
                                int i3 = anInt1094;
                                for(int i4 = anInt982; i3 != i4;)
                                {
                                    if(i3 > i4)
                                    {
                                        class5.method182(0, i3 - 1, i3);
                                        i3--;
                                    } else
                                    if(i3 < i4)
                                    {
                                        class5.method182(0, i3 + 1, i3);
                                        i3++;
                                    }
                                }
                            } else
                            {
                                class5.method182(0, anInt982, anInt1094);
                            }
                            aClass44_Sub3_Sub2_850.method471(-34003, 253);
                            aClass44_Sub3_Sub2_850.method473(anInt1093);
                            aClass44_Sub3_Sub2_850.method473(anInt1094);
                            aClass44_Sub3_Sub2_850.method473(anInt982);
                            aClass44_Sub3_Sub2_850.method472(j1);
                        }
                    } else
                    if((anInt862 == 1 || method26(anInt971 - 1, -40)) && anInt971 > 2)
                    {
                        method89(anInt899);
                    } else
                    if(anInt971 > 0)
                    {
                        method134(anInt971 - 1, 725);
                    }
                    anInt1148 = 10;
                    super.anInt27 = 0;
                }
            }
            anInt873++;
            if(anInt873 > 62)
            {
                anInt873 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 232);
            }
            if(Class36.anInt640 != -1)
            {
                int k = Class36.anInt640;
                int k1 = Class36.anInt641;
                boolean flag = method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, k1, 0, 0, true, 0, 124, 0, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                Class36.anInt640 = -1;
                if(flag)
                {
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 1;
                    anInt817 = 0;
                }
            }
            if(super.anInt27 == 1 && aString823 != null)
            {
                aString823 = null;
                aBoolean1049 = true;
                super.anInt27 = 0;
            }
            method14((byte)1);
            method143(176);
            method106(-293);
            if(i <= 0)
            {
                aClass44_Sub3_Sub2_850.method472(98);
            }
            method145((byte)9);
            if(super.anInt20 == 1 || super.anInt27 == 1)
            {
                anInt1066++;
            }
            if(anInt882 == 2)
            {
                method49((byte)6);
            }
            if(anInt882 == 2 && aBoolean829)
            {
                method132(0);
            }
            for(int i1 = 0; i1 < 5; i1++)
            {
                anIntArray1001[i1]++;
            }
            method133(anInt1074);
            super.anInt19++;
            if(super.anInt19 > 4500)
            {
                anInt1173 = 250;
                super.anInt19 -= 500;
                aClass44_Sub3_Sub2_850.method471(-34003, 145);
            }
            anInt921++;
            if(anInt921 > 500)
            {
                anInt921 = 0;
                int l1 = (int)(Math.random() * 8D);
                if((l1 & 1) == 1)
                {
                    anInt1011 += anInt1012;
                }
                if((l1 & 2) == 2)
                {
                    anInt1215 += anInt1216;
                }
                if((l1 & 4) == 4)
                {
                    anInt1106 += anInt1107;
                }
            }
            if(anInt1011 < -50)
            {
                anInt1012 = 2;
            }
            if(anInt1011 > 50)
            {
                anInt1012 = -2;
            }
            if(anInt1215 < -55)
            {
                anInt1216 = 2;
            }
            if(anInt1215 > 55)
            {
                anInt1216 = -2;
            }
            if(anInt1106 < -40)
            {
                anInt1107 = 1;
            }
            if(anInt1106 > 40)
            {
                anInt1107 = -1;
            }
            anInt907++;
            if(anInt907 > 500)
            {
                anInt907 = 0;
                int i2 = (int)(Math.random() * 8D);
                if((i2 & 1) == 1)
                {
                    anInt959 += anInt960;
                }
                if((i2 & 2) == 2)
                {
                    anInt1075 += anInt1076;
                }
            }
            if(anInt959 < -60)
            {
                anInt960 = 2;
            }
            if(anInt959 > 60)
            {
                anInt960 = -2;
            }
            if(anInt1075 < -20)
            {
                anInt1076 = 1;
            }
            if(anInt1075 > 10)
            {
                anInt1076 = -1;
            }
            anInt1172++;
            if(anInt1172 > 50)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 181);
            }
            try
            {
                if(aClass7_1099 != null && aClass44_Sub3_Sub2_850.anInt1392 > 0)
                {
                    aClass7_1099.method195(0, aClass44_Sub3_Sub2_850.aByteArray1391, 2, aClass44_Sub3_Sub2_850.anInt1392);
                    aClass44_Sub3_Sub2_850.anInt1392 = 0;
                    anInt1172 = 0;
                    return;
                }
            }
            catch(IOException _ex)
            {
                method99((byte)7);
                return;
            }
            catch(Exception exception)
            {
                method22((byte)25);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("87308, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method57(int i, byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            anInt940 = 0;
            anInt1228 = 0;
            method130(i, class44_sub3_sub2, false);
            method103(-752, class44_sub3_sub2, i);
            method90(i, class44_sub3_sub2, 0);
            method71(class44_sub3_sub2, false, i);
            for(int j = 0; j < anInt940; j++)
            {
                int k = anIntArray941[j];
                if(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k])).anInt1660 != anInt1240)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k] = null;
                }
            }
            if(byte0 != 7)
            {
                anInt1074 = 376;
            }
            if(class44_sub3_sub2.anInt1392 != i)
            {
                Signlink.reporterror("Error packet size mismatch in getplayer pos:" + class44_sub3_sub2.anInt1392 + " psize:" + i);
                throw new RuntimeException("eek");
            }
            for(int l = 0; l < anInt1226; l++)
            {
                if(aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[l]] == null)
                {
                    Signlink.reporterror(aString1071 + " null entry in pl list - pos:" + l + " size:" + anInt1226);
                    throw new RuntimeException("eek");
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("73689, " + i + ", " + byte0 + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method58(int i, Class12 class12, int j, int k, int l)
    {
        try
        {
            k = 43 / k;
            if(anInt971 >= 400)
            {
                return;
            }
            String s = class12.aString282;
            if(class12.anInt299 != 0)
            {
                s = s + method137(class12.anInt299, aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1678, -41081) + " (level-" + class12.anInt299 + ")";
            }
            if(anInt952 == 1)
            {
                aStringArray897[anInt971] = "Use " + aString956 + " with @yel@" + s;
                anIntArray839[anInt971] = 829;
                anIntArray840[anInt971] = i;
                anIntArray837[anInt971] = j;
                anIntArray838[anInt971] = l;
                anInt971++;
                return;
            }
            if(anInt994 == 1)
            {
                if((anInt996 & 2) == 2)
                {
                    aStringArray897[anInt971] = aString997 + " @yel@" + s;
                    anIntArray839[anInt971] = 240;
                    anIntArray840[anInt971] = i;
                    anIntArray837[anInt971] = j;
                    anIntArray838[anInt971] = l;
                    anInt971++;
                    return;
                }
            } else
            {
                if(class12.aStringArray294 != null)
                {
                    for(int i1 = 4; i1 >= 0; i1--)
                    {
                        if(class12.aStringArray294[i1] != null && !class12.aStringArray294[i1].equalsIgnoreCase("attack"))
                        {
                            aStringArray897[anInt971] = class12.aStringArray294[i1] + " @yel@" + s;
                            if(i1 == 0)
                            {
                                anIntArray839[anInt971] = 242;
                            }
                            if(i1 == 1)
                            {
                                anIntArray839[anInt971] = 209;
                            }
                            if(i1 == 2)
                            {
                                anIntArray839[anInt971] = 309;
                            }
                            if(i1 == 3)
                            {
                                anIntArray839[anInt971] = 852;
                            }
                            if(i1 == 4)
                            {
                                anIntArray839[anInt971] = 793;
                            }
                            anIntArray840[anInt971] = i;
                            anIntArray837[anInt971] = j;
                            anIntArray838[anInt971] = l;
                            anInt971++;
                        }
                    }
                }
                if(class12.aStringArray294 != null)
                {
                    for(int j1 = 4; j1 >= 0; j1--)
                    {
                        if(class12.aStringArray294[j1] != null && class12.aStringArray294[j1].equalsIgnoreCase("attack"))
                        {
                            char c = '\0';
                            if(class12.anInt299 > aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1678)
                            {
                                c = '\u07D0';
                            }
                            aStringArray897[anInt971] = class12.aStringArray294[j1] + " @yel@" + s;
                            if(j1 == 0)
                            {
                                anIntArray839[anInt971] = 242 + c;
                            }
                            if(j1 == 1)
                            {
                                anIntArray839[anInt971] = 209 + c;
                            }
                            if(j1 == 2)
                            {
                                anIntArray839[anInt971] = 309 + c;
                            }
                            if(j1 == 3)
                            {
                                anIntArray839[anInt971] = 852 + c;
                            }
                            if(j1 == 4)
                            {
                                anIntArray839[anInt971] = 793 + c;
                            }
                            anIntArray840[anInt971] = i;
                            anIntArray837[anInt971] = j;
                            anIntArray838[anInt971] = l;
                            anInt971++;
                        }
                    }
                }
                aStringArray897[anInt971] = "Examine @yel@" + s;
                anIntArray839[anInt971] = 1714;
                anIntArray840[anInt971] = i;
                anIntArray837[anInt971] = j;
                anIntArray838[anInt971] = l;
                anInt971++;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("53238, " + i + ", " + class12 + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method59(boolean flag, int i, boolean flag1)
    {
        try
        {
            aBoolean863 &= flag;
            Signlink.midivol = i;
            if(flag1)
            {
                Signlink.midi = "voladjust";
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20099, " + flag + ", " + i + ", " + flag1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method60(int i)
    {
        try
        {
            if(aClass34_1198 != null)
            {
                return;
            }
            method128(false);
            super.aClass34_14 = null;
            aClass34_1263 = null;
            aClass34_1264 = null;
            aClass34_1265 = null;
            aClass34_1266 = null;
            aClass34_1267 = null;
            aClass34_1268 = null;
            aClass34_1269 = null;
            aClass34_1270 = null;
            aClass34_1271 = null;
            aClass34_1198 = new Class34(method11(7), 479, 96, 2);
            aClass34_1196 = new Class34(method11(7), 172, 156, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass44_Sub3_Sub1_Sub3_1144.method453(0, aByte1213, 0);
            aClass34_1195 = new Class34(method11(7), 190, 261, 2);
            aClass34_1197 = new Class34(method11(7), 512, 334, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_858 = new Class34(method11(7), 496, 50, 2);
            aClass34_859 = new Class34(method11(7), 269, 37, 2);
            aClass34_860 = new Class34(method11(7), 249, 45, 2);
            aBoolean908 = true;
            if(i <= 0)
            {
                anInt962 = 175;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("97189, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method61(int i)
    {
        try
        {
            anInt1157 = 0;
            if(i < 1 || i > 1)
            {
                return;
            }
            for(int j = -1; j < anInt1226 + anInt1009; j++)
            {
                Object obj;
                if(j == -1)
                {
                    obj = aClass44_Sub3_Sub4_Sub6_Sub1_1047;
                } else
                if(j < anInt1226)
                {
                    obj = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[j]];
                } else
                {
                    obj = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[j - anInt1226]];
                }
                if(obj != null && ((Class44_Sub3_Sub4_Sub6) (obj)).method535(true))
                {
                    if(j < anInt1226)
                    {
                        int l = 30;
                        Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = (Class44_Sub3_Sub4_Sub6_Sub1)obj;
                        if(class44_sub3_sub4_sub6_sub1.anInt1675 != 0)
                        {
                            method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 + 15, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                for(int i2 = 0; i2 < 8; i2++)
                                {
                                    if((class44_sub3_sub4_sub6_sub1.anInt1675 & 1 << i2) != 0)
                                    {
                                        aClass44_Sub3_Sub1_Sub2Array1183[i2].method440(anInt1065 - l, aByte1213, anInt1064 - 12);
                                        l -= 25;
                                    }
                                }
                            }
                        }
                        if(j >= 0 && anInt1005 == 10 && anInt909 == anIntArray1227[j])
                        {
                            method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 + 15, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[7].method440(anInt1065 - l, aByte1213, anInt1064 - 12);
                            }
                        }
                    } else
                    {
                        Class12 class12 = ((Class44_Sub3_Sub4_Sub6_Sub2)obj).aClass12_1700;
                        if(class12.anInt305 >= 0 && class12.anInt305 < aClass44_Sub3_Sub1_Sub2Array1183.length)
                        {
                            method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 + 15, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[class12.anInt305].method440(anInt1065 - 30, aByte1213, anInt1064 - 12);
                            }
                        }
                        if(anInt1005 == 1 && anInt901 == anIntArray1010[j - anInt1226] && anInt1240 % 20 < 10)
                        {
                            method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 + 15, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                aClass44_Sub3_Sub1_Sub2Array1183[2].method440(anInt1065 - 28, aByte1213, anInt1064 - 12);
                            }
                        }
                    }
                    if(((Class44_Sub3_Sub4_Sub6) (obj)).aString1627 != null && (j >= anInt1226 || anInt843 == 0 || anInt843 == 3 || anInt843 == 1 && method80(((Class44_Sub3_Sub4_Sub6_Sub1)obj).aString1672, 3)))
                    {
                        method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                        if(anInt1064 > -1 && anInt1157 < anInt1158)
                        {
                            anIntArray1162[anInt1157] = aClass44_Sub3_Sub1_Sub4_1257.method458(((Class44_Sub3_Sub4_Sub6) (obj)).aString1627, -725) / 2;
                            anIntArray1161[anInt1157] = aClass44_Sub3_Sub1_Sub4_1257.anInt1478;
                            anIntArray1159[anInt1157] = anInt1064;
                            anIntArray1160[anInt1157] = anInt1065;
                            anIntArray1163[anInt1157] = ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1629;
                            anIntArray1164[anInt1157] = ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1630;
                            anIntArray1165[anInt1157] = ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1628;
                            aStringArray1166[anInt1157++] = ((Class44_Sub3_Sub4_Sub6) (obj)).aString1627;
                            if(anInt970 == 0 && ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1630 >= 1 && ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1630 <= 3)
                            {
                                anIntArray1161[anInt1157] += 10;
                                anIntArray1160[anInt1157] += 5;
                            }
                            if(anInt970 == 0 && ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1630 == 4)
                            {
                                anIntArray1162[anInt1157] = 60;
                            }
                            if(anInt970 == 0 && ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1630 == 5)
                            {
                                anIntArray1161[anInt1157] += 5;
                            }
                        }
                    }
                    if(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1634 > anInt1240)
                    {
                        method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 + 15, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                        if(anInt1064 > -1)
                        {
                            int i1 = (((Class44_Sub3_Sub4_Sub6) (obj)).anInt1635 * 30) / ((Class44_Sub3_Sub4_Sub6) (obj)).anInt1636;
                            if(i1 > 30)
                            {
                                i1 = 30;
                            }
                            Class44_Sub3_Sub1.method411(65280, 210, anInt1065 - 3, 5, anInt1064 - 15, i1);
                            Class44_Sub3_Sub1.method411(0xff0000, 210, anInt1065 - 3, 5, (anInt1064 - 15) + i1, 30 - i1);
                        }
                    }
                    for(int j1 = 0; j1 < 4; j1++)
                    {
                        if(((Class44_Sub3_Sub4_Sub6) (obj)).anIntArray1633[j1] > anInt1240)
                        {
                            method74(((Class44_Sub3_Sub4_Sub6) (obj)).anInt1661 / 2, ((Class44_Sub3_Sub4_Sub6) (obj)), 0);
                            if(anInt1064 > -1)
                            {
                                if(j1 == 1)
                                {
                                    anInt1065 -= 20;
                                }
                                if(j1 == 2)
                                {
                                    anInt1064 -= 15;
                                    anInt1065 -= 10;
                                }
                                if(j1 == 3)
                                {
                                    anInt1064 += 15;
                                    anInt1065 -= 10;
                                }
                                aClass44_Sub3_Sub1_Sub2Array1108[((Class44_Sub3_Sub4_Sub6) (obj)).anIntArray1632[j1]].method440(anInt1065 - 12, aByte1213, anInt1064 - 12);
                                aClass44_Sub3_Sub1_Sub4_1255.method455(anInt1064, String.valueOf(((Class44_Sub3_Sub4_Sub6) (obj)).anIntArray1631[j1]), -31546, 0, anInt1065 + 4);
                                aClass44_Sub3_Sub1_Sub4_1255.method455(anInt1064 - 1, String.valueOf(((Class44_Sub3_Sub4_Sub6) (obj)).anIntArray1631[j1]), -31546, 0xffffff, anInt1065 + 3);
                            }
                        }
                    }
                }
            }
            for(int k = 0; k < anInt1157; k++)
            {
                int k1 = anIntArray1159[k];
                int l1 = anIntArray1160[k];
                int j2 = anIntArray1162[k];
                int k2 = anIntArray1161[k];
                boolean flag = true;
                while(flag)
                {
                    flag = false;
                    for(int l2 = 0; l2 < k; l2++)
                    {
                        if(l1 + 2 > anIntArray1160[l2] - anIntArray1161[l2] && l1 - k2 < anIntArray1160[l2] + 2 && k1 - j2 < anIntArray1159[l2] + anIntArray1162[l2] && k1 + j2 > anIntArray1159[l2] - anIntArray1162[l2] && anIntArray1160[l2] - anIntArray1161[l2] < l1)
                        {
                            l1 = anIntArray1160[l2] - anIntArray1161[l2];
                            flag = true;
                        }
                    }
                }
                anInt1064 = anIntArray1159[k];
                anInt1065 = anIntArray1160[k] = l1;
                String s = aStringArray1166[k];
                if(anInt970 == 0)
                {
                    int i3 = 0xffff00;
                    if(anIntArray1163[k] < 6)
                    {
                        i3 = anIntArray1203[anIntArray1163[k]];
                    }
                    if(anIntArray1163[k] == 6)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 0xffff00 : 0xff0000;
                    }
                    if(anIntArray1163[k] == 7)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 65535 : 255;
                    }
                    if(anIntArray1163[k] == 8)
                    {
                        i3 = anInt1189 % 20 >= 10 ? 0x80ff80 : 45056;
                    }
                    if(anIntArray1163[k] == 9)
                    {
                        int j3 = 150 - anIntArray1165[k];
                        if(j3 < 50)
                        {
                            i3 = 0xff0000 + 1280 * j3;
                        } else
                        if(j3 < 100)
                        {
                            i3 = 0xffff00 - 0x50000 * (j3 - 50);
                        } else
                        if(j3 < 150)
                        {
                            i3 = 65280 + 5 * (j3 - 100);
                        }
                    }
                    if(anIntArray1163[k] == 10)
                    {
                        int k3 = 150 - anIntArray1165[k];
                        if(k3 < 50)
                        {
                            i3 = 0xff0000 + 5 * k3;
                        } else
                        if(k3 < 100)
                        {
                            i3 = 0xff00ff - 0x50000 * (k3 - 50);
                        } else
                        if(k3 < 150)
                        {
                            i3 = (255 + 0x50000 * (k3 - 100)) - 5 * (k3 - 100);
                        }
                    }
                    if(anIntArray1163[k] == 11)
                    {
                        int l3 = 150 - anIntArray1165[k];
                        if(l3 < 50)
                        {
                            i3 = 0xffffff - 0x50005 * l3;
                        } else
                        if(l3 < 100)
                        {
                            i3 = 65280 + 0x50005 * (l3 - 50);
                        } else
                        if(l3 < 150)
                        {
                            i3 = 0xffffff - 0x50000 * (l3 - 100);
                        }
                    }
                    if(anIntArray1164[k] == 0)
                    {
                        aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, 0, anInt1065 + 1);
                        aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, i3, anInt1065);
                    }
                    if(anIntArray1164[k] == 1)
                    {
                        aClass44_Sub3_Sub1_Sub4_1257.method460(anInt1064, anInt1189, (byte)5, 0, anInt1065 + 1, s);
                        aClass44_Sub3_Sub1_Sub4_1257.method460(anInt1064, anInt1189, (byte)5, i3, anInt1065, s);
                    }
                    if(anIntArray1164[k] == 2)
                    {
                        aClass44_Sub3_Sub1_Sub4_1257.method461(0, s, (byte)3, anInt1064, anInt1065 + 1, anInt1189);
                        aClass44_Sub3_Sub1_Sub4_1257.method461(i3, s, (byte)3, anInt1064, anInt1065, anInt1189);
                    }
                    if(anIntArray1164[k] == 3)
                    {
                        aClass44_Sub3_Sub1_Sub4_1257.method462(s, anInt1064, anInt1189, anInt1065 + 1, 0, anInt974, 150 - anIntArray1165[k]);
                        aClass44_Sub3_Sub1_Sub4_1257.method462(s, anInt1064, anInt1189, anInt1065, i3, anInt974, 150 - anIntArray1165[k]);
                    }
                    if(anIntArray1164[k] == 4)
                    {
                        int i4 = aClass44_Sub3_Sub1_Sub4_1257.method458(s, -725);
                        int k4 = ((150 - anIntArray1165[k]) * (i4 + 100)) / 150;
                        Class44_Sub3_Sub1.method408(aByte977, 334, anInt1064 + 50, 0, anInt1064 - 50);
                        aClass44_Sub3_Sub1_Sub4_1257.method459((byte)-104, 0, s, (anInt1064 + 50) - k4, anInt1065 + 1);
                        aClass44_Sub3_Sub1_Sub4_1257.method459((byte)-104, i3, s, (anInt1064 + 50) - k4, anInt1065);
                        Class44_Sub3_Sub1.method407((byte)-92);
                    }
                    if(anIntArray1164[k] == 5)
                    {
                        int j4 = 150 - anIntArray1165[k];
                        int l4 = 0;
                        if(j4 < 25)
                        {
                            l4 = j4 - 25;
                        } else
                        if(j4 > 125)
                        {
                            l4 = j4 - 125;
                        }
                        Class44_Sub3_Sub1.method408(aByte977, anInt1065 + 5, 512, anInt1065 - aClass44_Sub3_Sub1_Sub4_1257.anInt1478 - 1, 0);
                        aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, 0, anInt1065 + 1 + l4);
                        aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, i3, anInt1065 + l4);
                        Class44_Sub3_Sub1.method407((byte)-92);
                    }
                } else
                {
                    aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, 0, anInt1065 + 1);
                    aClass44_Sub3_Sub1_Sub4_1257.method455(anInt1064, s, -31546, 0xffff00, anInt1065);
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("28791, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method62(int i, byte byte0)
    {
        try
        {
            if(byte0 != -12)
            {
                method6();
            }
            if(!aBoolean1235)
            {
                if(Class44_Sub3_Sub1_Sub1.anIntArray1437[17] >= i)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1431[17];
                    int j = class44_sub3_sub1_sub3.anInt1460 * class44_sub3_sub1_sub3.anInt1461 - 1;
                    int l = class44_sub3_sub1_sub3.anInt1460 * anInt824 * 2;
                    byte abyte0[] = class44_sub3_sub1_sub3.aByteArray1458;
                    byte abyte2[] = aByteArray1109;
                    for(int j1 = 0; j1 <= j; j1++)
                    {
                        abyte2[j1] = abyte0[j1 - l & j];
                    }
                    class44_sub3_sub1_sub3.aByteArray1458 = abyte2;
                    aByteArray1109 = abyte0;
                    Class44_Sub3_Sub1_Sub1.method425(9, 17);
                }
                if(Class44_Sub3_Sub1_Sub1.anIntArray1437[24] >= i)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1431[24];
                    int k = class44_sub3_sub1_sub3_1.anInt1460 * class44_sub3_sub1_sub3_1.anInt1461 - 1;
                    int i1 = class44_sub3_sub1_sub3_1.anInt1460 * anInt824 * 2;
                    byte abyte1[] = class44_sub3_sub1_sub3_1.aByteArray1458;
                    byte abyte3[] = aByteArray1109;
                    for(int k1 = 0; k1 <= k; k1++)
                    {
                        abyte3[k1] = abyte1[k1 - i1 & k];
                    }
                    class44_sub3_sub1_sub3_1.aByteArray1458 = abyte3;
                    aByteArray1109 = abyte1;
                    Class44_Sub3_Sub1_Sub1.method425(9, 24);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("9303, " + i + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method63(int i)
    {
        try
        {
            if(anInt1017 == 0)
            {
                return;
            }
            Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = aClass44_Sub3_Sub1_Sub4_1256;
            int j = 0;
            while(i >= 0)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            if(anInt998 != 0)
            {
                j = 1;
            }
            for(int k = 0; k < 100; k++)
            {
                if(aStringArray1004[k] != null)
                {
                    int l = anIntArray1002[k];
                    String s = aStringArray1003[k];
                    byte byte0 = 0;
                    if(s != null && s.startsWith("@cr1@"))
                    {
                        s = s.substring(5);
                        byte0 = 1;
                    }
                    if(s != null && s.startsWith("@cr2@"))
                    {
                        s = s.substring(5);
                        byte0 = 2;
                    }
                    if((l == 3 || l == 7) && (l == 7 || anInt895 == 0 || anInt895 == 1 && method80(s, 3)))
                    {
                        int i1 = 329 - j * 13;
                        int l1 = 4;
                        class44_sub3_sub1_sub4.method459((byte)-104, 0, "From", l1, i1);
                        class44_sub3_sub1_sub4.method459((byte)-104, 65535, "From", l1, i1 - 1);
                        l1 += class44_sub3_sub1_sub4.method457("From ", true);
                        if(byte0 == 1)
                        {
                            aClass44_Sub3_Sub1_Sub3Array836[0].method453(i1 - 12, aByte1213, l1);
                            l1 += 14;
                        }
                        if(byte0 == 2)
                        {
                            aClass44_Sub3_Sub1_Sub3Array836[1].method453(i1 - 12, aByte1213, l1);
                            l1 += 14;
                        }
                        class44_sub3_sub1_sub4.method459((byte)-104, 0, s + ": " + aStringArray1004[k], l1, i1);
                        class44_sub3_sub1_sub4.method459((byte)-104, 65535, s + ": " + aStringArray1004[k], l1, i1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if(l == 5 && anInt895 < 2)
                    {
                        int j1 = 329 - j * 13;
                        class44_sub3_sub1_sub4.method459((byte)-104, 0, aStringArray1004[k], 4, j1);
                        class44_sub3_sub1_sub4.method459((byte)-104, 65535, aStringArray1004[k], 4, j1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                    if(l == 6 && anInt895 < 2)
                    {
                        int k1 = 329 - j * 13;
                        class44_sub3_sub1_sub4.method459((byte)-104, 0, "To " + s + ": " + aStringArray1004[k], 4, k1);
                        class44_sub3_sub1_sub4.method459((byte)-104, 65535, "To " + s + ": " + aStringArray1004[k], 4, k1 - 1);
                        if(++j >= 5)
                        {
                            return;
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("54582, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method64(boolean flag)
    {
        try
        {
            Class36.aBoolean606 = false;
            Class44_Sub3_Sub1_Sub1.aBoolean1418 = false;
            aBoolean1235 = false;
            if(!flag)
            {
                anInt1029 = -15;
            }
            Class3.aBoolean64 = false;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("78522, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method12(Runnable runnable, int i)
    {
        if(i > 10)
        {
            i = 10;
        }
        if(Signlink.mainapp != null)
        {
            Signlink.startthread(runnable, i);
            return;
        } else
        {
            super.method12(runnable, i);
            return;
        }
    }

    public boolean method65(int i, int j, byte byte0)
    {
        try
        {
            if(byte0 != -103)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            boolean flag = false;
            Class5 class5 = Class5.aClass5Array100[j];
            for(int k = 0; k < class5.anIntArray122.length; k++)
            {
                if(class5.anIntArray122[k] == -1)
                {
                    break;
                }
                Class5 class5_1 = Class5.aClass5Array100[class5.anIntArray122[k]];
                if(class5_1.anInt107 == 1)
                {
                    flag |= method65(i, class5_1.anInt105, (byte)-103);
                }
                if(class5_1.anInt107 == 6 && (class5_1.anInt153 != -1 || class5_1.anInt154 != -1))
                {
                    boolean flag1 = method88(class5_1, 0);
                    int l;
                    if(flag1)
                    {
                        l = class5_1.anInt154;
                    } else
                    {
                        l = class5_1.anInt153;
                    }
                    if(l != -1)
                    {
                        Class26 class26 = Class26.aClass26Array508[l];
                        for(class5_1.anInt104 += i; class5_1.anInt104 > class26.method254(class5_1.anInt103, 24425);)
                        {
                            class5_1.anInt104 -= class26.method254(class5_1.anInt103, 24425) + 1;
                            class5_1.anInt103++;
                            if(class5_1.anInt103 >= class26.anInt509)
                            {
                                class5_1.anInt103 -= class26.anInt513;
                                if(class5_1.anInt103 < 0 || class5_1.anInt103 >= class26.anInt509)
                                {
                                    class5_1.anInt103 = 0;
                                }
                            }
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("91123, " + i + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method66(byte byte0, boolean flag)
    {
        try
        {
            method87(831);
            aClass34_1265.method272((byte)5);
            if(byte0 != -21)
            {
                anInt1243 = 4;
            }
            aClass44_Sub3_Sub1_Sub3_891.method453(0, aByte1213, 0);
            char c = '\u0168';
            char c1 = '\310';
            if(anInt1014 == 0)
            {
                int i = c1 / 2 + 80;
                aClass44_Sub3_Sub1_Sub4_1255.method456(true, 0x75a9a9, (byte)-85, c / 2, aClass43_Sub1_814.aString1307, i);
                i = c1 / 2 - 20;
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffff00, (byte)-85, c / 2, "Welcome to RuneScape", i);
                i += 30;
                int l = c / 2 - 80;
                int k1 = c1 / 2 + 20;
                aClass44_Sub3_Sub1_Sub3_892.method453(k1 - 20, aByte1213, l - 73);
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, l, "New User", k1 + 5);
                l = c / 2 + 80;
                aClass44_Sub3_Sub1_Sub3_892.method453(k1 - 20, aByte1213, l - 73);
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, l, "Existing User", k1 + 5);
            }
            if(anInt1014 == 2)
            {
                int j = c1 / 2 - 40;
                if(aString1110.length() > 0)
                {
                    aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffff00, (byte)-85, c / 2, aString1110, j - 15);
                    aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffff00, (byte)-85, c / 2, aString1111, j);
                    j += 30;
                } else
                {
                    aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffff00, (byte)-85, c / 2, aString1111, j - 7);
                    j += 30;
                }
                aClass44_Sub3_Sub1_Sub4_1257.method463(0xffffff, 2, j, true, c / 2 - 90, "Username: " + aString1071 + ((anInt831 == 0) & (anInt1240 % 40 < 20) ? "@yel@|" : ""));
                j += 15;
                aClass44_Sub3_Sub1_Sub4_1257.method463(0xffffff, 2, j, true, c / 2 - 88, "Password: " + Class48.method555(0, aString1072) + ((anInt831 == 1) & (anInt1240 % 40 < 20) ? "@yel@|" : ""));
                j += 15;
                if(!flag)
                {
                    int i1 = c / 2 - 80;
                    int l1 = c1 / 2 + 50;
                    aClass44_Sub3_Sub1_Sub3_892.method453(l1 - 20, aByte1213, i1 - 73);
                    aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, i1, "Login", l1 + 5);
                    i1 = c / 2 + 80;
                    aClass44_Sub3_Sub1_Sub3_892.method453(l1 - 20, aByte1213, i1 - 73);
                    aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, i1, "Cancel", l1 + 5);
                }
            }
            if(anInt1014 == 3)
            {
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffff00, (byte)-85, c / 2, "Create a free account", c1 / 2 - 60);
                int k = c1 / 2 - 35;
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, c / 2, "To create a new account you need to", k);
                k += 15;
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, c / 2, "go back to the main RuneScape webpage", k);
                k += 15;
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, c / 2, "and choose the red 'create account'", k);
                k += 15;
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, c / 2, "button at the top right of that page.", k);
                k += 15;
                int j1 = c / 2;
                int i2 = c1 / 2 + 50;
                aClass44_Sub3_Sub1_Sub3_892.method453(i2 - 20, aByte1213, j1 - 73);
                aClass44_Sub3_Sub1_Sub4_1257.method456(true, 0xffffff, (byte)-85, j1, "Cancel", i2 + 5);
            }
            aClass34_1265.method273(-781, 202, 171, super.aGraphics13);
            if(aBoolean908)
            {
                aBoolean908 = false;
                aClass34_1263.method273(-781, 128, 0, super.aGraphics13);
                aClass34_1264.method273(-781, 202, 371, super.aGraphics13);
                aClass34_1268.method273(-781, 0, 265, super.aGraphics13);
                aClass34_1269.method273(-781, 562, 265, super.aGraphics13);
                aClass34_1270.method273(-781, 128, 171, super.aGraphics13);
                aClass34_1271.method273(-781, 562, 171, super.aGraphics13);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("72643, " + byte0 + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method67(Class44_Sub3_Sub2 class44_sub3_sub2, int i, int j)
    {
        try
        {
            if(i != -6563)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            if(j == 90 || j == 194)
            {
                int l = class44_sub3_sub2.method482();
                int j3 = anInt1037 + (l >> 4 & 7);
                int l5 = anInt1038 + (l & 7);
                int j8 = class44_sub3_sub2.method482();
                int l10 = j8 >> 2;
                int i13 = j8 & 3;
                int i15 = anIntArray1142[l10];
                int j16;
                if(j == 194)
                {
                    j16 = -1;
                } else
                {
                    j16 = class44_sub3_sub2.method484();
                }
                if(j3 >= 0 && l5 >= 0 && j3 < 104 && l5 < 104)
                {
                    method82(-23081, 0, anInt1155, j16, l10, l5, i13, -1, i15, j3);
                }
                return;
            }
            if(j == 106)
            {
                int i1 = class44_sub3_sub2.method482();
                int k3 = anInt1037 + (i1 >> 4 & 7);
                int i6 = anInt1038 + (i1 & 7);
                int k8 = class44_sub3_sub2.method482();
                int i11 = k8 >> 2;
                int j13 = k8 & 3;
                int j15 = anIntArray1142[i11];
                int k16 = class44_sub3_sub2.method484();
                if(k3 >= 0 && i6 >= 0 && k3 < 103 && i6 < 103)
                {
                    int j17 = anIntArrayArrayArray865[anInt1155][k3][i6];
                    int i18 = anIntArrayArrayArray865[anInt1155][k3 + 1][i6];
                    int l18 = anIntArrayArrayArray865[anInt1155][k3 + 1][i6 + 1];
                    int k19 = anIntArrayArrayArray865[anInt1155][k3][i6 + 1];
                    if(j15 == 0)
                    {
                        Class33 class33 = aClass36_1192.method300(anInt1155, false, k3, i6);
                        if(class33 != null)
                        {
                            int j20 = class33.anInt579 >> 14 & 0x7fff;
                            if(i11 == 2)
                            {
                                class33.aClass44_Sub3_Sub4_577 = new Class44_Sub3_Sub4_Sub1(4 + j13, j20, 2, k19, l18, false, j17, k16, false, i18);
                                class33.aClass44_Sub3_Sub4_578 = new Class44_Sub3_Sub4_Sub1(j13 + 1 & 3, j20, 2, k19, l18, false, j17, k16, false, i18);
                            } else
                            {
                                class33.aClass44_Sub3_Sub4_577 = new Class44_Sub3_Sub4_Sub1(j13, j20, i11, k19, l18, false, j17, k16, false, i18);
                            }
                        }
                    }
                    if(j15 == 1)
                    {
                        Class13 class13 = aClass36_1192.method301(i6, 0, anInt1155, k3);
                        if(class13 != null)
                        {
                            class13.aClass44_Sub3_Sub4_313 = new Class44_Sub3_Sub4_Sub1(0, class13.anInt314 >> 14 & 0x7fff, 4, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                    if(j15 == 2)
                    {
                        Class30 class30 = aClass36_1192.method302(k3, 0, i6, anInt1155);
                        if(i11 == 11)
                        {
                            i11 = 10;
                        }
                        if(class30 != null)
                        {
                            class30.aClass44_Sub3_Sub4_543 = new Class44_Sub3_Sub4_Sub1(j13, class30.anInt551 >> 14 & 0x7fff, i11, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                    if(j15 == 3)
                    {
                        Class17 class17 = aClass36_1192.method303(anInt1155, 0, i6, k3);
                        if(class17 != null)
                        {
                            class17.aClass44_Sub3_Sub4_402 = new Class44_Sub3_Sub4_Sub1(j13, class17.anInt403 >> 14 & 0x7fff, 22, k19, l18, false, j17, k16, false, i18);
                        }
                    }
                }
                return;
            }
            if(j == 60)
            {
                int j1 = class44_sub3_sub2.method482();
                int l3 = anInt1037 + (j1 >> 4 & 7);
                int j6 = anInt1038 + (j1 & 7);
                int l8 = class44_sub3_sub2.method484();
                int j11 = class44_sub3_sub2.method484();
                if(l3 >= 0 && j6 >= 0 && l3 < 104 && j6 < 104)
                {
                    Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = new Class44_Sub3_Sub4_Sub2();
                    class44_sub3_sub4_sub2.anInt1495 = l8;
                    class44_sub3_sub4_sub2.anInt1496 = j11;
                    if(aClass28ArrayArrayArray1146[anInt1155][l3][j6] == null)
                    {
                        aClass28ArrayArrayArray1146[anInt1155][l3][j6] = new Class28(-199);
                    }
                    aClass28ArrayArrayArray1146[anInt1155][l3][j6].method256(class44_sub3_sub4_sub2);
                    method92(l3, j6);
                }
                return;
            }
            if(j == 71)
            {
                int k1 = class44_sub3_sub2.method482();
                int i4 = anInt1037 + (k1 >> 4 & 7);
                int k6 = anInt1038 + (k1 & 7);
                int i9 = class44_sub3_sub2.method484();
                if(i4 >= 0 && k6 >= 0 && i4 < 104 && k6 < 104)
                {
                    Class28 class28 = aClass28ArrayArrayArray1146[anInt1155][i4][k6];
                    if(class28 != null)
                    {
                        for(Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2)class28.method259(); class44_sub3_sub4_sub2_1 != null; class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2)class28.method261(false))
                        {
                            if(class44_sub3_sub4_sub2_1.anInt1495 != (i9 & 0x7fff))
                            {
                                continue;
                            }
                            class44_sub3_sub4_sub2_1.method404();
                            break;
                        }
                        if(class28.method259() == null)
                        {
                            aClass28ArrayArrayArray1146[anInt1155][i4][k6] = null;
                        }
                        method92(i4, k6);
                    }
                }
                return;
            }
            if(j == 87)
            {
                int l1 = class44_sub3_sub2.method482();
                int j4 = anInt1037 + (l1 >> 4 & 7);
                int l6 = anInt1038 + (l1 & 7);
                int j9 = j4 + class44_sub3_sub2.method483();
                int k11 = l6 + class44_sub3_sub2.method483();
                int k13 = class44_sub3_sub2.method485();
                int k15 = class44_sub3_sub2.method484();
                int l16 = class44_sub3_sub2.method482() * 4;
                int k17 = class44_sub3_sub2.method482() * 4;
                int j18 = class44_sub3_sub2.method484();
                int i19 = class44_sub3_sub2.method484();
                int l19 = class44_sub3_sub2.method482();
                int i20 = class44_sub3_sub2.method482();
                if(j4 >= 0 && l6 >= 0 && j4 < 104 && l6 < 104 && j9 >= 0 && k11 >= 0 && j9 < 104 && k11 < 104)
                {
                    j4 = j4 * 128 + 64;
                    l6 = l6 * 128 + 64;
                    j9 = j9 * 128 + 64;
                    k11 = k11 * 128 + 64;
                    Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = new Class44_Sub3_Sub4_Sub3(i20, method51(false, l6, j4, anInt1155) - l16, j18 + anInt1240, k15, j4, k13, anInt1155, l6, i19 + anInt1240, l19, false, k17);
                    class44_sub3_sub4_sub3.method500(method51(false, k11, j9, anInt1155) - k17, true, k11, j18 + anInt1240, j9);
                    aClass28_918.method256(class44_sub3_sub4_sub3);
                }
                return;
            }
            if(j == 233)
            {
                int i2 = class44_sub3_sub2.method482();
                int k4 = anInt1037 + (i2 >> 4 & 7);
                int i7 = anInt1038 + (i2 & 7);
                int k9 = class44_sub3_sub2.method484();
                int l11 = class44_sub3_sub2.method482();
                int l13 = class44_sub3_sub2.method484();
                if(k4 >= 0 && i7 >= 0 && k4 < 104 && i7 < 104)
                {
                    k4 = k4 * 128 + 64;
                    i7 = i7 * 128 + 64;
                    Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = new Class44_Sub3_Sub4_Sub5(k4, anInt1155, method51(false, i7, k4, anInt1155) - l11, l13, true, i7, k9, anInt1240);
                    aClass28_1054.method256(class44_sub3_sub4_sub5);
                }
                return;
            }
            if(j == 176)
            {
                int j2 = class44_sub3_sub2.method482();
                int l4 = anInt1037 + (j2 >> 4 & 7);
                int j7 = anInt1038 + (j2 & 7);
                int l9 = class44_sub3_sub2.method484();
                int i12 = class44_sub3_sub2.method484();
                int i14 = class44_sub3_sub2.method484();
                if(l4 >= 0 && j7 >= 0 && l4 < 104 && j7 < 104 && i14 != anInt1115)
                {
                    Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_2 = new Class44_Sub3_Sub4_Sub2();
                    class44_sub3_sub4_sub2_2.anInt1495 = l9;
                    class44_sub3_sub4_sub2_2.anInt1496 = i12;
                    if(aClass28ArrayArrayArray1146[anInt1155][l4][j7] == null)
                    {
                        aClass28ArrayArrayArray1146[anInt1155][l4][j7] = new Class28(-199);
                    }
                    aClass28ArrayArrayArray1146[anInt1155][l4][j7].method256(class44_sub3_sub4_sub2_2);
                    method92(l4, j7);
                }
                return;
            }
            if(j == 83)
            {
                int k2 = class44_sub3_sub2.method482();
                int i5 = anInt1037 + (k2 >> 4 & 7);
                int k7 = anInt1038 + (k2 & 7);
                int i10 = class44_sub3_sub2.method482();
                int j12 = i10 >> 2;
                int j14 = i10 & 3;
                int l15 = anIntArray1142[j12];
                int i17 = class44_sub3_sub2.method484();
                int l17 = class44_sub3_sub2.method484();
                int k18 = class44_sub3_sub2.method484();
                int j19 = class44_sub3_sub2.method484();
                byte byte0 = class44_sub3_sub2.method483();
                byte byte1 = class44_sub3_sub2.method483();
                byte byte2 = class44_sub3_sub2.method483();
                byte byte3 = class44_sub3_sub2.method483();
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
                if(j19 == anInt1115)
                {
                    class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1047;
                } else
                {
                    class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j19];
                }
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    Class8 class8 = Class8.method199(i17);
                    int k20 = anIntArrayArrayArray865[anInt1155][i5][k7];
                    int l20 = anIntArrayArrayArray865[anInt1155][i5 + 1][k7];
                    int i21 = anIntArrayArrayArray865[anInt1155][i5 + 1][k7 + 1];
                    int j21 = anIntArrayArrayArray865[anInt1155][i5][k7 + 1];
                    Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = class8.method205(j12, j14, k20, l20, i21, j21, -1);
                    if(class44_sub3_sub4_sub4 != null)
                    {
                        method82(-23081, l17 + 1, anInt1155, -1, 0, k7, 0, k18 + 1, l15, i5);
                        class44_sub3_sub4_sub6_sub1.anInt1682 = l17 + anInt1240;
                        class44_sub3_sub4_sub6_sub1.anInt1683 = k18 + anInt1240;
                        class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1687 = class44_sub3_sub4_sub4;
                        int k21 = class8.anInt222;
                        int l21 = class8.anInt223;
                        if(j14 == 1 || j14 == 3)
                        {
                            k21 = class8.anInt223;
                            l21 = class8.anInt222;
                        }
                        class44_sub3_sub4_sub6_sub1.anInt1684 = i5 * 128 + k21 * 64;
                        class44_sub3_sub4_sub6_sub1.anInt1686 = k7 * 128 + l21 * 64;
                        class44_sub3_sub4_sub6_sub1.anInt1685 = method51(false, class44_sub3_sub4_sub6_sub1.anInt1686, class44_sub3_sub4_sub6_sub1.anInt1684, anInt1155);
                        if(byte0 > byte2)
                        {
                            byte byte4 = byte0;
                            byte0 = byte2;
                            byte2 = byte4;
                        }
                        if(byte1 > byte3)
                        {
                            byte byte5 = byte1;
                            byte1 = byte3;
                            byte3 = byte5;
                        }
                        class44_sub3_sub4_sub6_sub1.anInt1688 = i5 + byte0;
                        class44_sub3_sub4_sub6_sub1.anInt1690 = i5 + byte2;
                        class44_sub3_sub4_sub6_sub1.anInt1689 = k7 + byte1;
                        class44_sub3_sub4_sub6_sub1.anInt1691 = k7 + byte3;
                    }
                }
            }
            if(j == 117)
            {
                int l2 = class44_sub3_sub2.method482();
                int j5 = anInt1037 + (l2 >> 4 & 7);
                int l7 = anInt1038 + (l2 & 7);
                int j10 = class44_sub3_sub2.method484();
                int k12 = class44_sub3_sub2.method484();
                int k14 = class44_sub3_sub2.method484();
                if(j5 >= 0 && l7 >= 0 && j5 < 104 && l7 < 104)
                {
                    Class28 class28_1 = aClass28ArrayArrayArray1146[anInt1155][j5][l7];
                    if(class28_1 != null)
                    {
                        for(Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_3 = (Class44_Sub3_Sub4_Sub2)class28_1.method259(); class44_sub3_sub4_sub2_3 != null; class44_sub3_sub4_sub2_3 = (Class44_Sub3_Sub4_Sub2)class28_1.method261(false))
                        {
                            if(class44_sub3_sub4_sub2_3.anInt1495 != (j10 & 0x7fff) || class44_sub3_sub4_sub2_3.anInt1496 != k12)
                            {
                                continue;
                            }
                            class44_sub3_sub4_sub2_3.anInt1496 = k14;
                            break;
                        }
                        method92(j5, l7);
                    }
                }
                return;
            }
            if(j == 91)
            {
                int i3 = class44_sub3_sub2.method482();
                int k5 = anInt1037 + (i3 >> 4 & 7);
                int i8 = anInt1038 + (i3 & 7);
                int k10 = class44_sub3_sub2.method484();
                int l12 = class44_sub3_sub2.method482();
                int l14 = l12 >> 4 & 0xf;
                int i16 = l12 & 7;
                if(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0] >= k5 - l14 && ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0] <= k5 + l14 && ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0] >= i8 - l14 && ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0] <= i8 + l14 && aBoolean1050 && !aBoolean1235 && anInt968 < 50)
                {
                    anIntArray846[anInt968] = k10;
                    anIntArray1006[anInt968] = i16;
                    anIntArray1193[anInt968] = Class4.anIntArray92[k10];
                    anInt968++;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("80608, " + class44_sub3_sub2 + ", " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method68(int i)
    {
        try
        {
            byte abyte0[] = aClass47_1117.method549("title.dat", null);
            Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(abyte0, this);
            aClass34_1266.method272((byte)5);
            class44_sub3_sub1_sub2.method438(0, 0, 8);
            aClass34_1267.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-637, 0, 8);
            aClass34_1263.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-128, 0, 8);
            aClass34_1264.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-202, -371, 8);
            aClass34_1265.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-202, -171, 8);
            aClass34_1268.method272((byte)5);
            class44_sub3_sub1_sub2.method438(0, -265, 8);
            aClass34_1269.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-562, -265, 8);
            aClass34_1270.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-128, -171, 8);
            aClass34_1271.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-562, -171, 8);
            int ai[] = new int[class44_sub3_sub1_sub2.anInt1449];
            for(int j = 0; j < class44_sub3_sub1_sub2.anInt1450; j++)
            {
                for(int k = 0; k < class44_sub3_sub1_sub2.anInt1449; k++)
                {
                    ai[k] = class44_sub3_sub1_sub2.anIntArray1448[(class44_sub3_sub1_sub2.anInt1449 - k - 1) + class44_sub3_sub1_sub2.anInt1449 * j];
                }
                for(int l = 0; l < class44_sub3_sub1_sub2.anInt1449; l++)
                {
                    class44_sub3_sub1_sub2.anIntArray1448[l + class44_sub3_sub1_sub2.anInt1449 * j] = ai[l];
                }
            }
            aClass34_1266.method272((byte)5);
            class44_sub3_sub1_sub2.method438(382, 0, 8);
            aClass34_1267.method272((byte)5);
            class44_sub3_sub1_sub2.method438(-255, 0, 8);
            aClass34_1263.method272((byte)5);
            if(i != 0)
            {
                return;
            } else
            {
                class44_sub3_sub1_sub2.method438(254, 0, 8);
                aClass34_1264.method272((byte)5);
                class44_sub3_sub1_sub2.method438(180, -371, 8);
                aClass34_1265.method272((byte)5);
                class44_sub3_sub1_sub2.method438(180, -171, 8);
                aClass34_1268.method272((byte)5);
                class44_sub3_sub1_sub2.method438(382, -265, 8);
                aClass34_1269.method272((byte)5);
                class44_sub3_sub1_sub2.method438(-180, -265, 8);
                aClass34_1270.method272((byte)5);
                class44_sub3_sub1_sub2.method438(254, -171, 8);
                aClass34_1271.method272((byte)5);
                class44_sub3_sub1_sub2.method438(-180, -171, 8);
                class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(aClass47_1117, "logo", 0);
                aClass34_1263.method272((byte)5);
                class44_sub3_sub1_sub2.method440(18, aByte1213, 382 - class44_sub3_sub1_sub2.anInt1449 / 2 - 128);
                class44_sub3_sub1_sub2 = null;
                Object obj = null;
                Object obj1 = null;
                System.gc();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("12680, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method69(byte byte0)
    {
        try
        {
            for(Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3)aClass28_918.method259(); class44_sub3_sub4_sub3 != null; class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3)aClass28_918.method261(false))
            {
                if(class44_sub3_sub4_sub3.anInt1500 != anInt1155 || anInt1240 > class44_sub3_sub4_sub3.anInt1506)
                {
                    class44_sub3_sub4_sub3.method404();
                } else
                if(anInt1240 >= class44_sub3_sub4_sub3.anInt1505)
                {
                    if(class44_sub3_sub4_sub3.anInt1509 > 0)
                    {
                        Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[class44_sub3_sub4_sub3.anInt1509 - 1];
                        if(class44_sub3_sub4_sub6_sub2 != null && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 >= 0 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 < 13312 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 >= 0 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 < 13312)
                        {
                            class44_sub3_sub4_sub3.method500(method51(false, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615, class44_sub3_sub4_sub3.anInt1500) - class44_sub3_sub4_sub3.anInt1504, true, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616, anInt1240, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615);
                        }
                    }
                    if(class44_sub3_sub4_sub3.anInt1509 < 0)
                    {
                        int j = -class44_sub3_sub4_sub3.anInt1509 - 1;
                        Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
                        if(j == anInt1115)
                        {
                            class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1047;
                        } else
                        {
                            class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j];
                        }
                        if(class44_sub3_sub4_sub6_sub1 != null && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 >= 0 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 < 13312 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 >= 0 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 < 13312)
                        {
                            class44_sub3_sub4_sub3.method500(method51(false, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615, class44_sub3_sub4_sub3.anInt1500) - class44_sub3_sub4_sub3.anInt1504, true, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, anInt1240, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615);
                        }
                    }
                    class44_sub3_sub4_sub3.method501(anInt824, -816);
                    aClass36_1192.method289(60, -1, (int)class44_sub3_sub4_sub3.aDouble1513, (int)class44_sub3_sub4_sub3.aDouble1511, 384, class44_sub3_sub4_sub3, class44_sub3_sub4_sub3.anInt1519, false, (int)class44_sub3_sub4_sub3.aDouble1512, anInt1155);
                }
            }
            anInt1167++;
            if(byte0 != aByte1053)
            {
                aBoolean1262 = !aBoolean1262;
            }
            if(anInt1167 > 1174)
            {
                anInt1167 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 130);
                aClass44_Sub3_Sub2_850.method472(0);
                int i = aClass44_Sub3_Sub2_850.anInt1392;
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method473(11499);
                }
                aClass44_Sub3_Sub2_850.method473(10548);
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method472(139);
                }
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method472(94);
                }
                aClass44_Sub3_Sub2_850.method473(51693);
                aClass44_Sub3_Sub2_850.method472(16);
                aClass44_Sub3_Sub2_850.method473(15036);
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method472(65);
                }
                aClass44_Sub3_Sub2_850.method472((int)(Math.random() * 256D));
                aClass44_Sub3_Sub2_850.method473(22990);
                aClass44_Sub3_Sub2_850.method481(aClass44_Sub3_Sub2_850.anInt1392 - i, anInt1152);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("60480, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method70(byte byte0)
    {
        try
        {
            aBoolean812 = true;
            for(int i = 0; i < 7; i++)
            {
                anIntArray849[i] = -1;
                for(int j = 0; j < Class22.anInt463; j++)
                {
                    if(Class22.aClass22Array464[j].aBoolean470 || Class22.aClass22Array464[j].anInt465 != i + (aBoolean1179 ? 0 : 7))
                    {
                        continue;
                    }
                    anIntArray849[i] = j;
                    break;
                }
            }
            if(byte0 != -127)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("72183, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method71(Class44_Sub3_Sub2 class44_sub3_sub2, boolean flag, int i)
    {
        try
        {
            if(flag)
            {
                aBoolean1147 = !aBoolean1147;
            }
            for(int j = 0; j < anInt1228; j++)
            {
                int k = anIntArray1229[j];
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k];
                int l = class44_sub3_sub2.method482();
                if((l & 0x80) == 128)
                {
                    l += class44_sub3_sub2.method482() << 8;
                }
                method46(l, (byte)-106, class44_sub3_sub2, k, class44_sub3_sub4_sub6_sub1);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("27562, " + class44_sub3_sub2 + ", " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String method72(int i, boolean flag)
    {
        try
        {
            if(flag)
            {
                method6();
            }
            if(i < 0x3b9ac9ff)
            {
                return String.valueOf(i);
            } else
            {
                return "*";
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("94656, " + i + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method73(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1)
    {
        try
        {
            if(j != 0)
            {
                aClass44_Sub3_Sub2_850.method472(179);
            }
            if(j1 >= 1 && l1 >= 1 && j1 <= 102 && l1 <= 102)
            {
                if(aBoolean1235 && l != anInt1155)
                {
                    return;
                }
                int i2 = 0;
                byte byte0 = -1;
                boolean flag = false;
                boolean flag1 = false;
                if(k1 == 0)
                {
                    i2 = aClass36_1192.method304(l, j1, l1);
                }
                if(k1 == 1)
                {
                    i2 = aClass36_1192.method305(l1, 7, l, j1);
                }
                if(k1 == 2)
                {
                    i2 = aClass36_1192.method306(l, j1, l1);
                }
                if(k1 == 3)
                {
                    i2 = aClass36_1192.method307(l, j1, l1);
                }
                if(i2 != 0)
                {
                    int i3 = aClass36_1192.method308(l, j1, l1, i2);
                    int j2 = i2 >> 14 & 0x7fff;
                    int k2 = i3 & 0x1f;
                    int l2 = i3 >> 6;
                    if(k1 == 0)
                    {
                        aClass36_1192.method295(l1, j1, (byte)7, l);
                        Class8 class8 = Class8.method199(j2);
                        if(class8.aBoolean224)
                        {
                            aClass18Array1022[l].method236(l2, k2, l1, j1, class8.aBoolean225, (byte)3);
                        }
                    }
                    if(k1 == 1)
                    {
                        aClass36_1192.method296(537, l, l1, j1);
                    }
                    if(k1 == 2)
                    {
                        aClass36_1192.method297(2, l, l1, j1);
                        Class8 class8_1 = Class8.method199(j2);
                        if(j1 + class8_1.anInt222 > 103 || l1 + class8_1.anInt222 > 103 || j1 + class8_1.anInt223 > 103 || l1 + class8_1.anInt223 > 103)
                        {
                            return;
                        }
                        if(class8_1.aBoolean224)
                        {
                            aClass18Array1022[l].method237(class8_1.anInt223, l1, j1, class8_1.aBoolean225, 8, l2, class8_1.anInt222);
                        }
                    }
                    if(k1 == 3)
                    {
                        aClass36_1192.method298(j1, l1, 3, l);
                        Class8 class8_2 = Class8.method199(j2);
                        if(class8_2.aBoolean224 && class8_2.aBoolean226)
                        {
                            aClass18Array1022[l].method239(l1, true, j1);
                        }
                    }
                }
                if(i1 >= 0)
                {
                    int j3 = l;
                    if(j3 < 3 && (aByteArrayArrayArray871[1][j1][l1] & 2) == 2)
                    {
                        j3++;
                    }
                    Class3.method174(i, l, l1, k, anIntArrayArrayArray865, j3, j1, aClass18Array1022[l], aClass36_1192, i1, 0);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("55555, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method74(int i, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int j)
    {
        try
        {
            if(j != 0)
            {
                anInt964 = aClass46_927.method545();
            }
            method75(class44_sub3_sub4_sub6.anInt1615, i, (byte)-79, class44_sub3_sub4_sub6.anInt1616);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("86761, " + i + ", " + class44_sub3_sub4_sub6 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method75(int i, int j, byte byte0, int k)
    {
        try
        {
            if(i < 128 || k < 128 || i > 13056 || k > 13056)
            {
                anInt1064 = -1;
                anInt1065 = -1;
                return;
            }
            int l = method51(false, k, i, anInt1155) - j;
            i -= anInt875;
            if(byte0 != -79)
            {
                aClass44_Sub3_Sub2_850.method472(22);
            }
            l -= anInt876;
            k -= anInt877;
            int i1 = Class44_Sub3_Sub4_Sub4.anIntArray1598[anInt878];
            int j1 = Class44_Sub3_Sub4_Sub4.anIntArray1599[anInt878];
            int k1 = Class44_Sub3_Sub4_Sub4.anIntArray1598[anInt879];
            int l1 = Class44_Sub3_Sub4_Sub4.anIntArray1599[anInt879];
            int i2 = k * k1 + i * l1 >> 16;
            k = k * l1 - i * k1 >> 16;
            i = i2;
            i2 = l * j1 - k * i1 >> 16;
            k = l * i1 + k * j1 >> 16;
            l = i2;
            if(k >= 50)
            {
                anInt1064 = Class44_Sub3_Sub1_Sub1.anInt1423 + (i << 9) / k;
                anInt1065 = Class44_Sub3_Sub1_Sub1.anInt1424 + (l << 9) / k;
                return;
            } else
            {
                anInt1064 = -1;
                anInt1065 = -1;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20782, " + i + ", " + j + ", " + byte0 + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method76(byte byte0)
    {
        try
        {
            Class8.aClass39_251.method341();
            Class8.aClass39_252.method341();
            if(byte0 != -71)
            {
                anInt1056 = aClass46_927.method545();
            }
            Class12.aClass39_307.method341();
            Class14.aClass39_369.method341();
            Class14.aClass39_370.method341();
            Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1696.method341();
            Class32.aClass39_571.method341();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("83788, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public DataInputStream method77(String s)
        throws IOException
    {
        if(!aBoolean922)
        {
            if(Signlink.mainapp != null)
            {
                return Signlink.openurl(s);
            } else
            {
                return new DataInputStream((new URL(getCodeBase(), s)).openStream());
            }
        }
        if(aSocket1013 != null)
        {
            try
            {
                aSocket1013.close();
            }
            catch(Exception _ex)
            {
            }
            aSocket1013 = null;
        }
        aSocket1013 = method34(43595);
        aSocket1013.setSoTimeout(10000);
        InputStream inputstream = aSocket1013.getInputStream();
        OutputStream outputstream = aSocket1013.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public boolean method78(int i, int j, boolean flag, int k, int l)
    {
        try
        {
            int i1 = i >> 14 & 0x7fff;
            int j1 = aClass36_1192.method308(anInt1155, l, k, i);
            if(j1 == -1)
            {
                return false;
            }
            int k1 = j1 & 0x1f;
            int l1 = j1 >> 6 & 3;
            anInt1207++;
            if(anInt1207 > 1086)
            {
                anInt1207 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 154);
                aClass44_Sub3_Sub2_850.method472(0);
                int i2 = aClass44_Sub3_Sub2_850.anInt1392;
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method473(16791);
                }
                aClass44_Sub3_Sub2_850.method472(254);
                aClass44_Sub3_Sub2_850.method473((int)(Math.random() * 65536D));
                aClass44_Sub3_Sub2_850.method473(16128);
                aClass44_Sub3_Sub2_850.method473(52610);
                aClass44_Sub3_Sub2_850.method473((int)(Math.random() * 65536D));
                aClass44_Sub3_Sub2_850.method473(55420);
                if((int)(Math.random() * 2D) == 0)
                {
                    aClass44_Sub3_Sub2_850.method473(35025);
                }
                aClass44_Sub3_Sub2_850.method473(46628);
                aClass44_Sub3_Sub2_850.method472((int)(Math.random() * 256D));
                aClass44_Sub3_Sub2_850.method481(aClass44_Sub3_Sub2_850.anInt1392 - i2, anInt1152);
            }
            if(k1 == 10 || k1 == 11 || k1 == 22)
            {
                Class8 class8 = Class8.method199(i1);
                int j2;
                int k2;
                if(l1 == 0 || l1 == 2)
                {
                    j2 = class8.anInt222;
                    k2 = class8.anInt223;
                } else
                {
                    j2 = class8.anInt223;
                    k2 = class8.anInt222;
                }
                int l2 = class8.anInt245;
                if(l1 != 0)
                {
                    l2 = (l2 << l1 & 0xf) + (l2 >> 4 - l1);
                }
                method124(j2, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, k, l2, 0, false, 2, 124, k2, l, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
            } else
            {
                method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], l1, k, 0, k1 + 1, false, 2, 124, 0, l, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
            }
            anInt815 = super.anInt28;
            if(flag)
            {
                anInt1246 = -113;
            }
            anInt816 = super.anInt29;
            anInt818 = 2;
            anInt817 = 0;
            aClass44_Sub3_Sub2_850.method471(-34003, j);
            aClass44_Sub3_Sub2_850.method473(l + anInt1184);
            aClass44_Sub3_Sub2_850.method473(k + anInt1185);
            aClass44_Sub3_Sub2_850.method473(i1);
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("86165, " + i + ", " + j + ", " + flag + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method79(byte byte0)
    {
        try
        {
            if(byte0 != 9)
            {
                anInt964 = -393;
            }
            return Signlink.wavereplay();
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("96494, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method80(String s, int i)
    {
        try
        {
            if(i < 3 || i > 3)
            {
                aBoolean985 = !aBoolean985;
            }
            if(s == null)
            {
                return false;
            }
            for(int j = 0; j < anInt1104; j++)
            {
                if(s.equalsIgnoreCase(aStringArray1044[j]))
                {
                    return true;
                }
            }
            return s.equalsIgnoreCase(aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("59627, " + s + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method81(int i, int j, Class5 class5, int k, boolean flag, int l, byte byte0,
            int i1, int j1)
    {
        try
        {
            if(aBoolean1156)
            {
                anInt832 = 32;
            } else
            {
                anInt832 = 0;
            }
            aBoolean1156 = false;
            if(byte0 != -83)
            {
                aClass44_Sub3_Sub2_850.method472(103);
            }
            if(j >= k && j < k + 16 && i1 >= i && i1 < i + 16)
            {
                class5.anInt120 -= anInt1066 * 4;
                if(flag)
                {
                    aBoolean898 = true;
                    return;
                }
            } else
            if(j >= k && j < k + 16 && i1 >= (i + l) - 16 && i1 < i + l)
            {
                class5.anInt120 += anInt1066 * 4;
                if(flag)
                {
                    aBoolean898 = true;
                    return;
                }
            } else
            if(j >= k - anInt832 && j < k + 16 + anInt832 && i1 >= i + 16 && i1 < (i + l) - 16 && anInt1066 > 0)
            {
                int k1 = ((l - 32) * l) / j1;
                if(k1 < 8)
                {
                    k1 = 8;
                }
                int l1 = i1 - i - 16 - k1 / 2;
                int i2 = l - 32 - k1;
                class5.anInt120 = ((j1 - l) * l1) / i2;
                if(flag)
                {
                    aBoolean898 = true;
                }
                aBoolean1156 = true;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("35389, " + i + ", " + j + ", " + class5 + ", " + k + ", " + flag + ", " + l + ", " + byte0 + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method10(boolean flag)
    {
        try
        {
            aBoolean908 = true;
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20297, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method82(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1, int i2, int j2)
    {
        try
        {
            Class44_Sub1 class44_sub1 = null;
            Class44_Sub1 class44_sub1_1 = (Class44_Sub1)aClass28_1116.method259();
            if(i != -23081)
            {
                return;
            }
            for(; class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1)aClass28_1116.method261(false))
            {
                if(class44_sub1_1.anInt1323 != k || class44_sub1_1.anInt1325 != j2 || class44_sub1_1.anInt1326 != j1 || class44_sub1_1.anInt1324 != i2)
                {
                    continue;
                }
                class44_sub1 = class44_sub1_1;
                break;
            }
            if(class44_sub1 == null)
            {
                class44_sub1 = new Class44_Sub1();
                class44_sub1.anInt1323 = k;
                class44_sub1.anInt1324 = i2;
                class44_sub1.anInt1325 = j2;
                class44_sub1.anInt1326 = j1;
                method139(class44_sub1, false);
                aClass28_1116.method256(class44_sub1);
            }
            class44_sub1.anInt1330 = l;
            class44_sub1.anInt1332 = i1;
            class44_sub1.anInt1331 = k1;
            class44_sub1.anInt1333 = j;
            class44_sub1.anInt1334 = l1;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("49827, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method83(byte byte0)
    {
        try
        {
            for(int i = -1; i < anInt1226; i++)
            {
                int j;
                if(i == -1)
                {
                    j = anInt1224;
                } else
                {
                    j = anIntArray1227[i];
                }
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    method117(-34028, class44_sub3_sub4_sub6_sub1, 1);
                }
            }
            if(byte0 == 5)
            {
                byte0 = 0;
                return;
            } else
            {
                method6();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("82180, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method84(int i)
    {
        try
        {
            char c = '\u0100';
            if(i != 0)
            {
                aClass44_Sub3_Sub2_850.method472(28);
            }
            if(anInt1259 > 0)
            {
                for(int j = 0; j < 256; j++)
                {
                    if(anInt1259 > 768)
                    {
                        anIntArray1218[j] = method91(anIntArray1219[j], anIntArray1220[j], 1024 - anInt1259, 35);
                    } else
                    if(anInt1259 > 256)
                    {
                        anIntArray1218[j] = anIntArray1220[j];
                    } else
                    {
                        anIntArray1218[j] = method91(anIntArray1220[j], anIntArray1219[j], 256 - anInt1259, 35);
                    }
                }
            } else
            if(anInt1260 > 0)
            {
                for(int k = 0; k < 256; k++)
                {
                    if(anInt1260 > 768)
                    {
                        anIntArray1218[k] = method91(anIntArray1219[k], anIntArray1221[k], 1024 - anInt1260, 35);
                    } else
                    if(anInt1260 > 256)
                    {
                        anIntArray1218[k] = anIntArray1221[k];
                    } else
                    {
                        anIntArray1218[k] = method91(anIntArray1221[k], anIntArray1219[k], 256 - anInt1260, 35);
                    }
                }
            } else
            {
                for(int l = 0; l < 256; l++)
                {
                    anIntArray1218[l] = anIntArray1219[l];
                }
            }
            for(int i1 = 0; i1 < 33920; i1++)
            {
                aClass34_1266.anIntArray582[i1] = aClass44_Sub3_Sub1_Sub2_1277.anIntArray1448[i1];
            }
            int j1 = 0;
            int k1 = 1152;
            for(int l1 = 1; l1 < c - 1; l1++)
            {
                int i2 = (anIntArray1018[l1] * (c - l1)) / c;
                int k2 = 22 + i2;
                if(k2 < 0)
                {
                    k2 = 0;
                }
                j1 += k2;
                for(int i3 = k2; i3 < 128; i3++)
                {
                    int k3 = anIntArray1272[j1++];
                    if(k3 != 0)
                    {
                        int i4 = k3;
                        int k4 = 256 - k3;
                        k3 = anIntArray1218[k3];
                        int i5 = aClass34_1266.anIntArray582[k1];
                        aClass34_1266.anIntArray582[k1++] = ((k3 & 0xff00ff) * i4 + (i5 & 0xff00ff) * k4 & 0xff00ff00) + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
                    } else
                    {
                        k1++;
                    }
                }
                k1 += k2;
            }
            aClass34_1266.method273(-781, 0, 0, super.aGraphics13);
            for(int j2 = 0; j2 < 33920; j2++)
            {
                aClass34_1267.anIntArray582[j2] = aClass44_Sub3_Sub1_Sub2_1278.anIntArray1448[j2];
            }
            j1 = 0;
            k1 = 1176;
            for(int l2 = 1; l2 < c - 1; l2++)
            {
                int j3 = (anIntArray1018[l2] * (c - l2)) / c;
                int l3 = 103 - j3;
                k1 += j3;
                for(int j4 = 0; j4 < l3; j4++)
                {
                    int l4 = anIntArray1272[j1++];
                    if(l4 != 0)
                    {
                        int j5 = l4;
                        int k5 = 256 - l4;
                        l4 = anIntArray1218[l4];
                        int l5 = aClass34_1267.anIntArray582[k1];
                        aClass34_1267.anIntArray582[k1++] = ((l4 & 0xff00ff) * j5 + (l5 & 0xff00ff) * k5 & 0xff00ff00) + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
                    } else
                    {
                        k1++;
                    }
                }
                j1 += 128 - l3;
                k1 += 128 - l3 - j3;
            }
            aClass34_1267.method273(-781, 637, 0, super.aGraphics13);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("27482, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public URL getCodeBase()
    {
        if(Signlink.mainapp != null)
        {
            return Signlink.mainapp.getCodeBase();
        }
        try
        {
            if(super.aFrame_Sub1_16 != null)
            {
                return new URL("http://127.0.0.1:" + (80 + anInt1233));
            }
        }
        catch(Exception _ex)
        {
        }
        return super.getCodeBase();
    }

    public void method85(boolean flag, int i)
    {
        try
        {
            if(!flag)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            Signlink.wavevol = i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("41016, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method86(int i, int j, int k, byte byte0, int l, int i1)
    {
        try
        {
            int j1 = aClass36_1192.method304(l, i, j);
            if(j1 != 0)
            {
                int k1 = aClass36_1192.method308(l, i, j, j1);
                int j2 = k1 >> 6 & 3;
                int l2 = k1 & 0x1f;
                int j3 = k;
                if(j1 > 0)
                {
                    j3 = i1;
                }
                int ai[] = aClass44_Sub3_Sub1_Sub2_913.anIntArray1448;
                int j4 = 24624 + i * 4 + (103 - j) * 512 * 4;
                int l4 = j1 >> 14 & 0x7fff;
                Class8 class8_2 = Class8.method199(l4);
                if(class8_2.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_2 = aClass44_Sub3_Sub1_Sub3Array1241[class8_2.anInt236];
                    if(class44_sub3_sub1_sub3_2 != null)
                    {
                        int l5 = (class8_2.anInt222 * 4 - class44_sub3_sub1_sub3_2.anInt1460) / 2;
                        int i6 = (class8_2.anInt223 * 4 - class44_sub3_sub1_sub3_2.anInt1461) / 2;
                        class44_sub3_sub1_sub3_2.method453(48 + (104 - j - class8_2.anInt223) * 4 + i6, aByte1213, 48 + i * 4 + l5);
                    }
                } else
                {
                    if(l2 == 0 || l2 == 2)
                    {
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                            ai[j4 + 512] = j3;
                            ai[j4 + 1024] = j3;
                            ai[j4 + 1536] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4] = j3;
                            ai[j4 + 1] = j3;
                            ai[j4 + 2] = j3;
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 3] = j3;
                            ai[j4 + 3 + 512] = j3;
                            ai[j4 + 3 + 1024] = j3;
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 3)
                        {
                            ai[j4 + 1536] = j3;
                            ai[j4 + 1536 + 1] = j3;
                            ai[j4 + 1536 + 2] = j3;
                            ai[j4 + 1536 + 3] = j3;
                        }
                    }
                    if(l2 == 3)
                    {
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 3)
                        {
                            ai[j4 + 1536] = j3;
                        }
                    }
                    if(l2 == 2)
                    {
                        if(j2 == 3)
                        {
                            ai[j4] = j3;
                            ai[j4 + 512] = j3;
                            ai[j4 + 1024] = j3;
                            ai[j4 + 1536] = j3;
                        } else
                        if(j2 == 0)
                        {
                            ai[j4] = j3;
                            ai[j4 + 1] = j3;
                            ai[j4 + 2] = j3;
                            ai[j4 + 3] = j3;
                        } else
                        if(j2 == 1)
                        {
                            ai[j4 + 3] = j3;
                            ai[j4 + 3 + 512] = j3;
                            ai[j4 + 3 + 1024] = j3;
                            ai[j4 + 3 + 1536] = j3;
                        } else
                        if(j2 == 2)
                        {
                            ai[j4 + 1536] = j3;
                            ai[j4 + 1536 + 1] = j3;
                            ai[j4 + 1536 + 2] = j3;
                            ai[j4 + 1536 + 3] = j3;
                        }
                    }
                }
            }
            j1 = aClass36_1192.method306(l, i, j);
            if(j1 != 0)
            {
                int l1 = aClass36_1192.method308(l, i, j, j1);
                int k2 = l1 >> 6 & 3;
                int i3 = l1 & 0x1f;
                int k3 = j1 >> 14 & 0x7fff;
                Class8 class8_1 = Class8.method199(k3);
                if(class8_1.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = aClass44_Sub3_Sub1_Sub3Array1241[class8_1.anInt236];
                    if(class44_sub3_sub1_sub3_1 != null)
                    {
                        int i5 = (class8_1.anInt222 * 4 - class44_sub3_sub1_sub3_1.anInt1460) / 2;
                        int j5 = (class8_1.anInt223 * 4 - class44_sub3_sub1_sub3_1.anInt1461) / 2;
                        class44_sub3_sub1_sub3_1.method453(48 + (104 - j - class8_1.anInt223) * 4 + j5, aByte1213, 48 + i * 4 + i5);
                    }
                } else
                if(i3 == 9)
                {
                    int k4 = 0xeeeeee;
                    if(j1 > 0)
                    {
                        k4 = 0xee0000;
                    }
                    int ai1[] = aClass44_Sub3_Sub1_Sub2_913.anIntArray1448;
                    int k5 = 24624 + i * 4 + (103 - j) * 512 * 4;
                    if(k2 == 0 || k2 == 2)
                    {
                        ai1[k5 + 1536] = k4;
                        ai1[k5 + 1024 + 1] = k4;
                        ai1[k5 + 512 + 2] = k4;
                        ai1[k5 + 3] = k4;
                    } else
                    {
                        ai1[k5] = k4;
                        ai1[k5 + 512 + 1] = k4;
                        ai1[k5 + 1024 + 2] = k4;
                        ai1[k5 + 1536 + 3] = k4;
                    }
                }
            }
            j1 = aClass36_1192.method307(l, i, j);
            if(byte0 == 5)
            {
                byte0 = 0;
            } else
            {
                aBoolean1262 = !aBoolean1262;
            }
            if(j1 != 0)
            {
                int i2 = j1 >> 14 & 0x7fff;
                Class8 class8 = Class8.method199(i2);
                if(class8.anInt236 != -1)
                {
                    Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = aClass44_Sub3_Sub1_Sub3Array1241[class8.anInt236];
                    if(class44_sub3_sub1_sub3 != null)
                    {
                        int l3 = (class8.anInt222 * 4 - class44_sub3_sub1_sub3.anInt1460) / 2;
                        int i4 = (class8.anInt223 * 4 - class44_sub3_sub1_sub3.anInt1461) / 2;
                        class44_sub3_sub1_sub3.method453(48 + (104 - j - class8.anInt223) * 4 + i4, aByte1213, 48 + i * 4 + l3);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("97581, " + i + ", " + j + ", " + k + ", " + byte0 + ", " + l + ", " + i1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method87(int i)
    {
        try
        {
            if(aClass34_1263 != null)
            {
                return;
            }
            super.aClass34_14 = null;
            aClass34_1198 = null;
            aClass34_1196 = null;
            aClass34_1195 = null;
            aClass34_1197 = null;
            aClass34_858 = null;
            aClass34_859 = null;
            aClass34_860 = null;
            aClass34_1266 = new Class34(method11(7), 128, 265, 2);
            i = 40 / i;
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1267 = new Class34(method11(7), 128, 265, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1263 = new Class34(method11(7), 509, 171, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1264 = new Class34(method11(7), 360, 132, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1265 = new Class34(method11(7), 360, 200, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1268 = new Class34(method11(7), 202, 238, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1269 = new Class34(method11(7), 203, 238, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1270 = new Class34(method11(7), 74, 94, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            aClass34_1271 = new Class34(method11(7), 75, 94, 2);
            Class44_Sub3_Sub1.method409((byte)127);
            if(aClass47_1117 != null)
            {
                method68(0);
                method48(-532);
            }
            aBoolean908 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("94767, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method88(Class5 class5, int i)
    {
        try
        {
            if(i != 0)
            {
                throw new NullPointerException();
            }
            if(class5.anIntArray116 == null)
            {
                return false;
            }
            for(int j = 0; j < class5.anIntArray116.length; j++)
            {
                int k = method94(j, aByte1086, class5);
                int l = class5.anIntArray117[j];
                if(class5.anIntArray116[j] == 2)
                {
                    if(k >= l)
                    {
                        return false;
                    }
                } else
                if(class5.anIntArray116[j] == 3)
                {
                    if(k <= l)
                    {
                        return false;
                    }
                } else
                if(class5.anIntArray116[j] == 4)
                {
                    if(k == l)
                    {
                        return false;
                    }
                } else
                if(k != l)
                {
                    return false;
                }
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20821, " + class5 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method89(int i)
    {
        try
        {
            int j = aClass44_Sub3_Sub1_Sub4_1257.method457("Choose Option", true);
            for(int k = 0; k < anInt971; k++)
            {
                int l = aClass44_Sub3_Sub1_Sub4_1257.method457(aStringArray897[k], true);
                if(l > j)
                {
                    j = l;
                }
            }
            j += 8;
            if(i != 0)
            {
                aBoolean1036 = !aBoolean1036;
            }
            int i1 = 15 * anInt971 + 21;
            if(super.anInt28 > 4 && super.anInt29 > 4 && super.anInt28 < 516 && super.anInt29 < 338)
            {
                int j1 = super.anInt28 - 4 - j / 2;
                if(j1 + j > 512)
                {
                    j1 = 512 - j;
                }
                if(j1 < 0)
                {
                    j1 = 0;
                }
                int i2 = super.anInt29 - 4;
                if(i2 + i1 > 334)
                {
                    i2 = 334 - i1;
                }
                if(i2 < 0)
                {
                    i2 = 0;
                }
                aBoolean946 = true;
                anInt1030 = 0;
                anInt1031 = j1;
                anInt1032 = i2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
            }
            if(super.anInt28 > 553 && super.anInt29 > 205 && super.anInt28 < 743 && super.anInt29 < 466)
            {
                int k1 = super.anInt28 - 553 - j / 2;
                if(k1 < 0)
                {
                    k1 = 0;
                } else
                if(k1 + j > 190)
                {
                    k1 = 190 - j;
                }
                int j2 = super.anInt29 - 205;
                if(j2 < 0)
                {
                    j2 = 0;
                } else
                if(j2 + i1 > 261)
                {
                    j2 = 261 - i1;
                }
                aBoolean946 = true;
                anInt1030 = 1;
                anInt1031 = k1;
                anInt1032 = j2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
            }
            if(super.anInt28 > 17 && super.anInt29 > 357 && super.anInt28 < 496 && super.anInt29 < 453)
            {
                int l1 = super.anInt28 - 17 - j / 2;
                if(l1 < 0)
                {
                    l1 = 0;
                } else
                if(l1 + j > 479)
                {
                    l1 = 479 - j;
                }
                int k2 = super.anInt29 - 357;
                if(k2 < 0)
                {
                    k2 = 0;
                } else
                if(k2 + i1 > 96)
                {
                    k2 = 96 - i1;
                }
                aBoolean946 = true;
                anInt1030 = 2;
                anInt1031 = l1;
                anInt1032 = k2;
                anInt1033 = j;
                anInt1034 = 15 * anInt971 + 22;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("90690, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method90(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j)
    {
        try
        {
            while(true)
            {
                if(class44_sub3_sub2.anInt1393 + 10 >= i * 8)
                {
                    break;
                }
                int k = class44_sub3_sub2.method493(11, false);
                if(k == 2047)
                {
                    break;
                }
                if(aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k] == null)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k] = new Class44_Sub3_Sub4_Sub6_Sub1();
                    if(aClass44_Sub3_Sub2Array1230[k] != null)
                    {
                        aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k].method537(false, aClass44_Sub3_Sub2Array1230[k]);
                    }
                }
                anIntArray1227[anInt1226++] = k;
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k];
                class44_sub3_sub4_sub6_sub1.anInt1660 = anInt1240;
                int l = class44_sub3_sub2.method493(5, false);
                if(l > 15)
                {
                    l -= 32;
                }
                int i1 = class44_sub3_sub2.method493(5, false);
                if(i1 > 15)
                {
                    i1 -= 32;
                }
                int j1 = class44_sub3_sub2.method493(1, false);
                class44_sub3_sub4_sub6_sub1.method532(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0] + l, j1 == 1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0] + i1, aByte925);
                int k1 = class44_sub3_sub2.method493(1, false);
                if(k1 == 1)
                {
                    anIntArray1229[anInt1228++] = k;
                }
            }
            class44_sub3_sub2.method494((byte)4);
            if(j != 0)
            {
                anInt958 = 328;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("29713, " + i + ", " + class44_sub3_sub2 + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method91(int i, int j, int k, int l)
    {
        try
        {
            l = 95 / l;
            int i1 = 256 - k;
            return ((i & 0xff00ff) * i1 + (j & 0xff00ff) * k & 0xff00ff00) + ((i & 0xff00) * i1 + (j & 0xff00) * k & 0xff0000) >> 8;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("66303, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method92(int i, int j)
    {
        Class28 class28 = aClass28ArrayArrayArray1146[anInt1155][i][j];
        if(class28 == null)
        {
            aClass36_1192.method299(anInt1155, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Object obj = null;
        for(Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2)class28.method259(); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2)class28.method261(false))
        {
            Class14 class14 = Class14.method220(class44_sub3_sub4_sub2.anInt1495);
            int l = class14.anInt343;
            if(class14.aBoolean342)
            {
                l *= class44_sub3_sub4_sub2.anInt1496 + 1;
            }
            if(l > k)
            {
                k = l;
                obj = class44_sub3_sub4_sub2;
            }
        }
        class28.method257(((Class44) (obj)), -12925);
        Object obj1 = null;
        Object obj2 = null;
        for(Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2)class28.method259(); class44_sub3_sub4_sub2_1 != null; class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2)class28.method261(false))
        {
            if(class44_sub3_sub4_sub2_1.anInt1495 != ((Class44_Sub3_Sub4_Sub2) (obj)).anInt1495 && obj1 == null)
            {
                obj1 = class44_sub3_sub4_sub2_1;
            }
            if(class44_sub3_sub4_sub2_1.anInt1495 != ((Class44_Sub3_Sub4_Sub2) (obj)).anInt1495 && class44_sub3_sub4_sub2_1.anInt1495 != ((Class44_Sub3_Sub4_Sub2) (obj1)).anInt1495 && obj2 == null)
            {
                obj2 = class44_sub3_sub4_sub2_1;
            }
        }
        int i1 = i + (j << 7) + 0x60000000;
        aClass36_1192.method285(j, i1, ((Class44_Sub3_Sub4) (obj1)), i, (byte)2, ((Class44_Sub3_Sub4) (obj2)), anInt1155, method51(false, j * 128 + 64, i * 128 + 64, anInt1155), ((Class44_Sub3_Sub4) (obj)));
    }

    public void method93(boolean flag)
    {
        try
        {
            if(flag)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            do
            {
                Class44_Sub3_Sub3 class44_sub3_sub3;
                do
                {
                    class44_sub3_sub3 = aClass43_Sub1_814.method394();
                    if(class44_sub3_sub3 == null)
                    {
                        return;
                    }
                    if(class44_sub3_sub3.anInt1405 == 0)
                    {
                        Class44_Sub3_Sub4_Sub4.method504(class44_sub3_sub3.aByteArray1407, class44_sub3_sub3.anInt1406, (byte)23);
                        if((aClass43_Sub1_814.method390(class44_sub3_sub3.anInt1406, -600) & 0x62) != 0)
                        {
                            aBoolean898 = true;
                            if(anInt1253 != -1)
                            {
                                aBoolean1049 = true;
                            }
                        }
                    }
                    if(class44_sub3_sub3.anInt1405 == 1 && class44_sub3_sub3.aByteArray1407 != null)
                    {
                        Class11.method208(2, class44_sub3_sub3.aByteArray1407);
                    }
                    if(class44_sub3_sub3.anInt1405 == 2 && class44_sub3_sub3.anInt1406 == anInt1190 && class44_sub3_sub3.aByteArray1407 != null)
                    {
                        method33((byte)27, class44_sub3_sub3.aByteArray1407, aBoolean1191);
                    }
                    if(class44_sub3_sub3.anInt1405 == 3 && anInt882 == 1)
                    {
                        for(int i = 0; i < aByteArrayArray981.length; i++)
                        {
                            if(anIntArray1040[i] == class44_sub3_sub3.anInt1406)
                            {
                                aByteArrayArray981[i] = class44_sub3_sub3.aByteArray1407;
                                if(class44_sub3_sub3.aByteArray1407 == null)
                                {
                                    anIntArray1040[i] = -1;
                                }
                                break;
                            }
                            if(anIntArray1041[i] != class44_sub3_sub3.anInt1406)
                            {
                                continue;
                            }
                            aByteArrayArray973[i] = class44_sub3_sub3.aByteArray1407;
                            if(class44_sub3_sub3.aByteArray1407 == null)
                            {
                                anIntArray1041[i] = -1;
                            }
                            break;
                        }
                    }
                } while(class44_sub3_sub3.anInt1405 != 93 || !aClass43_Sub1_814.method389(class44_sub3_sub3.anInt1406, anInt857));
                Class3.method160(aClass43_Sub1_814, new Class44_Sub3_Sub2(class44_sub3_sub3.aByteArray1407, 15787), anInt1247);
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("44515, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method94(int i, byte byte0, Class5 class5)
    {
        try
        {
            if(byte0 != aByte884)
            {
                aClass44_Sub3_Sub2_850.method472(14);
            }
            if(class5.anIntArrayArray115 == null || i >= class5.anIntArrayArray115.length)
            {
                return -2;
            }
            try
            {
                int ai[] = class5.anIntArrayArray115[i];
                int j = 0;
                int k = 0;
                int l = 0;
                do
                {
                    int i1 = ai[k++];
                    int j1 = 0;
                    byte byte1 = 0;
                    if(i1 == 0)
                    {
                        return j;
                    }
                    if(i1 == 1)
                    {
                        j1 = anIntArray1035[ai[k++]];
                    }
                    if(i1 == 2)
                    {
                        j1 = anIntArray1090[ai[k++]];
                    }
                    if(i1 == 3)
                    {
                        j1 = anIntArray851[ai[k++]];
                    }
                    if(i1 == 4)
                    {
                        Class5 class5_1 = Class5.aClass5Array100[ai[k++]];
                        int j2 = ai[k++];
                        if(j2 >= 0 && j2 < Class14.anInt323 && (!Class14.method220(j2).aBoolean344 || aBoolean1234))
                        {
                            for(int i3 = 0; i3 < class5_1.anIntArray101.length; i3++)
                            {
                                if(class5_1.anIntArray101[i3] == j2 + 1)
                                {
                                    j1 += class5_1.anIntArray102[i3];
                                }
                            }
                        }
                    }
                    if(i1 == 5)
                    {
                        j1 = anIntArray1214[ai[k++]];
                    }
                    if(i1 == 6)
                    {
                        j1 = anIntArray984[anIntArray1090[ai[k++]] - 1];
                    }
                    if(i1 == 7)
                    {
                        j1 = (anIntArray1214[ai[k++]] * 100) / 46875;
                    }
                    if(i1 == 8)
                    {
                        j1 = aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1678;
                    }
                    if(i1 == 9)
                    {
                        for(int k1 = 0; k1 < Class29.anInt536; k1++)
                        {
                            if(Class29.aBooleanArray538[k1])
                            {
                                j1 += anIntArray1090[k1];
                            }
                        }
                    }
                    if(i1 == 10)
                    {
                        Class5 class5_2 = Class5.aClass5Array100[ai[k++]];
                        int k2 = ai[k++] + 1;
                        if(k2 >= 0 && k2 < Class14.anInt323 && (!Class14.method220(k2).aBoolean344 || aBoolean1234))
                        {
                            for(int j3 = 0; j3 < class5_2.anIntArray101.length; j3++)
                            {
                                if(class5_2.anIntArray101[j3] != k2)
                                {
                                    continue;
                                }
                                j1 = 0x3b9ac9ff;
                                break;
                            }
                        }
                    }
                    if(i1 == 11)
                    {
                        j1 = anInt936;
                    }
                    if(i1 == 12)
                    {
                        j1 = anInt1205;
                    }
                    if(i1 == 13)
                    {
                        int l1 = anIntArray1214[ai[k++]];
                        int l2 = ai[k++];
                        j1 = (l1 & 1 << l2) == 0 ? 0 : 1;
                    }
                    if(i1 == 14)
                    {
                        int i2 = ai[k++];
                        Class35 class35 = Class35.aClass35Array590[i2];
                        int k3 = class35.anInt592;
                        int l3 = class35.anInt593;
                        int i4 = class35.anInt594;
                        int j4 = anIntArray1088[i4 - l3];
                        j1 = anIntArray1214[k3] >> l3 & j4;
                    }
                    if(i1 == 15)
                    {
                        byte1 = 1;
                    }
                    if(i1 == 16)
                    {
                        byte1 = 2;
                    }
                    if(i1 == 17)
                    {
                        byte1 = 3;
                    }
                    if(i1 == 18)
                    {
                        j1 = (((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 >> 7) + anInt1184;
                    }
                    if(i1 == 19)
                    {
                        j1 = (((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 >> 7) + anInt1185;
                    }
                    if(i1 == 20)
                    {
                        j1 = ai[k++];
                    }
                    if(byte1 == 0)
                    {
                        if(l == 0)
                        {
                            j += j1;
                        }
                        if(l == 1)
                        {
                            j -= j1;
                        }
                        if(l == 2 && j1 != 0)
                        {
                            j /= j1;
                        }
                        if(l == 3)
                        {
                            j *= j1;
                        }
                        l = 0;
                    } else
                    {
                        l = byte1;
                    }
                } while(true);
            }
            catch(Exception _ex)
            {
                return -1;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("71115, " + i + ", " + byte0 + ", " + class5 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method95(int i, long l)
    {
        try
        {
            if(l == 0L)
            {
                return;
            }
            if(anInt1104 >= 100 && anInt1089 != 1)
            {
                method17(0, (byte)-115, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
                return;
            }
            if(anInt1104 >= 200)
            {
                method17(0, (byte)-115, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
                return;
            }
            String s = Class48.method554(Class48.method551(l, true), true);
            for(int j = 0; j < anInt1104; j++)
            {
                if(aLongArray979[j] == l)
                {
                    method17(0, (byte)-115, s + " is already on your friend list", "");
                    return;
                }
            }
            for(int k = 0; k < anInt957; k++)
            {
                if(aLongArray1254[k] == l)
                {
                    method17(0, (byte)-115, "Please remove " + s + " from your ignore list first", "");
                    return;
                }
            }
            if(s.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672))
            {
                return;
            }
            aStringArray1044[anInt1104] = s;
            aLongArray979[anInt1104] = l;
            anIntArray894[anInt1104] = 0;
            if(i != 0)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            anInt1104++;
            aBoolean898 = true;
            aClass44_Sub3_Sub2_850.method471(-34003, 235);
            aClass44_Sub3_Sub2_850.method478(l, true);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("60470, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method96(String s, String s1, boolean flag)
    {
        Signlink.errorname = s;
        try
        {
            if(!flag)
            {
                aString1110 = "";
                aString1111 = "Connecting to server...";
                method66((byte)-21, true);
            }
            aClass7_1099 = new Class7(method34(43594 + anInt1233), 32596, this);
            long l = Class48.method550(s);
            int i = (int)(l >> 16 & 31L);
            aClass44_Sub3_Sub2_850.anInt1392 = 0;
            aClass44_Sub3_Sub2_850.method472(14);
            aClass44_Sub3_Sub2_850.method472(i);
            aClass7_1099.method195(0, aClass44_Sub3_Sub2_850.aByteArray1391, 2, 2);
            for(int j = 0; j < 8; j++)
            {
                aClass7_1099.method192();
            }
            int k = aClass7_1099.method192();
            if(k == 0)
            {
                aClass7_1099.method194(aClass44_Sub3_Sub2_1132.aByteArray1391, 0, 8);
                aClass44_Sub3_Sub2_1132.anInt1392 = 0;
                aLong813 = aClass44_Sub3_Sub2_1132.method488(true);
                int ai[] = new int[4];
                ai[0] = (int)(Math.random() * 99999999D);
                ai[1] = (int)(Math.random() * 99999999D);
                ai[2] = (int)(aLong813 >> 32);
                ai[3] = (int)aLong813;
                aClass44_Sub3_Sub2_850.anInt1392 = 0;
                aClass44_Sub3_Sub2_850.method472(10);
                aClass44_Sub3_Sub2_850.method476(ai[0]);
                aClass44_Sub3_Sub2_850.method476(ai[1]);
                aClass44_Sub3_Sub2_850.method476(ai[2]);
                aClass44_Sub3_Sub2_850.method476(ai[3]);
                aClass44_Sub3_Sub2_850.method476(Signlink.uid);
                aClass44_Sub3_Sub2_850.method479(s);
                aClass44_Sub3_Sub2_850.method479(s1);
                aClass44_Sub3_Sub2_850.encrypt(rsaKey, rsaModulus);
                aClass44_Sub3_Sub2_822.anInt1392 = 0;
                if(flag)
                {
                    aClass44_Sub3_Sub2_822.method472(18);
                } else
                {
                    aClass44_Sub3_Sub2_822.method472(16);
                }
                aClass44_Sub3_Sub2_822.method472(aClass44_Sub3_Sub2_850.anInt1392 + 36 + 1 + 1 + 2);
                aClass44_Sub3_Sub2_822.method472(255);
                aClass44_Sub3_Sub2_822.method473(289);
                aClass44_Sub3_Sub2_822.method472(aBoolean1235 ? 1 : 0);
                for(int k1 = 0; k1 < 9; k1++)
                {
                    aClass44_Sub3_Sub2_822.method476(anIntArray1051[k1]);
                }
                aClass44_Sub3_Sub2_822.method480(aClass44_Sub3_Sub2_850.aByteArray1391, aClass44_Sub3_Sub2_850.anInt1392, 0, true);
                aClass44_Sub3_Sub2_850.aClass46_1396 = new Class46(ai, (byte)-23);
                for(int i2 = 0; i2 < 4; i2++)
                {
                    ai[i2] += 50;
                }
                aClass46_927 = new Class46(ai, (byte)-23);
                aClass7_1099.method195(0, aClass44_Sub3_Sub2_822.aByteArray1391, 2, aClass44_Sub3_Sub2_822.anInt1392);
                k = aClass7_1099.method192();
            }
            if(k == 1)
            {
                try
                {
                    Thread.sleep(2000L);
                }
                catch(Exception _ex)
                {
                }
                method96(s, s1, flag);
                return;
            }
            if(k == 2)
            {
                anInt1188 = aClass7_1099.method192();
                aBoolean937 = aClass7_1099.method192() == 1;
                aLong1181 = 0L;
                anInt819 = 0;
                aClass10_866.anInt259 = 0;
                super.aBoolean18 = true;
                aBoolean934 = true;
                aBoolean863 = true;
                aClass44_Sub3_Sub2_850.anInt1392 = 0;
                aClass44_Sub3_Sub2_1132.anInt1392 = 0;
                anInt1170 = -1;
                anInt1067 = -1;
                anInt1068 = -1;
                anInt1069 = -1;
                anInt1169 = 0;
                anInt1171 = 0;
                anInt998 = 0;
                anInt1173 = 0;
                anInt1005 = 0;
                anInt971 = 0;
                aBoolean946 = false;
                super.anInt19 = 0;
                for(int i1 = 0; i1 < 100; i1++)
                {
                    aStringArray1004[i1] = null;
                }
                anInt952 = 0;
                anInt994 = 0;
                anInt882 = 0;
                anInt968 = 0;
                anInt1011 = (int)(Math.random() * 100D) - 50;
                anInt1215 = (int)(Math.random() * 110D) - 55;
                anInt1106 = (int)(Math.random() * 80D) - 40;
                anInt959 = (int)(Math.random() * 120D) - 60;
                anInt1075 = (int)(Math.random() * 30D) - 20;
                anInt930 = (int)(Math.random() * 20D) - 10 & 0x7ff;
                anInt848 = 0;
                anInt1063 = -1;
                anInt911 = 0;
                anInt912 = 0;
                anInt1226 = 0;
                anInt1009 = 0;
                for(int l1 = 0; l1 < anInt1223; l1++)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub1Array1225[l1] = null;
                    aClass44_Sub3_Sub2Array1230[l1] = null;
                }
                for(int j2 = 0; j2 < 16384; j2++)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j2] = null;
                }
                aClass44_Sub3_Sub4_Sub6_Sub1_1047 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anInt1224] = new Class44_Sub3_Sub4_Sub6_Sub1();
                aClass28_918.method263();
                aClass28_1054.method263();
                for(int k2 = 0; k2 < 4; k2++)
                {
                    for(int l2 = 0; l2 < 104; l2++)
                    {
                        for(int j3 = 0; j3 < 104; j3++)
                        {
                            aClass28ArrayArrayArray1146[k2][l2][j3] = null;
                        }
                    }
                }
                aClass28_1116 = new Class28(-199);
                anInt1105 = 0;
                anInt1104 = 0;
                anInt965 = -1;
                anInt1253 = -1;
                anInt1199 = -1;
                anInt889 = -1;
                anInt924 = -1;
                aBoolean935 = false;
                anInt1027 = 3;
                aBoolean980 = false;
                aBoolean946 = false;
                aBoolean1222 = false;
                aString823 = null;
                anInt1112 = 0;
                anInt833 = -1;
                aBoolean1179 = true;
                method70(aByte883);
                for(int i3 = 0; i3 < 5; i3++)
                {
                    anIntArray938[i3] = 0;
                }
                for(int k3 = 0; k3 < 5; k3++)
                {
                    aStringArray919[k3] = null;
                    aBooleanArray920[k3] = false;
                }
                anInt1238 = 0;
                anInt1180 = 0;
                anInt986 = 0;
                anInt870 = 0;
                anInt821 = 0;
                anInt1274 = 0;
                anInt1114 = 0;
                anInt1046 = 0;
                anInt1100 = 0;
                anInt845 = 0;
                method60(817);
                return;
            }
            if(k == 3)
            {
                aString1110 = "";
                aString1111 = "Invalid username or password.";
                return;
            }
            if(k == 4)
            {
                aString1110 = "Your account has been disabled.";
                aString1111 = "Please check your message-centre for details.";
                return;
            }
            if(k == 5)
            {
                aString1110 = "Your account is already logged in.";
                aString1111 = "Try again in 60 secs...";
                return;
            }
            if(k == 6)
            {
                aString1110 = "RuneScape has been updated!";
                aString1111 = "Please reload this page.";
                return;
            }
            if(k == 7)
            {
                aString1110 = "This world is full.";
                aString1111 = "Please use a different world.";
                return;
            }
            if(k == 8)
            {
                aString1110 = "Unable to connect.";
                aString1111 = "Login server offline.";
                return;
            }
            if(k == 9)
            {
                aString1110 = "Login limit exceeded.";
                aString1111 = "Too many connections from your address.";
                return;
            }
            if(k == 10)
            {
                aString1110 = "Unable to connect.";
                aString1111 = "Bad session id.";
                return;
            }
            if(k == 11)
            {
                aString1111 = "Login server rejected session.";
                aString1111 = "Please try again.";
                return;
            }
            if(k == 12)
            {
                aString1110 = "You need a members account to login to this world.";
                aString1111 = "Please subscribe, or use a different world.";
                return;
            }
            if(k == 13)
            {
                aString1110 = "Could not complete login.";
                aString1111 = "Please try using a different world.";
                return;
            }
            if(k == 14)
            {
                aString1110 = "The server is being updated.";
                aString1111 = "Please wait 1 minute and try again.";
                return;
            }
            if(k == 15)
            {
                aBoolean863 = true;
                aClass44_Sub3_Sub2_850.anInt1392 = 0;
                aClass44_Sub3_Sub2_1132.anInt1392 = 0;
                anInt1170 = -1;
                anInt1067 = -1;
                anInt1068 = -1;
                anInt1069 = -1;
                anInt1169 = 0;
                anInt1171 = 0;
                anInt998 = 0;
                anInt971 = 0;
                aBoolean946 = false;
                aLong1070 = System.currentTimeMillis();
                return;
            }
            if(k == 16)
            {
                aString1110 = "Login attempts exceeded.";
                aString1111 = "Please wait 1 minute and try again.";
                return;
            }
            if(k == 17)
            {
                aString1110 = "You are standing in a members-only area.";
                aString1111 = "To play on this world move to a free area first";
                return;
            }
            if(k == 20)
            {
                aString1110 = "Invalid loginserver requested";
                aString1111 = "Please try using a different world.";
                return;
            }
            if(k == 21)
            {
                for(int j1 = aClass7_1099.method192(); j1 >= 0; j1--)
                {
                    aString1110 = "You have only just left another world";
                    aString1111 = "Your profile will be transferred in: " + j1 + " seconds";
                    method66((byte)-21, true);
                    try
                    {
                        Thread.sleep(1000L);
                    }
                    catch(Exception _ex)
                    {
                    }
                }
                method96(s, s1, flag);
                return;
            }
            if(k == -1)
            {
                aString1110 = "No response from server";
                aString1111 = "Please try using a different world.";
                return;
            } else
            {
                System.out.println("response:" + k);
                aString1110 = "Unexpected server response";
                aString1111 = "Please try using a different world.";
                return;
            }
        }
        catch(IOException _ex)
        {
            aString1110 = "";
        }
        aString1111 = "Error connecting to server.";
    }

    public void method97(byte byte0)
    {
        try
        {
            if(byte0 != 122)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            if(anInt1014 == 0)
            {
                int i = super.anInt11 / 2 - 80;
                int l = super.anInt12 / 2 + 20;
                l += 20;
                if(super.anInt27 == 1 && super.anInt28 >= i - 75 && super.anInt28 <= i + 75 && super.anInt29 >= l - 20 && super.anInt29 <= l + 20)
                {
                    anInt1014 = 3;
                    anInt831 = 0;
                }
                i = super.anInt11 / 2 + 80;
                if(super.anInt27 == 1 && super.anInt28 >= i - 75 && super.anInt28 <= i + 75 && super.anInt29 >= l - 20 && super.anInt29 <= l + 20)
                {
                    aString1110 = "";
                    aString1111 = "Enter your username & password.";
                    anInt1014 = 2;
                    anInt831 = 0;
                    return;
                }
            } else
            {
                if(anInt1014 == 2)
                {
                    int j = super.anInt12 / 2 - 40;
                    j += 30;
                    j += 25;
                    if(super.anInt27 == 1 && super.anInt29 >= j - 15 && super.anInt29 < j)
                    {
                        anInt831 = 0;
                    }
                    j += 15;
                    if(super.anInt27 == 1 && super.anInt29 >= j - 15 && super.anInt29 < j)
                    {
                        anInt831 = 1;
                    }
                    j += 15;
                    int i1 = super.anInt11 / 2 - 80;
                    int k1 = super.anInt12 / 2 + 50;
                    k1 += 20;
                    if(super.anInt27 == 1 && super.anInt28 >= i1 - 75 && super.anInt28 <= i1 + 75 && super.anInt29 >= k1 - 20 && super.anInt29 <= k1 + 20)
                    {
                        method96(aString1071, aString1072, false);
                        if(aBoolean863)
                        {
                            return;
                        }
                    }
                    i1 = super.anInt11 / 2 + 80;
                    if(super.anInt27 == 1 && super.anInt28 >= i1 - 75 && super.anInt28 <= i1 + 75 && super.anInt29 >= k1 - 20 && super.anInt29 <= k1 + 20)
                    {
                        anInt1014 = 0;
                        aString1071 = "";
                        aString1072 = "";
                    }
                    do
                    {
                        int l1 = method5(-128);
                        if(l1 == -1)
                        {
                            break;
                        }
                        boolean flag = false;
                        for(int i2 = 0; i2 < aString966.length(); i2++)
                        {
                            if(l1 != aString966.charAt(i2))
                            {
                                continue;
                            }
                            flag = true;
                            break;
                        }
                        if(anInt831 == 0)
                        {
                            if(l1 == 8 && aString1071.length() > 0)
                            {
                                aString1071 = aString1071.substring(0, aString1071.length() - 1);
                            }
                            if(l1 == 9 || l1 == 10 || l1 == 13)
                            {
                                anInt831 = 1;
                            }
                            if(flag)
                            {
                                aString1071 += (char)l1;
                            }
                            if(aString1071.length() > 12)
                            {
                                aString1071 = aString1071.substring(0, 12);
                            }
                        } else
                        if(anInt831 == 1)
                        {
                            if(l1 == 8 && aString1072.length() > 0)
                            {
                                aString1072 = aString1072.substring(0, aString1072.length() - 1);
                            }
                            if(l1 == 9 || l1 == 10 || l1 == 13)
                            {
                                anInt831 = 0;
                            }
                            if(flag)
                            {
                                aString1072 += (char)l1;
                            }
                            if(aString1072.length() > 20)
                            {
                                aString1072 = aString1072.substring(0, 20);
                            }
                        }
                    } while(true);
                    return;
                }
                if(anInt1014 == 3)
                {
                    int k = super.anInt11 / 2;
                    int j1 = super.anInt12 / 2 + 50;
                    j1 += 20;
                    if(super.anInt27 == 1 && super.anInt28 >= k - 75 && super.anInt28 <= k + 75 && super.anInt29 >= j1 - 20 && super.anInt29 <= j1 + 20)
                    {
                        anInt1014 = 0;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("36554, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method98(int i, byte byte0)
    {
        try
        {
            String s = String.valueOf(i);
            for(int j = s.length() - 3; j > 0; j -= 3)
            {
                s = s.substring(0, j) + "," + s.substring(j);
            }
            if(byte0 != 5)
            {
                throw new NullPointerException();
            }
            if(s.length() > 8)
            {
                s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
            } else
            if(s.length() > 4)
            {
                s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
            }
            return " " + s;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("6522, " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method99(byte byte0)
    {
        try
        {
            if(anInt1173 > 0)
            {
                method22((byte)25);
                return;
            }
            aClass34_1197.method272((byte)5);
            aClass44_Sub3_Sub1_Sub4_1256.method455(257, "Connection lost", -31546, 0, 144);
            aClass44_Sub3_Sub1_Sub4_1256.method455(256, "Connection lost", -31546, 0xffffff, 143);
            aClass44_Sub3_Sub1_Sub4_1256.method455(257, "Please wait - attempting to reestablish", -31546, 0, 159);
            aClass44_Sub3_Sub1_Sub4_1256.method455(256, "Please wait - attempting to reestablish", -31546, 0xffffff, 158);
            aClass34_1197.method273(-781, 4, 4, super.aGraphics13);
            anInt848 = 0;
            if(byte0 != 7)
            {
                return;
            }
            anInt911 = 0;
            Class7 class7 = aClass7_1099;
            aBoolean863 = false;
            method96(aString1071, aString1072, true);
            if(!aBoolean863)
            {
                method22((byte)25);
            }
            try
            {
                class7.method191();
                return;
            }
            catch(Exception _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("96492, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method100(int i, int j)
    {
        try
        {
            if(j != 656)
            {
                anInt958 = -353;
            }
            if(i < 0x186a0)
            {
                return String.valueOf(i);
            }
            if(i < 0x989680)
            {
                return i / 1000 + "K";
            } else
            {
                return i / 0xf4240 + "M";
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("1290, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method101(int i)
    {
        try
        {
            if(i >= 0)
            {
                return;
            }
            for(Class44_Sub1 class44_sub1 = (Class44_Sub1)aClass28_1116.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1)aClass28_1116.method261(false))
            {
                if(class44_sub1.anInt1334 == -1)
                {
                    class44_sub1.anInt1333 = 0;
                    method139(class44_sub1, false);
                } else
                {
                    class44_sub1.method404();
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("43758, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String method102(int i)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1147 = !aBoolean1147;
            }
            if(Signlink.mainapp != null)
            {
                return Signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            }
            if(super.aFrame_Sub1_16 != null)
            {
                return "runescape.com";
            } else
            {
                return super.getDocumentBase().getHost().toLowerCase();
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("16537, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method103(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j)
    {
        try
        {
            while(i >= 0)
            {
                return;
            }
            int k = class44_sub3_sub2.method493(8, false);
            if(k < anInt1226)
            {
                for(int l = k; l < anInt1226; l++)
                {
                    anIntArray941[anInt940++] = anIntArray1227[l];
                }
            }
            if(k > anInt1226)
            {
                Signlink.reporterror(aString1071 + " Too many players");
                throw new RuntimeException("eek");
            }
            anInt1226 = 0;
            for(int i1 = 0; i1 < k; i1++)
            {
                int j1 = anIntArray1227[i1];
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j1];
                int k1 = class44_sub3_sub2.method493(1, false);
                if(k1 == 0)
                {
                    anIntArray1227[anInt1226++] = j1;
                    class44_sub3_sub4_sub6_sub1.anInt1660 = anInt1240;
                } else
                {
                    int l1 = class44_sub3_sub2.method493(2, false);
                    if(l1 == 0)
                    {
                        anIntArray1227[anInt1226++] = j1;
                        class44_sub3_sub4_sub6_sub1.anInt1660 = anInt1240;
                        anIntArray1229[anInt1228++] = j1;
                    } else
                    if(l1 == 1)
                    {
                        anIntArray1227[anInt1226++] = j1;
                        class44_sub3_sub4_sub6_sub1.anInt1660 = anInt1240;
                        int i2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub1.method533(false, i2, anInt1153);
                        int k2 = class44_sub3_sub2.method493(1, false);
                        if(k2 == 1)
                        {
                            anIntArray1229[anInt1228++] = j1;
                        }
                    } else
                    if(l1 == 2)
                    {
                        anIntArray1227[anInt1226++] = j1;
                        class44_sub3_sub4_sub6_sub1.anInt1660 = anInt1240;
                        int j2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub1.method533(true, j2, anInt1153);
                        int l2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub1.method533(true, l2, anInt1153);
                        int i3 = class44_sub3_sub2.method493(1, false);
                        if(i3 == 1)
                        {
                            anIntArray1229[anInt1228++] = j1;
                        }
                    } else
                    if(l1 == 3)
                    {
                        anIntArray941[anInt940++] = j1;
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("48001, " + i + ", " + class44_sub3_sub2 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method104(int i, int j)
    {
        try
        {
            if(j != -44196)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            Class5 class5 = Class5.aClass5Array100[i];
            for(int k = 0; k < class5.anIntArray122.length; k++)
            {
                if(class5.anIntArray122[k] == -1)
                {
                    break;
                }
                Class5 class5_1 = Class5.aClass5Array100[class5.anIntArray122[k]];
                if(class5_1.anInt107 == 1)
                {
                    method104(class5_1.anInt105, -44196);
                }
                class5_1.anInt103 = 0;
                class5_1.anInt104 = 0;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("3125, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method105(boolean flag, int i, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            anInt940 = 0;
            anInt1228 = 0;
            method144(i, class44_sub3_sub2, anInt1202);
            method42((byte)-97, i, class44_sub3_sub2);
            method140(0, class44_sub3_sub2, i);
            if(!flag)
            {
                anInt1170 = class44_sub3_sub2.method482();
            }
            for(int j = 0; j < anInt940; j++)
            {
                int k = anIntArray941[j];
                if(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k])).anInt1660 != anInt1240)
                {
                    aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k].aClass12_1700 = null;
                    aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k] = null;
                }
            }
            if(class44_sub3_sub2.anInt1392 != i)
            {
                Signlink.reporterror(aString1071 + " size mismatch in getnpcpos - pos:" + class44_sub3_sub2.anInt1392 + " psize:" + i);
                throw new RuntimeException("eek");
            }
            for(int l = 0; l < anInt1009; l++)
            {
                if(aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[l]] == null)
                {
                    Signlink.reporterror(aString1071 + " null entry in npc list - pos:" + l + " size:" + anInt1009);
                    throw new RuntimeException("eek");
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("79159, " + flag + ", " + i + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method106(int i)
    {
        try
        {
            while(i >= 0)
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                if(super.anInt28 >= 539 && super.anInt28 <= 573 && super.anInt29 >= 169 && super.anInt29 < 205 && anIntArray1060[0] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 0;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 569 && super.anInt28 <= 599 && super.anInt29 >= 168 && super.anInt29 < 205 && anIntArray1060[1] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 1;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 597 && super.anInt28 <= 627 && super.anInt29 >= 168 && super.anInt29 < 205 && anIntArray1060[2] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 2;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 625 && super.anInt28 <= 669 && super.anInt29 >= 168 && super.anInt29 < 203 && anIntArray1060[3] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 3;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 666 && super.anInt28 <= 696 && super.anInt29 >= 168 && super.anInt29 < 205 && anIntArray1060[4] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 4;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 694 && super.anInt28 <= 724 && super.anInt29 >= 168 && super.anInt29 < 205 && anIntArray1060[5] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 5;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 722 && super.anInt28 <= 756 && super.anInt29 >= 169 && super.anInt29 < 205 && anIntArray1060[6] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 6;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 540 && super.anInt28 <= 574 && super.anInt29 >= 466 && super.anInt29 < 502 && anIntArray1060[7] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 7;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 572 && super.anInt28 <= 602 && super.anInt29 >= 466 && super.anInt29 < 503 && anIntArray1060[8] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 8;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 599 && super.anInt28 <= 629 && super.anInt29 >= 466 && super.anInt29 < 503 && anIntArray1060[9] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 9;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 627 && super.anInt28 <= 671 && super.anInt29 >= 467 && super.anInt29 < 502 && anIntArray1060[10] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 10;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 669 && super.anInt28 <= 699 && super.anInt29 >= 466 && super.anInt29 < 503 && anIntArray1060[11] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 11;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 696 && super.anInt28 <= 726 && super.anInt29 >= 466 && super.anInt29 < 503 && anIntArray1060[12] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 12;
                    aBoolean1154 = true;
                }
                if(super.anInt28 >= 724 && super.anInt28 <= 758 && super.anInt29 >= 466 && super.anInt29 < 502 && anIntArray1060[13] != -1)
                {
                    aBoolean898 = true;
                    anInt1027 = 13;
                    aBoolean1154 = true;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("63058, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method107(Class5 class5, boolean flag)
    {
        try
        {
            aBoolean863 &= flag;
            int i = class5.anInt109;
            if(i >= 1 && i <= 200 || i >= 701 && i <= 900)
            {
                if(i >= 801)
                {
                    i -= 701;
                } else
                if(i >= 701)
                {
                    i -= 601;
                } else
                if(i >= 101)
                {
                    i -= 101;
                } else
                {
                    i--;
                }
                aStringArray897[anInt971] = "Remove @whi@" + aStringArray1044[i];
                anIntArray839[anInt971] = 513;
                anInt971++;
                aStringArray897[anInt971] = "Message @whi@" + aStringArray1044[i];
                anIntArray839[anInt971] = 902;
                anInt971++;
                return true;
            }
            if(i >= 401 && i <= 500)
            {
                aStringArray897[anInt971] = "Remove @whi@" + class5.aString141;
                anIntArray839[anInt971] = 884;
                anInt971++;
                return true;
            } else
            {
                return false;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("1354, " + class5 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method108(int i)
    {
        try
        {
            i = 32 / i;
            for(int j = 0; j < anInt968; j++)
            {
                if(anIntArray1193[j] <= 0)
                {
                    boolean flag = false;
                    try
                    {
                        if(anIntArray846[j] == anInt900 && anIntArray1006[j] == anInt1177)
                        {
                            if(!method79((byte)9))
                            {
                                flag = true;
                            }
                        } else
                        {
                            Class44_Sub3_Sub2 class44_sub3_sub2 = Class4.method176(anIntArray1006[j], 7, anIntArray846[j]);
                            if(System.currentTimeMillis() + (long)(class44_sub3_sub2.anInt1392 / 22) > aLong1048 + (long)(anInt1028 / 22))
                            {
                                anInt1028 = class44_sub3_sub2.anInt1392;
                                aLong1048 = System.currentTimeMillis();
                                if(method146(class44_sub3_sub2.aByteArray1391, 0, class44_sub3_sub2.anInt1392))
                                {
                                    anInt900 = anIntArray846[j];
                                    anInt1177 = anIntArray1006[j];
                                } else
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                    catch(Exception exception)
                    {
                    }
                    if(!flag || anIntArray1193[j] == -5)
                    {
                        anInt968--;
                        for(int k = j; k < anInt968; k++)
                        {
                            anIntArray846[k] = anIntArray846[k + 1];
                            anIntArray1006[k] = anIntArray1006[k + 1];
                            anIntArray1193[k] = anIntArray1193[k + 1];
                        }
                        j--;
                    } else
                    {
                        anIntArray1193[j] = -5;
                    }
                } else
                {
                    anIntArray1193[j]--;
                }
            }
            if(anInt942 > 0)
            {
                anInt942 -= 20;
                if(anInt942 < 0)
                {
                    anInt942 = 0;
                }
                if(anInt942 == 0 && aBoolean1057 && !aBoolean1235)
                {
                    anInt1190 = anInt963;
                    aBoolean1191 = true;
                    aClass43_Sub1_814.method392(2, anInt1190);
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("64409, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method109(Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3, int i)
    {
        try
        {
            int j = 256;
            for(int k = 0; k < anIntArray1133.length; k++)
            {
                anIntArray1133[k] = 0;
            }
            for(int l = 0; l < 5000; l++)
            {
                int i1 = (int)(Math.random() * 128D * (double)j);
                anIntArray1133[i1] = (int)(Math.random() * 256D);
            }
            for(int j1 = 0; j1 < 20; j1++)
            {
                for(int k1 = 1; k1 < j - 1; k1++)
                {
                    for(int i2 = 1; i2 < 127; i2++)
                    {
                        int k2 = i2 + (k1 << 7);
                        anIntArray1134[k2] = (anIntArray1133[k2 - 1] + anIntArray1133[k2 + 1] + anIntArray1133[k2 - 128] + anIntArray1133[k2 + 128]) / 4;
                    }
                }
                int ai[] = anIntArray1133;
                anIntArray1133 = anIntArray1134;
                anIntArray1134 = ai;
            }
            if(i != 34809)
            {
                anInt1170 = -1;
            }
            if(class44_sub3_sub1_sub3 != null)
            {
                int l1 = 0;
                for(int j2 = 0; j2 < class44_sub3_sub1_sub3.anInt1461; j2++)
                {
                    for(int l2 = 0; l2 < class44_sub3_sub1_sub3.anInt1460; l2++)
                    {
                        if(class44_sub3_sub1_sub3.aByteArray1458[l1++] != 0)
                        {
                            int i3 = l2 + 16 + class44_sub3_sub1_sub3.anInt1462;
                            int j3 = j2 + 16 + class44_sub3_sub1_sub3.anInt1463;
                            int k3 = i3 + (j3 << 7);
                            anIntArray1133[k3] = 0;
                        }
                    }
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("10967, " + class44_sub3_sub1_sub3 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method110(boolean flag, boolean flag1)
    {
        try
        {
            if(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 >> 7 == anInt911 && ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 >> 7 == anInt912)
            {
                anInt911 = 0;
                anInt944++;
                if(anInt944 > 122)
                {
                    anInt944 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 255);
                    aClass44_Sub3_Sub2_850.method472(62);
                }
            }
            int i = anInt1226;
            if(!flag)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            if(flag1)
            {
                i = 1;
            }
            for(int j = 0; j < i; j++)
            {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
                int k;
                if(flag1)
                {
                    class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1047;
                    k = anInt1224 << 14;
                } else
                {
                    class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[j]];
                    k = anIntArray1227[j] << 14;
                }
                if(class44_sub3_sub4_sub6_sub1 == null || !class44_sub3_sub4_sub6_sub1.method535(true))
                {
                    continue;
                }
                class44_sub3_sub4_sub6_sub1.aBoolean1692 = false;
                if((aBoolean1235 && anInt1226 > 50 || anInt1226 > 200) && !flag1 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1640 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1620)
                {
                    class44_sub3_sub4_sub6_sub1.aBoolean1692 = true;
                }
                int l = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 >> 7;
                int i1 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 >> 7;
                if(l < 0 || l >= 104 || i1 < 0 || i1 >= 104)
                {
                    continue;
                }
                if(class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1687 != null && anInt1240 >= class44_sub3_sub4_sub6_sub1.anInt1682 && anInt1240 < class44_sub3_sub4_sub6_sub1.anInt1683)
                {
                    class44_sub3_sub4_sub6_sub1.aBoolean1692 = false;
                    class44_sub3_sub4_sub6_sub1.anInt1681 = method51(false, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615, anInt1155);
                    aClass36_1192.method290(60, k, true, class44_sub3_sub4_sub6_sub1.anInt1689, class44_sub3_sub4_sub6_sub1.anInt1690, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615, class44_sub3_sub4_sub6_sub1.anInt1691, class44_sub3_sub4_sub6_sub1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, anInt1155, class44_sub3_sub4_sub6_sub1.anInt1681, class44_sub3_sub4_sub6_sub1.anInt1688, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1617);
                    continue;
                }
                if((((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 & 0x7f) == 64 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 & 0x7f) == 64)
                {
                    if(anIntArrayArray885[l][i1] == anInt1189)
                    {
                        continue;
                    }
                    anIntArrayArray885[l][i1] = anInt1189;
                }
                class44_sub3_sub4_sub6_sub1.anInt1681 = method51(false, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615, anInt1155);
                aClass36_1192.method289(60, k, class44_sub3_sub4_sub6_sub1.anInt1681, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615, 384, class44_sub3_sub4_sub6_sub1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1617, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).aBoolean1618, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616, anInt1155);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("61838, " + flag + ", " + flag1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method111(int i, byte byte0, int j)
    {
        try
        {
            int k = 0;
            for(int l = 0; l < 100; l++)
            {
                if(aStringArray1004[l] == null)
                {
                    continue;
                }
                int i1 = anIntArray1002[l];
                int j1 = (70 - k * 14) + anInt1103 + 4;
                if(j1 < -20)
                {
                    break;
                }
                String s = aStringArray1003[l];
                boolean flag = false;
                if(s != null && s.startsWith("@cr1@"))
                {
                    s = s.substring(5);
                    boolean flag1 = true;
                }
                if(s != null && s.startsWith("@cr2@"))
                {
                    s = s.substring(5);
                    byte byte1 = 2;
                }
                if(i1 == 0)
                {
                    k++;
                }
                if((i1 == 1 || i1 == 2) && (i1 == 1 || anInt843 == 0 || anInt843 == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1 && !s.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672))
                    {
                        if(anInt1188 >= 1)
                        {
                            aStringArray897[anInt971] = "Report abuse @whi@" + s;
                            anIntArray839[anInt971] = 524;
                            anInt971++;
                        }
                        aStringArray897[anInt971] = "Add ignore @whi@" + s;
                        anIntArray839[anInt971] = 47;
                        anInt971++;
                        aStringArray897[anInt971] = "Add friend @whi@" + s;
                        anIntArray839[anInt971] = 605;
                        anInt971++;
                    }
                    k++;
                }
                if((i1 == 3 || i1 == 7) && anInt1017 == 0 && (i1 == 7 || anInt895 == 0 || anInt895 == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        if(anInt1188 >= 1)
                        {
                            aStringArray897[anInt971] = "Report abuse @whi@" + s;
                            anIntArray839[anInt971] = 524;
                            anInt971++;
                        }
                        aStringArray897[anInt971] = "Add ignore @whi@" + s;
                        anIntArray839[anInt971] = 47;
                        anInt971++;
                        aStringArray897[anInt971] = "Add friend @whi@" + s;
                        anIntArray839[anInt971] = 605;
                        anInt971++;
                    }
                    k++;
                }
                if(i1 == 4 && (anInt1168 == 0 || anInt1168 == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        aStringArray897[anInt971] = "Accept trade @whi@" + s;
                        anIntArray839[anInt971] = 507;
                        anInt971++;
                    }
                    k++;
                }
                if((i1 == 5 || i1 == 6) && anInt1017 == 0 && anInt895 < 2)
                {
                    k++;
                }
                if(i1 == 8 && (anInt1168 == 0 || anInt1168 == 1 && method80(s, 3)))
                {
                    if(j > j1 - 14 && j <= j1)
                    {
                        aStringArray897[anInt971] = "Accept challenge @whi@" + s;
                        anIntArray839[anInt971] = 957;
                        anInt971++;
                    }
                    k++;
                }
            }
            if(byte0 != 7)
            {
                method6();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("6327, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method112(int i, int j, Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1, int k, int l)
    {
        try
        {
            if(class44_sub3_sub4_sub6_sub1 == aClass44_Sub3_Sub4_Sub6_Sub1_1047)
            {
                return;
            }
            if(anInt971 >= 400)
            {
                return;
            }
            String s;
            if(class44_sub3_sub4_sub6_sub1.anInt1679 == 0)
            {
                s = class44_sub3_sub4_sub6_sub1.aString1672 + method137(class44_sub3_sub4_sub6_sub1.anInt1678, aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1678, -41081) + " (level-" + class44_sub3_sub4_sub6_sub1.anInt1678 + ")";
            } else
            {
                s = class44_sub3_sub4_sub6_sub1.aString1672 + " (skill-" + class44_sub3_sub4_sub6_sub1.anInt1679 + ")";
            }
            if(anInt952 == 1)
            {
                aStringArray897[anInt971] = "Use " + aString956 + " with @whi@" + s;
                anIntArray839[anInt971] = 275;
                anIntArray840[anInt971] = l;
                anIntArray837[anInt971] = k;
                anIntArray838[anInt971] = i;
                anInt971++;
            } else
            if(anInt994 == 1)
            {
                if((anInt996 & 8) == 8)
                {
                    aStringArray897[anInt971] = aString997 + " @whi@" + s;
                    anIntArray839[anInt971] = 131;
                    anIntArray840[anInt971] = l;
                    anIntArray837[anInt971] = k;
                    anIntArray838[anInt971] = i;
                    anInt971++;
                }
            } else
            {
                for(int i1 = 4; i1 >= 0; i1--)
                {
                    if(aStringArray919[i1] != null)
                    {
                        aStringArray897[anInt971] = aStringArray919[i1] + " @whi@" + s;
                        char c = '\0';
                        if(aStringArray919[i1].equalsIgnoreCase("attack"))
                        {
                            if(class44_sub3_sub4_sub6_sub1.anInt1678 > aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1678)
                            {
                                c = '\u07D0';
                            }
                            if(aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1695 != 0 && class44_sub3_sub4_sub6_sub1.anInt1695 != 0)
                            {
                                if(aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1695 == class44_sub3_sub4_sub6_sub1.anInt1695)
                                {
                                    c = '\u07D0';
                                } else
                                {
                                    c = '\0';
                                }
                            }
                        } else
                        if(aBooleanArray920[i1])
                        {
                            c = '\u07D0';
                        }
                        if(i1 == 0)
                        {
                            anIntArray839[anInt971] = 639 + c;
                        }
                        if(i1 == 1)
                        {
                            anIntArray839[anInt971] = 499 + c;
                        }
                        if(i1 == 2)
                        {
                            anIntArray839[anInt971] = 27 + c;
                        }
                        if(i1 == 3)
                        {
                            anIntArray839[anInt971] = 387 + c;
                        }
                        if(i1 == 4)
                        {
                            anIntArray839[anInt971] = 185 + c;
                        }
                        anIntArray840[anInt971] = l;
                        anIntArray837[anInt971] = k;
                        anIntArray838[anInt971] = i;
                        anInt971++;
                    }
                }
            }
            for(int j1 = 0; j1 < anInt971; j1++)
            {
                if(anIntArray839[j1] != 718)
                {
                    continue;
                }
                aStringArray897[j1] = "Walk here @whi@" + s;
                break;
            }
            if(j != 705)
            {
                anInt857 = aClass46_927.method545();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("20699, " + i + ", " + j + ", " + class44_sub3_sub4_sub6_sub1 + ", " + k + ", " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method113(byte byte0)
    {
        try
        {
            aClass34_1195.method272((byte)5);
            Class44_Sub3_Sub1_Sub1.anIntArray1429 = anIntArray915;
            if(byte0 != 3)
            {
                return;
            }
            aClass44_Sub3_Sub1_Sub3_1143.method453(0, aByte1213, 0);
            if(anInt889 != -1)
            {
                method37(6, 0, 0, Class5.aClass5Array100[anInt889], 0);
            } else
            if(anIntArray1060[anInt1027] != -1)
            {
                method37(6, 0, 0, Class5.aClass5Array100[anIntArray1060[anInt1027]], 0);
            }
            if(aBoolean946 && anInt1030 == 1)
            {
                method115(393);
            }
            aClass34_1195.method273(-781, 553, 205, super.aGraphics13);
            aClass34_1197.method272((byte)5);
            Class44_Sub3_Sub1_Sub1.anIntArray1429 = anIntArray916;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("78878, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method114(int i)
    {
        try
        {
            Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5)aClass28_1054.method259();
            if(i >= 0)
            {
                aClass44_Sub3_Sub2_850.method472(87);
            }
            for(; class44_sub3_sub4_sub5 != null; class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5)aClass28_1054.method261(false))
            {
                if(class44_sub3_sub4_sub5.anInt1606 != anInt1155 || class44_sub3_sub4_sub5.aBoolean1612)
                {
                    class44_sub3_sub4_sub5.method404();
                } else
                if(anInt1240 >= class44_sub3_sub4_sub5.anInt1605)
                {
                    class44_sub3_sub4_sub5.method531(922, anInt824);
                    if(class44_sub3_sub4_sub5.aBoolean1612)
                    {
                        class44_sub3_sub4_sub5.method404();
                    } else
                    {
                        aClass36_1192.method289(60, -1, class44_sub3_sub4_sub5.anInt1609, class44_sub3_sub4_sub5.anInt1607, 384, class44_sub3_sub4_sub5, 0, false, class44_sub3_sub4_sub5.anInt1608, class44_sub3_sub4_sub5.anInt1606);
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("1882, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method115(int i)
    {
        try
        {
            int j = anInt1031;
            int k = anInt1032;
            int l = anInt1033;
            int i1 = anInt1034;
            int j1 = 0x5d5447;
            Class44_Sub3_Sub1.method411(j1, 210, k, i1, j, l);
            Class44_Sub3_Sub1.method411(0, 210, k + 1, 16, j + 1, l - 2);
            if(i <= 0)
            {
                anInt1153 = 111;
            }
            Class44_Sub3_Sub1.method412(1, j + 1, l - 2, 0, k + 18, i1 - 19);
            aClass44_Sub3_Sub1_Sub4_1257.method459((byte)-104, j1, "Choose Option", j + 3, k + 14);
            int k1 = super.anInt21;
            int l1 = super.anInt22;
            if(anInt1030 == 0)
            {
                k1 -= 4;
                l1 -= 4;
            }
            if(anInt1030 == 1)
            {
                k1 -= 553;
                l1 -= 205;
            }
            if(anInt1030 == 2)
            {
                k1 -= 17;
                l1 -= 357;
            }
            for(int i2 = 0; i2 < anInt971; i2++)
            {
                int j2 = k + 31 + (anInt971 - 1 - i2) * 15;
                int k2 = 0xffffff;
                if(k1 > j && k1 < j + l && l1 > j2 - 13 && l1 < j2 + 3)
                {
                    k2 = 0xffff00;
                }
                aClass44_Sub3_Sub1_Sub4_1257.method463(k2, 2, j2, true, j + 3, aStringArray897[i2]);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("33105, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method116(int i)
    {
        try
        {
            for(int j = 0; j < anInt1009; j++)
            {
                int k = anIntArray1010[j];
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    method117(-34028, class44_sub3_sub4_sub6_sub2, class44_sub3_sub4_sub6_sub2.aClass12_1700.aByte284);
                }
            }
            if(i <= 0)
            {
                anInt1247 = -115;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("89148, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method117(int i, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int j)
    {
        try
        {
            if(i != -34028)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
            }
            if(class44_sub3_sub4_sub6.anInt1615 < 128 || class44_sub3_sub4_sub6.anInt1616 < 128 || class44_sub3_sub4_sub6.anInt1615 >= 13184 || class44_sub3_sub4_sub6.anInt1616 >= 13184)
            {
                class44_sub3_sub4_sub6.anInt1643 = -1;
                class44_sub3_sub4_sub6.anInt1648 = -1;
                class44_sub3_sub4_sub6.anInt1657 = 0;
                class44_sub3_sub4_sub6.anInt1658 = 0;
                class44_sub3_sub4_sub6.anInt1615 = class44_sub3_sub4_sub6.anIntArray1665[0] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                class44_sub3_sub4_sub6.anInt1616 = class44_sub3_sub4_sub6.anIntArray1666[0] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                class44_sub3_sub4_sub6.method534(false);
            }
            if(class44_sub3_sub4_sub6 == aClass44_Sub3_Sub4_Sub6_Sub1_1047 && (class44_sub3_sub4_sub6.anInt1615 < 1536 || class44_sub3_sub4_sub6.anInt1616 < 1536 || class44_sub3_sub4_sub6.anInt1615 >= 11776 || class44_sub3_sub4_sub6.anInt1616 >= 11776))
            {
                class44_sub3_sub4_sub6.anInt1643 = -1;
                class44_sub3_sub4_sub6.anInt1648 = -1;
                class44_sub3_sub4_sub6.anInt1657 = 0;
                class44_sub3_sub4_sub6.anInt1658 = 0;
                class44_sub3_sub4_sub6.anInt1615 = class44_sub3_sub4_sub6.anIntArray1665[0] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                class44_sub3_sub4_sub6.anInt1616 = class44_sub3_sub4_sub6.anIntArray1666[0] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                class44_sub3_sub4_sub6.method534(false);
            }
            if(class44_sub3_sub4_sub6.anInt1657 > anInt1240)
            {
                method118(5, class44_sub3_sub4_sub6);
            } else
            if(class44_sub3_sub4_sub6.anInt1658 >= anInt1240)
            {
                method119(anInt1091, class44_sub3_sub4_sub6);
            } else
            {
                method120(class44_sub3_sub4_sub6, 0);
            }
            method121((byte)2, class44_sub3_sub4_sub6);
            method122(class44_sub3_sub4_sub6, 0);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("3333, " + i + ", " + class44_sub3_sub4_sub6 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method118(int i, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6)
    {
        try
        {
            int j = class44_sub3_sub4_sub6.anInt1657 - anInt1240;
            if(i < 5 || i > 5)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            int k = class44_sub3_sub4_sub6.anInt1653 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
            int l = class44_sub3_sub4_sub6.anInt1655 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
            class44_sub3_sub4_sub6.anInt1615 += (k - class44_sub3_sub4_sub6.anInt1615) / j;
            class44_sub3_sub4_sub6.anInt1616 += (l - class44_sub3_sub4_sub6.anInt1616) / j;
            class44_sub3_sub4_sub6.anInt1668 = 0;
            if(class44_sub3_sub4_sub6.anInt1659 == 0)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1536;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 2)
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 3)
            {
                class44_sub3_sub4_sub6.anInt1662 = 512;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("29708, " + i + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method119(int i, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6)
    {
        try
        {
            if(class44_sub3_sub4_sub6.anInt1658 == anInt1240 || class44_sub3_sub4_sub6.anInt1643 == -1 || class44_sub3_sub4_sub6.anInt1646 != 0 || class44_sub3_sub4_sub6.anInt1645 + 1 > Class26.aClass26Array508[class44_sub3_sub4_sub6.anInt1643].method254(class44_sub3_sub4_sub6.anInt1644, 24425))
            {
                int j = class44_sub3_sub4_sub6.anInt1658 - class44_sub3_sub4_sub6.anInt1657;
                int k = anInt1240 - class44_sub3_sub4_sub6.anInt1657;
                int l = class44_sub3_sub4_sub6.anInt1653 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                int i1 = class44_sub3_sub4_sub6.anInt1655 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                int j1 = class44_sub3_sub4_sub6.anInt1654 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                int k1 = class44_sub3_sub4_sub6.anInt1656 * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
                class44_sub3_sub4_sub6.anInt1615 = (l * (j - k) + j1 * k) / j;
                class44_sub3_sub4_sub6.anInt1616 = (i1 * (j - k) + k1 * k) / j;
            }
            class44_sub3_sub4_sub6.anInt1668 = 0;
            if(class44_sub3_sub4_sub6.anInt1659 == 0)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1536;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 2)
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            if(class44_sub3_sub4_sub6.anInt1659 == 3)
            {
                class44_sub3_sub4_sub6.anInt1662 = 512;
            }
            class44_sub3_sub4_sub6.anInt1617 = class44_sub3_sub4_sub6.anInt1662;
            if(i != 37395)
            {
                anInt1170 = aClass44_Sub3_Sub2_1132.method482();
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("74708, " + i + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method120(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i)
    {
        try
        {
            class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1620;
            if(class44_sub3_sub4_sub6.anInt1664 == 0)
            {
                class44_sub3_sub4_sub6.anInt1668 = 0;
                return;
            }
            if(class44_sub3_sub4_sub6.anInt1643 != -1 && class44_sub3_sub4_sub6.anInt1646 == 0)
            {
                Class26 class26 = Class26.aClass26Array508[class44_sub3_sub4_sub6.anInt1643];
                if(class44_sub3_sub4_sub6.anInt1669 > 0 && class26.anInt520 == 0)
                {
                    class44_sub3_sub4_sub6.anInt1668++;
                    return;
                }
                if(class44_sub3_sub4_sub6.anInt1669 <= 0 && class26.anInt521 == 0)
                {
                    class44_sub3_sub4_sub6.anInt1668++;
                    return;
                }
            }
            int j = class44_sub3_sub4_sub6.anInt1615;
            int k = class44_sub3_sub4_sub6.anInt1616;
            int l = class44_sub3_sub4_sub6.anIntArray1665[class44_sub3_sub4_sub6.anInt1664 - 1] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
            int i1 = class44_sub3_sub4_sub6.anIntArray1666[class44_sub3_sub4_sub6.anInt1664 - 1] * 128 + class44_sub3_sub4_sub6.anInt1619 * 64;
            if(l - j > 256 || l - j < -256 || i1 - k > 256 || i1 - k < -256)
            {
                class44_sub3_sub4_sub6.anInt1615 = l;
                class44_sub3_sub4_sub6.anInt1616 = i1;
                return;
            }
            if(j < l)
            {
                if(k < i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1280;
                } else
                if(k > i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1792;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1662 = 1536;
                }
            } else
            if(j > l)
            {
                if(k < i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 768;
                } else
                if(k > i1)
                {
                    class44_sub3_sub4_sub6.anInt1662 = 256;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1662 = 512;
                }
            } else
            if(k < i1)
            {
                class44_sub3_sub4_sub6.anInt1662 = 1024;
            } else
            {
                class44_sub3_sub4_sub6.anInt1662 = 0;
            }
            int j1 = class44_sub3_sub4_sub6.anInt1662 - class44_sub3_sub4_sub6.anInt1617 & 0x7ff;
            if(j1 > 1024)
            {
                j1 -= 2048;
            }
            int k1 = class44_sub3_sub4_sub6.anInt1623;
            anInt1169 += i;
            if(j1 >= -256 && j1 <= 256)
            {
                k1 = class44_sub3_sub4_sub6.anInt1622;
            } else
            if(j1 >= 256 && j1 < 768)
            {
                k1 = class44_sub3_sub4_sub6.anInt1625;
            } else
            if(j1 >= -768 && j1 <= -256)
            {
                k1 = class44_sub3_sub4_sub6.anInt1624;
            }
            if(k1 == -1)
            {
                k1 = class44_sub3_sub4_sub6.anInt1622;
            }
            class44_sub3_sub4_sub6.anInt1640 = k1;
            int l1 = 4;
            if(class44_sub3_sub4_sub6.anInt1617 != class44_sub3_sub4_sub6.anInt1662 && class44_sub3_sub4_sub6.anInt1637 == -1 && class44_sub3_sub4_sub6.anInt1663 != 0)
            {
                l1 = 2;
            }
            if(class44_sub3_sub4_sub6.anInt1664 > 2)
            {
                l1 = 6;
            }
            if(class44_sub3_sub4_sub6.anInt1664 > 3)
            {
                l1 = 8;
            }
            if(class44_sub3_sub4_sub6.anInt1668 > 0 && class44_sub3_sub4_sub6.anInt1664 > 1)
            {
                l1 = 8;
                class44_sub3_sub4_sub6.anInt1668--;
            }
            if(class44_sub3_sub4_sub6.aBooleanArray1667[class44_sub3_sub4_sub6.anInt1664 - 1])
            {
                l1 <<= 1;
            }
            if(l1 >= 8 && class44_sub3_sub4_sub6.anInt1640 == class44_sub3_sub4_sub6.anInt1622 && class44_sub3_sub4_sub6.anInt1626 != -1)
            {
                class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1626;
            }
            if(j < l)
            {
                class44_sub3_sub4_sub6.anInt1615 += l1;
                if(class44_sub3_sub4_sub6.anInt1615 > l)
                {
                    class44_sub3_sub4_sub6.anInt1615 = l;
                }
            } else
            if(j > l)
            {
                class44_sub3_sub4_sub6.anInt1615 -= l1;
                if(class44_sub3_sub4_sub6.anInt1615 < l)
                {
                    class44_sub3_sub4_sub6.anInt1615 = l;
                }
            }
            if(k < i1)
            {
                class44_sub3_sub4_sub6.anInt1616 += l1;
                if(class44_sub3_sub4_sub6.anInt1616 > i1)
                {
                    class44_sub3_sub4_sub6.anInt1616 = i1;
                }
            } else
            if(k > i1)
            {
                class44_sub3_sub4_sub6.anInt1616 -= l1;
                if(class44_sub3_sub4_sub6.anInt1616 < i1)
                {
                    class44_sub3_sub4_sub6.anInt1616 = i1;
                }
            }
            if(class44_sub3_sub4_sub6.anInt1615 == l && class44_sub3_sub4_sub6.anInt1616 == i1)
            {
                class44_sub3_sub4_sub6.anInt1664--;
                if(class44_sub3_sub4_sub6.anInt1669 > 0)
                {
                    class44_sub3_sub4_sub6.anInt1669--;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("29188, " + class44_sub3_sub4_sub6 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method121(byte byte0, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6)
    {
        try
        {
            if(byte0 == 2)
            {
                byte0 = 0;
            } else
            {
                aClass28ArrayArrayArray1146 = null;
            }
            if(class44_sub3_sub4_sub6.anInt1663 == 0)
            {
                return;
            }
            if(class44_sub3_sub4_sub6.anInt1637 != -1 && class44_sub3_sub4_sub6.anInt1637 < 32768)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[class44_sub3_sub4_sub6.anInt1637];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    int l = class44_sub3_sub4_sub6.anInt1615 - ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615;
                    int j1 = class44_sub3_sub4_sub6.anInt1616 - ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616;
                    if(l != 0 || j1 != 0)
                    {
                        class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(l, j1) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if(class44_sub3_sub4_sub6.anInt1637 >= 32768)
            {
                int i = class44_sub3_sub4_sub6.anInt1637 - 32768;
                if(i == anInt1115)
                {
                    i = anInt1224;
                }
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[i];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    int k1 = class44_sub3_sub4_sub6.anInt1615 - ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615;
                    int l1 = class44_sub3_sub4_sub6.anInt1616 - ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616;
                    if(k1 != 0 || l1 != 0)
                    {
                        class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(k1, l1) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if((class44_sub3_sub4_sub6.anInt1638 != 0 || class44_sub3_sub4_sub6.anInt1639 != 0) && (class44_sub3_sub4_sub6.anInt1664 == 0 || class44_sub3_sub4_sub6.anInt1668 > 0))
            {
                int j = class44_sub3_sub4_sub6.anInt1615 - (class44_sub3_sub4_sub6.anInt1638 - anInt1184 - anInt1184) * 64;
                int i1 = class44_sub3_sub4_sub6.anInt1616 - (class44_sub3_sub4_sub6.anInt1639 - anInt1185 - anInt1185) * 64;
                if(j != 0 || i1 != 0)
                {
                    class44_sub3_sub4_sub6.anInt1662 = (int)(Math.atan2(j, i1) * 325.94900000000001D) & 0x7ff;
                }
                class44_sub3_sub4_sub6.anInt1638 = 0;
                class44_sub3_sub4_sub6.anInt1639 = 0;
            }
            int k = class44_sub3_sub4_sub6.anInt1662 - class44_sub3_sub4_sub6.anInt1617 & 0x7ff;
            if(k != 0)
            {
                if(k < class44_sub3_sub4_sub6.anInt1663 || k > 2048 - class44_sub3_sub4_sub6.anInt1663)
                {
                    class44_sub3_sub4_sub6.anInt1617 = class44_sub3_sub4_sub6.anInt1662;
                } else
                if(k > 1024)
                {
                    class44_sub3_sub4_sub6.anInt1617 -= class44_sub3_sub4_sub6.anInt1663;
                } else
                {
                    class44_sub3_sub4_sub6.anInt1617 += class44_sub3_sub4_sub6.anInt1663;
                }
                class44_sub3_sub4_sub6.anInt1617 &= 0x7ff;
                if(class44_sub3_sub4_sub6.anInt1640 == class44_sub3_sub4_sub6.anInt1620 && class44_sub3_sub4_sub6.anInt1617 != class44_sub3_sub4_sub6.anInt1662)
                {
                    if(class44_sub3_sub4_sub6.anInt1621 != -1)
                    {
                        class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1621;
                        return;
                    } else
                    {
                        class44_sub3_sub4_sub6.anInt1640 = class44_sub3_sub4_sub6.anInt1622;
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("53139, " + byte0 + ", " + class44_sub3_sub4_sub6 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method122(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i)
    {
        try
        {
            anInt1169 += i;
            class44_sub3_sub4_sub6.aBoolean1618 = false;
            if(class44_sub3_sub4_sub6.anInt1640 != -1)
            {
                Class26 class26 = Class26.aClass26Array508[class44_sub3_sub4_sub6.anInt1640];
                class44_sub3_sub4_sub6.anInt1642++;
                if(class44_sub3_sub4_sub6.anInt1641 < class26.anInt509 && class44_sub3_sub4_sub6.anInt1642 > class26.method254(class44_sub3_sub4_sub6.anInt1641, 24425))
                {
                    class44_sub3_sub4_sub6.anInt1642 = 0;
                    class44_sub3_sub4_sub6.anInt1641++;
                }
                if(class44_sub3_sub4_sub6.anInt1641 >= class26.anInt509)
                {
                    class44_sub3_sub4_sub6.anInt1642 = 0;
                    class44_sub3_sub4_sub6.anInt1641 = 0;
                }
            }
            if(class44_sub3_sub4_sub6.anInt1648 != -1 && anInt1240 >= class44_sub3_sub4_sub6.anInt1651)
            {
                if(class44_sub3_sub4_sub6.anInt1649 < 0)
                {
                    class44_sub3_sub4_sub6.anInt1649 = 0;
                }
                Class26 class26_1 = Class32.aClass32Array559[class44_sub3_sub4_sub6.anInt1648].aClass26_563;
                for(class44_sub3_sub4_sub6.anInt1650++; class44_sub3_sub4_sub6.anInt1649 < class26_1.anInt509 && class44_sub3_sub4_sub6.anInt1650 > class26_1.method254(class44_sub3_sub4_sub6.anInt1649, 24425); class44_sub3_sub4_sub6.anInt1649++)
                {
                    class44_sub3_sub4_sub6.anInt1650 -= class26_1.method254(class44_sub3_sub4_sub6.anInt1649, 24425);
                }
                if(class44_sub3_sub4_sub6.anInt1649 >= class26_1.anInt509 && (class44_sub3_sub4_sub6.anInt1649 < 0 || class44_sub3_sub4_sub6.anInt1649 >= class26_1.anInt509))
                {
                    class44_sub3_sub4_sub6.anInt1648 = -1;
                }
            }
            if(class44_sub3_sub4_sub6.anInt1643 != -1 && class44_sub3_sub4_sub6.anInt1646 <= 1)
            {
                Class26 class26_2 = Class26.aClass26Array508[class44_sub3_sub4_sub6.anInt1643];
                if(class26_2.anInt520 == 1 && class44_sub3_sub4_sub6.anInt1669 > 0 && class44_sub3_sub4_sub6.anInt1657 <= anInt1240 && class44_sub3_sub4_sub6.anInt1658 < anInt1240)
                {
                    class44_sub3_sub4_sub6.anInt1646 = 1;
                    return;
                }
            }
            if(class44_sub3_sub4_sub6.anInt1643 != -1 && class44_sub3_sub4_sub6.anInt1646 == 0)
            {
                Class26 class26_3 = Class26.aClass26Array508[class44_sub3_sub4_sub6.anInt1643];
                for(class44_sub3_sub4_sub6.anInt1645++; class44_sub3_sub4_sub6.anInt1644 < class26_3.anInt509 && class44_sub3_sub4_sub6.anInt1645 > class26_3.method254(class44_sub3_sub4_sub6.anInt1644, 24425); class44_sub3_sub4_sub6.anInt1644++)
                {
                    class44_sub3_sub4_sub6.anInt1645 -= class26_3.method254(class44_sub3_sub4_sub6.anInt1644, 24425);
                }
                if(class44_sub3_sub4_sub6.anInt1644 >= class26_3.anInt509)
                {
                    class44_sub3_sub4_sub6.anInt1644 -= class26_3.anInt513;
                    class44_sub3_sub4_sub6.anInt1647++;
                    if(class44_sub3_sub4_sub6.anInt1647 >= class26_3.anInt519)
                    {
                        class44_sub3_sub4_sub6.anInt1643 = -1;
                    }
                    if(class44_sub3_sub4_sub6.anInt1644 < 0 || class44_sub3_sub4_sub6.anInt1644 >= class26_3.anInt509)
                    {
                        class44_sub3_sub4_sub6.anInt1643 = -1;
                    }
                }
                class44_sub3_sub4_sub6.aBoolean1618 = class26_3.aBoolean515;
            }
            if(class44_sub3_sub4_sub6.anInt1646 > 0)
            {
                class44_sub3_sub4_sub6.anInt1646--;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("50955, " + class44_sub3_sub4_sub6 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method123(boolean flag)
    {
        try
        {
            if(flag)
            {
                return;
            }
            if(aBoolean908)
            {
                aBoolean908 = false;
                aClass34_1123.method273(-781, 0, 4, super.aGraphics13);
                aClass34_1124.method273(-781, 0, 357, super.aGraphics13);
                aClass34_1125.method273(-781, 722, 4, super.aGraphics13);
                aClass34_1126.method273(-781, 743, 205, super.aGraphics13);
                aClass34_1127.method273(-781, 0, 0, super.aGraphics13);
                aClass34_1128.method273(-781, 516, 4, super.aGraphics13);
                aClass34_1129.method273(-781, 516, 205, super.aGraphics13);
                aClass34_1130.method273(-781, 496, 357, super.aGraphics13);
                aClass34_1131.method273(-781, 0, 338, super.aGraphics13);
                aBoolean898 = true;
                aBoolean1049 = true;
                aBoolean1154 = true;
                aBoolean1062 = true;
                if(anInt882 != 2)
                {
                    aClass34_1197.method273(-781, 4, 4, super.aGraphics13);
                    aClass34_1196.method273(-781, 550, 4, super.aGraphics13);
                }
            }
            if(anInt882 == 2)
            {
                method43(0);
            }
            if(aBoolean946 && anInt1030 == 1)
            {
                aBoolean898 = true;
            }
            if(anInt889 != -1)
            {
                boolean flag1 = method65(anInt824, anInt889, (byte)-103);
                if(flag1)
                {
                    aBoolean898 = true;
                }
            }
            if(anInt1151 == 2)
            {
                aBoolean898 = true;
            }
            if(anInt1095 == 2)
            {
                aBoolean898 = true;
            }
            if(aBoolean898)
            {
                method113((byte)3);
                aBoolean898 = false;
            }
            if(anInt1253 == -1)
            {
                aClass5_1201.anInt120 = anInt874 - anInt1103 - 77;
                if(super.anInt21 > 448 && super.anInt21 < 560 && super.anInt22 > 332)
                {
                    method81(0, super.anInt21 - 17, aClass5_1201, 463, false, 77, aByte830, super.anInt22 - 357, anInt874);
                }
                int i = anInt874 - 77 - aClass5_1201.anInt120;
                if(i < 0)
                {
                    i = 0;
                }
                if(i > anInt874 - 77)
                {
                    i = anInt874 - 77;
                }
                if(anInt1103 != i)
                {
                    anInt1103 = i;
                    aBoolean1049 = true;
                }
            }
            if(anInt1253 != -1)
            {
                boolean flag2 = method65(anInt824, anInt1253, (byte)-103);
                if(flag2)
                {
                    aBoolean1049 = true;
                }
            }
            if(anInt1151 == 3)
            {
                aBoolean1049 = true;
            }
            if(anInt1095 == 3)
            {
                aBoolean1049 = true;
            }
            if(aString823 != null)
            {
                aBoolean1049 = true;
            }
            if(aBoolean946 && anInt1030 == 2)
            {
                aBoolean1049 = true;
            }
            if(aBoolean1049)
            {
                method47(311);
                aBoolean1049 = false;
            }
            if(anInt882 == 2)
            {
                method36(0);
                aClass34_1196.method273(-781, 550, 4, super.aGraphics13);
            }
            if(anInt833 != -1)
            {
                aBoolean1154 = true;
            }
            if(aBoolean1154)
            {
                if(anInt833 != -1 && anInt833 == anInt1027)
                {
                    anInt833 = -1;
                    aClass44_Sub3_Sub2_850.method471(-34003, 146);
                    aClass44_Sub3_Sub2_850.method472(anInt1027);
                }
                aBoolean1154 = false;
                aClass34_860.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_905.method453(0, aByte1213, 0);
                if(anInt889 == -1)
                {
                    if(anIntArray1060[anInt1027] != -1)
                    {
                        if(anInt1027 == 0)
                        {
                            aClass44_Sub3_Sub1_Sub3_1136.method453(10, aByte1213, 22);
                        }
                        if(anInt1027 == 1)
                        {
                            aClass44_Sub3_Sub1_Sub3_1137.method453(8, aByte1213, 54);
                        }
                        if(anInt1027 == 2)
                        {
                            aClass44_Sub3_Sub1_Sub3_1137.method453(8, aByte1213, 82);
                        }
                        if(anInt1027 == 3)
                        {
                            aClass44_Sub3_Sub1_Sub3_1138.method453(8, aByte1213, 110);
                        }
                        if(anInt1027 == 4)
                        {
                            aClass44_Sub3_Sub1_Sub3_1140.method453(8, aByte1213, 153);
                        }
                        if(anInt1027 == 5)
                        {
                            aClass44_Sub3_Sub1_Sub3_1140.method453(8, aByte1213, 181);
                        }
                        if(anInt1027 == 6)
                        {
                            aClass44_Sub3_Sub1_Sub3_1139.method453(9, aByte1213, 209);
                        }
                    }
                    if(anIntArray1060[0] != -1 && (anInt833 != 0 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[0].method453(13, aByte1213, 29);
                    }
                    if(anIntArray1060[1] != -1 && (anInt833 != 1 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[1].method453(11, aByte1213, 53);
                    }
                    if(anIntArray1060[2] != -1 && (anInt833 != 2 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[2].method453(11, aByte1213, 82);
                    }
                    if(anIntArray1060[3] != -1 && (anInt833 != 3 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[3].method453(12, aByte1213, 115);
                    }
                    if(anIntArray1060[4] != -1 && (anInt833 != 4 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[4].method453(13, aByte1213, 153);
                    }
                    if(anIntArray1060[5] != -1 && (anInt833 != 5 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[5].method453(11, aByte1213, 180);
                    }
                    if(anIntArray1060[6] != -1 && (anInt833 != 6 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[6].method453(13, aByte1213, 208);
                    }
                }
                aClass34_860.method273(-781, 516, 160, super.aGraphics13);
                aClass34_859.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_904.method453(0, aByte1213, 0);
                if(anInt889 == -1)
                {
                    if(anIntArray1060[anInt1027] != -1)
                    {
                        if(anInt1027 == 7)
                        {
                            aClass44_Sub3_Sub1_Sub3_852.method453(0, aByte1213, 42);
                        }
                        if(anInt1027 == 8)
                        {
                            aClass44_Sub3_Sub1_Sub3_853.method453(0, aByte1213, 74);
                        }
                        if(anInt1027 == 9)
                        {
                            aClass44_Sub3_Sub1_Sub3_853.method453(0, aByte1213, 102);
                        }
                        if(anInt1027 == 10)
                        {
                            aClass44_Sub3_Sub1_Sub3_854.method453(1, aByte1213, 130);
                        }
                        if(anInt1027 == 11)
                        {
                            aClass44_Sub3_Sub1_Sub3_856.method453(0, aByte1213, 173);
                        }
                        if(anInt1027 == 12)
                        {
                            aClass44_Sub3_Sub1_Sub3_856.method453(0, aByte1213, 201);
                        }
                        if(anInt1027 == 13)
                        {
                            aClass44_Sub3_Sub1_Sub3_855.method453(0, aByte1213, 229);
                        }
                    }
                    if(anIntArray1060[8] != -1 && (anInt833 != 8 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[7].method453(2, aByte1213, 74);
                    }
                    if(anIntArray1060[9] != -1 && (anInt833 != 9 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[8].method453(3, aByte1213, 102);
                    }
                    if(anIntArray1060[10] != -1 && (anInt833 != 10 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[9].method453(4, aByte1213, 137);
                    }
                    if(anIntArray1060[11] != -1 && (anInt833 != 11 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[10].method453(2, aByte1213, 174);
                    }
                    if(anIntArray1060[12] != -1 && (anInt833 != 12 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[11].method453(2, aByte1213, 201);
                    }
                    if(anIntArray1060[13] != -1 && (anInt833 != 13 || anInt1240 % 20 < 10))
                    {
                        aClass44_Sub3_Sub1_Sub3Array1276[12].method453(2, aByte1213, 226);
                    }
                }
                aClass34_859.method273(-781, 496, 466, super.aGraphics13);
                aClass34_1197.method272((byte)5);
            }
            if(aBoolean1062)
            {
                aBoolean1062 = false;
                aClass34_858.method272((byte)5);
                aClass44_Sub3_Sub1_Sub3_903.method453(0, aByte1213, 0);
                aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffffff, (byte)-85, 55, "Public chat", 28);
                if(anInt843 == 0)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 65280, (byte)-85, 55, "On", 41);
                }
                if(anInt843 == 1)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffff00, (byte)-85, 55, "Friends", 41);
                }
                if(anInt843 == 2)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xff0000, (byte)-85, 55, "Off", 41);
                }
                if(anInt843 == 3)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 65535, (byte)-85, 55, "Hide", 41);
                }
                aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffffff, (byte)-85, 184, "Private chat", 28);
                if(anInt895 == 0)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 65280, (byte)-85, 184, "On", 41);
                }
                if(anInt895 == 1)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffff00, (byte)-85, 184, "Friends", 41);
                }
                if(anInt895 == 2)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xff0000, (byte)-85, 184, "Off", 41);
                }
                aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffffff, (byte)-85, 324, "Trade/compete", 28);
                if(anInt1168 == 0)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 65280, (byte)-85, 324, "On", 41);
                }
                if(anInt1168 == 1)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffff00, (byte)-85, 324, "Friends", 41);
                }
                if(anInt1168 == 2)
                {
                    aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xff0000, (byte)-85, 324, "Off", 41);
                }
                aClass44_Sub3_Sub1_Sub4_1256.method456(true, 0xffffff, (byte)-85, 458, "Report abuse", 33);
                aClass34_858.method273(-781, 0, 453, super.aGraphics13);
                aClass34_1197.method272((byte)5);
            }
            anInt824 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("27122, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method124(int i, int j, int k, int l, int i1, int j1, boolean flag,
            int k1, int l1, int i2, int j2, int k2)
    {
        try
        {
            byte byte0 = 104;
            byte byte1 = 104;
            for(int l2 = 0; l2 < byte0; l2++)
            {
                for(int i3 = 0; i3 < byte1; i3++)
                {
                    anIntArrayArray1113[l2][i3] = 0;
                    anIntArrayArray975[l2][i3] = 0x5f5e0ff;
                }
            }
            int j3 = j;
            int k3 = k2;
            anIntArrayArray1113[j][k2] = 99;
            anIntArrayArray975[j][k2] = 0;
            int l3 = 0;
            int i4 = 0;
            anIntArray1020[l3] = j;
            anIntArray1021[l3++] = k2;
            boolean flag1 = false;
            if(l1 <= 0)
            {
                anInt1091 = 304;
            }
            int j4 = anIntArray1020.length;
            int ai[][] = aClass18Array1022[anInt1155].anIntArrayArray418;
            while(i4 != l3)
            {
                j3 = anIntArray1020[i4];
                k3 = anIntArray1021[i4];
                i4 = (i4 + 1) % j4;
                if(j3 == j2 && k3 == l)
                {
                    flag1 = true;
                    break;
                }
                if(j1 != 0)
                {
                    if((j1 < 5 || j1 == 10) && aClass18Array1022[anInt1155].method240(l, k, j1 - 1, j2, k3, j3, -628))
                    {
                        flag1 = true;
                        break;
                    }
                    if(j1 < 10 && aClass18Array1022[anInt1155].method241((byte)-58, j2, k3, l, j1 - 1, k, j3))
                    {
                        flag1 = true;
                        break;
                    }
                }
                if(i != 0 && i2 != 0 && aClass18Array1022[anInt1155].method242(i, l, k3, anInt958, i2, j3, i1, j2))
                {
                    flag1 = true;
                    break;
                }
                int l4 = anIntArrayArray975[j3][k3] + 1;
                if(j3 > 0 && anIntArrayArray1113[j3 - 1][k3] == 0 && (ai[j3 - 1][k3] & 0x280108) == 0)
                {
                    anIntArray1020[l3] = j3 - 1;
                    anIntArray1021[l3] = k3;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 - 1][k3] = 2;
                    anIntArrayArray975[j3 - 1][k3] = l4;
                }
                if(j3 < byte0 - 1 && anIntArrayArray1113[j3 + 1][k3] == 0 && (ai[j3 + 1][k3] & 0x280180) == 0)
                {
                    anIntArray1020[l3] = j3 + 1;
                    anIntArray1021[l3] = k3;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 + 1][k3] = 8;
                    anIntArrayArray975[j3 + 1][k3] = l4;
                }
                if(k3 > 0 && anIntArrayArray1113[j3][k3 - 1] == 0 && (ai[j3][k3 - 1] & 0x280102) == 0)
                {
                    anIntArray1020[l3] = j3;
                    anIntArray1021[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3][k3 - 1] = 1;
                    anIntArrayArray975[j3][k3 - 1] = l4;
                }
                if(k3 < byte1 - 1 && anIntArrayArray1113[j3][k3 + 1] == 0 && (ai[j3][k3 + 1] & 0x280120) == 0)
                {
                    anIntArray1020[l3] = j3;
                    anIntArray1021[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3][k3 + 1] = 4;
                    anIntArrayArray975[j3][k3 + 1] = l4;
                }
                if(j3 > 0 && k3 > 0 && anIntArrayArray1113[j3 - 1][k3 - 1] == 0 && (ai[j3 - 1][k3 - 1] & 0x28010e) == 0 && (ai[j3 - 1][k3] & 0x280108) == 0 && (ai[j3][k3 - 1] & 0x280102) == 0)
                {
                    anIntArray1020[l3] = j3 - 1;
                    anIntArray1021[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 - 1][k3 - 1] = 3;
                    anIntArrayArray975[j3 - 1][k3 - 1] = l4;
                }
                if(j3 < byte0 - 1 && k3 > 0 && anIntArrayArray1113[j3 + 1][k3 - 1] == 0 && (ai[j3 + 1][k3 - 1] & 0x280183) == 0 && (ai[j3 + 1][k3] & 0x280180) == 0 && (ai[j3][k3 - 1] & 0x280102) == 0)
                {
                    anIntArray1020[l3] = j3 + 1;
                    anIntArray1021[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 + 1][k3 - 1] = 9;
                    anIntArrayArray975[j3 + 1][k3 - 1] = l4;
                }
                if(j3 > 0 && k3 < byte1 - 1 && anIntArrayArray1113[j3 - 1][k3 + 1] == 0 && (ai[j3 - 1][k3 + 1] & 0x280138) == 0 && (ai[j3 - 1][k3] & 0x280108) == 0 && (ai[j3][k3 + 1] & 0x280120) == 0)
                {
                    anIntArray1020[l3] = j3 - 1;
                    anIntArray1021[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 - 1][k3 + 1] = 6;
                    anIntArrayArray975[j3 - 1][k3 + 1] = l4;
                }
                if(j3 < byte0 - 1 && k3 < byte1 - 1 && anIntArrayArray1113[j3 + 1][k3 + 1] == 0 && (ai[j3 + 1][k3 + 1] & 0x2801e0) == 0 && (ai[j3 + 1][k3] & 0x280180) == 0 && (ai[j3][k3 + 1] & 0x280120) == 0)
                {
                    anIntArray1020[l3] = j3 + 1;
                    anIntArray1021[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1113[j3 + 1][k3 + 1] = 12;
                    anIntArrayArray975[j3 + 1][k3 + 1] = l4;
                }
            }
            anInt972 = 0;
            if(!flag1)
            {
                if(flag)
                {
                    int i5 = 100;
                    for(int k5 = 1; k5 < 2; k5++)
                    {
                        for(int i6 = j2 - k5; i6 <= j2 + k5; i6++)
                        {
                            for(int k6 = l - k5; k6 <= l + k5; k6++)
                            {
                                if(i6 >= 0 && k6 >= 0 && i6 < 104 && k6 < 104 && anIntArrayArray975[i6][k6] < i5)
                                {
                                    i5 = anIntArrayArray975[i6][k6];
                                    j3 = i6;
                                    k3 = k6;
                                    anInt972 = 1;
                                    flag1 = true;
                                }
                            }
                        }
                        if(flag1)
                        {
                            break;
                        }
                    }
                }
                if(!flag1)
                {
                    return false;
                }
            }
            i4 = 0;
            anIntArray1020[i4] = j3;
            anIntArray1021[i4++] = k3;
            int l5;
            for(int j5 = l5 = anIntArrayArray1113[j3][k3]; j3 != j || k3 != k2; j5 = anIntArrayArray1113[j3][k3])
            {
                if(j5 != l5)
                {
                    l5 = j5;
                    anIntArray1020[i4] = j3;
                    anIntArray1021[i4++] = k3;
                }
                if((j5 & 2) != 0)
                {
                    j3++;
                } else
                if((j5 & 8) != 0)
                {
                    j3--;
                }
                if((j5 & 1) != 0)
                {
                    k3++;
                } else
                if((j5 & 4) != 0)
                {
                    k3--;
                }
            }
            if(i4 > 0)
            {
                int k4 = i4;
                if(k4 > 25)
                {
                    k4 = 25;
                }
                i4--;
                int j6 = anIntArray1020[i4];
                int l6 = anIntArray1021[i4];
                if(k1 == 0)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 234);
                    aClass44_Sub3_Sub2_850.method472(k4 + k4 + 3);
                }
                if(k1 == 1)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 236);
                    aClass44_Sub3_Sub2_850.method472(k4 + k4 + 3 + 14);
                }
                if(k1 == 2)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 67);
                    aClass44_Sub3_Sub2_850.method472(k4 + k4 + 3);
                }
                if(super.anIntArray31[5] == 1)
                {
                    aClass44_Sub3_Sub2_850.method472(1);
                } else
                {
                    aClass44_Sub3_Sub2_850.method472(0);
                }
                aClass44_Sub3_Sub2_850.method473(j6 + anInt1184);
                aClass44_Sub3_Sub2_850.method473(l6 + anInt1185);
                anInt911 = anIntArray1020[0];
                anInt912 = anIntArray1021[0];
                for(int i7 = 1; i7 < k4; i7++)
                {
                    i4--;
                    aClass44_Sub3_Sub2_850.method472(anIntArray1020[i4] - j6);
                    aClass44_Sub3_Sub2_850.method472(anIntArray1021[i4] - l6);
                }
                return true;
            }
            return k1 != 1;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("96354, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + k2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class47 method125(byte byte0, String s, int i, String s1, int j, int k)
    {
        try
        {
            byte abyte0[] = null;
            if(byte0 != -9)
            {
                throw new NullPointerException();
            }
            int l = 5;
            try
            {
                if(aClass45Array1208[0] != null)
                {
                    abyte0 = aClass45Array1208[0].method541(false, i);
                }
            }
            catch(Exception _ex)
            {
            }
            if(abyte0 != null)
            {
                aCRC32_951.reset();
                aCRC32_951.update(abyte0);
                int i1 = (int)aCRC32_951.getValue();
                if(i1 != k)
                {
                    abyte0 = null;
                }
            }
            if(abyte0 != null)
            {
                Class47 class47 = new Class47(abyte0, 0);
                return class47;
            }
            int j1 = 0;
            while(abyte0 == null)
            {
                String s2 = "Unknown error";
                method13(false, j, "Requesting " + s);
                Object obj = null;
                try
                {
                    int k1 = 0;
                    DataInputStream datainputstream = method77(s1 + k);
                    byte abyte1[] = new byte[6];
                    datainputstream.readFully(abyte1, 0, 6);
                    Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte1, 15787);
                    class44_sub3_sub2.anInt1392 = 3;
                    int i2 = class44_sub3_sub2.method486() + 6;
                    int j2 = 6;
                    abyte0 = new byte[i2];
                    for(int k2 = 0; k2 < 6; k2++)
                    {
                        abyte0[k2] = abyte1[k2];
                    }
                    while(j2 < i2)
                    {
                        int l2 = i2 - j2;
                        if(l2 > 1000)
                        {
                            l2 = 1000;
                        }
                        int j3 = datainputstream.read(abyte0, j2, l2);
                        if(j3 < 0)
                        {
                            s2 = "Length error: " + j2 + "/" + i2;
                            throw new IOException("EOF");
                        }
                        j2 += j3;
                        int k3 = (j2 * 100) / i2;
                        if(k3 != k1)
                        {
                            method13(false, j, "Loading " + s + " - " + k3 + "%");
                        }
                        k1 = k3;
                    }
                    datainputstream.close();
                    try
                    {
                        if(aClass45Array1208[0] != null)
                        {
                            aClass45Array1208[0].method542(abyte0, (byte)4, abyte0.length, i);
                        }
                    }
                    catch(Exception _ex)
                    {
                        aClass45Array1208[0] = null;
                    }
                    if(abyte0 != null)
                    {
                        aCRC32_951.reset();
                        aCRC32_951.update(abyte0);
                        int i3 = (int)aCRC32_951.getValue();
                        if(i3 != k)
                        {
                            abyte0 = null;
                            j1++;
                            s2 = "Checksum error: " + i3;
                        }
                    }
                }
                catch(IOException ioexception)
                {
                    if(s2.equals("Unknown error"))
                    {
                        s2 = "Connection error";
                    }
                    abyte0 = null;
                }
                catch(NullPointerException _ex)
                {
                    s2 = "Null error";
                    abyte0 = null;
                    if(!Signlink.reporterror)
                    {
                        return null;
                    }
                }
                catch(ArrayIndexOutOfBoundsException _ex)
                {
                    s2 = "Bounds error";
                    abyte0 = null;
                    if(!Signlink.reporterror)
                    {
                        return null;
                    }
                }
                catch(Exception _ex)
                {
                    s2 = "Unexpected error";
                    abyte0 = null;
                    if(!Signlink.reporterror)
                    {
                        return null;
                    }
                }
                if(abyte0 == null)
                {
                    for(int l1 = l; l1 > 0; l1--)
                    {
                        if(j1 >= 3)
                        {
                            method13(false, j, "com.jagex.Game updated - please reload page");
                            l1 = 10;
                        } else
                        {
                            method13(false, j, s2 + " - Retrying in " + l1);
                        }
                        try
                        {
                            Thread.sleep(1000L);
                        }
                        catch(Exception _ex)
                        {
                        }
                    }
                    l *= 2;
                    if(l > 60)
                    {
                        l = 60;
                    }
                    aBoolean922 = !aBoolean922;
                }
            }
            Class47 class47_1 = new Class47(abyte0, 0);
            return class47_1;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("12814, " + byte0 + ", " + s + ", " + i + ", " + s1 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method126(byte byte0)
    {
        try
        {
            int i = 3;
            if(byte0 != 2)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            if(anInt878 < 310)
            {
                int j = anInt875 >> 7;
                int k = anInt877 >> 7;
                int l = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 >> 7;
                int i1 = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 >> 7;
                if((aByteArrayArrayArray871[anInt1155][j][k] & 4) != 0)
                {
                    i = anInt1155;
                }
                int j1;
                if(l > j)
                {
                    j1 = l - j;
                } else
                {
                    j1 = j - l;
                }
                int k1;
                if(i1 > k)
                {
                    k1 = i1 - k;
                } else
                {
                    k1 = k - i1;
                }
                if(j1 > k1)
                {
                    int l1 = (k1 * 0x10000) / j1;
                    int j2 = 32768;
                    while(j != l)
                    {
                        if(j < l)
                        {
                            j++;
                        } else
                        if(j > l)
                        {
                            j--;
                        }
                        if((aByteArrayArrayArray871[anInt1155][j][k] & 4) != 0)
                        {
                            i = anInt1155;
                        }
                        j2 += l1;
                        if(j2 >= 0x10000)
                        {
                            j2 -= 0x10000;
                            if(k < i1)
                            {
                                k++;
                            } else
                            if(k > i1)
                            {
                                k--;
                            }
                            if((aByteArrayArrayArray871[anInt1155][j][k] & 4) != 0)
                            {
                                i = anInt1155;
                            }
                        }
                    }
                } else
                {
                    int i2 = (j1 * 0x10000) / k1;
                    int k2 = 32768;
                    while(k != i1)
                    {
                        if(k < i1)
                        {
                            k++;
                        } else
                        if(k > i1)
                        {
                            k--;
                        }
                        if((aByteArrayArrayArray871[anInt1155][j][k] & 4) != 0)
                        {
                            i = anInt1155;
                        }
                        k2 += i2;
                        if(k2 >= 0x10000)
                        {
                            k2 -= 0x10000;
                            if(j < l)
                            {
                                j++;
                            } else
                            if(j > l)
                            {
                                j--;
                            }
                            if((aByteArrayArrayArray871[anInt1155][j][k] & 4) != 0)
                            {
                                i = anInt1155;
                            }
                        }
                    }
                }
            }
            if((aByteArrayArrayArray871[anInt1155][((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 >> 7][((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 >> 7] & 4) != 0)
            {
                i = anInt1155;
            }
            return i;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("26640, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method127(byte byte0)
    {
        try
        {
            if(byte0 == 7)
            {
                byte0 = 0;
            } else
            {
                return 2;
            }
            int i = method51(false, anInt877, anInt875, anInt1155);
            if(i - anInt876 < 800 && (aByteArrayArrayArray871[anInt1155][anInt875 >> 7][anInt877 >> 7] & 4) != 0)
            {
                return anInt1155;
            } else
            {
                return 3;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("19764, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method128(boolean flag)
    {
        try
        {
            aBoolean1174 = false;
            while(aBoolean893)
            {
                aBoolean1174 = false;
                try
                {
                    Thread.sleep(50L);
                }
                catch(Exception _ex)
                {
                }
            }
            aClass44_Sub3_Sub1_Sub3_891 = null;
            aClass44_Sub3_Sub1_Sub3_892 = null;
            aClass44_Sub3_Sub1_Sub3Array864 = null;
            anIntArray1218 = null;
            anIntArray1219 = null;
            anIntArray1220 = null;
            anIntArray1221 = null;
            anIntArray1133 = null;
            anIntArray1134 = null;
            anIntArray1272 = null;
            if(flag)
            {
                aClass44_Sub3_Sub2_850.method472(203);
            }
            anIntArray1273 = null;
            aClass44_Sub3_Sub1_Sub2_1277 = null;
            aClass44_Sub3_Sub1_Sub2_1278 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("94958, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void run()
    {
        if(aBoolean886)
        {
            method35(false);
            return;
        } else
        {
            super.run();
            return;
        }
    }

    public void method129(int i)
    {
        try
        {
            try
            {
                anInt1063 = -1;
                aClass28_1054.method263();
                aClass28_918.method263();
                Class44_Sub3_Sub1_Sub1.method421(false);
                method76(aByte1042);
                aClass36_1192.method278(true);
                for(int j = 0; j < 4; j++)
                {
                    aClass18Array1022[j].method231(3);
                }
                System.gc();
                Class3 class3 = new Class3(anIntArrayArrayArray865, 104, (byte)9, aByteArrayArrayArray871, 104);
                int k1 = aByteArrayArray981.length;
                Class3.aBoolean64 = Class36.aBoolean606;
                for(int j2 = 0; j2 < k1; j2++)
                {
                    int l2 = anIntArray1039[j2] >> 8;
                    int k3 = anIntArray1039[j2] & 0xff;
                    if(l2 == 33 && k3 >= 71 && k3 <= 73)
                    {
                        Class3.aBoolean64 = false;
                    }
                }
                if(Class3.aBoolean64)
                {
                    aClass36_1192.method279((byte)7, anInt1155);
                } else
                {
                    aClass36_1192.method279((byte)7, 0);
                }
                aClass44_Sub3_Sub2_850.method471(-34003, 181);
                for(int i3 = 0; i3 < k1; i3++)
                {
                    int l3 = (anIntArray1039[i3] >> 8) * 64 - anInt1184;
                    int k4 = (anIntArray1039[i3] & 0xff) * 64 - anInt1185;
                    byte abyte0[] = aByteArrayArray981[i3];
                    if(abyte0 != null)
                    {
                        class3.method158((anInt842 - 6) * 8, (anInt841 - 6) * 8, (byte)-54, abyte0, k4, l3);
                    }
                }
                for(int i4 = 0; i4 < k1; i4++)
                {
                    int l4 = (anIntArray1039[i4] >> 8) * 64 - anInt1184;
                    int k5 = (anIntArray1039[i4] & 0xff) * 64 - anInt1185;
                    byte abyte2[] = aByteArrayArray981[i4];
                    if(abyte2 == null && anInt842 < 800)
                    {
                        class3.method157(l4, k5, 64, true, 64);
                    }
                }
                aClass44_Sub3_Sub2_850.method471(-34003, 181);
                for(int i5 = 0; i5 < k1; i5++)
                {
                    byte abyte1[] = aByteArrayArray973[i5];
                    if(abyte1 != null)
                    {
                        int j6 = (anIntArray1039[i5] >> 8) * 64 - anInt1184;
                        int l6 = (anIntArray1039[i5] & 0xff) * 64 - anInt1185;
                        class3.method161(l6, j6, abyte1, aClass36_1192, (byte)4, aClass18Array1022);
                    }
                }
                aClass44_Sub3_Sub2_850.method471(-34003, 181);
                class3.method163((byte)76, aClass18Array1022, aClass36_1192);
                aClass34_1197.method272((byte)5);
                aClass44_Sub3_Sub2_850.method471(-34003, 181);
                for(int l5 = 0; l5 < 104; l5++)
                {
                    for(int k6 = 0; k6 < 104; k6++)
                    {
                        method92(l5, k6);
                    }
                }
                method101(-922);
            }
            catch(Exception exception)
            {
            }
            Class8.aClass39_251.method341();
            if(aBoolean1235 && Signlink.cache_dat != null)
            {
                int k = aClass43_Sub1_814.method385(0, (byte)7);
                for(int i1 = 0; i1 < k; i1++)
                {
                    int l1 = aClass43_Sub1_814.method390(i1, -600);
                    if((l1 & 0x79) == 0)
                    {
                        Class44_Sub3_Sub4_Sub4.method505((byte)63, i1);
                    }
                }
            }
            System.gc();
            Class44_Sub3_Sub1_Sub1.method422(1, 20);
            if(i != -17416)
            {
                return;
            }
            aClass43_Sub1_814.method396(anInt948);
            int l = (anInt841 - 6) / 8 - 1;
            int j1 = (anInt841 + 6) / 8 + 1;
            int i2 = (anInt842 - 6) / 8 - 1;
            int k2 = (anInt842 + 6) / 8 + 1;
            if(aBoolean906)
            {
                l = 49;
                j1 = 50;
                i2 = 49;
                k2 = 50;
            }
            for(int j3 = l; j3 <= j1; j3++)
            {
                for(int j4 = i2; j4 <= k2; j4++)
                {
                    if(j3 == l || j3 == j1 || j4 == i2 || j4 == k2)
                    {
                        int j5 = aClass43_Sub1_814.method387(j4, -942, j3, 0);
                        if(j5 != -1)
                        {
                            aClass43_Sub1_814.method397(j5, 3, (byte)6);
                        }
                        int i6 = aClass43_Sub1_814.method387(j4, -942, j3, 1);
                        if(i6 != -1)
                        {
                            aClass43_Sub1_814.method397(i6, 3, (byte)6);
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("93797, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method130(int i, Class44_Sub3_Sub2 class44_sub3_sub2, boolean flag)
    {
        try
        {
            class44_sub3_sub2.method492((byte)-51);
            int j = class44_sub3_sub2.method493(1, false);
            if(j == 0)
            {
                return;
            }
            int k = class44_sub3_sub2.method493(2, false);
            if(flag)
            {
                anInt1170 = class44_sub3_sub2.method482();
            }
            if(k == 0)
            {
                anIntArray1229[anInt1228++] = anInt1224;
                return;
            }
            if(k == 1)
            {
                int l = class44_sub3_sub2.method493(3, false);
                aClass44_Sub3_Sub4_Sub6_Sub1_1047.method533(false, l, anInt1153);
                int k1 = class44_sub3_sub2.method493(1, false);
                if(k1 == 1)
                {
                    anIntArray1229[anInt1228++] = anInt1224;
                }
                return;
            }
            if(k == 2)
            {
                int i1 = class44_sub3_sub2.method493(3, false);
                aClass44_Sub3_Sub4_Sub6_Sub1_1047.method533(true, i1, anInt1153);
                int l1 = class44_sub3_sub2.method493(3, false);
                aClass44_Sub3_Sub4_Sub6_Sub1_1047.method533(true, l1, anInt1153);
                int j2 = class44_sub3_sub2.method493(1, false);
                if(j2 == 1)
                {
                    anIntArray1229[anInt1228++] = anInt1224;
                }
                return;
            }
            if(k == 3)
            {
                anInt1155 = class44_sub3_sub2.method493(2, false);
                int j1 = class44_sub3_sub2.method493(7, false);
                int i2 = class44_sub3_sub2.method493(7, false);
                int k2 = class44_sub3_sub2.method493(1, false);
                aClass44_Sub3_Sub4_Sub6_Sub1_1047.method532(j1, k2 == 1, i2, aByte925);
                int l2 = class44_sub3_sub2.method493(1, false);
                if(l2 == 1)
                {
                    anIntArray1229[anInt1228++] = anInt1224;
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("6378, " + i + ", " + class44_sub3_sub2 + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method131(byte byte0)
    {
        try
        {
            Class36.aBoolean606 = true;
            if(byte0 != 102)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            Class44_Sub3_Sub1_Sub1.aBoolean1418 = true;
            aBoolean1235 = true;
            Class3.aBoolean64 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("41041, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method132(int i)
    {
        try
        {
            int j = anInt1118 * 128 + 64;
            int k = anInt1119 * 128 + 64;
            int l = method51(false, k, j, anInt1155) - anInt1120;
            if(anInt875 < j)
            {
                anInt875 += anInt1121 + ((j - anInt875) * anInt1122) / 1000;
                if(anInt875 > j)
                {
                    anInt875 = j;
                }
            }
            if(anInt875 > j)
            {
                anInt875 -= anInt1121 + ((anInt875 - j) * anInt1122) / 1000;
                if(anInt875 < j)
                {
                    anInt875 = j;
                }
            }
            if(anInt876 < l)
            {
                anInt876 += anInt1121 + ((l - anInt876) * anInt1122) / 1000;
                if(anInt876 > l)
                {
                    anInt876 = l;
                }
            }
            if(anInt876 > l)
            {
                anInt876 -= anInt1121 + ((anInt876 - l) * anInt1122) / 1000;
                if(anInt876 < l)
                {
                    anInt876 = l;
                }
            }
            if(anInt877 < k)
            {
                anInt877 += anInt1121 + ((k - anInt877) * anInt1122) / 1000;
                if(anInt877 > k)
                {
                    anInt877 = k;
                }
            }
            if(anInt877 > k)
            {
                anInt877 -= anInt1121 + ((anInt877 - k) * anInt1122) / 1000;
                if(anInt877 < k)
                {
                    anInt877 = k;
                }
            }
            j = anInt989 * 128 + 64;
            k = anInt990 * 128 + 64;
            l = method51(false, k, j, anInt1155) - anInt991;
            int i1 = j - anInt875;
            int j1 = l - anInt876;
            int k1 = k - anInt877;
            anInt1169 += i;
            int l1 = (int)Math.sqrt(i1 * i1 + k1 * k1);
            int i2 = (int)(Math.atan2(j1, l1) * 325.94900000000001D) & 0x7ff;
            int j2 = (int)(Math.atan2(i1, k1) * -325.94900000000001D) & 0x7ff;
            if(i2 < 128)
            {
                i2 = 128;
            }
            if(i2 > 383)
            {
                i2 = 383;
            }
            if(anInt878 < i2)
            {
                anInt878 += anInt992 + ((i2 - anInt878) * anInt993) / 1000;
                if(anInt878 > i2)
                {
                    anInt878 = i2;
                }
            }
            if(anInt878 > i2)
            {
                anInt878 -= anInt992 + ((anInt878 - i2) * anInt993) / 1000;
                if(anInt878 < i2)
                {
                    anInt878 = i2;
                }
            }
            int k2 = j2 - anInt879;
            if(k2 > 1024)
            {
                k2 -= 2048;
            }
            if(k2 < -1024)
            {
                k2 += 2048;
            }
            if(k2 > 0)
            {
                anInt879 += anInt992 + (k2 * anInt993) / 1000;
                anInt879 &= 0x7ff;
            }
            if(k2 < 0)
            {
                anInt879 -= anInt992 + (-k2 * anInt993) / 1000;
                anInt879 &= 0x7ff;
            }
            int l2 = j2 - anInt879;
            if(l2 > 1024)
            {
                l2 -= 2048;
            }
            if(l2 < -1024)
            {
                l2 += 2048;
            }
            if(l2 < 0 && k2 > 0 || l2 > 0 && k2 < 0)
            {
                anInt879 = j2;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("37827, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method133(int i)
    {
        try
        {
            anInt1087++;
            while(i >= 0)
            {
                anInt962 = 326;
            }
            if(anInt1087 > 192)
            {
                anInt1087 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 137);
                aClass44_Sub3_Sub2_850.method472(232);
            }
            do
            {
                int j = method5(-128);
                if(j == -1)
                {
                    break;
                }
                if(anInt1199 != -1 && anInt1199 == anInt1217)
                {
                    if(j == 8 && aString939.length() > 0)
                    {
                        aString939 = aString939.substring(0, aString939.length() - 1);
                    }
                    if((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && aString939.length() < 12)
                    {
                        aString939 += (char)j;
                    }
                } else
                if(aBoolean1222)
                {
                    if(j >= 32 && j <= 122 && aString1007.length() < 80)
                    {
                        aString1007 += (char)j;
                        aBoolean1049 = true;
                    }
                    if(j == 8 && aString1007.length() > 0)
                    {
                        aString1007 = aString1007.substring(0, aString1007.length() - 1);
                        aBoolean1049 = true;
                    }
                    if(j == 13 || j == 10)
                    {
                        aBoolean1222 = false;
                        aBoolean1049 = true;
                        if(anInt880 == 1)
                        {
                            long l = Class48.method550(aString1007);
                            method95(0, l);
                        }
                        if(anInt880 == 2 && anInt1104 > 0)
                        {
                            long l1 = Class48.method550(aString1007);
                            method44(l1, 37517);
                        }
                        if(anInt880 == 3 && aString1007.length() > 0)
                        {
                            aClass44_Sub3_Sub2_850.method471(-34003, 107);
                            aClass44_Sub3_Sub2_850.method472(0);
                            int k = aClass44_Sub3_Sub2_850.anInt1392;
                            aClass44_Sub3_Sub2_850.method478(aLong967, true);
                            Class49.method557(aString1007, aClass44_Sub3_Sub2_850, 991);
                            aClass44_Sub3_Sub2_850.method481(aClass44_Sub3_Sub2_850.anInt1392 - k, anInt1152);
                            aString1007 = Class49.method558(aString1007, anInt1242);
                            aString1007 = Class41.method352(aString1007, anInt1242);
                            method17(6, (byte)-115, aString1007, Class48.method554(Class48.method551(aLong967, true), true));
                            if(anInt895 == 2)
                            {
                                anInt895 = 1;
                                aBoolean1062 = true;
                                aClass44_Sub3_Sub2_850.method471(-34003, 161);
                                aClass44_Sub3_Sub2_850.method472(anInt843);
                                aClass44_Sub3_Sub2_850.method472(anInt895);
                                aClass44_Sub3_Sub2_850.method472(anInt1168);
                            }
                        }
                        if(anInt880 == 4 && anInt957 < 100)
                        {
                            long l2 = Class48.method550(aString1007);
                            method55((byte)-37, l2);
                        }
                        if(anInt880 == 5 && anInt957 > 0)
                        {
                            long l3 = Class48.method550(aString1007);
                            method142(-197, l3);
                        }
                    }
                } else
                if(aBoolean980)
                {
                    if(j >= 48 && j <= 57 && aString1092.length() < 10)
                    {
                        aString1092 += (char)j;
                        aBoolean1049 = true;
                    }
                    if(j == 8 && aString1092.length() > 0)
                    {
                        aString1092 = aString1092.substring(0, aString1092.length() - 1);
                        aBoolean1049 = true;
                    }
                    if(j == 13 || j == 10)
                    {
                        if(aString1092.length() > 0)
                        {
                            int i1 = 0;
                            try
                            {
                                i1 = Integer.parseInt(aString1092);
                            }
                            catch(Exception _ex)
                            {
                            }
                            aClass44_Sub3_Sub2_850.method471(-34003, 180);
                            aClass44_Sub3_Sub2_850.method476(i1);
                        }
                        aBoolean980 = false;
                        aBoolean1049 = true;
                    }
                } else
                if(anInt1253 == -1)
                {
                    if(j >= 32 && j <= 122 && aString1141.length() < 80)
                    {
                        aString1141 += (char)j;
                        aBoolean1049 = true;
                    }
                    if(j == 8 && aString1141.length() > 0)
                    {
                        aString1141 = aString1141.substring(0, aString1141.length() - 1);
                        aBoolean1049 = true;
                    }
                    if((j == 13 || j == 10) && aString1141.length() > 0)
                    {
                        if(anInt1188 == 2)
                        {
                            if(aString1141.equals("::clientdrop"))
                            {
                                method99((byte)7);
                            }
                            if(aString1141.equals("::lag"))
                            {
                                method29((byte)-11);
                            }
                            if(aString1141.equals("::prefetchmusic"))
                            {
                                for(int j1 = 0; j1 < aClass43_Sub1_814.method385(2, (byte)7); j1++)
                                {
                                    aClass43_Sub1_814.method395(7, 2, (byte)1, j1);
                                }
                            }
                        }
                        if(aString1141.startsWith("::"))
                        {
                            aClass44_Sub3_Sub2_850.method471(-34003, 34);
                            aClass44_Sub3_Sub2_850.method472(aString1141.length() - 1);
                            aClass44_Sub3_Sub2_850.method479(aString1141.substring(2));
                        } else
                        {
                            String s = aString1141.toLowerCase();
                            int k1 = 0;
                            if(s.startsWith("yellow:"))
                            {
                                k1 = 0;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("red:"))
                            {
                                k1 = 1;
                                aString1141 = aString1141.substring(4);
                            } else
                            if(s.startsWith("green:"))
                            {
                                k1 = 2;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("cyan:"))
                            {
                                k1 = 3;
                                aString1141 = aString1141.substring(5);
                            } else
                            if(s.startsWith("purple:"))
                            {
                                k1 = 4;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("white:"))
                            {
                                k1 = 5;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("flash1:"))
                            {
                                k1 = 6;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("flash2:"))
                            {
                                k1 = 7;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("flash3:"))
                            {
                                k1 = 8;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("glow1:"))
                            {
                                k1 = 9;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("glow2:"))
                            {
                                k1 = 10;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("glow3:"))
                            {
                                k1 = 11;
                                aString1141 = aString1141.substring(6);
                            }
                            s = aString1141.toLowerCase();
                            int i2 = 0;
                            if(s.startsWith("wave:"))
                            {
                                i2 = 1;
                                aString1141 = aString1141.substring(5);
                            } else
                            if(s.startsWith("wave2:"))
                            {
                                i2 = 2;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("shake:"))
                            {
                                i2 = 3;
                                aString1141 = aString1141.substring(6);
                            } else
                            if(s.startsWith("scroll:"))
                            {
                                i2 = 4;
                                aString1141 = aString1141.substring(7);
                            } else
                            if(s.startsWith("slide:"))
                            {
                                i2 = 5;
                                aString1141 = aString1141.substring(6);
                            }
                            aClass44_Sub3_Sub2_850.method471(-34003, 156);
                            aClass44_Sub3_Sub2_850.method472(0);
                            int j2 = aClass44_Sub3_Sub2_850.anInt1392;
                            aClass44_Sub3_Sub2_850.method472(k1);
                            aClass44_Sub3_Sub2_850.method472(i2);
                            Class49.method557(aString1141, aClass44_Sub3_Sub2_850, 991);
                            aClass44_Sub3_Sub2_850.method481(aClass44_Sub3_Sub2_850.anInt1392 - j2, anInt1152);
                            aString1141 = Class49.method558(aString1141, anInt1242);
                            aString1141 = Class41.method352(aString1141, anInt1242);
                            aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1627 = aString1141;
                            aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1629 = k1;
                            aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1630 = i2;
                            aClass44_Sub3_Sub4_Sub6_Sub1_1047.anInt1628 = 150;
                            if(anInt1188 == 2)
                            {
                                method17(2, (byte)-115, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).aString1627, "@cr2@" + aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672);
                            } else
                            if(anInt1188 == 1)
                            {
                                method17(2, (byte)-115, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).aString1627, "@cr1@" + aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672);
                            } else
                            {
                                method17(2, (byte)-115, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).aString1627, aClass44_Sub3_Sub4_Sub6_Sub1_1047.aString1672);
                            }
                            if(anInt843 == 2)
                            {
                                anInt843 = 3;
                                aBoolean1062 = true;
                                aClass44_Sub3_Sub2_850.method471(-34003, 161);
                                aClass44_Sub3_Sub2_850.method472(anInt843);
                                aClass44_Sub3_Sub2_850.method472(anInt895);
                                aClass44_Sub3_Sub2_850.method472(anInt1168);
                            }
                        }
                        aString1141 = "";
                        aBoolean1049 = true;
                    }
                }
            } while(true);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("93263, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method9(byte byte0)
    {
        try
        {
            if(aBoolean1236 || aBoolean1055 || aBoolean820)
            {
                method53(9);
                return;
            }
            anInt1175++;
            if(!aBoolean863)
            {
                method66((byte)-21, false);
            } else
            {
                method123(false);
            }
            anInt1066 = 0;
            if(byte0 == 1)
            {
                byte0 = 0;
                return;
            } else
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("25980, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method134(int i, int j)
    {
        try
        {
            if(i < 0)
            {
                return;
            }
            if(aBoolean980)
            {
                aBoolean980 = false;
                aBoolean1049 = true;
            }
            int k = anIntArray837[i];
            int l = anIntArray838[i];
            int i1 = anIntArray839[i];
            int j1 = anIntArray840[i];
            if(i1 >= 2000)
            {
                i1 -= 2000;
            }
            if(i1 == 721)
            {
                anInt1238 += l;
                if(anInt1238 >= 139)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 195);
                    aClass44_Sub3_Sub2_850.method476(0);
                }
                method78(j1, 45, false, l, k);
            }
            if(i1 == 718)
            {
                if(!aBoolean946)
                {
                    aClass36_1192.method316(super.anInt29 - 4, anInt861, super.anInt28 - 4);
                } else
                {
                    aClass36_1192.method316(l - 4, anInt861, k - 4);
                }
            }
            if(i1 == 131)
            {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j1];
                if(class44_sub3_sub4_sub6_sub1 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 138);
                    aClass44_Sub3_Sub2_850.method473(j1);
                    aClass44_Sub3_Sub2_850.method473(anInt995);
                }
            }
            if(i1 == 507 || i1 == 957)
            {
                String s = aStringArray897[i];
                int l1 = s.indexOf("@whi@");
                if(l1 != -1)
                {
                    s = s.substring(l1 + 5).trim();
                    String s8 = Class48.method554(Class48.method551(Class48.method550(s), true), true);
                    boolean flag4 = false;
                    for(int k3 = 0; k3 < anInt1226; k3++)
                    {
                        Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_3 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[k3]];
                        if(class44_sub3_sub4_sub6_sub1_3 == null || class44_sub3_sub4_sub6_sub1_3.aString1672 == null || !class44_sub3_sub4_sub6_sub1_3.aString1672.equalsIgnoreCase(s8))
                        {
                            continue;
                        }
                        method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_3)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_3)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                        if(i1 == 507)
                        {
                            anInt821 += j1;
                            if(anInt821 >= 66)
                            {
                                aClass44_Sub3_Sub2_850.method471(-34003, 46);
                                aClass44_Sub3_Sub2_850.method472(154);
                            }
                            aClass44_Sub3_Sub2_850.method471(-34003, 189);
                        }
                        if(i1 == 957)
                        {
                            anInt870++;
                            if(anInt870 >= 52)
                            {
                                aClass44_Sub3_Sub2_850.method471(-34003, 49);
                                aClass44_Sub3_Sub2_850.method472(131);
                            }
                            aClass44_Sub3_Sub2_850.method471(-34003, 220);
                        }
                        aClass44_Sub3_Sub2_850.method473(anIntArray1227[k3]);
                        flag4 = true;
                        break;
                    }
                    if(!flag4)
                    {
                        method17(0, (byte)-115, "Unable to find " + s8, "");
                    }
                }
            }
            if(i1 == 625)
            {
                method78(j1, 10, false, l, k);
            }
            if(i1 == 1152)
            {
                Class14 class14 = Class14.method220(j1);
                String s4;
                if(class14.aByteArray332 != null)
                {
                    s4 = new String(class14.aByteArray332);
                } else
                {
                    s4 = "It's a " + class14.aString331 + ".";
                }
                method17(0, (byte)-115, s4, "");
            }
            if(i1 == 737)
            {
                method28(3);
            }
            if(i1 == 902)
            {
                String s1 = aStringArray897[i];
                int i2 = s1.indexOf("@whi@");
                if(i2 != -1)
                {
                    long l3 = Class48.method550(s1.substring(i2 + 5).trim());
                    int i4 = -1;
                    for(int j4 = 0; j4 < anInt1104; j4++)
                    {
                        if(aLongArray979[j4] != l3)
                        {
                            continue;
                        }
                        i4 = j4;
                        break;
                    }
                    if(i4 != -1 && anIntArray894[i4] > 0)
                    {
                        aBoolean1049 = true;
                        aBoolean980 = false;
                        aBoolean1222 = true;
                        aString1007 = "";
                        anInt880 = 3;
                        aLong967 = aLongArray979[i4];
                        aString1102 = "Enter message to send to " + aStringArray1044[i4];
                    }
                }
            }
            if(i1 == 605 || i1 == 47 || i1 == 513 || i1 == 884)
            {
                String s2 = aStringArray897[i];
                int j2 = s2.indexOf("@whi@");
                if(j2 != -1)
                {
                    long l4 = Class48.method550(s2.substring(j2 + 5).trim());
                    if(i1 == 605)
                    {
                        method95(0, l4);
                    }
                    if(i1 == 47)
                    {
                        method55((byte)-37, l4);
                    }
                    if(i1 == 513)
                    {
                        method44(l4, 37517);
                    }
                    if(i1 == 884)
                    {
                        method142(-197, l4);
                    }
                }
            }
            if(i1 == 563)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 112);
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(k);
                aClass44_Sub3_Sub2_850.method473(l);
                aClass44_Sub3_Sub2_850.method473(anInt995);
                anInt1148 = 0;
                anInt1149 = l;
                anInt1150 = k;
                anInt1151 = 2;
                if(Class5.aClass5Array100[l].anInt106 == anInt1199)
                {
                    anInt1151 = 1;
                }
                if(Class5.aClass5Array100[l].anInt106 == anInt1253)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 274)
            {
                Class5 class5 = Class5.aClass5Array100[l];
                anInt994 = 1;
                anInt995 = l;
                anInt996 = class5.anInt160;
                anInt952 = 0;
                aBoolean898 = true;
                String s5 = class5.aString158;
                if(s5.indexOf(" ") != -1)
                {
                    s5 = s5.substring(0, s5.indexOf(" "));
                }
                String s9 = class5.aString158;
                if(s9.indexOf(" ") != -1)
                {
                    s9 = s9.substring(s9.indexOf(" ") + 1);
                }
                aString997 = s5 + " " + class5.aString159 + " " + s9;
                if(anInt996 == 16)
                {
                    aBoolean898 = true;
                    anInt1027 = 3;
                    aBoolean1154 = true;
                }
                return;
            }
            if(i1 == 225)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 86);
                aClass44_Sub3_Sub2_850.method473(l);
                Class5 class5_1 = Class5.aClass5Array100[l];
                if(class5_1.anIntArrayArray115 != null && class5_1.anIntArrayArray115[0][0] == 5)
                {
                    int k2 = class5_1.anIntArrayArray115[0][1];
                    if(anIntArray1214[k2] != class5_1.anIntArray117[0])
                    {
                        anIntArray1214[k2] = class5_1.anIntArray117[0];
                        method147(true, k2);
                        aBoolean898 = true;
                    }
                }
            }
            if(i1 == 524)
            {
                String s3 = aStringArray897[i];
                int l2 = s3.indexOf("@whi@");
                if(l2 != -1)
                {
                    if(anInt1199 == -1)
                    {
                        method28(3);
                        aString939 = s3.substring(l2 + 5).trim();
                        aBoolean987 = false;
                        for(int j3 = 0; j3 < Class5.aClass5Array100.length; j3++)
                        {
                            if(Class5.aClass5Array100[j3] == null || Class5.aClass5Array100[j3].anInt109 != 600)
                            {
                                continue;
                            }
                            anInt1217 = anInt1199 = Class5.aClass5Array100[j3].anInt106;
                            break;
                        }
                    } else
                    {
                        method17(0, (byte)-115, "Please close the interface you have open before using 'report abuse'", "");
                    }
                }
            }
            if(i1 == 242 || i1 == 209 || i1 == 309 || i1 == 852 || i1 == 793)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j1];
                if(class44_sub3_sub4_sub6_sub2 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    if(i1 == 242)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 252);
                    }
                    if(i1 == 209)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 21);
                    }
                    if(i1 == 793)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 247);
                    }
                    if(i1 == 309)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 178);
                    }
                    if(i1 == 852)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 30);
                    }
                    aClass44_Sub3_Sub2_850.method473(j1);
                }
            }
            if(i1 == 231)
            {
                Class5 class5_2 = Class5.aClass5Array100[l];
                boolean flag3 = true;
                if(class5_2.anInt109 > 0)
                {
                    flag3 = method19((byte)-16, class5_2);
                }
                if(flag3)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 86);
                    aClass44_Sub3_Sub2_850.method473(l);
                }
            }
            if(i1 == 1714)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j1];
                if(class44_sub3_sub4_sub6_sub2_1 != null)
                {
                    String s6;
                    if(class44_sub3_sub4_sub6_sub2_1.aClass12_1700.aByteArray283 != null)
                    {
                        s6 = new String(class44_sub3_sub4_sub6_sub2_1.aClass12_1700.aByteArray283);
                    } else
                    {
                        s6 = "It's a " + class44_sub3_sub4_sub6_sub2_1.aClass12_1700.aString282 + ".";
                    }
                    method17(0, (byte)-115, s6, "");
                }
            }
            if(i1 == 398)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 200);
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(k);
                aClass44_Sub3_Sub2_850.method473(l);
                aClass44_Sub3_Sub2_850.method473(anInt955);
                aClass44_Sub3_Sub2_850.method473(anInt953);
                aClass44_Sub3_Sub2_850.method473(anInt954);
                anInt1148 = 0;
                anInt1149 = l;
                anInt1150 = k;
                anInt1151 = 2;
                if(Class5.aClass5Array100[l].anInt106 == anInt1199)
                {
                    anInt1151 = 1;
                }
                if(Class5.aClass5Array100[l].anInt106 == anInt1253)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 102)
            {
                anInt952 = 1;
                anInt953 = k;
                anInt954 = l;
                anInt955 = j1;
                aString956 = Class14.method220(j1).aString331;
                anInt994 = 0;
                aBoolean898 = true;
                return;
            }
            if(i1 == 997 && !aBoolean935)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 166);
                aClass44_Sub3_Sub2_850.method473(l);
                aBoolean935 = true;
            }
            if(i1 == 899 && method78(j1, 218, false, l, k))
            {
                aClass44_Sub3_Sub2_850.method473(anInt995);
            }
            if(i1 == 694 || i1 == 962 || i1 == 795 || i1 == 681 || i1 == 100)
            {
                if(i1 == 100)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 79);
                }
                if(i1 == 681)
                {
                    anInt1100++;
                    if(anInt1100 >= 116)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 88);
                        aClass44_Sub3_Sub2_850.method475(0xc6a439);
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 191);
                }
                if(i1 == 694)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 76);
                }
                if(i1 == 795)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 40);
                }
                if(i1 == 962)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 177);
                }
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(k);
                aClass44_Sub3_Sub2_850.method473(l);
                anInt1148 = 0;
                anInt1149 = l;
                anInt1150 = k;
                anInt1151 = 2;
                if(Class5.aClass5Array100[l].anInt106 == anInt1199)
                {
                    anInt1151 = 1;
                }
                if(Class5.aClass5Array100[l].anInt106 == anInt1253)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 275)
            {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j1];
                if(class44_sub3_sub4_sub6_sub1_1 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 16);
                    aClass44_Sub3_Sub2_850.method473(j1);
                    aClass44_Sub3_Sub2_850.method473(anInt955);
                    aClass44_Sub3_Sub2_850.method473(anInt953);
                    aClass44_Sub3_Sub2_850.method473(anInt954);
                }
            }
            if(i1 == 240)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j1];
                if(class44_sub3_sub4_sub6_sub2_2 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_2)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_2)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 108);
                    aClass44_Sub3_Sub2_850.method473(j1);
                    aClass44_Sub3_Sub2_850.method473(anInt995);
                }
            }
            if(i1 == 743)
            {
                anInt1180++;
                if(anInt1180 >= 124)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 81);
                    aClass44_Sub3_Sub2_850.method473(37954);
                }
                method78(j1, 196, false, l, k);
            }
            if(i1 == 111)
            {
                boolean flag = method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 0, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                if(!flag)
                {
                    flag = method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 1, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 55);
                aClass44_Sub3_Sub2_850.method473(k + anInt1184);
                aClass44_Sub3_Sub2_850.method473(l + anInt1185);
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(anInt955);
                aClass44_Sub3_Sub2_850.method473(anInt953);
                aClass44_Sub3_Sub2_850.method473(anInt954);
            }
            if(i1 == 810 && method78(j1, 184, false, l, k))
            {
                aClass44_Sub3_Sub2_850.method473(anInt955);
                aClass44_Sub3_Sub2_850.method473(anInt953);
                aClass44_Sub3_Sub2_850.method473(anInt954);
            }
            if(i1 == 829)
            {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_3 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j1];
                if(class44_sub3_sub4_sub6_sub2_3 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_3)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_3)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    aClass44_Sub3_Sub2_850.method471(-34003, 160);
                    aClass44_Sub3_Sub2_850.method473(j1);
                    aClass44_Sub3_Sub2_850.method473(anInt955);
                    aClass44_Sub3_Sub2_850.method473(anInt953);
                    aClass44_Sub3_Sub2_850.method473(anInt954);
                }
            }
            if(i1 == 1381)
            {
                int k1 = j1 >> 14 & 0x7fff;
                Class8 class8 = Class8.method199(k1);
                String s10;
                if(class8.aByteArray219 != null)
                {
                    s10 = new String(class8.aByteArray219);
                } else
                {
                    s10 = "It's a " + class8.aString218 + ".";
                }
                method17(0, (byte)-115, s10, "");
            }
            if(i1 == 1071)
            {
                method78(j1, 126, false, l, k);
            }
            if(i1 == 139 || i1 == 778 || i1 == 617 || i1 == 224 || i1 == 662)
            {
                boolean flag1 = method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 0, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                if(!flag1)
                {
                    flag1 = method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 1, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                if(i1 == 662)
                {
                    anInt986 += anInt1185;
                    if(anInt986 >= 118)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 122);
                        aClass44_Sub3_Sub2_850.method476(0);
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 22);
                }
                if(i1 == 139)
                {
                    if((k & 3) == 0)
                    {
                        anInt1114++;
                    }
                    if(anInt1114 >= 123)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 133);
                        aClass44_Sub3_Sub2_850.method476(0);
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 97);
                }
                if(i1 == 778)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 4);
                }
                if(i1 == 617)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 110);
                }
                if(i1 == 224)
                {
                    anInt1046 += l;
                    if(anInt1046 >= 75)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 168);
                        aClass44_Sub3_Sub2_850.method472(19);
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 147);
                }
                aClass44_Sub3_Sub2_850.method473(k + anInt1184);
                aClass44_Sub3_Sub2_850.method473(l + anInt1185);
                aClass44_Sub3_Sub2_850.method473(j1);
            }
            if(i1 == 435)
            {
                aClass44_Sub3_Sub2_850.method471(-34003, 86);
                aClass44_Sub3_Sub2_850.method473(l);
                Class5 class5_3 = Class5.aClass5Array100[l];
                if(class5_3.anIntArrayArray115 != null && class5_3.anIntArrayArray115[0][0] == 5)
                {
                    int i3 = class5_3.anIntArrayArray115[0][1];
                    anIntArray1214[i3] = 1 - anIntArray1214[i3];
                    method147(true, i3);
                    aBoolean898 = true;
                }
            }
            if(i1 == 357)
            {
                method78(j1, 53, false, l, k);
            }
            if(i1 == 370)
            {
                boolean flag2 = method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 0, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                if(!flag2)
                {
                    flag2 = method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, l, 0, 0, false, 2, 124, 1, k, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                }
                anInt815 = super.anInt28;
                anInt816 = super.anInt29;
                anInt818 = 2;
                anInt817 = 0;
                aClass44_Sub3_Sub2_850.method471(-34003, 241);
                aClass44_Sub3_Sub2_850.method473(k + anInt1184);
                aClass44_Sub3_Sub2_850.method473(l + anInt1185);
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(anInt995);
            }
            if(i1 == 639 || i1 == 499 || i1 == 27 || i1 == 387 || i1 == 185)
            {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_2 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[j1];
                if(class44_sub3_sub4_sub6_sub1_2 != null)
                {
                    method124(1, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_2)).anIntArray1666[0], 0, 0, false, 2, 124, 1, ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_2)).anIntArray1665[0], ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    anInt815 = super.anInt28;
                    anInt816 = super.anInt29;
                    anInt818 = 2;
                    anInt817 = 0;
                    if(i1 == 185)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 69);
                    }
                    if(i1 == 387)
                    {
                        anInt821 += j1;
                        if(anInt821 >= 66)
                        {
                            aClass44_Sub3_Sub2_850.method471(-34003, 46);
                            aClass44_Sub3_Sub2_850.method472(154);
                        }
                        aClass44_Sub3_Sub2_850.method471(-34003, 189);
                    }
                    if(i1 == 499)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 51);
                    }
                    if(i1 == 639)
                    {
                        anInt870++;
                        if(anInt870 >= 52)
                        {
                            aClass44_Sub3_Sub2_850.method471(-34003, 49);
                            aClass44_Sub3_Sub2_850.method472(131);
                        }
                        aClass44_Sub3_Sub2_850.method471(-34003, 220);
                    }
                    if(i1 == 27)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 13);
                    }
                    aClass44_Sub3_Sub2_850.method473(j1);
                }
            }
            if(i1 == 582 || i1 == 113 || i1 == 555 || i1 == 331 || i1 == 354)
            {
                if(i1 == 555)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 124);
                }
                if(i1 == 113)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 111);
                }
                if(i1 == 354)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 227);
                }
                if(i1 == 582)
                {
                    if((j1 & 3) == 0)
                    {
                        anInt1274++;
                    }
                    if(anInt1274 >= 133)
                    {
                        aClass44_Sub3_Sub2_850.method471(-34003, 73);
                        aClass44_Sub3_Sub2_850.method473(6118);
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 44);
                }
                if(i1 == 331)
                {
                    aClass44_Sub3_Sub2_850.method471(-34003, 248);
                }
                aClass44_Sub3_Sub2_850.method473(j1);
                aClass44_Sub3_Sub2_850.method473(k);
                aClass44_Sub3_Sub2_850.method473(l);
                anInt1148 = 0;
                anInt1149 = l;
                anInt1150 = k;
                anInt1151 = 2;
                if(Class5.aClass5Array100[l].anInt106 == anInt1199)
                {
                    anInt1151 = 1;
                }
                if(Class5.aClass5Array100[l].anInt106 == anInt1253)
                {
                    anInt1151 = 3;
                }
            }
            if(i1 == 1328)
            {
                Class14 class14_1 = Class14.method220(j1);
                Class5 class5_4 = Class5.aClass5Array100[l];
                String s7;
                if(class5_4 != null && class5_4.anIntArray102[k] >= 0x186a0)
                {
                    s7 = class5_4.anIntArray102[k] + " x " + class14_1.aString331;
                } else
                if(class14_1.aByteArray332 != null)
                {
                    s7 = new String(class14_1.aByteArray332);
                } else
                {
                    s7 = "It's a " + class14_1.aString331 + ".";
                }
                method17(0, (byte)-115, s7, "");
            }
            anInt952 = 0;
            j = 14 / j;
            anInt994 = 0;
            aBoolean898 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("27672, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method135(boolean flag)
    {
        try
        {
            if(anInt952 == 0 && anInt994 == 0)
            {
                aStringArray897[anInt971] = "Walk here";
                anIntArray839[anInt971] = 718;
                anIntArray837[anInt971] = super.anInt21;
                anIntArray838[anInt971] = super.anInt22;
                anInt971++;
            }
            int i = -1;
            aBoolean863 &= flag;
            for(int j = 0; j < Class44_Sub3_Sub4_Sub4.anInt1596; j++)
            {
                int k = Class44_Sub3_Sub4_Sub4.anIntArray1597[j];
                int l = k & 0x7f;
                int i1 = k >> 7 & 0x7f;
                int j1 = k >> 29 & 3;
                int k1 = k >> 14 & 0x7fff;
                if(k == i)
                {
                    continue;
                }
                i = k;
                if(j1 == 2 && aClass36_1192.method308(anInt1155, l, i1, k) >= 0)
                {
                    Class8 class8 = Class8.method199(k1);
                    if(class8.anIntArray250 != null)
                    {
                        Class35 class35 = Class35.aClass35Array590[class8.anInt249];
                        int k2 = class35.anInt592;
                        int j3 = class35.anInt593;
                        int l3 = class35.anInt594;
                        int i4 = anIntArray1088[l3 - j3];
                        int j4 = anIntArray1214[k2] >> j3 & i4;
                        if(j4 < 0 || j4 >= class8.anIntArray250.length || class8.anIntArray250[j4] == -1)
                        {
                            continue;
                        }
                        class8 = Class8.method199(class8.anIntArray250[j4]);
                    }
                    if(anInt952 == 1)
                    {
                        aStringArray897[anInt971] = "Use " + aString956 + " with @cya@" + class8.aString218;
                        anIntArray839[anInt971] = 810;
                        anIntArray840[anInt971] = k;
                        anIntArray837[anInt971] = l;
                        anIntArray838[anInt971] = i1;
                        anInt971++;
                    } else
                    if(anInt994 == 1)
                    {
                        if((anInt996 & 4) == 4)
                        {
                            aStringArray897[anInt971] = aString997 + " @cya@" + class8.aString218;
                            anIntArray839[anInt971] = 899;
                            anIntArray840[anInt971] = k;
                            anIntArray837[anInt971] = l;
                            anIntArray838[anInt971] = i1;
                            anInt971++;
                        }
                    } else
                    {
                        if(class8.aStringArray234 != null)
                        {
                            for(int l1 = 4; l1 >= 0; l1--)
                            {
                                if(class8.aStringArray234[l1] != null)
                                {
                                    aStringArray897[anInt971] = class8.aStringArray234[l1] + " @cya@" + class8.aString218;
                                    if(l1 == 0)
                                    {
                                        anIntArray839[anInt971] = 625;
                                    }
                                    if(l1 == 1)
                                    {
                                        anIntArray839[anInt971] = 721;
                                    }
                                    if(l1 == 2)
                                    {
                                        anIntArray839[anInt971] = 743;
                                    }
                                    if(l1 == 3)
                                    {
                                        anIntArray839[anInt971] = 357;
                                    }
                                    if(l1 == 4)
                                    {
                                        anIntArray839[anInt971] = 1071;
                                    }
                                    anIntArray840[anInt971] = k;
                                    anIntArray837[anInt971] = l;
                                    anIntArray838[anInt971] = i1;
                                    anInt971++;
                                }
                            }
                        }
                        aStringArray897[anInt971] = "Examine @cya@" + class8.aString218;
                        anIntArray839[anInt971] = 1381;
                        anIntArray840[anInt971] = class8.anInt215 << 14;
                        anIntArray837[anInt971] = l;
                        anIntArray838[anInt971] = i1;
                        anInt971++;
                    }
                }
                if(j1 == 1)
                {
                    Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[k1];
                    if(class44_sub3_sub4_sub6_sub2.aClass12_1700.aByte284 == 1 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 & 0x7f) == 64 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616 & 0x7f) == 64)
                    {
                        for(int i2 = 0; i2 < anInt1009; i2++)
                        {
                            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[i2]];
                            if(class44_sub3_sub4_sub6_sub2_1 != null && class44_sub3_sub4_sub6_sub2_1 != class44_sub3_sub4_sub6_sub2 && class44_sub3_sub4_sub6_sub2_1.aClass12_1700.aByte284 == 1 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_1)).anInt1615 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_1)).anInt1616 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616)
                            {
                                method58(anIntArray1010[i2], class44_sub3_sub4_sub6_sub2_1.aClass12_1700, l, 559, i1);
                            }
                        }
                        for(int l2 = 0; l2 < anInt1226; l2++)
                        {
                            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[l2]];
                            if(class44_sub3_sub4_sub6_sub1_1 != null && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anInt1615 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1615 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_1)).anInt1616 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1616)
                            {
                                method112(i1, 705, class44_sub3_sub4_sub6_sub1_1, l, anIntArray1227[l2]);
                            }
                        }
                    }
                    method58(k1, class44_sub3_sub4_sub6_sub2.aClass12_1700, l, 559, i1);
                }
                if(j1 == 0)
                {
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[k1];
                    if((((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 & 0x7f) == 64 && (((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616 & 0x7f) == 64)
                    {
                        for(int j2 = 0; j2 < anInt1009; j2++)
                        {
                            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[anIntArray1010[j2]];
                            if(class44_sub3_sub4_sub6_sub2_2 != null && class44_sub3_sub4_sub6_sub2_2.aClass12_1700.aByte284 == 1 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_2)).anInt1615 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2_2)).anInt1616 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616)
                            {
                                method58(anIntArray1010[j2], class44_sub3_sub4_sub6_sub2_2.aClass12_1700, l, 559, i1);
                            }
                        }
                        for(int i3 = 0; i3 < anInt1226; i3++)
                        {
                            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_2 = aClass44_Sub3_Sub4_Sub6_Sub1Array1225[anIntArray1227[i3]];
                            if(class44_sub3_sub4_sub6_sub1_2 != null && class44_sub3_sub4_sub6_sub1_2 != class44_sub3_sub4_sub6_sub1 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_2)).anInt1615 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1615 && ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1_2)).anInt1616 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub1)).anInt1616)
                            {
                                method112(i1, 705, class44_sub3_sub4_sub6_sub1_2, l, anIntArray1227[i3]);
                            }
                        }
                    }
                    method112(i1, 705, class44_sub3_sub4_sub6_sub1, l, k1);
                }
                if(j1 == 3)
                {
                    Class28 class28 = aClass28ArrayArrayArray1146[anInt1155][l][i1];
                    if(class28 != null)
                    {
                        for(Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2)class28.method260(0); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2)class28.method262(-20683))
                        {
                            Class14 class14 = Class14.method220(class44_sub3_sub4_sub2.anInt1495);
                            if(anInt952 == 1)
                            {
                                aStringArray897[anInt971] = "Use " + aString956 + " with @lre@" + class14.aString331;
                                anIntArray839[anInt971] = 111;
                                anIntArray840[anInt971] = class44_sub3_sub4_sub2.anInt1495;
                                anIntArray837[anInt971] = l;
                                anIntArray838[anInt971] = i1;
                                anInt971++;
                            } else
                            if(anInt994 == 1)
                            {
                                if((anInt996 & 1) == 1)
                                {
                                    aStringArray897[anInt971] = aString997 + " @lre@" + class14.aString331;
                                    anIntArray839[anInt971] = 370;
                                    anIntArray840[anInt971] = class44_sub3_sub4_sub2.anInt1495;
                                    anIntArray837[anInt971] = l;
                                    anIntArray838[anInt971] = i1;
                                    anInt971++;
                                }
                            } else
                            {
                                for(int k3 = 4; k3 >= 0; k3--)
                                {
                                    if(class14.aStringArray345 != null && class14.aStringArray345[k3] != null)
                                    {
                                        aStringArray897[anInt971] = class14.aStringArray345[k3] + " @lre@" + class14.aString331;
                                        if(k3 == 0)
                                        {
                                            anIntArray839[anInt971] = 139;
                                        }
                                        if(k3 == 1)
                                        {
                                            anIntArray839[anInt971] = 778;
                                        }
                                        if(k3 == 2)
                                        {
                                            anIntArray839[anInt971] = 617;
                                        }
                                        if(k3 == 3)
                                        {
                                            anIntArray839[anInt971] = 224;
                                        }
                                        if(k3 == 4)
                                        {
                                            anIntArray839[anInt971] = 662;
                                        }
                                        anIntArray840[anInt971] = class44_sub3_sub4_sub2.anInt1495;
                                        anIntArray837[anInt971] = l;
                                        anIntArray838[anInt971] = i1;
                                        anInt971++;
                                    } else
                                    if(k3 == 2)
                                    {
                                        aStringArray897[anInt971] = "Take @lre@" + class14.aString331;
                                        anIntArray839[anInt971] = 617;
                                        anIntArray840[anInt971] = class44_sub3_sub4_sub2.anInt1495;
                                        anIntArray837[anInt971] = l;
                                        anIntArray838[anInt971] = i1;
                                        anInt971++;
                                    }
                                }
                                aStringArray897[anInt971] = "Examine @lre@" + class14.aString331;
                                anIntArray839[anInt971] = 1152;
                                anIntArray840[anInt971] = class44_sub3_sub4_sub2.anInt1495;
                                anIntArray837[anInt971] = l;
                                anIntArray838[anInt971] = i1;
                                anInt971++;
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("60112, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method136(int i)
    {
        try
        {
            if(i <= 0)
            {
                anInt1170 = -1;
            }
            if(anInt1005 != 2)
            {
                return;
            }
            method75((anInt1248 - anInt1184 << 7) + anInt1251, anInt1250 * 2, (byte)-79, (anInt1249 - anInt1185 << 7) + anInt1252);
            if(anInt1064 > -1 && anInt1240 % 20 < 10)
            {
                aClass44_Sub3_Sub1_Sub2Array1183[2].method440(anInt1065 - 28, aByte1213, anInt1064 - 12);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("57596, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static String method137(int i, int j, int k)
    {
        try
        {
            if(k != -41081)
            {
                throw new NullPointerException();
            }
            int l = j - i;
            if(l < -9)
            {
                return "@red@";
            }
            if(l < -6)
            {
                return "@or3@";
            }
            if(l < -3)
            {
                return "@or2@";
            }
            if(l < 0)
            {
                return "@or1@";
            }
            if(l > 9)
            {
                return "@gre@";
            }
            if(l > 6)
            {
                return "@gr3@";
            }
            if(l > 3)
            {
                return "@gr2@";
            }
            if(l > 0)
            {
                return "@gr1@";
            } else
            {
                return "@yel@";
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("90622, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    private void loadRSAKeys() {
        try {
            // final ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./data/public.key"));
            InputStream is = getClass().getResourceAsStream("/data/public.key");
            if (is == null) {
                is = new FileInputStream("./data/public.key");
            }
            final ObjectInputStream oin = new ObjectInputStream(is);
            rsaModulus = (BigInteger) oin.readObject();
            rsaKey = (BigInteger) oin.readObject();
        } catch (final Exception ex) {
            System.err.println("Cannot find public RSA key file! Shutting down...");
            System.exit(1);
        }
    }

    public void method138(int i, byte byte0, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(byte0 != 6)
            {
                aBoolean1036 = !aBoolean1036;
            }
            int k1 = 2048 - j1 & 0x7ff;
            int l1 = 2048 - j & 0x7ff;
            int i2 = 0;
            int j2 = 0;
            int k2 = i;
            if(k1 != 0)
            {
                int l2 = Class44_Sub3_Sub4_Sub4.anIntArray1598[k1];
                int j3 = Class44_Sub3_Sub4_Sub4.anIntArray1599[k1];
                int l3 = j2 * j3 - k2 * l2 >> 16;
                k2 = j2 * l2 + k2 * j3 >> 16;
                j2 = l3;
            }
            if(l1 != 0)
            {
                int i3 = Class44_Sub3_Sub4_Sub4.anIntArray1598[l1];
                int k3 = Class44_Sub3_Sub4_Sub4.anIntArray1599[l1];
                int i4 = k2 * i3 + i2 * k3 >> 16;
                k2 = k2 * k3 - i2 * i3 >> 16;
                i2 = i4;
            }
            anInt875 = i1 - i2;
            anInt876 = k - j2;
            anInt877 = l - k2;
            anInt878 = j1;
            anInt879 = j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("24308, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method139(Class44_Sub1 class44_sub1, boolean flag)
    {
        try
        {
            int i = 0;
            int j = -1;
            int k = 0;
            int l = 0;
            if(flag)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            if(class44_sub1.anInt1324 == 0)
            {
                i = aClass36_1192.method304(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(class44_sub1.anInt1324 == 1)
            {
                i = aClass36_1192.method305(class44_sub1.anInt1326, 7, class44_sub1.anInt1323, class44_sub1.anInt1325);
            }
            if(class44_sub1.anInt1324 == 2)
            {
                i = aClass36_1192.method306(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(class44_sub1.anInt1324 == 3)
            {
                i = aClass36_1192.method307(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326);
            }
            if(i != 0)
            {
                int j1 = aClass36_1192.method308(class44_sub1.anInt1323, class44_sub1.anInt1325, class44_sub1.anInt1326, i);
                j = i >> 14 & 0x7fff;
                k = j1 & 0x1f;
                l = j1 >> 6;
            }
            class44_sub1.anInt1327 = j;
            class44_sub1.anInt1329 = k;
            class44_sub1.anInt1328 = l;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("51962, " + class44_sub1 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method140(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j)
    {
        try
        {
            j += i;
            for(int k = 0; k < anInt1228; k++)
            {
                int l = anIntArray1229[k];
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[l];
                int i1 = class44_sub3_sub2.method482();
                if((i1 & 1) == 1)
                {
                    int j1 = class44_sub3_sub2.method482();
                    int j2 = class44_sub3_sub2.method482();
                    class44_sub3_sub4_sub6_sub2.method536(j2, anInt1240, j1, false);
                    class44_sub3_sub4_sub6_sub2.anInt1634 = anInt1240 + 300;
                    class44_sub3_sub4_sub6_sub2.anInt1635 = class44_sub3_sub2.method482();
                    class44_sub3_sub4_sub6_sub2.anInt1636 = class44_sub3_sub2.method482();
                }
                if((i1 & 2) == 2)
                {
                    int k1 = class44_sub3_sub2.method484();
                    if(k1 == 65535)
                    {
                        k1 = -1;
                    }
                    if(k1 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1643)
                    {
                        class44_sub3_sub4_sub6_sub2.anInt1647 = 0;
                    }
                    int k2 = class44_sub3_sub2.method482();
                    if(k1 == ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1643 && k1 != -1)
                    {
                        int i3 = Class26.aClass26Array508[k1].anInt522;
                        if(i3 == 1)
                        {
                            class44_sub3_sub4_sub6_sub2.anInt1644 = 0;
                            class44_sub3_sub4_sub6_sub2.anInt1645 = 0;
                            class44_sub3_sub4_sub6_sub2.anInt1646 = k2;
                            class44_sub3_sub4_sub6_sub2.anInt1647 = 0;
                        }
                        if(i3 == 2)
                        {
                            class44_sub3_sub4_sub6_sub2.anInt1647 = 0;
                        }
                    } else
                    if(k1 == -1 || ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1643 == -1 || Class26.aClass26Array508[k1].anInt516 >= Class26.aClass26Array508[((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1643].anInt516)
                    {
                        class44_sub3_sub4_sub6_sub2.anInt1643 = k1;
                        class44_sub3_sub4_sub6_sub2.anInt1644 = 0;
                        class44_sub3_sub4_sub6_sub2.anInt1645 = 0;
                        class44_sub3_sub4_sub6_sub2.anInt1646 = k2;
                        class44_sub3_sub4_sub6_sub2.anInt1647 = 0;
                        class44_sub3_sub4_sub6_sub2.anInt1669 = ((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1664;
                    }
                }
                if((i1 & 4) == 4)
                {
                    class44_sub3_sub4_sub6_sub2.anInt1637 = class44_sub3_sub2.method484();
                    if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1637 == 65535)
                    {
                        class44_sub3_sub4_sub6_sub2.anInt1637 = -1;
                    }
                }
                if((i1 & 8) == 8)
                {
                    class44_sub3_sub4_sub6_sub2.aString1627 = class44_sub3_sub2.method489();
                    class44_sub3_sub4_sub6_sub2.anInt1628 = 100;
                }
                if((i1 & 0x10) == 16)
                {
                    int l1 = class44_sub3_sub2.method482();
                    int l2 = class44_sub3_sub2.method482();
                    class44_sub3_sub4_sub6_sub2.method536(l2, anInt1240, l1, false);
                    class44_sub3_sub4_sub6_sub2.anInt1634 = anInt1240 + 300;
                    class44_sub3_sub4_sub6_sub2.anInt1635 = class44_sub3_sub2.method482();
                    class44_sub3_sub4_sub6_sub2.anInt1636 = class44_sub3_sub2.method482();
                }
                if((i1 & 0x20) == 32)
                {
                    class44_sub3_sub4_sub6_sub2.aClass12_1700 = Class12.method214(class44_sub3_sub2.method484());
                    class44_sub3_sub4_sub6_sub2.anInt1619 = class44_sub3_sub4_sub6_sub2.aClass12_1700.aByte284;
                    class44_sub3_sub4_sub6_sub2.anInt1663 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt306;
                    class44_sub3_sub4_sub6_sub2.anInt1622 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt288;
                    class44_sub3_sub4_sub6_sub2.anInt1623 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt289;
                    class44_sub3_sub4_sub6_sub2.anInt1624 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt290;
                    class44_sub3_sub4_sub6_sub2.anInt1625 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt291;
                    class44_sub3_sub4_sub6_sub2.anInt1620 = class44_sub3_sub4_sub6_sub2.aClass12_1700.anInt287;
                }
                if((i1 & 0x40) == 64)
                {
                    class44_sub3_sub4_sub6_sub2.anInt1648 = class44_sub3_sub2.method484();
                    int i2 = class44_sub3_sub2.method487();
                    class44_sub3_sub4_sub6_sub2.anInt1652 = i2 >> 16;
                    class44_sub3_sub4_sub6_sub2.anInt1651 = anInt1240 + (i2 & 0xffff);
                    class44_sub3_sub4_sub6_sub2.anInt1649 = 0;
                    class44_sub3_sub4_sub6_sub2.anInt1650 = 0;
                    if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1651 > anInt1240)
                    {
                        class44_sub3_sub4_sub6_sub2.anInt1649 = -1;
                    }
                    if(((Class44_Sub3_Sub4_Sub6) (class44_sub3_sub4_sub6_sub2)).anInt1648 == 65535)
                    {
                        class44_sub3_sub4_sub6_sub2.anInt1648 = -1;
                    }
                }
                if((i1 & 0x80) == 128)
                {
                    class44_sub3_sub4_sub6_sub2.anInt1638 = class44_sub3_sub2.method484();
                    class44_sub3_sub4_sub6_sub2.anInt1639 = class44_sub3_sub2.method484();
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("44339, " + i + ", " + class44_sub3_sub2 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method141(int i, Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2, int j, int k)
    {
        try
        {
            int l = anInt930 + anInt959 & 0x7ff;
            int i1 = i * i + k * k;
            if(i1 > 6400)
            {
                return;
            }
            int j1 = Class44_Sub3_Sub4_Sub4.anIntArray1598[l];
            int k1 = Class44_Sub3_Sub4_Sub4.anIntArray1599[l];
            j1 = (j1 * 256) / (anInt1075 + 256);
            k1 = (k1 * 256) / (anInt1075 + 256);
            if(j <= 0)
            {
                for(int l1 = 1; l1 > 0; l1++)
                {
                }
            }
            int i2 = k * j1 + i * k1 >> 16;
            int j2 = k * k1 - i * j1 >> 16;
            if(i1 > 2500)
            {
                class44_sub3_sub1_sub2.method446(((94 + i2) - class44_sub3_sub1_sub2.anInt1453 / 2) + 4, aClass44_Sub3_Sub1_Sub3_1144, true, 83 - j2 - class44_sub3_sub1_sub2.anInt1454 / 2 - 4);
                return;
            } else
            {
                class44_sub3_sub1_sub2.method440(83 - j2 - class44_sub3_sub1_sub2.anInt1454 / 2 - 4, aByte1213, ((94 + i2) - class44_sub3_sub1_sub2.anInt1453 / 2) + 4);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("87513, " + i + ", " + class44_sub3_sub1_sub2 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method142(int i, long l)
    {
        try
        {
            if(i >= 0)
            {
                anInt1056 = -168;
            }
            if(l == 0L)
            {
                return;
            }
            for(int j = 0; j < anInt957; j++)
            {
                if(aLongArray1254[j] == l)
                {
                    anInt957--;
                    aBoolean898 = true;
                    for(int k = j; k < anInt957; k++)
                    {
                        aLongArray1254[k] = aLongArray1254[k + 1];
                    }
                    aClass44_Sub3_Sub2_850.method471(-34003, 251);
                    aClass44_Sub3_Sub2_850.method478(l, true);
                    return;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("81778, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method143(int i)
    {
        try
        {
            if(i <= 0)
            {
                aClass44_Sub3_Sub2_850.method472(126);
            }
            if(anInt848 != 0)
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                int j = super.anInt28 - 25 - 550;
                int k = super.anInt29 - 5 - 4;
                if(j >= 0 && k >= 0 && j < 146 && k < 151)
                {
                    j -= 73;
                    k -= 75;
                    int l = anInt930 + anInt959 & 0x7ff;
                    int i1 = Class44_Sub3_Sub1_Sub1.anIntArray1427[l];
                    int j1 = Class44_Sub3_Sub1_Sub1.anIntArray1428[l];
                    i1 = i1 * (anInt1075 + 256) >> 8;
                    j1 = j1 * (anInt1075 + 256) >> 8;
                    int k1 = k * i1 + j * j1 >> 11;
                    int l1 = k * j1 - j * i1 >> 11;
                    int i2 = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615 + k1 >> 7;
                    int j2 = ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616 - l1 >> 7;
                    boolean flag = method124(0, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1665[0], 0, j2, 0, 0, true, 1, 124, 0, i2, ((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anIntArray1666[0]);
                    if(flag)
                    {
                        aClass44_Sub3_Sub2_850.method472(j);
                        aClass44_Sub3_Sub2_850.method472(k);
                        aClass44_Sub3_Sub2_850.method473(anInt930);
                        aClass44_Sub3_Sub2_850.method472(57);
                        aClass44_Sub3_Sub2_850.method472(anInt959);
                        aClass44_Sub3_Sub2_850.method472(anInt1075);
                        aClass44_Sub3_Sub2_850.method472(89);
                        aClass44_Sub3_Sub2_850.method473(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1615);
                        aClass44_Sub3_Sub2_850.method473(((Class44_Sub3_Sub4_Sub6) (aClass44_Sub3_Sub4_Sub6_Sub1_1047)).anInt1616);
                        aClass44_Sub3_Sub2_850.method472(anInt972);
                        aClass44_Sub3_Sub2_850.method472(63);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("62107, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method144(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j)
    {
        try
        {
            class44_sub3_sub2.method492((byte)-51);
            int k = class44_sub3_sub2.method493(8, false);
            if(k < anInt1009)
            {
                for(int l = k; l < anInt1009; l++)
                {
                    anIntArray941[anInt940++] = anIntArray1010[l];
                }
            }
            if(k > anInt1009)
            {
                Signlink.reporterror(aString1071 + " Too many npcs");
                throw new RuntimeException("eek");
            }
            anInt1009 = 0;
            for(int i1 = 0; i1 < k; i1++)
            {
                int j1 = anIntArray1010[i1];
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1008[j1];
                int k1 = class44_sub3_sub2.method493(1, false);
                if(k1 == 0)
                {
                    anIntArray1010[anInt1009++] = j1;
                    class44_sub3_sub4_sub6_sub2.anInt1660 = anInt1240;
                } else
                {
                    int l1 = class44_sub3_sub2.method493(2, false);
                    if(l1 == 0)
                    {
                        anIntArray1010[anInt1009++] = j1;
                        class44_sub3_sub4_sub6_sub2.anInt1660 = anInt1240;
                        anIntArray1229[anInt1228++] = j1;
                    } else
                    if(l1 == 1)
                    {
                        anIntArray1010[anInt1009++] = j1;
                        class44_sub3_sub4_sub6_sub2.anInt1660 = anInt1240;
                        int i2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub2.method533(false, i2, anInt1153);
                        int k2 = class44_sub3_sub2.method493(1, false);
                        if(k2 == 1)
                        {
                            anIntArray1229[anInt1228++] = j1;
                        }
                    } else
                    if(l1 == 2)
                    {
                        anIntArray1010[anInt1009++] = j1;
                        class44_sub3_sub4_sub6_sub2.anInt1660 = anInt1240;
                        int j2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub2.method533(true, j2, anInt1153);
                        int l2 = class44_sub3_sub2.method493(3, false);
                        class44_sub3_sub4_sub6_sub2.method533(true, l2, anInt1153);
                        int i3 = class44_sub3_sub2.method493(1, false);
                        if(i3 == 1)
                        {
                            anIntArray1229[anInt1228++] = j1;
                        }
                    } else
                    if(l1 == 3)
                    {
                        anIntArray941[anInt940++] = j1;
                    }
                }
            }
            if(j < 9 || j > 9)
            {
                anInt1170 = -1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("93413, " + i + ", " + class44_sub3_sub2 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method8(int i)
    {
        try
        {
            Signlink.reporterror = false;
            try
            {
                if(aClass7_1099 != null)
                {
                    aClass7_1099.method191();
                }
            }
            catch(Exception _ex)
            {
            }
            aClass7_1099 = null;
            method18(0);
            if(aClass10_866 != null)
            {
                aClass10_866.aBoolean257 = false;
            }
            aClass10_866 = null;
            aClass43_Sub1_814.method384();
            aClass43_Sub1_814 = null;
            aClass44_Sub3_Sub2_850 = null;
            aClass44_Sub3_Sub2_822 = null;
            aClass44_Sub3_Sub2_1132 = null;
            anIntArray1039 = null;
            aByteArrayArray981 = null;
            aByteArrayArray973 = null;
            anIntArray1040 = null;
            anIntArray1041 = null;
            anIntArrayArrayArray865 = null;
            aByteArrayArrayArray871 = null;
            aClass36_1192 = null;
            aClass18Array1022 = null;
            anIntArrayArray1113 = null;
            anIntArrayArray975 = null;
            anIntArray1020 = null;
            anIntArray1021 = null;
            aByteArray1109 = null;
            aClass34_1195 = null;
            aClass34_1196 = null;
            aClass34_1197 = null;
            aClass34_1198 = null;
            aClass34_858 = null;
            aClass34_859 = null;
            aClass34_860 = null;
            aClass34_1123 = null;
            aClass34_1124 = null;
            aClass34_1125 = null;
            aClass34_1126 = null;
            aClass34_1127 = null;
            aClass34_1128 = null;
            aClass34_1129 = null;
            aClass34_1130 = null;
            aClass34_1131 = null;
            aClass44_Sub3_Sub1_Sub3_1143 = null;
            aClass44_Sub3_Sub1_Sub3_1144 = null;
            aClass44_Sub3_Sub1_Sub3_1145 = null;
            aClass44_Sub3_Sub1_Sub3_903 = null;
            aClass44_Sub3_Sub1_Sub3_904 = null;
            aClass44_Sub3_Sub1_Sub3_905 = null;
            aClass44_Sub3_Sub1_Sub3Array1276 = null;
            aClass44_Sub3_Sub1_Sub3_1136 = null;
            aClass44_Sub3_Sub1_Sub3_1137 = null;
            aClass44_Sub3_Sub1_Sub3_1138 = null;
            aClass44_Sub3_Sub1_Sub3_1139 = null;
            aClass44_Sub3_Sub1_Sub3_1140 = null;
            aClass44_Sub3_Sub1_Sub3_852 = null;
            aClass44_Sub3_Sub1_Sub3_853 = null;
            aClass44_Sub3_Sub1_Sub3_854 = null;
            aClass44_Sub3_Sub1_Sub3_855 = null;
            aClass44_Sub3_Sub1_Sub3_856 = null;
            aClass44_Sub3_Sub1_Sub2_988 = null;
            aClass44_Sub3_Sub1_Sub2Array1108 = null;
            aClass44_Sub3_Sub1_Sub2Array1183 = null;
            aClass44_Sub3_Sub1_Sub2Array867 = null;
            aClass44_Sub3_Sub1_Sub2_1077 = null;
            aClass44_Sub3_Sub1_Sub2_1078 = null;
            aClass44_Sub3_Sub1_Sub2_1079 = null;
            aClass44_Sub3_Sub1_Sub2_1080 = null;
            aClass44_Sub3_Sub1_Sub3Array1241 = null;
            aClass44_Sub3_Sub1_Sub2Array1052 = null;
            anIntArrayArray885 = null;
            aClass44_Sub3_Sub4_Sub6_Sub1Array1225 = null;
            anIntArray1227 = null;
            anIntArray1229 = null;
            aClass44_Sub3_Sub2Array1230 = null;
            anIntArray941 = null;
            aClass44_Sub3_Sub4_Sub6_Sub2Array1008 = null;
            anIntArray1010 = null;
            aClass28ArrayArrayArray1146 = null;
            aClass28_1116 = null;
            aClass28_918 = null;
            aClass28_1054 = null;
            anIntArray837 = null;
            anIntArray838 = null;
            anIntArray839 = null;
            anIntArray840 = null;
            aStringArray897 = null;
            anIntArray1214 = null;
            anIntArray827 = null;
            anIntArray828 = null;
            aClass44_Sub3_Sub1_Sub2Array872 = null;
            if(i <= 0)
            {
                aClass28ArrayArrayArray1146 = null;
            }
            aClass44_Sub3_Sub1_Sub2_913 = null;
            aStringArray1044 = null;
            aLongArray979 = null;
            anIntArray894 = null;
            aClass34_1266 = null;
            aClass34_1267 = null;
            aClass34_1263 = null;
            aClass34_1264 = null;
            aClass34_1265 = null;
            aClass34_1268 = null;
            aClass34_1269 = null;
            aClass34_1270 = null;
            aClass34_1271 = null;
            method128(false);
            Class8.method198((byte)42);
            Class12.method213((byte)42);
            Class14.method219((byte)42);
            Class20.aClass20Array430 = null;
            Class22.aClass22Array464 = null;
            Class5.aClass5Array100 = null;
            Class24.aClass24Array490 = null;
            Class26.aClass26Array508 = null;
            Class32.aClass32Array559 = null;
            Class32.aClass39_571 = null;
            Class38.aClass38Array674 = null;
            super.aClass34_14 = null;
            Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1696 = null;
            Class44_Sub3_Sub1_Sub1.method418((byte)42);
            Class36.method277((byte)42);
            Class44_Sub3_Sub4_Sub4.method502((byte)42);
            Class11.method209((byte)42);
            System.gc();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("75879, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method145(byte byte0)
    {
        try
        {
            if(byte0 == 9)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            if(super.anInt27 == 1)
            {
                if(super.anInt28 >= 6 && super.anInt28 <= 106 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    anInt843 = (anInt843 + 1) % 4;
                    aBoolean1062 = true;
                    aBoolean1049 = true;
                    aClass44_Sub3_Sub2_850.method471(-34003, 161);
                    aClass44_Sub3_Sub2_850.method472(anInt843);
                    aClass44_Sub3_Sub2_850.method472(anInt895);
                    aClass44_Sub3_Sub2_850.method472(anInt1168);
                }
                if(super.anInt28 >= 135 && super.anInt28 <= 235 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    anInt895 = (anInt895 + 1) % 3;
                    aBoolean1062 = true;
                    aBoolean1049 = true;
                    aClass44_Sub3_Sub2_850.method471(-34003, 161);
                    aClass44_Sub3_Sub2_850.method472(anInt843);
                    aClass44_Sub3_Sub2_850.method472(anInt895);
                    aClass44_Sub3_Sub2_850.method472(anInt1168);
                }
                if(super.anInt28 >= 273 && super.anInt28 <= 373 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    anInt1168 = (anInt1168 + 1) % 3;
                    aBoolean1062 = true;
                    aBoolean1049 = true;
                    aClass44_Sub3_Sub2_850.method471(-34003, 161);
                    aClass44_Sub3_Sub2_850.method472(anInt843);
                    aClass44_Sub3_Sub2_850.method472(anInt895);
                    aClass44_Sub3_Sub2_850.method472(anInt1168);
                }
                if(super.anInt28 >= 412 && super.anInt28 <= 512 && super.anInt29 >= 467 && super.anInt29 <= 499)
                {
                    if(anInt1199 == -1)
                    {
                        method28(3);
                        aString939 = "";
                        aBoolean987 = false;
                        for(int i = 0; i < Class5.aClass5Array100.length; i++)
                        {
                            if(Class5.aClass5Array100[i] != null && Class5.aClass5Array100[i].anInt109 == 600)
                            {
                                anInt1217 = anInt1199 = Class5.aClass5Array100[i].anInt106;
                                return;
                            }
                        }
                        return;
                    } else
                    {
                        method17(0, (byte)-115, "Please close the interface you have open before using 'report abuse'", "");
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("77202, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method146(byte abyte0[], int i, int j)
    {
        try
        {
            if(i != 0)
            {
                throw new NullPointerException();
            }
            if(abyte0 == null)
            {
                return true;
            } else
            {
                return Signlink.wavesave(abyte0, j);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("56223, " + abyte0 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method147(boolean flag, int i)
    {
        try
        {
            aBoolean863 &= flag;
            int j = Class38.aClass38Array674[i].anInt682;
            if(j == 0)
            {
                return;
            }
            int k = anIntArray1214[i];
            if(j == 1)
            {
                if(k == 1)
                {
                    Class44_Sub3_Sub1_Sub1.method427(0.90000000000000002D, 0);
                }
                if(k == 2)
                {
                    Class44_Sub3_Sub1_Sub1.method427(0.80000000000000004D, 0);
                }
                if(k == 3)
                {
                    Class44_Sub3_Sub1_Sub1.method427(0.69999999999999996D, 0);
                }
                if(k == 4)
                {
                    Class44_Sub3_Sub1_Sub1.method427(0.59999999999999998D, 0);
                }
                Class14.aClass39_370.method341();
                aBoolean908 = true;
            }
            if(j == 3)
            {
                boolean flag1 = aBoolean1057;
                if(k == 0)
                {
                    method59(true, 0, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(k == 1)
                {
                    method59(true, -400, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(k == 2)
                {
                    method59(true, -800, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(k == 3)
                {
                    method59(true, -1200, aBoolean1057);
                    aBoolean1057 = true;
                }
                if(k == 4)
                {
                    aBoolean1057 = false;
                }
                if(aBoolean1057 != flag1 && !aBoolean1235)
                {
                    if(aBoolean1057)
                    {
                        anInt1190 = anInt963;
                        aBoolean1191 = true;
                        aClass43_Sub1_814.method392(2, anInt1190);
                    } else
                    {
                        method18(0);
                    }
                    anInt942 = 0;
                }
            }
            if(j == 4)
            {
                if(k == 0)
                {
                    aBoolean1050 = true;
                    method85(aBoolean985, 0);
                }
                if(k == 1)
                {
                    aBoolean1050 = true;
                    method85(aBoolean985, -400);
                }
                if(k == 2)
                {
                    aBoolean1050 = true;
                    method85(aBoolean985, -800);
                }
                if(k == 3)
                {
                    aBoolean1050 = true;
                    method85(aBoolean985, -1200);
                }
                if(k == 4)
                {
                    aBoolean1050 = false;
                }
            }
            if(j == 5)
            {
                anInt862 = k;
            }
            if(j == 6)
            {
                anInt970 = k;
            }
            if(j == 8)
            {
                anInt1017 = k;
                aBoolean1049 = true;
            }
            if(j == 9)
            {
                anInt835 = k;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("33016, " + flag + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Game()
    {
        aBoolean812 = false;
        aBoolean820 = false;
        aClass44_Sub3_Sub2_822 = Class44_Sub3_Sub2.method470(-929, 1);
        anIntArray827 = new int[1000];
        anIntArray828 = new int[1000];
        aBoolean829 = false;
        aByte830 = -83;
        anInt833 = -1;
        aClass44_Sub3_Sub1_Sub3Array836 = new Class44_Sub3_Sub1_Sub3[2];
        anIntArray837 = new int[500];
        anIntArray838 = new int[500];
        anIntArray839 = new int[500];
        anIntArray840 = new int[500];
        anInt844 = 0x332d25;
        anIntArray846 = new int[50];
        aBoolean847 = false;
        anIntArray849 = new int[7];
        aClass44_Sub3_Sub2_850 = Class44_Sub3_Sub2.method470(-929, 1);
        anIntArray851 = new int[Class29.anInt536];
        aBoolean863 = false;
        aClass44_Sub3_Sub1_Sub2Array867 = new Class44_Sub3_Sub1_Sub2[8];
        anIntArray868 = new int[151];
        aClass44_Sub3_Sub1_Sub2Array872 = new Class44_Sub3_Sub1_Sub2[1000];
        anInt874 = 78;
        anIntArray881 = new int[151];
        aByte883 = -127;
        aByte884 = 38;
        anIntArrayArray885 = new int[104][104];
        aBoolean886 = false;
        anInt889 = -1;
        aBoolean893 = false;
        anIntArray894 = new int[200];
        aStringArray897 = new String[500];
        aBoolean898 = false;
        anInt900 = -1;
        anInt902 = 70;
        aBoolean906 = false;
        aBoolean908 = false;
        anIntArray910 = new int[33];
        aClass28_918 = new Class28(-199);
        aStringArray919 = new String[5];
        aBooleanArray920 = new boolean[5];
        aBoolean922 = false;
        anInt924 = -1;
        aByte925 = 1;
        anInt929 = 128;
        aBoolean934 = true;
        aBoolean935 = false;
        anIntArray938 = new int[5];
        aString939 = "";
        anIntArray941 = new int[1000];
        anIntArray943 = new int[5];
        aBoolean946 = false;
        anInt948 = -587;
        aBoolean950 = true;
        aCRC32_951 = new CRC32();
        anInt960 = 2;
        anIntArray961 = new int[33];
        anInt962 = 817;
        anInt963 = -1;
        anInt965 = -1;
        anInt969 = -8033;
        anInt974 = 8;
        anIntArrayArray975 = new int[104][104];
        anIntArray976 = new int[5];
        aByte977 = 8;
        aLongArray979 = new long[200];
        aBoolean980 = false;
        aBoolean985 = true;
        aBoolean987 = false;
        anInt1000 = 0x23201b;
        anIntArray1001 = new int[5];
        anIntArray1002 = new int[100];
        aStringArray1003 = new String[100];
        aStringArray1004 = new String[100];
        anIntArray1006 = new int[50];
        aString1007 = "";
        aClass44_Sub3_Sub4_Sub6_Sub2Array1008 = new Class44_Sub3_Sub4_Sub6_Sub2[16384];
        anIntArray1010 = new int[16384];
        anInt1012 = 2;
        anInt1015 = 100;
        anIntArray1016 = new int[100];
        anIntArray1018 = new int[256];
        anInt1019 = 661;
        anIntArray1020 = new int[4000];
        anIntArray1021 = new int[4000];
        aClass18Array1022 = new Class18[4];
        anIntArray1024 = new int[2000];
        anInt1027 = 3;
        anIntArray1035 = new int[Class29.anInt536];
        aBoolean1036 = true;
        aByte1042 = -71;
        aStringArray1044 = new String[200];
        aBoolean1049 = false;
        aBoolean1050 = true;
        anIntArray1051 = new int[9];
        aClass44_Sub3_Sub1_Sub2Array1052 = new Class44_Sub3_Sub1_Sub2[100];
        aByte1053 = 29;
        aClass28_1054 = new Class28(-199);
        aBoolean1055 = false;
        anInt1056 = 513;
        aBoolean1057 = true;
        aBoolean1062 = false;
        anInt1063 = -1;
        anInt1064 = -1;
        anInt1065 = -1;
        aString1071 = "";
        aString1072 = "";
        anInt1074 = -940;
        anInt1076 = 1;
        aBoolean1084 = false;
        anInt1085 = 0x766654;
        aByte1086 = 38;
        anIntArray1090 = new int[Class29.anInt536];
        anInt1091 = 37395;
        aString1092 = "";
        aByte1098 = 29;
        aByte1101 = 6;
        aString1102 = "";
        anInt1107 = 1;
        aClass44_Sub3_Sub1_Sub2Array1108 = new Class44_Sub3_Sub1_Sub2[20];
        aByteArray1109 = new byte[16384];
        aString1110 = "";
        aString1111 = "";
        anIntArrayArray1113 = new int[104][104];
        anInt1115 = -1;
        aClass28_1116 = new Class28(-199);
        aClass44_Sub3_Sub2_1132 = Class44_Sub3_Sub2.method470(-929, 1);
        aString1141 = "";
        aClass28ArrayArrayArray1146 = new Class28[4][104][104];
        aBoolean1147 = false;
        anInt1153 = -6002;
        aBoolean1154 = false;
        aBoolean1156 = false;
        anInt1158 = 50;
        anIntArray1159 = new int[anInt1158];
        anIntArray1160 = new int[anInt1158];
        anIntArray1161 = new int[anInt1158];
        anIntArray1162 = new int[anInt1158];
        anIntArray1163 = new int[anInt1158];
        anIntArray1164 = new int[anInt1158];
        anIntArray1165 = new int[anInt1158];
        aStringArray1166 = new String[anInt1158];
        aBoolean1174 = false;
        anInt1177 = -1;
        aBoolean1178 = true;
        aBoolean1179 = true;
        aByte1182 = 2;
        aClass44_Sub3_Sub1_Sub2Array1183 = new Class44_Sub3_Sub1_Sub2[20];
        aBoolean1191 = true;
        anIntArray1193 = new int[50];
        anInt1199 = -1;
        anInt1200 = 0x4d4233;
        aClass5_1201 = new Class5();
        anInt1202 = 9;
        anIntArray1206 = new int[5];
        aClass45Array1208 = new Class45[5];
        aBooleanArray1209 = new boolean[5];
        aByte1213 = 1;
        anIntArray1214 = new int[2000];
        anInt1216 = 2;
        anInt1217 = -1;
        aBoolean1222 = false;
        anInt1223 = 2048;
        anInt1224 = 2047;
        aClass44_Sub3_Sub4_Sub6_Sub1Array1225 = new Class44_Sub3_Sub4_Sub6_Sub1[anInt1223];
        anIntArray1227 = new int[anInt1223];
        anIntArray1229 = new int[anInt1223];
        aClass44_Sub3_Sub2Array1230 = new Class44_Sub3_Sub2[anInt1223];
        aBoolean1236 = false;
        aBoolean1237 = false;
        aClass44_Sub3_Sub1_Sub3Array1241 = new Class44_Sub3_Sub1_Sub3[100];
        anInt1243 = 831;
        anInt1244 = 393;
        anInt1247 = -282;
        anInt1253 = -1;
        aLongArray1254 = new long[100];
        aBoolean1262 = false;
        aBoolean1275 = false;
        aClass44_Sub3_Sub1_Sub3Array1276 = new Class44_Sub3_Sub1_Sub3[13];
    }

    static
    {
        anIntArray984 = new int[99];
        int i = 0;
        for(int j = 0; j < 99; j++)
        {
            int l = j + 1;
            int i1 = (int)((double)l + 300D * Math.pow(2D, (double)l / 7D));
            i += i1;
            anIntArray984[j] = i / 4;
        }
        anIntArray1088 = new int[32];
        i = 2;
        for(int k = 0; k < 32; k++)
        {
            anIntArray1088[k] = i - 1;
            i += i;
        }
    }
}
