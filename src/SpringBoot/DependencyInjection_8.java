package SpringBoot;

public class DependencyInjection_8 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" IoC, DEPENDENCY INJECTION & SPRING CONTAINER ");
        System.out.println("=======================================================");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // PROBLEM WITHOUT SPRING
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" WITHOUT SPRING");
        System.out.println("-------------------------------------------------------");

        System.out.println("Developer creates objects manually.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("UserService service = new UserService();");
        System.out.println("UserController controller =");
        System.out.println("        new UserController(service);");
        System.out.println();

        System.out.println("Developer manages object creation.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // IOC
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" IOC (INVERSION OF CONTROL)");
        System.out.println("-------------------------------------------------------");

        System.out.println("Object creation responsibility");
        System.out.println("is transferred from developer");
        System.out.println("to Spring Framework.");
        System.out.println();

        System.out.println("Without Spring:");
        System.out.println("Developer controls object creation");
        System.out.println();

        System.out.println("With Spring:");
        System.out.println("Spring controls object creation");
        System.out.println();

        System.out.println("This is called:");
        System.out.println("Inversion Of Control (IoC)");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // DEPENDENCY INJECTION
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" DEPENDENCY INJECTION (DI)");
        System.out.println("-------------------------------------------------------");

        System.out.println("Spring creates objects and");
        System.out.println("provides them to other objects");
        System.out.println("when needed.");
        System.out.println();

        System.out.println("Example:");
        System.out.println();

        System.out.println("UserController");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("UserService");
        System.out.println();

        System.out.println("Spring creates UserService");
        System.out.println("and injects it into UserController.");
        System.out.println();

        System.out.println("This process is called:");
        System.out.println("Dependency Injection");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // COMPONENT SCANNING
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" COMPONENT SCANNING");
        System.out.println("-------------------------------------------------------");

        System.out.println("@SpringBootApplication");
        System.out.println("starts component scanning.");
        System.out.println();

        System.out.println("Spring scans packages for:");
        System.out.println();

        System.out.println("@RestController");
        System.out.println("@Service");
        System.out.println("@Repository");
        System.out.println("@Component");
        System.out.println();

        System.out.println("When found:");
        System.out.println("  -> Create Object");
        System.out.println("  -> Manage Object");
        System.out.println("  -> Store Object");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // EXAMPLE
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" COMPONENT SCANNING EXAMPLE");
        System.out.println("-------------------------------------------------------");

        System.out.println("@RestController");
        System.out.println("public class HelloController {");
        System.out.println("}");
        System.out.println();

        System.out.println("Spring finds HelloController");
        System.out.println("during startup.");
        System.out.println();

        System.out.println("Spring creates HelloController object.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // SPRING CONTAINER
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" SPRING CONTAINER");
        System.out.println("-------------------------------------------------------");

        System.out.println("Spring Container is a storage area");
        System.out.println("where Spring keeps managed objects.");
        System.out.println();

        System.out.println("Example:");
        System.out.println();

        System.out.println("Spring Container");
        System.out.println("      |");
        System.out.println("      +-- HelloController");
        System.out.println("      +-- UserService");
        System.out.println("      +-- UserRepository");
        System.out.println();

        System.out.println("Objects stored inside container");
        System.out.println("are called Spring Beans.");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // APPLICATION STARTUP FLOW
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" APPLICATION STARTUP FLOW");
        System.out.println("-------------------------------------------------------");

        System.out.println("@SpringBootApplication");
        System.out.println("          |");
        System.out.println("          v");
        System.out.println("Component Scanning");
        System.out.println("          |");
        System.out.println("          v");
        System.out.println("Find Controllers");
        System.out.println("Find Services");
        System.out.println("Find Repositories");
        System.out.println("          |");
        System.out.println("          v");
        System.out.println("Create Objects");
        System.out.println("          |");
        System.out.println("          v");
        System.out.println("Store In Spring Container");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // HELLO CONTROLLER FLOW
        // ─────────────────────────────────────────────────────

        System.out.println("-------------------------------------------------------");
        System.out.println(" HELLO CONTROLLER FLOW");
        System.out.println("-------------------------------------------------------");

        System.out.println("Application Starts");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Spring Finds HelloController");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Spring Creates HelloController");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("Store In Spring Container");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("GET /hello");
        System.out.println("      |");
        System.out.println("      v");
        System.out.println("hello() Executes");
        System.out.println();

        // ─────────────────────────────────────────────────────
        // RECAP
        // ─────────────────────────────────────────────────────

        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");

        System.out.println("IoC");
        System.out.println(" -> Spring controls object creation");
        System.out.println();

        System.out.println("Dependency Injection");
        System.out.println(" -> Spring provides required objects");
        System.out.println();

        System.out.println("Component Scanning");
        System.out.println(" -> Spring searches for components");
        System.out.println();

        System.out.println("Spring Container");
        System.out.println(" -> Stores Spring managed objects");
        System.out.println();

        System.out.println("Spring Bean");
        System.out.println(" -> Object managed by Spring");
        System.out.println();

        System.out.println("=======================================================");
    }
}