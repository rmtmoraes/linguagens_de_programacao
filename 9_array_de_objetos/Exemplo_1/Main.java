public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Fiat", "Uno");
        Veiculo carro2 = new Veiculo("BYD", "Compact 2026");
        Veiculo carro3 = new Veiculo("Honda", "Civic");
        Veiculo carro4 = new Veiculo("Gurgel", "Gurgel 1960");

//        System.out.println("Carro 1: " + carro1.marca);
        Veiculo[] estacionamento = {carro1, carro2, carro3, carro4};

        for (Veiculo item: estacionamento){
            System.out.println("Marcas: " + item.marca);
            System.out.println("Modelo: " + item.modelo);
        }
    }    
}
