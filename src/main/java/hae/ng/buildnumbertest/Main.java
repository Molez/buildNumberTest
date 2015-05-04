package hae.ng.buildnumbertest;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.getProperty("maven.buildNumber.doCheck");
        System.getProperty("maven.buildNumber.doUpdate");
        System.getProperty("maven.buildNumber.useLastCommittedRevision");
        System.getProperty("maven.buildNumber.revisionOnScmFailure");
        System.getProperty("maven.buildNumber.getRevisionOnlyOnce");
    }

}
