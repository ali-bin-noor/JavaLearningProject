package designPatterns.behavioral.chainOfResposibility;

public class Supervisor extends Approver{

    @Override
    public void processLeaveRequest(int leaveDays) {
        if (leaveDays<=3){
            System.out.println("Your leaves are approved by Supervisor.");
        }else if (nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
