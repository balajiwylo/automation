package com.wylonetwork.wylo.admin;


import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.objectRepository.CoursePage;


public class CourseCreationTest extends BaseClass {

    @Test
    public void testCreateCourse() throws Throwable {


        CoursePage course = new CoursePage(driver);
        String courseTitle = eUtils.readDataFromExcel("Course", 0, 0);
        String courseShortDescription = eUtils.readDataFromExcel("Course", 1, 0);
        String faqQuestion = eUtils.readDataFromExcel("Course", 2, 0);
        String faqAnswer = eUtils.readDataFromExcel("Course", 3, 0);
        String aboutText = eUtils.readDataFromExcel("Course", 4, 0);
        String chapterName = eUtils.readDataFromExcel("Course", 5, 0);
        String lessonName = eUtils.readDataFromExcel("Course", 6, 0);
        String filePath = "C:\\Users\\DELL\\Downloads\\manual-testing4";
        course.createCourse(wUtils, courseTitle, courseShortDescription, faqQuestion, faqAnswer, aboutText, chapterName, lessonName, filePath);
        Thread.sleep(2000);

/**
 *Edit course
 */
        String editCourseTitle = eUtils.readDataFromExcel("Course", 0, 1);
        String editShortDescription = eUtils.readDataFromExcel("Course", 1, 1);
        String editCourseQuestion = eUtils.readDataFromExcel("Course", 2, 1);
        String editCourseAnswer = eUtils.readDataFromExcel("Course", 3, 1);
        String editAboutTheCourse = eUtils.readDataFromExcel("Course", 4, 1);
        String editChapterName = eUtils.readDataFromExcel("Course", 5, 1);
        String editLessonName = eUtils.readDataFromExcel("Course", 6, 1);
        String lessonCommand = eUtils.readDataFromExcel("Course", 7, 1);
        String editCourseImageFilePath = "C:\\Users\\DELL\\Downloads\\3-reasons-technical-skills-training-best-investment-make-team";
        String lessonFilePath = "C:\\Users\\DELL\\Downloads\\49375-459436752_small";
        course.editCourse(wUtils, driver, editCourseImageFilePath, editCourseTitle, editShortDescription, editCourseQuestion, editCourseAnswer, editAboutTheCourse, editChapterName, lessonFilePath, editLessonName, lessonCommand);
        /**
         * Delete Course
         */
        // course.deleteCourse(wUtils);
    }
}
