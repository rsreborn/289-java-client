package com.jagex;

import com.jagex.sign.Signlink;

public class Class44_Sub3_Sub1 extends Class44_Sub3
{

    public static int anInt1363 = 1623;
    public static boolean aBoolean1364;
    public static boolean aBoolean1365 = true;
    public static byte aByte1366 = 8;
    public static int anInt1367 = 1;
    public static byte aByte1368 = 35;
    public static int anIntArray1369[];
    public static int anInt1370;
    public static int anInt1371;
    public static int anInt1372;
    public static int anInt1373;
    public static int anInt1374;
    public static int anInt1375;
    public static int anInt1376;
    public static int anInt1377;
    public static int anInt1378;
    public static int anInt1379;

    public static void method406(int i, int ai[], int j, int k)
    {
        try
        {
            anIntArray1369 = ai;
            anInt1370 = j;
            for(anInt1371 = k; i >= 0;)
            {
                return;
            }
            method408(aByte1366, k, j, 0, 0);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("83567, " + i + ", " + ai + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method407(byte byte0)
    {
        try
        {
            anInt1374 = 0;
            anInt1372 = 0;
            anInt1375 = anInt1370;
            anInt1373 = anInt1371;
            if(byte0 != -92)
            {
                aBoolean1364 = !aBoolean1364;
            }
            anInt1376 = anInt1375 - 1;
            anInt1377 = anInt1375 / 2;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("75622, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method408(byte byte0, int i, int j, int k, int l)
    {
        try
        {
            if(l < 0)
            {
                l = 0;
            }
            if(k < 0)
            {
                k = 0;
            }
            if(j > anInt1370)
            {
                j = anInt1370;
            }
            if(i > anInt1371)
            {
                i = anInt1371;
            }
            anInt1374 = l;
            anInt1372 = k;
            if(byte0 == 8)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            anInt1375 = j;
            anInt1373 = i;
            anInt1376 = anInt1375 - 1;
            anInt1377 = anInt1375 / 2;
            anInt1378 = anInt1373 / 2;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("52567, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method409(byte byte0)
    {
        try
        {
            if(byte0 != 127)
            {
                return;
            }
            int i = anInt1370 * anInt1371;
            for(int j = 0; j < i; j++)
            {
                anIntArray1369[j] = 0;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("10068, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method410(int i, int j, int k, int l, int i1, int j1, boolean flag)
    {
        try
        {
            if(j1 < anInt1374)
            {
                i1 -= anInt1374 - j1;
                j1 = anInt1374;
            }
            if(i < anInt1372)
            {
                j -= anInt1372 - i;
                i = anInt1372;
            }
            if(j1 + i1 > anInt1375)
            {
                i1 = anInt1375 - j1;
            }
            if(i + j > anInt1373)
            {
                j = anInt1373 - i;
            }
            int k1 = 256 - k;
            int l1 = (l >> 16 & 0xff) * k;
            int i2 = (l >> 8 & 0xff) * k;
            int j2 = (l & 0xff) * k;
            if(flag)
            {
                anInt1363 = 122;
            }
            int j3 = anInt1370 - i1;
            int k3 = j1 + i * anInt1370;
            for(int l3 = 0; l3 < j; l3++)
            {
                for(int i4 = -i1; i4 < 0; i4++)
                {
                    int k2 = (anIntArray1369[k3] >> 16 & 0xff) * k1;
                    int l2 = (anIntArray1369[k3] >> 8 & 0xff) * k1;
                    int i3 = (anIntArray1369[k3] & 0xff) * k1;
                    int j4 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
                    anIntArray1369[k3++] = j4;
                }
                k3 += j3;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("68601, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method411(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(i1 < anInt1374)
            {
                j1 -= anInt1374 - i1;
                i1 = anInt1374;
            }
            if(k < anInt1372)
            {
                l -= anInt1372 - k;
                k = anInt1372;
            }
            if(i1 + j1 > anInt1375)
            {
                j1 = anInt1375 - i1;
            }
            if(k + l > anInt1373)
            {
                l = anInt1373 - k;
            }
            int k1 = anInt1370 - j1;
            j = 83 / j;
            int l1 = i1 + k * anInt1370;
            for(int i2 = -l; i2 < 0; i2++)
            {
                for(int j2 = -j1; j2 < 0; j2++)
                {
                    anIntArray1369[l1++] = i;
                }
                l1 += k1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("43392, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method412(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            method414(k, j, l, true, i1);
            method414(k, j, l, true, (i1 + j1) - 1);
            method416(i1, j, l, j1, 0);
            if(i < anInt1367 || i > anInt1367)
            {
                aBoolean1364 = !aBoolean1364;
            }
            method416(i1, (j + k) - 1, l, j1, 0);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("9711, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method413(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        try
        {
            method415(-985, k, j, i1, j1, l);
            method415(-985, k, j, i1, (j1 + i) - 1, l);
            if(k1 != 0)
            {
                anInt1363 = -232;
            }
            if(i >= 3)
            {
                method417(i - 2, j, j1 + 1, i1, 454, k);
                method417(i - 2, j, j1 + 1, i1, 454, (k + l) - 1);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("90957, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method414(int i, int j, int k, boolean flag, int l)
    {
        try
        {
            if(!flag)
            {
                return;
            }
            if(l < anInt1372 || l >= anInt1373)
            {
                return;
            }
            if(j < anInt1374)
            {
                i -= anInt1374 - j;
                j = anInt1374;
            }
            if(j + i > anInt1375)
            {
                i = anInt1375 - j;
            }
            int i1 = j + l * anInt1370;
            for(int j1 = 0; j1 < i; j1++)
            {
                anIntArray1369[i1 + j1] = k;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("26422, " + i + ", " + j + ", " + k + ", " + flag + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method415(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(i1 < anInt1372 || i1 >= anInt1373)
            {
                return;
            }
            if(j < anInt1374)
            {
                j1 -= anInt1374 - j;
                j = anInt1374;
            }
            if(j + j1 > anInt1375)
            {
                j1 = anInt1375 - j;
            }
            int k1 = 256 - l;
            while(i >= 0)
            {
                for(int l1 = 1; l1 > 0; l1++)
                {
                }
            }
            int i2 = (k >> 16 & 0xff) * l;
            int j2 = (k >> 8 & 0xff) * l;
            int k2 = (k & 0xff) * l;
            int k3 = j + i1 * anInt1370;
            for(int l3 = 0; l3 < j1; l3++)
            {
                int l2 = (anIntArray1369[k3] >> 16 & 0xff) * k1;
                int i3 = (anIntArray1369[k3] >> 8 & 0xff) * k1;
                int j3 = (anIntArray1369[k3] & 0xff) * k1;
                int i4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                anIntArray1369[k3++] = i4;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("78053, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method416(int i, int j, int k, int l, int i1)
    {
        try
        {
            if(i1 != 0)
            {
                aBoolean1365 = !aBoolean1365;
            }
            if(j < anInt1374 || j >= anInt1375)
            {
                return;
            }
            if(i < anInt1372)
            {
                l -= anInt1372 - i;
                i = anInt1372;
            }
            if(i + l > anInt1373)
            {
                l = anInt1373 - i;
            }
            int j1 = j + i * anInt1370;
            for(int k1 = 0; k1 < l; k1++)
            {
                anIntArray1369[j1 + k1 * anInt1370] = k;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("94910, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method417(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(j1 < anInt1374 || j1 >= anInt1375)
            {
                return;
            }
            if(k < anInt1372)
            {
                i -= anInt1372 - k;
                k = anInt1372;
            }
            if(k + i > anInt1373)
            {
                i = anInt1373 - k;
            }
            int k1 = 256 - l;
            i1 = 37 / i1;
            int l1 = (j >> 16 & 0xff) * l;
            int i2 = (j >> 8 & 0xff) * l;
            int j2 = (j & 0xff) * l;
            int j3 = j1 + k * anInt1370;
            for(int k3 = 0; k3 < i; k3++)
            {
                int k2 = (anIntArray1369[j3] >> 16 & 0xff) * k1;
                int l2 = (anIntArray1369[j3] >> 8 & 0xff) * k1;
                int i3 = (anIntArray1369[j3] & 0xff) * k1;
                int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
                anIntArray1369[j3] = l3;
                j3 += anInt1370;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("35599, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub1()
    {
    }

}
