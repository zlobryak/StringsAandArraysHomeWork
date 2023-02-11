import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        double[] sales = new double[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        double amount = service.amountOfSales(sales);
        System.out.println("Сумма " + amount);
        double avgr = service.averageSales(sales);
        System.out.println("Среднее значение " + avgr);
        double maxM = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж " + maxM);
        double minM = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж " + minM);
        double countBelow  = service.getNumMothsBelowAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + countBelow);
        double countAbove = service.getNumMonthsAboveAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + countAbove);
    }
}
