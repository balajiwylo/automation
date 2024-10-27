package com.wylonetwork.wylo.admin;

import java.awt.*;
import java.io.IOException;

import com.wylo.community.objectRepository.CoursePage;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;

public class CreatePaidCourseTest extends BaseClass {

    @Test
    public void testPaidCourse() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
        CoursePage course = new CoursePage(driver);
        String filePath = "C:\\Users\\DELL\\Downloads\\3-reasons-technical-skills-training-best-investment-make-team";
        String courseTitle = eUtils.readDataFromExcel("Course", 0, 0);
        String courseShortDescription = eUtils.readDataFromExcel("Course", 1, 0);
        String faqQuestion = eUtils.readDataFromExcel("Course", 2, 0);
        String faqAnswer = eUtils.readDataFromExcel("Course", 3, 0);
        String aboutCourse = eUtils.readDataFromExcel("Course", 4, 0);
        String price = eUtils.readDataFromExcel("Course", 9, 0);
        String chapter = eUtils.readDataFromExcel("Course", 5, 0);
        String lesson = eUtils.readDataFromExcel("Course", 6, 0);

        course.paidCourse(wUtils, filePath, courseTitle, courseShortDescription, faqQuestion, faqAnswer, aboutCourse, price,chapter,lesson);
    }
}
