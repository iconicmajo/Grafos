import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Maria José Castro Lemus 
 * 181202
 * Estructura de datos 
 * Seccion 60
 * HT9
 */

/**
 * @author Majo!
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * Clase extraida y modificada a conveniencia de www.geeksforgeeks.org
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("guategrafo.txt"));    
        StringBuilder sb = new StringBuilder();
        String line;
       
        Scanner teclado = new Scanner(System.in);

        try {
            while ((line=br.readLine())!=null) {
                String Departamento1;
                String Departamento2;
                String Distancia;
                int a = line.indexOf(" ");
                int o = line.lastIndexOf(" ");
               // System.out.println(a+" "+o);
              
                  Distancia =line.substring(o+1).trim();
                  System.out.println(Distancia);
                  Departamento2 =line.substring(o-a,o+1).trim();
                  System.out.println(Departamento2);
                  Departamento1 = line.substring(0,a+1).trim();
                  System.out.println(Departamento1);
                    
             
            }
            System.out.println("**********************************");
            System.out.println("-------GUATEMALA Y DISTANCIAS-----");
            System.out.println("**********************************");
            System.out.println("       Elija una opcion    ");
            System.out.println("1. Buscar por ciudad");
            System.out.println("2. Ver el centro del grafo y matriz");
            System.out.println("3. Modificar grafo ");
            System.out.println("4. Salir ");
            System.out.println(" ");
            int op = teclado.nextInt();
			teclado.nextLine();
			while (op !=5) {
            if (op == 1){
            	System.out.println("Ingrese la ciudad de origen");
            	String ciudad1= teclado.nextLine();
            	ciudad1.toLowerCase();
            	System.out.println("Ingrese la ciudad de destino");
            	String ciudad2= teclado.nextLine();
            	ciudad2.toLowerCase();
            }
            if (op == 2) {
            	System.out.println("La ciudad central del grafo es: " + "aqui va la impresion de la matriz");
            }
            if (op == 3) {
            	System.out.println("Que desea modiciar?");
            	System.out.println("1. Nueva ruta");
                System.out.println("2. Eliminar ruta");
                int op3 = teclado.nextInt();
        		teclado.nextLine();
                if (op3==1) {
                	System.out.println("Ingrese la ciudad de partida");
                    System.out.println("Ingrese la ciudad destino");
                    System.out.println("Ingrese la distancia ");
                    System.out.println(" ");
                }
                if (op3==2) {
                	System.out.println("Ingrese la ciudad de partida");
                    System.out.println("Ingrese la ciudad destino");
                   
                }
                else {
                	System.out.println("Ingerse una opcion del menu");
                	op3 = teclado.nextInt();
					teclado.nextLine();
				}
            }
            if (op ==4) {
            	System.out.println("Adios");
            	break;
            }
            else {
            	System.out.println("Ingrese una opción del menu");
            	op = teclado.nextInt();
				teclado.nextLine();
			}   
	}
                
        }
        finally{
            br.close();
        }

        
        //Traduccion del documento.
        
       File archivo = new File ("guategrafo.txt");

        FileReader fr = new FileReader (archivo);
        BufferedReader br1 = new BufferedReader(fr);
        String linea = "";
        Scanner scanner = new Scanner(fr);
        String palabra = "";
        
        while (scanner.hasNextLine()) {
            linea += scanner.nextLine();
            palabra = linea.replaceAll("\n", " ");
        }
        fr.close();
        br1.close();
        
        String palabras[] = palabra.split(" ");
        System.out.println(palabras);
        
       // BinaryTree<Node<Association<String, String>>> bt = new BinaryTree<>();
        
        String resultado = "";

        String word;
        for(String p: palabras){
            word = p.toLowerCase();
           // resultado += bst.search(word) + " ";

        }

        System.out.println("----------------------------------------");
        
           
    }
	}


