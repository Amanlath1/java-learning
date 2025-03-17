public class sentenceManipulation {
  public static void main(String[] args) {
    String sentence = "Java programming is fun and educational";
    System.out.println(sentence.contains("fun"));
    
    System.out.println(sentence.replace("educational","awesome"));

    System.out.println(sentence.length());

    System.out.println(sentence.substring(0,17));
  }
}
