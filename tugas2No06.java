import java.util.Scanner;

/**
 * tugas2No06
 */
public class tugas2No06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        while (true) {
            System.out.print("masukkan jenis: ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                break;
            }
            System.out.print("masukkan durasi: ");
            durasi = sc.nextInt();
            total += jenis * durasi;
        }
        System.out.println("total bayar: " + total);
        if (total > 5) {
            System.out.println("pajak: " + total * 0.1);

        }
    }
}