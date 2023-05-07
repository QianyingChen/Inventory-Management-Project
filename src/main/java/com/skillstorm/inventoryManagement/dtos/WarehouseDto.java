package com.skillstorm.inventoryManagement.dtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.skillstorm.inventoryManagement.models.Inventory;

public class WarehouseDto {
	private Long id;
	@NotBlank
    private String name;
	
	@NotBlank
    private String address;
	
	@NotBlank
    private String contactPerson;
	
	@NotBlank
	@Pattern(regexp="^\\+(?:[0-9] ?){6,14}[0-9]$")
    private String phoneNumber;
	
    private List<InventoryDto> inventories;

    public WarehouseDto() {
    }
       
	public WarehouseDto(Long id, String name, String address, String contactPerson, String phoneNumber, List<InventoryDto> inventories) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.phoneNumber = phoneNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<InventoryDto> getInventories() {
		return inventories;
	}

	public void setInventories(List<InventoryDto> inventories) {
		this.inventories = inventories;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, contactPerson, id, inventories, name, phoneNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WarehouseDto other = (WarehouseDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(contactPerson, other.contactPerson)
				&& Objects.equals(id, other.id) && Objects.equals(inventories, other.inventories)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}


	@Override
	public String toString() {
		return "WarehouseDto [id=" + id + ", name=" + name + ", address=" + address + ", contactPerson=" + contactPerson
				+ ", phoneNumber=" + phoneNumber + ", inventories=" + inventories + "]";
	}


	

    
    
    
}
