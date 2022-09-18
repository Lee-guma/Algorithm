package AlgorithmNoteBook;

// 크기가 10001인 배열을 만들어서 self 넘버를 찾고 제외
public class 셀프넘버 {
    // 메소드에 static을 넣어주어야 클래스 생성 시 만들어지기 떄문데 붙여줘야 한다.
    public static int selfNum(int n) {
        // 1부터 다 넣어서 그 수로 만들 수 있는 셀프 넘버를 구해서 배열에서 제외
        // 10000까지 쭉 진행하고 10000이 넘어가면 제외

        int sn = n; // 여기가 0 이면, 안됨!

        while(n != 0) {
            sn += n % 10;
            n /= 10;
        }

        return sn;
    }

    public static void main(String args[]) {

        boolean[] arr = new boolean[10001]; // 데이터 크기 때문에 boolean
        int index;

        for(int i = 1; i < arr.length; i++) {
               index = selfNum(i);
               if(index < arr.length)
                   arr[index] = true;
        }

        for(int i = 1; i < arr.length; i++) {
            if(!arr[i])
                System.out.println(i);
        }
    }
}
