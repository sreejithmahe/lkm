/**
 * 
 */
package com.day03.activity03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.day03.activity03.dto.CarDTO;
import com.day03.activity03.entity.Car;
import com.day03.activity03.service.CarService;

/**
 * @author sreejith.kizhakkayil
 *
 */
@RestController
public class CarController {
	
	@Autowired
	CarService carService;
	
	@RequestMapping(value="/getCarinfo",produces = {"application/json","application/xml"},method = RequestMethod.GET)
	public ResponseEntity<List<CarDTO>> getCarDetails() {
		List<CarDTO> carInfoDetails = carService.getCarDetails();
		return new ResponseEntity<List<CarDTO>>(carInfoDetails,HttpStatus.OK);
	}

	@RequestMapping(value="/getCarinfo/{id}",produces = { "application/json", "application/xml" }, 
			method = RequestMethod.GET)
	public Car getCarDetails(@PathVariable Integer id) {
		return carService.getCarDetailsById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addCarinfo")
	public ResponseEntity<List<CarDTO>> addCarDetails(@RequestBody List<Car> car) {
		List<CarDTO> carInfoDetails = carService.updateCarDetails(car);
		return new ResponseEntity<List<CarDTO>>(carInfoDetails,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateCarinfo")
	public ResponseEntity<List<CarDTO>> updateCarDetails(@RequestBody List<Car> car) {
		List<CarDTO> carInfoDetails = carService.updateCarDetails(car);
		return new ResponseEntity<List<CarDTO>>(carInfoDetails,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteCarinfo/{id}")
	public String deleteCarDetails(@PathVariable Integer id) {
		return carService.deleteCarDetails(id);
	}

}
