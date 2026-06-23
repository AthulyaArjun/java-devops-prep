package SpringBoot;

public class ServiceLayerAndDependencyInjection_11 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" SERVICE LAYER & DEPENDENCY INJECTION ");
        System.out.println("=======================================================");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // WHY SERVICE LAYER
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" WHY SERVICE LAYER");
        System.out.println("-------------------------------------------------------");

        System.out.println("Controller should only handle:");
        System.out.println(" -> HTTP Requests");
        System.out.println(" -> HTTP Responses");
        System.out.println();

        System.out.println("Business Logic should be moved");
        System.out.println("to Service Layer.");
        System.out.println();

        System.out.println("Examples of Business Logic:");
        System.out.println(" -> Validation");
        System.out.println(" -> Calculations");
        System.out.println(" -> Discounts");
        System.out.println(" -> Account Transfers");
        System.out.println(" -> Application Rules");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SERVICE
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" @SERVICE");
        System.out.println("-------------------------------------------------------");

        System.out.println("@Service marks a class");
        System.out.println("as Service Layer.");
        System.out.println();

        System.out.println("Example:");
        System.out.println();

        System.out.println("@Service");
        System.out.println("public class UserService {");
        System.out.println();
        System.out.println("    public String getUserMessage(){");
        System.out.println("        return \"Message coming from Service Layer\";");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();

        System.out.println("When application starts:");
        System.out.println(" -> Spring finds UserService");
        System.out.println(" -> Creates UserService object");
        System.out.println(" -> Stores object in Spring Container");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRING CONTAINER
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" SPRING CONTAINER");
        System.out.println("-------------------------------------------------------");

        System.out.println("Spring Container stores");
        System.out.println("all Spring-managed objects.");
        System.out.println();

        System.out.println("Example:");
        System.out.println();

        System.out.println("Spring Container");
        System.out.println("      |");
        System.out.println("      +-- HelloController");
        System.out.println("      +-- UserService");
        System.out.println();

        System.out.println("Objects inside Spring Container");
        System.out.println("are called Spring Beans.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // DEPENDENCY INJECTION
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" DEPENDENCY INJECTION");
        System.out.println("-------------------------------------------------------");

        System.out.println("Dependency Injection means");
        System.out.println("Spring provides required objects");
        System.out.println("to other Spring-managed objects.");
        System.out.println();

        System.out.println("Example:");
        System.out.println();

        System.out.println("HelloController");
        System.out.println("      |");
        System.out.println("needs");
        System.out.println("      |");
        System.out.println("UserService");
        System.out.println();

        System.out.println("Spring automatically injects");
        System.out.println("UserService into HelloController.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // CONSTRUCTOR INJECTION
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" CONSTRUCTOR INJECTION");
        System.out.println("-------------------------------------------------------");

        System.out.println("Recommended way of");
        System.out.println("Dependency Injection.");
        System.out.println();

        System.out.println("Code:");
        System.out.println();

        System.out.println("private UserService userService;");
        System.out.println();

        System.out.println("public HelloController(");
        System.out.println("        UserService userService) {");
        System.out.println();
        System.out.println("    this.userService = userService;");
        System.out.println("}");
        System.out.println();

        System.out.println("Spring calls constructor");
        System.out.println("and passes UserService object.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // REQUEST FLOW
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" CONTROLLER -> SERVICE FLOW");
        System.out.println("-------------------------------------------------------");

        System.out.println("Browser");
        System.out.println("   |");
        System.out.println("GET /hello");
        System.out.println("   |");
        System.out.println("Tomcat");
        System.out.println("   |");
        System.out.println("HelloController");
        System.out.println("   |");
        System.out.println("userService.getUserMessage()");
        System.out.println("   |");
        System.out.println("UserService");
        System.out.println("   |");
        System.out.println("\"Message coming from Service Layer\"");
        System.out.println("   |");
        System.out.println("Browser");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // BENEFITS
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" BENEFITS");
        System.out.println("-------------------------------------------------------");

        System.out.println(" -> Clean Controller");
        System.out.println(" -> Reusable Business Logic");
        System.out.println(" -> Easier Testing");
        System.out.println(" -> Better Architecture");
        System.out.println(" -> Easier Maintenance");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RECAP
        // ─────────────────────────────────────────────────────

        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");

        System.out.println("@Service");
        System.out.println(" -> Marks Service Layer");
        System.out.println();

        System.out.println("Spring Container");
        System.out.println(" -> Stores Spring Beans");
        System.out.println();

        System.out.println("Dependency Injection");
        System.out.println(" -> Spring provides required objects");
        System.out.println();

        System.out.println("Constructor Injection");
        System.out.println(" -> Recommended DI approach");
        System.out.println();

        System.out.println("Flow:");
        System.out.println("Browser -> Controller -> Service");
        System.out.println();

        System.out.println("=======================================================");
    }
}