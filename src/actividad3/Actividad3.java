/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;
import java.util.Scanner;

public class Actividad3 {
    
    // CONTROL GENERAL DEL PROGRAMA
     
    public static void main(String[] args) {
    
    Encabezado();
    Cuerpo();
    Scanner sc = new Scanner(System.in);
        System.out.println("SELECCIONA UNO DE LOS 7 EJERCICIOS ESCRIBIENDO SU NÚMERO ASIGNADO: \nSuma del 1 al 10              (1) \nFactorial del 1 al 10         (2) \nFactorial introducido         (3) \nMedia de la suma              (4) \nSuma, promedio y distancia    (5) \nArreglo días de la semana     (6) \nArreglo juego del gato        (7)");  
        ejercicios = sc.nextInt();
        Seleccion(ejercicios);
    Pie();  
    
    }
    
    // SWITCH PARA SELECCIONAR EL EJERCICIO
    
     public static void Seleccion(int ejercicios){
        
            switch (ejercicios) {
            case 1:
                Suma0al0();
                break;
            case 2:
                Factorial0al0();
                break;
            case 3:
                FactorialUsuario();
                break;
            case 4:
                Mediadesuma();
                break;
            case 5:
                NumeroSumaPromDist();
                break;
            case 6:
                ArregloSemana();
                break;
            case 7:
                ArregloJuegoGato();
                break;
            default:
            System.out.println("Escribe un número que sea correcto:");   
                break;    
            }
            
   
    }
            
    // VARIABLES
    
    public static int x;
    public static int ejercicios;
    public static double suma;
    public static int factorial = 1;
    public static double media;
    public static char[][] juegogagato = new char[3][3];
   
    // ENCABEZADO
    
    public static void Encabezado(){
    
        System.out.println("-----------------------------------------------------");  
        System.out.println("         UNIVERSIDAD AUTÓNOMA DE CAMPECHE            ");
        System.out.println("              Facultad de Ingeniería           ");
        System.out.println("      Ingeniería en Sistemas Computacionales   ");
        System.out.println("-----------------------------------------------------"); 
        
        }
    
    
    // CUERPO
    
    public static void Cuerpo(){
    
 
        System.out.println("              Lenguaje de programación I             "); 
        System.out.println("-----------------------------------------------------");
        System.out.println("        Alumno: Johnny Abjomar Heredia Reveles       ");
        System.out.println("-----------------------------------------------------");
        
    }
    
    // PIE
    
    public static void Pie(){
    
        System.out.println("-----------------------------------------------------");
        System.out.println("                                           ABRIL 2021"); 
    
    }
    
    // 1. Imprimir la suma consecutiva del 0 al 10.
    
    public static void Suma0al0(){
         
        System.out.println("Imprimir la suma consecutiva del 0 al 10:"); 
        for (int i = 0; i <= 10; ++i) {
        x += i;
        System.out.println(x);
        }
    
    }
    
    // 2. Calcular el factorial del 1 al 10.
    
    public static void Factorial0al0() {
         
        System.out.println("Calcular el factorial del 1 al 10:");   
        for (int i = 1; i <= 10; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
    
    // 3. Calcular el factorial de un número introducido por el usuario.
    
    public static void FactorialUsuario() {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular el factorial de un número introducido por el usuario:");
        System.out.println("Dime un número");
        x = sc.nextInt();
        for (int i = 1; i <= x; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
    
    // 4. Calcular la media de la suma del 0 hasta el número introducido por el usuario.
    
    public static void Mediadesuma() {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular la media de la suma del 0 hasta el número introducido por el usuario:");
        System.out.println("Dime un número");
        x = sc.nextInt();
        for (int i = 1; i <= x; ++i) {
        suma += i;    
        }
        media = suma / x;
        System.out.println(media);
}
    
      // 5. Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio y determinar cual número introducido es el mayor y el menor, y la distancia numérica entre ellos.
    
    public static void NumeroSumaPromDist() {
         
        System.out.println("Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio y determinar cual número introducido es el mayor y el menor, y la distancia numérica entre ellos:");   
        System.out.println("Dime alguna cantidad de números ");
        
        Scanner  entrada = new Scanner(System.in);
        int cantidad = entrada.nextInt();
        int arreglo[] = new int[cantidad];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Dime el número " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        } 
       
        int num_Mayor = arreglo[0];
        int num_Menor = arreglo [0];
        int suma = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > num_Mayor) {
                num_Mayor = arreglo[i];
            } else if (arreglo[i] < num_Menor) {
                num_Menor = arreglo[i];
            }
            
            suma += arreglo[i];
        }
        
        float total = suma;
        float media = total / cantidad;
        int distancia_Num = num_Mayor - num_Menor;
        
        System.out.println("La cantidad de números introducidos fue " + cantidad);
        System.out.println("La suma de los números es " + suma);
        System.out.println("La media es " + media);
        System.out.println("El número mayor es " + num_Mayor);
        System.out.println("El número menor es " + num_Menor);
        System.out.println("La distancia numérica es " + distancia_Num);
}
    
     // 6.  Imprima un arreglo que tenga los nombres de los días de la semana.
    
    public static void ArregloSemana() {
        
       System.out.println("Imprima un arreglo que tenga los nombres de los días de la semana:"); 
       String[] semana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
       for (String i:semana){
           x += 1;
        System.out.println("Dia " + x + ": " + i);
       }
}
    
       // 7. Imprima un arreglo de 2 dimensiones de 3x3 que dibuje el modelo del juego del gato.
    
    public static void ArregloJuegoGato() {
        
        System.out.println("Imprima un arreglo de 2 dimensiones de 3x3 que dibuje el modelo del juego del gato:");
        String [] juegogato = new String[9];
            juegogato[0] = "0,0";
            juegogato[1] = "0,1";
            juegogato[2] = "0,2";
            juegogato[3] = "1,0";
            juegogato[4] = "1,1";
            juegogato[5] = "1,2";
            juegogato[6] = "2,0";
            juegogato[7] = "2,1";
            juegogato[8] = "2,2";
        
        for (int z = 0; x < 3; x++) {
            System.out.print(" | " + juegogato[x] + " | ");

        }
        
        System.out.println();
        
        for (int z = 3; x < 6; x++) {
            System.out.print(" | " + juegogato[x] + " | ");
        
        }
        
        System.out.println();
        
        for (int z = 6; x < 9; x++) {
            System.out.print(" | " + juegogato[x] + " | ");
        
        }
        System.out.println();
        
        }
    
}

        
    
