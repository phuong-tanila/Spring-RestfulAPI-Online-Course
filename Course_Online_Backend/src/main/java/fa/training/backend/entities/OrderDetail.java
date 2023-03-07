package fa.training.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "order_detail")
public class OrderDetail extends BaseEntity{
	@Column
	public int price;
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	public Order order;
	@OneToOne(mappedBy = "orderDetail")
	public Feedback feedback;
	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	public Course course;
}
