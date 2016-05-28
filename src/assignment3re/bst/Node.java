/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.bst;


import assignment3re.util.OddEvenFilterI;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ankit Mahale
 */
public class Node implements SubjectI, ObserverI{
    
    int bNumber;
    boolean flag;
    Node left;
    Node right;
    
    
    Map<Node, OddEvenFilterI> map;

    public Node() {
        this.map = new HashMap<Node, OddEvenFilterI>();
    }
    
    
    @Override
    public void registerObserver(ObserverI o, OddEvenFilterI filter) {
        map.put((Node) o, filter);
    }

    @Override
    public void removeObserver(ObserverI o) {
        
    }

    @Override
    public void notifyObservers(int number) {
        for (Map.Entry<Node, OddEvenFilterI> entry : map.entrySet()) {
        //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
           if(entry.getValue().check(number))
           {entry.getKey().bNumber= entry.getKey().bNumber+number;
           
           }
           
     }
    }

    @Override
    public void update(int number) {
        this.bNumber=this.bNumber+number;
        notifyObservers(number);
    }

    
    
}
