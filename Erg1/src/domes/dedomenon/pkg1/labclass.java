
package domes.dedomenon.pkg1;

import java.util.Arrays;

public class labclass {
    
    private String tmima;
    private student s[] ;

    public student[] getS() {
        return s;
    }

    public String getTmima() {
        return tmima;
    }
    
    
    
    
    public labclass(){
        
        s = new student [23];   
    }
    public labclass(int size){
        
        s = new student [size];
    }
     public labclass (String tmima,student[] st){
        this.tmima=tmima;
        s = st;
    }
    public labclass (String tmima,int size){
        this.tmima=tmima;
        s = new student [size];
    }
    
    public void eisagogi(student st){
        for (int i=0; i<=s.length; i++){
            if(s[i]==null){
                s[i]=st;
                break;
            }   
        }   
    }
    public void anazit(int am){
         for(int i=0;i<=s.length;i++){
            if(s[i].getAm()==am){
                System.out.println(s[i]);
                break;
            }    
        }  
    }
    public void diagrafi(int am){
        for(int i=0;i<=s.length;i++){
            if(s[i].getAm()==am){
                s[i]=null;
                System.out.println(Arrays.toString(s));
                break;
            }
        } 
    }
    public void parousiologio(){
        for(int i=0; i<s.length; i++){
            if(s[i]!=null){
                System.out.println(s[i]);
            }else System.out.println("kapios lipei ");
        }
    }

    @Override
    public String toString() {
        return "labclass{" + "tmima=" + tmima + ", s=" + Arrays.toString(s) + '}';
    }
    
}
