import java.util.Scanner; // import Scanner Class


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //make Object From Scanner Calss

    System.out.println("Hello Welcome To HacktoberFesr!\n");

    System.out.print("Enter Your Name : ");
    String name = scan.next();  //get keyboard input String value and save in name variable

    System.out.print("Enter Your Country : ");
    String country = scan.next();  //get keyboard input String value and save in country variable

    System.out.print("\n");
    
    //final statement
    System.out.println("Thank You " + name);  //thank with name
    System.out.println("~" +country+ "~"); //display country
    System.out.print("\n");

  }
}
