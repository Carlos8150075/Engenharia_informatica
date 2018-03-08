/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f01;

import java.awt.geom.Point2D;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

/**
 *
 * @author Bernardo
 */
public class F1Ex4 extends robocode.AdvancedRobot {

    
    int estado = 0;
    
    public void run() {
        while (true) {
            
                turnRadarRight(360);
            
            if (estado == 2)
            {
                setAhead(5);
                setTurnLeft(2);
                fire(1);
            }
           
            
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        if (event.getName().contains("SittingDuck")) {
            
            System.out.println(event.getBearing() + " - "+event.getDistance());
            
            if(event.getBearing() > -91 && event.getBearing() < -89 && estado == 1)
            {
                estado++;
            }
            else if (event.getBearing() > -5 && event.getBearing() < 5 && event.getDistance() > 120 && event.getDistance() < 130)
            {
                setTurnRight(90);
                setTurnGunLeft(90);
            }
            else if (event.getBearing() == 0 && estado == 0)
            {
                estado++;
                setAhead(event.getDistance() - 125);
            }
            else if (estado == 0)
            {    
                setTurnRight(event.getBearing());
            }
            execute();
        }
    }

}
