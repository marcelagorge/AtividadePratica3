public class Gerente extends Funcionario {

    private float bonusAnual;
    private String equipeGerente;

    public Gerente() {
    }

    public Gerente(String nome, String matricula, float salario, float bonusAnual, String equipeGerente) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeGerente = equipeGerente;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeGerente() {
        return equipeGerente;
    }

    public void setEquipeGerente(String equipeGerente) {
        this.equipeGerente = equipeGerente;
    }

    @Override
    public String toString() {
        return super.toString() + " bônus anual: " + bonusAnual + "\nequipe: " + equipeGerente + "\nsalario final: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return getSalario() + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "o gerente " + getNome() + " está trabalhando ";
    }

    @Override
    public String relatarProgresso() {
        return getNome() + ": trabalho foi feito";
    }

}