/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas
 */
public class Recursividad {
    public static void main(String[] args) {
        int n= 8;
        int [] vector= {12,34,78,42,56,90};
        int tam = vector.length-1;
        int dat=22;
        String plb = "Abalaba";
        int num = 18;
        
        EstructurasDeDatos_Tribonacci r = new EstructurasDeDatos_Tribonacci();
        r.printSecTribonacci(n);
        System.out.println(r.Valor(vector,dat,tam));
        System.out.println(r.palindroma(plb));
        System.out.println(r.numerolog(num));
    }
}
