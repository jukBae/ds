#include<iostream>
#ifndef _JUK_COMMON_
#define _JUK_COMMON_

#define MAX_SIZE 10
#define TRUE 1
#define FALSE 0

#endif
struct jukData {
	int data;
};

class arrStack {
private:
	unsigned int topNum;
	const static int maxNum = MAX_SIZE;
	jukData node[MAX_SIZE];

public:
	arrStack();
	bool push(jukData mNode);
	jukData pop();
	jukData peek();
	void show();
};

class arrQueue {
private:
	unsigned int front;
	unsigned int rear;
	unsigned int cnt;
	const static int maxNum = MAX_SIZE;
	jukData node[MAX_SIZE];

public:
	arrQueue();
	bool enqueue(jukData mNode);
	jukData dequeue();
	jukData peek();
	void show();
};
