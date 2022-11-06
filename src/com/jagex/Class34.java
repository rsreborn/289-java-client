package com.jagex;

import java.awt.*;
import java.awt.image.*;

import com.jagex.sign.Signlink;

public class Class34
    implements ImageProducer, ImageObserver
{

    public int anInt581;
    public int anIntArray582[];
    public int anInt583;
    public int anInt584;
    public ColorModel aColorModel585;
    public ImageConsumer anImageConsumer586;
    public Image anImage587;

    public Class34(Component component, int i, int j, int k)
    {
        anInt581 = 831;
        try
        {
            anInt583 = i;
            anInt584 = j;
            anIntArray582 = new int[i * j];
            aColorModel585 = new DirectColorModel(32, 0xff0000, 65280, 255);
            anImage587 = component.createImage(this);
            method274();
            if(k < 2 || k > 2)
            {
                anInt581 = 205;
            }
            component.prepareImage(anImage587, this);
            method274();
            component.prepareImage(anImage587, this);
            method274();
            component.prepareImage(anImage587, this);
            method272((byte)5);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("48102, " + component + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method272(byte byte0)
    {
        try
        {
            Class44_Sub3_Sub1.method406(-78, anIntArray582, anInt583, anInt584);
            if(byte0 != 5)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("43640, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method273(int i, int j, int k, Graphics g)
    {
        try
        {
            method274();
            while(i >= 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            g.drawImage(anImage587, j, k, this);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("14457, " + i + ", " + j + ", " + k + ", " + g + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        anImageConsumer586 = imageconsumer;
        imageconsumer.setDimensions(anInt583, anInt584);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel585);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        return anImageConsumer586 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        if(anImageConsumer586 == imageconsumer)
        {
            anImageConsumer586 = null;
        }
    }

    public void startProduction(ImageConsumer imageconsumer)
    {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer)
    {
        System.out.println("TDLR");
    }

    public synchronized void method274()
    {
        if(anImageConsumer586 == null)
        {
            return;
        } else
        {
            anImageConsumer586.setPixels(0, 0, anInt583, anInt584, aColorModel585, anIntArray582, 0, anInt583);
            anImageConsumer586.imageComplete(2);
            return;
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1)
    {
        return true;
    }
}
