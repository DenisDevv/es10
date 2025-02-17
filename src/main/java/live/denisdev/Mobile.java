package live.denisdev;

public class Mobile {
    private double peso;
    private double prezzo;
    public Mobile(double peso, double prezzo) {
        this.peso = peso;
        this.prezzo = prezzo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Mobile [prezzo=" + prezzo + ", peso=" + peso + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Mobile) {
            Mobile m = (Mobile) o;
            return  m.getPrezzo() == prezzo;
        } else {
            return false;
        }
    }
}
