/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class datasetKategori {
    private ArrayList<Integer> idkategori;
    private ArrayList<String> namakategori;
    private ArrayList<Integer> PKkategori;   
     
     
    
    public  datasetKategori(){
        idkategori = new ArrayList<Integer>();
        namakategori = new ArrayList<String>();
        PKkategori = new ArrayList<Integer>();
    }
        
   public void insertIdkategori(int isi){
        this.idkategori.add(isi);
    }
    public ArrayList<Integer> getRecordIdkategori(){
        return this.idkategori;
    }
    
    public void insertNamakategori(String isi){
        this.namakategori.add(isi);
    }
    public ArrayList<String> getRecordNamakategori(){
        return this.namakategori;
    }
    
    public void insertPKkategori(int isi){
        this.PKkategori.add(isi);
    }
    public ArrayList<Integer> getRecordPKkategori(){
        return this.PKkategori;
    }
    
    public void insertJurnal(int idkategori, String namakategori, int PKkategori){
        this.idkategori.add(idkategori);
        this.namakategori.add(namakategori);
        this.PKkategori.add(PKkategori);
    }
}
