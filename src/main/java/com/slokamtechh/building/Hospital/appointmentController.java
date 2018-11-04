package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appointmentController {
@Autowired
	private appointmentDao dao;
	
@RequestMapping("saveappointment")
   public void saveappointment(@RequestBody List<appointment> appo) {
	   dao.saveAll(appo);
   }
}
