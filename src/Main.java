//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
       {
           double summerMaintenance = 500;
           double fallMaintenance = 300;
           double winterMaintenance = 150;
           double springMaintenance = 180;
           double yearlyMaintenance = fallMaintenance + winterMaintenance + springMaintenance;

           System.out.println("The summerMaintenance cost is $" + summerMaintenance);
           System.out.println("The fallMaintenance cost is $" + fallMaintenance);
           System.out.println("The winterMaintenance cost is $" + winterMaintenance);
           System.out.println("The springMaintenance cost is $" + springMaintenance);
           System.out.println("The yearlyMaintenance cost is $" + yearlyMaintenance);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }

}