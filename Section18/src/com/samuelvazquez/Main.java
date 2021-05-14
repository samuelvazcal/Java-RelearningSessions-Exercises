package com.samuelvazquez;

public class Main {

    public static void main(String[] args) {
	StringUtitlities utils = new StringUtitlities();
	StringBuilder sb = new StringBuilder();
	while(sb.length() < 10) {
	    utils.addChar(sb,'a');
    }
        System.out.println(sb);

        String str = "abcdefg";
        String result = utils.upperAndPrefix(utils.addSuffix(str));

    }
}
