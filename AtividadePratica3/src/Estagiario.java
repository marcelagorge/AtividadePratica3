public class Estagiario extends Funcionario {

    private int horasTrab;
    private String supervisor;

    public Estagiario(){
    }

    public Estagiario(String nome, String matricula, float salario, int horasTrab, String supervisor) {
        super(nome, matricula, salario);
        this.horasTrab = horasTrab;
        this.supervisor = supervisor;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + "horas trabalhadas: " + horasTrab + "\nnome do Supervisor: " + supervisor;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

    @Override
    public String trabalhar() {
        return "o estágiario " + getNome() + " está trabalhando";
    }

    @Override
    public String relatarProgresso() {
        return getNome() + ": as funções diárias foram feitas hoje";
    }

}