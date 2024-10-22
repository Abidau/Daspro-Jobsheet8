import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cabor1 = "badminton";
        String cabor2 = "tenisMeja";
        String cabor3 = "basket";
        String cabor4 = "bolaVoly";
        int jumlahPoliteknik = 5;

        System.out.println(cabor1 + ":");
        for (int i=1 ; i <= jumlahPoliteknik; i++) {
            System.out.print("Atlet " + i + " cabor " + cabor1 + " bernama :");
            sc.nextLine();
        }
        System.out.println();

        System.out.println(cabor2 + ":");
        for (int i=1 ; i <= jumlahPoliteknik; i++) {
            System.out.print("Atlet " + i + " cabor " + cabor2 + " bernama :");
            sc.nextLine();
        }
        System.out.println();

        System.out.println(cabor3 + ":");
        for (int i=1 ; i <= jumlahPoliteknik; i++) {
            System.out.print("Atlet " + i + " cabor " + cabor3 + " bernama :");
            sc.nextLine();
        }
        System.out.println();

        System.out.println(cabor4 + ":");
        for (int i=1 ; i <= jumlahPoliteknik; i++) {
            System.out.print("Atlet " + i + " cabor " + cabor4 + " bernama :");
            sc.nextLine();
        }
        sc.close();
    }
}
