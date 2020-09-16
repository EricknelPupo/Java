package com.company;

class Main4 {
    public class Circle
    {
        //attribute of the circle class
        private double radius;
        private final double pi = 3.14;

        //constructors
        public Circle(double rad)
        {
            radius = rad;
        }

        //no argument Constructor
        public Circle()
        {
            radius = 0;
        }

        //creating methods to work with object
        public double getRadius() //accessor method
        {
            return radius;
        }

        public double getArea()
        {
            return pi * radius * radius;
        }

        public void setRadius(double rad) //mutator method
        {
            radius = rad;
        }

    }
    public class CircleRunner
    {
        public void main(String[] args)
        {
            Circle myCircle = new Circle(10);

            System.out.println("My original Circle's radius is: " + myCircle.getRadius());
            System.out.println("My original Circle's area is: " + myCircle.getArea());
            //^ should print 10.0 and then 314.0

            myCircle.setRadius(100);
            System.out.println("My updated Circle's radius is: " + myCircle.getRadius());
            System.out.println("My updated Circle's area is: " + myCircle.getArea());
            //^ should print 100.0 and then 31400.0

            Circle mySecondCircle = new Circle();
            System.out.println("My second Circle's radius is: " + mySecondCircle.getRadius());
            System.out.println("My second Circle's area is: " + mySecondCircle.getArea());
            //^ should print 0.0 and then 0.0

            mySecondCircle.setRadius(1);
            System.out.println("My second Circle's radius is: " + mySecondCircle.getRadius());
            System.out.println("My second Circle's area is: " + mySecondCircle.getArea());
            //^ should print 1.0 and then 3.14

        }
    }
}