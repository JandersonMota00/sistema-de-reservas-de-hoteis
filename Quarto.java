import java.text.ParseException; //Sinaliza um erro foi atingido inesperademente (não corresponde a um formato ou padrão necessário do número ou data).
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Quarto {
    private int id;
    private String categoriaDoQuarto;
    //private int diferencaDeDias;
    private String dataDaReservaEntrda;
    private String dataDaReservaSaida;
    private int diaDaEntrada;
    private int mesDaEntrada;
    private int anoDaEntrada;
    private int diaDaSaida;
    private int mesDaSaida;
    private int anoDaSaida;

    //Categoria categoria;

    public Quarto(int id, String categoriaDoQuarto) {
        this.id = id;
        this.categoriaDoQuarto = categoriaDoQuarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoriaDoQuarto() {
        return categoriaDoQuarto;
    }

    public void setCategoriaDoQuarto(String categoriaDoQuarto) {
        this.categoriaDoQuarto = categoriaDoQuarto;
    }

    //Calcular a 'data de saida' - 'data de entrada' para informar a quantidade de diárias.
    //PESQUISAR
    public int getDiferencaDeDias() {
        LocalDate dataEntrada = LocalDate.of(this.anoDaEntrada, this.mesDaEntrada, this.diaDaEntrada);
        LocalDate dataSaida = LocalDate.of(this.anoDaSaida, this.mesDaSaida, this.diaDaSaida);

        //Calcula com base no diaDaEntrada, mês e anoDaEntrada.
        Period periodo = Period.between(dataEntrada, dataSaida);

        int diferencaDeDias = periodo.getDays();
        return diferencaDeDias;
    }

    public String getDataDaReservaEntrda() {
       
        try {
            //Vai pegar a data que o usuario digitar neste formato "dd/MM/yyyy" em String.
            //Está em formato String, é preciso converter para DATE.
            SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy"); 
            
            //Vai converter na variavel do tipo Data
            Date dataDaReservaConvertidaParaDate = formatado.parse(this.dataDaReservaEntrda);
       

            // Obtém o diaDaEntrada, mês e anoDaEntrada da data
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataDaReservaConvertidaParaDate);
            this.diaDaEntrada = calendar.get(Calendar.DAY_OF_MONTH);
            this.mesDaEntrada = calendar.get(Calendar.MONTH) + 1; // Os mesDaEntradaes em Java são baseados em zero (janeiro = 0)
            this.anoDaEntrada = calendar.get(Calendar.YEAR);

            dataDaReservaEntrda = diaDaEntrada + "/" + mesDaEntrada + "/" + anoDaEntrada;

        } catch (ParseException ex) {
            return "erro ao formatar a String na calasse Quarto -> dataDaReservaEntrda";           
        }
        
        return dataDaReservaEntrda;
    }

    public void setDataDaReservaEntrda(String dataDaReservaEntrda) {
        this.dataDaReservaEntrda = dataDaReservaEntrda;
    }

    public String getDataDaReservaSaida() {
        try {
            //Vai pegar a data que o usuario digitar neste formato "dd/MM/yyyy" em String.
            //Está em formato String, é preciso converter para DATE.
            SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy"); 
            
            //Vai converter na variavel do tipo Data
            Date dataDaReservaConvertidaParaDate = formatado.parse(this.dataDaReservaSaida);
       
            // Obtém o diaDaEntrada, mês e anoDaEntrada da data
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataDaReservaConvertidaParaDate);
            this.diaDaSaida = calendar.get(Calendar.DAY_OF_MONTH);
            this.mesDaSaida = calendar.get(Calendar.MONTH) + 1; // Os mesDaEntradaes em Java são baseados em zero (janeiro = 0)
            this.anoDaSaida = calendar.get(Calendar.YEAR);

            dataDaReservaSaida = diaDaSaida + "/" + mesDaSaida + "/" + anoDaSaida;
     
        } catch (ParseException ex) {
            return "erro ao formatar a String na calasse Quarto -> dataDaReservaSaida";           
        }

        return dataDaReservaSaida;
    }

    public void setDataDaReservaSaida(String dataDaReservaSaida) {
        this.dataDaReservaSaida = dataDaReservaSaida;
    }

    public boolean contains(Quarto quarto) {
        return false;
    }

    public void add(Quarto quarto) {
    }

    public void addCategoria() {
    }

    public String toString() {
        return "ID: " + getId() + "\t\t Tipo do quarto: " + getCategoriaDoQuarto() + "\t\t Diarias: " + getDiferencaDeDias() + "\t\t Data entrada: " + getDataDaReservaEntrda() + "\t Data saída: " + getDataDaReservaSaida() + "\nQuant. Diárias: " + getDiferencaDeDias() + "\t Total: " + Categoria.getPreco();
    }
}
