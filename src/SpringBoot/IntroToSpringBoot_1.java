package SpringBoot;

public class IntroToSpringBoot_1 {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("       Client, Server, Request, Response, HTTP         ");
        System.out.println("=======================================================");
        System.out.println();

        // ─── CLIENT ───────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  CLIENT");
        System.out.println("-------------------------------------------------------");
        System.out.println("A client is any device or application that ASKS/requests for a service or data" +
                " from another computer over a network.");
        System.out.println();
        System.out.println("  Examples: Web browser, Mobile apps, Postman, Backend apps");
        System.out.println();
        System.out.println("  Chrome --> show me www.google.com");
        System.out.println("  Here, Chrome is the CLIENT.");
        System.out.println();

        // ─── SERVER ───────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  SERVER");
        System.out.println("-------------------------------------------------------");
        System.out.println("A server is a computer or program that LISTENS for requests and SENDS back responses.");
        System.out.println();
        System.out.println("Meaning 1---> Server as a computer");
        System.out.println("    eg: Google owns thousands of powerful computers in data centres. These computers store:");
        System.out.println("    GMail, YouTube, Google Maps, Google Photos");
        System.out.println("When you access YouTube, one of those computers send data to you");
        System.out.println();
        System.out.println("Meaning 2 ---> Server as a software");
        System.out.println("    A server is also a software that listens for incoming requests and responds to them.");
        System.out.println("    eg: Tomcat, Jetty, Nginx, Apache HTTP Server");
        System.out.println("  It usually:");
        System.out.println("    → Runs 24x7");
        System.out.println("    → Stores data");
        System.out.println("    → Executes business logic");
        System.out.println("    → Communicates with databases");
        System.out.println();
        System.out.println("  Examples:");
        System.out.println("    Netflix server  → sends movies");
        System.out.println("    Banking server  → gives account information");
        System.out.println();

        // ─── HTTP ─────────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  HTTP");
        System.out.println("-------------------------------------------------------");
        System.out.println("How does a client know how to TALK to a server?");
        System.out.println();
        System.out.println("  Imagine going to a restaurant in another country.");
        System.out.println("  You and the waiter need a COMMON LANGUAGE.");
        System.out.println("  Computers also need a language — that language is HTTP.");
        System.out.println();
        System.out.println("  HTTP --> HyperText Transfer Protocol");
        System.out.println("  A protocol = a set of rules for communication.");
        System.out.println();
        System.out.println("  HTTP defines:");
        System.out.println("    → How a request and response should look");
        System.out.println("    → What type of action is being performed");
        System.out.println();
        System.out.println("  Example:");
        System.out.println("    Client  : \"GET me the list of products\"");
        System.out.println("    Server  : \"Okay, here are the products\"");
        System.out.println();
        System.out.println("  www.amazon.com --[HTTP Request]--> GET /products");
        System.out.println("  Server         --[HTTP Response]--> Status: 200 OK");
        System.out.println("  Data: [ \"Laptop\", \"Phone\", \"Headphones\" ]");
        System.out.println();

        //─── REST ──────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  REST");
        System.out.println("-------------------------------------------------------");
        System.out.println("REST is a style/rule for designing APIs cleanly");
        System.out.println();
        System.out.println("    Good REST API");
        System.out.println("        GET /students");
        System.out.println("        POST /students");
        System.out.println("        PUT /students/1");
        System.out.println("        DELETE /students/1");
        System.out.println();
        System.out.println("    Bad REST API");
        System.out.println("        /getStudent");
        System.out.println("        /createStudent");
        System.out.println();
        System.out.println("    REST prefers:");
        System.out.println("        Nouns in urls: /students");
        System.out.println("        HTTP methods for actions: GET,POST,PUT,DELETE");
        System.out.println("        JSON for request/response");
        System.out.println();

        // ─── SPRING BOOT ──────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  SPRING BOOT");
        System.out.println("-------------------------------------------------------");
        System.out.println("A Spring Boot application is usually a SERVER application.");
        System.out.println();
        System.out.println("  Browser / Mobile App / Postman");
        System.out.println("               |");
        System.out.println("          HTTP Request");
        System.out.println("               |");
        System.out.println("               ↓");
        System.out.println("      Spring Boot Application");
        System.out.println("               |");
        System.out.println("         Business Logic");
        System.out.println("               |");
        System.out.println("            Database");
        System.out.println("               |");
        System.out.println("         HTTP Response");
        System.out.println("               |");
        System.out.println("               ↓");
        System.out.println("  Browser / Mobile App / Postman");
        System.out.println();
        System.out.println("  When we build a Spring Boot app, we are creating our own");
        System.out.println("  server that can RECEIVE requests and SEND responses.");
        System.out.println();
        System.out.println("  Client vs Server:");
        System.out.println("    Client → Initiates a request for a service or data");
        System.out.println("    Server → Receives, processes, and sends back a response");
        System.out.println("    Both communicate over protocols like HTTP.");
        System.out.println();

        // ─── BACKEND APPLICATION ──────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  BACKEND APPLICATION");
        System.out.println("-------------------------------------------------------");
        System.out.println("A backend application runs on the SERVER and handles");
        System.out.println("requests coming from the client.");
        System.out.println();
        System.out.println("  Responsibilities:");
        System.out.println("    → Receiving HTTP requests from clients");
        System.out.println("    → Processing business logic and application rules");
        System.out.println("    → Validating requests");
        System.out.println("    → Communicating with databases or other services");
        System.out.println("    → Sending HTTP response back to the client");
        System.out.println();
        System.out.println("  Flow:");
        System.out.println("  Mobile App (Frontend)");
        System.out.println("       |  GET /balance");
        System.out.println("       ↓");
        System.out.println("  Backend Application (Spring Boot)");
        System.out.println("       |  Validate user");
        System.out.println("       |  Check permissions");
        System.out.println("       |  Apply business rules");
        System.out.println("       ↓");
        System.out.println("  Database");
        System.out.println("       |  Balance data");
        System.out.println("       ↑");
        System.out.println("  Backend Application");
        System.out.println("       |  HTTP Response");
        System.out.println("       ↓");
        System.out.println("  Mobile App");
        System.out.println();
        System.out.println("  Frontend vs Backend:");
        System.out.println("  +-----------------------------------------+------------------------------------------+");
        System.out.println("  | Frontend                                | Backend                                  |");
        System.out.println("  +-----------------------------------------+------------------------------------------+");
        System.out.println("  | What the user sees and interacts with   | Runs behind the scenes on the server     |");
        System.out.println("  | Mobile app, website UI                  | Spring Boot application                  |");
        System.out.println("  | Displays data                           | Processes data                           |");
        System.out.println("  | Sends requests                          | Handles requests                         |");
        System.out.println("  | Takes user input                        | Applies business logic                   |");
        System.out.println("  | Shows responses                         | Communicates with databases              |");
        System.out.println("  +-----------------------------------------+------------------------------------------+");
        System.out.println();

        // ─── API ──────────────────────────────────────────────────────────
        System.out.println("-------------------------------------------------------");
        System.out.println("  API  (Application Programming Interface)");
        System.out.println("-------------------------------------------------------");
        System.out.println("API = The MENU between client and server.");
        System.out.println("It is a CONTRACT that defines how a client can communicate");
        System.out.println("with a backend application.");
        System.out.println();
        System.out.println("  HTTP vs API:");
        System.out.println("  +----------------------------------------------+--------------------------------------------------+");
        System.out.println("  | HTTP                                         | API                                              |");
        System.out.println("  +----------------------------------------------+--------------------------------------------------+");
        System.out.println("  | A communication protocol                     | A contract/interface between applications        |");
        System.out.println("  | Defines how messages are exchanged           | Defines what functionality is available          |");
        System.out.println("  | Methods: GET, POST, PUT, DELETE              | Endpoints: /balance, /transfer, /restaurants     |");
        System.out.println("  | Used to send requests and responses          | Used to expose services/data                     |");
        System.out.println("  +----------------------------------------------+--------------------------------------------------+");
        System.out.println();
        System.out.println("  Restaurant analogy:");
        System.out.println("    API  = The MENU  → tells you what you can order & how to ask");
        System.out.println("    HTTP = The LANGUAGE → rules on how the order is communicated");
        System.out.println();
        System.out.println("  API examples (the menu items):");
        System.out.println("    GET  /restaurants");
        System.out.println("    POST /order");
        System.out.println("    GET  /order/123");
        System.out.println();
        System.out.println("  HTTP carries the request and specifies:");
        System.out.println("    → The method (GET, POST, PUT, DELETE)");
        System.out.println("    → The format of the request");
        System.out.println("    → Headers");
        System.out.println("    → Status codes (200, 404, 500)");
        System.out.println("    → How the response is structured");
        System.out.println();
        System.out.println("  Real application example (Food App):");
        System.out.println("    API says   : GET /restaurants → gives list of restaurants");
        System.out.println("    HTTP sends : GET request to /restaurants");
        System.out.println("    Response   : Status 200 OK");
        System.out.println("    Data       : [ \"Restaurant A\", \"Restaurant B\" ]");
        System.out.println();
        System.out.println("=======================================================");
        System.out.println("  RECAP");
        System.out.println("=======================================================");
        System.out.println("  CLIENT      → Any app that sends a request");
        System.out.println("  SERVER      → Listens 24x7, processes, sends response");
        System.out.println("  HTTP        → The language/rules of communication");
        System.out.println("  API         → The menu: what endpoints exist & what they do");
        System.out.println("  SPRING BOOT → Framework for building server applications");
        System.out.println("  BACKEND     → Processes logic, talks to DB, sends response");
        System.out.println("=======================================================");
    }
}