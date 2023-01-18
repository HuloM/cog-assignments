package com.cogent.week02.day08.customer_management_project.dao;

import com.cogent.week02.day08.customer_management_project.exception.CustomerIdNotFoundException;
import com.cogent.week02.day08.customer_management_project.exception.NoCustomersExistException;

public interface ICustomerDAO {
    public void create();
    public void read() throws NoCustomersExistException;
    public void update(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException;
    public void delete(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException;

    public void getCustomerById(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException;
    public void findYoungestCustomer() throws NoCustomersExistException;
}
