package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午7:24
 * @description 抽象审批者
 * @Copyright
 */


public interface Approver {
    void setNextApprover(Approver approver);

    void approveRequest(int amount);
}

