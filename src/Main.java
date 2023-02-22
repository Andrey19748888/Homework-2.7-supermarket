public class Main {
    public static void main(String[] args) {
        Supermarket market = new Supermarket();
        market.addToQueue1("Ben","Paul","Dan");
        market.addToQueue2("Ben","Paul","Dan","Mila");

        showQueues(market);

        market.add("Ben");

        showQueues(market);

        market.add("Коля");

        showQueues(market);

        market.add("Александр");

        showQueues(market);
        market.add("Алекс");

        showQueues(market);

        market.removePerson();
        showQueues(market);
        market.removePerson();
        showQueues(market);
        market.removePerson();
        showQueues(market);
        market.removePerson();
        showQueues(market);




    }

    public static void showQueues(Supermarket market) {
        System.out.println(market.getQueue1());
        System.out.println(market.getQueue2());
        System.out.println();
    }

}