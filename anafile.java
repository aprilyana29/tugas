import java.util.Scanner;
class GajiKaryawan {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program karyawan Menghitung Gaji Karyawan ##");
    System.out.println("============================================");
    System.out.println();
     
    String nama, jabatan, pendidikan;
    char golongan;
    int gaji_pokok = 0, tunjangan = 0, total_upah,lembur = 0;
     
    System.out.print("Nama Karyawan: ");
    nama = input.nextLine();
    
    System.out.print("Jabatan: ");
    jabatan = input.nextLine();
    
    System.out.print("status pendidikan: ");
    pendidikan = input.nextLine();
     
    System.out.print("Golongan: ");
    golongan = input.next().charAt(0);  
     
    System.out.println();
     
     // tentukan jumlah upah per jam berdasarkan golongan
    switch (golongan) {
      case 'A':
        gaji_pokok = 900000;
        tunjangan = 100000;
         lembur = 100000;
        break;
      case 'B':
        gaji_pokok = 4000000;
        tunjangan = 100000;
         lembur = 100000;
        break;
      case 'C':
        gaji_pokok = 900000;
        tunjangan = 100000;
         lembur = 100000;
        break;
      case 'D':
        gaji_pokok = 800000;
         tunjangan = 100000;
          lembur = 100000;
        break;
    }
       
    total_upah = tunjangan + gaji_pokok + lembur;
     
    // proses output
    System.out.println("nama :" + nama);
    System.out.println("jabatan :" +jabatan);
    System.out.println("pendidikan :" +pendidikan);
    System.out.println(  "gaji "+" menerima upah Rp." + total_upah 
                       + " per bulan");
  }
}