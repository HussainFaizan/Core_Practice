public class SwitchEx {
    public static void main(String args[]) {
        System.out.println("This is Example of Switch Stmt");
        String day = "MONDAY";
        switch (day) {
            case "MONDAY":
                System.out.println("This is MONDAY");
                break;
            case "TUESDAY":
                System.out.println("This is TUESDAY");
                break;
            default:
                System.out.println("This is DEFAULT");
                break;
        }
    }
}
