package dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author dmifed
 */

@Service("SpringJpaCourseService")
@Repository
@Transactional
public class SpringJpaCourseService implements CourseService{
    private static final Log LOG = LogFactory.getLog(SpringJpaCourseService.class);

    @Autowired
    private CourseRepository courseRepository;

    public CourseRepository getCourseRepository() {
        return courseRepository;
    }

    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return new ArrayList<>((Collection<Course>) courseRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return courseRepository.findOne(id);
    }

    @Override
    public List<Course> findByTitle(String title) {
        return null;

    }

    @Override
    public void insert(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findLastId() {
        return 0;
    }
}
