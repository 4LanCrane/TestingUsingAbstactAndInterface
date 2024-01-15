import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SystemSecurity {
     private HashMap<String, ArrayList<String>> roomAccess;
     private HashMap<String, ArrayList<String>> buildingAccess;
     private HashMap<String, ArrayList<String>> folderAccess;

    public SystemSecurity(HashMap<String, ArrayList<String>> roomAccess,HashMap<String, ArrayList<String>>  buildingAccess, HashMap<String, ArrayList<String>> folderAccess) {
        this.roomAccess = roomAccess;
        this.buildingAccess = buildingAccess;
        this.folderAccess = folderAccess;
    }

    public boolean isAllowedInRoom(HasId id,String roomID) {
        ArrayList<String> ids = roomAccess.get(roomID);
        return ids.contains(id.getId());
    }

    public boolean isAllowedInBuilding(HasId id,String buildingID) {
        ArrayList<String> ids = buildingAccess.get(buildingID);
        return ids.contains(id.getId());
    }

    public boolean isAllowedInFolder(HasId id,String folderID) {
        ArrayList<String> ids = folderAccess.get(folderID);
        return ids.contains(id.getId());
    }



}
