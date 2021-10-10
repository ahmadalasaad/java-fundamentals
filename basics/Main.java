import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
public class Main{
public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);
    clock();
}

static String pluralize(String str,int num){
if(num == 1){
return str;
}else {
return str+"s";
}}

static void flipNHeads(int n){
int count=0;
int y=0;
while(true){
count++;
double random=Math.random();
String x=" ";
if(random>.5){
x="heads";
}else if(random<.5){
x="tails";
}
if (x=="tails"){
System.out.println(x);
y=0;
}
if(x=="heads"&&y<=n){
System.out.println(x);
y++;
}
if(y==n){
System.out.println("It took "+count+" flips to flip "+n+" heads in a row.");
break;
}}}

static void clock(){
int newTime = 0;
while(true){
LocalDateTime now = LocalDateTime.now();
int hour = now.getHour();
int minute = now.getMinute();
int second = now.getSecond();
// or, if you're feeling fancy
String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
if(second !=newTime){
newTime=second ;
System.out.println(time);
}}}
}