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

        Quarto[] q = new Quarto[10];
        ListaDeCategoria ltc1 = new ListaDeCategoria();

        Categoria c1 = new Categoria("Basico", 200.0);
        System.out.println(c1.getNomeDaCategoria());

        Categoria c2 = new Categoria("Suíte", 600.0);
        System.out.println(c2.getNomeDaCategoria());

        Categoria c3 = new Categoria("Luxo", 900.0);
        System.out.println(c3.getNomeDaCategoria());

        //Comparando Categoria se são iguais
        System.out.println(c1.getNomeDaCategoria().equals(c3.getNomeDaCategoria()));

        System.out.println(ltc1);

        for (int i = 0; i < 2; i++) {
            q[i] = new Quarto(i + 1, null, null, null);
        }

        //Quarto q1 = new Quarto(1, "Basico", "10/11/2023", "13/11/2023");
        //System.out.println(q1.getDataDaReservaEntrda() + " || " + q1.getDataDaReservaSaida());
        //System.out.println(q1.toString());

        for(int i = 0; i < 2; i++) {
            System.out.println(q[i].getId());
            System.out.println(q[i].getDataDaReservaEntrda());
        }
        
        //O sistema deve rastrear a disponibilidade de quartos.

        //O sistema deve calcular o preço total da reserva com base na categoria do quarto e no número de noites.

    }
}
