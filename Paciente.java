public class Paciente {
    int idPaciente;
    String nome;
    int CPF;
    int idade;
    boolean sexo;
    String endereco;
    int telefone;


    public Paciente(int idPaciente, String nome, int CPF, int idade, boolean sexo, String endereco, int telefone) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;-
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void adicionarPaciente(Paciente paciente){
        paciente.add(paciente);
    }
public void adicionarPaciente() {
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu CPF: ");
    int CPF = scanner.nextInt();

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.print("Digite seu sexo (true para masculino, false para feminino): ");
    boolean sexo = scanner.nextBoolean();

    scanner.nextLine(); // Consumir a nova linha deixada pelo nextBoolean()

    System.out.print("Digite seu endereço: ");
    String endereco = scanner.nextLine();

    System.out.print("Digite seu telefone: ");
    int telefone = scanner.nextInt();
}
