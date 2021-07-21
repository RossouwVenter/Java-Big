/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author rosso
 */
class Circle extends TwoDShape { 
  // A default constructor.
  Circle() {
    super();
  }

  // Construct Circle
  Circle(double x) {
    super(x, "circle"); // call superclass constructor
  }

  // Construct an object from an object.
  Circle(Circle ob) {
    super(ob); // pass object to TwoDShape constructor
  }
   
  double area() { 
    return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
  }   
}
