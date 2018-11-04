package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class medicineController {
@Autowired
	private medicineDao dao;
	@RequestMapping("savemedicine")
public void savemedicine(@RequestBody List<medicine> med) {
	dao.saveAll(med);
}
}
