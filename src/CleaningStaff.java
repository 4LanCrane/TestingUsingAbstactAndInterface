public class CleaningStaff extends SchoolMember{

    public CleaningStaff (String id,String FirstName,String LastName){
        this.id = id;
        this.FirstNames = FirstName;
        this.LastName = LastName;
    }

    @Override
    public String getId() {
        return id;
    }
}
