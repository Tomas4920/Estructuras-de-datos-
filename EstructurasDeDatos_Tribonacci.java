/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas
 */
public class EstructurasDeDatos_Tribonacci {
    
static int SecTribonacci(int n)
{
     if ( n == 0 || n == 1) {
        return 0;}
        
     if ( n == 2 ){
        return 1;
     }
     else{
         return SecTribonacci(n - 1) + SecTribonacci(n - 2) + SecTribonacci(n - 3);
     }
     
     
}    
public void printSecTribonacci(int n)
{
    for(int i = 0; i < n; i++)
        System.out.print(SecTribonacci(i) +",");
}        

public boolean Valor(int [] arreglo, int dat, int posc){
    if (posc == 0){
        if (arreglo [posc] == dat){
            return true;
        }
        else{
            return false; }
    }
    else {
        if (arreglo[posc]!= dat){
            return Valor (arreglo, dat, posc - 1);}
        
        else{
            return true;}
    }   
        
    }

public boolean palindroma (String plb){
    if (plb.length() == 0 || plb.length() == 1){
         return true;}

    if (plb.charAt(0) == plb.charAt(plb.length()-1)){
        
        return palindroma(plb.substring(1, plb.length()-1));
        
        return false; 
               
        }

public String numerolog(int numero){
    String num = String.valueOf(numero);
    if(num.length()==1)
        return num;
    
    else{
    char[]a= num.toCharArray();
    int suma = 0
    int numerol= 0;
    
    for (int i=0; i<a.length;i++){
        numerol = Character.getNumericValue(a[i]);
        suma = suma + numerol;
        }
    return numerolog(suma);        
    }
}
        









