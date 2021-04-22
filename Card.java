/**
 * Card.java
 *
 * @brief A class that represents a playing card
 *
 * @details
 * This class is responsible for storing, printing and comparing a playing card.
 */

class Card {

  // Suit enumeration
  public enum Suit
  {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS
  }

  // Value enumeration
  public enum Value
  {
    JOKER,
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
  }

  // Constructor
  public Card()
  {

  }

  public Card(Suit suit, Value value)
  {
      m_suit = suit;
      m_value = value;
  }

  // Returns the suit of the card.
	//
	// @return	The suit.
  public Suit get_suit()
  {
    return m_suit;
  }

  // Returns the value of the card.
	//
	// @return	The suit enumeration.
  public Value get_value()
  {
    return m_value;
  }

  // Compares if the card face value of two cards are equal.
  // Does not take suit into consideration.
  //
  // @param[in] rhs   The right hand side card.
  // @return    true if equal.
  public boolean is_equal( Card rhs )
  {
    return m_value.ordinal() == rhs.m_value.ordinal();
  }

  // Compares if the card face value of the left card is less than the right.
  // Does not take suit into consideration.
  //
  // @param[in] rhs   The right hand side card.
  // @return    true if less than.
  public boolean is_less_than( Card rhs )
  {
    return m_value.ordinal() < rhs.m_value.ordinal();
  }

  // Compares if the card face value of the left card is less than or equal the right.
  // Does not take suit into consideration.
  //
  // @param[in] rhs   The right hand side card.
  // @return    true if less than or equal.
  public boolean is_less_than_or_equal( Card rhs )
  {
    return m_value.ordinal() <= rhs.m_value.ordinal();
  }

  // Compares if the card face value of the left card is greater than the right.
  // Does not take suit into consideration.
  //
  // @param[in] rhs   The right hand side card.
  // @return    true if greater than.
  public boolean is_greater_than( Card rhs )
  {
    return m_value.ordinal() > rhs.m_value.ordinal();
  }

  // Compares if the card face value of the left card is greater than or equal the right.
  // Does not take suit into consideration.
  //
  // @param[in] rhs   The right hand side card.
  // @return    true if greater than or equal.
  public boolean is_greater_than_or_equal( Card rhs )
  {
    return m_value.ordinal() >= rhs.m_value.ordinal();
  }

  // Prints a single card to std out.
  public void print()
  {
    System.out.print(card_array[m_suit.ordinal()][m_value.ordinal()]);
  }

  public String get_deck_value(){
      return card_array[m_suit.ordinal()][m_value.ordinal()];
  }

  // Sets the value of the card.
	//
	// @param[in]	value The value of the card.
	// @param[in]	suit  The value of thd card.
  public void set_value(Value value, Suit suit)
  {
    m_value = value;
    m_suit = suit;
  }

  public void set_value(int value, int suit)
  {
    m_value = Value.values()[value];
    m_suit = Suit.values()[suit];
  }


  private static String card_array[][] = {{"[JKR]",
                                    "[ A\u2660]",
                                    "[ 2\u2660]",
                                    "[ 3\u2660]",
                                    "[ 4\u2660]",
                                    "[ 5\u2660]",
                                    "[ 9\u2660]",
                                    "[ 7\u2660]",
                                    "[ 8\u2660]",
                                    "[ 9\u2660]",
                                    "[10\u2660]",
                                    "[ J\u2660]",
                                    "[ Q\u2660]",
                                    "[ K\u2660]"
                                  },{"[JKR]",
                                    "[ A\u2665]",
                                    "[ 2\u2665]",
                                    "[ 3\u2665]",
                                    "[ 4\u2665]",
                                    "[ 5\u2665]",
                                    "[ 6\u2665]",
                                    "[ 7\u2665]",
                                    "[ 8\u2665]",
                                    "[ 9\u2665]",
                                    "[10\u2665]",
                                    "[ J\u2665]",
                                    "[ Q\u2665]",
                                    "[ K\u2665]"
                                  },{"[JKR]",
                                    "[ A\u2666]",
                                    "[ 2\u2666]",
                                    "[ 3\u2666]",
                                    "[ 4\u2666]",
                                    "[ 5\u2666]",
                                    "[ 6\u2666]",
                                    "[ 7\u2666]",
                                    "[ 8\u2666]",
                                    "[ 9\u2666]",
                                    "[10\u2666]",
                                    "[ J\u2666]",
                                    "[ Q\u2666]",
                                    "[ K\u2666]"
                                  },{"[JKR]",
                                    "[ A\u2663]",
                                    "[ 2\u2663]",
                                    "[ 3\u2663]",
                                    "[ 4\u2663]",
                                    "[ 5\u2663]",
                                    "[ 6\u2663]",
                                    "[ 7\u2663]",
                                    "[ 8\u2663]",
                                    "[ 9\u2663]",
                                    "[10\u2665]",
                                    "[ J\u2663]",
                                    "[ Q\u2663]",
                                    "[ K\u2663]"}};

  private Suit m_suit;  // The suit of the card
  private Value m_value;  // The value of the card


}
