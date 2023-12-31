package org.java.app.db.pojo;

import org.hibernate.validator.constraints.Length;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true, nullable = false, length = 80)
	@NotBlank(message = "campo obbligatorio ")
	@Length(min = 4, max = 80 ,message = "parola troppo lunga o troppo corta")
	private String nome;

	@Column(columnDefinition = "text")
	@Length(min = 10, max = 160,message = "parola troppo lunga o troppo corta")
	private String descrizione;

	@Column(nullable = false)
	@Positive(message = "numero deve essere maggiore di 0 ")
	private float prezzo;

	@Column(unique = true, length = 1000)
	private String foto;

	public Pizza() {
	}

	public Pizza(String nome, String descrizione, String foto, float prezzo) {
		setNome(nome);
		setDescrizione(descrizione);
		setFoto(foto);
		setPrezzo(prezzo);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {

		return "[";
	}
}