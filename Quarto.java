public class Quarto {
    private int id;
    private String quartos;
    private int quantDeDiarias;

    Categoria categorias;

    public Quarto(int id, String quartos, int quantDeDiarias) { //construtor
        this.id = id;
        this.quartos = quartos;
        this.quantDeDiarias = quantDeDiarias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuartos() {
        return quartos;
    }

    public void setQuartos(String quartos) {
        this.quartos = quartos;
    }

    public int getQuantDeDiarias() {
        return quantDeDiarias;
    }

    public void setQuantDeDiarias(int quantDeDiarias) {
        this.quantDeDiarias = quantDeDiarias;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }
}
