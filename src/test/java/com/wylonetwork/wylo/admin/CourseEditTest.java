package com.wylonetwork.wylo.admin;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
//import com.wylo.community.objectRepository.CourseEditPage;

public class CourseEditTest extends BaseClass {

	@Test
	public void testEditCourse() throws EncryptedDocumentException, IOException, AWTException, InterruptedException 
	{
//		CourseEditPage edit = new CourseEditPage(driver);
		String filePath = "C:\\Users\\DELL\\Downloads\\3-reasons-technical-skills-training-best-investment-make-team";
		String editCourseTitle=eUtils.readDataFromExcel("Admin", 7, 1);
		String editShortDescription = eUtils.readDataFromExcel("Admin", 8, 1);
		String editCourseQuestion = eUtils.readDataFromExcel("Admin", 9, 1);
		String editCourseAnswer = eUtils.readDataFromExcel("Admin", 10, 1);
		String editAboutTheCourse = eUtils.readDataFromExcel("Admin", 11, 1);
		String editChapterName = eUtils.readDataFromExcel("Admin", 12, 1);
		String editLessonName = eUtils.readDataFromExcel("Admin", 13, 1);
		String lessonCommand = eUtils.readDataFromExcel("Admin", 14, 1);
		String lessonFilePath= "C:\\Users\\DELL\\Downloads\\49375-459436752_small";
//		edit.editCourse(wUtils,filePath,editCourseTitle,editShortDescription,editCourseQuestion,editCourseAnswer,editAboutTheCourse,lessonFilePath,editChapterName,editLessonName,lessonCommand);
	}

}
