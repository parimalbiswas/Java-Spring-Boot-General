class RBI{
    public int getROI()
    {
        int ROI = 0;
        System.out.println("RBI interest is 0%");
        return ROI;
    }
}

class  HDFC extends RBI{
    @Override
    public int getROI()
    {
        int ROI = 8;
        System.out.println("HDFC interest is 8%");
        return ROI;
    }
}

class SBI extends RBI{
    @Override
    public int getROI()
    {
        int ROI = (int)7.5;
        System.out.println("SBI interest is 7.5%");
        return ROI;
    }
}

public class _1WeProblem {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.getROI();
        SBI sbi = new SBI();
        sbi.getROI();


    }
}
