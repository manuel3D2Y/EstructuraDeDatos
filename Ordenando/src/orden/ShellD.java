/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;
public class ShellD {
    public static void ShellDou (double[] a) {
        int siguinte=a.length/2;
        while(siguinte>=1){
        for(int file=siguinte;file<a.length;file++){
            double aux=a[file];
            int j=file-siguinte;
            while(j>=0&&a[j]>aux){
                a[j+siguinte]=a[j];
                j-=siguinte;
            }
            a[j+siguinte]=aux;
        }
         siguinte/=2;
        }
    }

    public static void imprime(double []valor){
        String conta="";
        for(int i=0;i<valor.length;i++){
            if(valor[i]<10)
                conta+=" "+valor[i]+" ";
            else
                conta+=valor[i]+" "; 
        }
        System.out.println(conta); 
    }
    
    
       public static void main (String[] args) {
        double contenido[]={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
       
           ShellDou(contenido);
           imprime(contenido);
        
       }

}
