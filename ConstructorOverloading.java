class ConstructorOverloading
{
    int length,breath;
    Rectangle(int x,int y)
    {
        length=x;breath=y;
    }
    Rectangle(int x)
    {
        length=x;
        breath=5;
    }
    Rectangle()
    {
        length=9;
        breath=7;
        }
        float GetData()
        {
            return(length*breath);
        }
}
public class ConstructorOverloading
{
    public static void main(String args[])
    {
        Rectangle Rect=new Rectangle();
        Rectangle Rect1=new Rectangle(4);
        Rectangle Rect2=new Rectangle(4,4);
        System.out.println("Area of First Rectangle is:"+Rect.GetData());
        System.out.println("Area of Second Rectangle is:"+Rect1.GetData());
        System.out.println("Area of Third Rectangle is:"+Rect2.GetData()); 
    }
}