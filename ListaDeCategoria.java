import java.util.ArrayList;

public class ListaDeCategoria {
    private ArrayList<Categoria> lista;

    public ListaDeCategoria() { //construtor
        this.lista = new ArrayList<>();
    }

    public ArrayList<Categoria> getLista() {
        return lista;
    }

    public boolean addCategoriaNaLista(Categoria categoria) {
        if (!lista.contains(categoria)){
            getLista().add(categoria);
            return true;
        }
        //toString();
        return false;
    }

    @Override
    public String toString() {
        return "Categoria: " + getLista();
    }
}
