package com.slokamtechh.building.Hospital;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface patientDao extends JpaRepository<patient, Integer> {
	@Query(" select d.name,di.name,p.name from medication m join m.medicine me "
			+"join  m.comm c "
			+"join c.visi v "
			+"join v.app ap "
			+"join ap.pa p "
			+" join v.doc d "
			
		    +"join c.dis di "
			+"where me.name=?1")
	public List<Object[]> getpatientBymedicine(String medicinename);
	
}
