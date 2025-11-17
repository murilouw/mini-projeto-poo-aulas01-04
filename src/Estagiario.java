public class Estagiario extends Funcionario {
    private int cargaHorariaSemanal;

    // Construtor
    public Estagiario(String nome, String cpf, double salarioBase, int cargaHorariaSemanal) {
        super(nome, cpf, salarioBase);
        this.setCargaHorariaSemanal(cargaHorariaSemanal);
    }

    // sobrecarga do metodo exibirDados
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Estagiário");
        System.out.println("Carga Horária: " + this.cargaHorariaSemanal + "h/semana");
    }

    // getter e setter
    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        if (cargaHorariaSemanal > 0 && cargaHorariaSemanal <= 40) {
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        } else {
            throw new IllegalArgumentException("Carga horária inválida (deve ser > 0 e <=40).");

        }
    }
}
