package com.example.sample.Day12ce1.service;


import com.example.sample.Day12ce1.model.Employee;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getEmployeesInnerJoin() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);
        root.fetch("address");
        query.select(root);
        return entityManager.createQuery(query).getResultList();
    }

    public List<Employee> getEmployeesLeftOuterJoin() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);
        root.fetch("address", jakarta.persistence.criteria.JoinType.LEFT);
        query.select(root);
        return entityManager.createQuery(query).getResultList();
    }
}


