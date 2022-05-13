package com.training.tebee.rest.employee.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.training.tebee.rest.employee.models.Employee;

@Stateless
@LocalBean
public class EmployeeDao {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    //    @PersistenceUnit(unitName = "tebee")
    //    private EntityManagerFactory entityManagerFactory;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void insert(Employee employeeParam) {
        entityManager.persist(employeeParam);
        // employeeParam.setName("test");
        //        entityManager.getTransaction().begin();
        //        try {
        //            entityManager.persist(employeeParam);
        //            entityManager.getTransaction().commit();
        //        } catch (Exception eLoc) {
        //            entityManager.getTransaction().rollback();
        //        }
    }

    public void insertOther(Employee employeeParam) {
        entityManager.persist(employeeParam);
    }

    public List<Employee> getAll() {
        TypedQuery<Employee> createQueryLoc = entityManager.createQuery("select e from Employee e",
                                                                        Employee.class);
        return createQueryLoc.getResultList();
    }

    public Employee get(Long empId) {
        return entityManager.find(Employee.class,
                                  empId);
    }

    public List<Employee> getBySurname(String surname) {
        TypedQuery<Employee> createQueryLoc = entityManager.createQuery("select e from Employee e where e.surname=?1",
                                                                        Employee.class);
        createQueryLoc.setParameter(1,
                                    surname);
        return createQueryLoc.getResultList();

    }

    public List<Employee> getBySurnameNative(String surname) {
        Query createNativeQueryLoc = entityManager.createNativeQuery("select * from emp e where e.surname=?1",
                                                                     Employee.class);
        createNativeQueryLoc.setParameter(1,
                                          surname);
        return createNativeQueryLoc.getResultList();
    }

}

