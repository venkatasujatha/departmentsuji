package com.tectoro.DeprtController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.DeptEntity.DeptModel;
import com.tectoro.DeptRepository.DeptReposit;
import com.tectoro.dao.ServiceInterfaceImpl;
import com.tectoro.dao.serviceInterface;
@RestController
public class DeptController 
{
	@Autowired
	serviceInterface serInter;
	@PostMapping("/save")
	public DeptModel save(@RequestBody DeptModel model) 
	{
		
		return serInter.save(model);
	}
	@GetMapping("/get")
	public List<DeptModel> getDeptModel( DeptModel model)
	{
		return serInter.getDeptModel(model);
	}
	@PutMapping("/update/{id}")
	public DeptModel update(@PathVariable int id)
	{
		return serInter.update(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		serInter.delete(id);
		return;
		
	}
	@GetMapping("/palin/{name}")
	public String palindrome(@PathVariable String name)
	{
		return serInter.palindrome(name);
		
	}
	
}
