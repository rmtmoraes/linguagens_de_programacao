// Dado:
// String[] nomes = {
// 	"Letsgo Daqui Silva",
// 	"César Teio",
// 	"Bispo de Paris",
// 	"Antônio Morrendo das Dores",
// 	"Rolando Escada Abaixo Santos",
// 	"Amazonas Rio do Brasil Pimpão",
// 	"Amin Amou Amado Pinto",
// 	"Amado Amoroso",
// 	"Inocêncio Coitadinho",
// 	"Maria Privada de Jesus",
// 	"Zélia Tocafundo Pinto"
// };

// Verifique se `"Bispo de Paris"` está presente.

// Resultado esperado: Nome encontrado!

public class Main {
    public static void main(String[] args){
        String[] nomes = {"Letsgo Daqui Silva",
         "César Teio",
         "Bispo de Paris",
         "Antonio Morrendo Das Dorres",
         "Rolando Escada Abaixo Santos",
         "Amazonas Rio Do Brasil Pimpão",
         "Amim Amou Amado Pinto",
         "Amado Amoroso",
         "Inocencio Coitadinho",
         "Maria Privada De Jesus",
         "Zélia Tocafundo Pinto"
        };
        for (String aluno : nomes){
            if (aluno == "Bispo de Paris"){
                System.out.println(aluno);
            }
        }

    }
    
}
