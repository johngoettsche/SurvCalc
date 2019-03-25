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
public class FileExitCommand implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public void undo() {
        
    }
}
