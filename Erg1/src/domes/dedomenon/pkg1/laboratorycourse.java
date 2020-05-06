
package domes.dedomenon.pkg1;

public class laboratorycourse {
   
    labclass labs[];
    public static void plithos (labclass []t){
       int plithos=0;
        for(int i=0; i<t.length;i++){
            plithos+=t[i].getS().length;
        }
        System.out.println("TA ATOMA POU PARAKOLOUTHOUN SINOLIKA EINAI : "+plithos);
    }
    
    public static void Epitixia (labclass []t){
       int plithosep=0;
       int plithosap=0;
        for(int i=0; i<t.length;i++){
           student x[] = t[i].getS();
           for(i=0; i<x.length;i++){
               if(x[i].getVathmos()>=5){
                   plithosep+=1;
               }else 
                   plithosap+=1;
           }
        }
        System.out.println("EPITIXONTES : "+plithosep+" APOTIXONTES : "+plithosap);
    }
    
}
