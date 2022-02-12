package fr.orsys.kingsley.burgers.business;

public class Burger {
	private Long id;
	private static Long compteur = 0L;
	private String name;
	private Double prix;

	public Burger(String name, Double prix) {
		this.id = ++compteur;
		this.name = name;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Burger [id=" + id + ", name=" + name + ", prix=" + prix + "]";
	}

	
}
