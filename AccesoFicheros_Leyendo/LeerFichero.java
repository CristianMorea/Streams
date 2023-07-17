package AccesoFicheros_Leyendo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero 
{
/*SECUENCIA DE ENTRADA
 * 
 * primero debemos decirle al programa en donde 
 * se encuentra el fichero a leer
 * 
 * usamos la clase reader    fileRyder leer
 * para escribir usamos Wrider
 */
	
	public void lee()
	{
		try
		{
			FileReader entrada = new FileReader("C:/Users/JAROL/Desktop/Streams/prueva.txt");
		    int c = 0;
		    
		    while(c != -1)
		    {
		    	c= entrada.read();
		    	
		    	char letra = (char)c;
		    	System.out.print(letra);
		    	
		    	
		    }
		    entrada.close();
			
		} catch (IOException e) 
		{
			System.out.println("NO SE A ENCONTRADO EL ARCHIVO");
			e.printStackTrace();
		}
	}
	
}
