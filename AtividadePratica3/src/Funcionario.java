public abstract class Funcionario implements Trabalhavel {
    
    private String nome;
    private String matricula;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "matrícula: " + matricula + "salário: " + salario;
    }

    public abstract float calcularSalario();    

}
