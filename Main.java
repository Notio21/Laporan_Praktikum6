public class Main {
    public static void main(String[] args){
        // Membuat objek BangunDatar dari class Lingkaran
        BangunDatar lingkaran = new Lingkaran("Hijau", 5);
        // Membuat objek BangunDatar dari class Segitiga
        BangunDatar segitiga = new Segitiga("Merah", 5, 8);
        // Membuat objek BangunDatar dari class Persegi
        BangunDatar persegi = new Persegi("Kuning", 7, 5);
        /*Memanggil method Gambar */
        lingkaran.gambar();
        segitiga.gambar();
        persegi.gambar();
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Luas Persegi : " + persegi.luas());
    }
}
