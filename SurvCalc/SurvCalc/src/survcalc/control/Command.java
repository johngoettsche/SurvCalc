/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.control;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public interface Command {
    public abstract void execute();
    public abstract void undo();
}
