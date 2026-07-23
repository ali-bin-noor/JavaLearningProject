package designPatterns.behavioral.chainOfResposibility;

public class Manager extends Approver{

    @Override
    public void processLeaveRequest(int leaveDays) {
        if (leaveDays<=7){
            System.out.println("Your leaves are approved by Manager.");
        }else if (nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
