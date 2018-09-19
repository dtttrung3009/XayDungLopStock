package XayDungLopStock;

public class stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public stock(double previousClosingPrice, double currentPrice) {
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    //
//    public void setSymbol(String symbol) {
//        this.symbol = symbol;
//    }

        public String getName () {
            return name;
        }

//    public void setName(String name) {
//        this.name = name;
//    }

        public double getChangePercent ( double currentPrice, double previousClosingPrice){
            return (double) (Math.abs(currentPrice - previousClosingPrice)) / currentPrice * 100;
        }
    }
