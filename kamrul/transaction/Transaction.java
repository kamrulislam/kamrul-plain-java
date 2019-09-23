package kamrul.transaction;

import java.text.SimpleDateFormat;
import java.util.Date; 

import kamrul.transaction.TransactionType;

public class Transaction {
    private String transactionId;
    private String fromAccountId;
    private String toAccountId;
    private Date createAt;
    private float amount;
    private TransactionType transactionType;
    private String relatedTransaction;

    private SimpleDateFormat dateFormatter;

    public Transaction() {
        this.dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }


    public Transaction fromStringCsv(String csvData) {
        try {
            String[] strDataArr = csvData.split(",", -2);
            this.transactionId = strDataArr[0];
            this.fromAccountId = strDataArr[1];
            this.toAccountId = strDataArr[2];
            this.createAt = this.dateFormatter.parse(strDataArr[3]);
            this.amount = Float.parseFloat(strDataArr[4]);
            this.transactionType = TransactionType.valueOf(strDataArr[5]);
            if (this.transactionType == TransactionType.REVERSAL) {
                this.relatedTransaction = strDataArr[6];
            }
    
        } catch(Exception e) {

        }
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    // public void setTransactionId(String transactionId) {
    //     this.transactionId = transactionId;
    // }

    public String getFromAccountId() {
        return fromAccountId;
    }

    // public void setFromAccountId(String fromAccountId) {
    //     this.fromAccountId = fromAccountId;
    // }

    public String getToAccountId() {
        return toAccountId;
    }

    // public void setToAccountId(String toAccountId) {
    //     this.toAccountId = toAccountId;
    // }

    public Date getCreateAt() {
        return createAt;
    }

    // public void setCreateAt(Date createAt) {
    //     this.createAt = createAt;
    // }

    public float getAmount() {
        return amount;
    }

    // public void setAmount(float amount) {
    //     this.amount = amount;
    // }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    // public void setTransactionType(TransactionType transactionType) {
    //     this.transactionType = transactionType;
    // }

    public String getRelatedTransaction() {
        return relatedTransaction;
    }

    // public void setRelatedTransaction(String relatedTransaction) {
    //     this.relatedTransaction = relatedTransaction;
    // }

}