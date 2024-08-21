import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String palabraScreta = "inteligencia";
        int intentosMaximos = 5;
        int intentos = 0;
        boolean palabraCorrecta = false;

        //arreglo de caracteres que sera igual al tamaño la palabra 
        char[] letrasAdivinadas = new char[palabraScreta.length()];

        //buble para pintar los guiones de la palabra 
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

        //bucle de funcionamiento 
        while (!palabraCorrecta && intentos < intentosMaximos) {
            System.out.println("palabra a adivinar:" + String.valueOf(letrasAdivinadas));
            
            System.out.println("introduce una letra");
            
            //scanner con validacionde letra 
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            //bucle de iteracion para buscar la letra ingresada en el string 
            for (int i = 0; i < palabraScreta.length(); i++) {
                //condicional que compara la letra ingresada con cada caracter del string
                if (palabraScreta.charAt(i) == letra ) {
                    letrasAdivinadas[i] =letra;
                    letraCorrecta = true;
                }
            }

             if(!letraCorrecta){
                intentos ++;
                System.out.println("incorrecto te quedan " + (intentosMaximos - intentos) + " intentos");
             }

             //comparacion del arreglo de caracteres con el string conla palabra secreta 
             if(String.valueOf(letrasAdivinadas).equalsIgnoreCase(palabraScreta)){
                palabraCorrecta = true;
                System.out.println(" Ganaste la palabra era " + palabraScreta);
             }

        }
        if(!palabraCorrecta){
            System.out.println("perdiste");
        }
        scanner.close();
    }
}
