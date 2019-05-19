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
       // Node<Association<String,String>> nuevoNodo;
       // BinaryTree<Node<Association<String, String>>> bst = new BinaryTree<>(); //se crea nuevo arbol null

        Scanner teclado = new Scanner(System.in);

        try {
            while ((line=br.readLine())!=null) {
                String Departamento1;
                String Departamento2;
                String Distancia;
                sb.append(line);
                sb.append(System.lineSeparator()); 
                line = line + " "; 
                for(int i=1;i<line.length();i++){
                    
                    String iter = line.substring((i-1), i); 
                    if(iter.equals(" "))
                    {
                        Departamento2 = line.substring(i, line.length()-1).toLowerCase(); 
                        System.out.println(Departamento2);
                        //obtengo la subcadena luego de " "
                        Departamento1 = line.substring(0, i-1).toLowerCase(); 
                        System.out.println(Departamento1);
                        //se obtiene la subcadena antes de " " 
                        //Distancia = line.substring(0, i-1).toLowerCase(); 
                      //  nuevoNodo = new Node<>(palabraIngles, palabraEspanol); 
                        //se crea el "nodo" que se pondrá en el tree
                      //  bst.insert(nuevoNodo); 
                        //se agrega el nodo al arbol
                    }
                }
            }
            System.out.println("------Imprimir Diccionario-----");
            System.out.println("************IN ORDER*********");
         //   bst.inorder();
        }
        finally{
            //br.close();
        }
        
        //Traduccion del documento.
        
     /*   File archivo = new File ("texto.txt");

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
            resultado += bst.search(word) + " ";

        }

        System.out.println("----------------------------------------");
        System.out.println("***************TRADUCIR****************");
        System.out.println(resultado);
     */   
    }
	}


