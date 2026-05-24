package OOPS;

class BankAccounts{
    int id;
    String branch;
    int accNo;

    BankAccounts(int id, String branch, int accNo){
        this.id = id;
        this.branch = branch;
        this.accNo = accNo;
    }

   @Override
    public String toString(){
        return "BankAccount{Id: "+id+","+
                " Branch: "+branch+","+
                " Account Number: "+accNo+"}";
    }
}
public class ToString_28 {
    public static void main(String[] args) {
        BankAccounts accounts = new BankAccounts(101,"Kottayam",1234);
        System.out.println(accounts);
        /*
        without overriding toString() --> OOPS.BankAccounts@1b28cdfa
        with overriding toString() --> BankAccount{Id: 101, Branch: Kottayam, Account Number: 1234}
         */
    }
}
