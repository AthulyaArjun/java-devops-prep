package SpringBoot;

public class RequestParam_10 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" REQUEST PARAM ");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("RequestParam is used to capture");
        System.out.println("query parameters from URL.");
        System.out.println();

        System.out.println("Example URL:");
        System.out.println("/users?city=Kochi");
        System.out.println();

        System.out.println("Spring Mapping:");
        System.out.println("@GetMapping(\"/users\")");
        System.out.println();

        System.out.println("Method:");
        System.out.println("public String getUsersByCity(");
        System.out.println("        @RequestParam String city)");
        System.out.println();

        System.out.println();

        System.out.println("For URL:");
        System.out.println("/users?city=Kochi");

        System.out.println();

        System.out.println("city = Kochi");

        System.out.println();

        System.out.println("For URL:");
        System.out.println("/users?city=Trivandrum");

        System.out.println();

        System.out.println("city = Trivandrum");

        System.out.println();

        System.out.println("Flow:");

        System.out.println("Browser");
        System.out.println("   |");
        System.out.println("GET /users?city=Kochi");
        System.out.println("   |");
        System.out.println("Tomcat");
        System.out.println("   |");
        System.out.println("Spring Boot");
        System.out.println("   |");
        System.out.println("city = Kochi");
        System.out.println("   |");
        System.out.println("getUsersByCity(Kochi)");

        System.out.println();

        System.out.println("Used For:");
        System.out.println(" -> Filtering");
        System.out.println(" -> Searching");
        System.out.println(" -> Sorting");

        System.out.println();

        System.out.println("Examples:");
        System.out.println("/users?city=Kochi");
        System.out.println("/employees?department=HR");
        System.out.println("/orders?status=delivered");
        System.out.println("/products?category=laptop");

        System.out.println();

        System.out.println("Annotation:");
        System.out.println("@RequestParam");

        System.out.println();

        System.out.println("=======================================================");
    }
}