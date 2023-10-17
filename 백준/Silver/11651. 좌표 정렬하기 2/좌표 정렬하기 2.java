import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(bufferedReader.readLine());
        int [][] arr= new int[N][2];
        StringTokenizer stringTokenizer;
        for(int i =0; i<N; i++){
            stringTokenizer=new StringTokenizer(bufferedReader.readLine()," ");
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){ // y좌표가 같으면
                    return o1[0] - o2[0];
                }else{
                    return o1[1] - o2[1];
                }
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i<arr.length; i++){
            stringBuilder.append(arr[i][0]+" "+arr[i][1]).append("\n");
        }
        System.out.println(stringBuilder);
    }
}