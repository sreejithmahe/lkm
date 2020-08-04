package com.day02.activity02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day02.activity02.dto.CarDTO;
import com.day02.activity02.entity.Car;
import com.day02.activity02.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	

	
	public List<CarDTO> getCarDetails() {
		List<Car> carDAO = carRepository.findAll();
		List<CarDTO> carDTO = new ArrayList<CarDTO>();
		for(Car car : carDAO) {
			CarDTO carDto = new CarDTO();
			BeanUtils.copyProperties(car, carDto);
			carDTO.add(carDto);
		}
		return carDTO;
	}
	public Optional<Car> getCarDetailsById(Integer id) {
		return carRepository.findById(id);
	}

	public List<CarDTO> updateCarDetails(List<Car> c) {
			carRepository.saveAll(c);
  		    return getCarDetails();
	}
	public String deleteCarDetails(Integer id) {
		try {
		carRepository.deleteById(id);
		}catch(Exception e) {
			return "Id does not exist ";
		}
		return "Done";
	}


}
