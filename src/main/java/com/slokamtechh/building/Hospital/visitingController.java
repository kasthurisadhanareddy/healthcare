package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visitingController {
@Autowired
	private visitingDao dao;
	@RequestMapping("savevisiting")
public void savevisiting(@RequestBody List<visiting> vis) {
	dao.saveAll(vis);
}
}
