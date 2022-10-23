public class gaji_pegawai {
    int gajipokok;
    int tunjanganJabatan;
    int gajiLembur;

    gaji_pegawai (int gajipokok, int tunjanganJabatan, int gajiLembur){
    this.gajipokok= gajipokok;
    this.tunjanganJabatan= tunjanganJabatan;
    this.gajiLembur = gajiLembur;

    }
    void cetakgaji_pegawai(int gajiLembur){System.out.println(
            "\nGaji Pokok               = "+ gajipokok+
            "\nGaji Tunjangan Jabatan   = "+ tunjanganJabatan+
            "\nGaji Lembur              = "+ gajiLembur);}
}
