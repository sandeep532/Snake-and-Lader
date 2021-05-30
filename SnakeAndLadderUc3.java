import java.util.Scanner;
public class SnakeAndLadderUc3
{
public static void main(String args[])
{
Scanner S= new Scanner(System.in);
int playerPlace = 0;
int rollDice = (int)(Math.floor(Math.random()*10)%6)+1;
int ladderplace = (int)(Math.floor(Math.random()*10)%3);

int snakeplace= (int)(Math.floor(Math.random()*10)%3);

System.out.println(rollDice);
int ladder = 18;
int ladder2 = 8;
int snake = -18;
int snake2 = -8;
if(playerPlace<= 0)
System.out.println("No play");
if(ladderPlace== 1)
playerPlace+=ladder;
if(ladderplace== 2)
playerPlace+=ladder2;
if(snakeplace== 1)
playerplace-=snake;
if(snakePlace == 2)
playerPosition-=snake2;
}
}