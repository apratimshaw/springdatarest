package springdatarest.entities;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String sku;
	private String name;
	private String description;
	
	public Product(){
		
	}
	
	public Product(long id, String sku, String name, String description) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
    @Override
    public String toString() {
        return String.format(
                "Product[SKU='%s', name='%s', description='%s']",
                sku, name, description);
    }
}
