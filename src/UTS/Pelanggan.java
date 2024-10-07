/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Pelanggan extends Pengguna implements ReservasiInterface, PenggunaInterface{
    private ArrayList<Reservasi> reservasi;
    
    public Pelanggan(String username, String password){
        super(username, password);
        this.reservasi = new ArrayList<>();
    }
    
    @Override
    public void buatReservasi(String nama, int noKamar, String tanggalCheckIn, String tanggalCheckOut, ArrayList<Kamar> ruangan){
        for (Kamar kamar : ruangan){
            if (kamar.getNoKamar() == noKamar){
                if (kamar.status()){
                    kamar.setKetersediaan(false);
                    Reservasi reservasiBaru = new Reservasi(nama, noKamar, tanggalCheckIn, tanggalCheckOut);
                    reservasi.add(reservasiBaru);
                    System.out.println("Berhasil melakukan reservasi.");
                    return;
                } else{
                    System.out.println("Ruangan tidak tersedia.");
                    return;
                }
                
            }
        }
        System.out.println("Kamar dengan nomor " + noKamar + " tidak ditemukan.");
    }
    
    @Override
    public void lihatReservasi(){
        for (Reservasi reservasi : reservasi){
            reservasi.detailReservasi();
        }
    }
    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
