package designPatterns.behavioral.chainOfResposibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver hr = new HR();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(hr);

        supervisor.processLeaveRequest(11);
    }
}
