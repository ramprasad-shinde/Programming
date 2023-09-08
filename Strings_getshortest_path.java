public class Strings_getshortest_path 
{
    public static float shrotestpath(String path)
    {
        int x=0, y=0;

        for(int i=0; i<path.length(); i++)
        {
            int dir = path.charAt(i);
            //north
            if(dir == 'N')
            {
                y++;
            }
            //south
            else if(dir == 'S')
            {
                y--;
            }
            //east
            else if(dir == 'E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }   
    public static void main(String[] args) 
    {
        String path ="WNEENESENNN";
        System.out.println(shrotestpath(path));    
    } 
}
