package _6_interface;

public interface Shape {

  //implicitly public, static and final
  public String LABEL = "Shape";
	
  //interface methods are implicitly abstract and public
  void draw();

  double getArea();
}