package domein;

public class Dier {
    private static final double VET_VERBRUIK_PER_UUR = 0.25;
    private static final double INITIELE_VETMASSA = 100.0;
    private final String ras;
    private double vetmassa;

    public Dier(String ras) {
        controleerRas(ras);
        this.ras = ras;

        setVetmassa(INITIELE_VETMASSA);
    }

    public String getRas() {
        return ras;
    }

    public double getVetmassa() {
        return vetmassa;
    }

    private void setVetmassa(double vetmassa) {
        this.vetmassa = vetmassa;
    }

    private void controleerRas(String ras) {
        if (ras == null || ras.isBlank()) {
            throw new IllegalArgumentException("Ras mag niet leeg zijn.");
        }
    }

    public void gaOpJacht(int tijd) {
        if (tijd <= 0) {
            throw new IllegalArgumentException("Ongeldige tijd");
        }

        if (tijd > berekenResterendeTijdVoorJacht()) {
            throw new IllegalArgumentException("Te weinig reserve");
        }

        vetmassa -= VET_VERBRUIK_PER_UUR * tijd;
    }

    public double berekenResterendeTijdVoorJacht() {
        return vetmassa / VET_VERBRUIK_PER_UUR;
    }
}
