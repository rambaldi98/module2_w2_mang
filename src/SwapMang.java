import java.util.Scanner;

public class SwapMang {


    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner = new Scanner(System.in);

        do{
            size = scanner.nextInt();
        }while (size < 0);
        arr = new int[size];
        for(int i = 0; i < size; i ++) {
            arr[i] = scanner.nextInt();
        }
        sapxep(arr);
        for (int x:arr ) {
            System.out.println(x);
        }

    }

    public static void sapxep(int [] arr) {
        for (int i = 0; i <= arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;

        }
    }
}
