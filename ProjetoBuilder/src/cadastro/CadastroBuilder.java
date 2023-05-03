package cadastro;
public class CadastroBuilder {
        
	private Cadastro cadastro;
	
	public CadastroBuilder() {
		this.cadastro = new Cadastro();
     }

     public CadastroBuilder setCadastro(String pnome, String sobrenome, int idade, String email, String endereco, String cpf) {
      	cadastro.setPrimeiroNome(pnome);
      	cadastro.setSobrenome(sobrenome);
      	cadastro.setIdade(idade);
      	cadastro.setEmail(email);
      	cadastro.setEndereco(endereco);
      	cadastro.setCPF(cpf);
      	
       	return this;
     }
     
     public Cadastro builder() {
    	 return cadastro;
     }
 }