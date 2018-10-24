package Cadastros;

public class Duracao_Minutos {

	private Viagem viagem;
	
	private int duracaoMinutos;
	
	public Duracao_Minutos(Viagem viagem) {
		this.viagem = viagem;
}
	
	public int calcular() {
		if (viagem.getMinutosTermino() > viagem.getMinutoInicio()) 
			duracaoMinutos = viagem.getMinutosTermino() - viagem.getMinutoInicio();
		else {
			duracaoMinutos = 60 - viagem.getMinutoInicio() + viagem.getMinutosTermino();
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
}
