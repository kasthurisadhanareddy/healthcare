package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {
@Autowired
	private patientDao dao;
	@RequestMapping("savepatient")
public void savepatient(@RequestBody patient pa) {
	dao.save(pa);
}
	/*@RequestMapping("getpatientbymedicinename/{name}")
	public List<Object[]> getpatientbymedicinename(@PathVariable ("name") String medicinename){
		return dao.getpatientBymedicine(medicinename);
	}*/
}
