package automacao_teste_keeggo.core.testDataTypes;

public class Customer {

	public String userName;
	public String email;
	public String senha;
	public String confirmarSenha;

	public class detalhesPessoais {
		public String primeiroNome;
		public String ultimoNome;
		public String numeroTelefone;
	}

	public class endereco {
		public String pais;
		public String cidade;
		public String endereco;
		public String estado;
		public String codigoPostal;
	}
}