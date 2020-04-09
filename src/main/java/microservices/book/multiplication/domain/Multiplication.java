package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    // 인수
    private final int factorA;
    private final int factorB;

//    private int result;

    Multiplication() {
        this(0, 0);
    }
}
