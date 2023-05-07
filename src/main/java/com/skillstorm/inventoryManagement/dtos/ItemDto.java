package com.skillstorm.inventoryManagement.dtos;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemDto {
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotNull
    @Min(0)
    private Integer availableQuantity;

    @NotNull
    private Long categoryId;

    @NotNull
    private Long inventoryId;

    public ItemDto() {
    }

    public ItemDto(Long id, String name, Integer availableQuantity, Long categoryId, Long inventoryId) {
        this.id = id;
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.categoryId = categoryId;
        this.inventoryId = inventoryId;
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableQuantity, categoryId, id, inventoryId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemDto other = (ItemDto) obj;
		return Objects.equals(availableQuantity, other.availableQuantity)
				&& Objects.equals(categoryId, other.categoryId) && Objects.equals(id, other.id)
				&& Objects.equals(inventoryId, other.inventoryId) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", availableQuantity=" + availableQuantity + ", categoryId="
				+ categoryId + ", inventoryId=" + inventoryId + "]";
	}
    
    
    
}
