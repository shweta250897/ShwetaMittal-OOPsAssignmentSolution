package com.greatlearning;

import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td= new TechDepartment();
		
		System.out.println("Welcome to "+ ad.departmentName() + "\n"
				+ ad.getTodaysWork() + "\n"
				+ ad.getWorkDeadline() + "\n"
				+ ad.isTodayAHoliday() + "\n");
		
		System.out.println("Welcome to "+ hd.departmentName() + "\n"
				+ hd.doActivity() + "\n"
				+ hd.getTodaysWork() + "\n"
				+ hd.getWorkDeadline() + "\n"
				+ hd.isTodayAHoliday() + "\n");
		
		System.out.println("Welcome to "+ td.departmentName() + "\n"
				+ td.getTodaysWork() + "\n"
				+ td.getWorkDeadline() + "\n"
				+ td.TechStackInformation() + "\n"
				+ td.isTodayAHoliday() + "\n");
		

	}

}
