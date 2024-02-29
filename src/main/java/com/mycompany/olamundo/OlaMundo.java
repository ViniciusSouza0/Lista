package com.mycompany.olamundo;

//import java.util.Locale;

public class OlaMundo {
    public static void main(String[] args) {
        
        String nome = "Leonardo";
        int idade = 20;
        double renda = 26.666;
        System.out.printf("%s tem %d anos e ganha R$%.3f reais \n",nome, idade, renda);
        System.out.println(nome + " tem " + idade + " anos e ganha " + "R$" + renda + " reais");
        System.out.printf("Nome: %s idade");
        // Tela: Leonardo tem 20 anos e ganha R$26.000 reais
        
        /* %f - ponto flutuante (float,double)
           %d - números inteiros (int)
           %s - texto (String)
        
        */
        
        
        /*double x = 10.356547; 
        System.out.println(x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n",x);  
        System.out.println("RESULTADO = " + x + "METROS");
        System.out.printf("RESULTADO = %.2f METROS \n",x);
        */
    }
}