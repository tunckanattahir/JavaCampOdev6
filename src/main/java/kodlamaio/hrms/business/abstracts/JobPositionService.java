package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concrates.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
