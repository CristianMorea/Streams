package AccesoFicheros_Leyendo;

import java.io.BufferedReader;
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
		{ //USANDO READ
			FileReader entrada = new FileReader("C:/Users/JAROL/Desktop/Streams/pruevaBufer.txt");
			//int c = 0;
			   /*
			    *  while(c != -1)
			    {
			    	c= entrada.read();
			    	
			    	char letra = (char)c;
			    	System.out.print(letra);
			    	
			    	
			    } 
			    */
			   
			    //entrada.close();
			
//----------------------------------------------------------			
			
			//CREANDO EL BUFER
			/*
			 * ESTE SE USA PARA LEER ARCHIVOS DE TEXTO QUE TENGAN MUCHO
			 * CONTENIDO YA QUE ESTE LEE POR LINEAS NO POR CARACTERES
			 * COMO EL EJEMPLO ANTERIORMENTE COMENTADO
			 */
			BufferedReader miBufeer = new BufferedReader(entrada);
		    
		    
		    String linea = "";
			   
			      while(linea!= null)
			    {
			    	
			    	linea = miBufeer.readLine();
			    	
			    	if(linea != null)
			    	{
			    		System.out.println(linea);
			    	}
			    	
			    	
			    	
			    } 
			 
			   
			    entrada.close();
		    
		
			
		} catch (IOException e) 
		{
			System.out.println("NO SE A ENCONTRADO EL ARCHIVO");
			e.printStackTrace();
		}
	}
	
}
