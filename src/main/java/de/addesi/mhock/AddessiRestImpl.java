package de.addesi.mhock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddessiRestImpl implements AdessiRestInterface {

    @Value("${course}")
    private String courseName;

    @Autowired
    private Environment environment;


    @Override
    public String getFirstName() {
        return "Mojammal";
    }

    @Override
    public String getLastName() {
        return "Hock";
    }

    @Override
    public String getLineOfBusiness() {
        return "LOB Banking";
    }

    @Override
    public String getCompetenceCenter() {
        return "Banking";
    }

    @Override
    public String getCompetenceCenterLeader() {
        return "Andrea Pfeiffer";
    }

    @Override
    public String getJobDescription() {
        return "Senior Software Enginner";
    }

    @Override
    public String getCourseAttended() {
        return courseName;
    }

    @Override
    public String getPortNumber() {
        return "Application is running on port: " + environment.getProperty("local.server.port");
    }
}
