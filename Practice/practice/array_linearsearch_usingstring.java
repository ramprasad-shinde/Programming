package Practice.practice;

public class array_linearsearch_usingstring {
    public static int linearsearch(String menue[], String key) {
        for (int i = 0; i < menue.length; i++) {
            if (menue[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String menue[] = { "samosa", "vadapav", "idali", "dosa", "puribhaji" };
        String key = "dosa";

        int result  =   linearsearch(menue, key);
        if(result == -1 )
        {
            System.out.println("This is not avaliable");
        }
        else
        {
            System.out.println("Index is "+result);
        }

    }
}
