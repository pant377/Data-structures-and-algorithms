
package erg5;

import java.util.Scanner;

public class Erg5 {

    public static void main(String[] args) {
       
        
           
        LinkedQueue cpin = new LinkedQueue();

       
       
         Scanner s = new Scanner(System.in);
       
        int t=2;
        while(t>0&&t<5){
         System.out.println("  **MENU** \n \n 1. Afixi Autokinitou \n "
          + "2. Anaxorish Autokinitou \n 3. Katastasi Ouras \n 4. Exodos"); 
        int i=s.nextInt();
         
        switch(i){
           
            case 1 :  
               
                Scanner sc = new Scanner(System.in);
                System.out.println("Doste AK autokinitou : ");
                String ak=sc.nextLine();
                Car c= new Car(ak);
                cpin.add(c);
            
                break;
            
            case 2 :
               
                cpin.Remove();
                System.out.println("To proto autokinito aferethike ");
                break;
            
            case 3 : 
              
                 cpin.printlist();
                 break;
            
               
            case 4 :System.out.println("*END OF RUN*");t=6;
      
        } 
        }
      
        
    }
}
