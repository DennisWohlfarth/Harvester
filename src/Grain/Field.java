package Grain;

import java.util.Random;

public class Field {

    Random zufallsgenerator = new Random();
    public Wheat [][] wheat = new Wheat[10000][10000];
    public Field(){


        for(int i = 0 ; i<10000; i++)
        {
            for (int j = 0; j<10000; j++)
            {
                wheat[i][j] = new Wheat((short)(zufallsgenerator.nextInt(401)+100));

            }
            System.out.println(i);
        }
        System.out.println("Da");

    }
}
