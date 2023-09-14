import java.util.Scanner;

public class WilbertChatBotUnit1 {

  // Two overloaded methods; return greeting + return greeting & query
  // Using switch expressions

  public static String respond(String tone){
    return switch(tone){
      case "friendly" -> "Chatbot: Hello! How can I assist you today?" + "\n";
      case "angry" -> "Chatbot: You're always asking for something, what is it this time!?" + "\n";
      case "sarcastic" -> "Chatbot: Oh look who it is again, how can i help?" + "\n";
      default -> "Chatbot: Hello. How can I help?" + "\n";
    };
  }

  public static String respond(String tone, String query){
      return switch(tone){
        case "friendly" -> switch (query){
          case "hello" -> "Chatbot: hi there, how can i help?" + "\n";
          default -> "Chatbot: I'm not sure about that" + "\n";
        };
        case "angry" -> switch (query){
          case "hello" -> "Chatbot: AHHH" + "\n";
          default -> "Chatbot: STOP ASKING" + "\n";
        };
        case "sarcastic" -> switch (query){
          case "hello" -> "Chatbot: Look who it is!" + "\n";
          default -> "Chatbot: Shouldve asked another Chatbot!" + "\n";
        };
        default -> switch (query){
          case "hello" -> "Chatbot: Look who it is!" + "\n";
          default -> "Chatbot: By default id rather not respond" + "\n";
    };
  };
}

// ===================================

public static void main (String[] args){

  Scanner input = new Scanner(System.in);
  String tone = "none";
  boolean exit = false;


// Keeps going until exit 
// Display Menu

  while (!exit){

    System.out.println("Menu:");
    System.out.println("1. Choose your Chatbot");
    System.out.println("2. Set the Tone");
    System.out.println("3. Chat");
    System.out.println("4. Exit");

    int choice = input.nextInt();
    input.nextLine();

    switch (choice) {
      case 1 -> System.out.println("You've chosen ChatBot!" + "\n");
      case 2 -> {
          System.out.println("Choose a tone (friendly, angry, sarcastic): ");
          tone = input.nextLine();
      }
      case 3 -> {
          System.out.println("Enter your query: ");
          String query = input.nextLine();
          System.out.println(respond(tone, query));
      }
      case 4 -> exit = true;
      default -> System.out.println("Invalid choice. Please choose again.");
  }
}
}
}



