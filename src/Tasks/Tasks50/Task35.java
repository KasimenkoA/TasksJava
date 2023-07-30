package Tasks.Tasks50;

public class Task35
    {
        public static void main( String[] args )
            {
                Figure fig1 = new Figure( "circle" );
                fig1.square = 10;
                fig1.color = "red";
                System.out.println(fig1.name + " " + fig1.color);

                Figure fig2 = new Figure( "rectangle" );
                fig2.square = 16;
                fig2.color = "blue";
                System.out.println(fig2.name + " " + fig2.color);

                Figure fig3 = new Figure( "triangle" );
                fig3.square = 12;
                fig3.color = "yellow";
                System.out.println(fig3.name + " " + fig3.color);

            }
    }

class Figure
    {
        String name;
        int square;
        String color;

        Figure(String name)
            {
                this.name = name;
            }
    }
