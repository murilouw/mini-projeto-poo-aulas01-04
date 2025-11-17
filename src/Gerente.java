public class Gerente extends Funcionario {
    private double bonusAnual;

    // Construtor
    public Gerente(String nome, String cpf, double salarioBase, double BonusAnual) {
        // chama o construtor da classe pai (Funcionario)
        super(nome, cpf, salarioBase);
        this.setBonusAnual(bonusAnual);
    }

    // sobrecarga do metodo exibirDados > Polimorfismo
    @Override
    public void exibirDados() {
        super.exibirDados(); // esta chmando o metodo da classe pai
        System.out.println("Cargo: Gerente");
        System.out.println("Bônus Anual: R$ " + String.format("%.2f", this.bonusAnual));
    }

    // getter e setter
    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        if (bonusAnual >= 0) {
            this.bonusAnual = bonusAnual;
        } else {
            throw new IllegalArgumentException("Bônus não pode ser negativo.");
        }
    }
}
