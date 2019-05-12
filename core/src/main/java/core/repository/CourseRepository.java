package core.repository;


import core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * CourseRepository
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}