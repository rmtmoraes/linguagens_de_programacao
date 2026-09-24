public class Main {
        public static void main(String[] args) {
            Carro caracteristica = new Carro();
            caracteristica.marca = "Honda";
            caracteristica.modelo = "Civic";
            caracteristica.combustivel = "Flex";
            caracteristica.cor = "Prata";

            System.out.println("\n--CARRO--");

            System.out.println(caracteristica.marca);
            System.out.println(caracteristica.modelo);
            System.out.println(caracteristica.combustivel);
            System.out.println(caracteristica.cor);

            caracteristica.ligarMotor();
            caracteristica.desligarMotor();
            
            System.out.println("\n--MOTO--");
            
            Moto caracteristica_moto = new Moto();
            caracteristica_moto.marca = "Honda";
            caracteristica_moto.modelo = "CG";
            caracteristica_moto.combustivel = "Flex";
            caracteristica_moto.cilindradas = 150;

            System.out.println(caracteristica_moto.marca);
            System.out.println(caracteristica_moto.modelo);
            System.out.println(caracteristica_moto.combustivel);
            System.out.println(caracteristica_moto.cilindradas);

            caracteristica.ligarMotor();
            caracteristica.desligarMotor();

    }
}
