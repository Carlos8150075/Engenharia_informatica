package ia_f01;

import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

import java.awt.geom.Point2D;

import static ia_f01.F1Ex4.State.APPROACHING;
import static ia_f01.F1Ex4.State.CIRCLING;
import static ia_f01.F1Ex4.State.ROTATING_1;
import static ia_f01.F1Ex4.State.ROTATING_2;
import static ia_f01.F1Ex4.State.SEARCHING;


/**
 * Created by Davide on 06/03/2018.
 *
 * Definitely not the best bot ever!
 */
public class F1Ex4 extends robocode.AdvancedRobot
{
    public enum State
    {
        SEARCHING, //when searching for a SittingDuck
        ROTATING_1, //when rotating towards the SittingDuck
        APPROACHING, //when moving towards the SittingDuck
        ROTATING_2, //when preparing to circle the SittingDuck
        CIRCLING, //when circling the SittingDuck
        RESETTING //when hit an obstacle and is restarting behavior
        {
            @Override
            public State next()
            {
                return null;
            }
        };

        public State next()
        {
            return values()[ordinal() + 1];
        }
    }

    private State currentState = SEARCHING;
    private short direction = 1;

    public void run() {

        printState();

        while (true)
        {
            setTurnRadarRight(360);
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event)
    {
        if (event.getName().contains("SittingDuck")) //if we spotted the enemy we're searching for
        {
            System.out.println("SittingDuck at: "+event.getBearing() + "º - "+event.getDistance()+"px");

            if (currentState == SEARCHING)
            {
                setTurnRight(event.getBearing());
                currentState = currentState.next(); //ROTATING_1
                printState();
                execute();
            }
            else if (currentState == ROTATING_1 && closeEnough(event.getBearing(), 0))
            {
                setAhead(event.getDistance() - 100);
                currentState = currentState.next(); //APPROACHING
                printState();
                execute();
            }
            else if (currentState == APPROACHING && closeEnough(event.getBearing(), 0) && closeEnough(event.getDistance(), 100))
            {
                setTurnRight(90);
                setTurnGunLeft(90);
                currentState = currentState.next();//ROTATING_2
                printState();
                execute();
            }
            else if (currentState == ROTATING_2 && closeEnough(event.getBearing(), -90))
            {
                currentState = currentState.next(); //CIRCLING
                printState();
            }
            else if (currentState == CIRCLING)
            {
                setAhead(5);
                setTurnLeft(2);
                fire(1);
            }
        }
    }

    /**
     * helper function that determines if a given number is "close enough" to a target value
     * (the bearing value, for example, may not exactly be 45º when we are searching for it but
     * 44.999º is close enough!)
     *
     * @param number the value read from the "sensor"
     * @param target the target value
     * @return true if the value is "close enough" to the target
     */
    private boolean closeEnough(double number, int target)
    {
        return Math.abs(number-target) < 1;

    }

    private void printState()
    {
        System.out.print("Current State: ");
        switch (currentState){
            case CIRCLING:
                System.out.println("Circling");
                break;
            case ROTATING_1:
                System.out.println("Rotating 1");
                break;
            case ROTATING_2:
                System.out.println("Rotating 2");
                break;
            case SEARCHING:
                System.out.println("Searching");
                break;
            case APPROACHING:
                System.out.println("Approaching");
                break;
            case RESETTING:
                System.out.println("Resetting");
                break;
        }
    }

    /**
     * computes the absolute bearing between two points (from: http://mark.random-article.com/weber/java/robocode/lesson4.html)
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    double absoluteBearing(double x1, double y1, double x2, double y2) {
        double xo = x2-x1;
        double yo = y2-y1;
        double hyp = Point2D.distance(x1, y1, x2, y2);
        double arcSin = Math.toDegrees(Math.asin(xo / hyp));
        double bearing = 0;

        if (xo > 0 && yo > 0) { // both pos: lower-Left
            bearing = arcSin;
        } else if (xo < 0 && yo > 0) { // x neg, y pos: lower-right
            bearing = 360 + arcSin; // arcsin is negative here, actuall 360 - ang
        } else if (xo > 0 && yo < 0) { // x pos, y neg: upper-left
            bearing = 180 - arcSin;
        } else if (xo < 0 && yo < 0) { // both neg: upper-right
            bearing = 180 - arcSin; // arcsin is negative here, actually 180 + ang
        }

        return bearing;
    }

    /**
     * normalizes a bearing to between +180 and -180 (from http://mark.random-article.com/weber/java/robocode/lesson4.html)
     * @param angle
     * @return
     */
    double normalizeBearing(double angle) {
        while (angle >  180) angle -= 360;
        while (angle < -180) angle += 360;
        return angle;
    }
}