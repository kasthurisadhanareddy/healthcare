package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doctorController {
@Autowired
	private doctorDao dao;
	@RequestMapping("savedoctor")
 public void savedoctor(@RequestBody List<doctor> doc) {
	dao.saveAll(doc);
}
}
