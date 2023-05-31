import java.util.Scanner;
class Main {
public static void main(String[] args) {
int the_num = (int)(Math.random()*100);
while (true) {
System.out.println("so you want to quite:");
Scanner tell =new Scanner(System.in);
String ans = tell.nextLine();
if (ans.equals("yes")){
break;
}
System.out.println("guess the number!:");
Scanner guess = new Scanner(System.in);
int Guessed_num = guess.nextInt();
if (Guessed_num== the_num){
System.out.println("yahuuu..you win!!!");
break;
}
if (Guessed_num < the_num){
System.out.println("Nah, the number is larger !");
}
else if (Guessed_num> the_num){
System.out.println("Nah, the number is less !");
}
}
}
}