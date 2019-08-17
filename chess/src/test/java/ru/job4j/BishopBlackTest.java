package ru.job4j;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack foo = new BishopBlack(Cell.A1);
        assertThat(foo.position(), is(Cell.A1));
    }

    @Test
    public void copyTest() {
        BishopBlack foo = new BishopBlack(Cell.A1);
        assertThat(foo.copy(Cell.A5).position(), is(Cell.A5));
    }

    @Test
    public void wayTest() {
        BishopBlack foo = new BishopBlack(E3);
        assertThat(foo.way(Cell.E3, A7), is(new Cell[]{D4, C5, B6, A7}));
    }

    @Test
    public void diagonalTrueTest() {
        BishopBlack foo = new BishopBlack(A1);
        assertThat(foo.isDiagonal(E3, A7), is(true));
    }

    @Test
    public void diagonalFalseTest() {
        BishopBlack foo = new BishopBlack(A1);
        assertThat(foo.isDiagonal(E4, A7), is(false));
    }
}
