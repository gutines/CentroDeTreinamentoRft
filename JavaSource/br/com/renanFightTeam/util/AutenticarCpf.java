package br.com.renanFightTeam.util;

public class AutenticarCpf {

	private String cpf;
	private String mensagem;
	
	public AutenticarCpf(String cpf){
		this.cpf = cpf;
	}
	
	public boolean validarCpf(){
		
		String cpfSemFormatacao = retirarFormatacaoCpf(cpf);
				
		if(validarTamanhoCpf(cpfSemFormatacao) && validarCpfSequenciaIgual(cpfSemFormatacao) && validarDigito(cpfSemFormatacao)){
			return true;
		}
		return false;
	}

	private boolean validarCpfSequenciaIgual(String cpf){ // Recebe cpf sem formatação e valida se sequencia igual 
		
		if(cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") ||
		   cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") ||
		   cpf.equals("88888888888") || cpf.equals("99999999999") ){
			mensagem = "CPF com valor sequêncial, verifique as informações e tente novamente!";
			return false;
		}
		return true;
	}
	
	private boolean validarTamanhoCpf(String cpf){ // Recebe cpf sem formatação e valida se tamanho igual a 11
		
		if(cpf.length() != 11){
			mensagem = "CPF com tamanho inferior a 11 digitos, verifique as informações e tente novamente!";
			return false;
		}
		return true;
	}
	
	private boolean validarDigito(String cpf){ // Compara digito do CPF com o digito calculado.
			
		int primeiroDigito = Integer.parseInt(cpf.substring(9, 10));
		int segundoDigito = Integer.parseInt(cpf.substring(10, 11));
		
		if (primeiroDigito == validarPrimeiroDigito(cpf) && segundoDigito == validarSegundoDigito(cpf)){
			return true;
		}
		
		mensagem = "CPF inválido, verifique as informações e tente novamente!";
		return false;
	}
	
	private int validarPrimeiroDigito(String cpf){ // Recebe cpf sem formatação e valida primeiro digito
		
		return efetuarCalculo(cpf.substring(0, 9), 10);			
	}
	
	private int validarSegundoDigito(String cpf){
				
		return efetuarCalculo(cpf.substring(0, 10), 11);	
	}
	
	private int efetuarCalculo(String cpf, int peso){
		int auxSoma = 0;
				
		for (int i = 0; i < cpf.length(); i++) {	 //calculo para obter o resultado módulo 10	
			auxSoma = auxSoma + (Integer.parseInt(cpf.substring(i, i+1)) * peso);
			peso = peso - 1;			
		}
		
		int digito = 11 - (auxSoma % 11);
	
		if (digito == 10 || digito == 11) {
			digito = 0;
		}
		
		return digito;
	}
	
	
	private String retirarFormatacaoCpf(String cpf){
		String cpfSemFormatacao = cpf.replace(".", "");
		cpfSemFormatacao = cpfSemFormatacao.replace("-", "");
		
		return cpfSemFormatacao;
	}
	

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

}
