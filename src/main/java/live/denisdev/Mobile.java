package live.denisdev;

public class Mobile {
    private double peso;
    private double altezza;

    public Mobile(double peso, double altezza) {
        this.peso = peso;
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Mobile [altezza=" + altezza + ", peso=" + peso + "]";
    }
}
