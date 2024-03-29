package Tasks.Tasks150;

public class Task139
    {
        public static void main( String[] args )
            {
                MyRectangle myRectangle1 = new MyRectangle();
                myRectangle1.setWidth( 12.4 );
                myRectangle1.setHeight( 20.0 );
                System.out.println(myRectangle1.getArea());

                MyRectangle myRectangle2 = new MyRectangle();
                myRectangle2.setWidth( 1.13 );
                myRectangle2.setHeight( 80.9 );
                System.out.println(myRectangle2.getArea());

                MyRectangle myRectangle3 = new MyRectangle();
                myRectangle3.setWidth( 15.0 );
                myRectangle3.setHeight( 10.0 );
                System.out.println(myRectangle3.getArea());
            }
    }

class MyRectangle
    {
        private double width;
        private double height;

        public void setWidth( double width )
            {
                this.width = width;
            }

        public void setHeight( double height )
            {
                this.height = height;
            }

        public double getArea()
            {
                return width * height;
            }
    }
