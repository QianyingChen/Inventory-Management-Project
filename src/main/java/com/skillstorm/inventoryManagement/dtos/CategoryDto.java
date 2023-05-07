package com.skillstorm.inventoryManagement.dtos;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.skillstorm.inventoryManagement.models.Category;

public class CategoryDto {
	private Long id;

    @NotBlank(message = "Category name is required")
    @Size(max = 255, message = "Category name cannot be longer than 255 characters")
    private String name;

    private List<Long> itemIds;

    public CategoryDto() {
    }

    public CategoryDto(Long id, String name, List<Long> itemIds) {
        this.id = id;
        this.name = name;
        this.itemIds = itemIds;
    }

	public CategoryDto(Category category) {
		this.id = category.getId();
		this.name = category.getName();
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

	public List<Long> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<Long> itemIds) {
		this.itemIds = itemIds;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryDto other = (CategoryDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "CategoryDto [id=" + id + ", name=" + name + "]";
	}
    
    

}
