/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Ex004 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        double a = entrada.nextDouble();
        System.out.print("Digite mais um número:");
        double b = entrada.nextDouble();
        System.out.print("Digite outro número:");
        double c = entrada.nextDouble();
        double dt = Math.pow(b, 2) - (4 * a * c);
        double x1 = ((-b) + Math.sqrt(dt) / (2 * a));
        double x2 = ((-b) - Math.sqrt(dt) / (2 * a));
        if (a > 0){
            System.out.println(x1);
            System.out.println(x2);
        }
        else{
            System.out.println("Essa equação não possui resultados reais.");
        }
        if (dt == 0){
            System.out.println(x1);     
        }
    }
}