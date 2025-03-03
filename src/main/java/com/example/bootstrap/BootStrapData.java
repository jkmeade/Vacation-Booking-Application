package com.example.bootstrap;

import com.example.dao.CustomerRepository;
import com.example.dao.DivisionRepository;
import com.example.entities.Customer;
import com.example.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
public class BootStrapData  implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Division division = new Division();
        division.setId(3L);
        division.setCountry_id(1L);
        List<Customer> customerList = customerRepository.findAll();
        Set<Customer> customerSet = new HashSet<>();
        Customer customer1 = new Customer("Joshua", "Meade", "800 street drive", "25762", "1111111111", division);
        customerSet.add(customer1);
        division.setCustomers(customerSet);
        if (!customerList.stream().anyMatch(o -> customer1.getLastName().equals(o.getLastName()))
){
            customerRepository.save(customer1);
            divisionRepository.save(division);
        }

        Division division2 = new Division();
        division2.setId(2L);
        division2.setCountry_id(1L);
        Set<Customer> customerSet2 = new HashSet<>();
        Customer customer2 = new Customer("Steven", "Cat", "700 street drive", "36762", "2111111111", division2);
        customerSet2.add(customer2);
        division2.setCustomers(customerSet2);
        if (!customerList.stream().anyMatch(o -> customer2.getLastName().equals(o.getLastName()))
){
            customerRepository.save(customer2);
            divisionRepository.save(division2);
        }

        Division division3 = new Division();
        division3.setId(7L);
        division3.setCountry_id(1L);
        Set<Customer> customerSet3 = new HashSet<>();
        Customer customer3 = new Customer("Mojo", "Dog", "600 street drive", "45762", "4111111111", division3);
        customerSet3.add(customer3);
        division3.setCustomers(customerSet3);
        if (!customerList.stream().anyMatch(o -> customer3.getLastName().equals(o.getLastName()))
){
            customerRepository.save(customer3);
            divisionRepository.save(division3);
        }

        Division division4 = new Division();
        division4.setId(4L);
        division4.setCountry_id(1L);
        Set<Customer> customerSet4 = new HashSet<>();
        Customer customer4 = new Customer("Brooke", "Mac", "500 street drive", "55762", "5111111111", division4);
        customerSet4.add(customer4);
        division4.setCustomers(customerSet4);
        if (!customerList.stream().anyMatch(o -> customer4.getLastName().equals(o.getLastName()))
){
            customerRepository.save(customer4);
            divisionRepository.save(division4);
        }

        Division division5 = new Division();
        division5.setId(5L);
        division5.setCountry_id(1L);
        Set<Customer> customerSet5 = new HashSet<>();
        Customer customer5 = new Customer("Millie", "M", "100 street drive", "95762", "9111111111", division5);
        customerSet5.add(customer5);
        division5.setCustomers(customerSet5);
        if (!customerList.stream().anyMatch(o -> customer5.getLastName().equals(o.getLastName()))
){
            customerRepository.save(customer5);
            divisionRepository.save(division5);
        }
    }
}
