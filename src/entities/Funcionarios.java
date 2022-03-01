package entities;

public class Funcionarios implements Comparable<Funcionarios> {
    private String nome;
    private Double salario;
    private Integer idade;

    public Funcionarios(String nome, Double salario, Integer idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
        return "Nome: "+ nome + " , " + "Salario: " + salario + " , "+ "Idade: " + idade;
    }

    @Override
    public int compareTo(Funcionarios list) {
        return getSalario().compareTo(list.getSalario());
    }

}

