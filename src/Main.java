import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       ArrayList<SchoolMember> listOfSchoolMembers = new ArrayList<>();
       listOfSchoolMembers.add(new Student("S1","Allen","Carr"));
       listOfSchoolMembers.add(new Student("S2","Abbie, Riley","Reid"));
        listOfSchoolMembers.add(new Staff("ST1","Dick","Dickson"));
        listOfSchoolMembers.add(new Maintance("G1","Grounds Keeper","Willy"));
        listOfSchoolMembers.add(new Student("C1","Clean","Mcgee"));


        ArrayList<Building> buildings = new ArrayList<>();

        Building b1 = new Building("b1","The big one");
        ArrayList<String> b1Access = new ArrayList<>();
        b1Access.add("G1");
        b1Access.add("C1");
        b1Access.add("ST1");

        Building b2 = new Building("b2","The Massive one");
        ArrayList<String> b2Access = new ArrayList<>();
        b2Access.add("G1");
        b2Access.add("C1");
        b2Access.add("ST1");
        b2Access.add("S1");
        b2Access.add("S2");

        buildings.add(b1);
        buildings.add(b2);

        HashMap<String,ArrayList<String>> buildingAccess = new HashMap<>();
        buildingAccess.put("b1",b1Access);
        buildingAccess.put("b2",b2Access);



       ArrayList<Room> rooms = new ArrayList<>();
       Room r1 = new Room("101",b1,true);
       ArrayList<String> r1Access = new ArrayList<>();
       r1Access.add("G1");
       r1Access.add("C1");
       r1Access.add("ST1");
       r1Access.add("S1");
       r1Access.add("S2");

       Room r2 = new Room("102",b1,false);
       ArrayList<String> r2Access = new ArrayList<>();
       r2Access.add("G1");
       r2Access.add("C1");
       r2Access.add("ST1");
       r2Access.add("S1");
       r2Access.add("S2");



       Room r3 = new Room("103",b1,true);
        ArrayList<String> r3Access = new ArrayList<>();
        r3Access.add("C1");
        r2Access.add("S2");


       Room r4 = new Room("001",b2,false);
       ArrayList<String> r4Access = new ArrayList<>();
       r4Access.add("C1");
       r4Access.add("ST1");



       Room r5 = new Room("002",b2,false);
        ArrayList<String> r5Access = new ArrayList<>();
        r5Access.add("ST1");


       Room r6 = new Room("666",b2,true);
        ArrayList<String> r6Access = new ArrayList<>();
        r6Access.add("G1");
        r2Access.add("S1");
        r2Access.add("S2");

        HashMap<String,ArrayList<String>> roomAccess = new HashMap<>();
        roomAccess.put("101",r1Access);
        roomAccess.put("102",r2Access);
        roomAccess.put("103",r3Access);
        roomAccess.put("001",r4Access);
        roomAccess.put("002",r5Access);
        roomAccess.put("666",r6Access);


       rooms.add(r1);
       rooms.add(r2);
       rooms.add(r3);
       rooms.add(r4);
       rooms.add(r5);
       rooms.add(r6);






       ArrayList<Folder> folders = new ArrayList<>();
       Folder f1 = new Folder("f1","chatsturbate++");
       ArrayList<String> f1Acess = new ArrayList<>();
       f1Acess.add("S1");
       f1Acess.add("S2");

       Folder f2 = new Folder("f2","Alex's instagram porn");
       ArrayList<String> f2Acess = new ArrayList<>();
       f2Acess.add("G1");

       Folder f3 = new Folder("f3","HotMilfsInYourArea");
        ArrayList<String> f3Acess = new ArrayList<>();
        f3Acess.add("ST1");
        f3Acess.add("G1");

       Folder f4 = new Folder("f4","WhenIDiePleaseDeleteIfYouLoveMe");
        ArrayList<String> f4Acess = new ArrayList<>();
        f4Acess.add("S1");

        HashMap<String,ArrayList<String>> folderAccess = new HashMap<>();
        folderAccess.put("f1",f1Acess);
        folderAccess.put("f2",f2Acess);
        folderAccess.put("f3",f3Acess);
        folderAccess.put("f4",f4Acess);

       folders.add(f1);
       folders.add(f2);
       folders.add(f3);
       folders.add(f4);

       SystemSecurity systemSecurity = new SystemSecurity(roomAccess,buildingAccess,folderAccess);




    }

}
