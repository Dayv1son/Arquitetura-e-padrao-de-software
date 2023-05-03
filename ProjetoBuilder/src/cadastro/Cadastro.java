package cadastro;
public class Cadastro {
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    private String email;
    private String endereco;
	private String CPF;

    /*private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }*/
    
    public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
    public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "\n----------------- Cadastro -----------------\nPrimeiro nome: " + primeiroNome + 
				"\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nEmail: "
				+ email + "\nEndereco: " + endereco + "\nCPF: " + CPF;
	}
	
	
}