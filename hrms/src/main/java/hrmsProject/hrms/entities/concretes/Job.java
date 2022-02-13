package hrmsProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="job_titles")
public class Job {
   
  @Id
  @GeneratedValue
  @Column(name="id")
  int id;
  
  @Column(name="title")
  String title;
  
    public Job() {
	
     }
  
    public Job(int id, String title) {
	super();
	this.id = id;
	this.title = title;
    }
} 
