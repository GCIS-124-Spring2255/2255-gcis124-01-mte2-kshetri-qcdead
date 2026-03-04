// Question: Q3 (mte2, gcis124, 2255)
// Package name: cards
// File name: Suit.java

package mte2.cards;

// An enumeration of the suits in a standard deck of playing cards.

public enum Suit {
    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADES(4);

    private final int suiteNumber;

    private Suit(int suiteNumber) {    this.suiteNumber = suiteNumber;    }

    public int getSuitNumber() {    return this.suiteNumber;    }

}
