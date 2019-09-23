package kamrul;

import java.util.List;
import java.util.ArrayList;

import kamrul.file.FileReader;
import kamrul.transaction.Transaction;
import kamrul.transaction.TransactionProcessor;
import kamrul.account.Balance;



public class KamrulPlainJavaApplication {

    public static void main(String[] args) {
        //input processing
        ICsvReader csvReader = new FileReader("./input.csv");
        List<String> result = csvReader.getDataFromCsv();
        List<Transaction> transactions = new ArrayList<Transaction>();
        result.forEach((strData) -> transactions.add((new Transaction()).fromStringCsv(strData)));
        

        //process
        TransactionProcessor processor = new TransactionProcessor(transactions);

        Balance balance = processor.calculateRelativeAccountBalance(
            "X",
            "",
            ""
        );

        System.out.println("Relative balance for the period is: " + balance.getAmount());
        System.out.println("Number of transactions included is: " + balance.getNumberOfTransactions());
        System.out.println("length: " + result.size());
    }
}


