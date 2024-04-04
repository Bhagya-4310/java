package AccountCreation.card;

import java.util.Date;

public class CardService{
    public CardDetails card(Cardholderinputs cardholderinputs){
        CardDetails cardDetails=new CardDetails();
        cardDetails.cardNumber="12345678";
        cardDetails.cvv="234";
        cardDetails.expiryDate=new Date();
        BankDetails bankDetails=new BankDetails();
        bankDetails.AccountNo=cardholderinputs.AccountNo;
        bankDetails.ifscCode=cardholderinputs.ifscCode;
        return cardDetails;
    }
}
