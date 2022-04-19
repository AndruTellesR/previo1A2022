/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.previo.imc;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Johan Hernandez
 */
public class Empleado implements Serializable {
    
    private String nombre;
    private String cargo;
    private String edad;
    private String peso;
    private String altura;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, String edad, String peso, String altura) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public String getImc(){
        
        int pesoImc = Integer.parseInt(peso);
        
        double estatura = Double.parseDouble(altura);
        
        double imc = pesoImc / (estatura*estatura);
        
        String msg = "" + imc;
        
        return msg;
        
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.cargo, other.cargo);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
