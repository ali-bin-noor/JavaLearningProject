package designPatterns.behavioral.chainOfResposibility;

public class HR extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays) {
        if (leaveDays>12){
            System.out.println("We need to have a discussion on your leave request with HR.");
        }
    }
}
