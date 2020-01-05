package object;

public class cube {
    int length ;
    int breadth ;
    int height ;
    public int getvolume()
    {
        return (length*breadth*height);
    }

    cube()
    {

        //System.out.println("we are in cubes");
        length=10;
        breadth=20;
        height=10;


    }
    cube(int l,int b, int h)
    {

        //System.out.println("we are in cubes");
        length=l;
        breadth=b;
        height=h;


    }

}
