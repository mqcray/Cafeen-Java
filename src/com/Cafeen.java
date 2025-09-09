//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;

public class Cafeen {
    public double ex;
    public double why;

    public void mouseWiggle() throws AWTException, InterruptedException {
        Robot r = new Robot();
        Point z = MouseInfo.getPointerInfo().getLocation();
        this.ex = z.getX();
        this.why = z.getY();
        double i = this.ex;
        double j = this.why;
        double xi1 = this.ex + (double)5.0F;

        for(double yi1 = this.why + (double)5.0F; i < xi1 || j < yi1; Thread.sleep(30L)) {
            r.mouseMove((int)i, (int)j);
            if (i < xi1) {
                ++i;
            }

            if (j < yi1) {
                ++j;
            }
        }

        r.mouseMove((int)this.ex, (int)this.why);
    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        Timer myTimer = new Timer();
        TimerTask myTask = new TimerTask() {
            public void run() {
                Cafeen caf = new Cafeen();

                try {
                    caf.mouseWiggle();
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        myTimer.scheduleAtFixedRate(myTask, 0L, 300000L);
    }
}
