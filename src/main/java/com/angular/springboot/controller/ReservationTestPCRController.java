package com.angular.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.springboot.model.ReservationTestPCR;
import com.angular.springboot.repository.ReservationTestPCRRepository;

@RestController
@RequestMapping("api/v1/")
public class ReservationTestPCRController {
		@Autowired
		private ReservationTestPCRRepository reservationTestPCRRepository ;
		
		//get all reservations
		@GetMapping("/reservation_testpcr")
		public List<ReservationTestPCR> getAllReservations(){
		return reservationTestPCRRepository.findAll() ;
		}
		
}
