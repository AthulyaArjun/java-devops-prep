package SpringBoot;

public class FirstAPI_7 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("      FIRST SPRING BOOT API");
        System.out.println("=======================================================");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // HELLO CONTROLLER
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" HELLO CONTROLLER");
        System.out.println("-------------------------------------------------------");

        System.out.println("Code:");
        System.out.println();

        System.out.println("@RestController");
        System.out.println("public class HelloController {");
        System.out.println();
        System.out.println("    @GetMapping(\"/hello\")");
        System.out.println("    public String hello() {");
        System.out.println("        return \"Hello Athulya, My First Spring Boot API!\";");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // REST CONTROLLER
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" @RESTCONTROLLER");
        System.out.println("-------------------------------------------------------");

        System.out.println("@RestController tells Spring:");
        System.out.println();

        System.out.println("  -> This class handles HTTP requests");
        System.out.println("  -> This class contains API endpoints");
        System.out.println("  -> Return values become HTTP responses");
        System.out.println();

        System.out.println("Example:");
        System.out.println("@RestController");
        System.out.println("public class HelloController {");
        System.out.println("}");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // GET MAPPING
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" @GETMAPPING");
        System.out.println("-------------------------------------------------------");

        System.out.println("@GetMapping maps HTTP GET requests");
        System.out.println("to a Java method.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("@GetMapping(\"/hello\")");
        System.out.println();

        System.out.println("Meaning:");
        System.out.println("When client sends GET /hello");
        System.out.println("execute the hello() method.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // ENDPOINT
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" ENDPOINT");
        System.out.println("-------------------------------------------------------");

        System.out.println("Endpoint:");
        System.out.println("/hello");
        System.out.println();

        System.out.println("URL:");
        System.out.println("http://localhost:8080/hello");
        System.out.println();

        System.out.println("HTTP Method:");
        System.out.println("GET");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // REQUEST FLOW
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" REQUEST FLOW");
        System.out.println("-------------------------------------------------------");

        System.out.println("Browser");
        System.out.println("   |");
        System.out.println("GET /hello");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("Tomcat");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("Spring Boot");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("HelloController");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("hello()");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("\"Hello Athulya, My First Spring Boot API!\"");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("Browser");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RESPONSE
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" RESPONSE");
        System.out.println("-------------------------------------------------------");

        System.out.println("Method:");
        System.out.println("public String hello()");
        System.out.println();

        System.out.println("Returns:");
        System.out.println("\"Hello Athulya, My First Spring Boot API!\"");
        System.out.println();

        System.out.println("Spring converts it into:");
        System.out.println("HTTP Response Body");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // IMPORTANT OBSERVATION
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" IMPORTANT OBSERVATION");
        System.out.println("-------------------------------------------------------");

        System.out.println("We never created:");
        System.out.println();

        System.out.println("HelloController controller =");
        System.out.println("        new HelloController();");
        System.out.println();

        System.out.println("Yet Spring executed hello()");
        System.out.println();

        System.out.println("Reason:");
        System.out.println("Spring automatically created");
        System.out.println("and managed the object.");
        System.out.println();

        System.out.println("This concept is called:");
        System.out.println("Dependency Injection (DI)");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RECAP
        // ─────────────────────────────────────────────────────

        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("@RestController");
        System.out.println("  -> Marks class as API Controller");
        System.out.println();

        System.out.println("@GetMapping");
        System.out.println("  -> Maps GET request to method");
        System.out.println();

        System.out.println("/hello");
        System.out.println("  -> Endpoint");
        System.out.println();

        System.out.println("Tomcat");
        System.out.println("  -> Receives request first");
        System.out.println();

        System.out.println("hello()");
        System.out.println("  -> Executes business logic");
        System.out.println();

        System.out.println("Return String");
        System.out.println("  -> Becomes HTTP Response");
        System.out.println();

        System.out.println("Spring");
        System.out.println("  -> Creates Controller object automatically");
        System.out.println();

        System.out.println("Dependency Injection");
        System.out.println("  -> Spring manages objects");
        System.out.println();

        System.out.println();
        System.out.println("=======================================================");
    }
}