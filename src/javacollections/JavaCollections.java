package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gaston
 */
public class JavaCollections 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<String> listaCaracteres;
        listaCaracteres=new ArrayList<String>();
        //Añadir
        listaCaracteres.add("Hola");
        listaCaracteres.add("Mundo");
        //Recorrer
        for(int i=0;i<listaCaracteres.size();i++)
        {
            System.out.println(i + "-" + listaCaracteres.get(i));
        }
        //Eliminar
        listaCaracteres.remove(0);// 0 es el indice de la lista
        for(int i=0;i<listaCaracteres.size();i++)
        {
            System.out.println(i + "-" + listaCaracteres.get(i));
        }
        
        //------------------------------------------------------------
        Set<String> lista = new HashSet<>();
        //Añadir
        lista.add("Hello");
        lista.add("World");
        //Recorrer
        for(String elemento : lista)
        {
            System.out.println(elemento);
        }
        //Eliminar
        lista.remove("Hello");
        for(String elemento : lista)
        {
            System.out.println(elemento);
        }
        
        //----------------------------------------------------------
        
        Map<Integer,String> map = new HashMap<>();
        //Añador
        map.put(0, "Cero");
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        //Recorrer
        for(int i=0;i<map.size();i++)
        {
            System.out.println(map.get(i));
        }
        //Eliminar
        map.remove(1);
        for(int i=0;i<map.size();i++)
        {
            System.out.println(map.get(i));
        }
    }
}
