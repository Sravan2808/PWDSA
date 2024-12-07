import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static double getMaxValue(ItemValue[] arr,int capacity){
//         1.Sorting item by profit/weight ratio
        Arrays.sort(arr,new Comparator<ItemValue>(){
            @Override
            public int compare(ItemValue item1,ItemValue item2){
                double cpr1=Double.valueOf(item1.profit/item1.weight);
                double cpr2=Double.valueOf(item2.profit/item2.weight);

                if(cpr1<cpr2)
                    return 1;
                else return -1;
            }
            
        });
        double totalValue=0;
        for(ItemValue i:arr){
            int curWt=(int)i.weight;
            int curProfit=(int)i.profit;

            if(capacity-curWt>=0){
//                This weight can be picked whole
                capacity=capacity-curWt;
                totalValue+=curProfit;
            }
            else{
//                item cant be picked whole
                double fraction=((double)capacity/(double)curWt);
                totalValue+=(curProfit*fraction);
                capacity=(int)(capacity-(curWt*fraction));
                break;

            }
        }
        return totalValue;
    }
    static class ItemValue {
        int profit,weight;
        public ItemValue(int profit, int wt) {
            this.profit = profit;
            this.weight = wt;

        }
    }

    public static void main(String[] args) {
        ItemValue[] arr={ new ItemValue(60,10),
                new ItemValue(100,20),
                new ItemValue(120,30),
//                new ItemValue(100,12),
//                new ItemValue(75,10),
//                new ItemValue(45,7),
//                new ItemValue(25,5)
        };
        int capacity=50;
//        function calling
        double maxValue=getMaxValue(arr,capacity);
//        function call
        System.out.println("Maximum profit is : "+maxValue);

    }
}
