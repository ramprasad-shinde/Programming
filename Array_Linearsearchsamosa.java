public class Array_Linearsearchsamosa 
{
    public static int Menue(String menue[],String choice )    
    {
        for(int i=0;i<menue.length;i++)
        {
            if(menue[i] == choice)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) 
    {
       String menue[]={"Dosa","Idali","Samosa","vadapav","Menduvada","Masaladosa"};
       String choice="Menduvada";    

       int index=Menue(menue, choice);
       if(index == -1)
       {
           System.out.println("Not found");
       }
       else
       {
        System.out.println("Index is :"+index);
       }
    }
}
