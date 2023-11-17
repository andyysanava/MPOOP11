/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Andrea Saldaña
 */
public class POO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno arrayAlumnos[] = new Alumno[5];
        arrayAlumnos[0] = new Alumno("Fernanda","Ayala","Hernandez","123456789","19");
        arrayAlumnos[1] = new Alumno("Gustavo","Valenzuela","Ascencio","234567891","19");
        arrayAlumnos[2] = new Alumno("Liliana","Navarrete","Vazquez","345678912","24");
        arrayAlumnos[3] = new Alumno("Fernanda","Odonis","Figueroa","456789123","19");
        arrayAlumnos[4] = new Alumno("Camila","Favila","Loyola","567891234","18");
        
        String alu0 = arrayAlumnos[0].getNombre()+","+arrayAlumnos[0].getApPat()+","+arrayAlumnos[0].getApMat()+","+arrayAlumnos[0].getNumCuenta()+","+arrayAlumnos[0].getEdad();
        String alu1 = arrayAlumnos[1].getNombre()+","+arrayAlumnos[1].getApPat()+","+arrayAlumnos[1].getApMat()+","+arrayAlumnos[1].getNumCuenta()+","+arrayAlumnos[1].getEdad();
        String alu2 = arrayAlumnos[2].getNombre()+","+arrayAlumnos[2].getApPat()+","+arrayAlumnos[2].getApMat()+","+arrayAlumnos[2].getNumCuenta()+","+arrayAlumnos[2].getEdad();
        String alu3 = arrayAlumnos[3].getNombre()+","+arrayAlumnos[3].getApPat()+","+arrayAlumnos[3].getApMat()+","+arrayAlumnos[3].getNumCuenta()+","+arrayAlumnos[3].getEdad();
        String alu4 = arrayAlumnos[4].getNombre()+","+arrayAlumnos[4].getApPat()+","+arrayAlumnos[4].getApMat()+","+arrayAlumnos[4].getNumCuenta()+","+arrayAlumnos[4].getEdad();
        
        try{
            System.out.println("#####Escritura del archivo#####");
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            impresoraDeArchivos.print(alu0+"\n");
            impresoraDeArchivos.print(alu1+"\n");
            impresoraDeArchivos.print(alu2+"\n");
            impresoraDeArchivos.print(alu3+"\n");
            impresoraDeArchivos.print(alu4);
            
            
            impresoraDeArchivos.close();
            
            System.out.println("#####Lectura de Archivo#####");
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea0 = br.readLine();
            System.out.println(linea0);
            StringTokenizer token0 = new StringTokenizer(linea0,",");
            String linea1 = br.readLine();
            System.out.println(linea1);
            StringTokenizer token1 = new StringTokenizer(linea1, ",");
            String linea2 = br.readLine();
            System.out.println(linea2);
            StringTokenizer token2 = new StringTokenizer(linea2, ",");
            String linea3 = br.readLine();
            System.out.println(linea3);
            StringTokenizer token3 = new StringTokenizer(linea3, ",");
            String linea4 = br.readLine();
            System.out.println(linea4);
            StringTokenizer token4 = new StringTokenizer(linea4, ",");

            br.close();
            
            System.out.println("#####StringTokenizer#####");
            Alumno obAlu5 = new Alumno(token0.nextToken(),token0.nextToken(),token0.nextToken(),token0.nextToken(),token0.nextToken());
            System.out.println(obAlu5);
            Alumno obAlu6 = new Alumno(token1.nextToken(),token1.nextToken(),token1.nextToken(),token1.nextToken(),token1.nextToken());
            System.out.println(obAlu6);
            Alumno obAlu7 = new Alumno(token2.nextToken(),token2.nextToken(),token2.nextToken(),token2.nextToken(),token2.nextToken());
            System.out.println(obAlu7);
            Alumno obAlu8 = new Alumno(token3.nextToken(),token3.nextToken(),token3.nextToken(),token3.nextToken(),token3.nextToken());
            System.out.println(obAlu8);
            Alumno obAlu9 = new Alumno(token4.nextToken(),token4.nextToken(),token4.nextToken(),token4.nextToken(),token4.nextToken());
            System.out.println(obAlu9);
            
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

