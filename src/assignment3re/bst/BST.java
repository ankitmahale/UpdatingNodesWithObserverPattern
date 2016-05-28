/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.bst;

/**
 *
 * @author Ankit Mahale
 */
public class BST {
    
        Node temp;
        public Node getTemp()
        {
            return temp;
        }    
       
        private Node Insertintobst(Node root,Node newnode)
        {    
             if (root == null) {
                return newnode;
            } else if (newnode.bNumber > root.bNumber) {
                root.right = Insertintobst(root.right, newnode);
            } else if (newnode.bNumber < root.bNumber) {
                root.left = Insertintobst(root.left, newnode);
            }

            return root;
          
        } 
        
        public Node Insertintobst(Node root,int value)
        {
             Node newnode=new Node();
             temp=newnode;
             newnode.bNumber=value;
             newnode.flag=false;
             root=Insertintobst(root,newnode);
             return root;
        
        }  
        public void up1(Node mainBSTroot,int number)
        {
             if(mainBSTroot!=null)
             {
                 up1(mainBSTroot.left,number);
                 mainBSTroot.update(number);
                 //mainBSTroot.bNumber=mainBSTroot.bNumber+number;
                 up1(mainBSTroot.right,number);
                 
             }
             
             return;
        
        }  
        public void up(Node mainBSTroot,int number)
        {
             up1(mainBSTroot,number);
             updateBst(mainBSTroot,number);
        
        }        
        public void InOrder(Node root)
        {
                 if(root !=  null) {  
                   InOrder(root.left); 
                   System.out.printf("%d ",root.bNumber);
                   InOrder(root.right);  
                 }  
                 return;
        }    
        public int max=0;
        public void findmax(Node root)
        {     
              if(root !=  null) {  
                   
                   findmax(root.left);
                   if(root.bNumber > max)
                   {   max=root.bNumber;
                   
                   }
                   findmax(root.right);  
                 }
              
              
        }   
        public void maxSetFlag(Node root)
        {
               if(root !=  null) {  
                   
                   maxSetFlag(root.left);
                   if(root.bNumber==max)
                       root.flag=true;
                   maxSetFlag(root.right);  
                 }
                return;
        }        
        public void updateBst(Node root, int updateValue)
        { 
            max=0;
            findmax(root);
            maxSetFlag(root);
            updateBstWithValue(root, updateValue);
            max=0;
            return;
        }   
        public void updateBstWithValue(Node root, int updateValue)
        {
               if(root !=  null) {
                   updateBstWithValue(root.left,updateValue);
                   if(root.flag==true)
                   {    root.bNumber=root.bNumber+updateValue;
                        root.flag=false;
                   }
                    
                   updateBstWithValue(root.right, updateValue);  
                 }
               return;
        }   
        public int sum=0;
        public void FindSumOfNodes(Node root)
        {      
               if(root !=  null) {  
                   
                   sum=sum+root.bNumber;
                   FindSumOfNodes(root.left);  
                   FindSumOfNodes(root.right);  
                 }
               
        } 
        public int SumOfNodes(Node root)
        {
            sum=0;
            FindSumOfNodes(root);
            return sum;
        }        
                
        
}
