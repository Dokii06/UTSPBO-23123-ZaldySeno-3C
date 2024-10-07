/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author user
 */
public class Reservasi {
    private String nama;
    private int noKamar;
    private String tanggalCheckIn;
    private String tanggalCheckOut;
    
    public Reservasi(String nama, int noKamar, String tanggalCheckIn, String tanggalCheckOut){
        this.nama = nama;
        this.noKamar = noKamar;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
    }
    
    public void detailReservasi(){
        System.out.println("Nama Pemesan: " + nama);
        System.out.println("Nomor Kamar: " + noKamar);
        System.out.println("Tanggal Check In: " + tanggalCheckIn);
        System.out.println("Tanggal Check Out: " + tanggalCheckOut);
    }
}
