public class Main {
//    int x = 5;
    public static void main(String[] args) {
        Personagem persona = new Personagem();
        persona.nome = "Pateta";
        persona.idade = 42;
        persona.poder = 4;

        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
//        Main myObj = new Main();
//        Main myObj2 = new Main();
//        myObj.x = 10;
//        myObj2.x = 50;
//        System.out.println(myObj.x);
//        System.out.println(myObj2.x);
    }
}