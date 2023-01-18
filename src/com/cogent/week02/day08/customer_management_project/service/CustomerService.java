package com.cogent.week02.day08.customer_management_project.service;

import com.cogent.week02.day08.customer_management_project.dao.CustomerDAO;
import com.cogent.week02.day08.customer_management_project.exception.CustomerIdNotFoundException;
import com.cogent.week02.day08.customer_management_project.exception.NoCustomersExistException;

public class CustomerService {

    CustomerDAO dao;
    public CustomerService() {
        this.dao = new CustomerDAO();
    }

    public void save() {
        dao.create();
    }

    public void fetch() throws NoCustomersExistException {
        dao.read();
    }

    public void modify(int cid) throws CustomerIdNotFoundException, NoCustomersExistException {
        dao.update(cid);
    }

    public void remove(int cid) throws CustomerIdNotFoundException, NoCustomersExistException {
        dao.delete(cid);
    }

    public void findYoungestCustomer() throws NoCustomersExistException {
        dao.findYoungestCustomer();
    }

    public void findCustomerById(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException {
        dao.getCustomerById(customerId);
    }
}
