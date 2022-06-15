package com.surya.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.surya.dto.EmployeeDTO;
import com.surya.service.IEmployeeMgmtService;
import com.surya.vo.EmployeeVO;

@Controller("controller")
public class MainController { 
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<EmployeeVO> showEmpsByDesgs(String degs[] ) throws Exception{
		//use service
		List<EmployeeDTO>  listDTO = service.fetchEmpsByDesgs(degs);
		//convert ListDTO to ListVO
		List<EmployeeVO>  listVO = new ArrayList();
		listDTO.forEach(dto->{
			EmployeeVO vo = new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setSal(String.valueOf(dto.getSal()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setMgrNo(String.valueOf(dto.getMgrNo()));
			listVO.add(vo);
		});
		return listVO;
	}
} 
