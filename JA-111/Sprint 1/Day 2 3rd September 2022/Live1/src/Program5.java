public class Program5 {
    public static void main(String[] args) {

//        for(int i=0;i<50;i++)
//        {
//            System.out.println("break");
//            if(i==2)
//            {
//                break;
//            }
//        }

        for (int i=0;i<5;i++)
        {
            System.out.println("outer" +i);
            for (int j=0;j<2;j++)
            {

                if(j==1)
                {
                    break;
                }
                System.out.println("inner" +j);
            }
        }

        while(true)
        {
            break;
//            System.out.println("hi");
        }

    }
}
