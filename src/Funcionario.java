public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    // Construtor

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalarioBase(salarioBase);
    }

    // metodo para exibir dados

    public void exibirDados() {
        System.out.println("-- Dados do Funcionário --");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário Base: R$ " + String.format(".2f", this.salarioBase));
    }

    // -- Getters e Setters com Validação --

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // validaçao simples de cpf (11 digitos)
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Salário base não pode ser negativo.");
        }
    }

}
