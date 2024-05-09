import java.util.ArrayList;

public class ListaFuncionarios {

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static ArrayList<Funcionario> getLista() {
        return listaFuncionarios;
    }

    public static void addLista(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static void removeLista(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }

    public static Funcionario buscarMatricula(String matricula) {

        for (Funcionario funcionario : listaFuncionarios) {
            if(funcionario.getMatricula().equals(matricula)) {
                return funcionario;
            }
        }
        return null;

    }

    public static void listarLista() {
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.toString());
        }
    }

}