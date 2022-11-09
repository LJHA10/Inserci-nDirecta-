/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inserciondirecta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class Inserciondirecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        int arreglo[], nElementos, pos, aux;
        
        System.out.println("Digita el numero de elementos");
        entrada = bufer.readLine();
        nElementos = Integer.parseInt(entrada);
        
        arreglo = new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }
        //ordenamiento por insercion
        for(int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        System.out.print("Orden ascendente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");         
        }
    }
  }
