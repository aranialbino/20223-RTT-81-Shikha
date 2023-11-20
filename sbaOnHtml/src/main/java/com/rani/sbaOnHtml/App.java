package com.rani.sbaOnHtml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	char c = 'B';
    	
    	for(int i=1;i<24;i++) {
    		generateCode(c++);
    	}

	}
    
    public static void generateCode(char c) {
    	
    	String str = "<tr align=\"center\">\r\n"
    			+ "					<td class='center' style='font: 140px Arial, sans-serif;''>"+c+"</td>\r\n"
    			+ "				<td align=' center'>\r\n"
    			+ "						<img src='../images/"+c+".png'>\r\n"
    			+ "					</td>\r\n"
    			+ "					<td>\r\n"
    			+ "						<textarea id='"+c+"_input_text' rows='1' cols='2' style='font: 140px Arial, sans-serif;' required\r\n"
    			+ "							onchange=\"checkLetterEntry('"+c+"_input_text','"+c+"')\">\r\n"
    			+ "                    </textarea>\r\n"
    			+ "					</td>\r\n"
    			+ "				</tr>";
    	
    	System.out.println("\n"+str);
    	
    }
}
