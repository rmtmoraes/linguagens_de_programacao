//crie um programa contendo uma função que irá receber um valor inteiro
//o programa deverá exibir se o valor é: menor que zero, igual a zero ou maior que zero

    public class Main {
        static void validaValor(int valor) {
        if (valor < 0) 
            System.out.println("menor que zero" );

        if (valor == 0) 
            System.out.println("igual a zero");

        if (valor > 0) 
            System.out.println("maior que zero");
        }
    public static void main(String[] args) {
        validaValor(5);
        }
    }
    



// crie um programa contendo uma funcao que irá receber o nome do aluno e uma nota.
// caso a nota seja >7, deverá exibir que o aluno está aprovado, senão exibir reprovado
