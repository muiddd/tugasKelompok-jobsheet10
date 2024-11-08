import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] responden = new String[10][6];

        String namaResponden = " ";
        int i = 0;
        int pilJawaban = 0;

        for (i = 0; i < responden.length; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            namaResponden = input.nextLine();
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan jawaban (1-5) untuk soal ke-" + (j + 1) + ": ");
                pilJawaban = input.nextInt();
                input.nextLine();
            }
        }
        System.out.println("------HASIL SURVEI------");
        System.out.println("Responden ke-" + (i + 1) + " dengan nama: " + namaResponden);
        System.out.println("Jawaban soal ke-" + (i + 1) + ": " + pilJawaban);
    }
}
