package SpringBoot;

public class SpringBootProjectCreation_5 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("      SPRING BOOT PROJECT CREATION");
        System.out.println("=======================================================");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // METHOD 1 : USING SPRING INITIALIZR
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" METHOD 1 : SPRING INITIALIZR");
        System.out.println("-------------------------------------------------------");

        System.out.println("Step 1:");
        System.out.println("Open https://start.spring.io");
        System.out.println();

        System.out.println("Step 2:");
        System.out.println("Select Project Details");
        System.out.println();

        System.out.println("Project      : Maven");
        System.out.println("Language     : Java");
        System.out.println("Packaging    : Jar");
        System.out.println("Java Version : 17");
        System.out.println();

        System.out.println("Group        : com.athulya");
        System.out.println("Artifact     : first-springboot-app");
        System.out.println("Name         : first-springboot-app");
        System.out.println();

        System.out.println("Step 3:");
        System.out.println("Add Dependency");
        System.out.println();

        System.out.println("Spring Web");
        System.out.println();

        System.out.println("Step 4:");
        System.out.println("Click Generate");
        System.out.println();

        System.out.println("Step 5:");
        System.out.println("A ZIP file will be downloaded");
        System.out.println();

        System.out.println("Step 6:");
        System.out.println("Extract the ZIP");
        System.out.println();

        System.out.println("Step 7:");
        System.out.println("Open extracted folder in IntelliJ");
        System.out.println();

        System.out.println();

        // ─────────────────────────────────────────────────────
        // METHOD 2 : USING INTELLIJ SPRING BOOT WIZARD
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" METHOD 2 : INTELLIJ SPRING BOOT WIZARD");
        System.out.println("-------------------------------------------------------");

        System.out.println("Step 1:");
        System.out.println("File -> New Project");
        System.out.println();

        System.out.println("Step 2:");
        System.out.println("Select Spring Boot");
        System.out.println();

        System.out.println("Step 3:");
        System.out.println("Provide Project Details");
        System.out.println();

        System.out.println("Name         : first-springboot-app");
        System.out.println("Type         : Maven");
        System.out.println("Language     : Java");
        System.out.println("Group        : com.athulya");
        System.out.println("Artifact     : first-springboot-app");
        System.out.println("Java Version : 17");
        System.out.println("Packaging    : Jar");
        System.out.println();

        System.out.println();

        System.out.println("Step 4:");
        System.out.println("Click Next");
        System.out.println();

        System.out.println("Step 5:");
        System.out.println("Add Dependency");
        System.out.println();

        System.out.println("Spring Web");
        System.out.println();

        System.out.println();

        System.out.println("Step 6:");
        System.out.println("Click Create");
        System.out.println();

        System.out.println();

        // ─────────────────────────────────────────────────────
        // PROJECT STRUCTURE
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" GENERATED PROJECT STRUCTURE");
        System.out.println("-------------------------------------------------------");

        System.out.println("first-springboot-app");
        System.out.println(" |");
        System.out.println(" |-- src");
        System.out.println(" |     |");
        System.out.println(" |     |-- main");
        System.out.println(" |     |     |");
        System.out.println(" |     |     |-- java");
        System.out.println(" |     |     |");
        System.out.println(" |     |     |-- resources");
        System.out.println(" |");
        System.out.println(" |-- pom.xml");
        System.out.println(" |-- mvnw");
        System.out.println(" |-- mvnw.cmd");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // IMPORTANT FILES
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" IMPORTANT FILES");
        System.out.println("-------------------------------------------------------");

        System.out.println("pom.xml");
        System.out.println("  -> Maven configuration file");
        System.out.println("  -> Stores project dependencies");
        System.out.println();

        System.out.println("src/main/java");
        System.out.println("  -> Java source code");
        System.out.println();

        System.out.println("src/main/resources");
        System.out.println("  -> Configuration files");
        System.out.println();

        System.out.println("mvnw / mvnw.cmd");
        System.out.println("  -> Maven wrapper scripts");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRING WEB DEPENDENCY
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" SPRING WEB DEPENDENCY");
        System.out.println("-------------------------------------------------------");

        System.out.println("Adding Spring Web gives:");
        System.out.println();

        System.out.println("  -> REST API support");
        System.out.println("  -> HTTP request handling");
        System.out.println("  -> Controllers");
        System.out.println("  -> Embedded Tomcat");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RECAP
        // ─────────────────────────────────────────────────────

        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("Method 1 -> Spring Initializr");
        System.out.println("Method 2 -> IntelliJ Spring Boot Wizard");
        System.out.println();

        System.out.println("Project Type : Maven");
        System.out.println("Language     : Java");
        System.out.println("Packaging    : Jar");
        System.out.println("Dependency   : Spring Web");
        System.out.println();

        System.out.println("Important Files:");
        System.out.println("  pom.xml");
        System.out.println("  src/main/java");
        System.out.println("  src/main/resources");
        System.out.println();

        System.out.println("Spring Web provides Embedded Tomcat.");
        System.out.println();

        System.out.println("=======================================================");
    }
}