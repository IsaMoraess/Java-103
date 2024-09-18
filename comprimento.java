/*Crie uma classe com um método que lê o comprimento de 3 pedaços de madeira e verifica se os mesmos podem formar um triângulo. Esse método deve ser chamado pelo método main de outra classe do mesmo projeto. Se formar um triângulo, determinar o tipo de triângulo:
Equilátero = 3 lados iguais
Isósceles = 2 lados iguais
Escaleno = 3 lados diferentes */

import java.util.Scanner;

public class comprimento{
    public void calcular(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o lado A:");
        double A = sc.nextDouble();
        System.out.println("Informe o lado B:");
        double B = sc.nextDouble();
        System.out.println("Informe o lado C:");
        double C = sc.nextDouble();

        //VER SE PODE FORMA TRIANGULO
        if (A < B + C && B < A + C && C < A + B) {
        
        // TIPO DE TRIANGULO
            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero.");
            } 
            else if (A == B || B == C || A == C) {
                System.out.println("Triângulo Isósceles.");
            } 
            else {
                System.out.println("Triângulo Escaleno.");
            }
        } 
        else {
            System.out.println("Não podem formar um triângulo.");
        }
    }
}
