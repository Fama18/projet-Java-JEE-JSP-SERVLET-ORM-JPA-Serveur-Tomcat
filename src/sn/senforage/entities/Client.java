package sn.senforage.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nomFamille;
	@Column
	private String adresse;
	@Column
	private String telephone;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(int id, String nomFamille, String adresse, String telephone) {
		super();
		this.id = id;
		this.nomFamille = nomFamille;
		this.adresse = adresse;
		this.telephone = telephone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomFamille() {
		return nomFamille;
	}


	public void setNomFamille(String nomFamille) {
		this.nomFamille = nomFamille;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
