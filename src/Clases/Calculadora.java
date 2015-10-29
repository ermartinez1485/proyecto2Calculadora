/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
    protected NumberFormat format = new DecimalFormat("#.###############");


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
    
    public String seno(Double sin){
        sin = Double.parseDouble(Radianes(sin));
        return format.format(Math.sin(sin));
    }
    
    public String coseno(Double cos){
        cos = Double.parseDouble(Radianes(cos));
        return format.format(Math.cos(cos));
    }
    
    public String logaritmo(Double log){
        
        return format.format(Math.log(log));
    }
    
    public String tangente(Double tan){
        tan = Double.parseDouble(Radianes(tan));
        return format.format(Math.tan(tan));
    }
    
    public String Radianes(Double ran){
        return format.format(Math.toRadians(ran));
    }
    
    public String Grados(Double grados){
        //grados = Double.parseDouble(Radianes(grados));
        return format.format(Math.toDegrees(grados));
    }
    
    public String PI(){
        return format.format(Math.PI);
    }
    
    public String E(){
        return format.format(Math.E);
    }
    public String abs(Double valor){
        return format.format(Math.abs(valor));
    }
    
    public String truncar(Double valor){
        NumberFormat formatTruncar = new DecimalFormat("###############");
        return formatTruncar.format(valor);
    }
    
    public String Raiz(Double valor){
        return format.format(Math.sqrt(valor));
    }
    
    public Double factorial(Double valor){
        Integer fac = 1;
        if (valor > 0) {
            for (int i = 1; i <= valor; i++) {
                fac = fac * i;
            }
        }
        else {
            fac =0;
        }
        return (double)(fac);
    }
    
    public String removerDigito(String str) {
        return str.substring(0,str.length()-1);
    }
}