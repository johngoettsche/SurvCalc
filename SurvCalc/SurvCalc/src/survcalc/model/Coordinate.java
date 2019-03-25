/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.model;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class Coordinate {
    private double northing, easting, elevation;
    
    public Coordinate(double nor, double eas, double ele){
        northing = nor;
        easting = eas;
        elevation = ele;
    }
    
    public void setCoordinate(double nor, double eas, double ele){
        northing = nor;
        easting = eas;
        elevation = ele;
    }

    public double getNorthing() {
        return northing;
    }

    public double getEasting() {
        return easting;
    }

    public double getElevation() {
        return elevation;
    }
    
    public String toString(){
        String str = "{";
        str += northing + ", ";
        str += easting + ", ";
        str += elevation + "}";
        return str;
    }
}
