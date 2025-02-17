package live.denisdev;

public class Infisso {
    private String materiale;
    private double larghezza;
    private double altezza;
    public Infisso(String materiale, double larghezza, double altezza) {
        this.materiale = materiale;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Infisso [altezza=" + altezza + ", larghezza=" + larghezza + ", materiale=" + materiale + "]\n";
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Infisso) {
            Infisso i = (Infisso) o;
            return i.getMateriale().equals(materiale);
        } else {
            return false;
        }
    }
}
