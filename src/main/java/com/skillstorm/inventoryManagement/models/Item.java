package com.skillstorm.inventoryManagement.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.skillstorm.inventoryManagement.dtos.ItemDto;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "available_quantity", nullable = false)
    private Integer availableQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToMany(mappedBy = "items")
    private List<Inventory> inventories;

    public Item() {
		
	}
       

	public Item(Long id, String name, Integer availableQuantity, Category category, List<Inventory> inventories) {
		super();
		this.id = id;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.category = category;
		this.inventories = inventories;
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

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public List<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public ItemDto toDto() {
		return new ItemDto(id, name, availableQuantity, category.getId(), inventories);
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableQuantity, category, id, inventories, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(availableQuantity, other.availableQuantity) && Objects.equals(category, other.category)
				&& Objects.equals(id, other.id) && Objects.equals(inventories, other.inventories)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", availableQuantity=" + availableQuantity + ", category="
				+ category + ", inventories=" + inventories + "]";
	}

	
    
	
}
