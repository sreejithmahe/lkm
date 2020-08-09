/**
 * 
 */
package com.day03.activity03.dto;

import java.io.Serializable;



/**
 * @author sreejith.kizhakkayil
 *
 */
public class CarDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2670378897458673328L;
	
	
	private String carName;
	private Integer carId;
	private double price;
	private String model;
	
	public CarDTO() {
		super();
	}

	
	public CarDTO(String carName, Integer carId, double price, String model) {
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
