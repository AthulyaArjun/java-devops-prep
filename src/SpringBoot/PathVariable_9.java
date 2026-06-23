package SpringBoot;

public class PathVariable_9 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" PATH VARIABLE ");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("Path Variable is used to capture");
        System.out.println("dynamic values from URL path.");
        System.out.println();

        System.out.println("Example URL:");
        System.out.println("/users/10");
        System.out.println();

        System.out.println("Spring Mapping:");
        System.out.println("@GetMapping(\"/users/{id}\")");
        System.out.println();

        System.out.println("Method:");
        System.out.println("public String getUser(");
        System.out.println("        @PathVariable int id)");
        System.out.println();

        System.out.println("For URL /users/10");
        System.out.println("id = 10");
        System.out.println();

        System.out.println("For URL /users/50");
        System.out.println("id = 50");
        System.out.println();

        System.out.println("Flow:");
        System.out.println("Browser");
        System.out.println("   |");
        System.out.println("GET /users/10");
        System.out.println("   |");
        System.out.println("Tomcat");
        System.out.println("   |");
        System.out.println("Spring Boot");
        System.out.println("   |");
        System.out.println("id = 10");
        System.out.println("   |");
        System.out.println("getUser(10)");
        System.out.println();

        System.out.println();
        System.out.println("Used For:");
        System.out.println(" -> User ID");
        System.out.println(" -> Product ID");
        System.out.println(" -> Order ID");
        System.out.println(" -> Employee ID");

        System.out.println();
        System.out.println("Annotation:");
        System.out.println("@PathVariable");

        System.out.println();
        System.out.println("=======================================================");
    }
}