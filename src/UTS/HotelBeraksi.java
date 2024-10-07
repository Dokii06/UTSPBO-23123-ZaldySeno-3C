/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class HotelBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        ArrayList<Kamar> ruangan = new ArrayList<>();
        ArrayList<PenggunaInterface> pengguna = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        Admin admin = new Admin("Admin", "admin123", ruangan);
        Pelanggan pelanggan = new Pelanggan("Seno", "seno123");
        
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Pelanggan");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan: ");
            int pil0 = input.nextInt();
            input.nextLine();

            switch (pil0) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String adminUsername = input.nextLine();
                    System.out.print("Masukkan password: ");
                    String adminPass = input.nextLine();
                    
                     if (admin.getUsername().equals(adminUsername) && admin.authenticate(adminPass)) {
                        boolean adminRunning = true;
                        
                        while (adminRunning){
                            System.out.println("============================");
                            System.out.println("\nMenu Admin");
                            System.out.println("============================");
                            System.out.println("1. Tambah Ruangan");
                            System.out.println("2. Lihat Ruangan");
                            System.out.println("3. Exit");
                            System.out.print("Masukan Pilihan: ");
                            int pil1 = input.nextInt();
                            input.nextLine();

                            switch (pil1){
                                case 1:                
                                    System.out.print("Masukan Nomor Kamar: ");
                                    int noKamar = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukan Tipe Kamar: ");
                                    String tipeKamar = input.nextLine();
                                    System.out.print("Masukan Harga Kamar: ");
                                    double harga = input.nextDouble();
                                    admin.tambahRuangan(noKamar, tipeKamar, harga);
                                    break;
                                case 2:
                                    admin.lihatRuangan();
                                    break;
                                case 3:
                                    adminRunning = false;
                                    System.out.println("Keluar...");
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid. Mohon masukan input yang benar!!");
                            }
                        }
                     }else{
                         System.out.println("Login Gagal.");
                     }
                     break;
                case 2:
                    System.out.print("Masukkan username: ");
                    String pelangganUsername = input.nextLine();
                    System.out.print("Masukkan password: ");
                    String pelangganPass = input.nextLine();
                    if (pelanggan.getUsername().equals(pelangganUsername) && pelanggan.authenticate(pelangganPass)) {
                        boolean pelangganRunning = true;
                        
                        while(pelangganRunning){
                            System.out.println("============================");
                            System.out.println("\nMenu Pelanggan.");
                            System.out.println("============================");
                            System.out.println("1. Reservasi");
                            System.out.println("2. Lihat Reservasi");
                            System.out.println("3. Exit");
                            System.out.print("Masukan Pilihan: ");
                            int pil2 = input.nextInt();
                            input.nextLine();

                            switch (pil2) {
                                case 1:
                                    System.out.println("============================");
                                    admin.lihatRuangan();
                                    System.out.print("Masukan Nama: ");
                                    String nama = input.nextLine();
                                    System.out.print("Masukan Nomor Kamar: ");
                                    int noKamar = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukan Tanggal Check In (DD-MM-YYYY): ");
                                    String tanggalCheckIn = input.nextLine();
                                    System.out.print("Masukan Tanggal Check Out (DD-MM-YYYY)): ");
                                    String tanggalCheckOut = input.nextLine();
                                    pelanggan.buatReservasi(nama, noKamar, tanggalCheckIn, tanggalCheckOut, ruangan);
                                    break;
                                case 2:
                                    pelanggan.lihatReservasi();
                                    break;
                                case 3:
                                    pelangganRunning = false;
                                    System.out.println("Keluar...");
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid. Mohon masukan input yang benar!!");
                            }
                        }
                    }else{
                        System.out.println("Login Gagal.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Keluar dari aplikasi.");
                    input.close();
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
            }
                      
        }
    }
}
        
        