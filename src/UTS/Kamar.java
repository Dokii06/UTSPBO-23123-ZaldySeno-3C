/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author user
 */
public class Kamar {
    private int noKamar;
    private String tipeKamar;
    private boolean status;
    private double harga;
    
    public Kamar(int noKamar, String tipeKamar, boolean status, double harga){
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.status = status;
        this.harga = harga;
    } 
    
    public int getNoKamar(){
        return noKamar;
    }
    public String getTipeKamar(){
        return tipeKamar;
    }
    public boolean status(){
        return status;
    }
    public void setKetersediaan(boolean tersedia){
        status = tersedia;
    }
    public double getHarga(){
        return harga;
    }
    
    public void detailsKamar(){
        System.out.println("============================");
        System.out.println("Detail Kamar.");
        System.out.println("============================");
        System.out.println("Nomor Kamar: " + noKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Status: " + (status ? "Tersedia" : "Tidak"));
    }
        
}

