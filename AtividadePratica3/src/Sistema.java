public class Sistema {

    private static int Menu() {

        System.out.println("Empresa M");
        System.out.println("1) Adicionar Funcionário");
        System.out.println("2) Remover Funcionário por Matricula");
        System.out.println("3) Listar Todos os Funcionários");
        System.out.println("4) Buscar Funcionários por Matricula");
        System.out.println("5) Remover Todos os Funcionários");
        System.out.println("6) Como está indo o trabalho do Funcionário");
        System.out.println("7) Relatar progresso do Funcionário");
        System.out.println("0) Sair");
        System.out.print("Escolha a opção: ");
        return Console.lerInt();

    }

    private static void options(int op) {

        switch (op) {
            case 1:
                adicionarFuncionario();
                break;
            case 2:
                removerFuncionario();
                break;
            case 3:
                listarTodosFuncionarios();
                break;
            case 4:
                buscarFuncionario();
                break;
            case 5:
                removerTodosFuncionarios();
                break;
            case 6: 
                mostrarTrabalho();
                break;
            case 7:
                relatarProgresso();
                break;
            case 0: 
                System.out.println("\nprograma finalizado.\n");
                break;
            default:
                System.out.println("\nnúmero inválido, escolha outra opção.");
                break;
        }

    }

    private static void adicionarFuncionario() {

        System.out.println("\nEscolha o tipo de funcionário:");
        System.out.println("1) Desenvolvedor");
        System.out.println("2) Gerente");
        System.out.println("3) Estagiário");
        System.out.print("Selecione a opção: ");
        int op = Console.lerInt();

        if(op < 1 || op > 3) {
            System.out.println("\nOpção inválida");
            return;
        }

        tipoFuncionario(op);
        System.out.println("Funcionário cadastrado!");

    }

    private static void tipoFuncionario(int op) {

        System.out.print("Coloque o nome: ");
        String nome = Console.lerString();
        System.out.print("Coloque o número de matrícula: ");
        String matricula = Console.lerString();
        System.out.print("Coloque o salário: ");
        float salario = Console.lerFloat();
        
        switch (op) {
            case 1:
                System.out.print("Coloque as tecnologias que domina: ");
                String tecnologia = Console.lerString();

                Funcionario desenvolvedor = new Desenvolvedor(nome, matricula, salario, tecnologia);
                ListaFuncionarios.addLista(desenvolvedor);
                break;
            case 2:
                System.out.print("Coloque o bônus anual: ");
                float bonusAnual = Console.lerFloat();
                System.out.print("Coloque o nome da equipe que está gerenciando: ");
                String equipeGerente = Console.lerString();

                Funcionario gerente = new Gerente(nome, matricula, salario, bonusAnual, equipeGerente);
                ListaFuncionarios.addLista(gerente);
                break;
            case 3:
                System.out.print("Coloque o total de horas trabalhadas: ");
                int horasTrab = Console.lerInt();
                System.out.print("Coloque o nome do seu supervisor: ");
                String supervisor = Console.lerString();

                Funcionario estagiario = new Estagiario(nome, matricula, salario, horasTrab, supervisor);
                ListaFuncionarios.addLista(estagiario);
                break;
            default:
                break;
        }

    }

    private static void removerFuncionario() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nlista de funcionários está vazia");
            return;
        }

        System.out.println("\nRemover por Matrícula");
        System.out.print("Insira a matrícula do funcionário: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionário não encontrado.");
            return;
        }

        ListaFuncionarios.removeLista(funcionario);
        System.out.println("\nFuncionário foi removido.");

    }

    private static void listarTodosFuncionarios() {

        System.out.println("\nLista");

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nlista de funcionários está vazia.");
            return;
        }

        ListaFuncionarios.listarLista();

    }

    private static void buscarFuncionario() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nlista de funcionários está vazia.");
            return;
        }
        
        System.out.println("Buscar pelo número da matrícula");
        System.out.print("Insira a matrícula do Funcionário: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionário não encontrado.");
            return;
        }

        System.out.println(funcionario.toString());

    }

    private static void removerTodosFuncionarios() {
        
        System.out.println("\nExcluir todos da lista");

        if (ListaFuncionarios.getLista().isEmpty()) {

            System.out.println("\nNão há funcionárrios cadastrados.");
            return;
        }

        ListaFuncionarios.getLista().clear();

        System.out.println("\nTodos os funcionários foram excluídos.");

    }

    private static void mostrarTrabalho() {
        
        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nlista de funcionários está vazia.");
            return;
        }
        
        System.out.println("\nMostrar Trabalho");

        for (Funcionario funcionario : ListaFuncionarios.getLista()) {
            System.out.println("Matrícula: " + funcionario.getMatricula() + " | " + funcionario.getNome());
        }

        System.out.print("\nInsira a matrícula do Funcionário: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionário não encontrado.");
            return;
        }

        System.out.println(funcionario.trabalhar());
        
    }

    private static void relatarProgresso() {

        if(ListaFuncionarios.getLista().isEmpty()) {
            System.out.println("\nlista de funcionários está vazia.");
            return;
        }
        
        System.out.println("\nMostrar Progresso");

        for (Funcionario funcionario : ListaFuncionarios.getLista()) {
            System.out.println("Matrícula: " + funcionario.getMatricula() + " | " + funcionario.getNome());
        }

        System.out.print("\nInsira a matrícula do Funcionário: ");
        String matricula = Console.lerString();
        Funcionario funcionario = ListaFuncionarios.buscarMatricula(matricula);

        if(funcionario == null) {
            System.out.println("\nFuncionário não encontrado.");
            return;
        }

        System.out.println(funcionario.relatarProgresso());

    }

    public static void executar() {
        int op;
        do {
            op = Menu();
            options(op);
        } while (op != 0);

    }

}
