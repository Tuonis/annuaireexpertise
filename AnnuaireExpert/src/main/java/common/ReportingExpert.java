package common;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReportingExpert implements Serializable {

	private String nom;
	private String prenom;
	private Date dateDispo;
	private List<String> listeDomaine;
	
	public ReportingExpert(String nom, String prenom, Date dateDispo,
			List<String> listeDomaine) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDispo = dateDispo;
		this.listeDomaine = listeDomaine;
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
	public Date getDateDispo() {
		return dateDispo;
	}
	public void setDateDispo(Date dateDispo) {
		this.dateDispo = dateDispo;
	}
	public List<String> getListeDomaine() {
		return listeDomaine;
	}
	public void setListeDomaine(List<String> listeDomaine) {
		this.listeDomaine = listeDomaine;
	}
	
}
