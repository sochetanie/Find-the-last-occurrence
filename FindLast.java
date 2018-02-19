package Lab1_3;

import java.io.*;
import java.util.*;

public class FindLast {
	public static void main(String[] args) {
		String numbers;
		List<Integer>list = new ArrayList<>();

		try {
			FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/src/Lab1_3/numbers.text");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((numbers = bufferedReader.readLine()) != null){
			  if(!numbers.equals(""))
				  list.add(Integer.parseInt(numbers));
			}

			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a number: ");
			while (keyboard.hasNextLine()){
        String s = keyboard.nextLine();
        if(s.equals("")) break;

				int num = Integer.parseInt(s);
				int last = -1;
				for(int i = 0; i<list.size(); i++){
					if(list.get(i) == num){
						last = i+1;
					}
				}
				System.out.println((last==-1)? num+" does not appear in the file" : num + " last appears in the file at position "+last);
				System.out.print("Enter a number: ");
			}
		} catch ( IOException e1) {
			e1.printStackTrace();
		}
	}
	}
