/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class Calculadora {
    
    protected Double resultado;
    protected String operacion;
    protected boolean nuevaOperacion;


    public Calculadora() {
        this.resultado = 0.0;
        this.nuevaOperacion = true;
        this.operacion = "";
    }
    

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "resultado=" + resultado + '}';
    }
    
    public Double sumar(Double sum) {
        
        return resultado+=sum;
    }
    
    public Double restar(Double res){
    
        return resultado-=res;
    }
    
    public Double multiplicar(Double multi){
    
        return resultado*=multi;
    }
    
    public Double dividir(Double div){
    
        return resultado/=div;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public boolean isNuevaOperacion() {
        return nuevaOperacion;
    }

    public void setNuevaOperacion(boolean nuevaOperacion) {
        this.nuevaOperacion = nuevaOperacion;
    }
}
