/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionbalanceada;
import estructuras.Stack;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ecuacion {
    //Atributos estáticos
    static String e;
    static Stack pila = new Stack();
    //pide al usuario la ecuación
    public static String getEcuation(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba la ecuación");
        e = sc.nextLine();
        return e; //regresa la ecuación
    }
    
    public static int getLenght(String s){
        return s.length(); //regresa el tamaño de la ecuación
    }
    public static boolean resolver(String s){ 
        char a = '('; //char (
        char b = ')'; //char )
        for(int i=0; i < getLenght(s); i++){ //recorre el String
            if (e.charAt(i) == a){
                pila.push(a);   //Si encuentra un '(' en la ecuación, lo mete a la pila
            }
            else if(e.charAt(i)==b){ //Si encuentra un ')' en la ecuación
                if(!pila.isEmpty()){pila.pop();} //si la pila no está vacía, saca un elemento
                else{ return false;} //si ya está vacía y encuentra 1, regresa falso
            }
        }
        return pila.isEmpty(); //regresa el estado de la pila
    }
public static void resultado(boolean s){
    if(s){
        System.out.println("La ecuación está balanceada");  //si el método anterior regresa true, está balanceada
    }else{
        System.out.println("La ecuación no está balanceada"); //si el método anterior regresa false, no está balanceada
    }
    }

}

