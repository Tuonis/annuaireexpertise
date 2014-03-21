package common;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="domaine")
public class Domaine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_domaine")
	private int idDomaine;

	private String description;

	private String libelle;

	//bi-directional many-to-many association to Expert
	@ManyToMany
	@JoinTable(
		name="competence"
		, joinColumns={
			@JoinColumn(name="id_domaine")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_expert")
			}
		)
	private List<Expert> experts;

	public Domaine() {
	}

	public int getIdDomaine() {
		return this.idDomaine;
	}

	public void setIdDomaine(int idDomaine) {
		this.idDomaine = idDomaine;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Expert> getExperts() {
		return this.experts;
	}

	public void setExperts(List<Expert> experts) {
		this.experts = experts;
	}

}
