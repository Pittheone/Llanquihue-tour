/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import model.Tours;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
/**
 *
 * El gestor carga línea a línea, después separa los datos, y luego guardo los datos.
 */
public class GestorTour {
//Creamos lista TipoHotel, cargaDesdeArchivo rutaArchivo que viene del main. El nombre del método es CargarDesdeArchivo
   public List<Tours> cargarDesdeArchivo(String rutaArchivo) {

        List<Tours> lista = new ArrayList<>(); //Crea nuevo ArrayList
        //va leer el buffered, va a pasarlo a la variable br y que cargue el archivo de acuerdo de acuerdo a esa ruta(rutaArchivo)
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea; //defino una varible String llamada línea
            while ((linea = br.readLine()) != null) { //mientas lee una línea y no sea nulo, sigue este while
                if (linea.trim().isEmpty()) { //si no está vacía, continua.
                    continue;
                }

                // Tenemos un arreglo que se llama partes, toma la línea con el split que es el punto y coma linea.split(";")
                String[] partes = linea.split(";");
                //Si la partes(el arreglo) es igual a 3...
                if (partes.length == 3) {
                    String nombre = partes[0].trim(); //se guarda en 0
                    String lugar = partes[1].trim();   //se guarda en 1
                    int precio = Integer.parseInt(partes[2].trim()); //se guarda en 2 y tomo el dato al tipo de dato que necesito (parseint)
                    // Se crea el objeto y se añade a la lista dinámica.
                    Tours tph = new Tours(nombre, lugar, precio);
                    lista.add(tph); //lo agrego a Lista.
                }
            } 

            System.out.println("Éxito: Se cargaron " + lista.size() + " Hoteles desde el archivo.");

        } catch (IOException e) {

            System.err.println("Error al leer el archivo: " + e.getMessage());

        } catch (NumberFormatException e) {

            System.err.println("Error al parsear el precio: " + e.getMessage());
        }
        return lista;

   } 
} 


