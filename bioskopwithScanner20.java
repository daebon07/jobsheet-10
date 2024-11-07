import java.util.Scanner;
public class bioskopwithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.print("Pilih menu (1/2): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine(); 
                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Penonton berhasil ditambahkan!");
                } else {
                    System.out.println("Baris atau kolom tidak valid. Harap masukkan angka yang benar.");
                }

            } else if (pilihan == 2) {
                System.out.println("\nDaftar Penonton:");
                boolean adaPenonton = false;
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            adaPenonton = true;
                        }
                    }
                }
                if (!adaPenonton) {
                    System.out.println("Belum ada penonton yang terdaftar.");
                }

            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu 1 atau 2.");
            }
            System.out.print("\nIngin melanjutkan? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
        }
    }
}

