package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午7:07
 * @description
 * @Copyright
 */
public class Main {
    public static void main(String[] args) {
        // 组装责任链
        Approver teamLead = new TeamLeadApprover();
        Approver director = new DirectorApprover();
        Approver manager = new ManagerApprover();
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        //测试报销
        //应当组长批准
        teamLead.approveRequest(500);
        // 应当经理批准
        teamLead.approveRequest(800);
        // 应当总监批准
        teamLead.approveRequest(5000);

    }
}