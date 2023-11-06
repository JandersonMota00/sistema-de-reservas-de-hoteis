public class Program {
    public static void main(String[] args) {
        /*
        ListaDeCategoria ltc1 = new ListaDeCategoria();
        ltc1.addCategoriaNaLista(new Categoria("Luxo", 1000.0));
        System.out.println(ltc1);

        ListaDeCategoria ltc2 = new ListaDeCategoria();
        ltc2.addCategoriaNaLista(new Categoria("Basico", 150.0));
        System.out.println(ltc2);
        */

        Hotel h = new Hotel();
        ListaDeCategoria ltc1 = new ListaDeCategoria();

        Categoria c1 = new Categoria("Basico", 200.0);
        System.out.println(c1.getNomeDaCategoria());

        Categoria c2 = new Categoria("Suíte", 600.0);
        System.out.println(c2.getNomeDaCategoria());

        Categoria c3 = new Categoria("Luxo", 900.0);
        System.out.println(c3.getNomeDaCategoria());

        //Comparando Categoria se são iguais
        System.out.println(c1.getNomeDaCategoria().equals(c3.getNomeDaCategoria()));

        System.out.println(ltc1.toString());

        /*Criar um 'ArrayList<>' para 'Quartos' nessa classe 'main' e depois usar para rastrear quartos disponíveis.*/
        Quarto q1 = new Quarto(1, c1.getNomeDaCategoria());
        Quarto q2 = new Quarto(2, c2.getNomeDaCategoria());
        Quarto q3 = new Quarto(3, c3.getNomeDaCategoria());

        q1.setDataDaReservaEntrda("03/10/2023");
        q1.setDataDaReservaSaida("04/10/2023");

        System.out.println("TESTE: ");
        System.out.println("Entrada: " + q1.getDataDaReservaEntrda() + " || Saida: " + q1.getDataDaReservaSaida() + " || Diferença: " + q1.getDiferencaDeDias());

        System.out.println("\nQuarto");
        System.out.println("ID: " + q1.getId() + "\t\tCategoria: " + q1.getCategoriaDoQuarto());
        System.out.println("ID: " + q2.getId() + "\t\tCategoria: " + q2.getCategoriaDoQuarto());
        System.out.println("ID: " + q3.getId() + "\t\tCategoria: " + q3.getCategoriaDoQuarto());
        
        //O sistema deve rastrear a disponibilidade de quartos.
        //if(q1.getDataDaReservaEntrda() == null) {
            System.out.println("Quarto disponível");
            System.out.println("ID: " + q1.getId() + "\t\tCategoria: " + q1.getCategoriaDoQuarto());
        //}

        System.out.println("Hotel: " + h.getQuartos());

        //O sistema deve calcular o preço total da reserva com base na categoria do quarto e no número de noites.
        System.out.println(q1.toString());
    }
}
