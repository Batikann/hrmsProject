package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.entities.concretes.Job;

public interface JobService {
  List<Job> getAll();
}
