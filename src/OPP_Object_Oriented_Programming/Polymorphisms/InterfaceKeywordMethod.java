package OPP_Object_Oriented_Programming.Polymorphisms;


interface Services{
//    default void  test(){};
    void convertRielToDollar(Double riel);
    void convertDollarToRiel(Double dollar);
}


class CurrencyExchange implements Services{
    @Override
    public void convertRielToDollar(Double riel) {
        System.out.println("Result of dollar: " + (riel/4000));
    }
    @Override
    public void convertDollarToRiel(Double dollar) {
        System.out.println("Result in riel: " + (dollar*4000));
    }
}


public class InterfaceKeywordMethod {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.convertDollarToRiel(3d);
        currencyExchange.convertRielToDollar(4000d);
    }
}
