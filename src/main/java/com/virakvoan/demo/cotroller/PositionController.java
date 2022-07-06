package com.virakvoan.demo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virakvoan.demo.model.position;
import com.virakvoan.demo.service.PositionService;

@RestController
@RequestMapping("/api")

public class PositionController {
	 @Autowired
     PositionService posService;
	 
	 @RequestMapping(value="/positions", method=RequestMethod.POST)
	 public position createPosition(@RequestBody position pos) {
	     return posService.createposition(pos);
	 }
	 
	 @RequestMapping(value="/positions", method=RequestMethod.GET)
	 public List<position> readPositions() {
	     return posService.getpositions();
	 }

	 @RequestMapping(value="/positions/{ID}", method=RequestMethod.DELETE)
	 public void deleteEmployees(@PathVariable(value = "ID") Long id) {
	     posService.deleteposition(id);
	 }
}
