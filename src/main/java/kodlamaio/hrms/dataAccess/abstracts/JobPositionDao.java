package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	
}
