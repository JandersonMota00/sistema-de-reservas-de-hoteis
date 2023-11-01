public class Program {
    public static void main(String[] args) {
        ListaDeCategoria ltc1 = new ListaDeCategoria();
        ltc1.addCategoriaNaLista(new Categoria("Luxo", 1000.0));
        System.out.println(ltc1);

        ListaDeCategoria ltc2 = new ListaDeCategoria();
        ltc1.addCategoriaNaLista(new Categoria("Basico", 150.0));
        System.out.println(ltc2);
        



        /*
        ListaDeCategoria minhaCategoria = new ListaDeCategoria();
        Categoria c1 = new Categoria("Saseqwdq", 3.00);
        minhaCategoria.addCategoriaNaLista(c1);

        if(minhaCategoria.addCategoriaNaLista(new Categoria("Luxo", 5.60))){
            System.out.println("Casdastro feito co sucesso");
            if(minhaCategoria.addCategoriaNaLista(new Categoria("Luxo", 5.60))){
                System.out.println("Casdastro feito com sucesso");
            }
            else{
            System.out.println(minhaCategoria.toString());
        }
        }
        else{
            System.out.println(minhaCategoria.toString());
        }
        minhaCategoria.addCategoriaNaLista(new Categoria("Basico", 2.00));
        minhaCategoria.addCategoriaNaLista(new Categoria("Luxo", 1.50));
        */
    }
}
