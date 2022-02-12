package fr.orsys.kingsley.burgers.business;

public class Accompagnement {
	private Long id;
	private static Long compteur = 0L;
	private String name;
	private Double prix;
	private int quantity;
	private Double total;
	
	public Accompagnement(String name, Double prix) {
		this.name = name;
		this.prix = prix;
		this.quantity = 1;
		this.id = ++compteur;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total + (quantity * prix);
	}
	
	
}
