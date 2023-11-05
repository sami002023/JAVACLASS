public class daysswitch {
    public static void main(String[] args) {
        String dayOfWeek = "Friday";

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("End of relaxation .Fight for your future !.");
                break;
            case "Tuesday":
                System.out.println("You're thinking about how to survive the week.");
                break;
            case "Wednesday":
                System.out.println("You're half way there !");
                break;
            case "Thursday":
                System.out.println("The weekend is almost here.");
                break;
            case "Friday":
                System.out.println("Hurray! We did it. We survived.");
                break;
            default:
                System.out.println("It's the weekend or an unknown day.");
        }
    }

    
}
