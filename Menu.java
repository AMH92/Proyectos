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

        System.out.println("*****************Bienvenido*****************");
        System.out.println("********************************************");
        System.out.println("");
        System.out.print("Por favor, indica el total de comensales (máximo 10): ");
        int comensales = eleccion.nextInt();
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
                    case 1 -> {
                        System.out.println("Elegiste la opción " + tM);
                        System.out.println("");
                    for (String ordinario1 : ordinario) {
                        System.out.println(ordinario1);
                    }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                    }

                    case 2 -> {
                        System.out.println("Elegiste la opción " + tM);
                    for (String vegetariano1 : vegetariano) {
                        System.out.println(vegetariano1);
                    }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                    }

                    case 3 -> {
                        System.out.println("Elegiste la opción " + tM);
                    for (String bebida : bebidas) {
                        System.out.println(bebida);
                    }
                        System.out.println("");
                        System.out.print("Elige la opción de tu preferencia: ");
                        eleccion.nextLine();
                        mesa[i] = eleccion.nextLine();
                        System.out.println("");
                    }

                    case 4 -> {
                    }

                    default -> System.out.println("La selección no es válida");
                }
            } while (tM < 1 || tM > 4);
        }

        System.out.println("Este es el resumen de tu pedido:");
        for (int i = 0; i < comensales; i++) {
            System.out.println("Pedido #" + (i + 1) + ": " + mesa[i]);
        }
        
    }

}