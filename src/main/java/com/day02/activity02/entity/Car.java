/**
 * 
 */
package com.day02.activity02.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author sreejith.kizhakkayil
 *
 */
@Entity
@Table(name="CarDetails")
public class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8311965669633268074L;
	//@NotEmpty(message="{NotEmpty.cardetails.carName}") 
	private String carName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carId;
	private double price;
	private String model;
	
	public Car() {
		super();
	}

	
	public Car(String carName, Integer carId, double price, String model) {
		super();
		this.carName = carName;
		this.carId = carId;
		this.price = price;
		this.model = model;
	}


	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}


	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}


	/**
	 * @return the carId
	 */
	public Integer getCarId() {
		return carId;
	}


	/**
	 * @param carId the carId to set
	 */
	public void setCarId(Integer carId) {
		this.carId = carId;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carId=" + carId + ", price=" + price + ", model=" + model + "]";
	}
}
