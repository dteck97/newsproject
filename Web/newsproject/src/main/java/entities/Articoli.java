package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "articoli")
public class Articoli {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty(message = "Inserire autore")
	private String autore;
	@NotEmpty(message = "Inserire titolo")
	@Column(columnDefinition = "TEXT")
	private String titolo;
	@NotEmpty(message = "Inserire testo")
	@Column(columnDefinition = "TEXT")
	private String testo;
	@NotNull
	private LocalDate data;
	private boolean stato;
	private double predizione;
	
	
	public Articoli() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public boolean isStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
	}
	public double getPredizione() {
		return predizione;
	}
	public void setPredizione(double predizione) {
		this.predizione = predizione;
	}
	@Override
	public String toString() {
		return "Articoli [id=" + id + ", autore=" + autore + ", titolo=" + titolo + ", testo=" + testo + ", data="
				+ data + ", stato=" + stato + ", predizione=" + predizione + "]";
	}
	
	

}