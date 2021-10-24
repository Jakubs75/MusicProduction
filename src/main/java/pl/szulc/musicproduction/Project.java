package pl.szulc.musicproduction;

import java.util.ArrayList;
import java.util.List;

public class Project {
    String ProjectName;
    private List<User> users; // people working on project
    private List<Version> versions;
    private List<Payment> payments;
    private float projectValue;
    private float paid;


    public Project(List<User> originalUsers) {
        users = new ArrayList<>(originalUsers);
        versions = new ArrayList<>();
    }

    public List<Version> getVersions() {
        return new ArrayList<>(versions);
    }

    public void addVerision(Version version) {
        versions.add(version);
    }

    public List<Payment> checkPayment() {
        return new ArrayList<>(payments);
    }


}
