import java.util.*;
public class SnakeAndLadderUc7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int player1Position = 0;
int player2Position = 0;

int rollDice = 0;
int rollDice2 = 0;

int ladderSimulation = 0;

int snakeSimulation = 0;

int ladder = 14;
int ladder2 = 6;
int snake = -6;
//int snake2 = -6;
int moves =0;
String str="";
while(player1Position<100 && player2Position<100)
{
moves++;
rollDice = (int)(Math.floor(Math.random()*10)%6)+1;
rollDice2 = (int)(Math.floor(Math.random()*10)%6)+1;
ladderSimulation = (int)(Math.floor(Math.random()*10)%3);

snakeSimulation = (int)(Math.floor(Math.random()*10)%3);

player1Position+=rollDice;
player2Position+=rollDice2;

if(player1Position <= 0)
player1Position=0;
if(player2Position <= 0)
player2Position=0;
if(ladderSimulation == 1)
{
player1Position+=ladder;
rollDice = (int)(Math.floor(Math.random()*10)%6)+1;
player1Position+=rollDice;
}
if(ladderSimulation == 1)
{
player2Position+=ladder;
rollDice2 = (int)(Math.floor(Math.random()*10)%6)+1;
player2Position+=rollDice2;
}
if(ladderSimulation == 2)
{
player1Position+=ladder2;
player1Position+=ladder2;
}
if(snakeSimulation == 1)
player1Position-=snake;
if(snakeSimulation == 0)
player2Position-=snake;

if(player1Position==100)
{
    str="player1 won the match";
break;
}
if(player2Position==100)
{
    str="player2 won the match";
break;
}
if(player1Position > 100)
{
player1Position-=(player1Position-100);
ladderSimulation=0;

    str="player1 won the match";
}

if(player2Position > 100)
{
player2Position-=(player2Position-100);
ladderSimulation=0;

    str="player2 won the match";
}
System.out.println(player1Position+" "+player2Position);

}
System.out.println(str+" after "+moves+" moves");
}
}