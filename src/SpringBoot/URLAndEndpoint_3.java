package SpringBoot;

public class URLAndEndpoint_3 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" URL, ENDPOINT, RESOURCE, PATH VARIABLE, QUERY PARAM ");
        System.out.println("=======================================================");
        System.out.println();

        // ─── URL ──────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" URL");
        System.out.println("-------------------------------------------------------");

        System.out.println("A URL is the complete address used to access a resource.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("http://localhost:8080/users/10");
        System.out.println();

        System.out.println("Parts:");
        System.out.println("http://      -> protocol");
        System.out.println("localhost    -> server");
        System.out.println("8080         -> port");
        System.out.println("/users/10    -> endpoint");
        System.out.println();

        // ─── RESOURCE ────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" RESOURCE");
        System.out.println("-------------------------------------------------------");

        System.out.println("A resource is the data/object we are working with.");
        System.out.println();

        System.out.println("Examples:");
        System.out.println("Instagram -> posts");
        System.out.println("Amazon    -> products");
        System.out.println("Bank      -> accounts");
        System.out.println("Swiggy    -> restaurants");
        System.out.println();

        System.out.println("Example:");
        System.out.println("GET /users");
        System.out.println("Resource = users");
        System.out.println();

        // ─── ENDPOINT ────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" ENDPOINT");
        System.out.println("-------------------------------------------------------");

        System.out.println("An endpoint is the API path that clients call.");
        System.out.println();

        System.out.println("Examples:");
        System.out.println("/users");
        System.out.println("/users/10");
        System.out.println("/products");
        System.out.println("/orders/101");
        System.out.println();

        System.out.println("Example:");
        System.out.println("GET /users/10");
        System.out.println("Endpoint = /users/10");
        System.out.println();

        // ─── PATH VARIABLE ──────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" PATH VARIABLE");
        System.out.println("-------------------------------------------------------");

        System.out.println("Used to identify a specific resource.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("GET /users/10");
        System.out.println();

        System.out.println("Here:");
        System.out.println("10 = Path Variable");
        System.out.println();

        System.out.println("Meaning:");
        System.out.println("Get user whose ID is 10");
        System.out.println();

        System.out.println("More examples:");
        System.out.println("GET /products/500");
        System.out.println("Get product whose ID is 500");
        System.out.println();

        System.out.println("GET /orders/101");
        System.out.println("Get order whose ID is 101");
        System.out.println();

        System.out.println("Spring Boot notation:");
        System.out.println("/users/{id}");
        System.out.println();

        System.out.println("Examples:");
        System.out.println("/users/10  -> id = 10");
        System.out.println("/users/25  -> id = 25");
        System.out.println("/users/99  -> id = 99");
        System.out.println();

        // ─── QUERY PARAMETER ────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" QUERY PARAMETER");
        System.out.println("-------------------------------------------------------");

        System.out.println("Used for filtering, searching or sorting.");
        System.out.println();

        System.out.println("Starts after ?");
        System.out.println();

        System.out.println("Examples:");
        System.out.println("/users?city=Kochi");
        System.out.println("/products?category=mobile");
        System.out.println("/orders?status=delivered");
        System.out.println();

        System.out.println("Meaning:");
        System.out.println("/users?city=Kochi");
        System.out.println("Get all users from Kochi");
        System.out.println();

        System.out.println("/orders?status=delivered");
        System.out.println("Get all delivered orders");
        System.out.println();

        // ─── MULTIPLE QUERY PARAMETERS ──────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println(" MULTIPLE QUERY PARAMETERS");
        System.out.println("-------------------------------------------------------");

        System.out.println("Use & to separate parameters.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("/products?category=mobile&brand=apple");
        System.out.println();

        System.out.println("Meaning:");
        System.out.println("Get all Apple mobiles");
        System.out.println();

        // ─── PATH VARIABLE vs QUERY PARAMETER ───────────────
        System.out.println("=======================================================");
        System.out.println(" PATH VARIABLE vs QUERY PARAMETER");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("+----------------------+--------------------------------+");
        System.out.println("| PATH VARIABLE        | QUERY PARAMETER               |");
        System.out.println("+----------------------+--------------------------------+");
        System.out.println("| Identifies one item  | Filters many items            |");
        System.out.println("| /users/10            | /users?city=Kochi            |");
        System.out.println("| User ID = 10         | City = Kochi                 |");
        System.out.println("| Specific resource    | Search / Filter              |");
        System.out.println("+----------------------+--------------------------------+");
        System.out.println();

        // ─── EXAMPLES ───────────────────────────────────────
        System.out.println("=======================================================");
        System.out.println(" EXAMPLES");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("GET /products/500");
        System.out.println("Meaning -> Get product whose ID is 500");
        System.out.println();

        System.out.println("GET /products?category=mobile");
        System.out.println("Meaning -> Get all mobile products");
        System.out.println();

        System.out.println("GET /orders/101");
        System.out.println("Meaning -> Get order whose ID is 101");
        System.out.println();

        System.out.println("GET /orders?status=delivered");
        System.out.println("Meaning -> Get all delivered orders");
        System.out.println();

        // ─── RECAP ──────────────────────────────────────────
        System.out.println("=======================================================");
        System.out.println(" RECAP");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("URL            -> Full address");
        System.out.println("Resource       -> Data we work with");
        System.out.println("Endpoint       -> API path");
        System.out.println("Path Variable  -> Identify specific resource");
        System.out.println("Query Parameter-> Filter/Search resources");

        System.out.println();

        System.out.println("Examples:");
        System.out.println("/users/10");
        System.out.println("Get user with ID 10");
        System.out.println();

        System.out.println("/users?city=Kochi");
        System.out.println("Get users from Kochi");

        System.out.println();
        System.out.println("=======================================================");
    }
}