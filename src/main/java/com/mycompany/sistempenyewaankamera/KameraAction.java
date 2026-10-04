package com.mycompany.sistempenyewaankamera;

public class KameraAction extends Kamera {

    private boolean tahanAir;

    public KameraAction(String kode, String merk, double hargaSewaPerHari, boolean tahanAir) {
        super(kode, merk, hargaSewaPerHari);
        this.tahanAir = tahanAir;
    }

    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    // Method overriding
    @Override
    public String getJenis() {
        return "Action Camera";
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf(
                "%-8s %-15s %-18s %-12s Rp%,.0f %-10s%n",
                getKode(),
                getMerk(),
                getJenis(),
                tahanAir ? "Tahan Air" : "Tidak",
                getHargaSewaPerHari(),
                isTersedia() ? "Tersedia" : "Disewa"
        );
    }
}
