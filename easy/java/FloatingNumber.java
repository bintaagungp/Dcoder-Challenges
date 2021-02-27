package easy.java;

import java.util.*;

//Compiler version JDK 11.0.2

class Dcoder
{  
  public static void main(String args[])
  {  
        Scanner s = new Scanner(System.in);
        
        // [ Local input ]
        int t = 1;
        double number = 123.125;

        // [ Dcoder input ]
        // int t = Integer.parseInt(s.nextLine());

        for ( int i = 0 ; i < t ; i++ ) {

            // [ Dcoder input ]
            // double number = Double.parseDouble(s.nextLine());

            System.out.println(String.format("%.2f", number)); 

        }
        
        s.close();
  }
}