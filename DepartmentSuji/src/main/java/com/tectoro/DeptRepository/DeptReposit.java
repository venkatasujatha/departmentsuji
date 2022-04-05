package com.tectoro.DeptRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.DeptEntity.DeptModel;
@Repository
public interface DeptReposit extends JpaRepository<DeptModel, Integer>{

}
