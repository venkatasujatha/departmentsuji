package com.tectoro.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tectoro.DeptEntity.DeptModel;

public interface serviceInterface 
{
	public DeptModel save(DeptModel model);
	public List<DeptModel> getDeptModel(DeptModel model);
	public DeptModel update(@PathVariable int id);
	public void delete(@PathVariable int id);
	public String palindrome(String name);
}
