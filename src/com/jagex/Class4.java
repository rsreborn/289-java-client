package com.jagex;

import com.jagex.sign.Signlink;

public class Class4
{

    public boolean aBoolean88;
    public boolean aBoolean89;
    public boolean aBoolean90;
    public static Class4 aClass4Array91[] = new Class4[1000];
    public static int anIntArray92[] = new int[1000];
    public static byte aByteArray93[];
    public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_94;
    public Class6 aClass6Array95[];
    public int anInt96;
    public int anInt97;

    public Class4(byte byte0)
    {
        aBoolean88 = false;
        aBoolean89 = false;
        aBoolean90 = true;
        aClass6Array95 = new Class6[10];
        try
        {
            if(byte0 != 58)
            {
                for(int i = 1; i > 0; i++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("32850, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method175(boolean flag, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            aByteArray93 = new byte[0x6baa8];
            if(!flag)
            {
                return;
            }
            aClass44_Sub3_Sub2_94 = new Class44_Sub3_Sub2(aByteArray93, 15787);
            Class6.method187();
            do
            {
                int i = class44_sub3_sub2.method484();
                if(i == 65535)
                {
                    return;
                }
                aClass4Array91[i] = new Class4((byte)58);
                aClass4Array91[i].method177(false, class44_sub3_sub2);
                anIntArray92[i] = aClass4Array91[i].method178(368);
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("47278, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class44_Sub3_Sub2 method176(int i, int j, int k)
    {
        try
        {
            if(j < 7 || j > 7)
            {
                throw new NullPointerException();
            }
            if(aClass4Array91[k] != null)
            {
                Class4 class4 = aClass4Array91[k];
                return class4.method179(i, 873);
            } else
            {
                return null;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("54696, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method177(boolean flag, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            for(int i = 0; i < 10; i++)
            {
                int j = class44_sub3_sub2.method482();
                if(j != 0)
                {
                    class44_sub3_sub2.anInt1392--;
                    aClass6Array95[i] = new Class6();
                    aClass6Array95[i].method190(false, class44_sub3_sub2);
                }
            }
            if(flag)
            {
                aBoolean90 = !aBoolean90;
            }
            anInt96 = class44_sub3_sub2.method484();
            anInt97 = class44_sub3_sub2.method484();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("59639, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method178(int i)
    {
        try
        {
            int j = 0x98967f;
            if(i <= 0)
            {
                aBoolean89 = !aBoolean89;
            }
            for(int k = 0; k < 10; k++)
            {
                if(aClass6Array95[k] != null && aClass6Array95[k].anInt183 / 20 < j)
                {
                    j = aClass6Array95[k].anInt183 / 20;
                }
            }
            if(anInt96 < anInt97 && anInt96 / 20 < j)
            {
                j = anInt96 / 20;
            }
            if(j == 0x98967f || j == 0)
            {
                return 0;
            }
            for(int l = 0; l < 10; l++)
            {
                if(aClass6Array95[l] != null)
                {
                    aClass6Array95[l].anInt183 -= j * 20;
                }
            }
            if(anInt96 < anInt97)
            {
                anInt96 -= j * 20;
                anInt97 -= j * 20;
            }
            return j;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("95859, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub2 method179(int i, int j)
    {
        try
        {
            int k = method180(i);
            aClass44_Sub3_Sub2_94.anInt1392 = 0;
            aClass44_Sub3_Sub2_94.method476(0x52494646);
            aClass44_Sub3_Sub2_94.method477(26965, 36 + k);
            aClass44_Sub3_Sub2_94.method476(0x57415645);
            aClass44_Sub3_Sub2_94.method476(0x666d7420);
            aClass44_Sub3_Sub2_94.method477(26965, 16);
            aClass44_Sub3_Sub2_94.method474(1, false);
            aClass44_Sub3_Sub2_94.method474(1, false);
            aClass44_Sub3_Sub2_94.method477(26965, 22050);
            aClass44_Sub3_Sub2_94.method477(26965, 22050);
            j = 98 / j;
            aClass44_Sub3_Sub2_94.method474(1, false);
            aClass44_Sub3_Sub2_94.method474(8, false);
            aClass44_Sub3_Sub2_94.method476(0x64617461);
            aClass44_Sub3_Sub2_94.method477(26965, k);
            aClass44_Sub3_Sub2_94.anInt1392 += k;
            return aClass44_Sub3_Sub2_94;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("32783, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method180(int i)
    {
        int j = 0;
        for(int k = 0; k < 10; k++)
        {
            if(aClass6Array95[k] != null && aClass6Array95[k].anInt182 + aClass6Array95[k].anInt183 > j)
            {
                j = aClass6Array95[k].anInt182 + aClass6Array95[k].anInt183;
            }
        }
        if(j == 0)
        {
            return 0;
        }
        int l = (22050 * j) / 1000;
        int i1 = (22050 * anInt96) / 1000;
        int j1 = (22050 * anInt97) / 1000;
        if(i1 < 0 || i1 > l || j1 < 0 || j1 > l || i1 >= j1)
        {
            i = 0;
        }
        int k1 = l + (j1 - i1) * (i - 1);
        for(int l1 = 44; l1 < k1 + 44; l1++)
        {
            aByteArray93[l1] = -128;
        }
        for(int i2 = 0; i2 < 10; i2++)
        {
            if(aClass6Array95[i2] != null)
            {
                int j2 = (aClass6Array95[i2].anInt182 * 22050) / 1000;
                int i3 = (aClass6Array95[i2].anInt183 * 22050) / 1000;
                int ai[] = aClass6Array95[i2].method188(j2, aClass6Array95[i2].anInt182);
                for(int l3 = 0; l3 < j2; l3++)
                {
                    aByteArray93[l3 + i3 + 44] += (byte)(ai[l3] >> 8);
                }
            }
        }
        if(i > 1)
        {
            i1 += 44;
            j1 += 44;
            l += 44;
            int k2 = (k1 += 44) - l;
            for(int j3 = l - 1; j3 >= j1; j3--)
            {
                aByteArray93[j3 + k2] = aByteArray93[j3];
            }
            for(int k3 = 1; k3 < i; k3++)
            {
                int l2 = (j1 - i1) * k3;
                for(int i4 = i1; i4 < j1; i4++)
                {
                    aByteArray93[i4 + l2] = aByteArray93[i4];
                }
            }
            k1 -= 44;
        }
        return k1;
    }

}
