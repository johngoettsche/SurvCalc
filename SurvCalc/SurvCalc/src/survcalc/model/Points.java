/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.model;

//import survcalc.model.Point;
import java.util.ArrayList;
import java.util.Collections;
import survcalc.view.Observer;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class Points implements Subject{
    private static volatile Points instance;
    private ArrayList<Observer> observers;
    
    ArrayList<Point> points;
    
    private Points(){
        points = new ArrayList();
        observers = new ArrayList();
    }
    
    public static Points getInstance(){
        if(instance == null){
            synchronized(Points.class){
                if(instance == null) {
                    instance = new Points();
                }
            }
        }
        return instance;
    }
    
    public void sortPoints(){
        Collections.sort(points);
    }
    
    public void add(Point point){
        points.add(point);
    }
    
    public boolean contains(int number){
        boolean result = false;
        for(int i = 0; i < points.size(); i++){
            if(number == points.get(i).getNumber()){
                result = true;
                break;
            }
        }
        return result;
    }
    
    public void remove(Point point){
        points.remove(point);
    }

    @Override
    public void registerOberver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(int o = 0; o < observers.size(); o++){
            observers.get(o).update();
        }
    }
    
    public void listPoints(){
        sortPoints();
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i).toString());
        }
    }
    
    public String toString(){
        String str = "";
        for(int i = 0; i < points.size(); i++){
            str += points.get(i).toString() + "\n";
        }
        return str;
    }
}
