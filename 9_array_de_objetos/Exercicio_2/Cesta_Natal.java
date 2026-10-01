public class Cesta_Natal {
    public static void main(String[] args){
        Itens item1 = new Itens("Panetone", 10, 1111, 25);
        Itens item2 = new Itens("Chocotone", 20, 2222, 50);
        Itens item3 = new Itens("Refri", 30, 3333, 75);
        Itens item4 = new Itens("Cerveja", 40, 4444, 100);

        Itens[] tipo = {item1, item2, item3, item4};

        for (Itens descricao: tipo){
            System.out.println("\nCodigo: " + descricao.codigo);
            System.out.println("Nome: " + descricao.nome);
            System.out.println("Quantidade " + descricao.quantidade);
            System.out.println("Preco: " + descricao.preco);
        }

    }
    
}
