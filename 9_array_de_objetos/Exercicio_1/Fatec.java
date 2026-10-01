public class Fatec {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao da Silva", "joao@a.com");
        Aluno aluno2 = new Aluno("Maria da Silva", "maria@a.com");


//        System.out.println("Carro 1: " + carro1.marca);
        Aluno[] dados = {aluno1, aluno2};

        for (Aluno item: dados){
            System.out.println("Nome: " + item.nome);
            System.out.println("Email: " + item.email);
        }
    }    
}
