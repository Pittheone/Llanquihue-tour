/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import data.GestorTour;
import java.util.List;
import model.Tours;

/**
 *
 * @author user
 */
public class LlanquihueTourApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n==============================================");
        System.out.println("Llanquihue Tour - Gestour Tours Clasificados.");
        System.out.println("\n==============================================");
        
        GestorTour gestor = new GestorTour();
        String rutaArchivo = "src/resources/archivos.txt";
        
    System.out.println("\n--- LISTA DE TOURS ---");
    
    List<Tours> tours = gestor.cargarDesdeArchivo(rutaArchivo);
    
    for (Tours a : tours) {
      System.out.println(a.toString());
    }
        //Filtración
        String filtroTipo = "Santiago";
        System.out.println("\n--- Tours filtrados: (Tour de: " + filtroTipo + ") ---");
        
        for (Tours a : tours) {
            if (a.getLugar().equalsIgnoreCase(filtroTipo)) {
                System.out.println(a.toString());
            }
        }
        System.out.println("\n=================================================================");
        System.out.println("Ejecucion finalizada correctamente.");    
    }
    }
    

