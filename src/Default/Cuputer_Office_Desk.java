package Inadimplencia;

import java.util.Locale;
import java.util.Scanner;

public class Computer_Office_Desk {

    public static void main(String[] args) {

        // Variáveis
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        byte idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        // Impressão dos produtos
        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é R$ %.2f%n", produto1, preco1);
        System.out.printf("%s, cujo preço é R$ %.2f%n", produto2, preco2);
        System.out.println();

        // Impressão de cadastro
        System.out.printf("Registro: %d anos, código %d e gênero: %c%n", idade, codigo, genero);
        System.out.println();

        // Impressão de medida com diferentes formatos
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        
        Locale.setDefault(Locale.US);
        System.out.printf("Separador decimal dos EUA: %.3f%n", medida);
    }
}
