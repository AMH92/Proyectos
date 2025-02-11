import java.util.Scanner;
public class Menu{
    public static void main(String args[]){

        Scanner eleccion = new Scanner(System.in);

        String ordinario[] = new String[3];
        ordinario[0] = "1. Pechuga de pollo";
        ordinario[1] = "2. Arrachera";
        ordinario[2] = "3. Filete de pescado";

        String vegetariano[] = new String[3];
        vegetariano[0] = "4. Ensalada";
        vegetariano[1] = "5. Sopa miso";
        vegetariano[2] = "6. Verduras al vapor";

        String bebidas[] = new String[3];
        bebidas[0] = "7. Limonada";
        bebidas[1] = "8. Café";
        bebidas[2] = "9. Té";

        int comensales = 0; //total de comensales

        System.out.println("*****************Bienvenido*****************");
        System.out.println("********************************************");
        System.out.println("");
        System.out.print("Por favor, indica el total de comensales (máximo 10): ");
        comensales = eleccion.nextInt();
        while(comensales > 10) { 
            System.out.print("La selección supera el máximo de personas por mesa, por favor intentalo de nuevo: ");
            comensales = eleccion.nextInt();
            System.out.println("");
            }
        
        int tM = 0; //indica que accion desea realizar
        String mesa[] = new String[comensales]; //almacena los pedidos
        for (int i = 0; i < comensales; i++) {
            do { 
                System.out.println("Pedido #" + (i + 1) + " por favor selecciona una opción:");
                System.out.println("1. Menú ordinario");
                System.out.println("2. Menú vegetariano");
                System.out.println("3. Bebidas");
                System.out.println("4. Cancelar");
                tM = eleccion.nextInt();
                switch (tM) {
                    case 1:
                        System.out.println("Elegiste la opción " + tM);
                        System.out.println("");
                        for (int j = 0; j < ordinario.length; j++) {
                            System.out.println(ordinario[j]);                            
                        }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Elegiste la opción " + tM);
                        for (int j = 0; j < vegetariano.length; j++) {
                            System.out.println(vegetariano[j]);                            
                        }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Elegiste la opción " + tM);
                        for (int j = 0; j < bebidas.length; j++) {
                            System.out.println(bebidas[j]);                            
                        }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("La selección no es válida");
                }
            } while (tM < 1 || tM > 4);
        }

        System.out.println("Este es el resumen de tu pedido:");
        for (int i = 0; i < comensales; i++) {
            System.out.println("Pedido #" + (i + 1) + ": " + mesa[i]);
        }
        
    }

}