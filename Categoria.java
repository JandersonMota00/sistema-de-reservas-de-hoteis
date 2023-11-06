public class Categoria {
    private String nomeDaCategoria;
    private static Double preco;

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
            if (obj instanceof Categoria) {
                // transforma OBJ da classe Object, na classe Categoria.
                Categoria categoriaAuciliar = (Categoria) obj; //typecast
                return this.getNomeDaCategoria().equals(categoriaAuciliar.getNomeDaCategoria());
            }
        }
        if (obj == null  || getClass() != obj.getClass()) {
            return false;
        }
        return false;
    }
}
