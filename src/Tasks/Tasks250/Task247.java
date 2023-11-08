package Tasks.Tasks250;

import java.util.ArrayList;

class Figure247
    {
        void showInfo()
            {
                System.out.println("Figure!");
            }
    }

class Square247 extends Figure247
    {
        @Override
        void showInfo()
            {
                super.showInfo();
                System.out.println("Square! Number of corners: 4");
            }
    }

class Triangle247 extends Figure247
    {
        @Override
        void showInfo()
            {
                super.showInfo();
                System.out.println("Triangle! Number of corners: 3");
            }
    }

public class Task247
    {
        public static void main( String[] args )
            {
                ArrayList<Figure247> figures = new ArrayList<>();

                Figure247 figure1 = new Square247();
                Figure247 figure2 = new Triangle247();

                figures.add( figure1 );
                figures.add( figure2 );

                for (Figure247 figure : figures)
                    {
                        figure.showInfo();
                    }
            }
    }
