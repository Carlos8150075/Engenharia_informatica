/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biclas;


import Biclas.Enums.BikeTools;
import Biclas.Enums.MountainBikeSuspension;

/**
 *
 * @author Bernardo
 */
public class MountainBike extends Bicycle{
    private final int MAX_TOOLS = 5;
    MountainBikeSuspension suspension;
    private int numberOfLights;
    BikeTools[] tools;
    private int toolPosition;
    
    public MountainBike(MountainBikeSuspension suspension, int numberOfLights, int id, int numberOfGear, String mainColor, float wheelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGear, mainColor, wheelSize, bikeLenght, adjustableSeatpost, price);
        this.suspension = suspension;
        this.numberOfLights = numberOfLights;
        this.tools = new BikeTools[MAX_TOOLS];
        this.toolPosition = 0;
        
    }

    public MountainBikeSuspension getSuspension() {
        return suspension;
    }

    public void setSuspension(MountainBikeSuspension suspension) {
        this.suspension = suspension;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public BikeTools[] getTools() {
        return tools;
    }

    public void setTools(BikeTools[] tools) {
        this.tools = tools;
    }
    public void addTool(BikeTools tool){
        if(toolPosition<MAX_TOOLS){
            tools[toolPosition] = tool;
            toolPosition++;
        }else{
            System.out.println("Esta cheio");
        }
    }
    
    public void editTool(BikeTools tool, BikeTools newTool){
        for(int i = 0; i<toolPosition;i++){
            if(tools[i].equals(tool)){
                tools[i] = newTool;
            }
        }
    }
    
    public boolean removeTool(BikeTools tool){
        for(int i = 0; i < toolPosition; i++){
            if(tools[i].equals(tool)){
                while(i<toolPosition){
                    tools[i] = tools[i+1];
                    i++;
                }
            }
            toolPosition--;
            return true;
        }
        return false;
    }
    public void printTools(){
        for(BikeTools t: tools){
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "MountainBike{" + "MAX_TOOLS=" + MAX_TOOLS + ", suspension=" + MountainBikeSuspension.SuspensionToString(suspension) + ", numberOfLights=" + numberOfLights + ", tools=" + ToolToString() + ", toolPosition=" + toolPosition + '}';
    }
    
    private String ToolToString(){
        String s = new String();
        for (int i = 0; i < MAX_TOOLS; i++) {
            if (tools[i] != null) {
                s = s + tools[i].toString();
            }
        }
        return s;
    }
    
}
