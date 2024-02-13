public class REYES_Midterm1 {
    public static void main(String[] args) {

        String name = "Aeinnor Ambros Reyes";
        String section = "BCS14";
        int colWidth = 23;
        
        String[][] courses  = {
            {"S-SCEN001TP", "ENVIRONMENTAL SCIENCE", "1000-1130", "M", "ASYNC"},
            {"S-SCEN001TP", "ENVIRONMENTAL SCIENCE", "1000-1130", "Th", "COS110"},
            {"G-SOSC004", "ETHICS", "1300-1430", "W", "COS106"},
            {"G-SOSC004", "ETHICS", "1300-1430", "S", "COS106"},
            {"G-PHED004", "TEAM SPORTS", "1530-1730", "W", "ULS"}
        };


        System.out.println("\t\t\t\t CERTIFICATE OF REGISTRATION");
        System.out.println("\t\t\t\tSecond Semester, SY 2023-2024");
        System.out.println("Name: " + name + "\t\t\t\t\t\t\t\t " + "CYS: " + section);
        System.out.println("===================================================================================================");
        System.out.println("COURSE CODE" + "\t \t" + "TITLE" + "\t \t \t" + "TIME" + "\t \t    " + "DAY" + "\t \t \t    " + "ROOM");

        for(String[] row: courses){
            for(String data: row){
                System.out.print(String.format("%-" + colWidth + "s", data));

            }
            System.out.println();
        }
    }
}
