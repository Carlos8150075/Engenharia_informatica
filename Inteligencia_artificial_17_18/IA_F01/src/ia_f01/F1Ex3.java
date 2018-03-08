/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f01;

import robocode.HitRobotEvent;
import ia_f01.Utils;
import robocode.ScannedRobotEvent;

/**
 *
 * @author Bernardo
 */
public class F1Ex3 extends robocode.Robot {

    double turn = 1;
    @Override
    public void run() {

        while (true) {
            
            Utils.robotGoTo(this, getBattleFieldWidth() / 2, getBattleFieldHeight() / 2);
            turnGunLeft(360*turn);
            System.out.println("run");
        }
    }

    @Override
    public void onHitRobot(HitRobotEvent event) {
        super.onHitRobot(event); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        System.out.println("Scan");
        if (event.getDistance() < 100) {
            fire(3);
        } else if (event.getDistance() > 100 && event.getDistance() < 200) {
            fire(2);
        } else if (event.getDistance() > 200 && event.getDistance() < 300) {
            fire(1);
        }
        //turnGunLeft(1);
        //turnGunRight(30);
        if (getHeading() - getGunHeading() + event.getBearing() > 0)
            turn = -1;
        else
            turn = 1;
        turnGunRight(getHeading() - getGunHeading() + event.getBearing());
        
    }

}
