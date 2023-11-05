import java.text.ParseException; //Sinaliza um erro foi atingido inesperademente (não corresponde a um formato ou padrão necessário do número ou data).
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Quarto {
    private int id;
    private String categoriaDoQuarto;
    private long dias;
    private String dataDaReservaEntrda;
    private String dataDaReservaSaida;

    public Quarto(int id, String categoriaDoQuarto, String dataDaReservaEntrda, String dataDaReservaSaida) {
        this.id = id;
        this.categoriaDoQuarto = categoriaDoQuarto;
        this.dataDaReservaEntrda = dataDaReservaEntrda;
        this.dataDaReservaSaida = dataDaReservaSaida;
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
    public long getDias() {
        LocalDate dataEntrada = LocalDate.of(getDataDaReservaEntrda());
        LocalDate dataSaida = LocalDate.of(getDataDaReservaSaida());
        
        this.dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);

        //long this.dias = dataEntrada.until(dataSaida, ChronoUnit.DAYS);
        return dias;
    }

    public String getDataDaReservaEntrda() {
       
        try {
            //Vai pegar a data que o usuario digitar neste formato "dd/MM/yyyy" em String.
            //Está em formato String, é preciso converter para DATE.
            SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy"); 
            
            //Vai converter na variavel do tipo Data
            Date dataDaReservaConvertidaParaDate = formatado.parse(this.dataDaReservaEntrda);
       

            //Vai converterar para qual quer formato de data que desejar
            this.dataDaReservaEntrda = (new SimpleDateFormat("dd/MM/yyyy").format(dataDaReservaConvertidaParaDate));
     
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
       

            //Vai converterar para qual quer formato de data que desejar
            this.dataDaReservaSaida = (new SimpleDateFormat("dd/MM/yyyy").format(dataDaReservaConvertidaParaDate));
     
        } catch (ParseException ex) {
            return "erro ao formatar a String na calasse Quarto -> dataDaReservaSaida";           
        }

        return dataDaReservaSaida;
    }

    public void setDataDaReservaSaida(String dataDaReservaSaida) {
        this.dataDaReservaSaida = dataDaReservaSaida;
    }

    public String toString() {
        return "ID: " + getId() + "\t\t Tipo do quarto: " + getCategoriaDoQuarto() + "\t\t Diarias: " + getDias() + "\t\t Data entrada: " + getDataDaReservaEntrda() + "\t Data saída: " + getDataDaReservaSaida();
    }
}
