package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompanyByNameFragment() {
        //Given
        Company microsoft = new Company("Microsoft");
        companyDao.save(microsoft);
        //When
        List<Company> companies = searchFacade.searchCompanyByNameFragment("Micro");

        //Then
        assertTrue(companies.size() > 0);

        //Cleanup
        companyDao.deleteAll();
    }

    @Test
    public void testSearchEmployeeBySurnameFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        //When
        List<Employee> employees = searchFacade.searchEmployeeBySurnameFragment("Smi");
        //Then
        assertTrue(employees.size() > 0);
        //Cleanup
        employeeDao.deleteAll();
    }
}

