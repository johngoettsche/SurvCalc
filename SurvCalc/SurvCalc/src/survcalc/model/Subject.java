/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.model;

import survcalc.view.Observer;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public interface Subject {
    public abstract void registerOberver(Observer obs);
    public abstract void removeObserver(Observer obs);
    public abstract void notifyObservers();
}
