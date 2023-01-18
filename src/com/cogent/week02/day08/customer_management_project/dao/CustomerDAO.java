package com.cogent.week02.day08.customer_management_project.dao;

import com.cogent.week02.day08.customer_management_project.exception.CustomerIdNotFoundException;
import com.cogent.week02.day08.customer_management_project.exception.NoCustomersExistException;
import com.cogent.week02.day08.customer_management_project.model.Customer;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CustomerDAO implements ICustomerDAO {
    Customer[] customers;
    Scanner sc = new Scanner(System.in);
    int count = 0;
    @Override
    public void create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many customers do you want to add?");
        int size = sc.nextInt();

        customers = new Customer[size];

        for (int i = 0; i < size; i++)
            customers[count++] = createUpdateCustomer();

        System.out.println(size + " Customers Successfully added");
    }

    @Override
    public void read() throws NoCustomersExistException {
        isNoCustomerExist();
        System.out.println("Here are the following customers present: ");
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void update(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException {

        int index = findbyId(customerId);
        Customer customer = createUpdateCustomer(customerId);

        customers[index] = customer;

        System.out.println("Customer Successfully Updated");
    }

    @Override
    public void delete(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException {
        customers[findbyId(customerId)] = null;
        count--;

        System.out.println("Customer Successfully Deleted");
    }

    @Override
    public void getCustomerById(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException {
        System.out.println("customer found: " + customers[findbyId(customerId)]);
    }

    @Override
    public void findYoungestCustomer() throws NoCustomersExistException {
        isNoCustomerExist();
        int youngest = 0;
        for (int i = 0; i < customers.length; i++) {
            if(customers[youngest].getcDob().after(customers[i].getcDob()))
                youngest = i;
        }
        System.out.println("Youngest Customer: " + customers[youngest].toString());
    }

    private int findbyId(int customerId) throws CustomerIdNotFoundException, NoCustomersExistException {
        isNoCustomerExist();
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] == null) throw new CustomerIdNotFoundException();
            else if (customers[i].getcId() == customerId) {
                index = i;
                break;
            }
        }
        if (index == -1) throw new CustomerIdNotFoundException();
        return index;
    }


    private Date getDob(String dob) {
        String[] date = dob.split("/");
        return new Date(Integer.parseInt(date[2]) - 1900,
        Integer.parseInt(date[1]),
        Integer.parseInt(date[0]));
    }

    private Customer createUpdateCustomer() {
        System.out.println("Please enter the Customer id");
        int id = sc.nextInt();

        return createUpdateInputs(id);
    }

    private Customer createUpdateCustomer(int id) {
        return createUpdateInputs(id);
    }

    private Customer createUpdateInputs(int id) {
        System.out.println("Please enter the Customer email");
        String email = sc.next();

        System.out.println("Please enter the Customer name");
        String name = sc.next();

        System.out.println("Please enter the Customer date of birth dd/mm/yyyy");
        String date = sc.next();
        Date dateOfBirth = getDob(date);

        return new Customer(id, email, name, dateOfBirth);
    }

    private void isNoCustomerExist() throws NoCustomersExistException {
        if (this.count == 0) throw new NoCustomersExistException();
    }
}
