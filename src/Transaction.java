import java.util.ArrayList;
import java.util.Arrays;

public class Transaction {

	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args){
		String[] genesisTransactions = {"This is Jason account of SimpleBlock", "Jason deposits 10 simcoin"};
		Block genesisBlock= new Block( 0, genesisTransactions);
		System.out.println(genesisBlock.getBlockHash());
		
	      String[] block2Transactions = {"Jin sent 10000 simcoin to Jason", "Jason sent 5 simcoin to StarBucks"};
	        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
	        System.out.println(block2.getTransactions());

	        String[] block3Transactions = {"Jason sent 999 simcoin to Jin"};
	        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

	        System.out.println("Hash of genesis block:");
	        System.out.println(genesisBlock.getBlockHash());

	        System.out.println("Hash of block 2:");
	        System.out.println(block2.getBlockHash());

	        System.out.println("Hash of block 3:");
	        System.out.println(block3.getBlockHash());
	        
	        System.out.println("Transacton of block 3:");
	        
	        System.out.println(Arrays.toString(block3.getTransactions()));
	}

}