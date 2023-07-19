package Leyendo_y_Escribiendo_BIte;
import java.io.*;
public class Lectura_Escritura {

	public static void main(String[] args)
	{
		 int contador = 0;
		 int[] datosEntrada = new int[2246023];
		 try 
		{
			
			//fuleImput para leer y recive como parametro la ruta
			FileInputStream archivoLectura = new FileInputStream("C:\\Users\\JAROL\\Desktop\\Leyendo_creado\\sherry-christian-8Myh76_3M2U-unsplash.jpg");
		    boolean final_ar = false;
		   
		    while(!final_ar)
		    {
		    	
		    	int byeEntrada = archivoLectura.read();
		    	
		    	//GUARDANDO LOS BYTES EN EL ARREGLO
		    	if( byeEntrada!=-1)
		    	{
		    		datosEntrada[contador]=byeEntrada;
		    	}
		    	else 
		    	{
		    		final_ar = true;	
		    	}
		    	//imprimiendo los bits de la imagen
		    	//System.out.println(byeEntrada);
		    	System.out.println(datosEntrada[contador]);
		    	contador++;
		    	
		    }
		    archivoLectura.close();
		    System.out.println("EL NUMERO DE BITS ES: "+contador);
		} catch (IOException e) 
		{
			System.out.println("Error al crear el archivo");
			e.printStackTrace();
		}
		
		crearFichero(datosEntrada);
	}

	
	static void  crearFichero (int datosFicheroNuevo[])
	{
		try 
		{
			FileOutputStream fichero_nuevo = new FileOutputStream("C:\\Users\\JAROL\\Desktop\\Leyendo_creado\\copiaImagen.jpg");
			for(int i=0; i<datosFicheroNuevo.length;i++)
			{
			fichero_nuevo.write(datosFicheroNuevo[i]);
			}
			fichero_nuevo.close();
		} catch (IOException e)
		{

			System.out.println("Error al crear la imagen");
			e.printStackTrace();
		}
	}
}
