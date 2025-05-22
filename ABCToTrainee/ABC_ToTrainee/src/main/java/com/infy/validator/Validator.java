package com.infy.validator;

import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;

public class Validator {

	public static void validate(TeamMemberDTO teamMember) throws AbcException {
		if(validateEmployeeId(teamMember.getEmployeeId())) {
			throw new AbcException ("Validator.INVALID_EMPLOYEEID");
		}
}

	public static Boolean validateEmployeeId(Integer employeeId) throws AbcException {
		if(employeeId!=null && employeeId>0 && employeeId.toString().length()==6) {
			return false;
		}
		return true;
	}
}
