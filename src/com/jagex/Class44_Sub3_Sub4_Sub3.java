package com.jagex;

import com.jagex.sign.Signlink;

public class Class44_Sub3_Sub4_Sub3 extends Class44_Sub3_Sub4
{

    public int anInt1497;
    public int anInt1498;
    public Class32 aClass32_1499;
    public int anInt1500;
    public int anInt1501;
    public int anInt1502;
    public int anInt1503;
    public int anInt1504;
    public int anInt1505;
    public int anInt1506;
    public int anInt1507;
    public int anInt1508;
    public int anInt1509;
    public boolean aBoolean1510;
    public double aDouble1511;
    public double aDouble1512;
    public double aDouble1513;
    public double aDouble1514;
    public double aDouble1515;
    public double aDouble1516;
    public double aDouble1517;
    public double aDouble1518;
    public int anInt1519;
    public int anInt1520;
    public int anInt1521;
    public int anInt1522;

    public Class44_Sub3_Sub4_Sub3(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1, int i2, int j2, boolean flag, int k2)
    {
        anInt1498 = 6;
        aBoolean1510 = false;
        try
        {
            aClass32_1499 = Class32.aClass32Array559[l];
            anInt1500 = k1;
            anInt1501 = i1;
            anInt1502 = l1;
            anInt1503 = j;
            anInt1505 = k;
            anInt1506 = i2;
            anInt1507 = j2;
            if(flag)
            {
                for(int l2 = 1; l2 > 0; l2++)
                {
                }
            }
            anInt1508 = i;
            anInt1509 = j1;
            anInt1504 = k2;
            aBoolean1510 = false;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("7515, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + flag + ", " + k2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method500(int i, boolean flag, int j, int k, int l)
    {
        try
        {
            if(!aBoolean1510)
            {
                double d = l - anInt1501;
                double d2 = j - anInt1502;
                double d3 = Math.sqrt(d * d + d2 * d2);
                aDouble1511 = (double)anInt1501 + (d * (double)anInt1508) / d3;
                aDouble1512 = (double)anInt1502 + (d2 * (double)anInt1508) / d3;
                aDouble1513 = anInt1503;
            }
            double d1 = (anInt1506 + 1) - k;
            aDouble1514 = ((double)l - aDouble1511) / d1;
            aDouble1515 = ((double)j - aDouble1512) / d1;
            if(!flag)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            aDouble1516 = Math.sqrt(aDouble1514 * aDouble1514 + aDouble1515 * aDouble1515);
            if(!aBoolean1510)
            {
                aDouble1517 = -aDouble1516 * Math.tan((double)anInt1507 * 0.02454369D);
            }
            aDouble1518 = (2D * ((double)i - aDouble1513 - aDouble1517 * d1)) / (d1 * d1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("57005, " + i + ", " + flag + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method501(int i, int j)
    {
        try
        {
            if(j >= 0)
            {
                anInt1498 = -474;
            }
            aBoolean1510 = true;
            aDouble1511 += aDouble1514 * (double)i;
            aDouble1512 += aDouble1515 * (double)i;
            aDouble1513 += aDouble1517 * (double)i + 0.5D * aDouble1518 * (double)i * (double)i;
            aDouble1517 += aDouble1518 * (double)i;
            anInt1519 = (int)(Math.atan2(aDouble1514, aDouble1515) * 325.94900000000001D) + 1024 & 0x7ff;
            anInt1520 = (int)(Math.atan2(aDouble1517, aDouble1516) * 325.94900000000001D) & 0x7ff;
            if(aClass32_1499.aClass26_563 != null)
            {
                for(anInt1522 += i; anInt1522 > aClass32_1499.aClass26_563.method254(anInt1521, 24425);)
                {
                    anInt1522 -= aClass32_1499.aClass26_563.method254(anInt1521, 24425) + 1;
                    anInt1521++;
                    if(anInt1521 >= aClass32_1499.aClass26_563.anInt509)
                    {
                        anInt1521 = 0;
                    }
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("69669, " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class44_Sub3_Sub4_Sub4 method499(int i)
    {
        try
        {
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = aClass32_1499.method271();
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            int j = -1;
            if(aClass32_1499.aClass26_563 != null)
            {
                j = aClass32_1499.aClass26_563.anIntArray510[anInt1521];
            }
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = new Class44_Sub3_Sub4_Sub4(class44_sub3_sub4_sub4, Class11.method211(j, 0), false, anInt1497, true);
            if(j != -1)
            {
                class44_sub3_sub4_sub4_1.method513((byte)3);
                class44_sub3_sub4_sub4_1.method514(j, 188);
                class44_sub3_sub4_sub4_1.anIntArrayArray1567 = null;
                class44_sub3_sub4_sub4_1.anIntArrayArray1566 = null;
            }
            if(aClass32_1499.anInt566 != 128 || aClass32_1499.anInt567 != 128)
            {
                class44_sub3_sub4_sub4_1.method522(aClass32_1499.anInt566, aClass32_1499.anInt566, aClass32_1499.anInt567, (byte)31);
            }
            class44_sub3_sub4_sub4_1.method518(46881, anInt1520);
            if(i != -37770)
            {
                throw new NullPointerException();
            } else
            {
                class44_sub3_sub4_sub4_1.method523(64 + aClass32_1499.anInt569, 850 + aClass32_1499.anInt570, -30, -50, -30, true);
                return class44_sub3_sub4_sub4_1;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("13403, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
