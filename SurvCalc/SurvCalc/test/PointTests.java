/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import survcalc.model.PointType;
import survcalc.model.Point;
import survcalc.model.Coordinate;
import survcalc.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class PointTests {
    private Point a, b;
    private Coordinate coord;
    
    public PointTests() {
        coord = new Coordinate(0,0,0);
        a = new Point(1, coord, "A", PointType.Coordinate);
        coord = new Coordinate(-4,-3,1);
        b = new Point(1, coord, "B", PointType.Coordinate);
        
        //System.out.println(a.direction(b));
    }
    
    @Test
    public void hello() {
        System.out.println("direction: " + a.direction(b));
        System.out.println("distance: " + a.horizontalDistance(b));
        assertEquals(5.0, a.horizontalDistance(b), 0.0);
    }
}
