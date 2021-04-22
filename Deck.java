/**
 * Deck.java
 *
 * @brief A class that represents a deck of playing cards
 *
 * @details
 * This class is responsible for shuffling and dealing a deck of cards. The deck should
 * contain 52 cards A,2 - 10, J,Q K or four suits, but no jokers.
 */
import java.util.*;

class Deck
{
  private Card c;
  private ArrayList<Card> cardsArray;

  public Deck()
  {
      c = new Card();
      cardsArray = new ArrayList();
      print_complete_deck();
  }

  public void deal_hand( int sets, int cards )
  {
      cardsArray.get(sets * cards).print();
  }

  public void print_deck()
  {
      for(Card card : cardsArray){
          card.print();
      }
  }

  public void shuffle( int seed )
  {
      Random r = new Random(seed);
      Collections.shuffle(cardsArray, r);
  }

  public void sort()
  {
    Collections.sort(cardsArray, new Comparator<Card>() {
        @Override
        public int compare(Card lhs, Card rhs) {
            return rhs.is_less_than(lhs) ? 1 : rhs.is_greater_than(lhs) ? -1 : 0;
        }
    });
  }

  private void print_complete_deck(){
    int i = 0;
    for(Card.Suit suit : Card.Suit.values()){
      for(Card.Value value : Card.Value.values()){
        c.set_value(value, suit);
        if(!c.get_deck_value().equals("[JKR]")){
          c.print();
          cardsArray.add(new Card(suit, value));
          i++;
        }
      }

      System.out.println();
    }
  }
}
