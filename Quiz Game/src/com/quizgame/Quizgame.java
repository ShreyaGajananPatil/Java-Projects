package com.quizgame;

import java.util.Scanner;

public class Quizgame {
public static void main(String[] args) {
	String [][]quiz= {
			{"who is first Pilot", "Raymonde de Laroche"},
			{"Who developed java", "James Gosling"},
			{"Largest river of the world", "Nile"},
			{" Capital of India","New Delhi"},
			{"Center of our Solar System" ,"sun"},
			{"which is the first computer in the world", "ENIAC"},
			{"Which is first ever moving film in the world", "Roundhay Garden Scene"}
};
	int score =0;
	Scanner input=new Scanner(System.in);
	for(int i=0;i<quiz.length;i++) {
		System.out.println(quiz[i][0]);
		String Answer=input.nextLine();
		if(Answer.equalsIgnoreCase(quiz[i][1])) {
			System.out.println("Correct");
			score++;
		
		}
		else {
			System.out.println("Sorry Your answer is Incorrect");
			System.out.println("The correct answer is " +quiz[i][1]);
		}
	}
	System.out.println("Now yourscoe is "+score+ " out of "+quiz.length);
}
}
