package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getExtentReport() {

        if (extent == null) {
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("target/ExtentReport.html");

            spark.config().setReportName("Automation Execution Report");
            spark.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Krishna Jadhav");
            extent.setSystemInfo("Project", "Demo Automation");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}
