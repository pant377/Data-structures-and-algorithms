public class main
{
    public static void main(String args[]){
        Student S[]= new Student[5];
        S[0]= new Student(174891, "antonis", "salpigkidis", 210, 'A', 5, 0) ;
        S[1]= new Student(174890, "makis", "takis", 11, 'A', 1, 5) ;
        S[2]= new Student(174899, "James", "Rouvas", 19, 'A', 0, 3) ;
        S[3]= new Student(174898, "ELisampeta", "Agglias", 19, 'K', 2, 10) ;
        S[4]= new Student(174895, "Godzilla", "ChinaGuy", 19, 'A', 1, 9);
        Stack ar= new ArrayStack(5) ;
        ar.push(S[0]) ;
        ar.push(S[1]) ;
        ar.push(S[2]) ;
        ar.push(S[3]) ;
        ar.push(S[4]) ;
        System.out.println(ar.pop()) ;
        System.out.println(ar.top()) ;
    }
}
