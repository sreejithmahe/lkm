/**
 * 
 */
package com.day03.activity03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.day03.activity03.entity.Car;

/**
 * @author sreejith.kizhakkayil
 *
 */


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query(name="CarDetails.getCarinfoById")
	public Car getCarInfoById(Integer carId) ;
}