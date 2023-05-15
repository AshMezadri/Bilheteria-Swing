package modelo;

import java.time.LocalDateTime;

public class Filme {

	public String idFilme;
	public String nomeFilme;
	public LocalDateTime horarioFilmeDublado, horarioFilmeLegendado;
	
	public Filme(String nomeFilme, String idFilme, LocalDateTime horarioFilmeDublado, LocalDateTime horarioFilmeLegendado ) {
		this.nomeFilme = nomeFilme;
		this.horarioFilmeDublado = horarioFilmeDublado;
		this.horarioFilmeLegendado = horarioFilmeLegendado;
		this.idFilme = idFilme;
	}
	
	public String getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(String idFilme) {
		this.idFilme = idFilme;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public LocalDateTime getHorarioFilmeDublado() {
		return horarioFilmeDublado;
	}
	public void setHorarioFilmeDublado(LocalDateTime horarioFilmeDublado) {
		this.horarioFilmeDublado = horarioFilmeDublado;
	}
	public LocalDateTime getHorarioFilmeLegendado() {
		return horarioFilmeLegendado;
	}
	public void setHorarioFilmeLegendado(LocalDateTime horarioFilmeLegendado) {
		this.horarioFilmeLegendado = horarioFilmeLegendado;
	}
	
}