package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class diseaseController {
@Autowired
	private diseaseDao dao;
	@RequestMapping("savedisease")
public void savedisease(@RequestBody List<disease> de) {
	dao.saveAll(de);
}
}
