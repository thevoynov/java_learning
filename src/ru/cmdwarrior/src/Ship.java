package ru.cmdwarrior.src;
import static ru.cmdwarrior.src.MapGen.point;
public class Ship
{
    public static int health = 100;
    public static int armor = 100;

    public static void spawn(int x, int y)
    {
        point[x][y] = 1;
    }
}
