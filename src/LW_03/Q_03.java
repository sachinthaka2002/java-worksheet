package LW_03;

public class Q_03 {
    public static void main(String[] args) {
           owner o1 = new owner("John Doe","0771234567");
        System.out.println("Owner Name: "+o1.getOwnerName());
        System.out.println("Phone no : "+ o1.getPhoneNo());
    }
}
class owner {

    private String ownerName;
    private String phoneNo;

    public owner() {
        ownerName = "Unknown";
        phoneNo = "Not available";
    }
    public owner(String ownerName,String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}

