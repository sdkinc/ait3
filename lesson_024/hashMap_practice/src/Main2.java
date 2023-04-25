import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("HashMap\tsentence");

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        sentence = sentence.toLowerCase();
        HashMap<String, Integer> letters = new HashMap<>();
        String[] myArr = sentence.split("");
        for (int i = 0; i < myArr.length; i++) {
            if (letters.containsKey(myArr[i])) {
                letters.put(myArr[i], letters.get(myArr[i]) + 1);
            } else {
                letters.put(myArr[i], 1);
            }
        }
        HashSet<String> lettersToRemove = new HashSet<>();
        for (String key : letters.keySet()) {
            if (!key.matches("[a-zA-Zа-яА-Я]+")) {
                lettersToRemove.add(key);
            }
        }
        for (String key : lettersToRemove) {
            letters.remove(key);
        }
        for (String key : letters.keySet()) {
            System.out.println("Letter " + key + " is in sentence " + letters.get(key) + " numbers");
        }
        System.out.println(letters.size());
    }
}