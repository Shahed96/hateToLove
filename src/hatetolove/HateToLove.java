/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatetolove;

/**
 *
 * @author Shahed A. Alali
 * Changing hate to love
 * Date: 9/10/2019
 */
import java.util.Scanner;

public class HateToLove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a line of text include \"hate\" word >>");
        Scanner obj=new Scanner (System.in);
        String lineOfText =obj.nextLine();
        int lineOfTextLength =lineOfText.length();
       int indexOfFirstOccurrenceOfHate= lineOfText.indexOf("hate");
     String hate= lineOfText.substring(indexOfFirstOccurrenceOfHate,indexOfFirstOccurrenceOfHate+4);
     hate="love";
     String beforeHate= lineOfText.substring(0,indexOfFirstOccurrenceOfHate);
     String afterHate= lineOfText.substring(indexOfFirstOccurrenceOfHate+4,lineOfTextLength);
     System.out.println("I have rephased that line to read: ");
      System.out.println(beforeHate+hate+afterHate);
      
        
    }
    
}
