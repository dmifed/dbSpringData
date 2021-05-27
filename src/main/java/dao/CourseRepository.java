package dao;

import org.springframework.data.repository.CrudRepository;

/**
 * @author dmifed
 */

// Course -- Entity type
// Integer - Primary key type
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
