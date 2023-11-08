public class Categoria {
    private String nomeDaCategoria;
    private Double preco;

    static Quarto quartos;
    
    public Categoria(String nomeDaCategoria, Double preco) {
        this.nomeDaCategoria = nomeDaCategoria;
        this.preco = preco;
    }
    public String getNomeDaCategoria() {
        return nomeDaCategoria;
    }
    public void setNomeDaCategoria(String nomeDaCategoria) {
        this.nomeDaCategoria = nomeDaCategoria;
    }
    public static Double getPreco() {
        //Multiplicar 'preco' por 'quantidade de diarias'.
        return (Integer) quartos.getDiferencaDeDias() * preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null  || getClass() != obj.getClass()) {
            return false;
        }
        Categoria categoria = (Categoria) obj; //typecast
        return nomeDaCategoria.equals(categoria.nomeDaCategoria);
    }
}
