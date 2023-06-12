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
public class datasetJurnal {
    private ArrayList<Integer> idjurnal;
    private ArrayList<String> notrans;
    private ArrayList<String> noref;
    private ArrayList<String> nama;
    private ArrayList<String> tgljurnal;
    private ArrayList<String> FKjurnaltrans;
    private ArrayList<String> IXFKjurnaltrans;
    private ArrayList<Integer> PKjurnal;
    
    
    public  datasetJurnal(){
        idjurnal = new ArrayList<Integer>();
        notrans = new ArrayList<String>();
        noref = new ArrayList<String>();
        nama = new ArrayList<String>();
        tgljurnal = new ArrayList<String>();
        FKjurnaltrans = new ArrayList<String>();
        IXFKjurnaltrans= new ArrayList<String>();
        PKjurnal = new ArrayList<Integer>();            
}

 public void insertIdJurnal(int isi){
        this.idjurnal.add(isi);
    }
    public ArrayList<Integer> getRecordIdJurnal(){
        return this.idjurnal;
    }
    
    public void insertNoTrans(String isi){
        this.notrans.add(isi);
    }
    public ArrayList<String> getRecordNoTrans(){
        return this.notrans;
    }
    
    public void insertNoref(String isi){
        this.noref.add(isi);
    }
    public ArrayList<String> getRecordNoref(){
        return this.noref;
    }
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    public void insertTglJurnal(String isi){
        this.tgljurnal.add(isi);
    }
    public ArrayList<String> getRecordTglJurnal(){
        return this.tgljurnal;
    }
    
    public void insertFKjurnaltrans(String isi){
        this.FKjurnaltrans.add(isi);
    }
    public ArrayList<String> getRecordFKjurnaltrans(){
        return this.FKjurnaltrans;
    }
     public void insertIXFKjurnaltrans(String isi){
        this.IXFKjurnaltrans.add(isi);
    }
    public ArrayList<String> getRecordIXFKjurnaltrans(){
        return this.IXFKjurnaltrans;
    }
    public void insertPKjurnal(int isi){
        this.PKjurnal.add(isi);
    }
    public ArrayList<Integer> getRecordPKjurnal(){
        return this.PKjurnal;
    }
    
    public void insertJurnal(int idjurnal, String notrans, String noref, String nama, 
            String tgljurnal, String FKjurnaltrans, String IXFKjurnaltrans, int PKjurnal){
        this.idjurnal.add(idjurnal);
        this.notrans.add(notrans);
        this.noref.add(noref);
        this.nama.add(nama);
        this.tgljurnal.add(tgljurnal);
        this.FKjurnaltrans.add(FKjurnaltrans);
        this.IXFKjurnaltrans.add(IXFKjurnaltrans);
        this.PKjurnal.add(PKjurnal);
    }
    
}   

    
  