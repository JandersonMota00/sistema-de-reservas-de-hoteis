import java.util.ArrayList;

public class Hotel {
    private String nome;
    ArrayList<Quarto> quartos;
    
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public ArrayList<Quarto> getQuartos() {
      return quartos;
    }
    public void setQuartos(ArrayList<Quarto> quartos) {
      this.quartos = quartos;
    }
}
