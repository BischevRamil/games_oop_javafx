package ru.job4j;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenWayClean() {
        BishopBlack foo = new BishopBlack(A1);
        BishopBlack bar = new BishopBlack(B3);
        Logic baz = new Logic();
        baz.add(foo);
        baz.add(bar);
        Boolean rst = baz.move(foo.position(), C3);
        assertThat(rst, is(true));

    }

    @Test
    public void whenWayNotClean() {
        BishopBlack foo = new BishopBlack(A1);
        BishopBlack bar = new BishopBlack(B2);
        Logic baz = new Logic();
        baz.add(foo);
        baz.add(bar);
        Boolean rst = baz.move(foo.position(), C3);
        assertThat(rst, is(false));

    }
}
