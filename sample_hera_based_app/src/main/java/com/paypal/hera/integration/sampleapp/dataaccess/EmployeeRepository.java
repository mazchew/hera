package com.paypal.hera.integration.sampleapp.dataaccess;

import com.paypal.hera.integration.sampleapp.dataaccess.entity.EmployeeEntity;

import javax.sql.DataSource;

/**
 * EmployeeRepository: interface to the application to talk to database layer.
 */

public interface EmployeeRepository {
    /**
     * Find by ID Interface returns one EmployeeEntity
     *
     * @param id where constraint for SQL
     *
     * @return EmployeeEntity

     */
    EmployeeEntity findById(Integer id, boolean odak);

    EmployeeEntity findByName(String name, boolean odak);

    /**
     * Update by ID Interface returns number of rows affected
     *
     * @param employee object to update
     *
     * @return int 
     */
    int updateById(EmployeeEntity employee);

    /**
     * interface for insert including all columns
     * @param employee object to insert
     *
     * @return number of rows inserted
     */
    int insert(final EmployeeEntity employee, final boolean odak);

    Integer maxId();

    DataSource getDataSource();
}