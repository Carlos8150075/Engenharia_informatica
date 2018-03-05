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
public class DistributionBike extends Bicycle{
    private float basketCapacity;
    private boolean isFrontBasket;
    private final int SPONSOR_SIZE = 10;
    Sponsor[] sponsors;
    private int numberOfSponsors;

    public DistributionBike(float basketCapacity, boolean isFrontBasket,int id, int numberOfGear, String mainColor, float wheelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGear, mainColor, wheelSize, bikeLenght, adjustableSeatpost, price);
        this.basketCapacity = basketCapacity;
        this.isFrontBasket = isFrontBasket;
        this.sponsors = new Sponsor[SPONSOR_SIZE];
        this.numberOfSponsors = 0;
        
    }

    public float getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(float basketCapacity) {
        this.basketCapacity = basketCapacity;
    }

    public boolean isIsFrontBasket() {
        return isFrontBasket;
    }

    public void setIsFrontBasket(boolean isFrontBasket) {
        this.isFrontBasket = isFrontBasket;
    }

    public Sponsor[] getSponsors() {
        return sponsors;
    }

    public void setSponsors(Sponsor[] sponsors) {
        this.sponsors = sponsors;
    }

    public int getNumberOfSponsors() {
        return numberOfSponsors;
    }

    public void setNumberOfSponsors(int numberOfSponsors) {
        this.numberOfSponsors = numberOfSponsors;
    }
    public void addSponsor(Sponsor s){
        int k =0;
        for(Sponsor sp : sponsors){
            if(sp != null && sp.getId() != s.getId()){
                k++;
            }
        }
        if(k==numberOfSponsors){
            sponsors[numberOfSponsors] = s;
            numberOfSponsors++;
        }else{
            System.out.println("Exists");
        }
    }
    public void editSponsor(Sponsor sponsor, Sponsor newSponsor){
        for(int i = 0; i<numberOfSponsors;i++){
            if(sponsors[i].equals(sponsor)){
                sponsors[i] = newSponsor;
            }
        }
    }
    public void removeSponsor(int id){
        for(int i = 0; i<numberOfSponsors;i++){
            if(sponsors[i].getId() == id){
                while(i<numberOfSponsors){
                    sponsors[i] = sponsors[i+1];
                    i++;
                }
                numberOfSponsors--;
            }
        }
    }
    public void printSponsor(){
        for(Sponsor s : sponsors){
            System.out.println(s);
        }
    }
    private String SponsorToString() {
        String s = new String();
        for (int i = 0; i < SPONSOR_SIZE; i++) {
            if (sponsors[i] != null) {
                s = s + sponsors[i].toString();
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "DistributionBike{" + "basketCapacity=" + basketCapacity + ", isFrontBasket=" + isFrontBasket + ", SPONSOR_SIZE=" + SPONSOR_SIZE + ", sponsors=" + SponsorToString() + ", numberOfSponsors=" + numberOfSponsors + '}';
    }
    
}