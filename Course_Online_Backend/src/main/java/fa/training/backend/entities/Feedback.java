package fa.training.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback extends BaseEntity {
	@Column(length = Integer.MAX_VALUE)
	private String comment;
	@Column
	private int rating;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "order_detail_id")
	private OrderDetail orderDetail;
	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	private Course  course;

	@ManyToOne
	@JoinColumn(name= "user_id", referencedColumnName = "id")
	private User user;
}
