package com.jagex;

import java.awt.*;
import com.jagex.sign.Signlink;

public class Frame_Sub1 extends Frame
{

    public Applet_Sub1 anApplet_Sub1_36;

    public Frame_Sub1(int i, int j, int k, Applet_Sub1 applet_sub1)
    {
        try
        {
            anApplet_Sub1_36 = applet_sub1;
            setTitle("Jagex");
            setResizable(false);
            if(j != 27016)
            {
                throw new NullPointerException();
            } else
            {
                show();
                toFront();
                resize(k + 8, i + 28);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("79865, " + i + ", " + j + ", " + k + ", " + applet_sub1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public void update(Graphics g)
    {
        anApplet_Sub1_36.update(g);
    }

    public void paint(Graphics g)
    {
        anApplet_Sub1_36.paint(g);
    }
}
