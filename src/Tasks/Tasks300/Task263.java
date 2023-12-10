package Tasks.Tasks300;

import org.w3c.dom.ls.LSOutput;

interface Shape263
    {
        public double getArea();
    }

class Rectangle263 implements Shape263
    {
        private double width;
        private double height;

        public Rectangle263( double width, double height )
            {
                this.width = width;
                this.height = height;
            }

        @Override
        public double getArea()
            {
                return width * height;
            }
    }

class Triangle263 implements Shape263
    {
        private double width;
        private double height;

        public Triangle263( double width, double height )
            {
                this.width = width;
                this.height = height;
            }

        @Override
        public double getArea()
            {
                return width * height / 2;
            }
    }

class Circle263 implements Shape263
    {
        private double radius;

        public Circle263( double radius )
            {
                this.radius = radius;
            }

        @Override
        public double getArea()
            {
                return Math.PI * radius * radius;
            }
    }

public class Task263
    {
        public static void main( String[] args )
            {
                Rectangle263 rectangle263 = new Rectangle263( 10, 5 );
                System.out.println(rectangle263.getArea());

                Triangle263 triangle263 = new Triangle263( 10, 5 );
                System.out.println(triangle263.getArea());

                Circle263 circle263 = new Circle263( 10 );
                System.out.println(circle263.getArea());
            }
    }
