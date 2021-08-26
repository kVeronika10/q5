package page;

public class Guide extends PageBase{
    public static boolean checkGuideURL()
    {
        return checkURL("http://localhost:8080/admin/Guide/operations");
    }
}
