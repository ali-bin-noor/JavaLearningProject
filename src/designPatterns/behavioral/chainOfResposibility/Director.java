package designPatterns.behavioral.chainOfResposibility;

public class Director extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays) {
        if (leaveDays<=12){
            System.out.println("Your leaves are approved by Director.");
        }else if (nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }else {
            System.out.println("Leave request denied. Too many days!");
        }
    }
}
