package iptstring;

public class CharacterCount {
//TO FIND CHARACTER COUNT OF GIVEN STRING
	public static void main(String[] args) {
		String s = "Smart@Skills #Technoligies123";
		int upper=0, lower=0, spl=0,num=0;
		String upperch="", lowerch="", splch="", number="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upper++;
				upperch=upperch+ch;
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
				lowerch=lowerch+ch;
			}
			else if (Character.isDigit(ch)) {
				num++;
				number=number+ch;
			}else {
				spl++;
				splch=splch+ch;
			}
			
			}
		System.out.println("UPPERCASE ="+upperch+"--- Count = "+upper);
		System.out.println("lowERCASE ="+lowerch+"--- Count = "+lower);
		System.out.println("number ="+number+"--- Count = "+num);
		System.out.println("splcharacter ="+splch+"--- Count = "+spl);
		}
	}

