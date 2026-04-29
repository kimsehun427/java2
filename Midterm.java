import java.util.Scanner;
import java.util.ArrayList;

public class Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 수를 입력하세요: ");
        int start = sc.nextInt();

        System.out.print("끝 수를 입력하세요: ");
        int end = sc.nextInt();

        System.out.print("찾고자 하는 배수를 입력하세요: ");
        int multiple = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        ArrayList<Integer> multiplesList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % multiple == 0) {
                multiplesList.add(i);
            }
        }

        System.out.printf("%d와 %d까지 사이의 %d의 배수는 %d개입니다.\n", start, end, multiple, multiplesList.size());
        System.out.printf("그 수는 다음과 같습니다: %s\n", multiplesList);

        sc.close();
    }
}
