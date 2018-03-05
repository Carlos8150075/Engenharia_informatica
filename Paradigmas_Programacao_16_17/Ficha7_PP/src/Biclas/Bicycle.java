/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biclas;

/**
 *
 * @author Bernardo
 */
public class Bicycle {
    private int id;
    private int numberOfGear;
    private String mainColor;
    private float wheelSize;
    private float bikeLenght;
    private boolean adjustableSeatpost;
    private float price;

    public Bicycle(int id, int numberOfGear, String mainColor, float wheelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        this.id = id;
        this.numberOfGear = numberOfGear;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.bikeLenght = bikeLenght;
        this.adjustableSeatpost = adjustableSeatpost;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(float wheelSize) {
        this.wheelSize = wheelSize;
    }

    public float getBikeLenght() {
        return bikeLenght;
    }

    public void setBikeLenght(float bikeLenght) {
        this.bikeLenght = bikeLenght;
    }

    public boolean isAdjustableSeatpost() {
        return adjustableSeatpost;
    }

    public void setAdjustableSeatpost(boolean adjustableSeatpost) {
        this.adjustableSeatpost = adjustableSeatpost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", numberOfGear=" + numberOfGear + ", mainColor=" + mainColor + ", wheelSize=" + wheelSize + ", bikeLenght=" + bikeLenght + ", adjustableSeatpost=" + adjustableSeatpost + ", price=" + price + '}';
    }
    
    
}
