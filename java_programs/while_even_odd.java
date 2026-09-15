public class while_even_odd {
    public static void main(String[]args){
        System.out.println("even numbers between 1 to 20 : ");
        int i=1;
        while(i<=20)
        {
        /*    if(i%2==0)
            {
                System.out.println(i);
            }*/

            if(i%2!=0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
