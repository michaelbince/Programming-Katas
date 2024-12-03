public class LettersVerification {

  private final String name = "olo";

  public Boolean verifyFirstAndLastLetterAreSame(String name){
    if (name.isEmpty()){
      throw new IllegalArgumentException("Name should no be empty");
    }
    String[] nameToAnalyse = name.toLowerCase().split("");
    int nameLength = nameToAnalyse.length-1;
    if(nameToAnalyse[0].equals(nameToAnalyse[nameLength])){
      System.out.println(nameToAnalyse[0]+" and " + nameToAnalyse[nameLength] + " are the same");
      return true;
    }
    System.out.println(nameToAnalyse[0]+" and " + nameToAnalyse[nameLength] + " are not the same");
    return false;
  }

  public boolean verifyFirstAndLastLetterAreSame() {
    // Check for empty string
    if (name.isEmpty()) {
      return false;
    }

    // Convert name to lowercase once
    String lowercaseName = name.toLowerCase();

    // Access first and last characters directly
    char firstLetter = lowercaseName.charAt(0);
    char lastLetter = lowercaseName.charAt(lowercaseName.length() - 1);

    return firstLetter == lastLetter;
  }
}
