package com.wylonetwork.wylo.user;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.EnrollThePaidCoursePage;



public class EnrollThePaidCourseTest extends BaseClass {
	
	@Test
	public void testEnrolledPaidCourse() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String cardNumber = eUtils.readDataFromExcel("Course", 10, 1);
		String cardExpiryNumber = eUtils.readDataFromExcel("Course", 11, 1);
		String cardCvcNumber = eUtils.readDataFromExcel("Course", 12, 1);
		String cardHolderName = eUtils.readDataFromExcel("Course", 13, 1);
		String address = eUtils.readDataFromExcel("Course", 14, 1);
		EnrollThePaidCoursePage enrollCourse = new EnrollThePaidCoursePage(driver);
		enrollCourse.enrollCourse(wUtils,cardNumber,cardExpiryNumber,cardCvcNumber,cardHolderName,address);
	
	}

}
