package fa.training.backend.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CourseModel {
	@JsonProperty
	public int id;
	public String courseName;
	public String description;
	public String objective;
	public String suitable;
	public int slot;
	public int tuitionFee;
	public String imageUrl;
	public Date createDate;
	public Date startDate;
	public Date endDate;
	public boolean status;
	public Date lastUpdateDate;
	
}
