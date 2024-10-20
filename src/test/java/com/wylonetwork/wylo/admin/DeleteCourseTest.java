package com.wylonetwork.wylo.admin;

import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.CourseDeletePage;


public class DeleteCourseTest extends BaseClass{
	
	@Test
	public void testDeleteCourse() throws InterruptedException
	{
		CourseDeletePage delete = new CourseDeletePage(driver);
		delete.deleteCourse(wUtils);
	}

}
