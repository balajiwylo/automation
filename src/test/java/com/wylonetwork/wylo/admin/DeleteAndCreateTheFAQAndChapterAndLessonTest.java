package com.wylonetwork.wylo.admin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
//import com.wylo.community.objectRepository.DeleteAndCreateTheNewFAQAndChapterAndLessonPage;

public class DeleteAndCreateTheFAQAndChapterAndLessonTest extends BaseClass {
	@Test
	public void testDeleteAndCreate() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String faqQuestion = eUtils.readDataFromExcel("Admin", 9, 0);
		String faqAnswer = eUtils.readDataFromExcel("Admin", 10, 0);
		String chaptName = eUtils.readDataFromExcel("Admin", 12, 0);
		String lessonName = eUtils.readDataFromExcel("Admin", 13, 0);
		//DeleteAndCreateTheNewFAQAndChapterAndLessonPage delete = new DeleteAndCreateTheNewFAQAndChapterAndLessonPage(driver);
		//delete.deleteAndCreate(wUtils, faqQuestion, faqAnswer, chaptName, lessonName);
	}

}
