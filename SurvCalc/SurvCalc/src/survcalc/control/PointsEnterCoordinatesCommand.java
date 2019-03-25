/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.control;

import survcalc.model.Point;
import survcalc.model.PointFactory;
import survcalc.model.Points;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class PointsEnterCoordinatesCommand implements Command{
    PointFactory pointFactory = PointFactory.getInstance();
    Points points = Points.getInstance();
    Point lastPoint;
    
    
    @Override
    public void execute() {
        lastPoint = pointFactory.createCoordinatePoint();
        points.listPoints(); // standard output
        points.notifyObservers();
    }

    @Override
    public void undo() {
        if(lastPoint != null){
            points.remove(lastPoint);
        }
    }
    
}
