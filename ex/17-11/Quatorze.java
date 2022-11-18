public class Quatorze {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[51];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (i != 50){
                System.out.print(numeros[i] + ", ");
            }
            if(i == 50) {
                System.out.print(numeros[i] + ". ");
            }
        }
    }
}