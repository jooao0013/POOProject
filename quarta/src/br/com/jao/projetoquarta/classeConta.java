package br.com.jao.projetoquarta;

public class classeConta { // Classe

	int atributoNumeroConta; //0
	double atributoSaldoConta; //0.0
	
	classePessoa atributoPessoaConta;

	void metodoDepositar(double parametroValor) { // Método
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
		//this.atributoSaldoConta += parametroValor;
		
	}
	
}
