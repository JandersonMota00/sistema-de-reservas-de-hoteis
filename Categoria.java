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
    public void setNomeDaCategoria(String nomeDaCategoria) {
        this.nomeDaCategoria = nomeDaCategoria;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            if (obj instanceof Categoria) {
                // transforma OBJ da classe Object, na classe Categoria.
                Categoria categoriaAuciliar = (Categoria) obj; //typecast
                return this.getnomeDaCategoria().equals(categoriaAuciliar.getnomeDaCategoria());
            }
        }
        if (obj == null  || getClass() != obj.getClass()) {
            return false;
        }
        return false;
    }
}
