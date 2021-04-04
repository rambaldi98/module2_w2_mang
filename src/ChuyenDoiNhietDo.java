import java.util.Scanner;

public class ChuyenDoiNhietDo {

    static float chia2(float t1) {
        return (float) (1.0/2) *t1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float cen, far;
        int choice;


        do  {
            float t ;
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("nhap t = ");
                    t = scanner.nextFloat();
                    System.out.println(ftoC(t));
                    break;
                case 2:
                    System.out.print("nhap t = ");
                    t = scanner.nextFloat();
                    System.out.println(ctoF(t));
                    break;
                case 0:
                    choice = 0;
                    System.exit(0);
                    break;
            }

        } while (choice != 0);

    }


    public static double ftoC(float t) {
        return ((5.0/9)*(t -32));
    }
    public static double ctoF(float t) {
        return ((9.0/5)*t +32);
    }
}
