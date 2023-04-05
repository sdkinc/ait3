public class Main {
    public static void main(String[] args) {
        //Задача 2. Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        // Найти среднюю температуру за прошлую неделю.

        double[] tempArray = new double[]{7.0,7.0,9.0,9.0,10.0,12.0,13.0};
        double tempAverage = 0.0;
        double tempSum = 0.0;
        int i=0;
        while (i<tempArray.length){
            tempSum += tempArray[i];
            i++;
        }
        tempAverage = tempSum/tempArray.length;
        System.out.println("Average temp for last week are "+tempAverage);

        double[] stocksArray = new double[31];
        int i1=0;
        while (i1 < stocksArray.length){
            stocksArray[i1]=Math.random();
            i1++;
        }
        double sum1dec = 0.0;
        double sum2dec = 0.0;
        for (i1=0;i1<10;i1++){
            sum1dec+=stocksArray[i1];
        }
        for (i1=20;i1<30;i1++){
            sum2dec+=stocksArray[i1];
        }
        System.out.println(sum2dec);
        System.out.println(sum1dec);
        double average1dec = sum1dec/10;
        double average2dec = sum2dec/10;
        if(average1dec>average2dec){
            System.out.println("Trand is to the Moon");

        }
        else if(average1dec<average2dec){
            System.out.println("Trand is to the down");
        }
        else {
            System.out.println("Trand is dead------------");
        }

        //Задача 4 ().* Создать массив, в котором храняться даты и температуры. Вывести на печать
        // таблицу с данными по температуре по дням и среднюю температуру за период наблюдения.

        String[][] dArr = {{"01.04","02.04","03.04","04.04","05.04","06.04","07.04","08.04","09.04","10.04"},
                {"3.2\t","9.7\t","8.4\t","11.0","14.2","19.2","15.2","11.2","7.2\t","1.2"}};
        for (int x=0;x<2;x++){
            for(int y=0;y<10;y++){
                System.out.print(""+dArr[x][y]+"\t");
            }
            System.out.println("");
        }
    }
}