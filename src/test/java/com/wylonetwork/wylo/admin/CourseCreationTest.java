package com.wylonetwork.wylo.admin;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.CoursePage;


public class CourseCreationTest extends BaseClass{

	@Test
	public void testCreateCourse() throws Throwable
	{
		String courseTitle = eUtils.readDataFromExcel("Course", 0, 0);
		String courseShortDescription = eUtils.readDataFromExcel("Course", 1, 0);
		String faqQuestion = eUtils.readDataFromExcel("Course", 2, 0);
		String faqAnswer = eUtils.readDataFromExcel("Course", 3, 0);
		String aboutText = eUtils.readDataFromExcel("Course", 4, 0);
		String chapterName = eUtils.readDataFromExcel("Course", 5, 0);
		String lessonName = eUtils.readDataFromExcel("Course", 6, 0);
		String filePath = "C:\\Users\\DELL\\Downloads\\manual-testing4";
		CoursePage course =new CoursePage(driver);
		course.createCourse(wUtils,courseTitle,courseShortDescription,faqQuestion,faqAnswer,aboutText,chapterName,lessonName,filePath);
        Thread.sleep(2000);
	}
}
