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

class Backup
{

  private int noOfCards = 13;
  private int noOfSets = 4;

  private Card card;
  private ArrayList<String> allCards = new ArrayList();

  public Deck()
  {
      card = new Card();
      copyDeck();
  }

  public void deal_hand( int sets, int cards )
  {
      card.set_value(cards, sets);
      card.print();
  }

  public void print_deck()
  {
      for(int i = 0; i<allCards.size(); i++){
          System.out.print(allCards.get(i));
          if((i+1)%13 == 0) System.out.println();
      }
  }

  public void shuffle( int seed )
  {

      Random r = new Random(seed);
      Collections.shuffle(allCards, r);
      // System.out.println(allCards);
  }

  public void sort()
  {
      for(int i = 0; i<allCards.size(); i++){
         System.out.println(allCards.get(0));
         if(card.is_less_than(allCards.get(i))){
            System.out.println("lesser");
         }else if(card.is_greater_than(allCards.get(i))){
            System.out.println("greater");
         }else{
            System.out.println("none");
         }
      }
  }

  public void copyDeck()
  {

    System.out.println("\n=== Deck ==============================");
    for(int i = 0; i<noOfSets; i++){
      for(int j = 1; j<=noOfCards; j++){
        card.set_value(j, i);
        card.print();
        allCards.add(card.get_deck_value());
      }
      System.out.println();
    }

  }

}
