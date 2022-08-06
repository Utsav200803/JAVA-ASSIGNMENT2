/*
   UTSAV GUNDARANIYA 21CE037

Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it.*/

import java.util.*;
class Ass2_que1_1
{
  double radius;
  Ass2_que1_1()
  {
    radius=0;
  }
  Ass2_que1_1(double r)
  {
    radius=r;
  }
  public double getArea()
  {
    double area=3.14*radius*radius;
    return area;
  }
  public double getPerimeter()
  {
    double Perimeter=3.14*2*radius;
    return Perimeter;
  }
}

