public class Main {
    public static void main(String[] args){
        // Your code here!
        Demo data = new Demo(); // Default Constructor object
        Demo data1 = new Demo("Gunika", 19); // Parametrized Constructor object
        
        System.out.println(data.name + " : " + data.age);
        System.out.println(data1.name + " : " + data1.age);
        
    }
}
