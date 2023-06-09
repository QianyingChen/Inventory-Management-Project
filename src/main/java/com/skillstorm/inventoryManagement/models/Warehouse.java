package com.skillstorm.inventoryManagement.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.skillstorm.inventoryManagement.dtos.InventoryDto;
import com.skillstorm.inventoryManagement.dtos.WarehouseDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "warehouses")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private List<InventoryDto> inventories;

	public Warehouse() {
		
	}
	
	public Warehouse(Long id, String name, String address, String contactPerson, String phoneNumber,
			List<InventoryDto> inventories) {
		super();
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
	
	//Method that converts the entity into the DTO 
	//DTO call warehouse into warehouseDto
	public WarehouseDto toDto() {
		return new WarehouseDto (id, name, address, contactPerson, phoneNumber, inventories);
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
		Warehouse other = (Warehouse) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", name=" + name + ", address=" + address + ", contactPerson=" + contactPerson
				+ ", phoneNumber=" + phoneNumber + ", inventories=" + inventories + "]";
	}

    
}

