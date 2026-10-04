package com.mycompany.sistempenyewaankamera;

public class KameraMirrorLess extends Kamera {

    private String resolusi;

    public KameraMirrorLess(String kode, String merk, double hargaSewaPerHari, String resolusi) {
        super(kode, merk, hargaSewaPerHari);
        this.resolusi = resolusi;
    }

    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        if (resolusi != null && !resolusi.trim().isEmpty()) {
            this.resolusi = resolusi;
        }
    }

    // Method overriding
    @Override
    public String getJenis() {
        return "Mirrorless";
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf(
                "%-8s %-15s %-18s %-12s Rp%,.0f %-10s%n",
                getKode(),
                getMerk(),
                getJenis(),
                resolusi,
                getHargaSewaPerHari(),
                isTersedia() ? "Tersedia" : "Disewa"
        );
    }
}
