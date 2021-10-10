package ExercicioClasseObjetoJava;

import java.text.NumberFormat;

public class Cliente {

		private String nome;
		public int quantidadeFilhos;
		private double patrimonio;
	
		//método construtor 
		
		public Cliente(String nome, int quantidadeFilhos, double patrimonio)
		
		{
			this.nome = nome;
			this.quantidadeFilhos = quantidadeFilhos;
			this.patrimonio = patrimonio;
		}
		
		//declaração dos demais métodos da classe

		public int getQuantidadeFilhos() {
			return quantidadeFilhos;
		}

		public void setQuantidadeFilhos(int quantidadeFilhos) {
			this.quantidadeFilhos = quantidadeFilhos;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nomeDoTitulardaConta) {
			this.nome = nomeDoTitulardaConta;
		}

		public double getPatrimonio() {
			return patrimonio;
		}

		public void setPatrimonio(double saldoDaConta) {
			this.patrimonio = saldoDaConta;
		}
		
		public String formatarMoeda() {
			
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(getPatrimonio());
			return formatoMoeda;
		}

		
		public void imprimirinfomacao() {
			
			System.out.println( "Olá " + nome + " quantidade de filhos : "+ getQuantidadeFilhos() + " seu patrimonio é de: " + this.formatarMoeda());
		}
		
		public void imprimirinformacaofinal() {
		
			System.out.println("Seu saldo total será de: " + this.formatarMoeda());
		}
		
			
}

