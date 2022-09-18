package AlgorithmNoteBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙젝 {
    /*
    1. 배열 정렬
    2. 3개 합 순서대로 구하고 M보다 작거나 같은 수 중 최대값 저장
     */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int sum = 0;
        int max = 0;

        Loop1:
        for(int i = 0; i < N; i++) {
            Loop2:
            for(int j = i + 1; j < N; j++) {
                Loop3:
                for(int k = j + 1; j < N; j++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum <= 21)
                        max = sum;
                    if(max == 21)
                        break Loop1;
                }
            }
        }

        System.out.println(max);
    }
}
