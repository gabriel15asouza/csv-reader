import java.util.ArrayList;

public class CSV {

    private ArrayList<Person> minhaLista;

    public CSV(ArrayList<Person> minhaLista) {
        this.minhaLista = minhaLista;
    }

    public ArrayList<Person> getMinhaLista() {
        return minhaLista;
    }

    public void setMinhaLista(ArrayList<Person> minhaLista) {
        this.minhaLista = minhaLista;
    }

    public void adicionarElemento(Person x) {
        this.minhaLista.add(x);
    }
}
