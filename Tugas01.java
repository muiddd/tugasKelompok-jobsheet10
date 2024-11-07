import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] responden = new String[10][6];

        String namaResponden;

        for (int i = 0; i < responden.length; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            namaResponden = input.nextLine();
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan jawaban (1-5) untuk soal ke-" + (j + 1) + ": ");
                int pilJawaban = input.nextInt();
                input.nextLine();
            }
        }
    }
}
