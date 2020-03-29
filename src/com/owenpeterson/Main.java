package com.owenpeterson;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {

        //Creates a Robot and names it robot
        Robot robot = new Robot();

        //Makes an infinite loop of pressing the F1 key every 20 seconds
        while (true){

            robot.keyPress(KeyEvent.VK_F1);
            robot.keyRelease(KeyEvent.VK_F1);

            Thread.sleep(20000);    }
    }
}
