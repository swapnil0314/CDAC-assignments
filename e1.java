

class e1{

    public static void main(String[] args) {
        

        int a = 10 , b = 0 , c ;

        System.out.println("Inside main");

        try{
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("------------------------");
        
    }
}