package com.jagex;

import java.io.*;
import com.jagex.sign.Signlink;

public class Class45
{

    public boolean aBoolean773;
    public int anInt774;
    public int anInt775;
    public static byte aByteArray776[] = new byte[520];
    public RandomAccessFile aRandomAccessFile777;
    public RandomAccessFile aRandomAccessFile778;
    public int anInt779;
    public int anInt780;

    public Class45(RandomAccessFile randomaccessfile, int i, RandomAccessFile randomaccessfile1, int j, byte byte0)
    {
        aBoolean773 = false;
        anInt775 = 887;
        anInt780 = 65000;
        try
        {
            anInt779 = j;
            if(byte0 == 4)
            {
                byte0 = 0;
            } else
            {
                anInt775 = -21;
            }
            aRandomAccessFile777 = randomaccessfile;
            aRandomAccessFile778 = randomaccessfile1;
            anInt780 = i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("43459, " + randomaccessfile + ", " + i + ", " + randomaccessfile1 + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized byte[] method541(boolean flag, int i)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            try
            {
                method544(aRandomAccessFile778, i * 6, 0);
                int l;
                for(int j = 0; j < 6; j += l)
                {
                    l = aRandomAccessFile778.read(aByteArray776, j, 6 - j);
                    if(l == -1)
                    {
                        return null;
                    }
                }
                int i1 = ((aByteArray776[0] & 0xff) << 16) + ((aByteArray776[1] & 0xff) << 8) + (aByteArray776[2] & 0xff);
                int j1 = ((aByteArray776[3] & 0xff) << 16) + ((aByteArray776[4] & 0xff) << 8) + (aByteArray776[5] & 0xff);
                if(i1 < 0 || i1 > anInt780)
                {
                    return null;
                }
                if(j1 <= 0 || (long)j1 > aRandomAccessFile777.length() / 520L)
                {
                    return null;
                }
                byte abyte0[] = new byte[i1];
                int k1 = 0;
                for(int l1 = 0; k1 < i1; l1++)
                {
                    if(j1 == 0)
                    {
                        return null;
                    }
                    method544(aRandomAccessFile777, j1 * 520, 0);
                    int k = 0;
                    int i2 = i1 - k1;
                    if(i2 > 512)
                    {
                        i2 = 512;
                    }
                    int j2;
                    for(; k < i2 + 8; k += j2)
                    {
                        j2 = aRandomAccessFile777.read(aByteArray776, k, (i2 + 8) - k);
                        if(j2 == -1)
                        {
                            return null;
                        }
                    }
                    int k2 = ((aByteArray776[0] & 0xff) << 8) + (aByteArray776[1] & 0xff);
                    int l2 = ((aByteArray776[2] & 0xff) << 8) + (aByteArray776[3] & 0xff);
                    int i3 = ((aByteArray776[4] & 0xff) << 16) + ((aByteArray776[5] & 0xff) << 8) + (aByteArray776[6] & 0xff);
                    int j3 = aByteArray776[7] & 0xff;
                    if(k2 != i || l2 != l1 || j3 != anInt779)
                    {
                        return null;
                    }
                    if(i3 < 0 || (long)i3 > aRandomAccessFile777.length() / 520L)
                    {
                        return null;
                    }
                    for(int k3 = 0; k3 < i2; k3++)
                    {
                        abyte0[k1++] = aByteArray776[k3 + 8];
                    }
                    j1 = i3;
                }
                return abyte0;
            }
            catch(IOException _ex)
            {
                return null;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("83435, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized boolean method542(byte abyte0[], byte byte0, int i, int j)
    {
        try
        {
            if(byte0 != 4)
            {
                anInt775 = 436;
            }
            boolean flag = method543(true, i, anInt774, j, abyte0);
            if(!flag)
            {
                flag = method543(false, i, anInt774, j, abyte0);
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("64351, " + abyte0 + ", " + byte0 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized boolean method543(boolean flag, int i, int j, int k, byte abyte0[])
    {
        try
        {
            if(j != 0)
            {
                aBoolean773 = !aBoolean773;
            }
            try
            {
                int l;
                if(flag)
                {
                    method544(aRandomAccessFile778, k * 6, 0);
                    int k1;
                    for(int i1 = 0; i1 < 6; i1 += k1)
                    {
                        k1 = aRandomAccessFile778.read(aByteArray776, i1, 6 - i1);
                        if(k1 == -1)
                        {
                            return false;
                        }
                    }
                    l = ((aByteArray776[3] & 0xff) << 16) + ((aByteArray776[4] & 0xff) << 8) + (aByteArray776[5] & 0xff);
                    if(l <= 0 || (long)l > aRandomAccessFile777.length() / 520L)
                    {
                        return false;
                    }
                } else
                {
                    l = (int)((aRandomAccessFile777.length() + 519L) / 520L);
                    if(l == 0)
                    {
                        l = 1;
                    }
                }
                aByteArray776[0] = (byte)(i >> 16);
                aByteArray776[1] = (byte)(i >> 8);
                aByteArray776[2] = (byte)i;
                aByteArray776[3] = (byte)(l >> 16);
                aByteArray776[4] = (byte)(l >> 8);
                aByteArray776[5] = (byte)l;
                method544(aRandomAccessFile778, k * 6, 0);
                aRandomAccessFile778.write(aByteArray776, 0, 6);
                int j1 = 0;
                for(int l1 = 0; j1 < i; l1++)
                {
                    int i2 = 0;
                    if(flag)
                    {
                        method544(aRandomAccessFile777, l * 520, 0);
                        int j2;
                        int l2;
                        for(j2 = 0; j2 < 8; j2 += l2)
                        {
                            l2 = aRandomAccessFile777.read(aByteArray776, j2, 8 - j2);
                            if(l2 == -1)
                            {
                                break;
                            }
                        }
                        if(j2 == 8)
                        {
                            int i3 = ((aByteArray776[0] & 0xff) << 8) + (aByteArray776[1] & 0xff);
                            int j3 = ((aByteArray776[2] & 0xff) << 8) + (aByteArray776[3] & 0xff);
                            i2 = ((aByteArray776[4] & 0xff) << 16) + ((aByteArray776[5] & 0xff) << 8) + (aByteArray776[6] & 0xff);
                            int k3 = aByteArray776[7] & 0xff;
                            if(i3 != k || j3 != l1 || k3 != anInt779)
                            {
                                return false;
                            }
                            if(i2 < 0 || (long)i2 > aRandomAccessFile777.length() / 520L)
                            {
                                return false;
                            }
                        }
                    }
                    if(i2 == 0)
                    {
                        flag = false;
                        i2 = (int)((aRandomAccessFile777.length() + 519L) / 520L);
                        if(i2 == 0)
                        {
                            i2++;
                        }
                        if(i2 == l)
                        {
                            i2++;
                        }
                    }
                    if(i - j1 <= 512)
                    {
                        i2 = 0;
                    }
                    aByteArray776[0] = (byte)(k >> 8);
                    aByteArray776[1] = (byte)k;
                    aByteArray776[2] = (byte)(l1 >> 8);
                    aByteArray776[3] = (byte)l1;
                    aByteArray776[4] = (byte)(i2 >> 16);
                    aByteArray776[5] = (byte)(i2 >> 8);
                    aByteArray776[6] = (byte)i2;
                    aByteArray776[7] = (byte)anInt779;
                    method544(aRandomAccessFile777, l * 520, 0);
                    aRandomAccessFile777.write(aByteArray776, 0, 8);
                    int k2 = i - j1;
                    if(k2 > 512)
                    {
                        k2 = 512;
                    }
                    aRandomAccessFile777.write(abyte0, j1, k2);
                    j1 += k2;
                    l = i2;
                }
                return true;
            }
            catch(IOException _ex)
            {
                return false;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("7982, " + flag + ", " + i + ", " + j + ", " + k + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized void method544(RandomAccessFile randomaccessfile, int i, int j)
        throws IOException
    {
        try
        {
            if(j != 0)
            {
                aBoolean773 = !aBoolean773;
            }
            if(i < 0 || i > 0x3c00000)
            {
                System.out.println("Badseek - pos:" + i + " len:" + randomaccessfile.length());
                i = 0x3c00000;
                try
                {
                    Thread.sleep(1000L);
                }
                catch(Exception _ex)
                {
                }
            }
            randomaccessfile.seek(i);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("78209, " + randomaccessfile + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
