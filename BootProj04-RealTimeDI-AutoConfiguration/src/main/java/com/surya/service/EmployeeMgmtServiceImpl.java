package com.surya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.bo.EmployeeBO;
import com.surya.dao.IEmployeeDAO;
import com.surya.dto.EmployeeDTO;

@Service("service")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
   @Autowired
  	private IEmployeeDAO dao;
   
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desgs) throws Exception {
	
		//convert  desg[] into  SQL IN  clause Condition ('CLERK','MANAGER')
		 StringBuilder  buffer = new StringBuilder("(");
		 for(int i=0;i<desgs.length;++i) {
			 if(i == desgs.length-1)  // for the last element of array
			   buffer.append("'"+desgs[i]+"')");
			 else
				 buffer.append("'"+desgs[i]+"',");  // for other than last element
		 } //for
		 //convert Stringbuffer / StringBuilder object into  String
		 String cond = buffer.toString();
		//use DAO
		 List<EmployeeBO> listBO = dao.getEmpByDesg(cond);
		 //convert ListBO to ListDTO
		 List<EmployeeDTO> listDTO = new ArrayList();
		 listBO.forEach(bo->{
			 EmployeeDTO dto = new EmployeeDTO();
			 
			 //copy each BO Class obj to each DTO class object
			 BeanUtils.copyProperties(bo, dto); //Propeties names and  type match in both java beans
			 
			 dto.setSrNo(listDTO.size()+1);
			 
			 //add each obj of DTO class to ListDTO
            listDTO.add(dto);
		 });
		return listDTO;
	}

}
