/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f01;

import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

/**
 *
 * @author Bernardo
 */
public class F1Ex2 extends robocode.Robot{
    int turnDirection = 1;
    
    @Override
    public void run() {
        while(true){
            turnRight(5 * turnDirection);
        }
    }

    
    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        if(event.getBearing() >= 0){
            turnDirection = 1;
        }else{
            turnDirection = -1;
        }
        
        turnRight(event.getBearing());
        ahead(event.getDistance() + 5);
        scan();
        
        if(event.getDistance() < 100 ){    
            fire(3);
        }else if(event.getDistance() > 100 && event.getDistance() < 200){
            fire(2);
        }else if(event.getDistance() > 200 && event.getDistance() < 300){
            fire(1);
        }
    }

    @Override
    public void onHitRobot(HitRobotEvent event) {
        if(event.getBearing() >= 0){
            turnDirection = 1;
        }else{
            turnDirection= -1;
        }
        turnRight(event.getBearing());
        
        
    }
    
    
    
    
}
