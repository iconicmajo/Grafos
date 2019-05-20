/**
 * Maria José Castro Lemus 
 * 181202
 * Estructura de datos 
 * Seccion 60
 * HT9
 */

/**
 * @author Majo!
 *Esta clase fue extraida del libro java Structures 
 *y modificada junto con codigo de https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/ 
 *y tambien de https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Ap%C3%A9ndices/Implementaci%C3%B3n_del_algoritmo_de_Floyd_en_Java
 */
public class Algoritmo {
	 protected  Double[][] distancias ; 
	
	public void floyd()
    {
        int n=distancias.length;
        Double D[][]=distancias;

        String enlaces[][]=new String [n][n];
        String[][] aux_enlaces=new String[distancias.length][distancias.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                enlaces[i][j]="";
                aux_enlaces[i][j]="";
            }
        }
        String enl_rec="";
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Double aux=D[i][j];
                    Double aux2=D[i][k];
                    Double aux3=D[k][j];
                    Double aux4=aux2+aux3;
                    Double res=Math.min(aux,aux4);
                    if(aux!=aux4)
                    {
                        if(res==aux4)
                        {
                            enl_rec="";
                            aux_enlaces[i][j]=k+"";
                            enlaces[i][j]=enlaces(i,k,aux_enlaces,enl_rec)+(k+1);
                        }
                    }
                    D[i][j]=(Double) res;
                }
            }
        }
        distancias=D;
    }
    
    /**
     * @param i
     * @param k
     * @param aux_enlaces
     * @param enl_rec
     * @return
     */
    public String enlaces(int i,int k,String[][] aux_enlaces,String enl_rec)
    {
        if(aux_enlaces[i][k].equals(""))
        {
            return "";
        }
        else
        {
            enl_rec+=enlaces(i,Integer.parseInt(aux_enlaces[i][k].toString()),aux_enlaces,enl_rec)+(Integer.parseInt(aux_enlaces[i][k].toString())+1)+" , ";
            return enl_rec;
        }
    }

}
