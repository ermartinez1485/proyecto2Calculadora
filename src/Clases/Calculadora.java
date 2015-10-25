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
    protected List<Double> listaNumeros = new ArrayList<Double>();
    protected List<Character> listaOperadores = new ArrayList<Character>();

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

        for (int i = 0; i < listaOper.size(); i++) {
            char op = listaOper.get(i);

            switch (op) {
                case '+':
                    resultado = listaNum.get(i) + listaNum.get(i + 1);
                    break;
                case '-':
                    resultado = listaNum.get(i) - listaNum.get(i + 1);
                    break;
                case '=':
                    return resultado;
                default:
                    System.out.println("opcion invalida");
            }
        }
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

    public List<Double> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(List<Double> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public List<Character> getListaOperadores() {
        return listaOperadores;
    }

    public void setListaOperadores(List<Character> listaOperadores) {
        this.listaOperadores = listaOperadores;
    }
    
    public void agregarNumerosYOperadores(Double num, char operador ){
        this.listaNumeros.add(num);
        this.listaOperadores.add(operador);
        
    }
    
    
    
}
