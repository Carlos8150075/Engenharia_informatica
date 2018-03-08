/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f01;

import robocode.ScannedRobotEvent;
import robots.utils.Utils;

/**
 *
 * @author Bernardo
 */
public class F1Ex2 extends robocode.Robot{

    @Override
    public void run() {
        while(true){
            turnRadarLeft(360);
        }
    }

    
    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        System.out.println(event.getDistance());
        
        if(event.getDistance() < 100 ){    
            fire(3);
        }else if(event.getDistance() > 100 && event.getDistance() < 200){
            fire(2);
        }else if(event.getDistance() > 200 && event.getDistance() < 300){
            fire(1);
        }
    }
    
    
    
    
}
