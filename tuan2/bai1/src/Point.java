
public class Point {
	private int x;
	private int y;
	 public Point(int x, int y) 
	 {//khoi tao Point co toa do xy
	        this.x = x;
	        this.y = y;
	    }

	    public Point()
	    {//khoi tao voi toa so 0;0
	        this.x = 0;
	        this.y = 0;
	    }
	    public Point(Point p)
	    {//viet ra thui hem hieu co giong y cua de bai khong
	        this.x = p.x;
	        this.y = p.y;
	    }
	//tao Set va get cho x va y

	    public int getX()
	    {
	        return x;
	    }

	    public int getY()
	    {
	        return y;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }
	   public double Khoangcach(Point p)
	   {
		   double kc;
	        kc = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	        return kc;
	   }

}
