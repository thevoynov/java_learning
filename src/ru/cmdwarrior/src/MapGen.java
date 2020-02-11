package ru.cmdwarrior.src;

public class MapGen
{
    public static int[][] point = new int [20][20];

    public static void generation()
    {
        for(int i=0;i<point.length;i++)
        {
            for(int j=0;j<point.length;j++)
            {
                point[i][j] = 0;
                System.out.print(point[i][j]);
            }
            System.out.println();
        }

        Ship.spawn(0,0);
    }



}
