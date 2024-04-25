package day12.stream;

import static day12.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList
                .stream()
                .anyMatch(d -> d.isVegeterian());

        System.out.println("flag1 = " + flag1);

        // 메뉴 목록에서 칼로리가 100 이하인 요리가 하나라도 존재하나?
        boolean flag2 = menuList
                .stream()
                .anyMatch(d -> d.getCalories() <= 100);

        System.out.println("flag2 = " + flag2);

        System.out.println("===============================");

        // 메뉴 목록의 모든 요리가 1000칼로리 미만입니까?
        // allMatch: 리스트 안에 모든 객체를 검사해서 모두 일치하는 확인
        // noneMatch: 모두 불일치 하는지 검사
        boolean flag3 = menuList
                .stream()
                .allMatch(d -> d.getCalories() < 1000);

        System.out.println("flag3 = " + flag3);
    }
}
