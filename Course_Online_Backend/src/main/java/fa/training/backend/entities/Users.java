package fa.training.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "users")
public class Users extends BaseEntity{
	@Column
	private String password;
	@Column
	private String fullname;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String role;
	@Column
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Set<Course> courses;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Set<Order> orders;
}
