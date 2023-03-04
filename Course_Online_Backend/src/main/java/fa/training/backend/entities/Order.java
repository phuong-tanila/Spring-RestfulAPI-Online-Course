package fa.training.backend.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity{
	@Column
	private Date buyDate;
	@Column(length = Integer.MAX_VALUE)
	private String paymentMethod;
	@Column
	private Boolean paymentStatus;
	@Column(length = Integer.MAX_VALUE)
	private String coupon;
	@Column(length = Integer.MAX_VALUE)
	private String paymentId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	private Set<OrderDetail> orderDetails;
	
	

}
