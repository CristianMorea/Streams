package AccesoFicheros_Leyendo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Escribiendo 
{
public void escribir()
{
	String frase = "Esto es una prueva de escritura 2 prueva 3";
    
	try 
	{
		FileWriter escritura = new FileWriter("C:/Users/JAROL/Desktop/Streams/prueva.txt",true);
	    for(int i = 0; i<frase.length();i++)
	    {
	    	escritura.write(frase.charAt(i));
	    }
	    escritura.close();
	} catch (IOException e) 
	{
		
		e.printStackTrace();
	}


}
}
