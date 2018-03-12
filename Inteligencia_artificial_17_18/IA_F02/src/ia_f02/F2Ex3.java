/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import robocode.*;
import ia_f02.Utils;
import java.awt.geom.Point2D;

/**
 *
 * @author Bernardo
 */
public class F2Ex3 extends AdvancedRobot {

    private BufferedWriter out;

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        Point2D.Double enemyCoords = Utils.getEnemyCoordinates(this, event.getBearing(), event.getDistance());
        try {
            out.write(enemyCoords.getX() + "," + enemyCoords.getY() + "," + event.getBearing() + "," + event.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onRoundEnded(RoundEndedEvent event) {
        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDeath(DeathEvent event) {
        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            if (new File("output_F2Ex3").isFile()) {
                out = new BufferedWriter(new BufferedWriter(new FileWriter("output_F2Ex3", true)));
            } else {
                out = new BufferedWriter(new BufferedWriter(new FileWriter("output_F2Ex3")));
                out.write("Xinimigo,Yinimigo,VelocidadeInimigo,HeadingInimigo, name\n");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        Utils.robotGoTo(this, getBattleFieldWidth() / 2, getBattleFieldHeight() / 2);
        while (true) {
            turnRadarLeft(180);
        }

    }

}
