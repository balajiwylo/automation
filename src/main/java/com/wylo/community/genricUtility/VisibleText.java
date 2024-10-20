package com.wylo.community.genricUtility;


public interface VisibleText {

    interface SignInPage {
        String WYLO = "Wylo";
        String GOOGLE_SIGN_IN = "Sign in with Google";
        String CONTINUE_WITH_EMAIL_ID = "Continue with email";
    }

    interface OtpPage {
        String  EMAIL_PLACEHOLDER = "Enter your email ID";
        String  CONTINUE_BUTTON= "Continue";
        String  OTP_VERIFY_MESSAGE="Please enter the 4-digit code sent to ";
        String  OTP_ERROR_MESSAGE ="Username or Password doesn't match.";
        String  OTP_VERIFY_BUTTON="Verify";
    }

    interface HomePage {
        String GETTING_STARTED_TEXT="Getting started";
        String[] FEATURES_NAME= {"Forum","Courses","Chat","Events","Store","Collections","Members","Settings"};
    }
}
