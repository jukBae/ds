#include <iostream>
/*#ifndef _JUK_COMMON_
#define _JUK_COMMON_

#define MAX_SIZE 10
#define TRUE 1
#define FALSE 0

#endif
*/
// c++ supports true and false so, above code is not necessary.

const int MAX_SIZE = 10;

/*struct Type {
  int data;
};
*/
// It is better to use template

template <typename Type>
class ArrStack {
private:
  unsigned int topNum;
//  const static int maxNum = MAX_SIZE;
// It is not necesary
  Type node[MAX_SIZE];

public:
  ArrStack();
  bool push(Type mNode);
  Type pop();
  Type peek();
  void show();
};

template <typename Type>
class ArrQueue {
private:
  unsigned int front;
  unsigned int rear;
  unsigned int cnt;
//  const static int maxNum = MAX_SIZE;
  Type node[MAX_SIZE];

public:
  ArrQueue();
  bool enqueue(Type mNode);
  Type dequeue();
  Type peek();
  void show();
};
