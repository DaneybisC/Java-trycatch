import java.util.Scanner;

public class App {
    public static int cociente(int num1, int num2){
        int resultado = num1/num2;
        return resultado;
    }
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int contador = 1;

        boolean continuar = true;

        int contador2 = 3;
      
        do {
            try {
               System.out.println("Solo tiene "+contador2+ " intento/s.");
               System.out.println("");
               System.out.println("Ingrese un numerador entero:");
               int num1 = leer.nextInt();
               System.out.println("Ingrese un denominador entero:");
               int num2 = leer.nextInt();
               System.out.println(cociente(num1, num2));

               continuar = false;
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Este es el intento: "+contador);
                System.out.println("");
            }
            contador2 --;
            contador ++;
          
            if (contador == 4) {
                continuar = false;
                System.out.println("");
                System.out.println("Ese era el último intento, Gracias por utilizar la app!");
            } 
        } while (continuar);
 
        leer.close();
    }
}
