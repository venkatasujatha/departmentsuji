package com.tectoro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.DeptEntity.DeptModel;
import com.tectoro.DeptRepository.DeptReposit;
@Service
public class ServiceInterfaceImpl implements serviceInterface 
{
	@Autowired
	private DeptReposit deptModel;
	
	@Override
	public DeptModel save(DeptModel model) 
	{
		
		return deptModel.save(model);
	}

	@Override
	public List<DeptModel> getDeptModel(DeptModel model) 
	{
		
      return deptModel.findAll();
		
	}

	@Override
	public DeptModel update(int id) 
	{

		return deptModel.getById(id);
	}

	@Override
	public void delete(int id) 
	{
		
		 deptModel.deleteById(id);
	}
	
	public String palindrome(String name)
	{
		String s="sujatha";
		String t="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=0)
			{
			  t=t+s.charAt(i);
				 
			}
		}
		return t;
		
	}
}
