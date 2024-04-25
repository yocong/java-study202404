package day12.stream.quiz1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> answer1 = transactions
                .stream()
                .filter(year -> year.getYear() == 2021)
                .sorted(Comparator.comparing(v -> v.getValue()))
                .collect(toList());
        System.out.println("answer1 = " + answer1);
        System.out.println("===================================");

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        Set<String> answer2 = transactions
                .stream()
                .map(trs -> trs.getTrader().getCity())
//                .distinct()
                .collect(Collectors.toSet());
        System.out.println("answer2 = " + answer2);
        System.out.println("===================================");

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        List<Trader> answer3 = transactions
                .stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .map(trs -> trs.getTrader())
                .sorted(Comparator.comparing(trader -> trader.getName()))
                .collect(toList());

        answer3.forEach(System.out::println);
        System.out.println("===================================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환
        // List<String>
        List<String> answer4 = new ArrayList<>();

        List<Trader> ans4 = transactions
                .stream()
                .map(trs -> trs.getTrader())
                .distinct()
                .sorted(Comparator.comparing(trs -> trs.getName()))
                .collect(toList());

        for (Trader trader : ans4) {
            answer4.add(trader.getName());
        }
        System.out.println("answer4 = " + answer4);
        System.out.println("===================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean answer5 = transactions
                .stream()
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));

        System.out.println("answer5 = " + answer5);
        System.out.println("===================================");

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int answer6 = transactions
                .stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .mapToInt(trs -> trs.getValue())
                .sum();
        System.out.println("answer6 = " + answer6);
        System.out.println("===================================");

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int answer7 = transactions
                .stream()
                .mapToInt(trs -> trs.getValue())
                .max()
                .getAsInt();
        System.out.println("answer7 = " + answer7);
        System.out.println("===================================");

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

        /*
            자바의 단점: null 체크 문법이 없음
        */
        Transaction answer8 = transactions
                .stream()
                .min(Comparator.comparing(trs -> trs.getValue()))
                .orElse(null); // 만약 결과가 null인 경우 어떻게 할건지

        System.out.println("answer8 = " + answer8);
        System.out.println("===================================");

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        List<Transaction> answer9 = transactions
                .stream()
                .filter(trs -> trs.getValue() >= 500)
                .collect(toList());

        System.out.println("answer9 = " + answer9);
        System.out.println("===================================");

        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        int minValue = transactions
                .stream()
                .mapToInt(trs -> trs.getValue())
                .min()
                .getAsInt();

        double answer10 = transactions
                .stream()
                .filter(trs -> trs.getValue() > minValue)
                .mapToInt(trs -> trs.getValue())
                .average()
                .getAsDouble();
        System.out.println("answer10 = " + answer10);
        System.out.println("===================================");

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */

        /*
        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(toList());

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);


        for (Integer year : groupByYearMap.keySet()) {
            System.out.println("year = " + year);
            for (Transaction transaction : groupByYearMap.get(year)) {
                System.out.println(transaction);
            }
        }
        */

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                // groupingBy하면 map이 생성, year을 넣었으니 key가 year가 됨
                .collect(Collectors.groupingBy(trs -> trs.getYear()));

        System.out.println("======================");
        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });

        System.out.println("===================================");

        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        int max = transactions
                .stream()
                .mapToInt(trs -> trs.getValue())
                .max()
                .getAsInt();

        int min = transactions
                .stream()
                .mapToInt(trs -> trs.getValue())
                .min()
                .getAsInt();

        int answer12 = max - min;
        System.out.println("answer12 = " + answer12);
    }
}
