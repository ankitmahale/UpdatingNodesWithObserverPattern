
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.driver;

import assignment3re.bst.BST;
import assignment3re.bst.Node;
import assignment3re.util.BSTBuilder;
import java.io.IOException;

/**
 *
 * @author Ankit Mahale
 */
public class Driver {

    public static void main(String[] args) throws IOException {
        
        if(args.length!=2)
        {   
            System.out.println("Wrong no of arguments of arguments- Argument length should be 2");
            System.exit(0);
        
        }
        
        Node mainBSTroot=null;
        Node backup1root=null;
        Node backup2root=null;
        BST bst=new BST();
        int inputValue=0;
        
        String file=args[0];
        try{
             inputValue=Integer.parseInt(args[1]);
        }
        catch (Exception e){
                System.out.println("Input value can only be integers\n");
                System.exit(0);
        }
        BSTBuilder bstBuilder= new BSTBuilder(mainBSTroot, backup1root, backup2root, bst, file);
        bstBuilder.BuildTrees();
        mainBSTroot=bstBuilder.getMainRoot();
        backup1root=bstBuilder.getRoot1();
        backup2root=bstBuilder.getRoot2();
        bst.InOrder(mainBSTroot);
        System.out.println("\n");
        bst.InOrder(backup1root);
        System.out.println("\n");
        bst.InOrder(backup2root);
        System.out.println("\n");
        System.out.println("Sum of nodes of main Tree:"+ bst.SumOfNodes(mainBSTroot));
        System.out.println("Sum of nodes of main Tree:"+ bst.SumOfNodes(backup1root));
        System.out.println("Sum of nodes of main Tree:"+ bst.SumOfNodes(backup2root));
        bst.up(mainBSTroot,inputValue);
        bst.InOrder(mainBSTroot);
        System.out.println("\n");
        bst.InOrder(backup1root);
        System.out.println("\n");
        bst.InOrder(backup2root);
        System.out.println("\n");
        System.out.println("Sum of nodes of main Tree:"+ bst.SumOfNodes(mainBSTroot));
        System.out.println("Sum of nodes of 1st Backup Tree:"+ bst.SumOfNodes(backup1root));
        System.out.println("Sum of nodes of 2nd Backup Tree:"+ bst.SumOfNodes(backup2root));
        
        
        
 
    }
    
}
