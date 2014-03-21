package common;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="expert")
public class Expert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_expert")
	private int idExpert;

	@Temporal(TemporalType.DATE)
	@Column(name="date_disponibilite")
	private Date dateDisponibilite;

	@Column(name="nom_expert")
	private String nomExpert;

	@Column(name="prenom_expert")
	private String prenomExpert;

	//bi-directional many-to-many association to Domaine
	@ManyToMany(mappedBy="experts")
	private List<Domaine> domaines;

	public Expert() {
	}

	public int getIdExpert() {
		return this.idExpert;
	}

	public void setIdExpert(int idExpert) {
		this.idExpert = idExpert;
	}

	public Date getDateDisponibilite() {
		return this.dateDisponibilite;
	}

	public void setDateDisponibilite(Date dateDisponibilite) {
		this.dateDisponibilite = dateDisponibilite;
	}

	public String getNomExpert() {
		return this.nomExpert;
	}

	public void setNomExpert(String nomExpert) {
		this.nomExpert = nomExpert;
	}

	public String getPrenomExpert() {
		return this.prenomExpert;
	}

	public void setPrenomExpert(String prenomExpert) {
		this.prenomExpert = prenomExpert;
	}

	public List<Domaine> getDomaines() {
		return this.domaines;
	}

	public void setDomaines(List<Domaine> domaines) {
		this.domaines = domaines;
	}

}