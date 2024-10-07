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
public class Admin extends Pengguna implements PenggunaInterface{
    private ArrayList<Kamar> ruangan;
    
    public Admin(String username, String password, ArrayList<Kamar> Ruangan){
        super(username, password);
        this.ruangan = Ruangan;
    }
    
    public void tambahRuangan(int noKamar, String tipeKamar, double harga){
        ruangan.add(new Kamar(noKamar, tipeKamar, true, harga));
        System.out.println("Ruangan berhasil ditambahkan.");
    }
    
    public void lihatRuangan(){
        for (Kamar kamar : ruangan){
            kamar.detailsKamar();
        }
    }
    
    @Override
    public String getUsername(){
        return username;
    }
    
    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
