package fa.training.backend.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public int id;
	@Column(length = Integer.MAX_VALUE)
	public String comment;
	@Column
	public int rating;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "order_detail_id")
	public OrderDetail orderDetail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	public Course  course;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "user_id", referencedColumnName = "id")
	public User user;
}
