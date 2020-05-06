import java.util.Scanner;

public class SLListManagement {
    
    
    public static void main(String args[]){
        
        SimpleLinkedList SLL= new SimpleLinkedList();
        Scanner sc= new Scanner(System.in);
        int epilogi;
        String keimeno;
        do {
            System.out.println("\n1.INSERT ELEMENT AT THE BEGINNING OF THE LIST\n2.INSERT ELEMENT AT THE END OF THE LIST"
            + "\n3.DELETE FROM THE BEGINNING OF THE LIST\n4.DELETE FROM THE END OF THE LIST"
            + "\n5.LIST LENGTH\n6.IS THE LIST EMPTY\n7.PRINT LIST\n8.EXIT");
            epilogi= sc.nextInt();
            switch (epilogi){
                case 1:
                    System.out.println("Dose keimeno gia eisagogi sthn arxh: ");
                    keimeno= sc.next();
                    SLL.insertFirst(keimeno);
                    break;
                case 2:
                    System.out.println("Dose keimeno gia eisagogi sto telos: ");
                    keimeno= sc.next();
                    SLL.insertLast(keimeno);
                    break;
                case 3:
                    try{
                        System.out.println("Diagrafi apo thn arxh: "+SLL.removeFirst());
                    }
                    catch (ListEmptyException msg){
                        System.err.println(msg.getMessage());
                    }
                    break;
                case 4:
                    try{
                        System.out.println("Diagrafi apo to telos: "+SLL.removeLast());
                    }
                    catch (ListEmptyException msg){
                        System.err.println(msg.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("To megethos tis listas einai: "+SLL.size2());
                    break;
                case 6:
                    System.out.println("Einai adeia h lista: "+SLL.isEmpty());
                    break;
                case 7:
                    try{
                        SLL.printList();
                    }
                    catch (ListEmptyException msg){
                        System.err.println(msg.getMessage());
                    }
                    break;
                default:
                    break;                
            }
        }while (epilogi!=8);
    }
}
