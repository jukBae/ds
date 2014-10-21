#include<iostream>
#include"jukStructure.h"

using std::cout;
using std::endl;

arrStack::arrStack() {
	topNum = 0;
}

bool arrStack::push(jukData mNode) {
	if ( topNum < MAX_SIZE ) {
		node[topNum] = mNode;
		topNum++;
		return TRUE;
	}

	else {
		cout << "Stack overflow!(current topNum = " << topNum <<")" << endl;
		return FALSE;
	}
}

jukData arrStack::pop() {
	jukData ret;

	if ( topNum > 0 ) {
		ret.data = node[topNum-1].data;
		node[topNum-1].data = 0;
		topNum--;

		return ret;
	}

	else {
		cout << "Stack underflow!(current topNum = " << topNum <<")" << endl;
		ret.data = -1;
		return ret;
	}
}

jukData arrStack::peek() {
	if ( topNum > 0 ) {
		return node[topNum-1];
	}
	else {
		cout << "Stack is empty!(current topNum = " << topNum <<")" << endl;
		jukData ret;
		ret.data = -1;
		return ret;
	}
}

void arrStack::show() {
	for ( int i = 0; i < MAX_SIZE; i++ )
		cout << "data[" << i << "]=" << node[i].data << endl;
}

arrQueue::arrQueue() {
	cnt = rear = front = 0;
}

bool arrQueue::enqueue(jukData mNode) {
	if ( cnt < MAX_SIZE ) {
		node[rear] = mNode;
		rear = (rear+1)%MAX_SIZE;
		cnt++;
		return TRUE;
	}
	else {
		cout << "Queue is full!" << endl;
		return FALSE;
	}
}

jukData arrQueue::dequeue() {
	jukData ret;
	if ( cnt > 0 ) {
		ret = node[front];
		node[front].data = 0;
		front = (front+1)%MAX_SIZE;
		cnt--;
		return ret;
	}
	else {
		cout << "Queue is empty!" << endl;
		ret.data = -1;
		return ret;
	}
}

jukData arrQueue::peek() {
	if ( cnt > 0 ) {
		return node[front];
	}
	else {
		cout << "Queue is empty!" << endl;
		jukData ret;
		ret.data = -1;
		return ret;
	}
}

void arrQueue::show() {
	if ( cnt == 0 ) {
		cout << "Queue is empty!" << endl;
		return;
	}

	int i = front;

	do {
		cout << "node [" << i << "] = " << node[i].data << endl;
		i = (i+1)%MAX_SIZE;
	}
	while ( i != rear );
}

int main() {
	arrQueue testQ;
	jukData mNode;

	for ( int i = 0; i < MAX_SIZE; i++ ) {
		mNode.data = i+1;
		testQ.enqueue(mNode);
	}

	testQ.dequeue();
	mNode.data = 11;
	testQ.enqueue(mNode);

	testQ.dequeue();
	mNode.data = 12;
	testQ.enqueue(mNode);

	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();
	testQ.dequeue();

	for ( int i = 0; i < MAX_SIZE; i++ ) {
		mNode.data = i+1;
		testQ.enqueue(mNode);
	}

	testQ.dequeue();
	mNode.data = 11;
	testQ.enqueue(mNode);

	testQ.show();

	mNode = testQ.peek();
	cout << mNode.data  << endl;

	return 0;
}
