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
public class BicycleSalesManagment extends ContainerOfObjects{
    private int SaleID;
    private SaleDate date;
    private double total;

    public BicycleSalesManagment(int SaleID, SaleDate date, double total, Object[] objects) {
        super(objects);
        this.SaleID = SaleID;
        this.date = date;
        this.total = total;
    }

    public BicycleSalesManagment(int SaleID, SaleDate date, double total) {
        this.SaleID = SaleID;
        this.date = date;
        this.total = total;
    }

    public BicycleSalesManagment(int SaleID, SaleDate date, double total, int maxSize) {
        super(maxSize);
        this.SaleID = SaleID;
        this.date = date;
        this.total = total;
    }

    public int getSaleID() {
        return SaleID;
    }

    public void setSaleID(int SaleID) {
        this.SaleID = SaleID;
    }

    public SaleDate getDate() {
        return date;
    }

    public void setDate(SaleDate date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    public boolean addBicycle(Bicycle b){
        boolean x = true;
        x = super.addObject(b);
        return x;
    }
    
    public Bicycle removeBicycle(Bicycle b){
        int c = super.findObject(b);
        Bicycle a = (Bicycle)super.removeObject(c);
        return a;
    }
    
    public boolean setBicycle(Bicycle b1, Bicycle b2){
        int d = super.findObject(b1);
        boolean x = super.setObject(d, b2);
        return true;
    }
    
    public int findBicycle(Bicycle b){
        int c = super.findObject(b);
        return c;
    }
}
