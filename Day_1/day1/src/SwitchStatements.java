public class SwitchStatements {
    public static void main(String[] args) {
        String day = "thursday";
        switch(day){
            case "sunday":
                System.out.println("it is sunday");
                break;
            case "monday":
                System.out.println("it is monday");
                break;
            default:
                System.out.println("Enter a valid day");
                break;

        }
    }
}
