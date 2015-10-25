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


    public Calculadora(Double resultado) {
        resultado = 0.0;
        this.resultado = resultado;
    }
    
    public Calculadora() {
        
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
    
    public Double sumar(List<Double> listaNum, List<Character> listaOper) {
        
        return resultado;
    }
    
    public Double restar(Double res){
    
        return resultado+res;
    }
    
    public Double multiplicar(Double multi){
    
        return resultado+multi;
    }
    
    public Double dividir(Double div){
    
        return resultado+div;
    }
}
