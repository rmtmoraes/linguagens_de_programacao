
public class Main {
    public static void main(String[] args) {
 //    String saudacao = "Hello Word!";
 //    System.out.println(saudacao.length()); //contagem de caracteres
 //    System.out.println(saudacao.toUpperCase()); //letra maiuscula  
 //    System.out.println(saudacao.toLowerCase()); //letra minuscula
 //    System.out.println(saudacao.indexOf("W")); //busca posicao da letra   
 //    System.out.println(saudacao.charAt(6)); //busca letra na posicao   
 //   }

        //Estamos usando o padrão snake_case
        String aluno_1 = "Miranata";
        String aluno_2 = "Aeronauta";
        System.out.println(aluno_1.equals(aluno_2)); // compara

        String mensagem = " Hello Word ";
        System.out.println("-" + mensagem.trim() + "-"); //remove espaços e inclui traço
        
        String nome = "Savalo";
        String sobrenome = "Horse";
        System.out.println(nome + " " + sobrenome);

        String aluno_3 = "Pombinha da Paz Silva";
        System.out.println(aluno_3.contains("Paz")); //contém algo na string

        String aluno_4 = "";
        System.out.println(aluno_4.isEmpty()); //valida se string está vazia

        String frutas = String.join("-", "Laranja", "Banana"); //junta as strings com "-"
        System.out.println(frutas);

        String nome_completo = "Del Lokom Pirom";
        System.out.println(nome_completo.replace("m", "n")); //substitui algo na string

        String texto = "Boa noite!";
        System.out.println(texto.substring(4, 9));

        String frase = "Repetição com \"Correção\" leva a \"Perfeição\""; // insere barra dentro da string (caracteres especiais)
        System.out.println(frase);

    }
}