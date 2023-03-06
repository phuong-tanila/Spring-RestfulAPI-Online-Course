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
	private String courseName;
	@Column(length = Integer.MAX_VALUE)
	private String description;
	@Column(length = Integer.MAX_VALUE)
	private String objective;
	@Column(length = Integer.MAX_VALUE)
	private String suitable;
	@Column
	private int slot;
	@Column
	private int tuitionFee;
	@Column(length = Integer.MAX_VALUE)
	private String imageUrl;
	@Column
	private Date createDate;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private boolean status;
	@Column
	private Date lastUpdateDate;

	@ManyToOne
	@JoinColumn(name = "create_by", referencedColumnName = "id")
	private User createBy;
	@ManyToOne
	@JoinColumn(name = "teacher_id", referencedColumnName = "id")
	private User teacher;
	@ManyToOne
	@JoinColumn(name = "last_update_user", referencedColumnName = "id")
	private User lastUpdateUser;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private Set<OrderDetail> orderDetails;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CategoryCourse", joinColumns = {@JoinColumn(referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")})
	private Set<Category> categories;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private Set<Feedback> feedbacks;
	
	
}
