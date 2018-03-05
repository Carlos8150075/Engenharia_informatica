/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import java.io.IOException;
import java.net.MalformedURLException;
import ppwebservicemanager.WebServiceConnection;

/**
 *
 * @author Bernardo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebServiceConnection conn = new WebServiceConnection("74b9a9663906be6535f2f93f5d5a2bd9");
        try{
          String s = conn.getContent("https://developers.zomato.com/api/v2.1/categories");
           System.out.println(s);
        }catch(IOException ex){
            ex.printStackTrace();
        }
            
        
        
    }
    
}
