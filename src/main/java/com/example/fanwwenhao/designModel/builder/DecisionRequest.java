package com.example.fanwwenhao.designModel.builder;

public class DecisionRequest {

    private String moduleNo;
    private String bizType;
    private String ruleNo;
    private String bizNo;
    private String seqNo;

    public String getModuleNo() {
        return moduleNo;
    }

    public void setModuleNo(String moduleNo) {
        this.moduleNo = moduleNo;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public static DecisionRequestBuilder createBuilder(){
        return new DecisionRequestBuilder();
    }

    @Override
    public String toString() {
        return this.getBizNo() + " " + this.getBizType() + " " + this.getModuleNo();
    }

    public static class DecisionRequestBuilder {
        private DecisionRequest decisionRequest = new DecisionRequest();

        public DecisionRequestBuilder setModuleNo(String moduleNo) {
            this.decisionRequest.setModuleNo(moduleNo);
            return this;
        }

        public DecisionRequestBuilder setBizType(String bizType) {
            this.decisionRequest.setBizType(bizType);
            return this;
        }

        public DecisionRequestBuilder setRuleNo(String ruleNo) {
            this.decisionRequest.setRuleNo(ruleNo);
            return this;
        }

        public DecisionRequestBuilder setBizNo(String bizNo) {
            this.decisionRequest.setBizNo(bizNo);
            return this;
        }

        public DecisionRequestBuilder setSeqNo(String seqNo) {
            this.decisionRequest.setSeqNo(seqNo);
            return this;
        }
        public DecisionRequest build(){
            return this.decisionRequest;
        }
    }
}
