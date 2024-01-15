public class Maintance extends SchoolMember{


    public Maintance (String id,String FirstName,String LastName){
        this.id = id;
        this.FirstNames = FirstName;
        this.LastName = LastName;
    }

    @Override
    public String getId() {
        return id;
    }

}
