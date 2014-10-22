#include <iostream>
#include <cstdlib>
#include "jukStructure.h"

using std::cout;
using std::endl;
template <typename Type>
ArrStack<Type>::ArrStack() {
  topNum = 0;
}

template <typename Type>
bool ArrStack<Type>::push(Type mNode) {
  if ( topNum < MAX_SIZE ) {
  	node[topNum] = mNode;
  	topNum++;
  	return true;
  }

  else {
  	cout << "Stack overflow" << endl;
  	exit(1);
  }
}

template <typename Type>
Type ArrStack<Type>::pop() {
  Type ret;

  if ( topNum > 0 ) {
  	ret = node[topNum-1];
  	node[topNum-1]= 0;
  	topNum--;

  	return ret;
  }

  else {
//  	cout << "Stack underflow!(current topNum = " << topNum <<")" << endl;
  	return false;
  }
}

template <typename Type>
Type ArrStack<Type>::peek() {
  if ( topNum > 0 ) {
  	return node[topNum-1];
  }
  else {
  	return false;
  }
}

template <typename Type>
void ArrStack<Type>::show() {
  for ( int i = 0; i < MAX_SIZE; i++ )
  	cout << "data[" << i << "]=" << node[i] << endl;
}

template <typename Type>
ArrQueue<Type>::ArrQueue() {
  cnt = rear = front = 0;
}

template <typename Type>
bool ArrQueue<Type>::enqueue(Type mNode) {
  if ( cnt < MAX_SIZE ) {
  	node[rear] = mNode;
  	rear = (rear+1)%MAX_SIZE;
  	cnt++;
  	return true;
  }
  else {
//  	cout << "Queue is full!" << endl;
  	return false;
  }
}

template <typename Type>
Type ArrQueue<Type>::dequeue() {
  Type ret;

  if ( cnt > 0 ) {
  	ret = node[front];
  	node[front] = 0;
  	front = (front+1)%MAX_SIZE;
  	cnt--;
  	return ret;
  }
  else {
//  cout << "Queue is empty!" << endl;
  	return false;
  }
}

template <typename Type>
Type ArrQueue<Type>::peek() {
  if ( cnt > 0 ) {
  	return node[front];
  }
  else {
//  	cout << "Queue is empty!" << endl;
  	return false;
  }
}

template <typename Type>
void ArrQueue<Type>::show() {
  if ( cnt == 0 ) {
  	cout << "Queue is empty!" << endl;
  	return;
  }

  int i = front;

  do {
  	cout << "node [" << i << "] = " << node[i] << endl;
  	i = (i+1)%MAX_SIZE;
  }
  while ( i != rear );
}

int main() {
  ArrStack<int> testS;

  for ( int i = 0; i < MAX_SIZE+1; i++ ) {
  	testS.push(i);
  }

  cout << testS.peek() << endl;

  testS.show();

  return 0;
}
