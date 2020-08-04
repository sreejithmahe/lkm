/**
 * 
 */
package com.day02.activity02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day02.activity02.entity.Car;

/**
 * @author sreejith.kizhakkayil
 *
 */


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}