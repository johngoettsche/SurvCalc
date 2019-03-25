/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.model;

import survcalc.model.Coordinate;
import survcalc.view.Observer;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class Point implements Comparable<Point>{
    private int number;
    private Coordinate coordinate;
    private String description;
    private PointType type;
    
    public Point(int n, Coordinate c, String des, PointType t){
        number = n;
        coordinate = c;
        description = des;
        type = t;
    }
    
    public void setNumber(int n){
        number = n;
    }
    
    public void setCoordinates(Coordinate c){
        coordinate = c;
    }
    
    public void setDescription(String des){
        description = des;
    }
    
    public void setType(PointType t){
        type = t;
    }

    public int getNumber() {
        return number;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDescription() {
        return description;
    }

    public PointType getType() {
        return type;
    }
    
    public double getNorthing(){
        return coordinate.getNorthing();
    }
    
    public double getEasting(){
        return coordinate.getEasting();
    }
    
    public double getElevation(){
        return coordinate.getElevation();
    }

    public double horizontalDistance(Point other){
        return Math.sqrt(
            Math.pow(coordinate.getNorthing() - other.getNorthing(), 2) + 
            Math.pow(coordinate.getEasting() - other.getEasting(), 2)
        );
    }
    
    public double slopeDistance(Point other){
        return Math.sqrt(
            Math.pow(coordinate.getNorthing() - other.getNorthing(), 2) + 
            Math.pow(coordinate.getEasting() - other.getEasting(), 2) +
            Math.pow(coordinate.getElevation() - other.getElevation(), 2)
        );
    }
    
    public double northingDistance(Point other){
        return other.getNorthing() - coordinate.getNorthing();
    }
    
    public double eastingDistance(Point other){
        return other.getEasting() - coordinate.getEasting();
    }
    
    public double verticalDistance(Point other){
        return other.getElevation() - coordinate.getElevation();
    }
    
    public double direction(Point other){
        double sin = northingDistance(other) / horizontalDistance(other);
        double cos = eastingDistance(other) / horizontalDistance(other);
        /*
        System.out.println("sin: " + sin);
        System.out.println("\tAngle: " + Math.asin(sin));
        System.out.println("cos: " + cos);
        System.out.println("\tAngle: " + Math.acos(cos));
        double sinangle = 180 * Math.asin(sin) / Math.PI;
        double cosangle = 180 * Math.acos(cos) / Math.PI;
        System.out.println(sinangle + " : " + cosangle);*/
        
        double angle = 0.0;
        if(cos > 0){
            angle = Math.asin(sin);
        } else {
            angle = Math.PI - Math.asin(sin);
        }
        return angle;
    }
    
    @Override
    public int compareTo(Point other) {
        int result = 0;
        if(this.getNumber() < other.getNumber()){
            result = -1;
        } else if(this.getNumber() > other.getNumber()){
            result = 1;
        }  
        return result;
    }
    
    public String toString(){
        String str = number + " [";
        str += coordinate.toString() + ", ";
        str += description + "], ";
        str += type.toString();
        return str;
    }
}
