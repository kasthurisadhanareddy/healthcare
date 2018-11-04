package com.slokamtechh.building.Hospital;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class complantsController {
@Autowired
	private complantsDao dao;
	@RequestMapping("savecomplants")
public void savecomplants(@RequestBody  complants co) {
		List<medication> medicationlist=co.getMed();
		for (medication medication : medicationlist) {
			medication.setComm(co);
			
		}
	dao.save(co);
}
}
