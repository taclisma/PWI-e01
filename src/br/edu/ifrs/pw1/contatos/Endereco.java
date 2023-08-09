package br.edu.ifrs.pw1.contatos;

public class Endereco {
	private String logradouro;
	private String complemento;
	private long cep;

		
	// construtores 
		public Endereco() {
		// se eu vou ter uma subclasse, vou usar esse para inicializar (herança)
		// prepara a classe para por ex, uma classe "endereço residencial"
		}
		public Endereco(String logradouro, String complemento, long cep) {
			super();
			this.logradouro = logradouro;
			this.complemento = complemento;
			this.cep = cep;
		}
	
	// métodos
		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public long getCep() {
			return cep;
		}

		public void setCep(long cep) {
			this.cep = cep;
		}
		
		@Override
		public String toString() {
			return "\t  Logradouro:" + logradouro + "\n\t  Complemento: " + complemento + "\n\t  Cep: " + cep + "\n";
		}

	
}
