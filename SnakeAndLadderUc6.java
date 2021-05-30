import java.util.*;
public class SnakeAndLadderUc6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int playerPosition = 0;
int rollDice = 0;
int ladderSimulation = 0;

int snakeSimulation = 0;

int ladder = 14;
int ladder2 = 6;
int snake = -6;
//int snake2 = -6;
int moves =0;
while(playerPosition<100)
{
moves++;
rollDice = (int)(Math.floor(Math.random()*10)%6)+1;
ladderSimulation = (int)(Math.floor(Math.random()*10)%3);

snakeSimulation = (int)(Math.floor(Math.random()*10)%3);

playerPosition+=rollDice;
if(playerPosition <= 0)
playerPosition=0;
if(ladderSimulation == 1)
playerPosition+=ladder;
if(ladderSimulation == 2)
playerPosition+=ladder2;
if(snakeSimulation == 1)
playerPosition-=snake;
if(playerPosition==100)
break;
if(playerPosition > 100)
{
playerPosition-=(playerPosition-100);
ladderSimulation=0;
}
System.out.println(playerPosition);

}
System.out.println("player won the match after "+moves+" moves");
}
}