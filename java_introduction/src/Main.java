/*
public class Main {
    public static void main(String[] args) {
        //Sintaxe Básica
        //Variáveis#1

        // Declaro tipo nome = valor;
        int idade = 22;

        // declaro tipo e  nome
        int salario;

        // Depois atribuo o valor
        salario = 400;

        // Se ja declarei uma variavel tipo string nao posso mais mudar o tipo
        // idade = "Diego";
        // salario = "DJFSR";


        //Variáveis#2 Escopo

        var nome = "Diego"; //A variavel recebe o tipo de acordo com o valor
        // nome = 22; //nao posso mudar o tipo

        // Desta forma não posso apenas declarar o nome, a variavel precisa tambem do valor
        // var idade2; 
        var idade2 = 22;

    }
}
*/
/* 

public class Main {
    public static void main(String[] args) {
        // Tipos Primitivos
        // byte, short, int, long

        byte idade = 22; // byte armazena valores pequenos e long valores maiores

        //boolean
        boolean eBrasileiro = true;

        //char - serve pra armazenar caracteres
        char letra = 'A';
        
        //Caso eu queira armazenar uma string completa devo utilizar a Classe String
        String nome = "Diego"; //String nao é um tipo primitivo, ele é uma classe auxiliar.

        //double, float - numeros de ponto flutuante
        double idade2 = 22.50;
        float salario = 400.20F;  

    }
}
*/

/* 
public class Main {
    public static void main(String[] args) {
        //Condicionais
        double idade = 22.50;
        if(idade>22.60){
            System.out.println("Maior");
        }else if(idade==22.60){
            System.out.println("Igual");
        }else{
            System.out.println("menor");
        }
    }
}
*/


public class Main {
    public static void main(String[] args) {
        //Vetore, arrays fixos
        //tipo[] nome;

        //inicianlizando o array com valores
        int[] idades = {2, 3, 4};
        idades[0] = 4;

        //inicianlizando o array com o tamanho
        int[] idades2 = new int[10]; 
        String[] nomes = new String[10];    
        boolean[] saoBrasileiros = new boolean[10]; 

        // Também posso ja colocar os valores direto dentro do array
        boolean[] saoBrasileiros2 = {true, false, true};

    }
}









