/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.util;

import assignment3re.bst.BST;
import assignment3re.bst.Node;
import assignment3re.driver.FileProcessor;
import java.io.IOException;

/**
 *
 * @author Ankit Mahale
 */

public class BSTBuilder {
 
    public Node mainBSTroot;
    public Node backup1root;
    public Node backup2root;
    BST bst=new BST();
    
    FileProcessor fp;
    
    public Node getMainRoot()
    {
        return mainBSTroot;
    }
     public Node getRoot1()
    {
        return backup1root;
    }
      public Node getRoot2()
    {
         return backup2root;
    }
    
    
    public BSTBuilder(Node mainBSTrootIn, Node backup1rootIn, Node backup2rootIn, BST bstIn, String file ){
        
        
        fp=new FileProcessor("C:\\Users\\Ankit Mahale\\Desktop\\Netbeans projects\\Assignment3re\\src\\assignment3re\\"+file);
        mainBSTroot=mainBSTrootIn;
        backup1root=backup1rootIn;
        backup2root=backup2rootIn;
        bst=bstIn;
        
        
           
    }  
    public void BuildTrees() throws IOException
    {   String line;
        int number;
        Node temp1;
        Node temp2;
        Node temp3;
        OddEvenFilterI even=new EvenFilterImpI();
        OddEvenFilterI odd=new OddFilterImpI();
        
        
        while((line=fp.readLineFromFile())!="")
        {   
                number=Integer.parseInt(line);
                mainBSTroot=bst.Insertintobst(mainBSTroot, number);
                temp1=bst.getTemp();
                backup1root=bst.Insertintobst(backup1root, number);
                temp2=bst.getTemp();
                backup2root=bst.Insertintobst(backup2root, number);
                temp3=bst.getTemp();
                temp1.registerObserver(temp2, even);
                temp1.registerObserver(temp3, odd);
        }
        
    }        
    
    
    
    
    
    
    
    
}
