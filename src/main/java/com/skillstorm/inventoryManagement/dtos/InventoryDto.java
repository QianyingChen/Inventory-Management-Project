package com.skillstorm.inventoryManagement.dtos;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InventoryDto {
    @NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    @Min(0)
    private Integer maxCapacity;

    @NotNull
    @Min(0)
    private Integer currentQuantity;

    @NotNull
    private Long warehouseId;

    private List<ItemDto> items;

    private List<TransactionDto> transactions;

    public InventoryDto() {}

	public InventoryDto(Long id, String name, Integer maxCapacity,
			Integer currentQuantity, Long warehouseId, List<ItemDto> items,
			List<TransactionDto> transactions) {
		super();
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.currentQuantity = currentQuantity;
		this.warehouseId = warehouseId;
		this.items = items;
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentQuantity, id, items, maxCapacity, name, transactions, warehouseId);
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
				&& Objects.equals(items, other.items) && Objects.equals(maxCapacity, other.maxCapacity)
				&& Objects.equals(name, other.name) && Objects.equals(transactions, other.transactions)
				&& Objects.equals(warehouseId, other.warehouseId);
	}

	@Override
	public String toString() {
		return "InventoryDto [id=" + id + ", name=" + name + ", maxCapacity=" + maxCapacity + ", currentQuantity="
				+ currentQuantity + ", warehouseId=" + warehouseId + ", items=" + items + ", transactions="
				+ transactions + "]";
	}

    
}
