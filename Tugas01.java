import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] responden = new String[10][6];

        String namaResponden = " ";
        int i = 0;
        int pilJawaban = 0;
        double rata=0;

        for (i = 0; i < responden.length; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            namaResponden = input.nextLine();
            int totalJawaban =0;
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan jawaban (1-5) untuk pertanyaan ke-" + (j + 1) + ": ");
                pilJawaban = input.nextInt();
                input.nextLine();
                totalJawaban+=pilJawaban;
            }
            rata = (double) totalJawaban/6;
            System.out.println("Rata rata survei per responden: " +rata);   
        }
    }
}
