package com.jagex;

import com.jagex.sign.Signlink;

public class Class44_Sub3_Sub1_Sub3 extends Class44_Sub3_Sub1
{

    public boolean aBoolean1455;
    public boolean aBoolean1456;
    public int anInt1457;
    public byte aByteArray1458[];
    public int anIntArray1459[];
    public int anInt1460;
    public int anInt1461;
    public int anInt1462;
    public int anInt1463;
    public int anInt1464;
    public int anInt1465;

    public Class44_Sub3_Sub1_Sub3(Class47 class47, String s, int i)
    {
        aBoolean1455 = false;
        aBoolean1456 = false;
        anInt1457 = 9;
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method549(s + ".dat", null), 15787);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method549("index.dat", null), 15787);
        class44_sub3_sub2_1.anInt1392 = class44_sub3_sub2.method484();
        anInt1464 = class44_sub3_sub2_1.method484();
        anInt1465 = class44_sub3_sub2_1.method484();
        int j = class44_sub3_sub2_1.method482();
        anIntArray1459 = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            anIntArray1459[k + 1] = class44_sub3_sub2_1.method486();
        }
        for(int l = 0; l < i; l++)
        {
            class44_sub3_sub2_1.anInt1392 += 2;
            class44_sub3_sub2.anInt1392 += class44_sub3_sub2_1.method484() * class44_sub3_sub2_1.method484();
            class44_sub3_sub2_1.anInt1392++;
        }
        anInt1462 = class44_sub3_sub2_1.method482();
        anInt1463 = class44_sub3_sub2_1.method482();
        anInt1460 = class44_sub3_sub2_1.method484();
        anInt1461 = class44_sub3_sub2_1.method484();
        int i1 = class44_sub3_sub2_1.method482();
        int j1 = anInt1460 * anInt1461;
        aByteArray1458 = new byte[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
            {
                aByteArray1458[k1] = class44_sub3_sub2.method483();
            }
            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < anInt1460; l1++)
            {
                for(int i2 = 0; i2 < anInt1461; i2++)
                {
                    aByteArray1458[l1 + i2 * anInt1460] = class44_sub3_sub2.method483();
                }
            }
        }
    }

    public void method448(int i)
    {
        try
        {
            anInt1464 /= 2;
            anInt1465 /= 2;
            byte abyte0[] = new byte[anInt1464 * anInt1465];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = 0; l < anInt1460; l++)
                {
                    abyte0[(l + anInt1462 >> 1) + (k + anInt1463 >> 1) * anInt1464] = aByteArray1458[j++];
                }
            }
            aByteArray1458 = abyte0;
            anInt1460 = anInt1464;
            if(i != 0)
            {
                aBoolean1455 = !aBoolean1455;
            }
            anInt1461 = anInt1465;
            anInt1462 = 0;
            anInt1463 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("96890, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method449(int i)
    {
        try
        {
            if(anInt1460 == anInt1464 && anInt1461 == anInt1465)
            {
                return;
            }
            byte abyte0[] = new byte[anInt1464 * anInt1465];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = 0; l < anInt1460; l++)
                {
                    abyte0[l + anInt1462 + (k + anInt1463) * anInt1464] = aByteArray1458[j++];
                }
            }
            aByteArray1458 = abyte0;
            anInt1460 = anInt1464;
            anInt1461 = anInt1465;
            anInt1462 = 0;
            anInt1463 = 0;
            if(i < 9 || i > 9)
            {
                aBoolean1456 = !aBoolean1456;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("81667, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method450(int i)
    {
        try
        {
            byte abyte0[] = new byte[anInt1460 * anInt1461];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = anInt1460 - 1; l >= 0; l--)
                {
                    abyte0[j++] = aByteArray1458[l + k * anInt1460];
                }
            }
            aByteArray1458 = abyte0;
            if(i != 6)
            {
                anInt1457 = 352;
            }
            anInt1462 = anInt1464 - anInt1460 - anInt1462;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("28636, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method451(int i)
    {
        try
        {
            byte abyte0[] = new byte[anInt1460 * anInt1461];
            int j = 0;
            for(int k = anInt1461 - 1; k >= 0; k--)
            {
                for(int l = 0; l < anInt1460; l++)
                {
                    abyte0[j++] = aByteArray1458[l + k * anInt1460];
                }
            }
            if(i != 35509)
            {
                return;
            } else
            {
                aByteArray1458 = abyte0;
                anInt1463 = anInt1465 - anInt1461 - anInt1463;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("83103, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method452(int i, byte byte0, int j, int k)
    {
        try
        {
            if(byte0 != 3)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            for(int i1 = 0; i1 < anIntArray1459.length; i1++)
            {
                int j1 = anIntArray1459[i1] >> 16 & 0xff;
                j1 += i;
                if(j1 < 0)
                {
                    j1 = 0;
                } else
                if(j1 > 255)
                {
                    j1 = 255;
                }
                int k1 = anIntArray1459[i1] >> 8 & 0xff;
                k1 += j;
                if(k1 < 0)
                {
                    k1 = 0;
                } else
                if(k1 > 255)
                {
                    k1 = 255;
                }
                int l1 = anIntArray1459[i1] & 0xff;
                l1 += k;
                if(l1 < 0)
                {
                    l1 = 0;
                } else
                if(l1 > 255)
                {
                    l1 = 255;
                }
                anIntArray1459[i1] = (j1 << 16) + (k1 << 8) + l1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("28455, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method453(int i, byte byte0, int j)
    {
        try
        {
            j += anInt1462;
            i += anInt1463;
            if(byte0 != 1)
            {
                return;
            }
            int k = j + i * Class44_Sub3_Sub1.anInt1370;
            int l = 0;
            int i1 = anInt1461;
            int j1 = anInt1460;
            int k1 = Class44_Sub3_Sub1.anInt1370 - j1;
            int l1 = 0;
            if(i < Class44_Sub3_Sub1.anInt1372)
            {
                int i2 = Class44_Sub3_Sub1.anInt1372 - i;
                i1 -= i2;
                i = Class44_Sub3_Sub1.anInt1372;
                l += i2 * j1;
                k += i2 * Class44_Sub3_Sub1.anInt1370;
            }
            if(i + i1 > Class44_Sub3_Sub1.anInt1373)
            {
                i1 -= (i + i1) - Class44_Sub3_Sub1.anInt1373;
            }
            if(j < Class44_Sub3_Sub1.anInt1374)
            {
                int j2 = Class44_Sub3_Sub1.anInt1374 - j;
                j1 -= j2;
                j = Class44_Sub3_Sub1.anInt1374;
                l += j2;
                k += j2;
                l1 += j2;
                k1 += j2;
            }
            if(j + j1 > Class44_Sub3_Sub1.anInt1375)
            {
                int k2 = (j + j1) - Class44_Sub3_Sub1.anInt1375;
                j1 -= k2;
                l1 += k2;
                k1 += k2;
            }
            if(j1 <= 0 || i1 <= 0)
            {
                return;
            } else
            {
                method454(i1, anIntArray1459, k, Class44_Sub3_Sub1.anIntArray1369, l1, k1, (byte)34, aByteArray1458, j1, l);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("29131, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method454(int i, int ai[], int j, int ai1[], int k, int l, byte byte0,
            byte abyte0[], int i1, int j1)
    {
        try
        {
            int k1 = -(i1 >> 2);
            i1 = -(i1 & 3);
            for(int l1 = -i; l1 < 0; l1++)
            {
                for(int i2 = k1; i2 < 0; i2++)
                {
                    byte byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                }
                for(int j2 = i1; j2 < 0; j2++)
                {
                    byte byte2 = abyte0[j1++];
                    if(byte2 != 0)
                    {
                        ai1[j++] = ai[byte2 & 0xff];
                    } else
                    {
                        j++;
                    }
                }
                j += l;
                j1 += k;
            }
            if(byte0 != 34)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("42705, " + i + ", " + ai + ", " + j + ", " + ai1 + ", " + k + ", " + l + ", " + byte0 + ", " + abyte0 + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }
}
