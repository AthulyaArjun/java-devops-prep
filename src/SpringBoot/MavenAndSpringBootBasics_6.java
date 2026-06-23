package SpringBoot;

public class MavenAndSpringBootBasics_6 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" MAVEN, DEPENDENCIES & SPRING BOOT BASICS ");
        System.out.println("=======================================================");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // MAVEN
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" MAVEN");
        System.out.println("-------------------------------------------------------");

        System.out.println("Maven is a Build Tool and Dependency Manager.");
        System.out.println();

        System.out.println("Responsibilities:");
        System.out.println("  -> Download dependencies");
        System.out.println("  -> Build project");
        System.out.println("  -> Run project");
        System.out.println("  -> Package project into JAR");
        System.out.println();

        System.out.println("Analogy:");
        System.out.println("Maven = App Store for Java Libraries");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // DEPENDENCY
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" DEPENDENCY");
        System.out.println("-------------------------------------------------------");

        System.out.println("A dependency is code written by someone");
        System.out.println("else that we want to use in our project.");
        System.out.println();

        System.out.println("Examples:");
        System.out.println("  -> Spring MVC");
        System.out.println("  -> Tomcat");
        System.out.println("  -> Jackson");
        System.out.println("  -> Logging Libraries");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // TRANSITIVE DEPENDENCY
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" TRANSITIVE DEPENDENCY");
        System.out.println("-------------------------------------------------------");

        System.out.println("A dependency may require other dependencies.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("Spring Web MVC");
        System.out.println("      |");
        System.out.println("      +--> Tomcat");
        System.out.println("      +--> Jackson");
        System.out.println("      +--> Logging");
        System.out.println();

        System.out.println("Maven downloads them automatically.");
        System.out.println();

        System.out.println("This is called:");
        System.out.println("Transitive Dependency");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // WHY NO MANUAL TOMCAT
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" WHY WE DIDN'T INSTALL TOMCAT");
        System.out.println("-------------------------------------------------------");

        System.out.println("We added:");
        System.out.println("spring-boot-starter-webmvc");
        System.out.println();

        System.out.println("Spring Web MVC requires Tomcat.");
        System.out.println();

        System.out.println("Maven automatically downloaded:");
        System.out.println("  -> Tomcat");
        System.out.println("  -> Spring MVC");
        System.out.println("  -> Jackson");
        System.out.println("  -> Logging Libraries");
        System.out.println();

        System.out.println("Therefore Tomcat is already available.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // POM.XML
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" POM.XML");
        System.out.println("-------------------------------------------------------");

        System.out.println("POM = Project Object Model");
        System.out.println();

        System.out.println("Purpose:");
        System.out.println("  -> Project Configuration");
        System.out.println("  -> Dependency Management");
        System.out.println("  -> Build Configuration");
        System.out.println();

        System.out.println("Important Sections:");
        System.out.println("  -> Parent");
        System.out.println("  -> GroupId");
        System.out.println("  -> ArtifactId");
        System.out.println("  -> Dependencies");
        System.out.println("  -> Plugins");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // GROUP ID
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" GROUP ID");
        System.out.println("-------------------------------------------------------");

        System.out.println("Represents organization/company.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("com.athulya");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // ARTIFACT ID
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" ARTIFACT ID");
        System.out.println("-------------------------------------------------------");

        System.out.println("Represents project name.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("first-springboot-app");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRING VS SPRING BOOT
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" SPRING vs SPRING BOOT");
        System.out.println("-------------------------------------------------------");

        System.out.println("Spring:");
        System.out.println("  -> Core Framework");
        System.out.println("  -> Dependency Injection");
        System.out.println("  -> MVC");
        System.out.println("  -> Security");
        System.out.println("  -> Data Access");
        System.out.println("  -> More Configuration");
        System.out.println();

        System.out.println("Spring Boot:");
        System.out.println("  -> Built on top of Spring");
        System.out.println("  -> Auto Configuration");
        System.out.println("  -> Starter Dependencies");
        System.out.println("  -> Embedded Tomcat");
        System.out.println("  -> Faster Development");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRINGBOOTAPPLICATION
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" @SPRINGBOOTAPPLICATION");
        System.out.println("-------------------------------------------------------");

        System.out.println("Marks the class as the main");
        System.out.println("Spring Boot application.");
        System.out.println();

        System.out.println("Everything starts from here.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRINGAPPLICATION.RUN()
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" SPRINGAPPLICATION.RUN()");
        System.out.println("-------------------------------------------------------");

        System.out.println("Code:");
        System.out.println(
                "SpringApplication.run(Application.class,args);"
        );
        System.out.println();

        System.out.println("Internally:");
        System.out.println();

        System.out.println("Step 1:");
        System.out.println("  Start Spring Framework");

        System.out.println("Step 2:");
        System.out.println("  Scan Project");

        System.out.println("Step 3:");
        System.out.println("  Create Objects");

        System.out.println("Step 4:");
        System.out.println("  Start Embedded Tomcat");

        System.out.println("Step 5:");
        System.out.println("  Open Port 8080");

        System.out.println("Step 6:");
        System.out.println("  Wait For HTTP Requests");

        System.out.println();

        // ─────────────────────────────────────────────────────
        // NORMAL JAVA vs SPRING BOOT
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" NORMAL JAVA vs SPRING BOOT");
        System.out.println("-------------------------------------------------------");

        System.out.println("Normal Java:");
        System.out.println("  main()");
        System.out.println("  Execute");
        System.out.println("  Exit");
        System.out.println();

        System.out.println("Spring Boot:");
        System.out.println("  Start Server");
        System.out.println("  Open Port 8080");
        System.out.println("  Wait For Requests");
        System.out.println("  Keep Running");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RECAP
        // ─────────────────────────────────────────────────────

        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");

        System.out.println("Maven -> Build Tool + Dependency Manager");
        System.out.println("Dependency -> External code we use");
        System.out.println("Transitive Dependency -> Dependency of dependency");
        System.out.println("pom.xml -> Project Configuration File");
        System.out.println("Spring Boot -> Built on top of Spring");
        System.out.println("@SpringBootApplication -> Main Spring Boot Class");
        System.out.println("SpringApplication.run() -> Starts Spring & Tomcat");
        System.out.println("Default Port -> 8080");

        System.out.println();
        System.out.println("=======================================================");
    }
}