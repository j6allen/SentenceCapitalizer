/******************
Jesse Allen
CIS163AA 
Module 9 assignment
10/23/2013
******************/

import java.util.Scanner;//Needed to create a scanner object

public class SentenceCapitalizer
{
   public static void main(String[] args)//main method
   {
   String input;//variable to hold user input
   
   //requests string from the user
   System.out.println("Enter a string consisting of multiple sentences" +
                      " without capitalization");
   
   //creates a scanner object
   Scanner keyboard = new Scanner(System.in);
   
   //gets next user input
   input = keyboard.nextLine();
   
   //calls sentenceCap method and displays results
   System.out.println(sentenceCap(input));
      
   }
   
   /**
   Method to convert first letter of each sentence to upper case
   @param str A string sentence
   @return A modified string
   */
   public static String sentenceCap(String str)
   {
      int i,j,k;//integer variable to hold index locations
      
      //creates a new StringBuilder object
      StringBuilder temp = new StringBuilder(str);
      
      //checks to ensure string os not empty 
      //sets char at index 0 to upper case
      if (temp.length() > 0 )
         temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
         
         //calls indexOf method and stores loction of ". " "? " "! " in variables
         i = temp.indexOf(". ");
         j = temp.indexOf("? ");
         k = temp.indexOf("! ");
       
         
         //loop to increment indexes
         while ( i != -1 || j != -1 || k != -1)
         {
            i++;
            j++;
            k++;
            
            //loop to increment indexes and convert chars to upper case
            while ( i < temp.length()&& j < temp.length() && k < temp.length() && temp.charAt(i) == ' ')
            
               i++;
               j++;
               k++;
               
            temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
            temp.setCharAt(j, Character.toUpperCase(temp.charAt(j)));
            temp.setCharAt(k, Character.toUpperCase(temp.charAt(k)));
            
            i = temp.indexOf(". ", i);
            j = temp.indexOf("? ", j);
            k = temp.indexOf("! ", k);
            
          
         }
         return temp.toString();//returns modified string
   }
}           