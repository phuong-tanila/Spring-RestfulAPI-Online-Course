package fa.training.backend.mapper;

import fa.training.backend.entities.Feedback;
import fa.training.backend.model.FeedbackModel;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import fa.training.backend.entities.Course;
import fa.training.backend.model.CourseModel;

@Mapper(componentModel="spring")
public interface MapStructConverter {
	CourseModel sourceToDestination(Course course);
	Course destinationToSource(CourseModel destination);

	FeedbackModel feedbackToDto(Feedback feedback);

	Feedback DtoToFeedback(FeedbackModel feedbackModel);
}
