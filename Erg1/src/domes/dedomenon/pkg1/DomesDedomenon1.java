
package domes.dedomenon.pkg1;

public class DomesDedomenon1 {

    public static void main(String[] args) {
       student [] mystudents = new student[4];
       
        mystudents[0]=new student(174891,"pantelos","papadopoulos",18.2,'a',1,5);
         mystudents[1]=new student(174892,"pantelos","pap",18.2,'a',1,8);
          mystudents[2]=new student(174898,"pantelis","papadopis",18.2,'a',1,10);
          mystudents[3]=new student(174898,"pants","papadopis",18.2,'a',0,1);
        
         
          //labclass class1 = new labclass("t3",mystudents);
         labclass t3 = new labclass("T3",mystudents);
         for(int i=0; i<mystudents.length; i++)
          System.out.println(mystudents[i]);
         System.out.println(t3);
         student m3 = new student(148741,"giorgos","stinis",19,'a',0,10);
         student m4 = new student(145522,"gianis","stonis",19,'a',0,1);
         labclass t4 = new labclass("T4",2);
         t4.eisagogi(m3);
         t4.eisagogi(m4);
         System.out.println(t4);
          t4.anazit(148741);
        
          t4.parousiologio();
            //t4.diagrafi(145522);
            labclass x[] = new labclass[2];
            x[0]=t3;
            x[1]=t4;
            laboratorycourse.plithos(x);
            laboratorycourse.Epitixia(x);
    }
}
