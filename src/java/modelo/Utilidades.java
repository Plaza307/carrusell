/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Utilidades {
    public static ArrayList<String> getArchivos(String sDirectorio){
		ArrayList<String> archivos = new ArrayList<String>();
		
                File dir = new File(sDirectorio);
                String[] ficheros = dir.list();
                
                if (ficheros == null){
                    System.out.println("No hay ficheros en el directorio especificado");
                } else { 
                    for (int x=0;x<ficheros.length;x++)
                      if( ficheros[x].endsWith(".jpg") || ficheros[x].endsWith(".png")|| ficheros[x].endsWith(".gif") ){
                          archivos.add(ficheros[x]);
                      } else {
                          
                      }
                  }
		return archivos;		
    }
}
