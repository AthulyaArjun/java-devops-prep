package SpringBoot;

public class HTTPMethods_2 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("                    HTTP METHODS                       ");
        System.out.println("=======================================================");
        System.out.println("HTTP methods tell the server WHAT ACTION to perform.");
        System.out.println();

        // ─── 1. GET ───────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("1. GET  -->  Read / Retrieve data");
        System.out.println("-------------------------------------------------------");
        System.out.println("Used when client wants to FETCH information.");
        System.out.println();
        System.out.println("  Example: GET /balance");
        System.out.println("  \"Please give me my account balance\"");
        System.out.println();
        System.out.println("  Flow:");
        System.out.println("  Mobile App");
        System.out.println("      |");
        System.out.println("      |  GET /balance");
        System.out.println("      ↓");
        System.out.println("  Spring Boot Server");
        System.out.println("      |");
        System.out.println("      |  Check account");
        System.out.println("      |  Get balance from DB");
        System.out.println("      ↓");
        System.out.println("  Response: Balance = ₹10,000");
        System.out.println();
        System.out.println("  ⚠ GET should NEVER modify data. Only retrieves.");
        System.out.println();

        // ─── 2. POST ──────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("2. POST  -->  Create new data");
        System.out.println("-------------------------------------------------------");
        System.out.println("Used when client wants to CREATE something new.");
        System.out.println();
        System.out.println("  Example: POST /accounts");
        System.out.println("  \"Create a new bank account\"");
        System.out.println();
        System.out.println("  Request body contains:");
        System.out.println("    Name            : Athulya");
        System.out.println("    Initial Deposit : ₹10,000");
        System.out.println();
        System.out.println("  What server does:");
        System.out.println("    → Validates the details");
        System.out.println("    → Creates a new account in the database");
        System.out.println("    → Returns success response");
        System.out.println();

        // ─── 3. PUT ───────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("3. PUT  -->  Update existing data");
        System.out.println("-------------------------------------------------------");
        System.out.println("Used when client wants to MODIFY existing data.");
        System.out.println();
        System.out.println("  Example: PUT /users/address");
        System.out.println("  \"Change my address\"");
        System.out.println();
        System.out.println("  Request body contains:");
        System.out.println("    New Address : Kochi, Kerala");
        System.out.println();
        System.out.println("  What server does:");
        System.out.println("    → Checks if the user exists");
        System.out.println("    → Updates the address in the database");
        System.out.println("    → Sends confirmation response");
        System.out.println();

        // ─── 4. DELETE ────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("4. DELETE  -->  Remove data");
        System.out.println("-------------------------------------------------------");
        System.out.println("Used when client wants to DELETE something.");
        System.out.println();
        System.out.println("  Example: DELETE /accounts/123");
        System.out.println("  \"Close account number 123\"");
        System.out.println();
        System.out.println("  What server does:");
        System.out.println("    → Validates whether the account can be closed");
        System.out.println("    → Removes it from the database");
        System.out.println();

        // ─── CRUD Table ───────────────────────────────────────────────────
        System.out.println("=======================================================");
        System.out.println("  CRUD Operations");
        System.out.println("=======================================================");
        System.out.println("  Create  →  POST");
        System.out.println("  Read    →  GET");
        System.out.println("  Update  →  PUT");
        System.out.println("  Delete  →  DELETE");
        System.out.println();
        System.out.println("  +-------------+-------------+----------------------+");
        System.out.println("  | HTTP Method | Purpose     | Example              |");
        System.out.println("  +-------------+-------------+----------------------+");
        System.out.println("  | GET         | Read data   | Get account balance  |");
        System.out.println("  | POST        | Create data | Create a new account |");
        System.out.println("  | PUT         | Update data | Change address       |");
        System.out.println("  | DELETE      | Remove data | Close account        |");
        System.out.println("  +-------------+-------------+----------------------+");
        System.out.println();

        // ─── Instagram Example ────────────────────────────────────────────
        System.out.println("=======================================================");
        System.out.println("  Real World Example: Instagram");
        System.out.println("=======================================================");
        System.out.println("  Open your feed      →  GET    /posts");
        System.out.println("  Create a new post   →  POST   /posts");
        System.out.println("  Edit your caption   →  PUT    /posts/101");
        System.out.println("  Delete your post    →  DELETE /posts/101");
        System.out.println();
        System.out.println("  💡 Same resource (/posts), different actions —");
        System.out.println("     the HTTP METHOD tells the server what to do.");
        System.out.println("=======================================================");

        // ─── HTTP REQUEST FORMAT ──────────────────────────────────────────
        System.out.println("=======================================================");
        System.out.println("  HTTP REQUEST & RESPONSE FORMAT");
        System.out.println("=======================================================");
        System.out.println();
        System.out.println("  An HTTP Request usually contains 4 main things:");
        System.out.println();
        System.out.println("  1. HTTP METHOD");
        System.out.println("     Tells what action we want to perform.");
        System.out.println("     Example: GET, POST, PUT, DELETE");
        System.out.println();
        System.out.println("  2. URL / API ENDPOINT");
        System.out.println("     Tells which resource we want to access.");
        System.out.println("     Example: /balance, /orders, /users/10");
        System.out.println();
        System.out.println("  3. HEADERS");
        System.out.println("     Contains additional information about the request.");
        System.out.println("     Example: Authorization: Bearer xyz123");
        System.out.println("     They tell the server things like:");
        System.out.println("       → Who is making the request");
        System.out.println("       → What format the data is in");
        System.out.println();
        System.out.println("  4. BODY");
        System.out.println("     The actual data sent to the server.");
        System.out.println("     Example:");
        System.out.println("       POST /users");
        System.out.println("       Body:");
        System.out.println("       {");
        System.out.println("         \"name\": \"Athulya\",");
        System.out.println("         \"age\": 25");
        System.out.println("       }");
        System.out.println();

        // ─── HTTP RESPONSE FORMAT ─────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  HTTP RESPONSE");
        System.out.println("-------------------------------------------------------");
        System.out.println("  The server sends back:");
        System.out.println();
        System.out.println("  1. STATUS CODE");
        System.out.println("     Tells whether the request succeeded or failed.");
        System.out.println("       200 OK                  → Success");
        System.out.println("       404 Not Found           → Resource does not exist");
        System.out.println("       500 Internal Server Error → Server failed");
        System.out.println();
        System.out.println("  2. HEADERS");
        System.out.println("     Additional information about the response.");
        System.out.println("     Example: Content-Type: application/json");
        System.out.println("     Meaning: The data I am sending is in JSON format.");
        System.out.println();
        System.out.println("  3. BODY");
        System.out.println("     The actual data requested.");
        System.out.println("       {");
        System.out.println("         \"balance\": 10000");
        System.out.println("       }");
        System.out.println();

        // ─── FULL EXAMPLE ─────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  FULL EXAMPLE: Checking Bank Balance");
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("  Request from Mobile App:");
        System.out.println("    GET /balance");
        System.out.println("    Headers:");
        System.out.println("      Authorization: Bearer abc123");
        System.out.println();
        System.out.println("                    ⬇");
        System.out.println();
        System.out.println("  Server Processing:");
        System.out.println("    → Validate user");
        System.out.println("    → Check database");
        System.out.println("    → Get balance");
        System.out.println();
        System.out.println("                    ⬇");
        System.out.println();
        System.out.println("  Response from Server:");
        System.out.println("    Status: 200 OK");
        System.out.println("    Headers:");
        System.out.println("      Content-Type: application/json");
        System.out.println("    Body:");
        System.out.println("      {");
        System.out.println("        \"balance\": 10000");
        System.out.println("      }");
        System.out.println();
        System.out.println("=======================================================");
    }
}

/*
Mobile App (Client)
        |
        | HTTP Request
        | POST /login
        |
        | Headers:
        | Content-Type: application/json
        |
        | Body:
        | {
        |   "username": "athulya",
        |   "password": "1234"
        | }
        ↓
Spring Boot Backend (Server)
        |
        | Validate credentials
        | Check database
        ↓
HTTP Response
        |
        | Status: 200 OK
        |
        | Body:
        | {
        |   "message": "Login successful"
        | }
        ↓
Mobile App
 */