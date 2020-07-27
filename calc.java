import java.util.Scanner;

public class calc
{
public static void main(String[] args)
{

System.out.println("Welcome");
int result = 0;

Scanner input = new Scanner(System.in);
System.out.println("Please enter two numbers");

int numberOne = input.nextInt();
int numberTwo = input.nextInt();

System.out.println("Please select one: ");
System.out.println("+, - , / , * ");

char symbol = input.next().charAt(0);

switch(symbol)
{
  case '*':
  result = numberOne * numberTwo;
  break;
  case '-':
  result = numberOne - numberTwo;
  break;
  case '+':
  result = numberOne + numberTwo;
  break;
  case '/':
  result = numberOne / numberTwo;
  break;
}

System.out.println("Calculations: " + result );

  
}
}
