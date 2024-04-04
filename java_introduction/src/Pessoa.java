

class Ser{
    String nome;
    int idade;

    public Ser(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }


    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

} 



public class Pessoa extends Ser {

    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome){
        super(nome, idade);
        this.sobrenome = sobrenome;
    }

    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.getSalary());
        this.idade = 22;
    }
    
}
