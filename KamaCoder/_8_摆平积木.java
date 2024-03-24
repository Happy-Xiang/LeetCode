/**
 * @Program: KamaCoder->_8_摆平积木
 * @Description: 8. 摆平积木
 * @Author: 未来可期
 * @Date: 2024-03-24 19:34
 * @Version： 1.0
 **/
import java.util.Scanner;

public class _8_摆平积木 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            int sum = 0;
            int avg = 0;
            if (num == 0){
                return;
            }
            int step = 0;
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                sum = sum + arr[i];
            }
            if (sum % num != 0){
                System.out.println("保证总数能被木堆数整除");
                break;
            }
            avg = sum / num;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > avg){
                    step = step + arr[i] - avg;
                }
            }
            System.out.println(step);
            System.out.println();
        }
    }
}
