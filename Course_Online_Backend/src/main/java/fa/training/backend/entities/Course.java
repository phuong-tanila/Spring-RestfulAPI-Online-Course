package fa.training.backend.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "course")
public class Course extends BaseEntity {
	@Column(length = Integer.MAX_VALUE)
	public String courseName;
	@Column(length = Integer.MAX_VALUE)
	public String description;
	@Column(length = Integer.MAX_VALUE)
	public String objective;
	@Column(length = Integer.MAX_VALUE)
	public String suitable;
	@Column
	public int slot;
	@Column
	public int tuitionFee;
	@Column(length = Integer.MAX_VALUE)
	public String imageUrl;
	@Column
	public Date createDate;
	@Column
	public Date startDate;
	@Column
	public Date endDate;
	@Column
	public boolean status;
	@Column
	public Date lastUpdateDate;

	@ManyToOne
	@JoinColumn(name = "create_by", referencedColumnName = "id")
	public User createBy;
	@ManyToOne
	@JoinColumn(name = "teacher_id", referencedColumnName = "id")
	public User teacher;
	@ManyToOne
	@JoinColumn(name = "last_update_user", referencedColumnName = "id")
	public User lastUpdateUser;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	public Set<OrderDetail> orderDetails;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CategoryCourse", joinColumns = {@JoinColumn(referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")})
	public Set<Category> categories;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	public Set<Feedback> feedbacks;
	
	
}
