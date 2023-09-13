package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Scanner;

public class Task203
    {
        public static void main( String[] args )
            {
                int[] mas1 = new int[10];
                int[] mas2 = new int[10];

                for (int i = 1; i <= 10; i++)
                    {
                        mas1[i-1] = i;
                        mas2[10-i] = i;
                    }

                for (int i = 0; i < 10; i++)
                    {
                        System.out.println(mas1[i]);
                    }
                System.out.println();

                for (int i = 0; i < 10; i++)
                    {
                        System.out.println(mas2[i]);
                    }
            }
    }
