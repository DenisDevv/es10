package live.denisdev;

public class ArrayGenerico<T> {
    @SuppressWarnings("unchecked")
    private T[] lista = (T[]) new Object[5];
    public void add(T o) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = o;
                break;
            }
        }
    }
    public String stampa() {
        StringBuilder s = new StringBuilder();
        for (T t : lista) {
            if (t != null) {
                s.append(t).append(" ");
            }
        }
        return s.toString();
    }
}
