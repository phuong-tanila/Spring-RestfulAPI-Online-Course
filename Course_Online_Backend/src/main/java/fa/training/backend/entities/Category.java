package fa.training.backend.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@Table(name = "category")
public class Category extends BaseEntity{
	@Column(length = Integer.MAX_VALUE)
	public String categoryName;
	@ManyToMany(mappedBy = "categories")
	public Set<Course> courses;
}
