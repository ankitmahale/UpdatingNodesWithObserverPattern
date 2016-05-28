/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.util;

/**
 *
 * @author Ankit Mahale
 */
public class EvenFilterImpI implements OddEvenFilterI{
     
     @Override
    public boolean check(int number) {
        
        if(number%2==0)
        return true;
        else
            return false;
    }
}
