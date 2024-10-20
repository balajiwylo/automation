package com.wylonetwork.wylo.admin;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.CourseCreationWithRestrictedVisibilityPage;

class RestrictedVisibilityCourseCreationTest extends BaseClass {
	@Test
	public void restrictedVisibilityCourse() throws EncryptedDocumentException, IOException, InterruptedException, AWTException 
	{
		String filePath = "C:\\Users\\DELL\\Downloads\\manual-testing4";
		String courseTitle = eUtils.readDataFromExcel("Admin", 7, 0);
		String courseShortDescription = eUtils.readDataFromExcel("Admin", 8, 0);
		String chaptName = eUtils.readDataFromExcel("Admin", 12, 0);
		String lessonName = eUtils.readDataFromExcel("Admin", 13, 0);
		String abouttext = eUtils.readDataFromExcel("Admin", 11, 0);
		CourseCreationWithRestrictedVisibilityPage restricted = new CourseCreationWithRestrictedVisibilityPage(driver);
        restricted.restrictedCourse(wUtils,filePath,courseTitle, courseShortDescription,abouttext,chaptName,lessonName);
	}
}
