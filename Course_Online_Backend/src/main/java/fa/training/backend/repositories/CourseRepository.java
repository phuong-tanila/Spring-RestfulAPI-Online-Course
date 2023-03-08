package fa.training.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.training.backend.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
//	public List<Course> findAll();

//	public Page<Course> findAll(Pageable pageable);

//	public List<Course> findCourseById(int id, Pageable pageable);

//	List<Course> findCourseByCategoryName(Category category);
	
}
