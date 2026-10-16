//Nome da classe é PascalCase
public class Tipo {
    //características
    String nome = "";

    //Método construtor
    public Tipo(String nome){
        this.nome = nome;
    }

    //Funções setters getters
    public void setNome(String nome){//"Set" é utilizado para alterar o nome, caso eu queira. Utilizo o void, pois essa função não me retorna nada, somente executa a ação de alterar o nome
        this.nome = nome;
    }
    public String getNome(String nome){//"Get" é utilizado para retornar a informação de classe. Utilizo o String pois, nesse caso, a função retornará o valor de classe
        return this.nome;
    }
    
}