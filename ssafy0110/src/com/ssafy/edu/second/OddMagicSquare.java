package com.ssafy.edu.second;

import java.util.Scanner;

/**
 * <pre>
 * 마방진을 완성한다. 
 * 마방진이란 각 행의 합, 각 열의 합, 대각선의 합, 역대각선의 합이 같다.
 * 정사각 마방진은 삼마방, 사마방, 육마방으로 구성된다.
 * 
 * 삼마방 an=1+2n
 * 사마방 an=4n
 * 육마방은 an=4n+2
 * </pre>
 * @author student
 *@since 2019.1.9
 *@version 0.1
 */

public class OddMagicSquare extends MagicSquare {
	/**
	 * 마방진의 핵심 데이터 - 이차원 배열
	 */
	
	/**
	 * 마방진의 크기 n X n
	 */

	
	/**
	 * 만들어진 마방진을 얕은 복사
	 * @return 완성된 2차원 마방진
	 */

	/**
	 * 마방진의 기본 생성자 - <code>OddMagicSquare(int n)</code>을 이용하여
	 * 홀수마방진의 대표인 3마방을 만든다.
	 */
	public OddMagicSquare() {
		this(3);
	}
	/**
	 * 마방진의 크기를 입력받는 생성자
	 * @param n <code>int</code> 마방진의 크기
	 */
	public OddMagicSquare(int n) {
		super(n);
	}
	

	
/**
 * 마방진을 완성한다.
 */
	@Override
	public void make() {
		int x=0;
		int y=n/2;
		for (int i=1; i <=n*n; i++) {
			this.magic[x][y]=i;
			int tempX=x;
			int tempY=y;
			if(x-1<0) {
				x = n-1;
			}
			else {
				x--;
			}
			if(y-1<0) {
				y=n-1;
			}
			else {
				y--;
			}
			
			if(magic[x][y]!=0) {
				x = tempX+1;
				y = tempY;
			}
		}
	}
	

}