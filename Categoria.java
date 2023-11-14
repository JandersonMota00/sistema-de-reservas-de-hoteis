public class Categoria {
    private String nomeDaCategoria;
    private Double preco;

    Quarto quarto;
    
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
    public Double getPreco() {
        //Multiplicar 'preco' por 'quantidade de diarias'.
        return quarto.getDiferencaDeDias() * this.preco;
    }
    public Quarto getQuarto() {
        return quarto;
    }
    public void addQuarto(Quarto quarto) {
        if(!quarto.contains(quarto)) {
            quarto.add(quarto);
            quarto.addCategoria();
        }
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
