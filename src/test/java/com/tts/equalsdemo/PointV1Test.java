package com.tts.equalsdemo;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PointV1Test {

    @Test
    public void checkEqualsOperator() {
        PointV1 p1 = new PointV1(3, 5);
        PointV1 p2 = new PointV1(3, 5);
        PointV1 p3 = p1;
        assertFalse(p1 == p2);
        assertNotSame(p1, p2);
        assertTrue(p1 == p3);
    }

    @Test
    public void checkSizeOfSet() {
        PointV1 p1 = new PointV1(3, 5);
        PointV1 p2 = new PointV1(3, 5);
        Set<PointV1> points = new HashSet<>();
        points.add(p1);
        points.add(p2);
        assertTrue(points.size() == 1);
    }
}