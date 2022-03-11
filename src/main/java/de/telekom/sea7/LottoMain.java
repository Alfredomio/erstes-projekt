package de.telekom.sea7;

public class LottoMain {
    public static void main(String[] args) {
        
    	
    	LottoOli lotto = new LottoOli();
        
        
        lotto.setLottozahlen(7);
        lotto.setLottozahlen(9);
        lotto.setLottozahlen(11);
        lotto.setLottozahlen(23);
        lotto.setLottozahlen(25);
        lotto.setLottozahlen(32);
        lotto.setLottozahlen(2);

        lotto.ausgabeLottoschein();
        lotto.pruefungZahlen();
    }

}
