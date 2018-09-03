/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivojava;
import java.io.*;
/**
 *
 * @author CASA
 */
public class ArchivoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        //crear archivo
        final int MAX=10;
        int valor;
        String artch="prueba.txt";
        FileWriter fv =new FileWriter(artch);
        BufferedWriter bw=new BufferedWriter(fv);
        PrintWriter salArch=new PrintWriter(bw);
        for(int n=1;n<=MAX;n++){
            valor=(int)(Math.random()*100);
            salArch.print(valor+" ");
        }
        salArch.println();
        salArch.close();
        System.out.println("EL archivo de salida ha sido"
                + " creado: "+artch);
        //leer archivo
        try{
        String arch ="prueba.txt";
        String linea;
        FileReader fr= new FileReader(arch);
        BufferedReader entArch = new BufferedReader(fr);
        linea=entArch.readLine();
        while(linea!=null){
            System.out.println(linea+"\n");
            linea=entArch.readLine();
        }
        entArch.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }

    }
    
}
