package com.skillstorm.inventoryManagement.dtos;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class TransactionDto {
    private Long id;

    @NotNull
    @Size(min = 2, max = 50)
    private String transactionType;

    @NotNull
    private LocalDateTime transactionDate;

    @NotNull
    @Positive
    private Integer quantity;

    @NotNull
    private Long itemId;

    @NotNull
    private Long inventoryId;

    @NotNull
    private Long userId;
    

	public TransactionDto() {
		super();
	}


	public TransactionDto(Long id, String transactionType,
			LocalDateTime transactionDate, Integer quantity, Long itemId,
			Long inventoryId, Long userId) {
		super();
		this.id = id;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.quantity = quantity;
		this.itemId = itemId;
		this.inventoryId = inventoryId;
		this.userId = userId;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public Long getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, inventoryId, itemId, quantity, transactionDate, transactionType, userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionDto other = (TransactionDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(inventoryId, other.inventoryId)
				&& Objects.equals(itemId, other.itemId) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(transactionDate, other.transactionDate)
				&& Objects.equals(transactionType, other.transactionType) && Objects.equals(userId, other.userId);
	}


	@Override
	public String toString() {
		return "TransactionDto [id=" + id + ", transactionType=" + transactionType + ", transactionDate="
				+ transactionDate + ", quantity=" + quantity + ", itemId=" + itemId + ", inventoryId=" + inventoryId
				+ ", userId=" + userId + "]";
	}
	
	
    
    
}
