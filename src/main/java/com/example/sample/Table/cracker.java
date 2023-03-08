package com.example.sample.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cracker_details")
public class cracker {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="pieces")
	private int pieces;
	@Column(name="price")
	private float price;
	@Column(name="saleType")
	private String saleType;
	@Column(name="ageRestrictions")
	private String ageRestrictions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	public String getAgeRestrictions() {
		return ageRestrictions;
	}
	public void setAgeRestrictions(String ageRestrictions) {
		this.ageRestrictions = ageRestrictions;
	}
	public cracker(int id, String name, int pieces, float price, String saleType, String ageRestrictions) {
		super();
		this.id = id;
		this.name = name;
		this.pieces = pieces;
		this.price = price;
		this.saleType = saleType;
		this.ageRestrictions = ageRestrictions;
	}
	public cracker() {
		
	}
}
