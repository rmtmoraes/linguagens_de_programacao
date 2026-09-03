public class Main {
    public static void main (String[] args) {
        // String [] alunos = {"Miranata", "Savalo", "Aeronauta", "Joao", "Maria"};

        // alunos[4] = "Mariazinha";
        // System.out.println("Qtde de Alunos: " + alunos.length); //lenght conta itens na lista

        // for (String estudante : alunos){
        //     System.out.println(estudante);
        // }

// crie uma lista com 5 produtos
// exiba cada produto utilizando foreach e também for

        // String [] produtos = {"Produto1", "Produto2", "Produto3", "Produto4", "Produto5"};
        //     System.out.println("Qtde de Produtos: " + produtos.length);
            
        //     for (String prod : produtos){
        //         System.out.println(prod);
        //     }


// crie um array contendo 5 numeros
// use foreach para exibir se cada numero e positivo, negativo ou igual a zero
    
        int [] num = {10, 20, -30, 40, -50};
//            System.out.println("Qtde de Produtos: " + produtos.length);
        for (int numero : num){
            if (numero < 0)
                System.out.println("O valor de " + numero + " e negativo");
            if (numero == 0)
                System.out.println("O valor de " + numero + " e zero");
            if (numero > 0)
                System.out.println("O valor de " + numero + " e positivo"); 
        }       
    }
}
