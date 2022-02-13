package hrmsProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.JobService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.SuccessDataResult;
import hrmsProject.hrms.dataAccess.abstracts.JobDao;
import hrmsProject.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	 JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getAll() {
		return  new SuccessDataResult<List<Job>>(this.jobDao.findAll(), "İş Pozisyonları Başarıyla Listelendi.");  
	}

}
