package com.example.kr.demo.resp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceData {
  @JsonProperty("api_tran_id")
  private String apiTranId;

  @JsonProperty("api_tran_dtm")
  private String apiTranDtm;

  @JsonProperty("rsp_code")
  private String rspCode;

  @JsonProperty("rsp_message")
  private String repMessage;

  @JsonProperty("bank_tran_id")
  private String bankTranId;

  @JsonProperty("bank_tran_date")
  private String bankTranDate;

  @JsonProperty("bank_code_tran")
  private String bankCodeTran;

  @JsonProperty("bank_rsp_code")
  private String bankRspCode;

  @JsonProperty("bank_rsp_message")
  private String bankRspMessage;

  @JsonProperty("fintech_use_num")
  private String fintechUseNum;

  @JsonProperty("balance_amt")
  private String balanceAmt;

  @JsonProperty("available_amt")
  private String availableAmt;

  @JsonProperty("account_type")
  private String accountType;

  @JsonProperty("produce_name")
  private String productName;

  public String getApiTranId() {
    return apiTranId;
  }

  public void setApiTranId(String apiTranId) {
    this.apiTranId = apiTranId;
  }

  public String getApiTranDtm() {
    return apiTranDtm;
  }

  public void setApiTranDtm(String apiTranDtm) {
    this.apiTranDtm = apiTranDtm;
  }

  public String getRspCode() {
    return rspCode;
  }

  public void setRspCode(String rspCode) {
    this.rspCode = rspCode;
  }

  public String getRepMessage() {
    return repMessage;
  }

  public void setRepMessage(String repMessage) {
    this.repMessage = repMessage;
  }

  public String getBankTranId() {
    return bankTranId;
  }

  public void setBankTranId(String bankTranId) {
    this.bankTranId = bankTranId;
  }

  public String getBankTranDate() {
    return bankTranDate;
  }

  public void setBankTranDate(String bankTranDate) {
    this.bankTranDate = bankTranDate;
  }

  public String getBankCodeTran() {
    return bankCodeTran;
  }

  public void setBankCodeTran(String bankCodeTran) {
    this.bankCodeTran = bankCodeTran;
  }

  public String getBankRspCode() {
    return bankRspCode;
  }

  public void setBankRspCode(String bankRspCode) {
    this.bankRspCode = bankRspCode;
  }

  public String getBankRspMessage() {
    return bankRspMessage;
  }

  public void setBankRspMessage(String bankRspMessage) {
    this.bankRspMessage = bankRspMessage;
  }

  public String getFintechUseNum() {
    return fintechUseNum;
  }

  public void setFintechUseNum(String fintechUseNum) {
    this.fintechUseNum = fintechUseNum;
  }

  public String getBalanceAmt() {
    return balanceAmt;
  }

  public void setBalanceAmt(String balanceAmt) {
    this.balanceAmt = balanceAmt;
  }

  public String getAvailableAmt() {
    return availableAmt;
  }

  public void setAvailableAmt(String availableAmt) {
    this.availableAmt = availableAmt;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }
}
