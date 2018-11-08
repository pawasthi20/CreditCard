/**
 * 
 * @author Parth Awasthi
 *
 */
public class CreditCardMain 
{
	public static void main(String[] args) 
	{
		//Declaring Cards
		CreditCard[] cards = new CreditCard[5];
		cards[0] = new CreditCard(1000, 5000.00, 0.20, "Jim Reagan"); 
		cards[1] = new CreditCard(2000, 10000.00, 0.14, "Joe Bush"); 
		cards[2] = new CreditCard(3000, 1000.00, 0.15, "John Clinton"); 
		cards[3] = new CreditCard(4000, 2000.00, 0.14, "Jack Obama"); 
		cards[4] = new CreditCard(5000, 10000.00, 0.10, "James Trump"); 
		
		//Choose account number 3000 and use a for each loop to find the appropriate account and charge $300 to that card
		for(CreditCard card: cards) 
		{ 
		    if(card.getCardNum() == 3000) 
		    {
		        card.charge(300.00);
		        break;
		    }
		}
		//Choose account number 5000 and use a for each loop to find the appropriate account and charge $600 to that card
		for(CreditCard card: cards) 
		{ 
		    if(card.getCardNum() == 5000) 
		    {
		        card.charge(600.00);
		        break;
		    }
		}
		//Use a for each loop to credit the first card you charged $50
		for(CreditCard card: cards) 
		{ 
		    if(card.getCardNum() == 3000) 
		    {
		        card.credit(50.00);
		        break;
		    }
		}
		//Use a for each loop to print the toString method for all five cards
		for(CreditCard card: cards) 
		{ 
		    System.out.println(card.toString());
		}
	}
}