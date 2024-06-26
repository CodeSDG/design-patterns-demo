package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午7:33
 * @description 总监审批 负责2000元以上报销
 * @Copyright
 */
public class DirectorApprover implements Approver {

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount > 2000) {
            System.out.println("Director approved the request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }else {
            System.out.println("Request for " + amount + " could not be approved.");
        }
    }
}
