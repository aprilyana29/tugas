public class data_pegawai {
    String Nama, Alamat, Gaji;
    String TTL;

data_pegawai(String Nama, String ttl, String alamat, String gaji){
    this.Nama = Nama;
    this.Alamat = alamat;
    this.TTL = ttl;
    this.Gaji = gaji;
}
void cetakdata_pegawai (String Nama) {System.out.println (
        "Nama                     = "+Nama +
        "\nAlamat                   = "+Alamat +
        "\nTTL                      = "+TTL +
        "\nGaji                     = "+Gaji );}
}
