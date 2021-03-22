package Factory;
public class Point {
private int xCoordinate;
private int yCoordinate;
	//Constructor taking two arguments x and y screen coordinates
	Point(int x,int y){
		xCoordinate = x;
		yCoordinate = y;
	}
	int getX(){
		return xCoordinate;
	}
	int getY(){
		return yCoordinate;
	}
}