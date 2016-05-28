/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3re.driver;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProcessor {
    
    public String filename;
    static int count=1;
    public FileProcessor(String filename)
    {
        
        this.filename=filename;   
    }

    public String readLineFromFile() throws FileNotFoundException, IOException
    {
        
        int temp=count;
        
        try{
         FileInputStream fstream = new FileInputStream(filename);
        
         
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
            String strLine;
            while ((strLine = br.readLine() ) != null)   {
                if(--temp==0)
                {
                    br.close();
                    count++;
                    return strLine;
                }    
                 
                
            }
        }
         
        }
        catch (Exception e){
             System.out.println("File entered is not found");
             System.exit(0);
    
    }
        
    
         return "";
          }
}
