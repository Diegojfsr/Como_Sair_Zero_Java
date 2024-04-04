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

/*
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

        //Pegando o tamano do array
        int[] idades3 = new int[10];
        idades3.length; //deve retornar o tamanho do array
    }
}
*/
/*

// E preciso importar o ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList - e uma classe de lista dinamica
        
        // Casse Integer
        ArrayList<Integer> idades = new ArrayList<Integer>(); //array inicializado

        //add itens no array
        idades.add(22);
        idades.add(50);
        idades.add(30);
        //remover itens no array
        idades.remove(0); //remove o item no idex 0.
        //pegar um elemento no array
        idades.get(1); //retorna o valor armazenado no index 1.
        //retornar o tamanho do array
        idades.size(); // retorna o tamanho do array
        //idades. (retorna todos os metodos do array)
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        //Loops - while - for
        int idade = 10;
        for(var i = 0; i > idade; i++ ){
            System.out.println("Oi"); //printa o Oi 10x
        }

        int idade2 = 10;
        int i = 0;
        while (i < idade2) {
            i++;
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        //Casting - Transforma um tipo em outro

        //Casting Implicito faz a auteração de um tipo para o outro sem a necessidade de declarar.
        int idade1 = 22;
        double idade2 = idade1; //fez a mudança de inteiro para double

        // Casting Explicito e necessario declarar a transformação
        idade1 = (int)idade2; //fez a mudança de double para int
        char letra = 'a';
        String nome = String.valueOf(letra); //transforma o char em String
        letra = nome.charAt(0); //converte a String letra em char
        String nome2 = String.valueOf(idade1); //transforma a idade em uma string
        idade1 = Integer.parseInt(nome2); //transforma String nome2(22) em inter idade1(22)
    }
}
*/

/*

public class Main {
    //Orientacao a Objetos - Classes

    String nome;

    static String nome2;
    public static void main(String[] args) {
        System.out.println(nome2);
    }

    static void teste(){

    }

    //Objetos
    void declaraNome(){
        System.out.println(nome2);
        Main.teste();
        nome = "Diego";

        Main meuMain = new Main();
        System.out.println(meuMain.nome);

        meuMain.declaraNome();
    }


    String getNome(){
        return nome;
    }
    
}
*/

/*
public class Main {
    //Orientacao a Objetos - Contrutores

    String nome;
    int idade;

    static String nome2;
    public static void main(String[] args) {
        System.out.println(nome2);
    }

    //construtor
    public Main(String nome){
        this.nome = nome;
    }

    //construtor
    public Main(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

}

class Pessoa {
    void criaMain(){
        Main meuMain = new Main("Diego", 22);
    }
}
*/


/*
public class Main {
    //Modificardores de Acesso

    public String name;
    //private int salary;
    protected int salary;
    public static void main(String[] args) {
    }

    private void atualizaSalario(){
        this.salary = 4000; //dentro da classe tem acesso ao atributo
    }

    public int getSalary(){
        this.atualizaSalario();//metodo pode ser chamado aqui pos esta na mesma classe
        return this.salary;
    }

}

class Pessoa{

    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        //System.out.println(meuMain.salary);// nao acessa o atributo pois e privado
        System.out.println(meuMain.getSalary());
        //meuMain.atualizaSalario(); // nao acessa o metodo pois e privado
    }
}

*/

/*
public class Main {
    //Herança

    public String name;
    //private int salary;
    protected int salary;
    public static void main(String[] args) {
        Ser meuSerAnimal = new Pessoa("Fernanda", 22, "Kipper");
        meuSerAnimal.setNome("Fernanda");
    }


    private void atualizaSalario(){
        this.salary = 4000; //dentro da classe tem acesso ao atributo
    }

    public int getSalary(){
        this.atualizaSalario();//metodo pode ser chamado aqui pos esta na mesma classe
        return this.salary;
    }
}
*/

public class Main {
    //Polimorfismo

    public String name;
    //private int salary;
    protected int salary;
    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro("Willy", 5, "Fernanda");
        Ser meuSerHumano = new Pessoa("Fernanda", 22, "Kipper");
        meuSerAnimal.setNome("Fernanda");
        meuSerAnimal.saudacao();
        meuSerHumano.saudacao();
    }


    private void atualizaSalario(){
        this.salary = 4000; //dentro da classe tem acesso ao atributo
    }

    public int getSalary(){
        this.atualizaSalario();//metodo pode ser chamado aqui pos esta na mesma classe
        return this.salary;
    }
}

































