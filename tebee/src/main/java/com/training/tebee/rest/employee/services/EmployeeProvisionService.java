package com.training.tebee.rest.employee.services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.Transactional;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.ws.rs.PathParam;

import com.training.tebee.ejb.MySingletonEJB;
import com.training.tebee.rest.employee.data.EmployeeDao;
import com.training.tebee.rest.employee.models.Employee;

@Singleton
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
public class EmployeeProvisionService {

    @EJB
    private EmployeeDao    employeeDao;

    @EJB
    private MySingletonEJB mySingletonEJB;

    @Transactional(dontRollbackOn = {
                                      IllegalAccessError.class,
                                      IllegalCallerException.class
    })
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void activate(Employee employeeParam) {
        employeeDao.insert(employeeParam);
        employeeDao.insertOther(employeeParam);
    }

    public void deactivate(@NotEmpty @Positive @PathParam("empId") Long empId) {
    }

    public void suspend(@PathParam("empId") Long empId) {
    }

    public void updateEmployee(Employee employeeParam) {
    }

}
