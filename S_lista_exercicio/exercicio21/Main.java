
public class Main {
    public static void main (String[] args){
        double[] salarios = {1800, 2500, 3200, 4500, 7000};
        double aumento;
        for (double salario : salarios){
            aumento = salario*0.10+salario;
            System.out.println("O salario acrescido de 10% eh: " + aumento);
        }
    }
    
}
