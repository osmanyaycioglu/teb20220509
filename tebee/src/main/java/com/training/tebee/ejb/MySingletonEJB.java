package com.training.tebee.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import com.training.tebee.rest.employee.models.Employee;

@Singleton
@LocalBean
public class MySingletonEJB {

    private int                   counter           = 0;
    private List<String>          list              = new ArrayList<>();
    private Map<String, Employee> map               = new HashMap<>();

    private List<String>          listThreadSafe    = new Vector<>();
    private List<String>          listThreadSafe2   = Collections.synchronizedList(new ArrayList<>());
    private AtomicInteger         integerThreadSafe = new AtomicInteger();
    private Map<String, Employee> mapThreadSafe     = new ConcurrentHashMap<>();

    public MySingletonEJB() {
    }

    @Lock(LockType.WRITE)
    public int getCounter() {
        counter++;
        list.add("counter" + counter);
        return counter;
    }

    @Lock(LockType.READ)
    public int getC() {
        return counter;
    }

    @PostConstruct
    public void xyz() {
        System.out.println("Init");
    }

    @PreDestroy
    public void abc() {
        System.out.println("Destroy");
    }


}
