/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biclas;
import Biclas.Enums.MountainBikeSuspension;
import Biclas.Enums.BikeTools;
/**
 *
 * @author Bernardo
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle[] bicicletas;
        bicicletas = new Bicycle[]{
            new DistributionBike(3.50f, true, 1, 5, "Green", 20.5f, 2.5f, true, 20.5f),
            new MountainBike(MountainBikeSuspension.DOUBLE, 3, 1, 5, "Blue", 25.5f, 2.45f, true, 25.99f),
            new DistributionBike(2.5f, true, 2, 3, "Red", 20.5f, 2.00f, true, 25.99f)
        };
        Sponsor[] sponsors;
        sponsors = new Sponsor[5];
        sponsors[0]=new Sponsor(1, "Movistar");
        BikeTools[] tools = new BikeTools[]{
            BikeTools.BOTTLE,
            BikeTools.KIT,
            BikeTools.FLASHLIGHT
        };
      if(bicicletas[0] instanceof DistributionBike){
          DistributionBike b1 = (DistributionBike) bicicletas[0];
          b1.addSponsor(sponsors[0]);
          
      }
      
      if(bicicletas[1] instanceof MountainBike){
          MountainBike b2 = (MountainBike) bicicletas[1];
          b2.addTool(tools[1]);
      }
      for(Bicycle biclas : bicicletas){
          System.out.println(biclas);
      }
    } 
}
