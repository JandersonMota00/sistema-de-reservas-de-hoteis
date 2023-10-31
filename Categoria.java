import java.util.Objects;

public class Categoria {
    private String nomeDaCategoria;
    private Double preco;

    public Categoria(String nomeDaCategoria, Double preco) {
        this.nomeDaCategoria = nomeDaCategoria;
        this.preco = preco;
    }
    public String getnomeDaCategoria() {
        return nomeDaCategoria;
    }
    public Double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null  || getClass() != obj.getClass())
            return false;
        Categoria categoria = (Categoria) obj;
        return nomeDaCategoria.equals(categoria.nomeDaCategoria);
    }
}
