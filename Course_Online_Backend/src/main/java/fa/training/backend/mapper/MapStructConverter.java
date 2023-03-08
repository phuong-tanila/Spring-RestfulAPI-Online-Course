package fa.training.backend.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import fa.training.backend.entities.Course;
import fa.training.backend.model.CourseModel;

@Mapper(componentModel="spring")
public interface MapStructConverter {
	CourseModel sourceToDestination(Course course);
	Course destinationToSource(CourseModel destination);
}
