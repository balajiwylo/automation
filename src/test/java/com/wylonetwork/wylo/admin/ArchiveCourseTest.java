package com.wylonetwork.wylo.admin;

import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.ArchiveCoursePage;

public class ArchiveCourseTest extends BaseClass {
	@Test
	public void testArchive() throws InterruptedException
	{
		ArchiveCoursePage archive = new ArchiveCoursePage(driver);
		archive.archiveCourse(wUtils);
	}
}
