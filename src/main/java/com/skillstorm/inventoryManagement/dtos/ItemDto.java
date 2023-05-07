package com.skillstorm.inventoryManagement.dtos;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.skillstorm.inventoryManagement.models.Inventory;
import com.skillstorm.inventoryManagement.models.Item;

public class ItemDto {
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotNull
    @Min(0)
    private Integer availableQuantity;

    @NotNull
    private CategoryDto category;

    @NotNull
    private List<Long> inventoryIds;

    public ItemDto() {
    }

    public ItemDto(Item item) {
        this.id = item.getId();
        this.name = item.getName();
        this.availableQuantity = item.getAvailableQuantity();
        this.category = new CategoryDto(item.getCategory());
        this.inventoryIds = item.getInventories().stream()
            .map(Inventory::getId)
            .collect(Collectors.toList());
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

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public List<Long> getInventoryIds() {
        return inventoryIds;
    }

    public void setInventoryIds(List<Long> inventoryIds) {
        this.inventoryIds = inventoryIds;
    }

	@Override
	public int hashCode() {
		return Objects.hash(availableQuantity, category, id, inventoryIds, name);
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
		return Objects.equals(availableQuantity, other.availableQuantity) && Objects.equals(category, other.category)
				&& Objects.equals(id, other.id) && Objects.equals(inventoryIds, other.inventoryIds)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", availableQuantity=" + availableQuantity + ", category="
				+ category + ", inventoryIds=" + inventoryIds + "]";
	}

	
	
    
    
    
}
