package com.slokamtechh.building.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface appointmentDao extends JpaRepository<appointment, Long> {
	

}
