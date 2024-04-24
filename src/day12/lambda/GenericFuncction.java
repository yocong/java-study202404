package day12.lambda;

@FunctionalInterface
public interface GenericFuncction<X,Y> {

    // X를 주면 Y를 추출해줄게
    Y apply(X x);
}
