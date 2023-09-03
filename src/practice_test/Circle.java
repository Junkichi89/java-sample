package practice_test;

public class Circle {
	  public static void main(String[] args){
		    int radius = Integer.parseInt(args[0]);
		    double pi = 3.141592;
		    double area;
		    
		    area = (float) radius * radius * pi;
		    
		    area = (int)(area * 100);
		    area = area / 100;
		    
		    //小数点第3位以降を切り捨てて
		    
		    System.out.println("半径" + radius);
		    System.out.println("面積" + area);
		  }
}
