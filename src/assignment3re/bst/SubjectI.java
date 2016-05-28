/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.bst;

import assignment3re.util.OddEvenFilterI;

/**
 *
 * @author Ankit Mahale
 */
public interface SubjectI {
    public void registerObserver(ObserverI o, OddEvenFilterI filter);
    public void removeObserver(ObserverI o);
    public void notifyObservers(int number);
 
}
