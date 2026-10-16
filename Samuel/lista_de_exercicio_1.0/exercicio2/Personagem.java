public class Personagem{
    //Características
    String nome;
    int vida;
    //Tipo[] tipo; também daria certo.
    List<Tipo> tipo;
    List<Poder> poder;
    //Método Construtor
    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);

    }

    //Funções setters e getters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }
    public static void main(String[] args){

        Personagem personagem_1 = new Personagem("Aquiles", 100, "Guerreiro", "Super soco");
        Personagem personagem_2 = new Personagem("Homem aranha", 100, "Super heroi", "Lançar teia");

        List<Personagem> personagens;
        personagens.add(personagem_1);
        personagens.add(personagem_2);
        }
        for (Personagem persona : personagens){
            System.out.println("Nome: " +)
        }

    }
}