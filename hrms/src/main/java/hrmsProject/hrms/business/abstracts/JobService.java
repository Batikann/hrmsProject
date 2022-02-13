package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.entities.concretes.Job;

public interface JobService {
  DataResult<List<Job>>getAll();
}
