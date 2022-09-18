package AlgorithmNoteBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소문자찾기 {
    // a~z : 97~122
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

//        for(int i = 0; i < arr.length; i++) {
//            if(i == S.charAt(i) - 'a')
//                arr[i] = i;
//        }

        int position = 0;
        for(int i = 0; i < S.length(); i++) {
            position = S.charAt(i)-'a';
            if(arr[position] == -1)
                arr[position] = i;
        }

        // 배열 쭉 출력하는 방법
        for(int i = 0; i < 26; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}
