package com.devsuperior.bds02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.entities.Event;
import com.devsuperior.bds02.services.EventService;

@RestController
@RequestMapping("events")
public class EventController {
	
	
	@Autowired
	private EventService service;
	
	@GetMapping
	public ResponseEntity<List<Event>> findAll() {
		List<Event> result = service.findAll();
		return ResponseEntity.ok(result);
	}

}
