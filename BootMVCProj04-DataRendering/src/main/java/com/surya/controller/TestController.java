package com.surya.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.surya.model.Employee;

@Controller
public class TestController {
    
	
	/*@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		//add model attributes ( Simple Values )
		map.put("name","raja");
		map.put("age",22);
		map.put("addrs", "hyd");
		//return LVN
		return "show_report";
	}*/
	
	/*@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		// add model attributes ( Arrays And Collection )
		String nickNames[] = new String[]{"raja","jani","ramesh","suresh"};
		Set<Long> mobilePhooneSet = new HashSet();
		mobilePhooneSet.add(9999988888L);
		mobilePhooneSet.add(9999977777L);
		List<String> coursesList = List.of("java","Spring","Spring Boot","hibernate");
		Map<String,Long> idsMap = Map.of("aadhar",4543535L,
				                                                      "voterid",5354354353L,
				                                                      "panNo",453582535L );
		map.put("nickNames",nickNames);
		map.put("phonesinfo", mobilePhooneSet);
		map.put("coursesinfo", coursesList);
		map.put("idsinfo", idsMap);
		
		//return LVN
		return "show_report";
	}
	*/	
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		List<Employee> empsList = List.of(new Employee(101,"Raja","clerk",90000.0),
				                                                 new Employee(102,"Rajesh","developer",190000.0),
				                                                 new Employee(103,"Anil","TeamLeader",180000.0)
				                                               );
		map.put("empsinfo", empsList);
		//return LVN
		return "show_report";
	}
}
