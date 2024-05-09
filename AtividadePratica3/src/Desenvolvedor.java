public class Desenvolvedor extends Funcionario {

    private String tecnologia;

    public Desenvolvedor(){
    }

    public Desenvolvedor(String nome, String matricula, float salario, String tecnologia) {
        super(nome, matricula, salario);
        this.tecnologia = tecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnoDomina) {
        this.tecnologia = tecnoDomina;
    }

    @Override
    public String toString() {
        return super.toString() + "tecnologia q domina: " + tecnologia;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

    @Override
    public String trabalhar() {
        return "o desenvolvedor " + getNome() + " está trabalhando ";
    }

    @Override
    public String relatarProgresso() {
        return getNome() + ": trabalho foi feito";
    }

}