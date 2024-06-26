package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午7:26
 * @description 小组长审批 500元以下
 * @Copyright
 */
public class TeamLeadApprover implements Approver{

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 500) {
            System.out.println("Team Lead approved the request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }else {
            System.out.println("Request for " + amount + " could not be approved.");
        }
    }
}
