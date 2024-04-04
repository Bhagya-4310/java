package AccountCreation.creditcardusage;

public class Process{
    public Purchase purchasebill(Carddetails carddetails){
         carddetails.amount=4000;
         carddetails.cardLimit=5000;
         Purchase purchase=new Purchase();
         purchase.airPods=2000;
         purchase.clothes=1000;
         purchase.shoes=3000;
         purchase.cardlimit=carddetails.cardLimit;
         int totalPrice=purchase.airPods+purchase.clothes+purchase.shoes;

        if(totalPrice <= carddetails.cardLimit){
            int remainingBalance=carddetails.amount-totalPrice;
            System.out.println("balanceAmount:"+remainingBalance);
            System.out.println("cardlimit:"+carddetails.cardLimit);
        }else{
            System.out.println("cardlimit:"+carddetails.cardLimit);
            System.out.println("limit exceded");
        }
            System.out.println("totalPurchasePrice:"+totalPrice);
        return purchase;

    }
}
