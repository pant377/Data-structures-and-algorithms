package erg5;


public class Parenthesis {
    
    private static final char A_Parenthesi = '(';
    private static final char D_Parenthesi = ')';
    private static final char A_Brace = '{';
    private static final char D_Brace = '}';
    private static final char A_Bracket = '[';
    private static final char D_Bracket = ']';
    
    public static String sosthXrhsh(String s){
        LinkedStack stack= new LinkedStack();
        int errTHESI=0;
        boolean flag= true;
        for (int i=0; i<s.length(); i++){
            if ((char)s.charAt(i) == A_Parenthesi)
                stack.push(A_Parenthesi);
            else if ((char)s.charAt(i) == A_Brace)
                stack.push(A_Brace);
            else if ((char)s.charAt(i) == A_Bracket)
                stack.push(A_Bracket);
            else if ((char)s.charAt(i) == D_Parenthesi){
                if (stack.isEmpty()){
                    flag = false;
                    errTHESI=i;
                    break;
                }
                if ((Character)stack.pop() != A_Parenthesi){
                    flag = false;
                    errTHESI=i;
                    break;
                }
            }
            else if ((char)s.charAt(i) == D_Brace){
                if (stack.isEmpty()){
                    flag = false;
                    errTHESI=i;
                    break;
                }
                if ((Character)stack.pop() != A_Brace){
                    flag = false;
                    errTHESI=i;
                    break;
                }
            }
            else if ((char)s.charAt(i) == D_Bracket){
                if (stack.isEmpty()){
                    flag = false;
                    errTHESI=i;
                    break;
                }
                if ((Character)stack.pop() != A_Bracket){
                    flag = false;
                    errTHESI=i;
                    break;
                }
            }            
        }
        if (flag){
            return "No error";
        }
        else {
            return "Error at position "+(errTHESI+1);
        }
    }
    public static void main(String args[]){
        String s= "[{(1+1+4+1))}-9+1]";
        System.out.println(sosthXrhsh(s));
    }
}
