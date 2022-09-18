package AlgorithmNoteBook;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < testNum; i++) {
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for(int k = 0; k < repeat; k++) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}

