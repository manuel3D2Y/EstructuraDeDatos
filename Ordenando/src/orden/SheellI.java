/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;
public class SheellI {
    public static void ShellInt (int[] a) {
        int next=a.length/2;
        while(next>=1){
        for(int file=next;file<a.length;file++){
            int au=a[file];
            int j=file-next;
            while(j>=0&&a[j]>au){
                a[j+next]=a[j];
                j-=next;
            }
            a[j+next]=au;
        }
        next/=2;
        }
    }
   
    public static void imp(int []a){
        String saltito="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                saltito+=" "+a[i]+" ";
            else
                saltito+=a[i]+" "; 
        }
        System.out.println(saltito); 
    }
       public static void main (String[] args) {
        int a[] = { 25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
       
       
        
        ShellInt(a);
        imp(a);
        
       }

}
