package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;

// map: 리스트에서 원하는 데이터만 추출
// original     : [ {}, {}, {}, {}, {} ]
// filter       : [ {}, {}, {} ] - 내용은 같지만 갯수는 달라질 수 있음
// map          : [ "", "", "", "", "" ] - original과 갯수는 같지만 map에 의해 내용은 바뀔 수 있음
public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println(nameList);

        System.out.println("==========================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        // [6, 6, 7, 5, 7]
        List<Integer> collect = words
                .stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) // charAt(index): 문자열에서 해당위치 글자 추출
                .collect(Collectors.toList());
        System.out.println(characterList);

        System.out.println("======================");

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출해서
        // 새로운 객체에 포장 싶음
        List<SimpleDish> simpleDishList = menuList
                .stream()
//                .map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new) // 메서드 참조로 변경 가능
                .collect(Collectors.toList());

//        simpleDishList.forEach(sd -> System.out.println(sd));
        simpleDishList.forEach(System.out::println); // 메서드 참조로 변경 가능
        System.out.println("================================");
        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
                     FISH는 어류라고 저장
                     OTHER는 기타라고 저장
         */

        List<DishDetail> dishDetailList = menuList
                .stream()
                .filter(d -> d.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .collect(Collectors.toList());
        System.out.println("dishDetailList = " + dishDetailList);

        System.out.println("================================");
        // 메뉴 목록에 있는 요리들의 총 칼로리 수 구하기
        int sum = menuList
                .stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sum = " + sum);

        System.out.println("================================");
        // 육류 메뉴의 평균 칼로리
        double avgMeatCalories = menuList
                .stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.println("avgMeatCalories = " + avgMeatCalories);
    }
}
