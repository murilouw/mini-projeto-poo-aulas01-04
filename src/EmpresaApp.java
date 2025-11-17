public class EmpresaApp {
    //Arquivo principal da aplicação
    public static void main(String[] args) {
        System.out.println("Inicializando Sistemas de Gerenciamento de Funcionários...");

        try {
            // criando os objtos
            Funcionario gerente = new Gerente("Murilo Coelho", "12345678901", 15.000, 5.000);
            Funcionario estagiario = new Estagiario("Benjamim Tennyson", "98765432101", 2.500, 40);

            //Exibindo dados usando Polimorfismo
            System.out.println("\n--- Exibindo Dados ---");

            gerente.exibirDados();
            System.out.println("\n-------------------\n");
            estagiario.exibirDados();

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }
        System.out.println("\nSistema Finalizado.");
        }
    }

