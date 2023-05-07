package com.skillstorm.inventoryManagement.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.skillstorm.inventoryManagement.dtos.InventoryDto;
import com.skillstorm.inventoryManagement.dtos.ItemDto;
import com.skillstorm.inventoryManagement.dtos.TransactionDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "inventories")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "max_capacity", nullable = false)
    private Integer maxCapacity;

    @Column(name = "current_quantity", nullable = false)
    private Integer currentQuantity;

    @ManyToOne
    @JoinColumn(name = "warehouse_id", nullable = false)
    private Warehouse warehouse;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL)
    private List<ItemDto> items;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL)
    private List<TransactionDto> transactions;

    public Inventory() {
		
	}

	public Inventory(Long id, String name, Integer maxCapacity, Integer currentQuantity, Warehouse warehouse,
			List<ItemDto> items, List<TransactionDto> transactions) {
		super();
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.currentQuantity = currentQuantity;
		this.warehouse = warehouse;
		this.items = items;
		this.transactions = transactions;
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

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Integer getCurrentQuantity() {
		return currentQuantity;
	}

	public void setCurrentQuantity(Integer currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
		this.items = items;
	}

	public List<TransactionDto> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDto> transactions) {
		this.transactions = transactions;
	}
	
	public InventoryDto toDto() {
		return new InventoryDto(id, name, maxCapacity,
			currentQuantity, warehouse.getId(), items,
			transactions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", maxCapacity=" + maxCapacity + ", currentQuantity="
				+ currentQuantity + ", warehouse=" + warehouse + ", items=" + items + ", transactions=" + transactions
				+ "]";
	}

	
    
    
}

