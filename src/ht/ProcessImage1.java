/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

import java.io.DataInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author amalu
 */
public class ProcessImage1 {
    public ProcessImage1(){
        try
      {
         
             String args1[]=new String[2];
             args1[0]=JOptionPane.showInputDialog("enter the URL");
             DownloadImages.main(args1);
            
      }
      catch(Exception ee)
      {
       System.out.println(ee);
      }
      
    }
}

