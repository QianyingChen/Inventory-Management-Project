package com.skillstorm.inventoryManagement.dtos;

import java.util.Objects;

public class InventoryDto {

	private Long id;
    private String name;
    private Integer maxCapacity;
    private Integer currentQuantity;
    private WarehouseDto warehouse;

    public InventoryDto() {}

    public InventoryDto(Long id, String name, Integer maxCapacity, Integer currentQuantity, WarehouseDto warehouse) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentQuantity = currentQuantity;
        this.warehouse = warehouse;
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

	public WarehouseDto getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseDto warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentQuantity, id, maxCapacity, name, warehouse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventoryDto other = (InventoryDto) obj;
		return Objects.equals(currentQuantity, other.currentQuantity) && Objects.equals(id, other.id)
				&& Objects.equals(maxCapacity, other.maxCapacity) && Objects.equals(name, other.name)
				&& Objects.equals(warehouse, other.warehouse);
	}

	@Override
	public String toString() {
		return "InventoryDto [id=" + id + ", name=" + name + ", maxCapacity=" + maxCapacity + ", currentQuantity="
				+ currentQuantity + ", warehouse=" + warehouse + "]";
	}
    
    
}
