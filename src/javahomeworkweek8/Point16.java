package javahomeworkweek8;

public class Point16 {
    int x;
    int y;

    //first constructor without params
   Point16(){

   }

    //second constructor with 2 params
    Point16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //first method get-no params
    public int getx() {
        return x;
    }

    //second method get - no params
    public int getY() {
        return y;
    }

    //third method set - with params
    public void setX(int x) {
        this.x = x;

    }
    //forth method-one params

    public void setY(int y) {
        this.y = y;
    }

    //fifth method without params
    public double distance() {
        double dis;
        int x1 = getx();
        int x2 = 0;
        int y1 = getY();
        int y2 = 0;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }

    //6th method with params
    public double distance(int x, int y) {
        double dis;

        int x1 = this.x;
        int x2 = x;
        int y1 = this.y;
        int y2 = y;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }
    // this method is pass the object parameter to find the distance of point

    public double distance(Point16 second) {
        double dis;
        double x1 = this.x;
        double x2 = second.x;
        double y1 = this.y;
        double y2 = second.y;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }

    public static void main(String[] args) {
        //set the value of x and y
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)=" + first.distance());
        //get the distacne of point by passing parameter as object
        System.out.println("distance(second)=" + first.distance(second));
        System.out.println("distance(2,2)=" + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()=" + point.distance());
    }
}


