package kamrul.account;

public class Balance {
    private Integer numberOfTransactions;
    private Float amount;

    public Balance(Integer numberOfTransactions, Float amount) {
        this.numberOfTransactions = numberOfTransactions;
        this.amount = amount;
    }

    public Float getAmount() {
        return this.amount;
    }

    public Integer getNumberOfTransactions() {
        return this.numberOfTransactions;
    }
}