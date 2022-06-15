package com.surya.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.surya.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	// Query
	private static final String GET_EMPS_BY_DEGS = "SELECT  EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE JOB IN";
	@Autowired
	private DataSource ds;

	@Override
	public List<EmployeeBO> getEmpByDesg(String cond) throws Exception {
		List<EmployeeBO> listBO = null;
		System.out.println("DataSource object class name :: "+ds.getClass());
		try ( // get pooled jdbc con
				Connection con = ds.getConnection();
				// create Statement object
				Statement st = con.createStatement(); // preparedStatement object cannot be used here becoz number of
														// designations is dynamic value.
		) {
			// send and execute SQL Query in DB s/w.
			ResultSet rs = st.executeQuery(GET_EMPS_BY_DEGS + cond + " ORDER BY JOB ");
			// converts RS object records to List of BO class objects
			listBO = new ArrayList();
			EmployeeBO bo = null;
			while (rs.next()) {
				// copy of each record RS to a object of EmployeeBO class.
				bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(2));
				bo.setSal(rs.getDouble(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));
				// add each object of EmployeeBO to List Collection 
				listBO.add(bo);
			} // while 

		} // try
		catch (SQLException se) {
			se.printStackTrace();
			throw se; // Exception propagation  
		} catch (Exception e) {
         e.printStackTrace();
         throw e;
		}
		return listBO;
	}

}
