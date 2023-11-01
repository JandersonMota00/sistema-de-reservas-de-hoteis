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
        if (pesquisarCategoria(categoria)){
            getLista().add(categoria);
            return true;
        } 
        return false;
    }
    private boolean pesquisarCategoria (Categoria categoria) {
        for (int i = 0; i < getLista().size(); i++) {
            if(getLista().get(i).getNomeDaCategoria().equals(categoria.getNomeDaCategoria())){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Já existe!";
    }
}
