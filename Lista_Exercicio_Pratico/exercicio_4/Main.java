public class Main {
    public static void main(String[] args) {
        int num1 = 70; 
        int num2 = 990;
        int num3 = 30;
            if (num1 > num2 && num1 > num3) {
                System.out.println("O numero " + num1 + " e o maior");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("O numero " + num2 + " e o maior");
            } else {
                System.out.println("O numero " + num3 + " e o maior");
            }            
        }    
}
