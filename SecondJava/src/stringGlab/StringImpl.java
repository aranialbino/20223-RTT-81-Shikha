package stringGlab;

public class StringImpl implements StringI {

	@Override
	public int getlength(String inputStr) {
		return inputStr.length();
	}

	@Override
	public String toUpperCase(String inputStr) {
		// TODO Auto-generated method stub
		return inputStr.toUpperCase();
	}

	@Override
	public String toConcat(String inputStr0, String inputStr1) {
		// TODO Auto-generated method stub
		return inputStr0.concat(inputStr1);
	}

	@Override
	public String toConcatByName(String inputStr1, String inputStr2, String inputStr3) {
		// TODO Auto-generated method stub
		return inputStr1 + inputStr2 + inputStr3;
	}

	@Override
	public String getBigger(String inputStr2, String inputStr3, String inputStr4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalLength(String inputStr2, String inputStr3, String inputStr4) {
		// TODO Auto-generated method stub
		return 0;
	}

}
