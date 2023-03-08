package fa.training.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fa.training.backend.entities.Category;
import fa.training.backend.entities.Course;
import fa.training.backend.exception.RecordNotFoundException;
import fa.training.backend.services.CategoryService;
import fa.training.backend.services.CourseService;
import org.springframework.http.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@RestController
//@RequestMapping(path="/JSON", produces="application/json")
public class CourseController {

	@Autowired
	public CourseService courseService;
	@Autowired
	public CategoryService categoryService;

//	@GetMapping("/courses/{id}")
//	public Course getCourseById(@PathVariable(value = "id") int id) {
//		return courseService.findById(id);
//	}
	@GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") int id)
                                                    throws RecordNotFoundException {
        Course course = courseService.findById(id);
 
        return new ResponseEntity<Course>(course, new HttpHeaders(), HttpStatus.OK);
    }
 
	@GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(
                        @RequestParam(defaultValue = "0") Integer pageNo,
                        @RequestParam(defaultValue = "5") Integer pageSize,
                        @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Course> listCourses = courseService.getAllCourses(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Course>>(listCourses, new HttpHeaders(), HttpStatus.OK);
    }
//	@GetMapping("/courses/sortbyrating")
//    public ResponseEntity<List<Course>> sortByRating(
//                        @RequestParam(defaultValue = "0") Integer pageNo,
//                        @RequestParam(defaultValue = "5") Integer pageSize,
//                        @RequestParam(defaultValue = "rating") String sortBy)
//    {
//        List<Course> listCourses = courseService.sortCoursesByRating(pageNo, pageSize, sortBy);
//
//        return new ResponseEntity<List<Course>>(listCourses, new HttpHeaders(), HttpStatus.OK);
//    }
	
	
//	@GetMapping(value = "/category/{categoryName}")
//    public List<Course> getCourseByCategory(String categoryName, Pageable pageable){
//		Category category= categoryService.getCategoryByName(categoryName);
//		List<Course> list= courseService.getCourseByCategoryName(category, pageable);
//     return  list;
//    }
//	@GetMapping(value = "/category/{categoryName}")
//	public List<Course> getCourseByCategory(String categoryName){
//		Category category= categoryService.getCategoryByName(categoryName);
//		List<Course> list= courseService.findCourseByCategoryName(category);
//		return list;
//		
//	}
	
	
	

}