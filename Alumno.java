/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo11;

/**
 *
 * @author Andrea Saldaña
 */
public class Alumno {
    String nombre, ApPat, ApMat, edad, NumCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, String ApPat, String ApMat, String NumCuenta, String edad) {
        this.nombre = nombre;
        this.ApPat = ApPat;
        this.ApMat = ApMat;
        this.NumCuenta = NumCuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(String ApMat) {
        this.ApMat = ApMat;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", ApPat=" + ApPat + ", ApMat=" + ApMat + ", NumCuenta=" + NumCuenta + ", edad=" + edad + '}';
    }
    
    
}

