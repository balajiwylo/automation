package com.wylonetwork.wylo.admin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
//import com.wylo.community.objectRepository.CreatePaidCoursePage;

public class CreatePaidCourseTest extends BaseClass {

	@Test
	public void testPaidCourse() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String courseTitle = eUtils.readDataFromExcel("Course", 0, 0);
		String courseShortDescription = eUtils.readDataFromExcel("Course", 1, 0);
		String aboutCourse = eUtils.readDataFromExcel("Course", 4, 0);
		String chapter = eUtils.readDataFromExcel("Course", 5, 0);
		String lesson = eUtils.readDataFromExcel("Course", 6, 0);
		String price = eUtils.readDataFromExcel("Course", 9, 1);
		
	//	CreatePaidCoursePage paid = new CreatePaidCoursePage(driver);
	//	paid.paidCourse(wUtils, courseTitle, courseShortDescription, aboutCourse,price,chapter,lesson);
	}
}
