import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, loop;
        String nama, next;
        String[][] penonton = new String[4][2];

        loop = 0;
        while (loop == 0) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) 
                    {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton telah diinput.");
                        } else {
                            System.out.println("Kursi sudah terisi oleh penonton lain.");
                        }
                    } 
                    else 
                    {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) 
                        {
                            if (penonton[i][j] == null) 
                            {
                                System.out.print("*** ");
                            } 
                            else 
                            {
                                System.out.print(penonton[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    loop = 1;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }

            System.out.print("Lanjutkan? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
