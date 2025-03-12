package com.mycompany.psclista012025;
import java.util.Scanner;

public class Psclista012025 {
    
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina(exemplo: 3,5): R$ ");
        double precoLitro = scan.nextDouble();
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scan.nextDouble();

        double totalPagar = precoLitro * litrosVendidos;

        System.out.println("O cliente deverá pagar: R$ " + totalPagar);
        
        scan.close();
    }
}
