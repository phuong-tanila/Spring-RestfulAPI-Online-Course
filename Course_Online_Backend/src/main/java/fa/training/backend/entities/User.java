package fa.training.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "users")
public class User extends BaseEntity{
	@Column
	private String password;
	@Column(length = Integer.MAX_VALUE)
	private String fullname;
	@Column
	private String phone;
	@Column(length = Integer.MAX_VALUE)
	private String email;
	@Column
	private String role;
	@Column(length = Integer.MAX_VALUE)
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "createBy")
	private Set<Course> courses;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Order> orders;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Feedback> feedbacks;
}
