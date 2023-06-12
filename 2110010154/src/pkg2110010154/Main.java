/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010154;
import dataset.*;
/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        tbladmin admin= new tbladmin();
        tbljurnal jurnal= new tbljurnal();
        tblkategori kategori= new tblkategori();
        tblpelanggan pelanggan = new tblpelanggan();
        tblproduk produk = new tblproduk();
        tbltrans trans = new tbltrans();
        tbltransdetail transdetail = new tbltransdetail();
       
        //Set
        admin.setkdBrg(1001);
        barang.setnmaBrg("Bodrex");
        barang.setSatuan(5);
        barang.sethrgBeli(50000);
        barang.sethrgJual(30000);
        
        pelanggan.setkdPelanggan(0001);
        pelanggan.setnmaPelanggan("Muhammad Rafli Aditya");
        pelanggan.settelpPelanggan("08123456789");
        pelanggan.setfaxPelanggan(5000);
        pelanggan.setemailPelanggan("muhrafliaditya062@gmail.com");
        pelanggan.setalamatPelanggan("Jln. Sungai Lulut");
        pelanggan.setTgl("18 Mei 2023");
        
                
        //Get
        System.out.println("Kode Obat: " + barang.getkdBrg());
        System.out.println("Nama Obat : " + barang.getnmaBrg());
        System.out.println("Satuan : " + barang.getSatuan());
        System.out.println("Harga Beli : " + barang.gethrgBeli());
        System.out.println("Harga Jual : " + barang.gethrgJual());
        
        System.out.println("------------------------------------------");
        System.out.println("Kode Pelanggan :" + pelanggan.getkdPelanggan());
        System.out.println("Nama : " + pelanggan.getnmaPelanggan());
        System.out.println("Telepon : " + pelanggan.gettelpPelanggan());
        System.out.println("Fax : " + pelanggan.gettelpPelanggan());
        System.out.println("Email : " + pelanggan.getemailPelanggan());
        System.out.println("Alamat : " + pelanggan.getalamatPelanggan());
        System.out.println("Tgl : " + pelanggan.getTgl());
        */
        //Memasukkan Array List kedalam Object
        tbladmin admin= new tbladmin();
        tbljurnal jurnal= new tbljurnal();
        tblkategori kategori= new tblkategori();
        tblpelanggan pelanggan = new tblpelanggan();
        tblproduk produk = new tblproduk();
        tbltrans trans = new tbltrans();
        tbltransdetail transdetail = new tbltransdetail();
        
        //Menginput data ArrayList pada masing-masing tabel
        admin.insertidadmin(001);
        admin.insertemailadmin("Bodrex");
        admin.insertpswdadmin(1);
        admin.insertnamaadmin(5000);
        admin.inserthpadmin(10000);
        admin.insertimgadmin(002, "Paracetamol", 1, 2000, 4000);
        admin.insertPKadmin(1);
        
        jurnal.insertidjurnal(101);
        jurnal.insertnotrans("Muhammad Taufik");
        jurnal.insertnoref(3000);
        jurnal.insertnama("Jl. Kelayan A");
        jurnal.inserttgljurnal("muhammadtaufik140903@gmail.com");
        jurnal.insertFKjurnaltrans("081234567890");
        jurnal.insertIXFKjurnaltrans("31 Mei 2023");
        jurnal.insertPKjurnal(102, "Muhammad Rafli", 5000, "Jl. Veteran", 
                "muhrafliaditya062@gmail.com", "08122229384", "31 Mei 2023");
        
        kategori.insertidkategori(201);
        kategori.insertnamakategori("31 Mei 2023");
        kategori.insertPKKkategori(50);
        
        pelanggan.insertKdPelanggan(101);
        pelanggan.insertNmaPelanggan("Muhammad Taufik");
        pelanggan.insertFaxPelanggan(3000);
        pelanggan.insertAlamatPelanggan("Jl. Kelayan A");
        pelanggan.insertEmailPelanggan("muhammadtaufik140903@gmail.com");
        pelanggan.insertTelpPelanggan("081234567890");
        pelanggan.insertTgl("31 Mei 2023");
        pelanggan.insertPelanggan(102, "Muhammad Rafli", 5000, "Jl. Veteran", 
                "muhrafliaditya062@gmail.com", "08122229384", "31 Mei 2023");
        
        
        produk.insertKdSupplier(401);
        produk.insertNmaSupplier("Fachrudinnor");
        produk.insertFaxSupplier(3000);
        produk.insertAlamatSupplier("Jl. Veteran");
        produk.insertTelpSupplier("081774983864");
        produk.insertEmailSupplier("fachrudinor224@gmail.com");
        produk.insertSupplier(402, "Rifaldi", 4000, "Jl. Manggis", 
                "08183839355", "akhmadrifaldi43@gmail.com");
        
        trans.insertUserId("admin");
        trans.insertPassId("admin");
        trans.insertLevelUser(1);
        trans.insertUser("user", "user", 2);
        
        
        transdetail.insertKdSupplier(401);
        transdetail.insertNmaSupplier("Fachrudinnor");
        transdetail.insertFaxSupplier(3000);
        transdetail.insertAlamatSupplier("Jl. Veteran");
        transdetail.insertTelpSupplier("081774983864");
        transdetail.insertEmailSupplier("fachrudinor224@gmail.com");
        transdetail.insertSupplier(402, "Rifaldi", 4000, "Jl. Manggis", 
                "08183839355", "akhmadrifaldi43@gmail.com");
        
        
        //Menampilkan data ArrayList
        System.out.println("===============DATA ADMIN==============");
        System.out.println(admin.getRecordidadmin());
        System.out.println(admin.getRecordemailadmin());
        System.out.println(admin.getRecordpswdadmin());
        System.out.println(admin.getRecordnamaadmin());
        System.out.println(admin.getRecordhpadmin());
        System.out.println(admin.getRecordimgadmin());
        System.out.println(admin.getRecordPKadmin());
        
        System.out.println("\t");
        System.out.println("===============DATA JURNAL==============");
        System.out.println(jurnal.getRecordidjurnal());
        System.out.println(jurnal.getRecordNmaPelanggan());
        System.out.println(jurnal.getRecordFaxPelanggan());
        System.out.println(jurnal.getRecordAlamatPelanggan());
        System.out.println(jurnal.getRecordEmailPelanggan());
        System.out.println(jurnal.getRecordTelpPelanggan());
        System.out.println(jurnal.getRecordTgl());
        
        System.out.println("\t");
        System.out.println("===============DATA PEMBELIAN==============");
        System.out.println(kategori.getRecordNoFaktur());
        System.out.println(kategori.getRecordTglFaktur());
        System.out.println(kategori.getRecordBykKeluar());
        System.out.println(kategori.getRecordHrgBeli());
        System.out.println(kategori.getRecordHrgJual());
        
        System.out.println("\t");
        System.out.println("===============DATA PENJUALAN==============");
        System.out.println(pelanggan.getRecordNoFaktur());
        System.out.println(pelanggan.getRecordTglFaktur());
        System.out.println(pelanggan.getRecordBykKeluar());
        System.out.println(pelanggan.getRecordHrgBeli());
        System.out.println(pelanggan.getRecordHrgJual());
        
        System.out.println("\t");
        System.out.println("===============DATA SUPPLIER==============");
        System.out.println(produk.getRecordKdSupplier());
        System.out.println(produk.getRecordNmaSupplier());
        System.out.println(produk.getRecordFaxSupplier());
        System.out.println(produk.getRecordAlamatSupplier());
        System.out.println(produk.getRecordTelpSupplier());
        System.out.println(produk.getRecordEmailSupplier());
        
        System.out.println("\t");
        System.out.println("===============DATA USER==============");
        System.out.println(produk.getRecordUserId());
        System.out.println(produk.getRecordPassId());
        System.out.println(produkgetRecordLevelUser());
    }
    
}
