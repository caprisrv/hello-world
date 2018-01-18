public class diffOutOnDiffRun
{

    void show(int count)
    {
        switch(count % 3)
        {
            case 0: System.out.println("Hi.......");
                    break;

            case 1: System.out.println("Hello.......");
                    break;

            case 2: System.out.println("What's up .......");
                    break;

            default: System.out.println("Ooops........");
                    break;
        }
    }

    public static void main(String[] args) 
    {
    	myPreference myP = new myPreference();

    	int progExecutionCount = myP.getExecutionCount();

        diffOutOnDiffRun  test = new diffOutOnDiffRun();

        test.show(progExecutionCount);
    }
}