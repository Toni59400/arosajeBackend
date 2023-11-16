package net.javaguides.gestion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUser")
    private Integer idUser;
	
	@Column(name="pseudo")
	private String pseudo;
	
	@Column(name="password")
    private String password;
	
	@Column(name="nom")
    private String nom;
	
	@Column(name="prenom")
    private String prenom;
	
	@Column(name="botaniste")
    private boolean botaniste;

	//GETTERS AND SETTERS 
    
    public Integer getIdUser() {
		return idUser;
	}
    
	public Users() {
	}

	public Users(String pseudo, String password, String nom, String prenom, boolean botaniste) {
		super();
		this.pseudo = pseudo;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.botaniste = botaniste;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public boolean isBotaniste() {
		return botaniste;
	}
	
	public void setBotaniste(boolean botaniste) {
		this.botaniste = botaniste;
	}
	
}
