package com.ciq.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	@Id
	private Integer proid;
	private String productName;
	private Integer quntity;
	private Double price;
	private Double total;


}
