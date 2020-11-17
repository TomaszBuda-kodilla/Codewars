package Bank;

public class Account {
    private int status = 0;
    public int deposit (int count){
        status = status + count;
        return status;
    }
    public int withdraw (int withdraw){
        status = status + withdraw;
        return status;
    }
}
