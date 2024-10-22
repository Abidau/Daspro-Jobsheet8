import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int angka = sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int j = 0; j < angka; j++) {
                if (i == 1 || i == angka || j == 0 || j == angka - 1) {
                    System.out.print(" " + angka);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
