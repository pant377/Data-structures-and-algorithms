package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in) ;
       
       
        DoubleLinkedList OMEGA = new DoubleLinkedList() ;
        int t=2;
        while(t > 1)
        {
            System.out.println(" ******* DOUBLE LINKED LIST MANAGEMENT ******* \n "
                    + "1- INSERT ELEMENT AT THE BEGINNING OF THE LIST \n "
                    + "2- INSERT ELEMENT AT THE END OF THE LIST \n "
                    + "3- INSERT ELEMENT AT POSITION N OF THE LIST \n "
                    + "4- DELETE ELEMENT FROM THE BEGINNING OF THE LIST \n "
                    + "5- DELETE ELEMENT FROM THE END OF THE LIST \n "
                    + "6- DELETE ELEMENT FROM POSITION N OF THE LIST \n "
                    + "7- LIST LENGTH \n "
                    + "8- IS THE LIST EMPTY \n "
                    + "9- PRINT LIST \n "
                    + "0- EXIT");
             int y = x.nextInt() ; 
             
            switch(y){
                
                case 1: {
                        System.out.println("dose string ");
                        String f = x.next();
                        OMEGA.insertFirst(f); 
                        break;}
                
                case 2: {
                        System.out.println("dose string ");
                        String xe = x.next();
                        OMEGA.insertLast(xe);
                        break;}
                
                case 3: {       
                        System.out.println("dose string ");
                        String d = x.next();
                        System.out.println("dose thesi");
                        int p = x.nextInt();
                        { try {
                                OMEGA.insert(p,d);
                            } catch (NoSuchListPosition ex) {
                                    System.out.println(" den yparxei auth h thesi ");
                            }
                        }break;}
                
                case 4:{
                        OMEGA.removeFirst();
                        System.out.println(" first item removed ");
                        break;}
                
                case 5:{
                        OMEGA.removeLast();
                        System.out.println(" last item removed ");
                        break;}
                
                case 6:{
                        System.out.println(" give th position to remove ");
                        int pos = x.nextInt();
                        {
                            try {
                                OMEGA.remove(pos);
                            } catch (ListEmptyException ex) {
                                System.out.println("adeia lista");
                            } catch (NoSuchListPosition ex) {
                                System.out.println("den uparxei auth h thesi ");
                            }
                        }break;}
                
                case 7:{
                        System.out.println("the list length : "+OMEGA.size());
                        break;}
                
                case 8:{
                       System.out.println(OMEGA.isEmpty()); 
                       break;}
                
                case 0:{ t=0;
                        break;}
                   
                        
                
            }
            
        }
    }
}
