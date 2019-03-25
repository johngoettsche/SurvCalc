/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.model;

import survcalc.model.Points;
import survcalc.model.PointType;
import survcalc.view.PointCoordinatePanel;
import survcalc.model.Point;
import survcalc.model.Coordinate;
import javax.swing.JOptionPane;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class PointFactory {
    
    private static volatile PointFactory instance;
    
    private Points points;
    
    protected PointFactory(){
        points = Points.getInstance();
    }
    
    public static PointFactory getInstance(){
        if(instance == null){
            synchronized(Points.class){
                if(instance == null) {
                    instance = new PointFactory();
                }
            }
        }
        return instance;
    }
    
    public Point createCoordinatePoint(){
        PointCoordinatePanel pointPanel = new PointCoordinatePanel();
        boolean success = false;
        int accept;
        Point newPoint = null;
        while(!success){
            accept = JOptionPane.showConfirmDialog(pointPanel, pointPanel, "Point", JOptionPane.OK_OPTION);
            success = true;
            int number;
            double northing, easting, elevation;
            String description;
            if(accept == 0){
                try{
                    number = Integer.parseInt(pointPanel.getNumberField());
                    northing = Double.parseDouble(pointPanel.getNorthingField());
                    easting = Double.parseDouble(pointPanel.getEastingField());
                    elevation = Double.parseDouble(pointPanel.getElevationField());
                    description = pointPanel.getDescriptionField();
                    if(!points.contains(number)){
                        Coordinate coordinate = new Coordinate(northing, easting, elevation);
                        newPoint = new Point(number, coordinate, description, PointType.Coordinate);
                        points.add(newPoint);
                    } else {
                        success = false;
                        JOptionPane.showMessageDialog(null, "Point number is used.");
                    }
                } catch(NumberFormatException ex){
                    success = false;
                    JOptionPane.showMessageDialog(null, "Point number must be an integer.\nNorthing, Easting and Elevation must be floating point numbers.");
                } catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
        return newPoint;
    }                                         
}
