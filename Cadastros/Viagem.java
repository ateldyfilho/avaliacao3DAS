package Cadastros;

public class Viagem {

	private int getHoraInicio;
	private int minutosInicio;
	private int getHoraTermino;
	private int minutosTermino;
	private int duracaoTotalMinutos;

	private Viagem(int hora, int minutos) {
		this.getHoraInicio = hora;
		this.minutosInicio = minutos;
	}

	protected static Viagem obterViagem(int hora, int minutos) {
		Viagem v = new Viagem (hora, minutos);
		return v;
	}

	public int getHoraInicio() {
		return getHoraInicio;
	}

	public int getMinutoInicio() {
		return minutosInicio;
	}

	public void encerrarViagem(int horaTermino, int minutosTermino) {
		this.getHoraTermino = horaTermino;
		this.minutosTermino = minutosTermino;
	}

	public int getHoraTermino() {
		return getHoraTermino;
	}

	public int getMinutosTermino() {
		return minutosTermino;
	}

	public int getDuracaoHoras() {
		return new Duracao_Horas(this).calcular();
	}
	public int getDuracaoMinutos() {
		return new Duracao_Minutos(this).calcular();
	}
	
	public int getDuracaoTotalMinutos() {
		duracaoTotalMinutos = getDuracaoHoras() * 60 + getDuracaoMinutos();
		return duracaoTotalMinutos;
	}

}
