/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.domain;

import com.employees.management.models.employeesummary.DeveloperSummary;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author proje
 */
public interface DeveloperSummaryrepo extends CrudRepository<DeveloperSummary, Integer>{
    
}