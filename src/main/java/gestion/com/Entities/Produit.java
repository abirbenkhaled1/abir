package gestion.com.Entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit  implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String type;
	private String quantite;
	private String disponibilité;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit( String nom, String type, String quantite, String disponibilité) {
		super();
	
		this.nom = nom;
		this.type = type;
		this.quantite = quantite;
		this.disponibilité = disponibilité;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getDisponibilité() {
		return disponibilité;
	}
	public void setDisponibilité(String disponibilité) {
		this.disponibilité = disponibilité;
	}
	
}
