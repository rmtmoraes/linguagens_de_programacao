// Dado: double[] notas = { 7.5, 4.0, 8.5, 5.5, 9.0, 3.5 };

// Para cada nota, mostre:

// // maior que 7 aprovado
// // menor que 5 reprovado
// 7.5 → Aprovado
// 4.0 → Recuperação
// 8.5 → Aprovado
// 5.5 → Recuperação
// 9.0 → Aprovado
// 3.5 → Reprovado

// Utilize `for-each`.

public class Main {
    public static void main(String[] args){
        double[] notas = {7.5, 4.0, 8.5, 5.5, 9.0, 3.5};
        for (double nota : notas){
            if (nota > 7){
                System.out.println("O aluno esta aprovado com nota " + nota);
            }
            if (nota < 5){
                System.out.println("O aluno esta reprovado com nota " + nota);
            }
            if (nota > 5 && nota < 7){
                System.out.println("O aluno esta de recuperação com nota " + nota);
            }
        }
    }
    
}
