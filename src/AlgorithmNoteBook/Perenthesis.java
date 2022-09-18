package AlgorithmNoteBook;

import java.util.*;

public class Perenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Stack<String> stack = new Stack<>();

        /*
       ")" : 스택에 "("이 없으면 NO 출력.
             스택에 "("가 있으면 pop()
       "(" : 스택에 push.
        */
        String ps;

        for(int i = 0; i < T; i++) {
            ps = sc.nextLine();
            System.out.println(ps);
            if(ps.equals("("))
                stack.push(ps);
            else if(ps.equals(")")) {
                if(stack.isEmpty())
                    System.out.println("NO");
                else
                    stack.pop();
            }

            if(stack.isEmpty())
                System.out.println("YES");
            else if(!stack.isEmpty())
                System.out.println("NO");
        }
    }
}
