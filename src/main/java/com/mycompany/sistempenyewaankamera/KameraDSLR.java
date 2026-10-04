package com.mycompany.sistempenyewaankamera;

public class KameraDSLR extends Kamera {

    private String sensor;

    public KameraDSLR(String kode, String merk, double hargaSewaPerHari, String sensor) {
        super(kode, merk, hargaSewaPerHari);
        this.sensor = sensor;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        if (sensor != null && !sensor.trim().isEmpty()) {
            this.sensor = sensor;
        }
    }

    // Method overriding
    @Override
    public String getJenis() {
        return "DSLR";
    }

    // Method overriding
    @Override
    public void tampilkanInfo() {
        System.out.printf(
                "%-8s %-15s %-18s %-12s Rp%,.0f %-10s%n",
                getKode(),
                getMerk(),
                getJenis(),
                sensor,
                getHargaSewaPerHari(),
                isTersedia() ? "Tersedia" : "Disewa"
        );
    }
}
