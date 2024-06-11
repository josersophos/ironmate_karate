package com.sophos.gft.runners;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
//import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.jupiter.api.Test;

public class KarateTestDemo {

    private static final String FORMAT_FILES = "json";
    private static final String PATH_REPORT = "target/";
    private static final String NAME_REPORT = "Example Karate + Cucumber";

    @Karate.Test
    Karate testDemoSingle() {
        return Karate.run(
                "classpath:com.sophos.gft.features/validate_contract.feature",
                "classpath:com.sophos.gft.features/demo_api.feature"
        );
    }
/*

    @Test
    void testDemo(){
        Results result = Runner.path(
                "classpath:com/sophos/features/example_validate_contract.feature",
                "classpath:com/sophos/features/example_graphql.feature",
                "classpath:com/sophos/features/example_api.feature"
        ).outputCucumberJson(true).parallel(3);
        createCucumberReport(result.getReportDir());
        assertEquals(0, result.getFailCount(), result.getErrorMessages());
    }

    private static void createCucumberReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] { FORMAT_FILES },
                Boolean.TRUE);
        List<String> jsonPaths = new ArrayList<String>(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File(PATH_REPORT), NAME_REPORT);
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }
*/

}
