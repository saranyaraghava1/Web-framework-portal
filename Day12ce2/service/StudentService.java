package com.example.sample.Day12ce2.service;



import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import com.example.sample.Day12ce2.model.Student;

@Service
public class StudentService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Student> getStudentsInnerJoin() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
        root.fetch("studentDetail");
        query.select(root);
        return entityManager.createQuery(query).getResultList();
    }

    public List<Student> getStudentsLeftOuterJoin() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
        root.fetch("studentDetail", jakarta.persistence.criteria.JoinType.LEFT);
        query.select(root);
        return entityManager.createQuery(query).getResultList();
    }
}


