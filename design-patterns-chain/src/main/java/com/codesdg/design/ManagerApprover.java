package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午7:30
 * @description 经理审批 负责审批500 -2000元的报销
 * @Copyright
 */
public class ManagerApprover implements Approver {

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approveRequest(int amount) {

        if (amount >= 500 && amount < 2000) {
            System.out.println("Manager approved the request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        } else {
            System.out.println("Request for " + amount + " could not be approved.");
        }
    }
}
