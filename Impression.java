/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package licenceproject;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author allessi
 */
public class Impression {
    
    public static void imprimerJtable(JTable jt, String titre){
     MessageFormat entete = new MessageFormat(titre);
     MessageFormat pied = new MessageFormat("ALLESSI & DJOI");

    try{
        jt.print(JTable.PrintMode.FIT_WIDTH, entete, pied);
    }catch(Exception e)  {
        JOptionPane.showMessageDialog(null,"Erreur \n"+e,"Impression", JOptionPane.ERROR_MESSAGE);
    }  
     
    }
}
