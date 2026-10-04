package com.mycompany.sistempenyewaankamera;

public class Kamera {

    // Encapsulation: semua atribut private
    private String kode;
    private String merk;
    private double hargaSewaPerHari;
    private boolean tersedia;

    // Static variable untuk menghitung jumlah objek
    private static int totalKamera = 0;

    // Constructor
    public Kamera(String kode, String merk, double hargaSewaPerHari) {
        this.kode = kode;
        this.merk = merk;
        setHargaSewaPerHari(hargaSewaPerHari);
        this.tersedia = true;

        totalKamera++;
    }

    // Getter kode
    public String getKode() {
        return kode;
    }

    // Setter kode
    public void setKode(String kode) {
        if (kode != null && !kode.trim().isEmpty()) {
            this.kode = kode;
        } else {
            System.out.println("Kode kamera tidak boleh kosong.");
        }
    }

    // Getter merk
    public String getMerk() {
        return merk;
    }

    // Setter merk
    public void setMerk(String merk) {
        if (merk != null && !merk.trim().isEmpty()) {
            this.merk = merk;
        } else {
            System.out.println("Merk kamera tidak boleh kosong.");
        }
    }

    // Getter harga
    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    // Setter harga dengan validasi
    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        if (hargaSewaPerHari > 0) {
            this.hargaSewaPerHari = hargaSewaPerHari;
        } else {
            this.hargaSewaPerHari = 0;
            System.out.println("Harga sewa harus lebih dari 0.");
        }
    }

    // Getter dan setter tersedia
    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Static method
    public static int getTotalKamera() {
        return totalKamera;
    }

    // Method yang akan dioverride subclass
    public String getJenis() {
        return "Kamera Umum";
    }

    // Method overriding nantinya
    public void tampilkanInfo() {
        System.out.printf(
                "%-8s %-15s %-18s Rp%,.0f%n",
                kode,
                merk,
                getJenis(),
                hargaSewaPerHari
        );
    }

    // Method overloading pertama
    public double hitungBiaya(int hari) {
        return hargaSewaPerHari * hari;
    }

    // Method overloading kedua
    public double hitungBiaya(int hari, double diskon) {
        double total = hargaSewaPerHari * hari;
        return total - (total * diskon / 100);
    }
}
