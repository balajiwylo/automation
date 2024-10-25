package com.wylonetwork.wylo.user;

import com.wylo.community.genricUtility.BaseClass;
import com.wylo.community.genricUtility.WebDriverUtility;
import com.wylo.community.objectRepository.EnrollAndArchiveCoursePage;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class EnrollAndArchiveCourseTest extends BaseClass {

    @Test(priority = 1)
    public void enrollArchive() throws EncryptedDocumentException, IOException, InterruptedException {
        EnrollAndArchiveCoursePage enrollCourse = new EnrollAndArchiveCoursePage(driver);
        enrollCourse.userEnroll(wUtils); // Perform the enrollment action
    }

    @Test(priority = 2)
    public void archiveCourse() {
        EnrollAndArchiveCoursePage archiveCourse = new EnrollAndArchiveCoursePage(driver);
        archiveCourse.archiveCourse(wUtils);
    }
}